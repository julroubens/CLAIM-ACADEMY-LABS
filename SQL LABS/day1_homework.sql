SELECT version();
SELECT * FROM loans;
--Q B1 Show each member's name and join date, newest member first.
SELECT * FROM members ORDER BY join_date DESC ;
--Q B2 Show the title and price of every book that costs more than 15 dollars.
SELECT * FROM books WHERE price > 15;
--Q B2 Show the title and author of every book whose genre is 'Fantasy'.
SELECT books.title, books.author FROM books WHERE genre = 'Fantasy';
--Q B4 Show the 3 most expensive books (title and price), most expensive first.
SELECT books.title, books.price FROM books WHERE price > 15 ORDER BY price DESC;
--Q B5 Show every loan made by the member with member_id = 1 (all columns).
SELECT * FROM loans WHERE member_id = 1;
--Q B6 Show the title and publication year of books published before 1900.
SELECT books.title, books.publication_year FROM books WHERE publication_year < 1900;
--Q B7 Show the loan_id and loan_date of the latest 3 loans, newest first.
SELECT loans.loan_id, loans.loan_date FROM loans ORDER BY loan_date ASC ;
--Q B8 Show the loan_id, book_id and member_id of every loan that has been returned (return date is not empty).
SELECT loans.loan_id, loans.book_id, loans.member_id, return_date FROM loans WHERE return_date IS NULL ;
--Challenge (optional): in your own words, why does WHERE return_date = NULL return nothing?
--BECAUSE THOSE NOT BEEN RETURN YET.

--1. In the loans table we store member_id instead of the member's name and email. Give two reasons
--   this is better than storing the name and email in every loan row.
-- 1. TO BE MATCH WITH THE 2NF
-- 2. A MEMBER CAN HAVE MULTIPLE LOANS

--2. What does the database do if we try to insert a loan for book_id 999 when no such book exists?
--   Which feature of the table makes this happen?
-- THAT RETURN AN ERROR BECAUSE book_id 999 DOES NOT EXIST NO WHERE.

--3. The members table has a UNIQUE email. Give a real-world reason why that rule is useful. Why is it
--   still allowed for one member to have a NULL email?
--  TO MAKE THE DATA ATOMIC, NO DOUBLE.
--
