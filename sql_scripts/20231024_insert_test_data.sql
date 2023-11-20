INSERT INTO `category` (`name`, `created`, `is_active`) VALUES ('Milk', '2023-10-24 10:50:00', 1);
INSERT INTO `category` (`name`, `created`, `is_active`) VALUES ('Meat', '2023-10-24 10:50:00', 1);
INSERT INTO `category` (`name`, `created`, `is_active`) VALUES ('Vegetables', '2023-10-24 10:50:00', 1);
INSERT INTO `category` (`name`, `created`, `is_active`) VALUES ('Fruit', '2023-10-24 10:50:00', 0);

INSERT INTO `city`(`name`) VALUES ('Sofia');
INSERT INTO `city`(`name`) VALUES ('Plovdiv');
INSERT INTO `city`(`name`) VALUES ('Varna');
INSERT INTO `city`(`name`) VALUES ('Burgas');

INSERT INTO `store`(`name`, `city_id`, `address`) VALUES ('Avanti', 1, 'bul. Bulgaria 16');
INSERT INTO `store`(`name`, `city_id`, `address`) VALUES ('Lidl', 1, 'bul. Hristo Botev 45');
INSERT INTO `store`(`name`, `city_id`, `address`) VALUES ('Fantastiko', 2, 'bul Gotse Delchev 13');
INSERT INTO `store`(`name`, `city_id`, `address`) VALUES ('Billa', 3, 'bul. Vasil Levski 14');
INSERT INTO `store`(`name`, `city_id`, `address`) VALUES ('Fantastiko', 4, 'bul. Bulgaria 3');

INSERT INTO `product`(`name`, `description`, `category_id`, `unit_price`, `created`, `is_active`) VALUES ('Кашкавал', 'Кашкавал верея', 1, 12.5, '2023-10-24 10:50:00', 1);
INSERT INTO `product`(`name`, `description`, `category_id`, `unit_price`, `created`, `is_active`) VALUES ('Свинско', 'Месо от ферма', 2, 25.6, '2023-10-24 10:50:00', 1);
INSERT INTO `product`(`name`, `description`, `category_id`, `unit_price`, `created`, `is_active`) VALUES ('Чушки', 'от с.Ивайло', 3, 8, '2023-10-24 10:50:00', 1);
INSERT INTO `product`(`name`, `description`, `category_id`, `unit_price`, `created`, `is_active`) VALUES ('Ябълки', 'от с.Черногорово', 4, 4, '2023-10-24 10:50:00', 1);
INSERT INTO `product`(`name`, `description`, `category_id`, `unit_price`, `created`, `is_active`) VALUES ('Ягоди', 'от с.Горно нандолнище', 4, 6.5, '2023-11-07 10:50:00', 1);

INSERT INTO `sales`(`store_id`, `product_id`, `sold_on`, `amount`, `total_price`) VALUES (1,1,'2023-10-24 10:50:00',2,0);
INSERT INTO `sales`(`store_id`, `product_id`, `sold_on`, `amount`, `total_price`) VALUES (1,2,'2023-10-24 10:50:00',3,0);
INSERT INTO `sales`(`store_id`, `product_id`, `sold_on`, `amount`, `total_price`) VALUES (1,3,'2023-10-24 10:50:00',5,0);
INSERT INTO `sales`(`store_id`, `product_id`, `sold_on`, `amount`, `total_price`) VALUES (1,4,'2023-10-24 10:50:00',6,0);
INSERT INTO `sales`(`store_id`, `product_id`, `sold_on`, `amount`, `total_price`) VALUES (2,1,'2023-10-24 10:50:00',2,0);
INSERT INTO `sales`(`store_id`, `product_id`, `sold_on`, `amount`, `total_price`) VALUES (2,2,'2023-10-24 10:50:00',3,0);
INSERT INTO `sales`(`store_id`, `product_id`, `sold_on`, `amount`, `total_price`) VALUES (2,3,'2023-10-24 10:50:00',5,0);
INSERT INTO `sales`(`store_id`, `product_id`, `sold_on`, `amount`, `total_price`) VALUES (2,4,'2023-10-24 10:50:00',6,0);
INSERT INTO `sales`(`store_id`, `product_id`, `sold_on`, `amount`, `total_price`) VALUES (3,1,'2023-10-24 10:50:00',2,0);
INSERT INTO `sales`(`store_id`, `product_id`, `sold_on`, `amount`, `total_price`) VALUES (3,2,'2023-10-24 10:50:00',3,0);
INSERT INTO `sales`(`store_id`, `product_id`, `sold_on`, `amount`, `total_price`) VALUES (3,3,'2023-10-24 10:50:00',5,0);
INSERT INTO `sales`(`store_id`, `product_id`, `sold_on`, `amount`, `total_price`) VALUES (3,4,'2023-10-24 10:50:00',6,0);
INSERT INTO `sales`(`store_id`, `product_id`, `sold_on`, `amount`, `total_price`) VALUES (4,1,'2023-10-24 10:50:00',2,0);
INSERT INTO `sales`(`store_id`, `product_id`, `sold_on`, `amount`, `total_price`) VALUES (4,2,'2023-10-24 10:50:00',3,0);
INSERT INTO `sales`(`store_id`, `product_id`, `sold_on`, `amount`, `total_price`) VALUES (4,3,'2023-10-24 10:50:00',5,0);
INSERT INTO `sales`(`store_id`, `product_id`, `sold_on`, `amount`, `total_price`) VALUES (4,4,'2023-10-24 10:50:00',6,0);