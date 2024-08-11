class Point {
    int x, y;

    Point(int a, int b) {
        x = a;
        y = b;
    }
}

public class Arrays {
    public static void main(Strings args[]) {
        int[] a, b;
        a = new int[5];
        b = new int[10];

        int c[], d;
        c = new int[5];
        d = 20;

        float[] e = new float[5];
        double[] f = { 20.5, 30, 50.250 };

        Point pointArray[], pointObj;

        pointObj = new Point(20, 30);

        pointArray = new Point[3];
        pointArray[0] = pointObj;

        for (int i = 0; i < pointArray.length; i++) {
            if (pointArray[i] != null)
                System.out.printf("%d,%d", pointArray[i].x, pointArray[i].y);
        }
    }
}