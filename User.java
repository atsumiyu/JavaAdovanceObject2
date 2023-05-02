package oop2;

public class User {

    String name;
    String from;
    String birth;

    public User(String name, String from, String birth) {
        this.name = name;
        this.from = from;
        this.birth = birth;
    }

    @Override
    public boolean equals(Object o) {
        var user = (User)o;
        if(user.name.equals(this.name) && user.from == this.from && user.birth == this.birth) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "名前：" + name + " 出身地" + from + " 生年月日" + birth;
    }

}
