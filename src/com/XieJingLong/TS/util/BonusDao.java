package com.XieJingLong.TS.util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.HashMap;
import java.util.Map;

/**
 * @author 王启越
 * @date 2021/10/13
 */
public class BonusDao extends DBUtil{
    public Map<String, Double> getBonusTypesAmountMap(){
        Map<String,Double> map = new HashMap<>(8);
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try{
            conn = getConnection();
            beginTransaction(conn);
            String sql = "select type,amount from bonus";
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()){
                map.put(rs.getString("type"),rs.getDouble("amount"));
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            close(conn,ps,rs);
        }
        return map;
    }
}
