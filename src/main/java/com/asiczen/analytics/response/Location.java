package com.asiczen.analytics.response;

import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Location {

	private double lng;
	private double lat;
	private LocalDateTime messageTimeStamp;
}
