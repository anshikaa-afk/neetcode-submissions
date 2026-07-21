class Solution {

    public String encode(List<String> strs) {
        if(strs.isEmpty()) return "";
        StringBuilder enStr = new StringBuilder();
        for(String str: strs){
            enStr.append(str.length()).append("#").append(str);
        }
        System.out.print(enStr.toString());
        return enStr.toString();
    }

    public List<String> decode(String str) {
        if(str.length() == 0){
          return new ArrayList<>();  
        }
        List<String> decodeList = new ArrayList<>();
        int i =0;
        while(i<str.length()){
            int j=i;
            while(str.charAt(j) != '#'){
                j++;

            }
            int length = Integer.parseInt(str.substring(i,j));
            i=j+1;
            decodeList.add(str.substring(i,length+i));
            i+=length;
        }
        return decodeList;
    }
}
