package action;

public class Ajax {
	private String uanme;
	private String msg;
	public String user(){
		return "user";
		
	}
	public String yanzheng(){
		String name = "����";
		if(uanme==name){
			msg="���û��Ѵ���";
		}else{
			msg="����ע��";
		}
		return "yanzheng";
	}
	public String yanzheng1(){
		
		return "yanzheng1";
		
	}
	public String getUanme() {
		return uanme;
	}
	public void setUanme(String uanme) {
		this.uanme = uanme;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}

}
