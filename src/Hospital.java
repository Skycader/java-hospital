public class Hospital {

    //Пациенты (температура цельсия);
    private int[] patients = {};

    public Hospital(int people) {
        this.patients = new int[people];

        for (int i = 0; i< patients.length; i++) {
            patients[i] = (int) Math.round(Math.random()*11) + 32;
        }
    }

    //Вычислить количество здоровых пациентов
    public int getHealthy() {
        int healthy = 0;

        for (int patient : patients) {
            if (patient == 36) healthy++;
        }

        return healthy;
    }

    public int getAverageTemperature() {
        int average = 0;
        for (int pacient : patients) {
            average+=pacient;
        }

        return average/patients.length;
    }
}
