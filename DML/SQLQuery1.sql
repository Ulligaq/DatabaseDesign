USE ab240243e;


INSERT INTO kh184217.MOVIE (MovieID, Title, YEAR, Genre) VALUES (112, 'The Dark Crystal', 1982, 'Children');
INSERT INTO kh184217.MOVIE (MovieID, Title, YEAR, Genre) VALUES (113, 'A Nightmare On Elm Street 3: Dream Warriors', 1987, 'Horror');
INSERT INTO kh184217.MOVIE (MovieID, Title, YEAR, Genre) VALUES (114, 'Synecdoche, New York', 2008, 'Independent');
INSERT INTO kh184217.MOVIE (MovieID, Title, YEAR, Genre) VALUES (115, 'Jackie Brown', 1997, 'Drama');
INSERT INTO kh184217.MOVIE (MovieID, Title, YEAR, Genre) VALUES (117, 'RRR', 2022, 'Action');

INSERT INTO kh184217.STORE (StoreID, Owner, Address, Has_Cineplex) VALUES (442, 'Kenneth Hondl', '241 Gerbil Dr Portland OR', 'Yes'); 
INSERT INTO kh184217.STORE (StoreID, Owner, Address, Has_Cineplex) VALUES (443, 'Kenneth Hondl', '241 Didgeradoo Dr Dickinson ND', 'No'); 
INSERT INTO kh184217.STORE (StoreID, Owner, Address, Has_Cineplex) VALUES (444, 'Kenneth Hondl', '241 Sierra Madre Dr Cactus Forest AZ', 'No'); 
INSERT INTO kh184217.STORE (StoreID, Owner, Address, Has_Cineplex) VALUES (445, 'Kenneth Hondl', '243 Conozco Dr Seattle WA', 'No'); 

INSERT INTO kh184217.EMPLOYEE (EmployeeID, FirstName, LastName, Position, PhoneNumber, Address, HourlyPay, FavoriteMovie, StoreID) 
VALUES (331, 'Kenneth', 'Hondl', 'CEO', '555-555-5555', '333 Elm Street Missoula MT 59801', 0.0, 'Once Upon A Time In The West', 445);



INSERT INTO kh184217.EMPLOYEE (EmployeeID, FirstName, LastName, Position, PhoneNumber, Address, HourlyPay, FavoriteMovie, StoreID) 
VALUES (333, 'Kendall', 'Beck', 'Manager', '552-552-5552', '3433 Turtle Blvd Portland OR 59801', 25.0, 'Dazed And Confused', 442);



INSERT INTO kh184217.MEDIATYPE (MediaID, MovieID, Format, Distributer, AspectRatio, MPAA, Genre, RunTime) VALUES (221, 111, 'Blu-ray', 'Paramount Pictures', '2.35:1', 'PG-13', 'Western', 166);

INSERT INTO kh184217.LANGUAGES (MediaID, Language) Values (221, 'English');
INSERT INTO kh184217.LANGUAGES (MediaID, Language) Values (221, 'Spanish');
INSERT INTO kh184217.LANGUAGES (MediaID, Language) Values (221, 'Italian');
INSERT INTO kh184217.SUBTITLES (MediaID, Subtitle) Values (221, 'English');
INSERT INTO kh184217.SUBTITLES (MediaID, Subtitle) Values (221, 'Spanish');
INSERT INTO kh184217.SUBTITLES (MediaID, Subtitle) Values (221, 'Italian');

INSERT INTO kh184217.MEDIATYPE (MediaID, MovieID, Format, Distributer, AspectRatio, MPAA, Genre, RunTime) VALUES (222, 111, 'DVD', 'Paramount Pictures', '2.35:1', 'PG-13', 'Western', 166);

INSERT INTO kh184217.LANGUAGES (MediaID, Language) Values (222, 'English');
INSERT INTO kh184217.LANGUAGES (MediaID, Language) Values (222, 'Spanish');
INSERT INTO kh184217.LANGUAGES (MediaID, Language) Values (222, 'Italian');
INSERT INTO kh184217.SUBTITLES (MediaID, Subtitle) Values (222, 'English');
INSERT INTO kh184217.SUBTITLES (MediaID, Subtitle) Values (222, 'Spanish');
INSERT INTO kh184217.SUBTITLES (MediaID, Subtitle) Values (222, 'Italian');

INSERT INTO kh184217.MEDIATYPE (MediaID, MovieID, Format, Distributer, AspectRatio, MPAA, Genre, RunTime) VALUES (223, 113, 'Blu-ray', 'New Line Cinema', '2.35:1', 'R', 'Horror', 96);

INSERT INTO kh184217.LANGUAGES (MediaID, Language) Values (223, 'English');
INSERT INTO kh184217.LANGUAGES (MediaID, Language) Values (223, 'Spanish');
INSERT INTO kh184217.LANGUAGES (MediaID, Language) Values (223, 'French');
INSERT INTO kh184217.SUBTITLES (MediaID, Subtitle) Values (223, 'English');
INSERT INTO kh184217.SUBTITLES (MediaID, Subtitle) Values (223, 'Spanish');
INSERT INTO kh184217.SUBTITLES (MediaID, Subtitle) Values (223, 'French');

INSERT INTO kh184217.MEDIATYPE (MediaID, MovieID, Format, Distributer, AspectRatio, MPAA, Genre, RunTime) VALUES (224, 113, 'DVD', 'New Line Cinema', '2.35:1', 'R', 'Horror', 96);

INSERT INTO kh184217.LANGUAGES (MediaID, Language) Values (224, 'English');
INSERT INTO kh184217.LANGUAGES (MediaID, Language) Values (224, 'Spanish');
INSERT INTO kh184217.LANGUAGES (MediaID, Language) Values (224, 'French');
INSERT INTO kh184217.SUBTITLES (MediaID, Subtitle) Values (224, 'English');
INSERT INTO kh184217.SUBTITLES (MediaID, Subtitle) Values (224, 'Spanish');
INSERT INTO kh184217.SUBTITLES (MediaID, Subtitle) Values (224, 'French');

INSERT INTO kh184217.MEDIATYPE (MediaID, MovieID, Format, Distributer, AspectRatio, MPAA, Genre, RunTime) VALUES (225, 114, 'Blu-ray', 'Sony Classics', '2.35:1', 'R', 'Independent', 124);

INSERT INTO kh184217.LANGUAGES (MediaID, Language) Values (223, 'English');
INSERT INTO kh184217.SUBTITLES (MediaID, Subtitle) Values (223, 'English');