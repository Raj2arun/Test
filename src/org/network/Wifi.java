package org.network;

public class Wifi {
private void wifiName() {
	// TODO Auto-generated method stub
System.out.println("free access");
}
public static void main(String[] args) {
	Wifi w = new Wifi();
	MobileData md = new MobileData();
	Lan l = new Lan();
	Wireless ws = new Wireless();
	w.wifiName();
	md.dataName();
	l.lanName();
	ws.modamName();
		
}
}
