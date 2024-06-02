--
-- PostgreSQL database dump
--

-- Dumped from database version 16.3
-- Dumped by pg_dump version 16.3

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET xmloption = content;
SET client_min_messages = warning;
SET row_security = off;

SET default_tablespace = '';

SET default_table_access_method = heap;

--
-- Name: comment; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.comment (
    id bigint NOT NULL,
    name character varying(255),
    post_id bigint
);


ALTER TABLE public.comment OWNER TO postgres;

--
-- Name: comment_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.comment_seq
    START WITH 1
    INCREMENT BY 50
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER SEQUENCE public.comment_seq OWNER TO postgres;

--
-- Name: posts; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.posts (
    id bigint NOT NULL,
    author character varying(255),
    content character varying(255),
    title character varying(255),
    user_id bigint
);


ALTER TABLE public.posts OWNER TO postgres;

--
-- Name: posts_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.posts_seq
    START WITH 1
    INCREMENT BY 50
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER SEQUENCE public.posts_seq OWNER TO postgres;

--
-- Name: users; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.users (
    id bigint NOT NULL,
    name character varying(255)
);


ALTER TABLE public.users OWNER TO postgres;

--
-- Name: users_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.users_seq
    START WITH 1
    INCREMENT BY 50
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER SEQUENCE public.users_seq OWNER TO postgres;

--
-- Data for Name: comment; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.comment (id, name, post_id) FROM stdin;
5	Nice Pics of John Doe	3
6	This post is really good of John Doe	3
7	Nice Pic of Second post of John Doe	4
8	Happy holiday Doe 2 post	4
9	Great introduction!	5
10	Very helpful, thanks Jane!	5
11	Clear and concise.	6
12	Thanks for explaining JPA so well!	6
13	Very informative.	7
14	Helped me understand Docker better, thanks Alice!	7
15	This is exactly what I needed.	8
16	Great tips, will definitely apply them.	8
\.


--
-- Data for Name: posts; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.posts (id, author, content, title, user_id) FROM stdin;
3	John Doe	This is the content of the first post.	First Post	2
4	John Doe	This is the content of the second post.	Second Post	2
5	Jane Smith	Spring Boot makes it easy to create stand-alone, production-grade Spring based Applications.	Introduction to Spring Boot	3
6	Jane Smith	Java Persistence API (JPA) is a specification for accessing, persisting, and managing data between Java objects and relational databases.	Understanding JPA	3
7	Alice Johnson	Docker is a set of platform as a service products that use OS-level virtualization to deliver software in packages called containers.	Docker Basics	4
8	Alice Johnson	In this post, we delve deeper into advanced Docker techniques and best practices.	Advanced Docker Techniques	4
\.


--
-- Data for Name: users; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.users (id, name) FROM stdin;
2	John Doe
3	Jane Smith
4	Alice Johnson
\.


--
-- Name: comment_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.comment_seq', 51, true);


--
-- Name: posts_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.posts_seq', 51, true);


--
-- Name: users_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.users_seq', 51, true);


--
-- Name: comment comment_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.comment
    ADD CONSTRAINT comment_pkey PRIMARY KEY (id);


--
-- Name: posts posts_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.posts
    ADD CONSTRAINT posts_pkey PRIMARY KEY (id);


--
-- Name: users users_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.users
    ADD CONSTRAINT users_pkey PRIMARY KEY (id);


--
-- Name: posts fk5lidm6cqbc7u4xhqpxm898qme; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.posts
    ADD CONSTRAINT fk5lidm6cqbc7u4xhqpxm898qme FOREIGN KEY (user_id) REFERENCES public.users(id);


--
-- Name: comment fk7jok1s6lywoh0srylq8lt7tmn; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.comment
    ADD CONSTRAINT fk7jok1s6lywoh0srylq8lt7tmn FOREIGN KEY (post_id) REFERENCES public.posts(id);


--
-- PostgreSQL database dump complete
--

