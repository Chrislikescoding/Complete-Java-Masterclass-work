public class Person {

        private String firstName;
        private String secondName;
        private int age;

        public void setFirstName(String firstName){
            this.firstName = firstName;
        }

        public String getFirstName(){
            return this.firstName;
        }

        public void setSecondName(String secondName){
            this.secondName = secondName;
        }
        public String getsecondName(){
            return this.secondName;
        }
        public void setAge (int age) {
            if (age >=0 && age<=100)
                this.age = age;
            else
                this.age = 0;

        }
        public int getAge() {
            return this.age;
        }

        public boolean isTeen(){
            if (this.age >12 && this.age>20) {
                return true;
            }else
                return false;
        }
        public String getFullname(){
            return firstName + secondName;
        }
}
