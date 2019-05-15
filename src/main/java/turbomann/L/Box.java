package turbomann.L;

class Box {
    int weigh;
    int height;
    int depth;

    Box() {

    }

    Box(int len) {
        weigh = height = depth = len;
    }

    Box(int w, int h, int d) {
        weigh = w;
        height = h;
        depth = d;
    }

    public int getVolume() {
        return weigh * height * depth;
    }
}

class Thenew {
    public static void main(String[] args) {
        Box testBox = new Box(10, 10, 10);
        System.out.println(testBox.getVolume());

        Box cube = new Box(8);
        System.out.println(cube.getVolume());

    }
}


class Cat {
    int age;
    int birthday;


    Cat(int i, int j) {
        age = i;
        birthday = j;
    }


    Cat(int i) {
        this(i, i);


    }

    Cat() {
        this(0);
    }


}

class newTexst{
public static void main(String[]args){

    Cat Boris = new Cat (8);

    System.out.println("birtday cat Boris - "+ Boris.birthday + "Age of cat Boris - "+ Boris.age);

        }
        }









