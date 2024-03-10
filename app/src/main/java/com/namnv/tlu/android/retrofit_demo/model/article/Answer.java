package com.namnv.tlu.android.retrofit_demo.model.article;


import java.util.Date;

/*
* https://api.stackexchange.com/2.3/answers?page=1&order=desc&sort=activity&site=stackoverflow
* "items": [
    {
      "owner": {
        "account_id": 20550088,
        "reputation": 1,
        "user_id": 15082998,
        "user_type": "registered",
        "profile_image": "https://lh3.googleusercontent.com/a-/AOh14GiJe6JQDOimMG36jFX03j0dR4dg2hO4QUlWYGwH7g=k-s256",
        "display_name": "Ross McMorrow",
        "link": "https://stackoverflow.com/users/15082998/ross-mcmorrow"
      },
      "is_accepted": false,
      "score": -1,
      "last_activity_date": 1708883621,
      "last_edit_date": 1708883621,
      "creation_date": 1708867742,
      "answer_id": 78056119,
      "question_id": 37807308,
      "content_license": "CC BY-SA 4.0"
    },*/
public class Answer {
    private Owner owner;
    private boolean is_accepted;
    private Integer score;
    private Date last_activity_date;
    private Date last_edit_date;

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public boolean isIs_accepted() {
        return is_accepted;
    }

    public void setIs_accepted(boolean is_accepted) {
        this.is_accepted = is_accepted;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public Date getLast_activity_date() {
        return last_activity_date;
    }

    public void setLast_activity_date(Date last_activity_date) {
        this.last_activity_date = last_activity_date;
    }

    public Date getLast_edit_date() {
        return last_edit_date;
    }

    public void setLast_edit_date(Date last_edit_date) {
        this.last_edit_date = last_edit_date;
    }

    public Date getCreation_date() {
        return creation_date;
    }

    public void setCreation_date(Date creation_date) {
        this.creation_date = creation_date;
    }

    public Integer getAnswer_id() {
        return answer_id;
    }

    public void setAnswer_id(Integer answer_id) {
        this.answer_id = answer_id;
    }

    public Integer getQuestion_id() {
        return question_id;
    }

    public void setQuestion_id(Integer question_id) {
        this.question_id = question_id;
    }

    public String getContent_license() {
        return content_license;
    }

    public void setContent_license(String content_license) {
        this.content_license = content_license;
    }

    private Date creation_date;
    private Integer answer_id;
    private Integer question_id;
    private String content_license;
}

