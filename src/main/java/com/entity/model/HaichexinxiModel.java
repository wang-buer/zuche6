package com.entity.model;

import com.entity.HaichexinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 还车信息
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2020-12-02 01:38:50
 */
public class HaichexinxiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 车辆编号
	 */
	
	private String cheliangbianhao;
		
	/**
	 * 车牌号
	 */
	
	private String chepaihao;
		
	/**
	 * 用户名
	 */
	
	private String yonghuming;
		
	/**
	 * 用户姓名
	 */
	
	private String yonghuxingming;
		
	/**
	 * 照片
	 */
	
	private String zhaopian;
		
	/**
	 * 租赁天数
	 */
	
	private Integer zulintianshu;
		
	/**
	 * 日租金
	 */
	
	private Integer rizujin;
		
	/**
	 * 总金额
	 */
	
	private Integer zongjine;
		
	/**
	 * 还车日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date haicheriqi;
		
	/**
	 * 备注
	 */
	
	private String beizhu;
		
	/**
	 * 是否审核
	 */
	
	private String sfsh;
		
	/**
	 * 审核回复
	 */
	
	private String shhf;
		
	/**
	 * 是否支付
	 */
	
	private String ispay;
				
	
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
	 * 设置：照片
	 */
	 
	public void setZhaopian(String zhaopian) {
		this.zhaopian = zhaopian;
	}
	
	/**
	 * 获取：照片
	 */
	public String getZhaopian() {
		return zhaopian;
	}
				
	
	/**
	 * 设置：租赁天数
	 */
	 
	public void setZulintianshu(Integer zulintianshu) {
		this.zulintianshu = zulintianshu;
	}
	
	/**
	 * 获取：租赁天数
	 */
	public Integer getZulintianshu() {
		return zulintianshu;
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
	 * 设置：总金额
	 */
	 
	public void setZongjine(Integer zongjine) {
		this.zongjine = zongjine;
	}
	
	/**
	 * 获取：总金额
	 */
	public Integer getZongjine() {
		return zongjine;
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
	 * 设置：备注
	 */
	 
	public void setBeizhu(String beizhu) {
		this.beizhu = beizhu;
	}
	
	/**
	 * 获取：备注
	 */
	public String getBeizhu() {
		return beizhu;
	}
				
	
	/**
	 * 设置：是否审核
	 */
	 
	public void setSfsh(String sfsh) {
		this.sfsh = sfsh;
	}
	
	/**
	 * 获取：是否审核
	 */
	public String getSfsh() {
		return sfsh;
	}
				
	
	/**
	 * 设置：审核回复
	 */
	 
	public void setShhf(String shhf) {
		this.shhf = shhf;
	}
	
	/**
	 * 获取：审核回复
	 */
	public String getShhf() {
		return shhf;
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
