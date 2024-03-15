package com.hana.frame;

public class SQL {
    // Cust SQL
    public static String insertCust = "INSERT INTO db_cust VALUES (?,?,?)";

    // Item SQL
    public static String insertItem =
            "INSERT INTO db_item VALUES (0,?,?,NOW(),NOW())";
    public static String updateItem =
            "UPDATE db_item SET name=?, price=?, updatedate=NOW() WHERE id=?";
    public static String deleteItem =
            "DELETE FROM db_item WHERE id = ?";
    public static String selectAllItem =
            "SELECT * FROM db_item ORDER BY id";
    public static String selectOneItem =
            "SELECT * FROM db_item WHERE id = ?";
}
