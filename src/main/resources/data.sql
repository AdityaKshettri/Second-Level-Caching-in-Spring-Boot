--- currencies ---
INSERT INTO currencies(id, code, description) VALUES(1, 'INR', 'Indian Rupees');
INSERT INTO currencies(id, code, description) VALUES(2, 'USD', 'US Dollars');

--- books ---
INSERT INTO books(id, title, price, description, currency_id) VALUES(1, 'Book 1', 200, 'Book 1', 1);
INSERT INTO books(id, title, price, description, currency_id) VALUES(2, 'Book 2', 500, 'Book 2', 1);
