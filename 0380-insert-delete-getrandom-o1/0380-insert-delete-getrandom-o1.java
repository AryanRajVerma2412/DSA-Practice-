class RandomizedSet {
    ArrayList<Integer> l1;
    Random rand = new Random();

    public RandomizedSet() {
        l1 = new ArrayList<>();
    }
    
    public boolean insert(int val) {
        if(!l1.contains(val)){
            l1.add(val);
            return true;
        }
        return false;
    }
    
    public boolean remove(int val) {
        if(l1.isEmpty()) return false;
        if(l1.contains(val)){
            l1.remove(Integer.valueOf(val));
            return true;
        }
        return false;
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