import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String args[]) {
        int[] a = {3, 3};
        System.out.println("reslt" + removeElement(a, 3));
    }
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carray=0;
        ListNode l3 = new ListNode(0);
        while(l1!=null||l2!=null){
            if(l1!=null){
                carray+=l1.val;
                l1=l1.next;
            }
            if(l2!=null){
                carray+=l2.val;
                l2=l2.next;
            }
            l3.val+=carray%10;
            l3.next=new ListNode(carray/10);
            l3=l3.next;

        }






        return l1;
    }
}



//**********************leetcode removeDuplicates*********************
//
//    public static int removeElement(int[] nums, int val) {
//        int i=0;
//        int length=0;
//        int j=nums.length-1;
//        if(nums.length==0){
//            return 0;
//        }
//        if(nums.length==1){
//            if(nums[0]==val){
//                return 0;
//            }
//            else{
//                return 1;
//            }
//        }
//        while(i!=j+1){
//            System.out.println(1);
//            if(nums[i]==val){
//                System.out.println(2);
//                if(nums[j]==val){
//                    j--;
//                    System.out.println(3);
//
//                }else{
//                    System.out.println(4);
//                    nums[i]=nums[j];
//                    nums[j]=val;
//
//                }
//
//            }else{
//                System.out.println(5);
//                i++;
//                length++;
//            }
//            System.out.println("i="+i);
//            System.out.println("j="+j);
//        }return length;
//    }




//**********************leetcode removeDuplicates*********************

//
//
//    public int removeDuplicates(int[] nums) {
//        int count=0;
//        int pointer;
//        int length=0;
//        if (nums.length>0){
//            length=1;
//            pointer=nums[0];
//            for (int i=1;i<nums.length;i++){
//                if (pointer<nums[i]){
//                    pointer=nums[i];
//                    nums[count]=pointer;
//                    count++;
//
//                }
//
//                length=count+1;
//            }
//        }
//        return length;
//
//    }
    //**********************leetcode Pascal's Triangle 1*********************
//    public List<List<Integer>> generate(int numRows){
//        List<List<Integer>> list =new ArrayList<>();
//        if (numRows<=0){
//            return null;
//        }
//        if(numRows>=1) {
//            List<Integer> data= new ArrayList<>();
//            data.add(1);
//            list.add(data);
//
//        }
//        if(numRows>=2){
//            List<Integer> data= new ArrayList<>();
//            data.add(1);
//            data.add(1);
//            list.add(data);
//
//        }
//        if(numRows>=3){
//            for (int i=3;i<=numRows;i++) {
//                List<Integer> prev = new ArrayList<>();
//                prev=list.get(i-2);
//                List<Integer> data = new ArrayList<>();
//                data.add(1);
//                for (int j=0;j<i-2;j++){
//                    data.add(prev.get(j)+prev.get(j+1));
//
//                }
//                data.add(1);
//                list.add(data);
//            }
//        }return list;
//    }
//}
    //**********************leetcode Stcok 1*********************
//    int[] a={1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1};
//    int b=0;
//
//
//
//
//
//    public int majorityElement(int[] nums) {
//        int count;
//        int newArray[]=new int[nums.length];
//        int nA=0;
//        for(int i=0;i<nums.length;i++){
//            count=0;
//
//            for (int j=i+1;j<nums.length;j++){
//                if (nums[i]==nums[j]){
//                    count++;
//                    if (count>= nums.length/2){
//                       // newArray[nA];
//                        nA=nums[i];
//                    }
//                }
//            }
//        }
//        return nA;
//    }
//
//
//    majorityElement(a);
//}

//**********************leetcode Stcok 1*********************


//    public String convert(String s, int numRows) {
//        int count=1;
//        int mark=1;
//        z =new String();
//        while(count==s.length()){
//            if(mark==1){
//                for(mark=1;mark<=numRows;mark++){
//
//
//                }
//            }
//            if(mark==numRows){
//                for(mark=numRows;mark>=1;mark--){
//            }
//
//        }


//    public static void main(String[] args) {
//      int[] a={2,0};int m=1;int[] b={1};int n=1;
//        merge(a,m,b,n);
//    }
//    public static void merge(int[] nums1, int m, int[] nums2, int n) {
//        int mark1=m-1;int mark2=n-1;
//        for(int i=m+n-1;i>=0;i--){
//           if(mark1>=0&&mark2>=0){
//               System.out.println(mark1+"&"+mark2);
//               if(nums1[mark1]>=nums2[mark2]){
//                   nums1[i]=nums1[mark1];
//                   mark1--;
//               }else{
//                   nums1[i]=nums2[mark2];
//                   mark2--;
//               }
//           }else if (mark1>=0&&mark2<0){
//               nums1[i]=nums1[mark1];
//               mark1--;
//           }else if (mark2>=0&&mark1<0){
//               nums1[i]=nums2[mark2];
//               mark2--;
//           }
//
//       }
//    }

























