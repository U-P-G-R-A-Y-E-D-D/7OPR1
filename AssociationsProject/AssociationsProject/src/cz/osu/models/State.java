package cz.osu.models;

public class State {
    private String name;
    private String code;

    public State(String name, String code) {
        this.name = name;
        this.code = code;
    }

    public State(State state) {
        this.name = state.name;
        this.code = state.code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "State{" +
                "name='" + name + '\'' +
                ", code='" + code + '\'' +
                '}';
    }
}
