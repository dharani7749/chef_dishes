CREATE DATABASE IF NOT EXISTS chef_dishes;
USE chef_dishes;

CREATE TABLE dish (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    description TEXT,
    price DECIMAL(10, 2) NOT NULL,
    image_url VARCHAR(255)
);
CREATE TABLE category (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100) NOT NULL
);

ALTER TABLE dish ADD COLUMN category_id INT,
ADD FOREIGN KEY (category_id) REFERENCES category(id);

CREATE TABLE chef (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    experience INT, -- in years
    speciality VARCHAR(100),
    image_url VARCHAR(255) -- optional image
);

INSERT INTO dish (name, description, price, image_url) VALUES
('Margherita Pizza', 'Classic pizza with tomato and mozzarella.', 299.00, 'https://example.com/images/margherita.jpg'),
('Paneer Butter Masala', 'Cottage cheese in creamy tomato gravy.', 250.00, 'https://example.com/images/paneer.jpg'),
('Tandoori Chicken', 'Spicy grilled chicken.', 349.00, 'https://example.com/images/tandoori.jpg'),
('Veg Biryani', 'Fragrant rice with mixed vegetables and spices.', 200.00, 'https://example.com/images/veg_biryani.jpg');

INSERT INTO category (name) VALUES ('Main Course'), ('Starter'), ('Dessert');

INSERT INTO chef (name, experience, speciality, image_url) VALUES
('Chef Ananya Kapoor', 10, 'North Indian Cuisine', 'https://example.com/images/ananya.jpg'),
('Chef Rohan Mehta', 8, 'Italian Cuisine', 'https://example.com/images/rohan.jpg'),
('Chef Priya Sharma', 12, 'Desserts', 'https://example.com/images/priya.jpg');


SELECT * FROM dish;

SELECT * FROM chef;

SELECT * FROM category;