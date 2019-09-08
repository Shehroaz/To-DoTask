package com.sherry;

public class Person {
    String firstName;
    String lastName;

    /**
     * Constructor of person class
     */
    public Person(){}

    /**
     * Constructor of person class with first name and last name
     *
     * @param firstName first name of the person
     * @param lastName lasst name of the person
     * @throws InValidNameException InValid name exception
     */
    public Person(String firstName,String lastName)throws InValidNameException{
        this.setFirstName(firstName);
        this.setLastName(lastName);

    }

    /**
     * First name of the person
     *
     * @param firstName first name of the person
     * @throws InValidNameException InValid name exception
     */
    public void setFirstName(String firstName) throws InValidNameException {
        if(firstName.matches("^[a-zA-Z]*$")){
            this.firstName=firstName;
        }else {
            throw new InValidNameException("Name is not valid");
        }
    }

    /**
     * Get first name of the person
     *
     * @return first name of the person
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Last name of the person
     *
     * @param lastName last name of the person
     * @throws InValidNameException InValid name Exception
     */
    public void setLastName(String lastName) throws InValidNameException {
        if(lastName.matches("^[a-zA-Z]*$")){
            this.firstName=firstName;
        }else {
            throw new InValidNameException("Last name is not Valid");
        }
    }

    /**
     * Return Last Name
     *
     * @return Last name of the person
     */
    public String getLastName(){
        return lastName;
    }
}
