class RandomizedSet {
    ArrayList<Integer> l1;
    HashMap<Integer,Integer> map = new HashMap<>();
    Random rand;

    public RandomizedSet() {
        l1 = new ArrayList<>();
        map = new HashMap<>();
        rand = new Random();
    }
    
    public boolean insert(int val) {
        if(!map.containsKey(val)){
            l1.add(val);
            map.put(val, l1.size()-1);
            return true;
        }
        return false;
    }
    
    public boolean remove(int val) {
        if(!map.containsKey(val)) return false;
        int index = map.get(val);
        int last = l1.get(l1.size()-1);

        l1.set(index, last);

        map.put(last, index);
        
        l1.remove(l1.size()-1);

        map.remove(val);
        
        return true;
    }
    
    public int getRandom() {
        int index = rand.nextInt(l1.size());
        return l1.get(index);
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */