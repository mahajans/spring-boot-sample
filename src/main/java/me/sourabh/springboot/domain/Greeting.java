package me.sourabh.springboot.domain;

/**
 * Sample domain object
 */
public class Greeting {

    private long id;
    private String name;

    public Greeting(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Greeting{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

}
