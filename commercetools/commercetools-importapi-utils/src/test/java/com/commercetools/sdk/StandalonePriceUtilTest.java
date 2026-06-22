package com.commercetools.sdk;

import com.commercetools.api.models.standalone_price.StandalonePrice;
import io.vrap.rmf.base.client.utils.json.JsonUtils;
import org.junit.jupiter.api.Test;

import static com.commercetools.sdk.TestUtils.stringFromResource;
import static org.junit.jupiter.api.Assertions.*;

class StandalonePriceUtilTest {
    private final StandalonePriceUtil util = new StandalonePriceUtil();
    @Test
    void shouldMapRequiredFields() {
        var price = JsonUtils.fromJsonString(stringFromResource("src/test/resources/standalone-price.example.json"), StandalonePrice.class);
        var result = util.toStandalonePriceImport(price);

        assertEquals("price-key", result.getKey());
        assertEquals("sku-001", result.getSku());
        assertNotNull(result.getValue());
    }

    @Test
    void shouldMapChannelKeyFromExpandedObj() {
        var price = JsonUtils.fromJsonString(stringFromResource("src/test/resources/standalone-price.example.json"), StandalonePrice.class);
        var result = util.toStandalonePriceImport(price);
        assertEquals("channel-key", result.getChannel().getKey());  // catches getId() bug
    }

    @Test
    void shouldHandleNullDiscounted() {
        // fixture without "discounted" field
        var price = JsonUtils.fromJsonString(stringFromResource("src/test/resources/standalone-price.no-discount.json"), StandalonePrice.class);
        assertDoesNotThrow(() -> util.toStandalonePriceImport(price));
    }

    @Test
    void shouldMapPriceTiers() {
        var price = JsonUtils.fromJsonString(stringFromResource("src/test/resources/standalone-price.with-tiers.json"), StandalonePrice.class);
        var result = util.toStandalonePriceImport(price);
        assertEquals(2, result.getTiers().size());
        assertEquals(10L, result.getTiers().get(0).getMinimumQuantity());
    }
}
