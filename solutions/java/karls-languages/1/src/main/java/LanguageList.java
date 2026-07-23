import java.util.ArrayList;
import java.util.List;

public class LanguageList {
    private final List<String> languages = new ArrayList<>();

    public boolean isEmpty() {
    	if (languages.isEmpty()) {
			return true;
		}
    	return false;
    }

    public void addLanguage(String language) {
       languages.add(language);
    }

    public void removeLanguage(String language) {    	
				languages.remove(language);
    }

    public String firstLanguage() {
    	String lang;
    	lang=languages.getFirst();
    	return lang;
    }

    public int count() {
    	int number;
    	number=languages.size();
    	return number;
    }

    public boolean containsLanguage(String language) {
    	boolean exist=false;
    	if (languages.contains(language)) {
			exist=true;
		}
    	return exist;
    }

    public boolean isExciting() {
        boolean exciting=false;
        if (languages.contains("Java") || languages.contains("Kotlin")) {
			exciting=true;
		}
        return exciting;
    }
}
