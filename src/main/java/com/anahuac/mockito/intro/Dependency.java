package com.anahuac.mockito.intro;

public class Dependency {

    private final Subdependency subdependency;

    public Dependency(Subdependency subdependency) {
        super();
        this.subdependency = subdependency;
    }

    public String getClassName() {
        return this.getClass().getSimpleName();
    }

    public String getSubdependencyClassName() {
        return this.subdependency.getClassName();
    }

    public int addTwo(int i){
        return i + 2;
    }

    public String getClassNameUppercase() {
        return getClassName().toUpperCase();
    }

}
