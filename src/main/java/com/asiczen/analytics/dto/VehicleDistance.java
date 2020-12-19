package com.asiczen.analytics.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class VehicleDistance {
	private String vehicleNumber;
	private double distanceTraveled;
}
