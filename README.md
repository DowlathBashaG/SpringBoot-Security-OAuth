# SpringBoot-Security-OAuth

## OAuth2:
  
   - OAuth is open standard for access delegation
   
   - OAuth provides to clients a "secure delegated access" to server resourcces on behalf of a resource owner
   
   - OAuth2 is more of a framework than a defined protocol
   
## OAuth2 Architecture

![Oauth-architecture](https://user-images.githubusercontent.com/9671419/87207691-24b36200-c32a-11ea-8895-dc3026d5e0a5.png)

- CITI BANK ( CLIENT )  /  FACEBOOK (AUTHORIZATION SERVER)

![CITI-FACEb](https://user-images.githubusercontent.com/9671419/87207692-254bf880-c32a-11ea-9a4e-800a8838b0fa.JPG)

![oauthar](https://user-images.githubusercontent.com/9671419/87207688-241acb80-c32a-11ea-9c37-a60d5c1c8128.JPG)

- spring-security-client - Client Project which has the UI

- spring-security-auth-server - Has the Authorization Server and Resource Server

- http://localhost:9002/ui - REST end point for UI which will take you to the secure URI http://localhost:9002/secure after logging into the auth server http://localhost:9001/auth/login
