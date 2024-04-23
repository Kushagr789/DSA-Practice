class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer> > a =  
                  new ArrayList<List<Integer> >();
                  
        for(int i=1;i<=numRows;i++)
        {
            List<Integer> b=new ArrayList<Integer>();
            if(i==1)
            b.add(1);
            else if(i==2)
            {
                b.add(1);
                b.add(1);
            }
            else
            {
                for(int j=0;j<i;j++)
                {
                    if(j==0)
                    b.add(a.get(i-2).get(j));
                    else if(j==i-1)
                    b.add(a.get(i-2).get(j-1));
                    else
                    {
                        b.add((a.get(i-2).get(j-1)+a.get(i-2).get(j)));
                    }
                }
            }
            a.add(b);
            
        }
        return a;
        
    }
}