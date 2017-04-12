INSERT INTO registered_billers ("biller_id", "user_id", "biller_name", "state", "account_no", "ifsc_code", "biller_type") VALUES (11, 'mahadiscom', 'mahadiscom', 'maharashtra', 1312456, 'MAH004PU', 'Electricity' );

INSERT INTO registered_billers ("biller_id", "user_id", "biller_name", "state", "account_no", "ifsc_code", "biller_type") VALUES (22, 'vodafone', 'vodefone', 'maharashtra', 1114406, 'VODPUN', 'Telecom' );

INSERT INTO registered_billers ("biller_id", "user_id", "biller_name", "state", "account_no", "ifsc_code", "biller_type") VALUES (33, 'idea', 'idea', 'maharashtra', 1314661, 'IDEAPUN', 'Telecom' );



INSERT INTO user_billers ("sno", "user_id", "biller_name", "biller_nick_name", "biller_due_date", "amount", "remark", "biller_account_no", "ifsc_code") VALUES (1,'556677', 'mahadiscom', 'electricity bill', NULL, 1150, 'paid successfully', 1312456, 'MAH004PU');

INSERT INTO user_billers ("sno", "user_id", "biller_name", "biller_nick_name", "biller_due_date", "amount", "remark", "biller_account_no", "ifsc_code") VALUES (2, '556677', 'idea', 'Telephone bill', NULL, 750, 'paid successfully', 1314661,'IDEAPUN');





INSERT INTO payee_details ("payee_id", "user_id", "nick_name", "status", "bank", "branch", "ifsc_code", "payee_type") VALUES (111, 'subhamagarwal', 'Subham', true, 'citi bank', 'Nigdi pradhikaran', 'CITINIG', 'Customer');