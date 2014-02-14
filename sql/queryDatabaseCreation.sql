	/* Create database */
	create DATABASE JRecipes;
	
	USE JRecipes;
	
	/* Creation tables tables */
	
	/* Create User table */
	create table if not exists User (
		UserId integer(11) AUTO_INCREMENT PRIMARY KEY,
		Name varchar(50) NOT NULL,
		Surname varchar(50) NOT NULL,
		Nickname varchar(50),
		Email varchar(50) NOT NULL,
		Password varchar(50) NOT NULL,
		Nation varchar(30),
		Job varchar(30),
		BornDate date
	);
	
	/* Crate Following table*/
	create table if not exists ToFollow (
		ToFollowId integer(11) AUTO_INCREMENT PRIMARY KEY,
		FollowerId integer(11) NOT NULL,
		FollowedId integer(11) NOT NULL,
		FOREIGN KEY (FollowerId) REFERENCES User(UserId),
		FOREIGN KEY (FollowedId) REFERENCES User(UserId)
	);
	
	/* Create Publication table */
	create table if not exists Publication (
		PublicationId integer(11) AUTO_INCREMENT PRIMARY KEY,
		Title varchar(50) NOT NULL,
		Date date,
		Cover varchar(40),
		Isbn varchar(40),
		UserId integer(11),
		FOREIGN KEY (UserId) REFERENCES User(UserId)
	);
	
	/* Create Feedback table */
	/*create table Feedback(
		Feedback integer(11) AUTO_INCREMENT PRIMARY KEY,
		RecipeId integer(11) NOT NULL,
		UserId integer(11) NOT NULL,
		Vote integer(11),
		Comment varchar(200),
		LikeIt integer(1),
		FOREIGN KEY (RecipeId) REFERENCES Recipe(RecipeId),
		FOREIGN KEY (UserId) REFERENCES User(UserId)
	);*/
	
	/* Create Recipe table */
	create table if not exists Recipe (
		RecipeId integer(11) AUTO_INCREMENT PRIMARY KEY,
		Name varchar(50) NOT NULL,
		Nationality varchar (50),
		Region varchar(50),
		Difficulty double (3,2),
		Price varchar (20),
		Average double (3,2),
		PreparationTime int (3),
		CookingTime int (3),
		Nop int (2), /*Number of people*/
		Note varchar (500),
		UserId integer(11) NOT NULL,
		FOREIGN KEY (UserId) REFERENCES User(UserId)
	);
	
	/* Create Book table */
	create table if not exists Book(
		BookId integer(11) AUTO_INCREMENT PRIMARY KEY,
		Title varchar (50) NOT NULL,
		BookPDF blob NOT NULL,
		Note varchar(150)
	);
	
	/* Create ToCollect table*/
	create table if not exists ToCollect(
		RecipeGuideId integer(11) AUTO_INCREMENT PRIMARY KEY,
		RecipeId integer(11) NOT NULL,
		BookId integer(11) NOT NULL,
		FOREIGN KEY (RecipeId) REFERENCES Recipe(RecipeId),
		FOREIGN KEY (BookId) REFERENCES Book(BookId)
	);
	
	/* Create Ingredient table*/
	create table if not exists Ingredient(
		IngredientId integer(11) AUTO_INCREMENT PRIMARY KEY,
		Name varchar(50) NOT NULL,
		Origin varchar(50),
		Price varchar(20),
		Note varchar(100)
	);
	
	/* Create ToCompose table*/
	/*Standard unit for quantity is gr. */
	create table if not exists ToCompose(
		ToComposeId integer(11) AUTO_INCREMENT PRIMARY KEY,
		RecipeId integer(11) NOT NULL,
		IngredientId integer(11) NOT NULL,
		Quantity double(5,2) NOT NULL,
		Note varchar(150),
		FOREIGN KEY (RecipeId) REFERENCES Recipe(RecipeId),
		FOREIGN KEY (IngredientId) REFERENCES Ingredient(IngredientId)
	);
	
