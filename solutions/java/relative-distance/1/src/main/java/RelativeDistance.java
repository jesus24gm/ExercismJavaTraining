import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

class RelativeDistance {
private Map <String, List<String>>  familyTree;
    RelativeDistance(Map<String, List<String>>  familyTree) {
    	this.familyTree=familyTree;
    }

    int degreeOfSeparation(String personA, String personB) {

        if (personA.equals(personB)) {
            return 0;
        }

        List<String> current = new ArrayList<>();
        List<String> visited = new ArrayList<>();

        current.add(personA);
        visited.add(personA);

        int degree = 0;

        while (!current.isEmpty()) {

            List<String> next = new ArrayList<>();

            for (String person : current) {

                if (familyTree.containsKey(person)) {

                    for (String child : familyTree.get(person)) {

                        if (child.equals(personB)) {
                            return degree + 1;
                        }

                        if (!visited.contains(child)) {
                            visited.add(child);
                            next.add(child);
                        }
                    }
                }

                for (String parent : familyTree.keySet()) {

                    List<String> children = familyTree.get(parent);

                    if (children.contains(person)) {

                        if (parent.equals(personB)) {
                            return degree + 1;
                        }

                        if (!visited.contains(parent)) {
                            visited.add(parent);
                            next.add(parent);
                        }

                        for (String sibling : children) {

                            if (sibling.equals(personB)) {
                                return degree + 1;
                            }

                            if (!visited.contains(sibling)) {
                                visited.add(sibling);
                                next.add(sibling);
                            }
                        }

                      
                    }
                }
            }

            current = next;
            degree++;
        }

        return -1;
    }
}
