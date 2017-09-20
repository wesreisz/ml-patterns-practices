package com.wesleyreisz.ml.patternspractices;

public class Person {
    private int personId;
    private String jobDecription;

    public Person(int personId, String jobDecription) {
        this.personId = personId;
        this.jobDecription = jobDecription;
    }

    public int getPersonId() {
        return personId;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
    }

    public String getJobDecription() {
        return jobDecription;
    }

    public void setJobDecription(String jobDecription) {
        this.jobDecription = jobDecription;
    }

}
