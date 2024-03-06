package com.entity.vo;

import com.entity.CheliangxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 车辆信息
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2020-12-02 01:38:50
 */
public class CheliangxinxiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 汽车类型
	 */
	
	private String qicheleixing;
		
	/**
	 * 照片
	 */
	
	private String zhaopian;
		
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
	 * 状态
	 */
	
	private String zhuangtai;
		
	/**
	 * 车龄
	 */
	
	private String cheling;
		
	/**
	 * 公里数
	 */
	
	private String gonglishu;
		
	/**
	 * 押金
	 */
	
	private Integer yajin;
		
	/**
	 * 日租金
	 */
	
	private Integer rizujin;
		
	/**
	 * 取车地址
	 */
	
	private String quchedizhi;
		
	/**
	 * 还车地址
	 */
	
	private String haichedizhi;
		
	/**
	 * 详情
	 */
	
	private String xiangqing;
				
	
	/**
	 * 设置：汽车类型
	 */
	 
	public void setQicheleixing(String qicheleixing) {
		this.qicheleixing = qicheleixing;
	}
	
	/**
	 * 获取：汽车类型
	 */
	public String getQicheleixing() {
		return qicheleixing;
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
	 * 设置：状态
	 */
	 
	public void setZhuangtai(String zhuangtai) {
		this.zhuangtai = zhuangtai;
	}
	
	/**
	 * 获取：状态
	 */
	public String getZhuangtai() {
		return zhuangtai;
	}
				
	
	/**
	 * 设置：车龄
	 */
	 
	public void setCheling(String cheling) {
		this.cheling = cheling;
	}
	
	/**
	 * 获取：车龄
	 */
	public String getCheling() {
		return cheling;
	}
				
	
	/**
	 * 设置：公里数
	 */
	 
	public void setGonglishu(String gonglishu) {
		this.gonglishu = gonglishu;
	}
	
	/**
	 * 获取：公里数
	 */
	public String getGonglishu() {
		return gonglishu;
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
	 * 设置：取车地址
	 */
	 
	public void setQuchedizhi(String quchedizhi) {
		this.quchedizhi = quchedizhi;
	}
	
	/**
	 * 获取：取车地址
	 */
	public String getQuchedizhi() {
		return quchedizhi;
	}
				
	
	/**
	 * 设置：还车地址
	 */
	 
	public void setHaichedizhi(String haichedizhi) {
		this.haichedizhi = haichedizhi;
	}
	
	/**
	 * 获取：还车地址
	 */
	public String getHaichedizhi() {
		return haichedizhi;
	}
				
	
	/**
	 * 设置：详情
	 */
	 
	public void setXiangqing(String xiangqing) {
		this.xiangqing = xiangqing;
	}
	
	/**
	 * 获取：详情
	 */
	public String getXiangqing() {
		return xiangqing;
	}
			
}
