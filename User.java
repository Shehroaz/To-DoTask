package com.sherry;

public class User extends Person {
    private String userName;
    private String password;

    /**
     * Constructor for user class
     */
    public User(){}

    public User(String firstName,String lastName,String userName,String password) throws InValidNameException {
        super(firstName,lastName);
        this.setUserName(userName);
        this.setPassword(password);

    }

    /**
     * UserName of the user
     *
     * @param userName username of the user
     * @throws InValidNameException InValid name Exception
     */
    public void setUserName(String userName) throws InValidNameException {
        if(userName.matches("^[\\w\\d]{4,}$")){
            this.userName=userName;
        }else{
            throw new InValidNameException("InValid username Exception");
        }
    }

    /**
     * Get username of the user
     *
     * @return username of the user
     */
    public String getUserName() {
        return userName;
    }

    /**
     * password of the user
     *
     * @param password password of the userr
     * @throws InValidNameException Invalid password exception
     */
    public void setPassword(String password) throws InValidNameException {
        if(password.matches("^.{5,}$")){
            this.password=password;
        }else{
            throw new InValidNameException("InValid password length");
        }
    }

    /**
     * password of the user
     *
     * @return password of the user
     */
    public String getPassword() {
        return password;
    }
}
