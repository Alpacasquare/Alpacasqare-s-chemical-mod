package net.alpacasqare_chemical_mod.enter;

import net.alpacasqare_chemical_mod.Item.Elements;

public class RegisterItemAll {
    public RegisterItemAll(){
        Elements elements= new Elements();//调用Elements类构造方法
        elements.onInitialize ();//实现注册元素物品
    }
}
