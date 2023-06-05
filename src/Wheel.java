public class Wheel {
    private int id;//required
    private int size;//optional
    private int color;//optional

    private Wheel(Builder builder) {
        this.id = builder.id;
        this.size = builder.size;
        this.color = builder.color;

    }

    public static class Builder {
        private int id;
        private int size;
        private int color;

        public Builder(int id) {
            this.id = id;
        }

        public Builder withSize(int size) {
            this.size = size;
            return this;
        }

        public Builder withColor(int color) {
            this.color = color;
            return this;
        }

        public Wheel build() {
            return new Wheel(this);
        }
    }

    public static void main(String[] args) {
        Wheel wheel = new Builder(1).withSize(2).withColor(3).build();
    }
}
