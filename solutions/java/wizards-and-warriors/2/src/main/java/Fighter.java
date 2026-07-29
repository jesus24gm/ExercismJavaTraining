class Fighter {
	
	
    public Fighter() {
		
	}

	boolean isVulnerable() {
        return true;
    }

    int getDamagePoints(Fighter fighter) {
        return 1;
    }
}

class Warrior extends Fighter{

	public Warrior() {
		super();
	}
	
	@Override
	boolean isVulnerable() {
		return false;
	}
	
	@Override
	int getDamagePoints(Fighter fighter) {
		if (fighter.isVulnerable()) {
			return 10;
		}else {
			return 6;					
		}
	}
	@Override
	public String toString() {
		return "Fighter is a Warrior";
	}
}

class Wizard extends Fighter{
	private boolean spellPrepared;
	public Wizard() {
		super();
		spellPrepared=false;
	}
	
	void prepareSpell() {
		spellPrepared=true;
	}
	
	@Override
	boolean isVulnerable() {
		if (spellPrepared) {
			return false;
		}
		return true;
	}



	@Override
	int getDamagePoints(Fighter fighter) {
		if (spellPrepared) {
			return 12;
		}else {
			return 3;
		}
		
	}



	@Override
	public String toString() {
		return "Fighter is a Wizard";
	}
	
	
}