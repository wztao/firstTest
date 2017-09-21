<?xml version="1.0" encoding="UTF-8" ?>
<!DOCTYPE mapper PUBLIC "-//mybatis.org//DTD Mapper 3.0//EN" "http://mybatis.org/dtd/mybatis-3-mapper.dtd" >
<mapper namespace="com.eigpay.feesnode.infra.dao.BatchSettParaCfgDOMapper" >
  <resultMap id="BaseResultMap" type="com.eigpay.feesnode.core.model.BatchSettParaCfgDO" >
    <id column="id" property="id" jdbcType="BIGINT" />
    <result column="ica" property="ica" jdbcType="VARCHAR" />
    <result column="sett_cfg_id" property="settCfgId" jdbcType="VARCHAR" />
    <result column="sett_service_id" property="settServiceId" jdbcType="VARCHAR" />
    <result column="sett_type" property="settType" jdbcType="VARCHAR" />
    <result column="sett_ica" property="settIca" jdbcType="VARCHAR" />
    <result column="sett_acc_num" property="settAccNum" jdbcType="VARCHAR" />
    <result column="description" property="description" jdbcType="VARCHAR" />
    <result column="creator" property="creator" jdbcType="VARCHAR" />
    <result column="create_datetime" property="createDatetime" jdbcType="TIMESTAMP" />
    <result column="modifier" property="modifier" jdbcType="VARCHAR" />
    <result column="modify_datetime" property="modifyDatetime" jdbcType="TIMESTAMP" />
    <result column="is_enable" property="isEnable" jdbcType="BIT" />
    <result column="is_deleted" property="isDeleted" jdbcType="BIT" />
  </resultMap>
  <sql id="Base_Column_List" >
    id, ica, sett_cfg_id, sett_service_id, sett_type, sett_ica, sett_acc_num, description, 
    creator, create_datetime, modifier, modify_datetime, is_enable, is_deleted
  </sql>
  <select id="selectByPrimaryKey" resultMap="BaseResultMap" parameterType="java.lang.Long" >
    select 
    <include refid="Base_Column_List" />
    from batch_sett_para_cfg
    where id = #{id,jdbcType=BIGINT}
  </select>
  <delete id="deleteByPrimaryKey" parameterType="java.lang.Long" >
    delete from batch_sett_para_cfg
    where id = #{id,jdbcType=BIGINT}
  </delete>
  <insert id="insert" parameterType="com.eigpay.feesnode.core.model.BatchSettParaCfgDO" >
    insert into batch_sett_para_cfg (id, ica, sett_cfg_id, 
      sett_service_id, sett_type, sett_ica, 
      sett_acc_num, description, creator, 
      create_datetime, modifier, modify_datetime, 
      is_enable, is_deleted)
    values (#{id,jdbcType=BIGINT}, #{ica,jdbcType=VARCHAR}, #{settCfgId,jdbcType=VARCHAR}, 
      #{settServiceId,jdbcType=VARCHAR}, #{settType,jdbcType=VARCHAR}, #{settIca,jdbcType=VARCHAR}, 
      #{settAccNum,jdbcType=VARCHAR}, #{description,jdbcType=VARCHAR}, #{creator,jdbcType=VARCHAR}, 
      #{createDatetime,jdbcType=TIMESTAMP}, #{modifier,jdbcType=VARCHAR}, #{modifyDatetime,jdbcType=TIMESTAMP}, 
      #{isEnable,jdbcType=BIT}, #{isDeleted,jdbcType=BIT})
  </insert>
  <insert id="insertSelective" parameterType="com.eigpay.feesnode.core.model.BatchSettParaCfgDO" >
    insert into batch_sett_para_cfg
    <trim prefix="(" suffix=")" suffixOverrides="," >
      <if test="id != null" >
        id,
      </if>
      <if test="ica != null" >
        ica,
      </if>
      <if test="settCfgId != null" >
        sett_cfg_id,
      </if>
      <if test="settServiceId != null" >
        sett_service_id,
      </if>
      <if test="settType != null" >
        sett_type,
      </if>
      <if test="settIca != null" >
        sett_ica,
      </if>
      <if test="settAccNum != null" >
        sett_acc_num,
      </if>
      <if test="description != null" >
        description,
      </if>
      <if test="creator != null" >
        creator,
      </if>
      <if test="createDatetime != null" >
        create_datetime,
      </if>
      <if test="modifier != null" >
        modifier,
      </if>
      <if test="modifyDatetime != null" >
        modify_datetime,
      </if>
      <if test="isEnable != null" >
        is_enable,
      </if>
      <if test="isDeleted != null" >
        is_deleted,
      </if>
    </trim>
    <trim prefix="values (" suffix=")" suffixOverrides="," >
      <if test="id != null" >
        #{id,jdbcType=BIGINT},
      </if>
      <if test="ica != null" >
        #{ica,jdbcType=VARCHAR},
      </if>
      <if test="settCfgId != null" >
        #{settCfgId,jdbcType=VARCHAR},
      </if>
      <if test="settServiceId != null" >
        #{settServiceId,jdbcType=VARCHAR},
      </if>
      <if test="settType != null" >
        #{settType,jdbcType=VARCHAR},
      </if>
      <if test="settIca != null" >
        #{settIca,jdbcType=VARCHAR},
      </if>
      <if test="settAccNum != null" >
        #{settAccNum,jdbcType=VARCHAR},
      </if>
      <if test="description != null" >
        #{description,jdbcType=VARCHAR},
      </if>
      <if test="creator != null" >
        #{creator,jdbcType=VARCHAR},
      </if>
      <if test="createDatetime != null" >
        #{createDatetime,jdbcType=TIMESTAMP},
      </if>
      <if test="modifier != null" >
        #{modifier,jdbcType=VARCHAR},
      </if>
      <if test="modifyDatetime != null" >
        #{modifyDatetime,jdbcType=TIMESTAMP},
      </if>
      <if test="isEnable != null" >
        #{isEnable,jdbcType=BIT},
      </if>
      <if test="isDeleted != null" >
        #{isDeleted,jdbcType=BIT},
      </if>
    </trim>
  </insert>
  <update id="updateByPrimaryKeySelective" parameterType="com.eigpay.feesnode.core.model.BatchSettParaCfgDO" >
    update batch_sett_para_cfg
    <set >
      <if test="ica != null" >
        ica = #{ica,jdbcType=VARCHAR},
      </if>
      <if test="settCfgId != null" >
        sett_cfg_id = #{settCfgId,jdbcType=VARCHAR},
      </if>
      <if test="settServiceId != null" >
        sett_service_id = #{settServiceId,jdbcType=VARCHAR},
      </if>
      <if test="settType != null" >
        sett_type = #{settType,jdbcType=VARCHAR},
      </if>
      <if test="settIca != null" >
        sett_ica = #{settIca,jdbcType=VARCHAR},
      </if>
      <if test="settAccNum != null" >
        sett_acc_num = #{settAccNum,jdbcType=VARCHAR},
      </if>
      <if test="description != null" >
        description = #{description,jdbcType=VARCHAR},
      </if>
      <if test="creator != null" >
        creator = #{creator,jdbcType=VARCHAR},
      </if>
      <if test="createDatetime != null" >
        create_datetime = #{createDatetime,jdbcType=TIMESTAMP},
      </if>
      <if test="modifier != null" >
        modifier = #{modifier,jdbcType=VARCHAR},
      </if>
      <if test="modifyDatetime != null" >
        modify_datetime = #{modifyDatetime,jdbcType=TIMESTAMP},
      </if>
      <if test="isEnable != null" >
        is_enable = #{isEnable,jdbcType=BIT},
      </if>
      <if test="isDeleted != null" >
        is_deleted = #{isDeleted,jdbcType=BIT},
      </if>
    </set>
    where id = #{id,jdbcType=BIGINT}
  </update>
  <update id="updateByPrimaryKey" parameterType="com.eigpay.feesnode.core.model.BatchSettParaCfgDO" >
    update batch_sett_para_cfg
    set ica = #{ica,jdbcType=VARCHAR},
      sett_cfg_id = #{settCfgId,jdbcType=VARCHAR},
      sett_service_id = #{settServiceId,jdbcType=VARCHAR},
      sett_type = #{settType,jdbcType=VARCHAR},
      sett_ica = #{settIca,jdbcType=VARCHAR},
      sett_acc_num = #{settAccNum,jdbcType=VARCHAR},
      description = #{description,jdbcType=VARCHAR},
      creator = #{creator,jdbcType=VARCHAR},
      create_datetime = #{createDatetime,jdbcType=TIMESTAMP},
      modifier = #{modifier,jdbcType=VARCHAR},
      modify_datetime = #{modifyDatetime,jdbcType=TIMESTAMP},
      is_enable = #{isEnable,jdbcType=BIT},
      is_deleted = #{isDeleted,jdbcType=BIT}
    where id = #{id,jdbcType=BIGINT}
  </update>
</mapper>
