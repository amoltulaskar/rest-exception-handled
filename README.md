# rest-helloworldexception
This is an example of how to handle exception and throw proper error message.

ant -Dproject.dir=D:\data\Share\github\rest-exception-handled -Dtomcat.path=D:\Other\apache-tomcat-7.0.55 -Dapp.name=helloworldexceptionhandled build-app

Run : http://localhost:8080/helloworldexceptionhandled/api/v1/helloworld
Output : {"error_message":"Bad method","error_code":101,"doc":"github/readme","error_id":"3fa54bb1-aa30-4d1f-9397-359e16a170b6"}