-- Table: public.banking_user

-- DROP TABLE public.banking_user;

CREATE TABLE public.banking_user
(
    user_id character varying(20) COLLATE pg_catalog."default" NOT NULL,
    user_name character varying(50) COLLATE pg_catalog."default" NOT NULL,
    password character varying(50) COLLATE pg_catalog."default" NOT NULL,
    user_role character varying(20) COLLATE pg_catalog."default",
    email character varying(20) COLLATE pg_catalog."default",
    is_active boolean,
    created_date date,
    created_by text COLLATE pg_catalog."default",
    last_login_time timestamp with time zone,
    CONSTRAINT banking_user_pkey PRIMARY KEY (user_id)
)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;

ALTER TABLE public.banking_user
    OWNER to postgres;