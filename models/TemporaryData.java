package com.medium.threadexample.models;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "temporarytable")
public class TemporaryData {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String content;

    @Column
    private Date insertTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getInsertTime() {
        return insertTime;
    }

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }

    @Override
    public String toString() {
        return "TemporaryData{" +
                "id=" + id +
                ", content='" + content + '\'' +
                ", insertTime=" + insertTime +
                '}';
    }
}
