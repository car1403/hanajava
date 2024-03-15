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


    @Override
    public CustDto insert(CustDto custDto, Connection con) throws DuplicatedIdException, Exception {

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

        }

        return custDto;


    }

    @Override
    public CustDto update(CustDto custDto, Connection con) throws NotFoundIdException, Exception {
        return null;
    }

    @Override
    public Boolean delete(String s, Connection con) throws NotFoundIdException, Exception {
        return null;
    }

    @Override
    public List<CustDto> select(Connection con) throws Exception {
        return null;
    }

    @Override
    public CustDto select(String s, Connection con) throws NotFoundIdException, Exception {
        return null;
    }
}
