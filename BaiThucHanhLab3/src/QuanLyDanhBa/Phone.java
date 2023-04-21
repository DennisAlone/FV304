package QuanLyDanhBa;

abstract Phone{
    abstract void insertPhone(String name, String phone);
    abstract void removePhone(String name);
    abstract void updatePhone(String name, String newPhone);
    abstract String searchPhone(String name);
    abstract void sort();

}
