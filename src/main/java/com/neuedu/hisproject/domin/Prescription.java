package com.neuedu.hisproject.domin;

import java.util.Date;

import lombok.Data;
@Data
public class Prescription {

	private Integer id;
	private Integer registerId;
	private Integer drugId;
	private String drugUsage;
	private Integer drugNumber;
	private String creationTime;
	private String drugState;
	
	
	
}
