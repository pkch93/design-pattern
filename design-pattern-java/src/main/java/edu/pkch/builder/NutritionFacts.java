package edu.pkch.builder;

public class NutritionFacts {
    private final int servingSize; // 1회 제공량, 필수
    private final int servings; // 총 n회 제공량, 필수
    private final int calories; // 칼로리, 선택
    private final int fat; // 지방, 선택
    private final int sodium; // 나트륨, 선택
    private final int carbohydrate; // 탄수화물, 선택

    private NutritionFacts(int servingSize, int servings, int calories, int fat, int sodium, int carbohydrate) {
        this.servingSize = servingSize;
        this.servings = servings;
        this.calories = calories;
        this.fat = fat;
        this.sodium = sodium;
        this.carbohydrate = carbohydrate;
    }

    public static Builder builder(int servingSize, int servings) {
        return new Builder(servingSize, servings);
    }

    public static class Builder {
        private final int servingSize; // 1회 제공량, 필수
        private final int servings; // 총 n회 제공량, 필수
        private int calories = 0; // 칼로리, 선택
        private int fat = 0; // 지방, 선택
        private int sodium = 0; // 나트륨, 선택
        private int carbohydrate = 0; // 탄수화물, 선택

        Builder(int servingSize, int servings) {
            this.servingSize = servingSize;
            this.servings = servings;
        }

        public Builder calories(int calories) {
            this.calories = calories;
            return this;
        }

        public Builder fat(int fat) {
            this.fat = fat;
            return this;
        }

        public Builder sodium(int sodium) {
            this.sodium = sodium;
            return this;
        }

        public Builder carbohydrate(int carbohydrate) {
            this.carbohydrate = carbohydrate;
            return this;
        }

        public NutritionFacts build() {
            return new NutritionFacts(servingSize, servings, calories, fat, sodium, carbohydrate);
        }
    }
}
