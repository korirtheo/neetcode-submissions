class TimeMap {
    HashMap <String, String[]> mood;

    public TimeMap() {
        mood = new HashMap<String, String[]>();

    }
    
    public void set(String key, String value, int timestamp) { 

        String[] x = mood.getOrDefault(key, new String[1001]);
        x[timestamp] = value;
        mood.put(key, x);
        
    }
    
    public String get(String key, int timestamp) {
        if(timestamp > 1000) {timestamp = 1000;}
        if(!mood.containsKey(key)) {return "";}

        String[] x = mood.get(key);
        int l = 0;
        int r = 1000;

        while(x[timestamp] == null && timestamp >= 1) {
            timestamp--;
        }

        if (x[timestamp] == null) {
            return "";
        }
        return x[timestamp];

        // while (l < r) {
        //     int m = (l + r)/2;
        //     if (m == timestamp) {
        //         return x[timestamp];
        //     }

        //     if (m > timestamp) {
        //         r = m - 1;
        //         System.out.println(r);
        //     }
        //     else {
        //         l = m + 1;
        //     }


        // }

        
    }
}
