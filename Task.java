package com.sherry;

public class Task {
    private boolean is_done;
    private  String text;
    private User created_by;

    /**
     * Constructor for Task class with text that user enter to input his task and created by in which created person name come a
     is_done is give true or false..

     * @param text user enter about task
     * @param created_by name of creater
     * @param is_done true or false
     */
    public Task( String text, User created_by,boolean is_done) {
        this.text = text;
        this.created_by = created_by;
        this.is_done = is_done;
    }

    /**
     * setter for task is  done or not
     * @param is_done boolean true or false
     */
    public void setIs_done(boolean is_done) {
        this.is_done = is_done;
    }

    /**
     * shows task is done or not
     *
     * @return task done or not
     */
    public boolean getIs_done() {
        return is_done;
    }

    /**
     * text of task that what your task
     *
     * @param text task
     */
    public void setText(String text) {
        this.text = text;
    }

    /**
     * Get the task
     *
     * @return task
     */
    public String getText() {
        return text;
    }

    /**
     * creater by whom
     * @param created_by the name of creater
     */
    public void setCreated_by(User created_by) {
        this.created_by = created_by;
    }

    /**
     * get the name of task writer
     *
     * @return name of task writer
     */
    public User getCreated_by() {
        return created_by;
    }
}
