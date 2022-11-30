# password-manager-using-java
simple password manager as mini project written in java and framework used javafx.

DISCLAIMER: This is not a true password manager and has ZERO security features. Do NOT use it to store any passwords.
## Prerequisites
Java, OOP, MVC architecture, and JavaFX, to list a few.
## How this project works
This project uses the MVC software design pattern. The FXML files are the views, which are controlled by separate controller classes. There is one main model that stores all the user and account information. The "database" is simulated with .txt files, which the model reads when a user logs in or writes to when new users or internet accounts are added.
### Login window
When you launch the application, you will first see the login window. You can type your username and password to login, or register a new user.
<p align="center">
<img src="https://github.com/nagdamanan/password-manager-usding-java/blob/main/PM/password%20manager/scrnshts/Login%20Window.png?raw=true" width=25%>
</p>

### Register window
When you register a new user with a username that already exists, you will get an error. Be sure to choose a unique username! You will also have to type the password twice indentically.
<p align="center">
<img src="https://github.com/nagdamanan/password-manager-usding-java/blob/main/PM/password%20manager/scrnshts/Register%20window.png?raw=true" width=25%>
</p>

### Main window
After logging in, you will reach the main window where all the passwords are stored. You can click on the buttons to copy the username and passwords. Lots of work can be done here, so be creative!
<p align="center">
<img src="https://github.com/nagdamanan/password-manager-usding-java/blob/main/PM/password%20manager/scrnshts/Main%20Window.png?raw=true" width=50%>
</p>
