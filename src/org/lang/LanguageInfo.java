package org.lang;

public class LanguageInfo extends StateDetails {
public void tamilLanguage() {
	System.out.println("Tamil Language is speaks in Tamil Nadu");

}
public void englishLanguage() {
	System.out.println("English Language speaks in Foreign Countries");

}
public void hindiLanguage() {
	System.out.println("Hindi Language speaks in North Sides");

}
public static void main(String[] args) {
	LanguageInfo LI = new LanguageInfo();
	LI.tamilLanguage();
	LI.englishLanguage();
	LI.hindiLanguage();
	LI.southIndia();
	LI.northIndia();
}
}
