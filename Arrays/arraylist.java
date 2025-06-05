
import java.util.LinkedList;
import java.util.Scanner;

public class arrayList {
    record Place(String name, int distance){
        @Override
        public String toString() {
            return String.format("%s (%d)", name, distance);
        }
    }

    public static void main(String[] args) {
        LinkedList<Place> places = new LinkedList<>();
        addPlace(places,new Place("Adelaide",1374));
        addPlace(places,new Place("Alice Springs",2771));
        addPlace(places,new Place("Brisbane",917));
        addPlace(places,new Place("Darwin",3972));
        addPlace(places,new Place("Melbourne",877));
        addPlace(places,new Place("Perth",3923));
        places.addFirst(new Place("Sydney",0));
        System.out.println(places);
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the size of the list");
//        int n = sc.nextInt();
//        System.out.println("Enter the places of the list with comma separated distance");
//        int p = sc.nextInt();
        var iterator = places.listIterator();
        Scanner scanner = new Scanner(System.in);
        boolean quitLoop = false;
        boolean forward = true;

        printMenu();

        while(!quitLoop){
            if(!iterator.hasPrevious()){
                System.out.println("Originating : "+ iterator.next());
                forward = true;
            }
            if(!iterator.hasNext()){
                System.out.println("Final : "+ iterator.previous());
                forward = false;
            }
            System.out.println("Enter your choice: ");
            String choice = scanner.nextLine().toUpperCase().substring(0,1);

            switch(choice){
                case "F":
                    System.out.println("user wants to go forward");
                    if(iterator.hasNext()){
                        System.out.println(iterator.next());
                    }
                    break;
                case "B":
                    System.out.println("user wants to go backward");
                    if(iterator.hasPrevious()){
                        System.out.println(iterator.previous());
                    }
                    break;
                case "L":
                    System.out.println(places);
                    break;
                case "M":
                    printMenu();
                    break;
                default:
                    quitLoop = true;
                    break;
            }
        }
    }
    public static void addPlace(LinkedList<Place> list, Place place){
        if(list.contains(place)){
            System.out.println("Found duplicate"+place);
            return;
        }
        for(Place p : list){
            if(p.name().equalsIgnoreCase(place.name())){
                System.out.println("Found duplicate"+place);
                return;
            }
        }
        int matchedIndex = 0;
        for(var listPlace : list){
            if(place.distance() < listPlace.distance()){
                list.add(matchedIndex, place);
                return;
            }
            matchedIndex++;
        }
        list.add(place);
    }
    private static void printMenu(){
        System.out.println("""
                Available options:
                (F)orward
                (B)ackward
                (L)ist Menu
                (M)enu
                (Q)uit""");
    }
}
