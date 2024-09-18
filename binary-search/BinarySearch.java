public class BinarySearch {
    public static void main(String[] args) {
        int[] numArray = {8, 12, 23, 34, 49, 57, 61, 76, 89, 95};
        int findMe = 49;
        System.out.println(binarySearch(numArray, findMe));
    }

    public static String binarySearch(int[] numArray, int findMe) {
        int left = 0, right = numArray.length - 1;
        int mid = (left+right)/2;

        while (left <= right) {
            mid = (left+right)/2;
            if(numArray[mid]==findMe){
                return "Found at "+mid;
            }
            if(findMe>numArray[mid]){
                left=mid+1;
            }else {
                right =mid-1;
            }
        }
        return "Not Found";
    }
}