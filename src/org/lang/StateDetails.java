package org.lang;

public class StateDetails {
public void southIndia() {
	System.out.println("SouthIndia have Tamilnadu and kerala");

}
public void northIndia() {
	System.out.println("NorthIndia have Delhi and kashmir");
}
public static void main(String[] args) {
	StateDetails SD = new StateDetails();
	SD.southIndia();
	SD.northIndia();
}
}
