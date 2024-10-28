public class DataStore {

    Computer[] computers = new Computer[100];
    public int computerNumber = 0;
    public int sameComputers = 0;

    public void addComputer(Computer computer) {
        computers[computerNumber] = computer;
        computerNumber++;
    }

    public void computersInfo(Computer[] computers) {
        for (Computer comp : computers) {
            if(comp==null){
                break;
            }
            System.out.println(comp);
        }
    }

    public void checkAvailability(Computer computer) {
        for (Computer comp : computers) {
            if(comp==null){
                break;
            }
            if (comp.equals(computer)) {
                sameComputers++;
            }

        }
        System.out.println(sameComputers);
    }
}
