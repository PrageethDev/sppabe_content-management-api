package openpulse.sppabe.contentmanagementapi.persistence;

import openpulse.sppabe.contentmanagementapi.entities.Item;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;


public interface ItemRepository extends MongoRepository<Item, String> {


    List<Item> storeID(String storeID);
    Item itemID(String itemID);
    List<Item> itemName(String itemName);
    List<Item> itemPrice(String itemPrice);

    Item save(Item item);

    void deleteById(String itemID);
}
