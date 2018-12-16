package cn.com.car.entry;

import static javax.persistence.GenerationType.IDENTITY;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 车辆
 * @author lianyc
 *
 */
@Entity
@Table(name="t_car")
public class Car implements Serializable {

	/**
	 * 
	 */
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	private Long id;
	private static final long serialVersionUID = 1L;
	@Column(name="car_name",length=20)
	private String carName;
	//价格
	@Column(name="car_price",length=20)
	private String price;
	//颜色
	@Column(name="car_color",length=10)
	private String carColor;
	//表显里程
	@Column(name="table_show_mileage")
	private int tableShowMileage;
	//上牌地区
	@Column(name="registration_area")
	private String registrationArea;
	//过户信息
	@Column(name="change_number")
	private int changeNumber;
	//排量
	@Column(name="car_displacement",length=20)
	private String displacement;
	//排放标准
	@Column(name="emission_standards",length=20)
	private String emissionStandards;
	//上牌时间
	@Column(name="on_card_time")
	private Date onCardTime;
	//厂商
	@Column(name="car_vendor",length=20)
	private String carVendor;
	//级别
	@Column(name="car_level",length=20)
	private String carLevel;
	//上市时间
	@Column(name="market_time")
	private Date marketTime;
	//能源类型
	@Column(name="car_type",length=10)
	private String carType;
	//最大功率
	@Column(name="max_power")
	private String maxPower;
	//最大扭矩
	@Column(name="max_torque")
	private int maxTorque;
	//发动机
	@Column(name="car_engine", length=20)
	private String engine;
	//变速箱
	@Column(name="car_transmission",length=20)
	private String transmission;
	//长宽高
	@Column(name="car_threeHigh",length=50)
	private String threeHigh;
	//车身结构
	@Column(name="body_tructure",length=50)
	private String bodyStructure;
	public String getCarName() {
		return carName;
	}
	public void setCarName(String carName) {
		this.carName = carName;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getCarColor() {
		return carColor;
	}
	public void setCarColor(String carColor) {
		this.carColor = carColor;
	}
	public int getTableShowMileage() {
		return tableShowMileage;
	}
	public void setTableShowMileage(int tableShowMileage) {
		this.tableShowMileage = tableShowMileage;
	}
	public String getRegistrationArea() {
		return registrationArea;
	}
	public void setRegistrationArea(String registrationArea) {
		this.registrationArea = registrationArea;
	}
	public int getChangeNumber() {
		return changeNumber;
	}
	public void setChangeNumber(int changeNumber) {
		this.changeNumber = changeNumber;
	}
	public String getDisplacement() {
		return displacement;
	}
	public void setDisplacement(String displacement) {
		this.displacement = displacement;
	}
	public String getEmissionStandards() {
		return emissionStandards;
	}
	public void setEmissionStandards(String emissionStandards) {
		this.emissionStandards = emissionStandards;
	}
	public Date getOnCardTime() {
		return onCardTime;
	}
	public void setOnCardTime(Date onCardTime) {
		this.onCardTime = onCardTime;
	}
	public String getCarVendor() {
		return carVendor;
	}
	public void setCarVendor(String carVendor) {
		this.carVendor = carVendor;
	}
	public String getCarLevel() {
		return carLevel;
	}
	public void setCarLevel(String carLevel) {
		this.carLevel = carLevel;
	}
	public Date getMarketTime() {
		return marketTime;
	}
	public void setMarketTime(Date marketTime) {
		this.marketTime = marketTime;
	}
	public String getCarType() {
		return carType;
	}
	public void setCarType(String carType) {
		this.carType = carType;
	}
	public String getMaxPower() {
		return maxPower;
	}
	public void setMaxPower(String maxPower) {
		this.maxPower = maxPower;
	}
	public int getMaxTorque() {
		return maxTorque;
	}
	public void setMaxTorque(int maxTorque) {
		this.maxTorque = maxTorque;
	}
	public String getEngine() {
		return engine;
	}
	public void setEngine(String engine) {
		this.engine = engine;
	}
	public String getTransmission() {
		return transmission;
	}
	public void setTransmission(String transmission) {
		this.transmission = transmission;
	}
	public String getThreeHigh() {
		return threeHigh;
	}
	public void setThreeHigh(String threeHigh) {
		this.threeHigh = threeHigh;
	}
	public String getBodyStructure() {
		return bodyStructure;
	}
	public void setBodyStructure(String bodyStructure) {
		this.bodyStructure = bodyStructure;
	}
	
	
	
}
