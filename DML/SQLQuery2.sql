

INSERT INTO kh184217.STORE (StoreID, Owner, Address, Has_Cineplex) VALUES (441, 'Kenneth Hondl', '241 Fernwood Dr Wasilla AK', 'Yes');

INSERT INTO kh184217.MOVIE (MovieID, Title, YEAR, Genre) VALUES (116, 'Videodrome', 1983, 'Horror');

INSERT INTO kh184217.MEDIATYPE (MediaID, MovieID, Format, Distributer, AspectRatio, MPAA, Genre, RunTime) VALUES (226, 116, 'UHD Blu-ray', 'Criterion Collection', '2.35:1', 'R', 'Horror', 88);

INSERT INTO kh184217.LANGUAGES (MediaID, Language) Values (226, 'English');
INSERT INTO kh184217.LANGUAGES (MediaID, Language) Values (226, 'Spanish');
INSERT INTO kh184217.LANGUAGES (MediaID, Language) Values (226, 'French');
INSERT INTO kh184217.SUBTITLES (MediaID, Subtitle) Values (226, 'English');
INSERT INTO kh184217.SUBTITLES (MediaID, Subtitle) Values (226, 'Spanish');
INSERT INTO kh184217.SUBTITLES (MediaID, Subtitle) Values (226, 'French');

INSERT INTO kh184217.MEDIATYPE (MediaID, MovieID, Format, Distributer, AspectRatio, MPAA, Genre, RunTime) VALUES (227, 116, 'Blu-ray', 'Criterion Collection', '2.35:1', 'R', 'Horror', 88);

INSERT INTO kh184217.LANGUAGES (MediaID, Language) Values (227, 'English');
INSERT INTO kh184217.LANGUAGES (MediaID, Language) Values (227, 'Spanish');
INSERT INTO kh184217.LANGUAGES (MediaID, Language) Values (227, 'French');
INSERT INTO kh184217.SUBTITLES (MediaID, Subtitle) Values (227, 'English');
INSERT INTO kh184217.SUBTITLES (MediaID, Subtitle) Values (227, 'Spanish');
INSERT INTO kh184217.SUBTITLES (MediaID, Subtitle) Values (227, 'French');

INSERT INTO kh184217.MEDIATYPE (MediaID, MovieID, Format, Distributer, AspectRatio, MPAA, Genre, RunTime) VALUES (228, 116, 'DVD', 'Criterion Collection', '2.35:1', 'R', 'Horror', 88);

INSERT INTO kh184217.LANGUAGES (MediaID, Language) Values (228, 'English');
INSERT INTO kh184217.LANGUAGES (MediaID, Language) Values (228, 'Spanish');
INSERT INTO kh184217.LANGUAGES (MediaID, Language) Values (228, 'French');
INSERT INTO kh184217.SUBTITLES (MediaID, Subtitle) Values (228, 'English');
INSERT INTO kh184217.SUBTITLES (MediaID, Subtitle) Values (228, 'Spanish');
INSERT INTO kh184217.SUBTITLES (MediaID, Subtitle) Values (228, 'French');

INSERT INTO kh184217.MEDIATYPE (MediaID, MovieID, Format, Distributer, AspectRatio, MPAA, Genre, RunTime) VALUES (229, 116, 'VHS', 'Universal Pictures', '4:3', 'R', 'Horror', 88);

INSERT INTO kh184217.LANGUAGES (MediaID, Language) Values (229, 'English');

INSERT INTO kh184217.EMPLOYEE (EmployeeID, FirstName, LastName, Position, PhoneNumber, Address, HourlyPay, FavoriteMovie, StoreID) 
VALUES (332, 'Sterling', 'Beck', 'Manager', '551-551-5551', '3431 Berkshire Street Wasilla AK 99654', 25.0, 'Memories Of Murder', 441);

INSERT INTO kh184217.EMPLOYEE (EmployeeID, FirstName, LastName, Position, PhoneNumber, Address, HourlyPay, FavoriteMovie, StoreID) 
VALUES (334, 'Rain', 'Hastings', 'Clerk', '155-545-5552', '333 Gurgle Gog Portland OR 59801', 17.50, 'Tampopo', 441);

INSERT INTO kh184217.EMPLOYEE (EmployeeID, FirstName, LastName, Position, PhoneNumber, Address, HourlyPay, FavoriteMovie, StoreID) 
VALUES (335, 'Brandon', 'Murak', 'Clerk', '525-355-5755', '233 Tootles Ave Missoula MT 59801', 17.50, 'Uncut Gems', 441);

INSERT INTO kh184217.Customer_ (CustomerID, Name, PhoneNumber, Address) 
VALUES (539, 'Dirty Douglas', '732-523-6161', '777 Tutlage Dr England Ireland');

INSERT INTO kh184217.Membership_ (MembershipID, CustomerID, MembershipLVL, FreeMovies, Discount)
VALUES (121, 539, 'Master', 10, 20);

INSERT INTO kh184217.WISHLIST (WishlistID, CustomerID, TITLE, YEAR)
VALUES (1, 539, 'Videodrome', 1983)

INSERT INTO kh184217.WISHLIST (WishlistID, CustomerID, TITLE, YEAR)
VALUES (2, 539, 'Salo, Or The 120 Days Of Sodom', 1975)

INSERT INTO kh184217.WISHLIST (WishlistID, CustomerID, TITLE, YEAR)
VALUES (3, 539, 'Enter The Void', 2009)

INSERT INTO kh184217.WISHLIST (WishlistID, CustomerID, TITLE, YEAR)
VALUES (4, 539, 'El Topo', 1970)

INSERT INTO kh184217.WISHLIST (WishlistID, CustomerID, TITLE, YEAR)
VALUES (5, 539, 'Escape From The Planet Of The Apes', 1971)

INSERT INTO kh184217.RENTED (CustomerID, EmployeeID, MediaID, Title, DueDate, OverDue)
VALUES (539, 335, 226, 'Videodrome', '2024-03-15', 1);












INSERT INTO kh184217.Customer_ (CustomerID, Name, PhoneNumber, Address) 
VALUES (536, 'Earl Grey', '345-123-4356', '414 Suck Circle Zimbabwe Australia');

INSERT INTO kh184217.Customer_ (CustomerID, Name, PhoneNumber, Address) 
VALUES (537, 'Tyrone Slothrop', '425-235-2634', '666 Evil Dr Lust Hell');

INSERT INTO kh184217.Customer_ (CustomerID, Name, PhoneNumber, Address) 
VALUES (538, 'Tracy Hall', '415-453-6391', '777 Heaven Ave Beauty Palace');

INSERT INTO kh184217.Customer_ (CustomerID, Name, PhoneNumber, Address) 
VALUES (540, 'David Lynch', '527-234-5643', '5171 Oh No Ave New York NY');

INSERT INTO kh184217.Customer_ (CustomerID, Name, PhoneNumber, Address) 
VALUES (541, 'GOO GOO GAGA', '696-9696-9696', 'XXX XXXX XXXX');

INSERT INTO kh184217.Customer_ (CustomerID, Name, PhoneNumber, Address) 
VALUES (542, 'Lillian LoveLace', '426-775-2467', 'I AM IN HELL PLEASE HELP');