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
3. Calculate total Sales by City and Pet Kind
4. Calculate Average sales by City
