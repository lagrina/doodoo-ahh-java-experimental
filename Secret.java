package bwiset;

import java.util.Base64;

public class Secret {
	private String name;
	private String initial;

	public Secret(String name) {
		this.name = name;

		if (!this.name.isEmpty()) {
			this.initial = name.substring(0, 1);
		} else {
			this.initial = "ano";
		}

	}
	public void nameDrop() {
		String encodedText = Base64.getEncoder().encodeToString(this.name.getBytes());
		if (encodedText.equals("TWFyaQ==")) {
			System.out.println("Crush ko si " + new String(Base64.getDecoder().decode(encodedText)));
		} else {
			System.out.println("di ko man na crush");
		}
	}

	public void isItM() {
		String encodedText = Base64.getEncoder().encodeToString(this.name.getBytes());
		if (encodedText.equals("TWFyaQ==")) {
			System.out.println("okay crush taka");
		} else {
			System.out.println("maano ka");
		}
	}
}
