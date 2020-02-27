package han.design.prototype.deepclone;

import java.io.Serializable;

public class DeepCloneTarget implements Cloneable, Serializable {

    private String cloneName;

    private String  cloneClass;

    public DeepCloneTarget(String cloneName, String cloneClass) {
        this.cloneName = cloneName;
        this.cloneClass = cloneClass;
    }

    /**
     * 默认拷贝，会对基本数据类型和字符串进行值复制
     * @return
     * @throws CloneNotSupportedException
     */
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
