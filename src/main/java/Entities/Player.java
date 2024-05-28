package Entities;

import java.util.Objects;

public class Player {
    private String name;
    private int SKillLevel;
    private int age;

    public Player(String name, int SKillLevel, int age) {
        this.name = name;
        this.SKillLevel = SKillLevel;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSKillLevel() {
        return SKillLevel;
    }

    public void setSKillLevel(int SKillLevel) {
        this.SKillLevel = SKillLevel;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", SKillLevel=" + SKillLevel +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Player player = (Player) o;
        return Objects.equals(name, player.name);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }
}
