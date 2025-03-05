package com.tka;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity

public class Mobile {
		
	@Id
	private String brand;
	private String model;
	private String operatingSystem;
	private String processor;
	private int ramSize;
	private int storageCapacity;
	private String screenType;
	private int refreshRate;
	private int batteryCapacity;
	private int chargingSpeed;
	private String chargingPortType;
	private int maxNetworkSpeed;
	private String bluetoothVersion;
	private String biometricType;
	private String ownerName;
	private int warrantyPeriod;

	public Mobile() {

	}

	private Mobile(String brand, String model, String operatingSystem, String processor, int ramSize,
			int storageCapacity, String screenType, int refreshRate, int batteryCapacity, int chargingSpeed,
			String chargingPortType, int maxNetworkSpeed, String bluetoothVersion, String biometricType,
			String ownerName, int warrantyPeriod) {
		super();
		this.brand = brand;
		this.model = model;
		this.operatingSystem = operatingSystem;
		this.processor = processor;
		this.ramSize = ramSize;
		this.storageCapacity = storageCapacity;
		this.screenType = screenType;
		this.refreshRate = refreshRate;
		this.batteryCapacity = batteryCapacity;
		this.chargingSpeed = chargingSpeed;
		this.chargingPortType = chargingPortType;
		this.maxNetworkSpeed = maxNetworkSpeed;
		this.bluetoothVersion = bluetoothVersion;
		this.biometricType = biometricType;
		this.ownerName = ownerName;
		this.warrantyPeriod = warrantyPeriod;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getOperatingSystem() {
		return operatingSystem;
	}

	public void setOperatingSystem(String operatingSystem) {
		this.operatingSystem = operatingSystem;
	}

	public String getProcessor() {
		return processor;
	}

	public void setProcessor(String processor) {
		this.processor = processor;
	}

	public int getRamSize() {
		return ramSize;
	}

	public void setRamSize(int ramSize) {
		this.ramSize = ramSize;
	}

	public int getStorageCapacity() {
		return storageCapacity;
	}

	public void setStorageCapacity(int storageCapacity) {
		this.storageCapacity = storageCapacity;
	}

	public String getScreenType() {
		return screenType;
	}

	public void setScreenType(String screenType) {
		this.screenType = screenType;
	}

	public int getRefreshRate() {
		return refreshRate;
	}

	public void setRefreshRate(int refreshRate) {
		this.refreshRate = refreshRate;
	}

	public int getBatteryCapacity() {
		return batteryCapacity;
	}

	public void setBatteryCapacity(int batteryCapacity) {
		this.batteryCapacity = batteryCapacity;
	}

	public int getChargingSpeed() {
		return chargingSpeed;
	}

	public void setChargingSpeed(int chargingSpeed) {
		this.chargingSpeed = chargingSpeed;
	}

	public String getChargingPortType() {
		return chargingPortType;
	}

	public void setChargingPortType(String chargingPortType) {
		this.chargingPortType = chargingPortType;
	}

	public int getMaxNetworkSpeed() {
		return maxNetworkSpeed;
	}

	public void setMaxNetworkSpeed(int maxNetworkSpeed) {
		this.maxNetworkSpeed = maxNetworkSpeed;
	}

	public String getBluetoothVersion() {
		return bluetoothVersion;
	}

	public void setBluetoothVersion(String bluetoothVersion) {
		this.bluetoothVersion = bluetoothVersion;
	}

	public String getBiometricType() {
		return biometricType;
	}

	public void setBiometricType(String biometricType) {
		this.biometricType = biometricType;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public int getWarrantyPeriod() {
		return warrantyPeriod;
	}

	public void setWarrantyPeriod(int warrantyPeriod) {
		this.warrantyPeriod = warrantyPeriod;
	}

	@Override
	public String toString() {
		return "Mobile [brand=" + brand + ", model=" + model + ", operatingSystem=" + operatingSystem + ", processor="
				+ processor + ", ramSize=" + ramSize + ", storageCapacity=" + storageCapacity + ", screenType="
				+ screenType + ", refreshRate=" + refreshRate + ", batteryCapacity=" + batteryCapacity
				+ ", chargingSpeed=" + chargingSpeed + ", chargingPortType=" + chargingPortType + ", maxNetworkSpeed="
				+ maxNetworkSpeed + ", bluetoothVersion=" + bluetoothVersion + ", biometricType=" + biometricType
				+ ", ownerName=" + ownerName + ", warrantyPeriod=" + warrantyPeriod + "]";
	}

}
