package homework7;

public class ManageVector {
    private int[] numbers;
    private int total_numbers = 0;
    private long currentTime;

    public ManageVector(int col) {
        this.numbers = new int[col];
    }

    public int size() {
        return this.total_numbers;
    }

    public boolean have(int number) {
        for (int count = 0; count < numbers.length; count++) {
            if (this.numbers[count] == number) {
                return true;
            }
        }
        return false;
    }

    public void add(int number) {
        if (total_numbers == this.numbers.length) {
            return;
        }
        this.numbers[total_numbers] = number;
        this.total_numbers++;
    }

    public int[] getList() {
        return this.numbers.clone();
    }

    public double getCurrentTime() {
        return currentTime / 1000.0;
    }
    public void setList(int[] numeros){
        this.numbers = numbers;
        this.total_numbers = numbers.length;
    }
    public int recursive_binary_search (int target, int begin, int end) throws Exception {
        if(size() == 0) 
            throw new Exception("O vetor não tem itens.");
        else{

            if (begin == end) {
                return numbers[begin];}
            if(begin > end){
                throw new Exception("Valor não encontrado.");
            }else{
                
                int middleValue = numbers[(begin+end) / 2];

                if (middleValue == target) {
                    return middleValue; // Valor encontrado na lista
                } else if (middleValue < target) {
                    return recursive_binary_search(target, middleValue + 1, end);
                } else {
                    return recursive_binary_search(target, begin, middleValue - 1);
                }
            }
        }
        
       
    }

}