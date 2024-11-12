import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

/**
 * 10. Write a programme that tells you which line passes through particular stations.
 * Just use Zone 1 stations name.
 */
public class StationLine {

    public static void main(String[] args) {

        // Create a HashMap to store Zone 1 station names and lines passing through them
        HashMap<String, List<String>> stationLines = new HashMap();

        // Adding sample Zone 1 stations and their respective lines
        stationLines.put("Oxford Circus", List.of("Bakerloo", "Central", "Victoria"));
        stationLines.put("Piccadilly Circus", List.of("Bakerloo", "Piccadilly"));
        stationLines.put("Green Park", List.of("Jubilee", "Piccadilly", "Victoria"));
        stationLines.put("Bond Street", List.of("Central", "Jubilee"));
        stationLines.put("Waterloo", List.of("Bakerloo", "Jubilee", "Northern", "Waterloo & City"));
        stationLines.put("Bank", List.of("Central", "Northern", "Waterloo & City"));

        // Scanner to take user input for the station name
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the name of the station: ");
        String station = scanner.nextLine();

        // Check if the station exists in the map
        if (stationLines.containsKey(station)) {
            System.out.println("The lines that pass through " + station + " are: ");
            for (String line : stationLines.get(station)) {
                System.out.println("- " + line);
            }
        } else {
            System.out.println("Station not found in Zone 1 or does not exist.");
        }
        scanner.close();
    }
}
