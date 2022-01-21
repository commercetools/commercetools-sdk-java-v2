
package com.commercetools;

import java.io.IOException;

import com.commercetools.api.models.cart.CartOrigin;
import com.commercetools.api.models.common.Reference;
import com.commercetools.api.models.customer.CustomerReference;

import io.vrap.rmf.base.client.utils.json.JsonUtils;

import org.json.JSONException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.skyscreamer.jsonassert.*;

public class EnumTest {
    @Test
    public void testEnumInterface() throws IOException {
        final String customer = "\"Customer\"";

        final CartOrigin customerOrigin = JsonUtils.fromJsonString(customer, CartOrigin.class);

        Assertions.assertEquals(CartOrigin.CUSTOMER, customerOrigin);
        Assertions.assertEquals("CUSTOMER", customerOrigin.name());
        Assertions.assertEquals("Customer", customerOrigin.getJsonName());
        Assertions.assertEquals(customer, JsonUtils.toJsonString(customerOrigin));

        final String merchant = "\"Merchant\"";

        final CartOrigin merchantOrigin = JsonUtils.fromJsonString(merchant, CartOrigin.class);

        Assertions.assertEquals(CartOrigin.MERCHANT, merchantOrigin);
        Assertions.assertEquals("MERCHANT", merchantOrigin.name());
        Assertions.assertEquals("Merchant", merchantOrigin.getJsonName());
        Assertions.assertEquals(merchant, JsonUtils.toJsonString(merchantOrigin));

        final String unknown = "\"whatever\"";

        final CartOrigin unknownOrigin = JsonUtils.fromJsonString(unknown, CartOrigin.class);

        Assertions.assertEquals("WHATEVER", unknownOrigin.name());
        Assertions.assertEquals("whatever", unknownOrigin.getJsonName());
        Assertions.assertEquals(unknown, JsonUtils.toJsonString(unknownOrigin));
    }

    @Test
    public void testPolymorphEnum() throws IOException, JSONException {
        final String json = "{\"typeId\":\"customer\",\"id\":\"123\"}";

        final Reference customer = JsonUtils.fromJsonString(json, Reference.class);
        Assertions.assertTrue(customer instanceof CustomerReference);
        Assertions.assertNotNull(customer.getTypeId());
        Assertions.assertEquals("customer", customer.getTypeId().getJsonName());

        JSONAssert.assertEquals(json, JsonUtils.toJsonString(customer), true);
    }

    @Test
    public void testPolymorphUnknownEnum() throws IOException, JSONException {
        final String json = "{\"typeId\":\"whatever\",\"id\":\"123\"}";

        final Reference customer = JsonUtils.fromJsonString(json, Reference.class);
        Assertions.assertNotNull(customer.getTypeId());
        Assertions.assertEquals("whatever", customer.getTypeId().getJsonName());

        JSONAssert.assertEquals(json, JsonUtils.toJsonString(customer), true);
    }
}
