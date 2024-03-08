import org.junit.Test;

public class Junit {

    public static int[] sort(int[] list){
        for (int i = 0; i < list.length - 1; i++){
            for (int j=0; j <list.length -1 -i; j++){
                boolean flag = false;
                if (list[j] > list[j+1]){
                    int tmp = list[j];
                    list[j] = list[j+1];
                    list[j+1] = tmp;
                    flag = true;
                }
                if (!flag){
                    break;
                }

            }
        }

        return list;
    }

    public static int[] sortSelect(int[] list){
        for (int i = 0; i < list.length; i++){
            int lowestIndex = i;
            for (int j= i+1; j <list.length; j++){
                if (list[j] < list[i] ){
                    lowestIndex = j;
                }

                if (lowestIndex != i){
                    int tmp = list[i];
                    list[i] = list[lowestIndex];
                    list[j] = tmp;

                }
            }
        }
        return list;
    }



    private static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    //冒泡排序
    @Test
    public void test1() {
        int[] list = {65, 55, 45, 35, 25, 15, 10};
        int[] sort = sort(list);
        printArray(sort);
    }

    //选择排序
    @Test
    public void test2() {
        int[] list = {66, 56, 46, 36, 26, 16, 10};
        int[] sort = sortSelect(list);
        printArray(sort);
    }
}
