CREATE SCHEMA jungle;

CREATE table jungle.animal
(
  id   INT,
  name VARCHAR(50),
  legs INT,

  PRIMARY KEY (id)
);
CREATE table jungle.food
(
  id   INT,
  name VARCHAR(50),
  PRIMARY KEY (id)
);
CREATE table jungle.eat
(
  animal VARCHAR(50),
  food VARCHAR(50),
  PRIMARY KEY (animal, food),
  FOREIGN KEY (animal) REFERENCES Animal(name),
  FOREIGN KEY (food) REFERENCES Food(name),
);



