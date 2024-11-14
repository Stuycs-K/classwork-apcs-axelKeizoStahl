import java.util.ArrayList;

// Maxim Argat and Axel Stahl
public class ArrayListPractice
{
    public static void main(String[] args)
    {
        System.out.println("start");
        ArrayList<String> testarr1 = createRandomArray(250000);
        replaceEmpty(testarr1);
        ArrayList<String> testarr2 = createRandomArray(300000);
        mixLists(makeReversedList(testarr1), mixLists(testarr1, testarr2));
        System.out.println("done");
    }
    
    public static ArrayList<String>createRandomArray(int size)
    {
        ArrayList<String> al = new ArrayList<String>();

        for(int i = 0; i < size; i++)
        {
            int thing = (int)(Math.random() * 11);
            if(thing == 0)
            {
                al.add("");
            }
            else
            {
                al.add("" + thing);
            }
        }

        return al;
    }

    public static void replaceEmpty(ArrayList<String> original)
    {
        for (int i = 0; i < original.size(); i++) {
            if (original.get(i).equals("")) {
                original.set(i, "Empty");
            }
        }
    } 

    public static ArrayList<String> makeReversedList(ArrayList<String> original)
    {
        ArrayList<String> res = new ArrayList<String>();
        for (int i = original.size()-1; i>=0; i--) {
            res.add(original.get(i));
        }
        return res;
    } 

    public static ArrayList<String> mixLists(ArrayList<String> a, ArrayList<String> b)
    {
        ArrayList<String> res = new ArrayList<String>();
        for (int i = 0; i < Math.max(a.size(), b.size()); i++)
        {
            if(i < a.size())
                res.add(a.get(i));
            if(i < b.size())
                res.add(b.get(i));
        }
        return res;
    } 
}