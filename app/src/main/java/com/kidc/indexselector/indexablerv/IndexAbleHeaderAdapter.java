package com.kidc.indexselector.indexablerv;

import java.util.List;


public abstract class IndexAbleHeaderAdapter<T> extends AbstractHeaderFooterAdapter<T>{

    public IndexAbleHeaderAdapter(String index, String indexTitle, List<T> datas) {
        super(index, indexTitle, datas);
    }

    @Override
    int getHeaderFooterType() {
        return EntityWrapper.TYPE_HEADER;
    }

    /**
     * set Content-ItemView click listener
     */
    public void setOnItemHeaderClickListener(OnItemHeaderClickListener<T> listener) {
        this.mListener = listener;
    }

    /**
     * set Content-ItemView longClick listener
     */
    public void setOnItemHeaderLongClickListener(OnItemHeaderLongClickListener<T> listener) {
        this.mLongListener = listener;
    }

    public interface OnItemHeaderClickListener<T> extends OnItemClickListener<T>{
    }

    public interface OnItemHeaderLongClickListener<T> extends OnItemLongClickListener<T>{
    }
}
