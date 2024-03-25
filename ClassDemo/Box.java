public class Box{
    int length;
    int breadth;
    int height;

    int volume(int length, int breadth, int height){
        int vol;
        vol = length * breadth * height;
        return vol;
    }
}