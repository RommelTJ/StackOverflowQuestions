public class OptimizingForCPUCache {

    public static void main(String[] args){
        //Made this to study different kinds of memory access
	int size = 10000;
	Integer[][] array = new Integer[size][size];
	for(int i=0; i<size; i++){
            for(int j=0; j<size; j++){
                array[i][j] = 0;
            }
        }
        insideInLoop(array);
        insideOutLoop(array);
	System.out.println("Modern CPUs will load the cache line with near memory addresses from the main memory when you access a single memory address. When you iterate through the outer loop, each trip of the inner loop will cause the cache to be flushed and loaded with a line of addresses that are near the inner loop. Thus, it's always better to iterated the inner loop first.");
    }

    public static void insideOutLoop(Integer[][] array) {
        long startTime = System.nanoTime();
	for(int i=0; i<array.length; i++){
            for(int j=0; j<array.length; j++){
                int tmp = array[j][i] + 5;
            }
        }
        long estimatedTime = System.nanoTime() - startTime;
	System.out.println(estimatedTime + " - insideOutLoop");
    }

    public static void insideInLoop(Integer[][] array) {
        long startTime = System.nanoTime();
        for(int i=0; i<array.length; i++){
            for(int j=0; j<array.length; j++){
                int tmp = array[i][j] + 5;
            }
        }
        long estimatedTime = System.nanoTime() - startTime;
        System.out.println(estimatedTime + " - insideInLoop");
    }

}
