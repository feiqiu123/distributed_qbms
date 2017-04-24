package cn.qtech.domain;

import java.util.Date;

public class UserPaper {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_paper.id
     *
     * @mbggenerated Sun Apr 23 13:54:05 CST 2017
     */
    private String id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_paper.user_id
     *
     * @mbggenerated Sun Apr 23 13:54:05 CST 2017
     */
    private String userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_paper.status
     *
     * @mbggenerated Sun Apr 23 13:54:05 CST 2017
     */
    private Integer status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_paper.name
     *
     * @mbggenerated Sun Apr 23 13:54:05 CST 2017
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_paper.title
     *
     * @mbggenerated Sun Apr 23 13:54:05 CST 2017
     */
    private String title;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_paper.start_time
     *
     * @mbggenerated Sun Apr 23 13:54:05 CST 2017
     */
    private Date startTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_paper.total_time
     *
     * @mbggenerated Sun Apr 23 13:54:05 CST 2017
     */
    private Integer totalTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_paper.score
     *
     * @mbggenerated Sun Apr 23 13:54:05 CST 2017
     */
    private Integer score;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_paper.paper_id
     *
     * @mbggenerated Sun Apr 23 13:54:05 CST 2017
     */
    private String paperId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_paper.manager_id
     *
     * @mbggenerated Sun Apr 23 13:54:05 CST 2017
     */
    private String managerId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_paper.content
     *
     * @mbggenerated Sun Apr 23 13:54:05 CST 2017
     */
    private String content;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_paper.id
     *
     * @return the value of user_paper.id
     *
     * @mbggenerated Sun Apr 23 13:54:05 CST 2017
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_paper.id
     *
     * @param id the value for user_paper.id
     *
     * @mbggenerated Sun Apr 23 13:54:05 CST 2017
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_paper.user_id
     *
     * @return the value of user_paper.user_id
     *
     * @mbggenerated Sun Apr 23 13:54:05 CST 2017
     */
    public String getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_paper.user_id
     *
     * @param userId the value for user_paper.user_id
     *
     * @mbggenerated Sun Apr 23 13:54:05 CST 2017
     */
    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_paper.status
     *
     * @return the value of user_paper.status
     *
     * @mbggenerated Sun Apr 23 13:54:05 CST 2017
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_paper.status
     *
     * @param status the value for user_paper.status
     *
     * @mbggenerated Sun Apr 23 13:54:05 CST 2017
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_paper.name
     *
     * @return the value of user_paper.name
     *
     * @mbggenerated Sun Apr 23 13:54:05 CST 2017
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_paper.name
     *
     * @param name the value for user_paper.name
     *
     * @mbggenerated Sun Apr 23 13:54:05 CST 2017
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_paper.title
     *
     * @return the value of user_paper.title
     *
     * @mbggenerated Sun Apr 23 13:54:05 CST 2017
     */
    public String getTitle() {
        return title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_paper.title
     *
     * @param title the value for user_paper.title
     *
     * @mbggenerated Sun Apr 23 13:54:05 CST 2017
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_paper.start_time
     *
     * @return the value of user_paper.start_time
     *
     * @mbggenerated Sun Apr 23 13:54:05 CST 2017
     */
    public Date getStartTime() {
        return startTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_paper.start_time
     *
     * @param startTime the value for user_paper.start_time
     *
     * @mbggenerated Sun Apr 23 13:54:05 CST 2017
     */
    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_paper.total_time
     *
     * @return the value of user_paper.total_time
     *
     * @mbggenerated Sun Apr 23 13:54:05 CST 2017
     */
    public Integer getTotalTime() {
        return totalTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_paper.total_time
     *
     * @param totalTime the value for user_paper.total_time
     *
     * @mbggenerated Sun Apr 23 13:54:05 CST 2017
     */
    public void setTotalTime(Integer totalTime) {
        this.totalTime = totalTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_paper.score
     *
     * @return the value of user_paper.score
     *
     * @mbggenerated Sun Apr 23 13:54:05 CST 2017
     */
    public Integer getScore() {
        return score;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_paper.score
     *
     * @param score the value for user_paper.score
     *
     * @mbggenerated Sun Apr 23 13:54:05 CST 2017
     */
    public void setScore(Integer score) {
        this.score = score;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_paper.paper_id
     *
     * @return the value of user_paper.paper_id
     *
     * @mbggenerated Sun Apr 23 13:54:05 CST 2017
     */
    public String getPaperId() {
        return paperId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_paper.paper_id
     *
     * @param paperId the value for user_paper.paper_id
     *
     * @mbggenerated Sun Apr 23 13:54:05 CST 2017
     */
    public void setPaperId(String paperId) {
        this.paperId = paperId == null ? null : paperId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_paper.manager_id
     *
     * @return the value of user_paper.manager_id
     *
     * @mbggenerated Sun Apr 23 13:54:05 CST 2017
     */
    public String getManagerId() {
        return managerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_paper.manager_id
     *
     * @param managerId the value for user_paper.manager_id
     *
     * @mbggenerated Sun Apr 23 13:54:05 CST 2017
     */
    public void setManagerId(String managerId) {
        this.managerId = managerId == null ? null : managerId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_paper.content
     *
     * @return the value of user_paper.content
     *
     * @mbggenerated Sun Apr 23 13:54:05 CST 2017
     */
    public String getContent() {
        return content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_paper.content
     *
     * @param content the value for user_paper.content
     *
     * @mbggenerated Sun Apr 23 13:54:05 CST 2017
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}