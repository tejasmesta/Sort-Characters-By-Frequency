class Solution {
    public String frequencySort(String s) 
    {
        int n = s.length();
        
        HashMap<Character,Integer> map = new HashMap<>();
        
        for(int i=0;i<n;i++)
        {
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        
        PriorityQueue<Pair> pq = new PriorityQueue<>((a,b)->b.count-a.count);
        
        for(Map.Entry<Character,Integer> entry:map.entrySet())
        {
            pq.add(new Pair(entry.getKey(),entry.getValue()));
        }
        
        String ans = "";
        
        while(!pq.isEmpty())
        {
            Pair p = pq.remove();
            
            int m = p.count;
            
            for(int i=0;i<m;i++)
            {
                ans += (p.c+"");
            }
        }
        
        return ans;
    }
    
    class Pair
    {
        char c;
        int count;
        
        Pair(char c,int count)
        {
            this.c =c;
            this.count = count;
        }
    }
}
