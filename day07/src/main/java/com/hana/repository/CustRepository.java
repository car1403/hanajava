package com.hana.repository;

import com.hana.data.CustDto;
import com.hana.exception.DuplicatedIdException;
import com.hana.exception.NotFoundIdException;
import com.hana.frame.ConnectionPool;
import com.hana.frame.Repository;
import com.hana.frame.SQL;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.util.List;

public class CustRepository implements Repository<String, CustDto> {

    ConnectionPool cp;

    public CustRepository(){
        try {
            cp = ConnectionPool.create();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public CustDto insert(CustDto custDto)  throws DuplicatedIdException, Exception{
        // 2. Connection
        Connection con = null;
        con = cp.getConnection();
        // 4. PreparedStatement
        PreparedStatement pstmt = null;
        try{
            pstmt = con.prepareStatement(SQL.insertCust);
            pstmt.setString(1, custDto.getId());
            pstmt.setString(2, custDto.getPwd());
            pstmt.setString(3, custDto.getName());
            pstmt.executeUpdate();
        }catch(SQLIntegrityConstraintViolationException e){
            throw new DuplicatedIdException("ERR0001");
        }catch(SQLException e){
            //e.printStackTrace();
            throw new Exception("EXX0001");
        }finally {
            // 5. Close
            if(pstmt != null){
                try {
                    pstmt.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
            cp.releaseConnection(con);
        }

        return custDto;
    }

    @Override
    public CustDto update(CustDto custDto) throws NotFoundIdException, Exception {
        // 1. Driver Loading
        // 2. Connection
        // 3. SQL
        // 4. PreparedStatement
        // 5. Close
        return null;
    }

    @Override
    public Boolean delete(String s) throws NotFoundIdException, Exception {
        return null;
    }

    @Override
    public List<CustDto> select() throws Exception {
        return null;
    }

    @Override
    public CustDto select(String s) throws NotFoundIdException, Exception {
        return null;
    }
}
