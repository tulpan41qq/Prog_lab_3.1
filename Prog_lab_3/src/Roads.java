import java.util.ArrayList;

public class Roads implements InterfaceRoad, InterfaceStFunct {
    private ArrayList<AbstractFlower> Flowers = new ArrayList<AbstractFlower>();
    public void add(AbstractFlower f) {
        Flowers.add(f);
    }
    public ArrayList<AbstractFlower> getFlowers() {
        try {
            if (haveAnyFlower()) return Flowers;
            else throw new ExistException("Растений на дороге нет");
        } catch (ExistException e) {
            e.printStackTrace();
            return Flowers;
        }
    }
    public boolean haveAnyFlower() {
        return Flowers.size()>0?true:false;
    }
    @Override
    public int hashCode() {
        return super.hashCode()*Flowers.size();
    }
    @Override
    public boolean equals(Object obj) {
        boolean comp = obj.hashCode()==this.hashCode() ? true : false;
        return comp;
    }
    @Override
    public String toString() {
        String s = "";
        for (int i = 0; i < Flowers.size()-1; i++) {
            s += Flowers.get(i).getType() + ", ";
        }
        s += Flowers.get(Flowers.size()-1).getType();
        return s;
    }

}
