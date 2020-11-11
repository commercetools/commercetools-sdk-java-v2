package commercetools;

import com.commercetools.api.models.cart.CartOrigin;
import com.commercetools.api.models.common.Reference;
import com.commercetools.api.models.customer.CustomerReference;
import io.vrap.rmf.base.client.utils.json.VrapJsonUtils;
import org.json.JSONException;
import org.skyscreamer.jsonassert.*;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class EnumTest {
    @Test
    public void testEnumInterface() throws IOException {
        final String customer = "\"Customer\"";

        final CartOrigin customerOrigin = VrapJsonUtils.fromJsonString(customer, CartOrigin.class);

        Assert.assertEquals(CartOrigin.CUSTOMER, customerOrigin);
        Assert.assertEquals("CUSTOMER", customerOrigin.name());
        Assert.assertEquals("Customer", customerOrigin.getJsonName());
        Assert.assertEquals(customer, VrapJsonUtils.toJsonString(customerOrigin));

        final String merchant = "\"Merchant\"";

        final CartOrigin merchantOrigin = VrapJsonUtils.fromJsonString(merchant, CartOrigin.class);

        Assert.assertEquals(CartOrigin.MERCHANT, merchantOrigin);
        Assert.assertEquals("MERCHANT", merchantOrigin.name());
        Assert.assertEquals("Merchant", merchantOrigin.getJsonName());
        Assert.assertEquals(merchant, VrapJsonUtils.toJsonString(merchantOrigin));

        final String unknown = "\"whatever\"";

        final CartOrigin unknownOrigin = VrapJsonUtils.fromJsonString(unknown, CartOrigin.class);

        Assert.assertEquals("WHATEVER", unknownOrigin.name());
        Assert.assertEquals("whatever", unknownOrigin.getJsonName());
        Assert.assertEquals(unknown, VrapJsonUtils.toJsonString(unknownOrigin));
    }

    @Test
    public void testPolymorphEnum() throws IOException, JSONException {
        final String json = "{\"typeId\":\"customer\",\"id\":\"123\"}";

        final Reference customer = VrapJsonUtils.fromJsonString(json, Reference.class);
        Assert.assertTrue(customer instanceof CustomerReference);
        Assert.assertNotNull(customer.getTypeId());
        Assert.assertEquals("customer", customer.getTypeId().getJsonName());

        JSONAssert.assertEquals(json, VrapJsonUtils.toJsonString(customer), true);
    }

    @Test
    public void testPolymorphUnknownEnum() throws IOException, JSONException {
        final String json = "{\"typeId\":\"whatever\",\"id\":\"123\"}";

        final Reference customer = VrapJsonUtils.fromJsonString(json, Reference.class);
        Assert.assertNotNull(customer.getTypeId());
        Assert.assertEquals("whatever", customer.getTypeId().getJsonName());

        JSONAssert.assertEquals(json, VrapJsonUtils.toJsonString(customer), true);
    }
}
