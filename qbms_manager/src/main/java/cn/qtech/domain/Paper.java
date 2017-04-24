package cn.qtech.domain;

import java.util.Date;

public class Paper {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column paper.paper_id
     *
     * @mbggenerated Sun Apr 23 15:59:52 CST 2017
     */
    private String paperId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column paper.user_id
     *
     * @mbggenerated Sun Apr 23 15:59:52 CST 2017
     */
    private String userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column paper.paper_category_id
     *
     * @mbggenerated Sun Apr 23 15:59:52 CST 2017
     */
    private String paperCategoryId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column paper.paper_difficulty_id
     *
     * @mbggenerated Sun Apr 23 15:59:52 CST 2017
     */
    private String paperDifficultyId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column paper.create_time
     *
     * @mbggenerated Sun Apr 23 15:59:52 CST 2017
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column paper.title
     *
     * @mbggenerated Sun Apr 23 15:59:52 CST 2017
     */
    private String title;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column paper.name
     *
     * @mbggenerated Sun Apr 23 15:59:52 CST 2017
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column paper.content
     *
     * @mbggenerated Sun Apr 23 15:59:52 CST 2017
     */
    private String content;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column paper.paper_id
     *
     * @return the value of paper.paper_id
     *
     * @mbggenerated Sun Apr 23 15:59:52 CST 2017
     */
    public String getPaperId() {
        return paperId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column paper.paper_id
     *
     * @param paperId the value for paper.paper_id
     *
     * @mbggenerated Sun Apr 23 15:59:52 CST 2017
     */
    public void setPaperId(String paperId) {
        this.paperId = paperId == null ? null : paperId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column paper.user_id
     *
     * @return the value of paper.user_id
     *
     * @mbggenerated Sun Apr 23 15:59:52 CST 2017
     */
    public String getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column paper.user_id
     *
     * @param userId the value for paper.user_id
     *
     * @mbggenerated Sun Apr 23 15:59:52 CST 2017
     */
    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column paper.paper_category_id
     *
     * @return the value of paper.paper_category_id
     *
     * @mbggenerated Sun Apr 23 15:59:52 CST 2017
     */
    public String getPaperCategoryId() {
        return paperCategoryId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column paper.paper_category_id
     *
     * @param paperCategoryId the value for paper.paper_category_id
     *
     * @mbggenerated Sun Apr 23 15:59:52 CST 2017
     */
    public void setPaperCategoryId(String paperCategoryId) {
        this.paperCategoryId = paperCategoryId == null ? null : paperCategoryId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column paper.paper_difficulty_id
     *
     * @return the value of paper.paper_difficulty_id
     *
     * @mbggenerated Sun Apr 23 15:59:52 CST 2017
     */
    public String getPaperDifficultyId() {
        return paperDifficultyId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column paper.paper_difficulty_id
     *
     * @param paperDifficultyId the value for paper.paper_difficulty_id
     *
     * @mbggenerated Sun Apr 23 15:59:52 CST 2017
     */
    public void setPaperDifficultyId(String paperDifficultyId) {
        this.paperDifficultyId = paperDifficultyId == null ? null : paperDifficultyId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column paper.create_time
     *
     * @return the value of paper.create_time
     *
     * @mbggenerated Sun Apr 23 15:59:52 CST 2017
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column paper.create_time
     *
     * @param createTime the value for paper.create_time
     *
     * @mbggenerated Sun Apr 23 15:59:52 CST 2017
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column paper.title
     *
     * @return the value of paper.title
     *
     * @mbggenerated Sun Apr 23 15:59:52 CST 2017
     */
    public String getTitle() {
        return title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column paper.title
     *
     * @param title the value for paper.title
     *
     * @mbggenerated Sun Apr 23 15:59:52 CST 2017
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column paper.name
     *
     * @return the value of paper.name
     *
     * @mbggenerated Sun Apr 23 15:59:52 CST 2017
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column paper.name
     *
     * @param name the value for paper.name
     *
     * @mbggenerated Sun Apr 23 15:59:52 CST 2017
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column paper.content
     *
     * @return the value of paper.content
     *
     * @mbggenerated Sun Apr 23 15:59:52 CST 2017
     */
    public String getContent() {
        return content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column paper.content
     *
     * @param content the value for paper.content
     *
     * @mbggenerated Sun Apr 23 15:59:52 CST 2017
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}