package com.example.powerfit;

public class User {
    private String uname;
    private String emailid;
    private String passwd;

    public User(String uname, String emailid, String passwd) {
        this.uname = uname;
        this.emailid = emailid;
        this.passwd = passwd;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getEmailid() {
        return emailid;
    }

    public void setEmailid(String emailid) {
        this.emailid = emailid;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }
}
