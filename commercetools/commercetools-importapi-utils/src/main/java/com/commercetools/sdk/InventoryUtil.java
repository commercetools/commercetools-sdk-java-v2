
package com.commercetools.sdk;

import static com.commercetools.sdk.CommonImportUtil.getImportApiCustom;

import com.commercetools.api.models.channel.ChannelReference;
import com.commercetools.api.models.inventory.InventoryEntry;
import com.commercetools.importapi.models.common.ChannelKeyReference;
import com.commercetools.importapi.models.inventories.InventoryImport;

public class InventoryUtil {
    public InventoryImport toInventoryImport(InventoryEntry entry) {
        return InventoryImport.builder()
                .key(entry.getKey()) // required field
                .sku(entry.getSku()) // required field
                .quantityOnStock(entry.getQuantityOnStock()) // required field
                .restockableInDays(entry.getRestockableInDays())
                .expectedDelivery(entry.getExpectedDelivery())
                .reservationExpirationInMinutes(entry.getReservationExpirationInMinutes())
                .supplyChannel(getImportAPISupplyChannel(entry.getSupplyChannel()))
                .custom(getImportApiCustom(entry.getCustom()))
                .build();
    }

    private ChannelKeyReference getImportAPISupplyChannel(ChannelReference supplyChannel) {
        if (supplyChannel == null) {
            return null;
        }
        return ChannelKeyReference.builder().key(supplyChannel.getId()).build();
    }
}
