package cn.qtech.domain;

public class SubjectWithBLOBs extends Subject {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column subject.content
     *
     * @mbggenerated Thu Mar 23 17:14:14 CST 2017
     */
    private String content;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column subject.answer
     *
     * @mbggenerated Thu Mar 23 17:14:14 CST 2017
     */
    private String answer;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column subject.content
     *
     * @return the value of subject.content
     *
     * @mbggenerated Thu Mar 23 17:14:14 CST 2017
     */
    public String getContent() {
        return content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column subject.content
     *
     * @param content the value for subject.content
     *
     * @mbggenerated Thu Mar 23 17:14:14 CST 2017
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column subject.answer
     *
     * @return the value of subject.answer
     *
     * @mbggenerated Thu Mar 23 17:14:14 CST 2017
     */
    public String getAnswer() {
        return answer;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column subject.answer
     *
     * @param answer the value for subject.answer
     *
     * @mbggenerated Thu Mar 23 17:14:14 CST 2017
     */
    public void setAnswer(String answer) {
        this.answer = answer == null ? null : answer.trim();
    }
}