import java.util.HashMap;
import java.util.Map;

public class DialingCodes {
	private Map<Integer, String> dialingCodesMaps=new HashMap<>();
	
    public Map<Integer, String> getCodes() {
    	
    	return dialingCodesMaps;
    }

    public void setDialingCode(Integer code, String country) {
    	dialingCodesMaps.put(code, country);
    }

    public String getCountry(Integer code) {    	
       return dialingCodesMaps.get(code);    	
    }

    public void addNewDialingCode(Integer code, String country) {
        if (dialingCodesMaps.containsValue(country)||dialingCodesMaps.containsKey(code)) {
			return;
		}
        dialingCodesMaps.put(code, country);
    }

    public Integer findDialingCode(String country) {
       Integer code;
    for (Integer state : dialingCodesMaps.keySet()) {
    	if (dialingCodesMaps.get(state).equals(country)) {
			code=state;
			return code;
		}
    }
       return null;
    }

    public void updateCountryDialingCode(Integer code, String country) {
    	Integer oldCode;
    	if (!dialingCodesMaps.containsValue(country)) {
			return;
		}
    	oldCode=this.findDialingCode(country);
    	dialingCodesMaps.remove(oldCode);
    	dialingCodesMaps.put(code, country);
    }
}
