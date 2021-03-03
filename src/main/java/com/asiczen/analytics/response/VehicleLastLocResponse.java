package com.asiczen.analytics.response;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class VehicleLastLocResponse {

	private String vehicleNumber;
	private String imeiNumber;
	private double lng;
	private double lat;
	private String vehicleType;
	private Date lastTime;
	private String driverName;
	private String driverContact;
	private String orgRefName;

	private double totalDistanceDaily;
	private double topSpeed;

	private boolean current;
	private double speed;
	private int fuel;
	
	
	private double currentFuel;

	// Flags for Different status
	boolean idleEngineOn;
	boolean idleEngineOff;
	boolean vehicleMovingFlag;
	boolean alertFlag;
	boolean currenFlag = true;
	boolean geoViolation;
	boolean speedViolation;
}
