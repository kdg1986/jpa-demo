CREATE TABLE user_details (
    detail_id INT AUTO_INCREMENT PRIMARY KEY,
    user_id INT,
    full_name VARCHAR(100),
    gender ENUM('Male', 'Female', 'Other'),
    date_of_birth DATE,
    FOREIGN KEY (user_id) REFERENCES users(user_id)
);

INSERT INTO user_details (user_id, full_name, gender, date_of_birth) VALUES
(1, 'Emma Johnson', 'Female', '1995-03-10'),
(2, 'Noah Rodriguez', 'Male', '1992-08-21'),
(3, 'Olivia Martinez', 'Female', '1988-11-05'),
(4, 'Liam Jones', 'Male', '1990-06-15'),
(5, 'Sophia Taylor', 'Female', '1993-09-30'),
(6, 'Jacob Anderson', 'Male', '1987-04-25'),
(7, 'Mia Gonzalez', 'Female', '1994-07-18'),
(8, 'Logan Wilson', 'Male', '1996-01-03'),
(9, 'Ava James', 'Female', '1991-12-08'),
(10, 'Oliver Taylor', 'Male', '1998-02-14'),
(11, 'Isabella Clark', 'Female', '1997-05-20'),
(12, 'Ethan Hall', 'Male', '1999-10-01'),
(13, 'Amelia Lee', 'Female', '1992-06-30'),
(14, 'Michael White', 'Male', '1989-08-11'),
(15, 'Harper Thompson', 'Female', '1994-04-17'),
(16, 'William Moore', 'Male', '1993-07-12'),
(17, 'Ava Taylor', 'Female', '1996-11-28'),
(18, 'Emma Martin', 'Female', '1990-09-23'),
(19, 'James Jackson', 'Male', '1997-03-05'),
(20, 'Olivia Davis', 'Female', '1988-12-02'),
(21, 'Oliver Jones', 'Male', '1995-02-19'),
(22, 'Charlotte Rodriguez', 'Female', '1998-06-28'),
(23, 'Liam Harris', 'Male', '1991-10-07'),
(24, 'Ava Perez', 'Female', '1999-04-12'),
(25, 'Emma Taylor', 'Female', '1994-08-14'),
(26, 'Noah Martinez', 'Male', '1993-01-20'),
(27, 'Sophia Johnson', 'Female', '1989-11-16'),
(28, 'Logan Martinez', 'Male', '1996-05-26'),
(29, 'Olivia Wilson', 'Female', '1997-09-09'),
(30, 'Mason Clark', 'Male', '1998-03-28'),
(31, 'Ava Anderson', 'Female', '1995-06-07'),
(32, 'Oliver Martinez', 'Male', '1992-12-11'),
(33, 'Isabella Taylor', 'Female', '1991-04-03'),
(34, 'Liam Jones', 'Male', '1994-10-16'),
(35, 'Emma Davis', 'Female', '1996-07-23'),
(36, 'Noah Thompson', 'Male', '1987-05-31'),
(37, 'Olivia Martinez', 'Female', '1990-09-18'),
(38, 'Liam Hall', 'Male', '1993-11-27'),
(39, 'Sophia Wilson', 'Female', '1998-02-02'),
(40, 'Logan Rodriguez', 'Male', '1995-12-06'),
(41, 'Oliver James', 'Male', '1991-08-05'),
(42, 'Ava Anderson', 'Female', '1994-01-07'),
(43, 'Emma Perez', 'Female', '1988-04-20'),
(44, 'Noah Jackson', 'Male', '1997-06-11'),
(45, 'Olivia Clark', 'Female', '1999-03-17'),
(46, 'Liam Martinez', 'Male', '1992-07-25'),
(47, 'Sophia Taylor', 'Female', '1995-10-30'),
(48, 'Oliver Harris', 'Male', '1996-04-28'),
(49, 'Ava Thompson', 'Female', '1998-11-13'),
(50, 'Noah Wilson', 'Male', '1991-02-04');
