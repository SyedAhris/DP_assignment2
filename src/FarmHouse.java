public class FarmHouse extends Pizza {
    public FarmHouse() {
        super.setDescription("FarmHouse + (550)");
    }

    @Override
    public int getCost() {
        return 550;
    }
}
