
package com.commercetools;

import java.io.IOException;

import com.commercetools.api.models.cart.CartOrigin;
import com.commercetools.api.models.common.Reference;
import com.commercetools.api.models.customer.CustomerReference;

import io.vrap.rmf.base.client.utils.json.JsonUtils;

import org.json.JSONException;
import org.junit.Assert;
import org.junit.Test;
import org.skyscreamer.jsonassert.*;

public class EnumTest {
    @Test
    public void testEnumInterface() throws IOException {
        final String customer = "\"Customer\"";

        final CartOrigin customerOrigin = JsonUtils.fromJsonString(customer, CartOrigin.class);

        Assert.assertEquals(CartOrigin.CUSTOMER, customerOrigin);
        Assert.assertEquals("CUSTOMER", customerOrigin.name());
        Assert.assertEquals("Customer", customerOrigin.getJsonName());
        Assert.assertEquals(customer, JsonUtils.toJsonString(customerOrigin));

        final String merchant = "\"Merchant\"";

        final CartOrigin merchantOrigin = JsonUtils.fromJsonString(merchant, CartOrigin.class);

        Assert.assertEquals(CartOrigin.MERCHANT, merchantOrigin);
        Assert.assertEquals("MERCHANT", merchantOrigin.name());
        Assert.assertEquals("Merchant", merchantOrigin.getJsonName());
        Assert.assertEquals(merchant, JsonUtils.toJsonString(merchantOrigin));

        final String unknown = "\"whatever\"";

        final CartOrigin unknownOrigin = JsonUtils.fromJsonString(unknown, CartOrigin.class);

        Assert.assertEquals("WHATEVER", unknownOrigin.name());
        Assert.assertEquals("whatever", unknownOrigin.getJsonName());
        Assert.assertEquals(unknown, JsonUtils.toJsonString(unknownOrigin));
    }

    @Test
    public void testPolymorphEnum() throws IOException, JSONException {
        final String json = "{\"typeId\":\"customer\",\"id\":\"123\"}";

        final Reference customer = JsonUtils.fromJsonString(json, Reference.class);
        Assert.assertTrue(customer instanceof CustomerReference);
        Assert.assertNotNull(customer.getTypeId());
        Assert.assertEquals("customer", customer.getTypeId().getJsonName());

        JSONAssert.assertEquals(json, JsonUtils.toJsonString(customer), true);
    }

    @Test
    public void testPolymorphUnknownEnum() throws IOException, JSONException {
        final String json = "{\"typeId\":\"whatever\",\"id\":\"123\"}";

        final Reference customer = JsonUtils.fromJsonString(json, Reference.class);
        Assert.assertNotNull(customer.getTypeId());
        Assert.assertEquals("whatever", customer.getTypeId().getJsonName());

        JSONAssert.assertEquals(json, JsonUtils.toJsonString(customer), true);
    }
}
