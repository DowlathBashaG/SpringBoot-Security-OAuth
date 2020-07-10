# SpringBoot-Security-OAuth

## OAuth2:
  
   - OAuth is open standard for access delegation
   
   - OAuth provides to clients a "secure delegated access" to server resourcces on behalf of a resource owner
   
   - OAuth2 is more of a framework than a defined protocol


- spring-security-client - Client Project which has the UI

- spring-security-auth-server - Has the Authorization Server and Resource Server

- http://localhost:9002/ui - REST end point for UI which will take you to the secure URI http://localhost:9002/secure after logging into the auth server http://localhost:9001/auth/login
