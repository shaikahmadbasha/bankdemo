INSERT INTO "account" ("account_no", "customer_id", "ifsc_code", "account_type", "account_balance", "account_creation_date", "account_status") VALUES
(355245,	556677,	'DBSB238',	'S',	25000,	'2016-11-12',	't'),
(355230,	556677,	'DBSB234',	'S',	5000,	'2016-11-08',	't'),
(355650,	556677,	'DBSB274',	'S',	50000,	'2016-12-03',	't'),
(355680,	556678,	'DBSB244',	'S',	50000,	'2016-01-03',	't'),
(3557230,	556678,	'DBSB294',	'S',	50000,	'2016-11-11',	't');

INSERT INTO "customer" ("customer_id", "customer_name", "password", "last_login", "mobile_no", "email_id") VALUES
(556677,	'Raja',	'capg123',	NULL,	NULL,	NULL),
(556678,	'Mahesh',	'capg123',	NULL,	NULL,	NULL);



INSERT INTO public.account_tansaction(transaction_id, tx_date, tx_details, tx_type, account_no, tx_value, tx_description)
	VALUES (1, '2017-02-12 12:23:42.668+05:30', 'Credit ref no 123456', 'CR', 556677, 1200, 'Credit by Cash');
    
INSERT INTO public.account_tansaction(transaction_id, tx_date, tx_details, tx_type, account_no, tx_value, tx_description)
	VALUES (2, '2017-02-18 12:23:42.668+05:30', 'Debit ATM ref No 1234564', 'DR', 556677, 1600, 'Debit at ATM');
    
INSERT INTO public.account_tansaction(transaction_id, tx_date, tx_details, tx_type, account_no, tx_value, tx_description)
	VALUES (3, '2017-02-01 12:23:42.668+05:30', 'Credit ref No 324234', 'CR', 556677, 1500, 'Credti by Netbanking');