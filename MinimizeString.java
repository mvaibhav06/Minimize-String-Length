class MinimizeString {
    public int minimizedStringLength(String s) {
        int out = 0;
        Map<Character,Integer> temp = new HashMap<>();

        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(temp.containsKey(ch)){
                temp.put(ch,temp.get(ch)+1);
            }else{
                temp.put(ch,1);
            }
        }

        for(char ch : temp.keySet()){
            int count = temp.get(ch);
            if(count >= 3){
                count /= 3;
                if(count >= 2){
                    out++;
                }else{
                    out += count;
                }
            }else if(count == 2){
                out += count/2;
            }else{
                out += count;
            }
        }
        return out;
    }
}
