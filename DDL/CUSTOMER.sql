/****** Object:  Table [kh184217].[Customer_]    Script Date: 5/10/2024 12:46:14 AM ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

CREATE TABLE [kh184217].[Customer_](
	[CustomerID] [int] NOT NULL,
	[Name] [varchar](100) NULL,
	[PhoneNumber] [varchar](15) NULL,
	[Address] [varchar](255) NULL,
PRIMARY KEY CLUSTERED 
(
	[CustomerID] ASC
)WITH (STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO

