package com.example.socialmediaapp;

public class ModelPost {
    public ModelPost() {
    }

    String description;

    public String getDescription() {
        return description;
    }

    public String getPtime() {
        return ptime;
    }

    public String getTitle() {
        return title;
    }

    public String getUdp() {
        return udp;
    }

    public String getUemail() {
        return uemail;
    }

    public String getUid() {
        return uid;
    }

    public String getUimage() {
        return uimage;
    }

    public String getPlike() {
        return plike;
    }

    String pid;

    public String getPcomments() {
        return pcomments;
    }


    public ModelPost(String description, String pid, String ptime, String pcomments, String title, String udp, String uemail, String uid, String uimage, String uname, String plike) {
        this.description = description;
        this.pid = pid;
        this.ptime = ptime;
        this.pcomments = pcomments;
        this.title = title;
        this.udp = udp;
        this.uemail = uemail;
        this.uid = uid;
        this.uimage = uimage;
        this.uname = uname;
        this.plike = plike;
    }

    String ptime, pcomments;

    String title;

    String udp;
    String uemail;
    String uid;
    String uimage;

    String uname, plike;

}
