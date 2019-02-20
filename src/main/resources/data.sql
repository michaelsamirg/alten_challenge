Insert into CUSTOMER(ID, NAME, ADDRESS) values (1, 'Kalles Grustransporter AB', 'Cementvägen 8, 111 11 Södertälje');
Insert into CUSTOMER(ID, NAME, ADDRESS) values (2, 'Johans Bulk AB', 'Balkvägen 12, 222 22 Stockholm');
Insert into CUSTOMER(ID, NAME, ADDRESS) values (3, 'Haralds Värdetransporter AB', 'Budgetvägen 1, 333 33 Uppsala');

Insert into VEHICLE(ID, VEHICLE_ID, REG_No, STATUS) values(1, 'YS2R4X20005399401', 'ABC123', 0);
Insert into VEHICLE(ID, VEHICLE_ID, REG_No, STATUS) values(2, 'VLUR4X20009093588', 'DEF456', 0);
Insert into VEHICLE(ID, VEHICLE_ID, REG_No, STATUS) values(3, 'VLUR4X20009048066', 'GHI789', 0);

Insert into VEHICLE(ID, VEHICLE_ID, REG_No, STATUS) values(4, 'YS2R4X20005388011', 'JKL012', 0);
Insert into VEHICLE(ID, VEHICLE_ID, REG_No, STATUS) values(5, 'YS2R4X20005387949', 'MNO345', 0);

Insert into VEHICLE(ID, VEHICLE_ID, REG_No, STATUS) values(6, 'YS2R4X20005387055', 'STU901', 0);


Insert into VEHICLE_CUSTOMER values(1, 1);
Insert into VEHICLE_CUSTOMER values(2, 1);
Insert into VEHICLE_CUSTOMER values(3, 1);

Insert into VEHICLE_CUSTOMER values(4, 2);
Insert into VEHICLE_CUSTOMER values(5, 2);

Insert into VEHICLE_CUSTOMER values(1, 3);
Insert into VEHICLE_CUSTOMER values(6, 3);