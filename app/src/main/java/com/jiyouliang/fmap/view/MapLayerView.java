package com.jiyouliang.fmap.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;

import com.jiyouliang.fmap.R;
import com.jiyouliang.fmap.util.LogUtil;

/**
 * 图层
 */
public class MapLayerView extends BaseIconView {

    private static final String TAG = "MapLayerView";


    public MapLayerView(Context context) {
        this(context, null);
    }

    public MapLayerView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public MapLayerView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }


    @Override
    public Bitmap createBitmap() {
        return BitmapFactory.decodeResource(getResources(), R.drawable.map_widget_layer_icon);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        LogUtil.d(TAG, "width=" + getMeasuredWidth() + ",height=" + getMeasuredHeight());
    }
}