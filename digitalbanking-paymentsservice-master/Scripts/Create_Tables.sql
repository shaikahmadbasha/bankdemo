CREATE TABLE payee_details
(
payee_id integer NOT NULL,
user_id character varying(30),
nick_name character varying(30),
status boolean,
bank character varying(50),
branch character varying(50),
ifsc_code character varying(20),
payee_type character varying(20),
PRIMARY KEY (payee_id)
)
WITH (
OIDS = FALSE
);
ALTER TABLE public.payee_details
OWNER to postgres;

CREATE TABLE registered_billers
(
biller_id integer NOT NULL,
user_id character varying(30),
biller_name character varying(150),
state character varying(20),
account_no integer,
ifsc_code character varying(10),
biller_type character varying(20),
PRIMARY KEY (biller_id)
)
WITH (
OIDS = FALSE
);
ALTER TABLE public.registered_billers
OWNER to postgres;


CREATE TABLE user_billers
(
    sno numeric(16) NOT NULL,
    user_id character varying(50) NOT NULL,
    biller_name character varying(50),
    biller_nick_name character varying(20),
    biller_due_date date,
    amount numeric(9, 2),
    remark character varying(100),
    biller_account_no numeric(16),
    ifsc_code character varying(15),
    PRIMARY KEY (sno)
)
WITH (
OIDS = FALSE
);
ALTER TABLE public.registered_billers
OWNER to postgres;
