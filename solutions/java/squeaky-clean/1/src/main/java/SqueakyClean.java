class SqueakyClean {
	
	static String clean(String identifier) {
    StringBuilder modifier= new StringBuilder();
    boolean capital=false;
		for (char letter : identifier.toCharArray()) {
			if (letter==' ') {
				letter='_';
				modifier.append(letter);
				continue;
			}
			if (letter=='-') {
				capital=true;				
				continue;
			}
			if (capital) {
				letter=Character.toUpperCase(letter);
				modifier.append(letter);
				capital=false;
				continue;
			}
			switch (letter) {
			case '0':
				letter='o';
				break;
			case '1':
				letter='l';
				break;
			case '3':
				letter='e';
				break;
			case '4':
				letter='a';
				break;
			case '7':
				letter='t';
				break;
			}
			
			if (!Character.isLetter(letter)) {
				continue;
			}
			
			modifier.append(letter);
			
					}
		return modifier.toString();
		
    }
}
