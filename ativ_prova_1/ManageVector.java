package ativ_prova_1;

public class ManageVector {
    Vector intersection_vector;
    int cols;

    public ManageVector(int cols) {
        this.cols = cols;
        intersection_vector = new Vector(cols);
    }

    public Vector findIntersection(Vector vector1, Vector vector2) throws Exception {
        if(vector1.size() != vector2.size() || vector1.size() != cols){
            throw new Exception("Os vetores não tem o mesmo tamanho");
        }

        for(int i = 0; i < vector1.size(); i++){
            for(int j = 0; j < vector2.size(); j++){
                if(vector1.getElement(i) == vector2.getElement(j)){
                    intersection_vector.add(vector1.getElement(i));
                    break;
                }
            }
        }
        return intersection_vector;
    }
}
