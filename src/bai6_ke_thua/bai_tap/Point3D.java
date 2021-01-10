package bai6_ke_thua.bai_tap;

public class Point3D extends Point2D {
    private float z = 0.0f;

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public Point3D(float z) {
        this.z = z;
    }

    public Point3D() {
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public void setXYZ(float x, float y, float z){
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public float[] getXYZ(){
        float[] array1 = new float[3];
        array1[0] = this.x;
        array1[1] = this.y;
        array1[2] = this.z;
        return array1;

    }

    @Override
    public String toString() {
        return "Point3D =[" +
                x +", "
                + y + ", " + z +
                "]";
    }
}
