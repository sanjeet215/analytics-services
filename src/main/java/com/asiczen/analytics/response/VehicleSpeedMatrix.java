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
public class VehicleSpeedMatrix {

	private String vehicleNumber;
	private String driverName;
	private double speed;

	private Date timeStamp;
}
