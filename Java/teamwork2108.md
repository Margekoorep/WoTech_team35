These are the questions Team 35 asked and found answers to: 
How many diferent type of pets there are?
```
SELECT kind, COUNT(*) AS Count 
FROM Pets 
GROUP BY Kind
ORDER BY Count DESC;
```
What is the most populaar pet name? 
```
SELECT Name, COUNT(*) AS Count 
FROM Pets 
GROUP BY Name
ORDER BY Count DESC;
```
What is most common pet age?

```
SELECT Age, COUNT(*) AS Count
FROM Pets
GROUP BY Age
ORDER BY Count DESC
LIMIT 1;
```
What are the top 3 longest pet names?
```
SELECT *
FROM Pets 
ORDER BY LENGTH(Name) DESC
LIMIT 3;
``` 
What is the biggest number of pets an owner has? 
```
SELECT OwnerID, COUNT(*) AS PetCount
FROM Pets
GROUP BY OwnerID
ORDER BY PetCount DESC
LIMIT 1;
```
What is the avarage age of the previous owners pets? 
```
SELECT AVG(Age) AS AverageAge
FROM Pets
WHERE OwnerID = 4782;
```
In wihitch area there are the most pets?
```
SELECT ZipCode, COUNT(*) AS ZipCode
FROM Owners
GROUP BY ZipCode
ORDER BY ZipCode DESC
LIMIT 1;
```
Most owners (110) are in the area with the ZipCode 48075:
