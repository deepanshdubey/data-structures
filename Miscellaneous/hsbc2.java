import java.util.*;

public class hsbc2 {
    public static void main(String args[])
    {
        HashSet<Integer> rows = new HashSet<>();
        HashSet<Integer> columns = new HashSet<>();

        int arr[][] = {{0,2,3}, {3,4,5}, {2,4,5}};
        int i=0, j=0;

        for(i=0; i<3; ++i)
        {
            for(j=0; j<3; ++j)
            {
                if(arr[i][j]==1)
                {
                    rows.add(i);
                    columns.add(j);
                }
            }
        }

        for(i=0; i<3; ++i)
        {
            for(j=0; j<3; ++j)
            {
                if(rows.contains(i) || columns.contains(j))
                    arr[i][j] = 1;
            }
        }

        for(i=0; i<3; ++i)
        {
            for(j=0; j<3; ++j)
            {
                System.out.print("\t " + arr[i][j]);
            }
            System.out.println();

        }
        
    }
}
