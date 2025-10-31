package day07.Ex04_빌더패턴;

public class Pikachu {

    // 변수
    private int energy;
    private String type;
    private int level;

    // private 생성자 — Builder 객체를 받아 초기화
    private Pikachu(Builder builder) {
        this.energy = builder.energy;
        this.type = builder.type;
        this.level = builder.level;
    }

    // Builder 클래스 (static inner class)
    public static class Builder {
        private int energy;
        private String type;
        private int level;

        // 기본 생성자
        public Builder() {}

        // 각 변수를 초기화하고, Builder 자신을 반환하는 메서드들
        public Builder energy(int energy) {
            this.energy = energy;
            return this;
        }

        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public Builder level(int level) {
            this.level = level;
            return this;
        }

        // build() 메소드: Pikachu 객체 생성
        public Pikachu build() {
            return new Pikachu(this);
        }

        @Override
        public String toString() {
            return "Builder [energy=" + energy + ", type=" + type + ", level=" + level + "]";
        }
    }

    @Override
    public String toString() {
        return "Pikachu [energy=" + energy + ", type=" + type + ", level=" + level + "]";
    }
}
