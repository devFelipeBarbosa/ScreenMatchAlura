package br.com.alura.sreenmatch.calculate;

public class FilterRecommendation {
    public void filter(Sortable sortable){
        if (sortable.getClassification() >= 4){
            System.out.println("Está entre os preferidos do momento!");
        } else if (sortable.getClassification() >=2 ){
            System.out.println("Muito bem avalidado no momento!");
        }else{
            System.out.println("Assista depois!");
        }

    }
}
