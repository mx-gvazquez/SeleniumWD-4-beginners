# SeleniumWD-4-beginners

## Section 1

### App under Test

http://the-internet.herokuapp.com/

## Section 2

Config of IntelliJ using Maven POM file
- TestNG
- Selenium
- https://github.com/dimashyshkin
- https://github.com/dimashyshkin/Selenium-WebDriver-with-Java-for-beginners

## Section 3

### 3.10 Test Case #1

- Enter http://the-internet.herokuapp.com/ 
- Click on `Form Authentication`
- Enter `tomsmith` for the username.
- Enter `SuperSecretPassword!` for the password
- Click `Login`
- Validate messages:
  - `You logged into a secure area!`
  - `Secure Area`
  - `Welcome to the Secure Area.`
- Click on `Logout`
  - Validate message `You logged out of the secure area!`

### 3.10 Naming Conventions

`Package`

Naming convention on Packages. Reverse SUT HTML address
`com.herokuapp.theinternet`
---

`Classes`

On creating classes on Maven Project, under `src/test/java` 
the name should include the word `Test` or `Tests` for Maven to undestand this is
a TEST class.

CamelCase, each first letter must be UPPERCASE.
`PositiveTests`
---
`methods`

Inside classes, methods can be named starting LOWER case.
Next words can start UPPER case.
`loginTest`



### WebDriver since Selenium 4.6

Selenium automatically detects Browser version, and updates the WebDriver.




### Neckst

Neckst