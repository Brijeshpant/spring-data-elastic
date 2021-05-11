
PUT customer/_doc/1
{
  "name" :"brij",
  "dob": "1988-01-01 00:00:00",
  "email": "brij@gmail.com",
  "addresses": [
    {
      "city": "Pune",
      "state": "Maharashtra"
    }
  ]
}

......................

PUT customer/_doc/2
{
  "name" :"bp",
  "dob": "1988-02-01 00:00:00",
  "email": "bp@gmail.com",
  "addresses": [
    {
      "city": "Noida",
      "state": "UP"
    }
  ]
}