# my-employee

## Create New Employee
Endpoint :
```bash
POST http://localhost:8080/api/employees
```
Example Request Payload JSON :
```bash
{
    "name": "Susan Random",
    "salary": 3980000,
    "gradeId": 3
}
``` 
Example cURL :
```bash
curl --location 'http://localhost:8080/api/employees' \
--header 'Content-Type: application/json' \
--data '{
    "name": "Susan Random",
    "salary": 3980000,
    "gradeId": 3
}'
```
Response :
```bash
{
    "id": 1,
    "name": "Susan Random",
    "salary": 3980000,
    "gradeId": 3,
    "totalBonus": 4099400
}
```
## Get Employee by ID
Endpoint :
```bash
GET http://localhost:8080/api/employees/1
```
Example cURL :
```bash
curl --location 'http://localhost:8080/api/employees/1'
```
Response :
```bash
{
    "id": 1,
    "name": "Susan Random",
    "salary": 3980000,
    "gradeId": 3,
    "totalBonus": 4099400
}
```
## Get All Employee
Endpoint :
```bash
GET http://localhost:8080/api/employees
```
Example cURL :
```bash
curl --location 'localhost:8080/api/employees'
```
Response :
```bash
[
    {
        "id": 1,
        "name": "Susan Random",
        "salary": 3980000,
        "gradeId": 3,
        "totalBonus": 4099400
    },
    {
        "id": 2,
        "name": "Jonah Bluesky",
        "salary": 7563000,
        "gradeId": 1,
        "totalBonus": 8319300
    },
    {
        "id": 3,
        "name": "Stevenson Black",
        "salary": 5124000,
        "gradeId": 2,
        "totalBonus": 5431440
    }
]
```
## Update Employee
Endpoint :
```bash
PUT http://localhost:8080/api/employees
```
Example Request Payload JSON :
```bash
{
    "name": "Sigit Nurhanafi",
    "salary": 3980000,
    "gradeId": 3
}
``` 
Example cURL :
```bash
curl --location --request PUT 'localhost:8080/api/employees/1' \
--header 'Content-Type: application/json' \
--data '{
    "name": "Sigit Nurhanafi",
    "salary": 3980000,
    "gradeId": 3
}'
```
Response :
```bash
{
    "id": 1,
    "name": "Sigit Nurhanafi",
    "salary": 3980000,
    "gradeId": 3,
    "totalBonus": 4099400
}
```
## Delete Employee
Endpoint :
```bash
DELETE http://localhost:8080/api/employees/1
```
Example cURL :
```bash
curl --location --request DELETE 'localhost:8080/api/employees/3'
```
Response :
```bash
{
    "message": "Entity Delete Successfuly"
}
```