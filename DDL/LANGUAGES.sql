/****** Object:  Table [kh184217].[LANGUAGES]    Script Date: 5/10/2024 12:48:02 AM ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

CREATE TABLE [kh184217].[LANGUAGES](
	[MediaID] [int] NOT NULL,
	[Language] [varchar](50) NULL
) ON [PRIMARY]
GO

ALTER TABLE [kh184217].[LANGUAGES]  WITH CHECK ADD FOREIGN KEY([MediaID])
REFERENCES [kh184217].[MEDIATYPE] ([MediaID])
GO

