
public class Socket {
	private OnConnected oC = null;
	private OnDisconnected oD = null;
	private OnReceived oR = null;
	

	public OnConnected getoC() {
		return oC;
	}

	public void setoC(OnConnected oC) {
		this.oC = oC;
	}

	public OnDisconnected getoD() {
		return oD;
	}

	public void setoD(OnDisconnected oD) {
		this.oD = oD;
	}

	public OnReceived getoR() {
		return oR;
	}

	public void setoR(OnReceived oR) {
		this.oR = oR;
	}

	public void start(int port) {
		
	}
	
	public void stop() {
		
	}
	
	
}
