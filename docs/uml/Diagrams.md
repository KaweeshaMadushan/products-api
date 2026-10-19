```mermaid
classDiagram
class Product {
  -Long id
  -String name
  -double price
  +Product()
  +Product(id: Long, name: String, price: double)
  +getId() Long
  +getName() String
  +getPrice() double
}

class Customer {
  -Long id
  -String name
  -String email
  -Address address
  +getId() Long
  +getName() String
  +getEmail() String
  +getAddress() Address
}

class Address {
  -String street
  -String city
  -String postcode
  +Address()
  +Address(street: String, city: String, postcode: String)
  +getStreet() String
  +getCity() String
  +getPostcode() String
}

