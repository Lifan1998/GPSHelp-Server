package com.example.study.mapper;

import com.example.study.object.Receiver;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.type.JdbcType;

public interface ReceiverMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table receiver
     *
     * @mbg.generated Mon May 06 09:30:53 CST 2019
     */
    @Delete({
        "delete from receiver",
        "where unit_id = #{unitId,jdbcType=VARCHAR}",
          "and id = #{id,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(@Param("unitId") String unitId, @Param("id") String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table receiver
     *
     * @mbg.generated Mon May 06 09:30:53 CST 2019
     */
    @Insert({
        "insert into receiver (unit_id, id, ",
        "name, gender, phone, ",
        "account_name, account_password, ",
        "status, task_id)",
        "values (#{unitId,jdbcType=VARCHAR}, #{id,jdbcType=VARCHAR}, ",
        "#{name,jdbcType=VARCHAR}, #{gender,jdbcType=VARCHAR}, #{phone,jdbcType=VARCHAR}, ",
        "#{accountName,jdbcType=VARCHAR}, #{accountPassword,jdbcType=VARCHAR}, ",
        "#{status,jdbcType=VARCHAR}, #{taskId,jdbcType=VARCHAR})"
    })
    int insert(Receiver record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table receiver
     *
     * @mbg.generated Mon May 06 09:30:53 CST 2019
     */
    @Select({
        "select",
        "unit_id, id, name, gender, phone, account_name, account_password, status, task_id",
        "from receiver",
        "where unit_id = #{unitId,jdbcType=VARCHAR}",
          "and id = #{id,jdbcType=VARCHAR}"
    })
    @Results({
        @Result(column="unit_id", property="unitId", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="id", property="id", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="gender", property="gender", jdbcType=JdbcType.VARCHAR),
        @Result(column="phone", property="phone", jdbcType=JdbcType.VARCHAR),
        @Result(column="account_name", property="accountName", jdbcType=JdbcType.VARCHAR),
        @Result(column="account_password", property="accountPassword", jdbcType=JdbcType.VARCHAR),
        @Result(column="status", property="status", jdbcType=JdbcType.VARCHAR),
        @Result(column="task_id", property="taskId", jdbcType=JdbcType.VARCHAR)
    })
    Receiver selectByPrimaryKey(@Param("unitId") String unitId, @Param("id") String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table receiver
     *
     * @mbg.generated Mon May 06 09:30:53 CST 2019
     */
    @Select({
        "select",
        "unit_id, id, name, gender, phone, account_name, account_password, status, task_id",
        "from receiver"
    })
    @Results({
        @Result(column="unit_id", property="unitId", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="id", property="id", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="gender", property="gender", jdbcType=JdbcType.VARCHAR),
        @Result(column="phone", property="phone", jdbcType=JdbcType.VARCHAR),
        @Result(column="account_name", property="accountName", jdbcType=JdbcType.VARCHAR),
        @Result(column="account_password", property="accountPassword", jdbcType=JdbcType.VARCHAR),
        @Result(column="status", property="status", jdbcType=JdbcType.VARCHAR),
        @Result(column="task_id", property="taskId", jdbcType=JdbcType.VARCHAR)
    })
    List<Receiver> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table receiver
     *
     * @mbg.generated Mon May 06 09:30:53 CST 2019
     */
    @Update({
        "update receiver",
        "set name = #{name,jdbcType=VARCHAR},",
          "gender = #{gender,jdbcType=VARCHAR},",
          "phone = #{phone,jdbcType=VARCHAR},",
          "account_name = #{accountName,jdbcType=VARCHAR},",
          "account_password = #{accountPassword,jdbcType=VARCHAR},",
          "status = #{status,jdbcType=VARCHAR},",
          "task_id = #{taskId,jdbcType=VARCHAR}",
        "where unit_id = #{unitId,jdbcType=VARCHAR}",
          "and id = #{id,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKey(Receiver record);

    @Select({
            "select",
            "unit_id, id, name, gender, phone, account_name, account_password, status, task_id",
            "from receiver",
            "where account_name = #{accountName,jdbcType=VARCHAR}"
    })
    @Results({
            @Result(column="unit_id", property="unitId", jdbcType=JdbcType.VARCHAR, id=true),
            @Result(column="id", property="id", jdbcType=JdbcType.VARCHAR, id=true),
            @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
            @Result(column="gender", property="gender", jdbcType=JdbcType.VARCHAR),
            @Result(column="phone", property="phone", jdbcType=JdbcType.VARCHAR),
            @Result(column="account_name", property="accountName", jdbcType=JdbcType.VARCHAR),
            @Result(column="account_password", property="accountPassword", jdbcType=JdbcType.VARCHAR),
            @Result(column="status", property="status", jdbcType=JdbcType.VARCHAR),
            @Result(column="task_id", property="taskId", jdbcType=JdbcType.VARCHAR)
    })
    Receiver selectByAccount(@Param("accountName") String accountName);

    @Select({
            "select",
            "unit_id, id, name, gender, phone, account_name, account_password, status, task_id",
            "from receiver",
            "where id = #{id,jdbcType=VARCHAR}"
    })
    @Results({
            @Result(column="unit_id", property="unitId", jdbcType=JdbcType.VARCHAR, id=true),
            @Result(column="id", property="id", jdbcType=JdbcType.VARCHAR, id=true),
            @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
            @Result(column="gender", property="gender", jdbcType=JdbcType.VARCHAR),
            @Result(column="phone", property="phone", jdbcType=JdbcType.VARCHAR),
            @Result(column="account_name", property="accountName", jdbcType=JdbcType.VARCHAR),
            @Result(column="account_password", property="accountPassword", jdbcType=JdbcType.VARCHAR),
            @Result(column="status", property="status", jdbcType=JdbcType.VARCHAR),
            @Result(column="task_id", property="taskId", jdbcType=JdbcType.VARCHAR)
    })
    Receiver selectById(@Param("id") String id);
}