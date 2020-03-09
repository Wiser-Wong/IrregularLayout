# IrregularLayout
不规则布局列表
## 截图
![images](https://github.com/Wiser-Wong/IrregularLayout/blob/master/images/irregular.jpg)

## 环境配置
    allprojects {
            repositories {
              ...
              maven { url 'https://jitpack.io' }
            }
          }

        dependencies {
              implementation 'com.github.Wiser-Wong:IrregularLayout:1.0.1'
      }
## 使用控件

     <com.wiser.irregular.IrregularLayout
        android:id="@+id/ill_layout"
        android:layout_width="0dp"
        android:layout_height="wrap_content"
        android:layout_margin="20dp"
        app:il_isFillSurplusWidth="false"
        app:il_layoutId="@layout/irregular_item"
        app:il_horizontalSpacing="3dp"
        app:il_verticalSpacing="3dp"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintLeft_toRightOf="@+id/iv_cover"
        app:layout_constraintRight_toRightOf="parent"/>

   
    irregular_item.xml
    <?xml version="1.0" encoding="utf-8"?>
    <TextView xmlns:android="http://schemas.android.com/apk/res/android"
        android:id="@+id/tv_align_text"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:background="@color/colorAccent"
        android:padding="10dp"
        android:textSize="12sp"
        android:text="ddddddd"/>
    
    MainActivity.class
    irregularLayout.setOnIrregularAdapter(new OnIrregularAdapter<String>() {
            @Override
            public void onCreateItemView(View itemView, int position, String s) {
                TextView textView = itemView.findViewById(R.id.tv_align_text);
                textView.setText(s);
            }
        });
        irregularLayout.setOnItemClickListener(new OnItemClickListener<String>() {
            @Override
            public void onItemClick(ViewGroup viewGroup, View view, int position, String s) {
                Toast.makeText(MainActivity.this,"s",Toast.LENGTH_LONG).show();
            }
        });

        List<String> list = new ArrayList<>();
        list.add("成语故事");
        list.add("你真是个奇葩人物");
        list.add("典故");
        list.add("我喜欢听故事");
        list.add("你讲给我听");

        irregularLayout.setItems(list);
        
## 操作手册
### IrregularLayout 不规则排版布局
* il_layoutId:item布局id
* il_isFillSurplusWidth:是否填充剩余宽度，并且是平分方式填充
* il_horizontalSpacing:横向距离
* il_verticalSpacing:纵向距离
