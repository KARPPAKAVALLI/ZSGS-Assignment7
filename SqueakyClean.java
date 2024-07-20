class SqueakyClean {
    static String clean(String identifier) {
        //throw new UnsupportedOperationException("Please implement the (static) SqueakyClean.clean() method");
        String ans="";
        for(int i=0;i<identifier.length();i++){
            char c=identifier.charAt(i);
            if(c==' ')
                ans+="_";
            else if(c=='-'){
                ans+=Character.toUpperCase(identifier.charAt(i+1));
                i++;
            }
            else if(Character.isDigit(c)){
                switch(c){
                    case '0':
                        ans+="o";
                        break;
                    case '1':
                        ans+="l";
                        break;
                    case '3':
                        ans+="e";
                        break;
                    case '4':
                        ans+="a";
                        break;
                    case '7':
                        ans+="t";
                }
            }
            else if(Character.isAlphabetic(c))
                ans+=c;
        }
        return ans;
    }
    
}
