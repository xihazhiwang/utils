package han.design.prototype.deepclone;

import java.io.*;

public class DeepProtoType implements Serializable, Cloneable {

    public String name;

    private DeepCloneTarget target;

    public DeepProtoType() {
    }

    /**
     * 使用clone方法进行深拷贝
     *
     * @return
     * @throws CloneNotSupportedException
     */
    @Override
    protected Object clone() throws CloneNotSupportedException {
        Object deep = null;
        // 完成基本数据类型(含字符串)的克隆
        deep = super.clone();
        // 对引用类型的属性进行单独处理
        DeepProtoType deepProtoType = (DeepProtoType) deep;
        deepProtoType.target = (DeepCloneTarget) target.clone();
        return deep;
    }

    public Object deepClone() {
        // 创建流对象
        ByteArrayOutputStream bos = null;
        ObjectOutputStream oos = null;
        ByteArrayInputStream bis = null;
        ObjectInputStream ois = null;

        try {
            // 序列化
            bos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(bos);
            // 把当前对象以对象流的方式输出
            oos.writeObject(this);

            // 反序列化
            bis = new ByteArrayInputStream(bos.toByteArray());
            ois = new ObjectInputStream(bis);

            return ois.readObject();
        } catch (Exception e) {
            try {
                ois.close();
                oos.close();
                bos.close();
                bis.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }

        }
        return null;
    }
}
