package com.green;

public enum SexEnum {
    Man(1,"男"),FEMALE(0,"女");
    private int id;
    private String name;

    SexEnum(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static SexEnum getSexById(int id){
        for (SexEnum sex : SexEnum.values()){
            if (id == sex.getId()){
                return sex;
            }
        }
        return null;
    }
}
