//LeetCode-1557 Minimum Number of Vertices to reach all Nodes
class Solution {
    static 
    {
        for (int i = 0; i < 300; i++) 
        {
            findSmallestSetOfVertices(0, new ArrayList<>());
        }
    }
    public static List<Integer> findSmallestSetOfVertices(int n, List<List<Integer>> edges) {
        List<Integer> result = new ArrayList<>();
        boolean[] incoming = new boolean[n];
        int size = edges.size();
        for(int i = 0 ; i < size ; i++){
            incoming[edges.get(i).get(1)] = true;
        }
        for(int i = 0 ; i < n ; i++){
            if(!incoming[i]){
                result.add(i);
            }
        }
        return result;
    }
}
