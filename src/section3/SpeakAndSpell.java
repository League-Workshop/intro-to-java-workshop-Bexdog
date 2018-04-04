package section3;

import javax.swing.JOptionPane;

import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;

public class SpeakAndSpell {

	public static void main(String[] args) {
		
for(int i=0; i<4; i++) {
String word = "mandlebrot";
	if(i==1) {word = "pizza";}
	else if (i==2) {word = "dumb";}
	else if (i==3) {word = "mouse";}
	speak("spell " + word);
	String input = JOptionPane.showInputDialog("");
		
if(input.equals(word)){speak("correct!");}
		
else speak("wrong");
}
	}

	static void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}


