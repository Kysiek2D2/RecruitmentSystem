package com.recruitment.recruitmentsystem.tasks.solutions;

public class YggdrasilSingletonSolution {
    //static!
    private static YggdrasilSingletonSolution yggdrasil;

    //private constructor!
    private YggdrasilSingletonSolution(){}

    //static!
    public static YggdrasilSingletonSolution getInstance(){
        if(yggdrasil == null) {
            yggdrasil = new YggdrasilSingletonSolution();
        }
        return yggdrasil;
    }
}
