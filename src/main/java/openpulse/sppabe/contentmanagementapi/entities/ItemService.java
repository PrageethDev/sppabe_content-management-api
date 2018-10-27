package openpulse.sppabe.contentmanagementapi.entities;

import openpulse.sppabe.contentmanagementapi.persistence.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ItemService {

    @Autowired
    private ItemRepository itemRepository;

    public List<Item> getAllStoreItems(String storeID){
        return itemRepository.storeID(storeID);
    }

    public Item getItem(String itemID){
        return itemRepository.itemID(itemID);
    }

    public void addItem(Item item){
        itemRepository.save(item);
    }

    public String updateItem(Item item, String itemID){
        if(item.getItemID().equals(itemID)){
        itemRepository.save(item);
        }else {
            return "Wrong Item ID";
        }
        return "200 OK";
    }

    public void deleteItem(String itemId){
        itemRepository.deleteById(itemId);
    }

}
