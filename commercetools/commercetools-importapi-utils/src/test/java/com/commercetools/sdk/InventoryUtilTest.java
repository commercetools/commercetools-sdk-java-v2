package com.commercetools.sdk;

import com.commercetools.api.models.inventory.InventoryEntry;
import io.vrap.rmf.base.client.utils.json.JsonUtils;
import org.junit.jupiter.api.Test;

import static com.commercetools.sdk.TestUtils.stringFromResource;
import static org.junit.jupiter.api.Assertions.*;

public class InventoryUtilTest {
    private final InventoryUtil util = new InventoryUtil();

    @Test
    void shouldMapRequiredFields() {
        var entry = JsonUtils.fromJsonString(stringFromResource("src/test/resources/inventory.example.json"), InventoryEntry.class);
        var result = util.toInventoryImport(entry);

        assertEquals("inventory-key", result.getKey());
        assertEquals("sku-001", result.getSku());
        assertEquals(100L, result.getQuantityOnStock());
    }

    @Test
    void shouldMapSupplyChannelKeyFromExpandedObj() {
        var entry = JsonUtils.fromJsonString(stringFromResource("src/test/resources/inventory.example.json"), InventoryEntry.class);
        var result = util.toInventoryImport(entry);

        assertNotNull(result.getSupplyChannel());
        assertEquals("channel-key", result.getSupplyChannel().getKey());  // catches getId() bug
    }

    @Test
    void shouldHandleNullSupplyChannel() {
        var entry = JsonUtils.fromJsonString(stringFromResource("src/test/resources/inventory.no-channel.json"), InventoryEntry.class);
        var result = util.toInventoryImport(entry);
        assertNull(result.getSupplyChannel());
    }
}
