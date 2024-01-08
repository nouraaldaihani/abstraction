class Teacher extends Person {
    public String subject; 
    public Teacher(String name, String subject) {
        super(name); 
        this.subject = subject; 
    }

 @Override
    void describeRole() {
        System.out.println(getName() + " teach  " + subject);
    }
}