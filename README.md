# 查看演示:[demo演示]( http://renhuan.aizhifou.cn/ed36e0f2f626064bbdd7acba4b2b4c12.mp4 )

# 使用说明（两步走）

### 第一步 在xml添加view

```xml
<com.android.lyqlib.LyqStickView
    android:id="@+id/lyqStickView"
    android:layout_width="match_parent"
    android:layout_height="match_parent" />
```

### 第二步  在java代码设置adapter和head

```java
lyqStickView.addHead(View.inflate(this, R.layout.head, null))
lyqStickView.setAdapter(
    supportFragmentManager,
    arrayListOf("录播中心", "直播中心"),
    arrayListOf(BlankFragment(), BlankFragment()))
```