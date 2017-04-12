-- Insert rows into DB -
INSERT INTO public."banking_user" ( user_id, user_role, password, user_name, email, is_active) VALUES (
    'user1'::character varying, 'USER'::character varying, 'pass@123'::character varying, 
	'First User'::character varying, 'user@company.com'::character varying, 't'::boolean);	
	