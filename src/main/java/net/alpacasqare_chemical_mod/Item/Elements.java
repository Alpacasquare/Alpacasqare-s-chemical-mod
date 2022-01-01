package net.alpacasqare_chemical_mod.Item;

import net.alpacasqare_chemical_mod.ItemGroup.ElementGroup;
import net.alpacasqare_chemical_mod.enter.Alpacasqare_Chemical_mod;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import java.util.ArrayList;
import java.util.List;

public class Elements implements ModInitializer {

    public Elements(){
        //构造方法
        List<String> E_list=new ArrayList<>();//创建新集合类以遍历元素表
        E_list.add("H");
        E_list.add("He");
        E_list.add("Li");
        E_list.add("Be");
        E_list.add("B");
        E_list.add("C");
        E_list.add("N");
        E_list.add("O");
        E_list.add("F");//
        E_list.add("Ne");
        E_list.add("Na");
        E_list.add("Mg");
        E_list.add("Al");
        E_list.add("Si");
        E_list.add("P");
        E_list.add("S");
        E_list.add("Cl");
        E_list.add("Ar");
        E_list.add("K");
        E_list.add("Ca");
        E_list.add("Sc");
        E_list.add("Ti");
        E_list.add("V");
        E_list.add("Cr");
        E_list.add("Mn");
        E_list.add("Fe");
        E_list.add("Co");
        E_list.add("Ni");
        E_list.add("Cu");
        E_list.add("Zn");
        E_list.add("Ga");
        E_list.add("Ge");
        E_list.add("As");
        E_list.add("Se");
        E_list.add("Br");
        E_list.add("Kr");
        E_list.add("Rb");
        E_list.add("Sr");
        E_list.add("Y");
        E_list.add("Zr");
        E_list.add("Nb");
        E_list.add("Mo");
        E_list.add("Tc");
        E_list.add("Ru");
        E_list.add("Rh");
        E_list.add("Pd");
        E_list.add("Ag");//银
        E_list.add("Cd");
        E_list.add("In");
        E_list.add("Sn");
        E_list.add("Sb");
        E_list.add("Te");
        E_list.add("I");
        E_list.add("Xe");
        E_list.add("Cs");
        E_list.add("Ba");
        E_list.add("La");//镧系
        E_list.add("Ce");
        E_list.add("Pr");
        E_list.add("Nd");
        E_list.add("Pm");
        E_list.add("Sm");
        E_list.add("Eu");
        E_list.add("Gd");
        E_list.add("Tb");
        E_list.add("Dy");
        E_list.add("Ho");
        E_list.add("Er");
        E_list.add("Tm");
        E_list.add("Yb");
        E_list.add("Lu");//
        E_list.add("Hf");
        E_list.add("Ta");
        E_list.add("W");
        E_list.add("Re");
        E_list.add("Os");
        E_list.add("Ir");
        E_list.add("Pt");
        E_list.add("Au");
        E_list.add("Hg");
        E_list.add("Tl");
        E_list.add("Pb");
        E_list.add("Bi");
        E_list.add("Po");
        E_list.add("At");
        E_list.add("Rn");
        E_list.add("Fr");
        E_list.add("Ra");
        E_list.add("Ac");
        E_list.add("Th");
        E_list.add("Pa");
        E_list.add("U");
        E_list.add("Np");
        E_list.add("Pu");
        E_list.add("Am");//镅
        //for (String s : E_list) {
            //Alpacasqare_Chemical_mod.LOGGER.info("public static final Item " + s + "= new Item(new FabricItemSettings().group(ElementGroup.ACM_Elements_GROUP));");
        }
    //构造方法

