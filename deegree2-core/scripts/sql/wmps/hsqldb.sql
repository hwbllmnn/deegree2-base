CREATE TABLE WMPS_REQUESTS ( 
	id VARCHAR(50), 
	processed VARCHAR(10), 
	timestamp BIGINT, 
	version VARCHAR(10), 
	layers BINARY, 
	srs VARCHAR(50), 
	boundingbox VARCHAR(100), 
	center VARCHAR(50), 
	scaledenominator INTEGER, 
	transparent BOOLEAN, 
	bgcolor VARCHAR(10), 
	title VARCHAR(500), 
	copyright VARCHAR(200), 
	legend BOOLEAN, 
	scaleBar BOOLEAN, 
	note VARCHAR(800), 
	template VARCHAR(150), 
	emailaddress VARCHAR(150), 
	textAreas BINARY, 
	vendor BINARY, 
	PRIMARY KEY(id,timestamp) 
);