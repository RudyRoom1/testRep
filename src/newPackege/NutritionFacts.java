package newPackege;

public class NutritionFacts {
    private final int servingSize;
    private final int servings;
    private final Integer calories;
    private final int fat;
    private final int sodium;
    private final int carbohydrate;

    private NutritionFacts(Builder builder) {
        servingSize = builder.servingSize;
        servings = builder.servings;
        calories = builder.calories;
        fat = builder.fat;
        sodium = builder.sodium;
        carbohydrate = builder.carbohydrate;
        System.out.println("NutritionFacts object");
    }

    public static class Builder {
        private final int servingSize;
        private final int servings;
        private Integer calories;
        private int fat = 0;
        private int sodium = 0;
        private int carbohydrate = 0;

        public Builder(int servingSize, int servings) {
            this.servingSize = servingSize;
            this.servings = servings;
            System.out.println("Builder object");
        }

        public Builder calories(int val) {
            calories = val;
            return this;
        }

        public Builder fat(int val) {
            this.fat = val;
            return this;
        }

        public Builder sodium(int val) {
            sodium = val;
            return this;
        }

        public Builder carbohydrate(int val) {
            carbohydrate = val;
            return this;
        }

        public NutritionFacts build() {
            return new NutritionFacts(this);
        }

        @Override
        public String toString() {
            return "Builder{" +
                    "servingSize=" + servingSize +
                    ", servings=" + servings +
                    ", calories=" + calories +
                    ", fat=" + fat +
                    ", sodium=" + sodium +
                    ", carbohydrate=" + carbohydrate +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "NutritionFacts{" +
                "servingSize=" + servingSize +
                ", servings=" + servings +
                ", calories=" + calories +
                ", fat=" + fat +
                ", sodium=" + sodium +
                ", carbohydrate=" + carbohydrate +
                '}';
    }
}

