
public class UserList {
	
	private OnUserAdded oUAdd = null;
	private OnUserRemoved oURemove = null;
	
	
	public OnUserAdded getoUAdd() {
		return oUAdd;
	}

	public void setoUAdd(OnUserAdded oUAdd) {
		this.oUAdd = oUAdd;
	}

	public OnUserRemoved getOURemove() {
		return oURemove;
	}

	public void setOURemove(OnUserRemoved ouRemove) {
		this.oURemove = ouRemove;
	}

	public void add(Object connection) {
		
	}

	public void remove(Object connection) {

	}

	
	
	

}
