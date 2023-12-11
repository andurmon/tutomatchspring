package com.tutomatch.demo.Models;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

@Document("student")
public class Student {

    @MongoId
    ObjectId id;

    String educationLevel;

    public Student(ObjectId id, String educationLevel) {
        this.id = id;
        this.educationLevel = educationLevel;
    }

    public Student(String educationLevel) {
        this.educationLevel = educationLevel;
    }

    public String getEducationLevel() {
        return educationLevel;
    }

    public void setEducationLevel(String educationLevel) {
        this.educationLevel = educationLevel;
    }

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", educationLevel='" + educationLevel + '\'' +
                '}';
    }

}
