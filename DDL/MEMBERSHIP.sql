/****** Object:  Table [kh184217].[Membership_]    Script Date: 5/10/2024 12:48:39 AM ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

CREATE TABLE [kh184217].[Membership_](
	[MembershipID] [int] NOT NULL,
	[CustomerID] [int] NULL,
	[MembershipLVL] [varchar](20) NULL,
	[FreeMovies] [int] NULL,
	[Discount] [decimal](5, 2) NULL,
PRIMARY KEY CLUSTERED 
(
	[MembershipID] ASC
)WITH (STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO

ALTER TABLE [kh184217].[Membership_]  WITH CHECK ADD  CONSTRAINT [FK_Membership_Customer_] FOREIGN KEY([CustomerID])
REFERENCES [kh184217].[Customer_] ([CustomerID])
GO

ALTER TABLE [kh184217].[Membership_] CHECK CONSTRAINT [FK_Membership_Customer_]
GO

ALTER TABLE [kh184217].[Membership_]  WITH CHECK ADD CHECK  (([MembershipLVL]='Master' OR [MembershipLVL]='Pro' OR [MembershipLVL]='Basic'))
GO

ALTER TABLE [kh184217].[Membership_]  WITH CHECK ADD CHECK  (([MembershipLVL]='Basic' AND [FreeMovies]=(0) AND [Discount]=(0) OR [MembershipLVL]='Pro' AND [FreeMovies]<=(5) AND [Discount]=(10) OR [MembershipLVL]='Master' AND [FreeMovies]<=(10) AND [Discount]=(20)))
GO

