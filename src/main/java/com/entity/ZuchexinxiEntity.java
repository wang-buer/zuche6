package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 租车信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2020-12-02 01:38:50
 */
@TableName("zuchexinxi")
public class ZuchexinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public ZuchexinxiEntity() {
		
	}
	
	public ZuchexinxiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 订单编号
	 */
					
	private String dingdanbianhao;
	
	/**
	 * 车辆编号
	 */
					
	private String cheliangbianhao;
	
	/**
	 * 车辆品牌
	 */
					
	private String cheliangpinpai;
	
	/**
	 * 车辆型号
	 */
					
	private String cheliangxinghao;
	
	/**
	 * 车牌号
	 */
					
	private String chepaihao;
	
	/**
	 * 押金
	 */
					
	private Integer yajin;
	
	/**
	 * 日租金
	 */
					
	private Integer rizujin;
	
	/**
	 * 用户名
	 */
					
	private String yonghuming;
	
	/**
	 * 用户姓名
	 */
					
	private String yonghuxingming;
	
	/**
	 * 租车日期
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date zucheriqi;
	
	/**
	 * 还车日期
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date haicheriqi;
	
	/**
	 * 是否支付
	 */
					
	private String ispay;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：订单编号
	 */
	public void setDingdanbianhao(String dingdanbianhao) {
		this.dingdanbianhao = dingdanbianhao;
	}
	/**
	 * 获取：订单编号
	 */
	public String getDingdanbianhao() {
		return dingdanbianhao;
	}
	/**
	 * 设置：车辆编号
	 */
	public void setCheliangbianhao(String cheliangbianhao) {
		this.cheliangbianhao = cheliangbianhao;
	}
	/**
	 * 获取：车辆编号
	 */
	public String getCheliangbianhao() {
		return cheliangbianhao;
	}
	/**
	 * 设置：车辆品牌
	 */
	public void setCheliangpinpai(String cheliangpinpai) {
		this.cheliangpinpai = cheliangpinpai;
	}
	/**
	 * 获取：车辆品牌
	 */
	public String getCheliangpinpai() {
		return cheliangpinpai;
	}
	/**
	 * 设置：车辆型号
	 */
	public void setCheliangxinghao(String cheliangxinghao) {
		this.cheliangxinghao = cheliangxinghao;
	}
	/**
	 * 获取：车辆型号
	 */
	public String getCheliangxinghao() {
		return cheliangxinghao;
	}
	/**
	 * 设置：车牌号
	 */
	public void setChepaihao(String chepaihao) {
		this.chepaihao = chepaihao;
	}
	/**
	 * 获取：车牌号
	 */
	public String getChepaihao() {
		return chepaihao;
	}
	/**
	 * 设置：押金
	 */
	public void setYajin(Integer yajin) {
		this.yajin = yajin;
	}
	/**
	 * 获取：押金
	 */
	public Integer getYajin() {
		return yajin;
	}
	/**
	 * 设置：日租金
	 */
	public void setRizujin(Integer rizujin) {
		this.rizujin = rizujin;
	}
	/**
	 * 获取：日租金
	 */
	public Integer getRizujin() {
		return rizujin;
	}
	/**
	 * 设置：用户名
	 */
	public void setYonghuming(String yonghuming) {
		this.yonghuming = yonghuming;
	}
	/**
	 * 获取：用户名
	 */
	public String getYonghuming() {
		return yonghuming;
	}
	/**
	 * 设置：用户姓名
	 */
	public void setYonghuxingming(String yonghuxingming) {
		this.yonghuxingming = yonghuxingming;
	}
	/**
	 * 获取：用户姓名
	 */
	public String getYonghuxingming() {
		return yonghuxingming;
	}
	/**
	 * 设置：租车日期
	 */
	public void setZucheriqi(Date zucheriqi) {
		this.zucheriqi = zucheriqi;
	}
	/**
	 * 获取：租车日期
	 */
	public Date getZucheriqi() {
		return zucheriqi;
	}
	/**
	 * 设置：还车日期
	 */
	public void setHaicheriqi(Date haicheriqi) {
		this.haicheriqi = haicheriqi;
	}
	/**
	 * 获取：还车日期
	 */
	public Date getHaicheriqi() {
		return haicheriqi;
	}
	/**
	 * 设置：是否支付
	 */
	public void setIspay(String ispay) {
		this.ispay = ispay;
	}
	/**
	 * 获取：是否支付
	 */
	public String getIspay() {
		return ispay;
	}

}
