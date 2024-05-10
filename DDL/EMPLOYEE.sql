/****** Object:  Table [kh184217].[EMPLOYEE]    Script Date: 5/10/2024 12:46:51 AM ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

CREATE TABLE [kh184217].[EMPLOYEE](
	[EmployeeID] [int] NOT NULL,
	[FirstName] [varchar](50) NULL,
	[LastName] [varchar](50) NULL,
	[Position] [varchar](50) NULL,
	[PhoneNumber] [varchar](15) NULL,
	[Address] [varchar](255) NULL,
	[HourlyPay] [decimal](10, 2) NULL,
	[FavoriteMovie] [varchar](100) NULL,
	[StoreID] [int] NULL,
PRIMARY KEY CLUSTERED 
(
	[EmployeeID] ASC
)WITH (STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO

ALTER TABLE [kh184217].[EMPLOYEE]  WITH CHECK ADD  CONSTRAINT [FK_Employee_Store] FOREIGN KEY([StoreID])
REFERENCES [kh184217].[STORE] ([StoreID])
GO

ALTER TABLE [kh184217].[EMPLOYEE] CHECK CONSTRAINT [FK_Employee_Store]
GO

