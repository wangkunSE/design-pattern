package com.soul.wk.prototype;

public class Head implements Cloneable{

    private Face face;

    public Head() {
    }

    public Head(Face face) {
        this.face = face;
    }

    public Face getFace() {
        return face;
    }

    public void setFace(Face face) {
        this.face = face;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Head head = (Head) super.clone();
        head.face = (Face) this.face.clone();
        return head;
    }

    @Override
    public String toString() {
        return "Head{" +
                "face=" + face +
                '}';
    }
}
