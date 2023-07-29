# my-employee

## Create Create Employee
Endpoint :
```
POST http://localhost:8080/api/employees
```
Example Request Payload JSON :
```
{
    "name": "Susan Random",
    "salary": 3980000,
    "gradeId": 4
}
``` 
Example cURL :
```bash
curl --location 'http://localhost:8080/api/employees' \
--header 'Content-Type: application/json' \
--data '{
    "name": "Susan Random",
    "salary": 3980000,
    "gradeId": 4
}'
```
Response :
```
{
    "id": 1,
    "name": "Susan Random",
    "salary": 3980000,
    "gradeId": 3,
    "totalBonus": 3980000
}
```