//**********************88.1 Merge Sorted Array*********************
//    public void merge(int[] nums1, int m, int[] nums2, int n) {
//        int[] nNums1=new int[m];int mark1=0;int mark2=0;
//        System.arraycopy(nums1, 0, nNums1, 0, m);
//        for(int i=0;i<m+n;i++){
//            System.out.println(0);
//            if(mark2<n&&mark1<m){
//                if(nNums1[mark1]>nums2[mark2]){
//                    nums1[i]=nums2[mark2];
//                    mark2++;
//                    System.out.println("1");
//                }
//                else{
//                    nums1[i]=nNums1[mark1];
//                    mark1++;
//                    System.out.println("2");
//                }
//            }else if(mark1>=m&&mark2<n){
//                nums1[i]=nums2[mark2];
//                mark2++;
//
//                System.out.println("3");
//            }else if(mark1<m&&mark2>=n){
//                System.out.println(nNums1[mark1]);
//                nums1[i]=nNums1[mark1];
//                mark1++;
//                System.out.println("4");
//            }
//
//            System.out.println("Array("+i+")"+nums1[i]);
//        }
//    }
//*************************88.1 Merge Sorted Array***************




// int[] a={9,9};
//
//        for(int i = 0;i<a.length;i++){
//            System.out.println(plusOne(a)[i]);
//
//        }
//
//
//    }
//    public static int[] plusOne(int[] digits) {
//        digits[digits.length-1]++;
//        int j=0;
//        for (int i=digits.length-1;i>=0;i--){
//            if (digits[i]>9){
//                if (i==0){
//                    digits[i]=0;j=1;
//                }
//                else digits[i-1]++;digits[i]=0;
//            }else if(j==0){
//                digits[i]++;
//
//            }
//        }
//        if (j==1){
//            int[] a= new int[digits.length+1];
//            a[0]=1;
//            for (int i=1;i<digits.length+1;i++){
//                a[i]=digits[i-1];
//            }
//            return a;
//
//        }else return digits;
//    }


//    public static double findMedianSortedArrays ( int[] nums1, int[] nums2) {
//        int [] num3=new int[nums1.length+nums2.length];
//        int j=0;int z=0;float result;
//        for(int i=0;i<num3.length;i++){
//            if (j<nums1.length&&z<nums2.length) {
//                if (nums1[j] < nums2[z]) {
//                    num3[i] = nums1[j];
//                    j++;
//                    System.out.println("1j"+num3[i]);
//                } else {
//                    num3[i] = nums2[z];
//                    z++;
//                    System.out.println("1z"+num3[i]);
//                }
//            }
//            else if (j>= nums1.length&&z<nums2.length){
//                num3[i]=nums2[z];
//                z++;System.out.println("2z"+num3[i]);
//            }
//            else if (j< nums1.length&&z>=nums2.length){
//                num3[i]=nums1[j];
//                j++;System.out.println("2j"+num3[i]);
//            }
//
//        }
//        if (num3.length%2==0){
//            result=((float)num3[(num3.length/2)-1]+num3[num3.length/2])/2;
//            System.out.println(result);
//            return result;
//
//        }
//        else
//            return num3[num3.length/2];




//    {
//        int[] nums={5,1,3,5,2};
//        int newLong=nums.length;
//        int start=0;
//        int end=nums.length-1;
//
//
//            for (int j=end;j>=start;j--){
//                if (start==j){
//                    System.out.println("done");
//                    System.out.println("end="+end);
//                    break ;
//                }
//
//                System.out.println("j="+j);
//
//                if(nums[start]==nums[j]){
//                    start++;
//                    newLong--;
//                    j=nums.length;
//                }
//
//                System.out.println("start=" +start);
//
//
//
//
//        }










//        int[] nums={1,3,4,2,4,5,0,9};
//        int target=9;
//        for(int i=0;i<nums.length;i++){
//            for(int j=i;j<nums.length;j++){
//                if (nums[i]+nums[j]==target){
//                    System.out.println(i+":"+j);
//                }
//            }
//
//        }


//        String s = new String();
//        s = "DDIVX";
//        char[] sArr = s.toCharArray();
//        for (int i=0;i<sArr.length;i++){
//            convert(sArr[i]);
//        }
//
//    }
//
//    public static int convert(char s) {
//        switch (s) {
//            case 'Ⅰ':
//                return 1;
//
//            case 'V':
//                return 5;
//
//            case 'X':
//                return 10;
//
//            case 'L':
//                return 50;
//
//            case 'C':
//                return 100;
//
//            case 'D':
//                return 500;
//
//            case 'M':
//                return 1000;
//
//            default:
//                return 0;
//
//
//        }



