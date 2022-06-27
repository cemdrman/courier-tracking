IF NOT EXISTS(SELECT * FROM sys.databases WHERE name = 'CourierTracking')
  BEGIN
    CREATE DATABASE [CourierTracking]
  END
    GO
       USE [CourierTracking]
    GO