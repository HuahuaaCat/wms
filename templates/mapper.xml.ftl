<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE mapper PUBLIC "-//mybatis.org//DTD Mapper 3.0//EN"
    "http://mybatis.org/dtd/mybatis-3-mapper.dtd">

<mapper namespace="${mapper.packageName}.${entity.className}Mapper">

    <resultMap id="BaseResultMap" type="${entity.packageName}.${entity.className}">
        <id column="${entity.primaryKey}" property="${entity.primaryKey}" jdbcType="${entity.primaryKeyType}">
            <generator type="JDBC"/>
        </id>
        <!-- 其他字段映射 -->
    </resultMap>

    <sql id="Base_Column_List">
        ${entity.columns}
    </sql>

    <select id="selectById" resultMap="BaseResultMap">
        SELECT
        <include refid="Base_Column_List"/>
        FROM ${entity.tableName}
        WHERE ${entity.primaryKey} = #{id}
    </select>

    <!-- 其他 SQL 映射语句 -->

</mapper>