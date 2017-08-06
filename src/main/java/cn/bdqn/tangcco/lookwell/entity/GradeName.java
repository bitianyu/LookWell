package cn.bdqn.tangcco.lookwell.entity;

/**
 * 实体类：班级名称自动生成
 *
 */
public class GradeName {
    private Integer granamId;       //班级名称id

    private Integer maxNum;         //最大编号

    private  Grade grade;           //外键：班级id

    public Integer getGranamId() {
        return granamId;
    }

    public void setGranamId(Integer granamId) {
        this.granamId = granamId;
    }

    public Integer getMaxNum() {
        return maxNum;
    }

    public void setMaxNum(Integer maxNum) {
        this.maxNum = maxNum;
    }

    public Grade getGrade() {
        return grade;
    }

    public void setGrade(Grade grade) {
        this.grade = grade;
    }

    public GradeName() {
    }

    @Override
    public String toString() {
        return "GradeName{" +
                "granamId=" + granamId +
                ", maxNum=" + maxNum +
                ", grade=" + grade +
                '}';
    }
}