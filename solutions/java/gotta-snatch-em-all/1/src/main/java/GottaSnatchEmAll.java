import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

class GottaSnatchEmAll {

    static Set<String> newCollection(List<String> cards) {    	
    	return new HashSet<String>(cards);
    }

    static boolean addCard(String card, Set<String> collection) {    	
    	return collection.add(card);
    }

    static boolean canTrade(Set<String> myCollection, Set<String> theirCollection) {
    	   	
    	Set<String>myCards=new HashSet<String>(myCollection);
    	myCards.removeAll(theirCollection);
    	
    	Set<String>yourCards=new HashSet<String>(theirCollection);
    	yourCards.removeAll(myCollection);
    	
    	if (!myCards.isEmpty()&&!yourCards.isEmpty()) {
			return true;
		}
    	
    	return false;
    }

    static Set<String> commonCards(List<Set<String>> collections) {    	
    	Set<String>common=new HashSet<>(collections.get(0));

    	for (Set<String> set :collections ) {							    	
    		common.retainAll(set);		
    	}
    	return common;
    }

    static Set<String> allCards(List<Set<String>> collections) {
    	Set<String>all=new HashSet<String>(collections.get(0));
    	for (Set<String> cards : collections) {
				all.addAll(cards);			
		}
    	return all;
    }
}
