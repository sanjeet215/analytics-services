package com.asiczen.analytics.repository;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.asiczen.analytics.model.EndOfDayMessage;

@Repository
public interface EndOfDayMessageRepository extends MongoRepository<EndOfDayMessage, String> {

	List<EndOfDayMessage> findByorgRefNameAndTimestampBetween(String orgRefName, Date fromDate, Date toDate);

	List<EndOfDayMessage> findByorgRefNameAndTimestampBetween(String orgRefName, LocalDateTime fromDate, LocalDateTime toDate);

	//List<EndOfDayMessage> findByOrgRefNameAndTimestampBetween(String orgRefName, Date fromDate, Date toDate);

	List<EndOfDayMessage> findByOrgRefNameAndTimestampBetweenAndVehicleNumber(String orgRefName, Date fromDate, Date toDate,String vehicleNumber);
}
