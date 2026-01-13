# Capability Schema API (Spring Boot + MongoDB)

## **Test in Postman**

**Base URL:** `http://localhost:8080/api/schema`

### **POST** 
    http://localhost:8080/api/schema

### Sample Payload JSON

```
{
  "capabilitySchema": "personal_details",
  "productName": "Tata",
  "version": "1.0",
  "fields": [
    {
      "key": "name",
      "label": "Full Name",
      "type": "text",
      "required": true
    },
    {
      "key": "phone",
      "label": "Mobile Number",
      "type": "tel",
      "required": true
    },
    {
      "key": "age",
      "label": "Age",
      "type": "number",
      "required": true
    },
    {
      "key": "email",
      "label": "Email",
      "type": "email",
      "required": true
    },
    {
      "key": "address1",
      "label": "Address Line 1",
      "type": "text",
      "required": true
    },
    {
      "key": "address2",
      "label": "Address Line 2",
      "type": "text",
      "required": false
    }
  ]
}

```

### **GET**
    http://localhost:8080/api/schema/Tata

