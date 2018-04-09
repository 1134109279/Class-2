package bean;

import java.util.List;

public class Party {
    private String topic;//主题
    private List members;//成员

    public Party(String topic){
        this.topic = topic;
    }
    public void printInfo(){
        if (members!=null){
            System.out.print(topic+"参与人数:"+members.size());
            for(Object o:members){
                System.out.print("\t"+o);
            }
        }else {
            System.out.print(topic+"参与人数:暂无");
        }
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public List getMembers() {
        return members;
    }

    public void setMembers(List members) {
        this.members = members;
    }
}
