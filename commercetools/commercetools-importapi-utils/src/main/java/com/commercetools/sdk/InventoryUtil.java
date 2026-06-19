
package com.commercetools.sdk;


import com.commercetools.api.models.channel.ChannelReference;
import com.commercetools.api.models.inventory.InventoryEntry;
import com.commercetools.importapi.models.common.ChannelKeyReference;
import com.commercetools.importapi.models.inventories.InventoryImport;

public class InventoryUtil {
    private final KeyResolverService keyResolverService;
    private final CommonImportUtil util;
    public InventoryUtil() {
        keyResolverService = new ExpandObjResolverService();
        util = new CommonImportUtil(keyResolverService);
    }

    public InventoryUtil(final KeyResolverService resolverService) {
        keyResolverService = resolverService;
        util = new CommonImportUtil(keyResolverService);
    }

    public InventoryImport toInventoryImport(InventoryEntry entry) {
        return InventoryImport.builder()
                .key(entry.getKey()) // required field
                .sku(entry.getSku()) // required field
                .quantityOnStock(entry.getQuantityOnStock()) // required field
                .restockableInDays(entry.getRestockableInDays())
                .expectedDelivery(entry.getExpectedDelivery())
                .reservationExpirationInMinutes(entry.getReservationExpirationInMinutes())
                .supplyChannel(getImportAPISupplyChannel(entry.getSupplyChannel()))
                .custom(util.getImportApiCustom(entry.getCustom()))
                .build();
    }

    private ChannelKeyReference getImportAPISupplyChannel(ChannelReference supplyChannel) {
        if (supplyChannel == null) {
            return null;
        }
        return ChannelKeyReference.builder().key(keyResolverService.resolveKey(supplyChannel)).build();
    }
}
