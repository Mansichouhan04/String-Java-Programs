class AlphabeticalArrange {
    public static void main(String args[]){
        String []s1={"ram","shyam","ajay","vijay"};
        int n=s1.length;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(s1[j].compareTo(s1[j+1])>0){
                    //swap a[j]and a[j+1]
                    String temp = s1[j];
                    s1[j]=s1[j+1];
                    s1[j+1]=temp;
                }
            }
        }
        for(String s2:s1){
            System.out.println(s2+" ");
        }
    }
}