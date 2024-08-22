1. Calculate total Sales by City
```sql
SELECT Owners.City, SUM(Procedures.Price) AS TotalSales
FROM Sales
LEFT JOIN Procedures ON Sales.ProcedureCode = Procedures.ProcedureCode
LEFT JOIN Pets ON Sales.PetID = Pets.PetID
LEFT JOIN Owners ON Pets.OwnerID = Owners.OwnerID
GROUP BY Owners.City
ORDER BY TotalSales DESC;
```
2. Calculate total Sales by Pet Kind
```sql
SELECT Pets.Kind, SUM(Procedures.Price) AS TotalSales
FROM Pets
JOIN Sales 
ON Pets.PetID = Sales.PetID
JOIN Procedures 
ON Sales.ProcedureCode = Procedures.ProcedureCode
GROUP BY Pets.Kind
ORDER by TotalSales Desc;
```
4. Calculate total Sales by City and Pet Kind
```sql
SELECT Owners.City, Pets.Kind,  SUM(Procedures.Price) AS TotalSales
FROM Owners
JOIN Pets ON Pets.OwnerID = Owners.OwnerID
JOIN Sales ON Pets.PetID = Sales.PetID
Join Procedures ON Sales.ProcedureCode =Procedures.ProcedureCode
GROUP BY Owners.City, Pets.Kind
ORDER by TotalSales Desc;
```
6. Calculate Average sales by City
```sql
SELECT Owners.City, AVG(Procedures.Price) AS AverageSales
FROM Sales
JOIN Procedures ON Sales.ProcedureCode = Procedures.ProcedureCode
JOIN Pets ON Sales.PetID = Pets.PetID
JOIN Owners ON Pets.OwnerID = Owners.OwnerID
GROUP BY Owners.City
ORDER BY AverageSales DESC;
```
