package com.company;

/**
 * Created by idejesus on 18/03/2017.
 */
public class Button {
    private String mTitle;
    private OnClickListener mOnClickListener;

    public Button(String title) {
        mTitle = title;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setOnclickListener(OnClickListener onclickListener){
        mOnClickListener = onclickListener;
    }

    //button.onclick == monclicklistner.onlclick(mtitle) =
    public void onClick(){
        mOnClickListener.onClick(mTitle);
    }

    public interface OnClickListener {
        void onClick(String title);

    }
}
