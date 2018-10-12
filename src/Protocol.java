import com.sun.xml.internal.ws.api.message.Packet;

public class Protocol {
	private Socket socket = new Socket();
	private UserList userlist = new UserList();
	private ConnectionList connectionList = new ConnectionList();	
	
	
	private void spAskUserId(Object connection) {
		
	}
	
	private void spUserOut(Object connection) {
		
	}
	
	private void spAskPassword(Object connection) {
		
	}
	
	
	public Protocol() {
		userlist.setoUAdd(new OnUserAdded() {
			@Override
			public void onUserAdded(Object user) {
				
			}
		});
		userlist.setOURemove(new OnUserRemoved() {
			@Override
			public void onUserRemoved(Object user) {
				spUserOut(user);
			}
		});
		
		socket.setoC(new OnConnected() {
			@Override
			public void onConnected(Object connection) {
				connectionList.add(connection);
				spAskUserId(connection);
				
			}
		});
		socket.setoD(new OnDisconnected() {
			@Override
			public void onDisconnected(Object connection) {
				connectionList.remove(connection);
				userlist.remove(connection);
				
			}
		});
		socket.setoR(new OnReceived() {
			@Override
			public void onReceived(Object connection, int packetType, Object data) {
				switch (packetType) {
				case PacketType.ptUserId: {
					//connection.userId = ...
					spAskPassword(connection);
					break;
				}
				
				
				case PacketType.ptAskPassword:{
					//·Î±×ÀÎ 
					break;
				}
				case PacketType.ptChat:{
					//
					break;
				}
				case PacketType
					
				}
				
			}
		});
	}
	
	
}	
