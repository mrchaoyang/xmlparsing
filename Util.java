package codesample.xmlparsing;

/**
 * Created by Chuck on 8/25/2016.
 */
public class Util {
    public static String getPathById(String str, ItemlistType itemlist) {
        StringBuilder sb = new StringBuilder();
        int itemIndex=0;
        int subitemIndex=0;
        for(ItemType item: itemlist.getItems().getItems()){
            if (str.equals(item.getId())){      // found item id match
                sb.append("/itemlist/items[");
                sb.append(itemIndex);
                sb.append("]");
                sb.append("/id");
                break;
            }
            if (item.getSubitems()!=null){
                subitemIndex=0;
                for(SubitemType subitem: item.getSubitems().getSubitem()){
                    if (str.equals(subitem.getId())){
                        sb.append("/itemlist/items[");
                        sb.append(itemIndex);
                        sb.append("]");
                        sb.append("/subitems[");
                        sb.append(subitemIndex);
                        sb.append("]/id");
                        break;
                    }
                    subitemIndex++;
                }
                if (sb != null && sb.length()!=0)   // found subitem id match
                    break;
            }
            itemIndex++;
        }
        return sb.toString();
    }

    public static String getPathByLabel(String str, ItemlistType itemlist) {
        StringBuilder sb = new StringBuilder();
        int itemIndex=0;
        for(ItemType item: itemlist.getItems().getItems()){     // found item label match
            if (str.equals(item.getLabel())){
                sb.append("/itemlist/items[");
                sb.append(itemIndex);
                sb.append("]");
                sb.append("/label");
                break;
            }
            if (item.getSubitems()!=null){
                int subitemIndex=0;
                for(SubitemType subitem: item.getSubitems().getSubitem()){
                    if (str.equals(subitem.getLabel())){
                        sb.append("/itemlist/items[");
                        sb.append(itemIndex);
                        sb.append("]");
                        sb.append("/subitems[");
                        sb.append(subitemIndex);
                        sb.append("]/label");
                        break;
                    }
                    subitemIndex++;
                }
                if (sb != null && sb.length()!=0)   // found subitem label match
                    break;
            }
            itemIndex++;
        }
        return sb.toString();
    }

}
