public class ClassesTheory {
    static Student {
        private String name;
        private int id;
        private double averageGrade;

        ClassesTheory(String name, int id, double averageGrade) {
            this.name = name;
            this.id = id;
            this.averageGrade = averageGrade;
        }

        public String getName(int id) {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public double getAverageGrade() {
            return averageGrade;
        }

        public void setAverageGrade(double averageGrade) {
            this.averageGrade = averageGrade;
        }
    }
}
