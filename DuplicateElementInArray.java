public Class DuplicateElementInArray{
    public void duplicateElement(int arr[]){
        int n=arr.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]==arr[j]){
                    System.out.println("Duplicate Element is: "+arr[i]);
                }
            }
        }
    }
    public static void main(String[] args){
        DuplicateElementInArray D=new DuplicateElementInArray();
        int arr[]={1,2,3,4,5,6,7,8,9,1};
        D.duplicateElement(arr);
    }
}