    //元素的实例创建对象
    public static final Item H = new Item(new FabricItemSettings().group(ElementGroup.ACM_Elements_GROUP));
    public static final Item He= new Item(new FabricItemSettings().group(ElementGroup.ACM_Elements_GROUP));
 public static final Item Li= new Item(new FabricItemSettings().group(ElementGroup.ACM_Elements_GROUP));
 public static final Item Be= new Item(new FabricItemSettings().group(ElementGroup.ACM_Elements_GROUP));
 public static final Item B= new Item(new FabricItemSettings().group(ElementGroup.ACM_Elements_GROUP));
 public static final Item C= new Item(new FabricItemSettings().group(ElementGroup.ACM_Elements_GROUP));
 public static final Item N= new Item(new FabricItemSettings().group(ElementGroup.ACM_Elements_GROUP));
public static final Item O= new Item(new FabricItemSettings().group(ElementGroup.ACM_Elements_GROUP));
 public static final Item F= new Item(new FabricItemSettings().group(ElementGroup.ACM_Elements_GROUP));
 public static final Item Ne= new Item(new FabricItemSettings().group(ElementGroup.ACM_Elements_GROUP));
public static final Item Na= new Item(new FabricItemSettings().group(ElementGroup.ACM_Elements_GROUP));
 public static final Item Mg= new Item(new FabricItemSettings().group(ElementGroup.ACM_Elements_GROUP));
 public static final Item Al= new Item(new FabricItemSettings().group(ElementGroup.ACM_Elements_GROUP));
 public static final Item Si= new Item(new FabricItemSettings().group(ElementGroup.ACM_Elements_GROUP));
 public static final Item P= new Item(new FabricItemSettings().group(ElementGroup.ACM_Elements_GROUP));
 public static final Item S= new Item(new FabricItemSettings().group(ElementGroup.ACM_Elements_GROUP));
 public static final Item Cl= new Item(new FabricItemSettings().group(ElementGroup.ACM_Elements_GROUP));
 public static final Item Ar= new Item(new FabricItemSettings().group(ElementGroup.ACM_Elements_GROUP));
 public static final Item K= new Item(new FabricItemSettings().group(ElementGroup.ACM_Elements_GROUP));
 public static final Item Ca= new Item(new FabricItemSettings().group(ElementGroup.ACM_Elements_GROUP));
 public static final Item Sc= new Item(new FabricItemSettings().group(ElementGroup.ACM_Elements_GROUP));
 public static final Item Ti= new Item(new FabricItemSettings().group(ElementGroup.ACM_Elements_GROUP));
 public static final Item V= new Item(new FabricItemSettings().group(ElementGroup.ACM_Elements_GROUP));
public static final Item Cr= new Item(new FabricItemSettings().group(ElementGroup.ACM_Elements_GROUP));
 public static final Item Mn= new Item(new FabricItemSettings().group(ElementGroup.ACM_Elements_GROUP));
 public static final Item Fe= new Item(new FabricItemSettings().group(ElementGroup.ACM_Elements_GROUP));
 public static final Item Co= new Item(new FabricItemSettings().group(ElementGroup.ACM_Elements_GROUP));
 public static final Item Ni= new Item(new FabricItemSettings().group(ElementGroup.ACM_Elements_GROUP));
 public static final Item Cu= new Item(new FabricItemSettings().group(ElementGroup.ACM_Elements_GROUP));
 public static final Item Zn= new Item(new FabricItemSettings().group(ElementGroup.ACM_Elements_GROUP));
 public static final Item Ga= new Item(new FabricItemSettings().group(ElementGroup.ACM_Elements_GROUP));
 public static final Item Ge= new Item(new FabricItemSettings().group(ElementGroup.ACM_Elements_GROUP));
 public static final Item As= new Item(new FabricItemSettings().group(ElementGroup.ACM_Elements_GROUP));
 public static final Item Se= new Item(new FabricItemSettings().group(ElementGroup.ACM_Elements_GROUP));
 public static final Item Br= new Item(new FabricItemSettings().group(ElementGroup.ACM_Elements_GROUP));
 public static final Item Kr= new Item(new FabricItemSettings().group(ElementGroup.ACM_Elements_GROUP));
 public static final Item Rb= new Item(new FabricItemSettings().group(ElementGroup.ACM_Elements_GROUP));
 public static final Item Sr= new Item(new FabricItemSettings().group(ElementGroup.ACM_Elements_GROUP));
 public static final Item Y= new Item(new FabricItemSettings().group(ElementGroup.ACM_Elements_GROUP));
 public static final Item Zr= new Item(new FabricItemSettings().group(ElementGroup.ACM_Elements_GROUP));
 public static final Item Nb= new Item(new FabricItemSettings().group(ElementGroup.ACM_Elements_GROUP));
 public static final Item Mo= new Item(new FabricItemSettings().group(ElementGroup.ACM_Elements_GROUP));
    public static final Item Tc= new Item(new FabricItemSettings().group(ElementGroup.ACM_Elements_GROUP));
 public static final Item Ru= new Item(new FabricItemSettings().group(ElementGroup.ACM_Elements_GROUP));
 public static final Item Rh= new Item(new FabricItemSettings().group(ElementGroup.ACM_Elements_GROUP));
 public static final Item Pd= new Item(new FabricItemSettings().group(ElementGroup.ACM_Elements_GROUP));
 public static final Item Ag= new Item(new FabricItemSettings().group(ElementGroup.ACM_Elements_GROUP));
 public static final Item Cd= new Item(new FabricItemSettings().group(ElementGroup.ACM_Elements_GROUP));
 public static final Item In= new Item(new FabricItemSettings().group(ElementGroup.ACM_Elements_GROUP));
 public static final Item Sn= new Item(new FabricItemSettings().group(ElementGroup.ACM_Elements_GROUP));
 public static final Item Sb= new Item(new FabricItemSettings().group(ElementGroup.ACM_Elements_GROUP));
 public static final Item Te= new Item(new FabricItemSettings().group(ElementGroup.ACM_Elements_GROUP));
 public static final Item I= new Item(new FabricItemSettings().group(ElementGroup.ACM_Elements_GROUP));
 public static final Item Xe= new Item(new FabricItemSettings().group(ElementGroup.ACM_Elements_GROUP));
 public static final Item Cs= new Item(new FabricItemSettings().group(ElementGroup.ACM_Elements_GROUP));
 public static final Item Ba= new Item(new FabricItemSettings().group(ElementGroup.ACM_Elements_GROUP));
 public static final Item La= new Item(new FabricItemSettings().group(ElementGroup.ACM_Elements_GROUP));
 public static final Item Ce= new Item(new FabricItemSettings().group(ElementGroup.ACM_Elements_GROUP));
 public static final Item Pr= new Item(new FabricItemSettings().group(ElementGroup.ACM_Elements_GROUP));
public static final Item Nd= new Item(new FabricItemSettings().group(ElementGroup.ACM_Elements_GROUP));
 public static final Item Pm= new Item(new FabricItemSettings().group(ElementGroup.ACM_Elements_GROUP));
 public static final Item Sm= new Item(new FabricItemSettings().group(ElementGroup.ACM_Elements_GROUP));
 public static final Item Eu= new Item(new FabricItemSettings().group(ElementGroup.ACM_Elements_GROUP));
 public static final Item Gd= new Item(new FabricItemSettings().group(ElementGroup.ACM_Elements_GROUP));
 public static final Item Tb= new Item(new FabricItemSettings().group(ElementGroup.ACM_Elements_GROUP));
 public static final Item Dy= new Item(new FabricItemSettings().group(ElementGroup.ACM_Elements_GROUP));
 public static final Item Ho= new Item(new FabricItemSettings().group(ElementGroup.ACM_Elements_GROUP));
 public static final Item Er= new Item(new FabricItemSettings().group(ElementGroup.ACM_Elements_GROUP));
 public static final Item Tm= new Item(new FabricItemSettings().group(ElementGroup.ACM_Elements_GROUP));
 public static final Item Yb= new Item(new FabricItemSettings().group(ElementGroup.ACM_Elements_GROUP));
 public static final Item Lu= new Item(new FabricItemSettings().group(ElementGroup.ACM_Elements_GROUP));
 public static final Item Hf= new Item(new FabricItemSettings().group(ElementGroup.ACM_Elements_GROUP));
 public static final Item Ta= new Item(new FabricItemSettings().group(ElementGroup.ACM_Elements_GROUP));
 public static final Item W= new Item(new FabricItemSettings().group(ElementGroup.ACM_Elements_GROUP));
 public static final Item Re= new Item(new FabricItemSettings().group(ElementGroup.ACM_Elements_GROUP));
 public static final Item Os= new Item(new FabricItemSettings().group(ElementGroup.ACM_Elements_GROUP));
 public static final Item Ir= new Item(new FabricItemSettings().group(ElementGroup.ACM_Elements_GROUP));
 public static final Item Pt= new Item(new FabricItemSettings().group(ElementGroup.ACM_Elements_GROUP));
 public static final Item Au= new Item(new FabricItemSettings().group(ElementGroup.ACM_Elements_GROUP));
 public static final Item Hg= new Item(new FabricItemSettings().group(ElementGroup.ACM_Elements_GROUP));
 public static final Item Tl= new Item(new FabricItemSettings().group(ElementGroup.ACM_Elements_GROUP));
 public static final Item Pb= new Item(new FabricItemSettings().group(ElementGroup.ACM_Elements_GROUP));
 public static final Item Bi= new Item(new FabricItemSettings().group(ElementGroup.ACM_Elements_GROUP));
 public static final Item Po= new Item(new FabricItemSettings().group(ElementGroup.ACM_Elements_GROUP));
 public static final Item At= new Item(new FabricItemSettings().group(ElementGroup.ACM_Elements_GROUP));
 public static final Item Rn= new Item(new FabricItemSettings().group(ElementGroup.ACM_Elements_GROUP));
 public static final Item Fr= new Item(new FabricItemSettings().group(ElementGroup.ACM_Elements_GROUP));
 public static final Item Ra= new Item(new FabricItemSettings().group(ElementGroup.ACM_Elements_GROUP));
 public static final Item Ac= new Item(new FabricItemSettings().group(ElementGroup.ACM_Elements_GROUP));
 public static final Item Th= new Item(new FabricItemSettings().group(ElementGroup.ACM_Elements_GROUP));
 public static final Item Pa= new Item(new FabricItemSettings().group(ElementGroup.ACM_Elements_GROUP));
 public static final Item U= new Item(new FabricItemSettings().group(ElementGroup.ACM_Elements_GROUP));
 public static final Item Np= new Item(new FabricItemSettings().group(ElementGroup.ACM_Elements_GROUP));
 public static final Item Pu= new Item(new FabricItemSettings().group(ElementGroup.ACM_Elements_GROUP));
 public static final Item Am= new Item(new FabricItemSettings().group(ElementGroup.ACM_Elements_GROUP));

    @Override
        //注册物品
        public void onInitialize () {
        Registry.register(Registry.ITEM, new Identifier("acm", "h"), H);
    }
}