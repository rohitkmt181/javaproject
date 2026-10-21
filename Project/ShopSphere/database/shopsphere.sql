CREATE DATABASE IF NOT EXISTS shopsphere;
USE shopsphere;

CREATE TABLE users (
    user_id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    email VARCHAR(100) UNIQUE NOT NULL,
    password VARCHAR(255) NOT NULL,
    mobile VARCHAR(15),
    role VARCHAR(20) DEFAULT 'CUSTOMER',
    status BOOLEAN DEFAULT TRUE,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

CREATE TABLE categories (
    category_id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    description TEXT,
    status BOOLEAN DEFAULT TRUE
);

CREATE TABLE products (
    product_id INT AUTO_INCREMENT PRIMARY KEY,
    category_id INT,
    name VARCHAR(200) NOT NULL,
    brand VARCHAR(100),
    description TEXT,
    price DECIMAL(10,2) NOT NULL,
    discount DECIMAL(5,2) DEFAULT 0.00,
    stock INT DEFAULT 0,
    image_url VARCHAR(255),
    status BOOLEAN DEFAULT TRUE,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    FOREIGN KEY (category_id) REFERENCES categories(category_id)
);

CREATE TABLE cart (
    cart_id INT AUTO_INCREMENT PRIMARY KEY,
    user_id INT,
    product_id INT,
    quantity INT DEFAULT 1,
    FOREIGN KEY (user_id) REFERENCES users(user_id),
    FOREIGN KEY (product_id) REFERENCES products(product_id)
);

CREATE TABLE orders (
    order_id INT AUTO_INCREMENT PRIMARY KEY,
    user_id INT,
    total_amount DECIMAL(10,2),
    order_status VARCHAR(50) DEFAULT 'PENDING',
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    FOREIGN KEY (user_id) REFERENCES users(user_id)
);

INSERT INTO users (name, email, password, role) VALUES ('Admin User', 'admin@shopsphere.com', 'admin123', 'ADMIN');
INSERT INTO categories (name, description) VALUES ('Electronics', 'Devices and Gadgets'), ('Clothing', 'Apparel and Fashion');
INSERT INTO products (category_id, name, brand, description, price, stock, image_url) VALUES 
(1, 'Smartphone X', 'TechBrand', 'Latest 5G smartphone with advanced camera.', 49999.00, 50, 'phone.jpg'),
(1, 'Laptop Pro', 'TechBrand', 'High performance laptop for professionals.', 85000.00, 30, 'laptop.jpg');
