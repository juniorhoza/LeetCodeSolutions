import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {
    public List<List<Integer>> generate (int numRows){
        List<List<Integer>> listofList = new ArrayList<>();
        List<Integer> tempList ;

        listofList.add(new ArrayList<Integer>(List.of(1)));
        if(numRows!=1){

            for(int i=0;i<numRows-1;i++){
                tempList=new ArrayList<>();
                List<Integer> currentlist= listofList.get(i);
                tempList.add(1);
                for (int j=1;j<= currentlist.size();j++){
                    if(j==listofList.get(i).size()){
                        tempList.add(1);
                        break;
                    }else{
                        tempList.add(currentlist.get(j) + currentlist.get(j-1));

                    }
                }
                listofList.add(tempList);
                tempList=null;
            }
        }


        return  listofList;
    }
}
