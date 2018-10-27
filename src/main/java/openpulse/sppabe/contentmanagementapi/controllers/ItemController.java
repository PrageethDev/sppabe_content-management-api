package openpulse.sppabe.contentmanagementapi.controllers;

import openpulse.sppabe.contentmanagementapi.entities.ItemService;
import openpulse.sppabe.contentmanagementapi.entities.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ItemController {

    @Autowired
    private ItemService itemService;

    @RequestMapping("/{storeId}/items")
    public List<Item> getAllStoreItems(@PathVariable String storeId){
        return itemService.getAllStoreItems(storeId);
    }

    @RequestMapping("/{storeId}/items/{itemID}")
    public Item getItem(@PathVariable("itemID") String itemId){
        return itemService.getItem(itemId);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/{storeId}/items")
    public void addItem(@RequestBody Item item){
        itemService.addItem(item);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/{storeId}/items/{itemID}")
    public String updateItem(@RequestBody Item item, @PathVariable("itemID") String itemID){
        String reply = itemService.updateItem(item, itemID);
        return reply;
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/{storeId}/items/{itemID}")
    public void deleteItem(@PathVariable String itemID){
        itemService.deleteItem(itemID);
    }


}
