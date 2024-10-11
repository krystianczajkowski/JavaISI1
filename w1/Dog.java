class Dog {
    String name;
    String breed;
    int age;

    public void bark() {
        System.out.println("Hau hau!");
    }

    Dog(String name, String breed, int age) {
        this.name = name;
        this.breed = breed;
        this.age = age;
    }

    public String toString() {
        return "This dog's name is " +
                this.name + ", it's a " + this.age +
                " year old " + this.breed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
