
package com.commercetools.sdk;

import static com.commercetools.sdk.TestUtils.stringFromResource;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import com.commercetools.api.models.customer.Customer;

import io.vrap.rmf.base.client.utils.json.JsonUtils;

import org.junit.jupiter.api.Test;

class CustomerUtilTest {
    private final CustomerUtil util = new CustomerUtil();

    @Test
    void shouldMapRequiredFields() {
        var customer = JsonUtils.fromJsonString(stringFromResource("src/test/resources/customer.example.json"),
            Customer.class);
        var result = util.toCustomerImport(customer);

        assertEquals("customer-key", result.getKey());
        assertEquals("test@example.com", result.getEmail());
    }

    @Test
    void shouldMapCustomerGroupKeyFromExpandedObj() {
        var customer = JsonUtils.fromJsonString(stringFromResource("src/test/resources/customer.example.json"),
            Customer.class);
        var result = util.toCustomerImport(customer);

        assertNotNull(result.getCustomerGroup());
        assertEquals("vip-group", result.getCustomerGroup().getKey()); // catches getId() bug
    }

    @Test
    void shouldMapAddressIndices() {
        var customer = JsonUtils.fromJsonString(stringFromResource("src/test/resources/customer.example.json"),
            Customer.class);
        var result = util.toCustomerImport(customer);

        // addr-0 is index 0, addr-1 is index 1
        assertEquals(0, result.getDefaultBillingAddress());
        assertEquals(1, result.getDefaultShippingAddress());
        assertEquals(List.of(0), result.getBillingAddresses());
        assertEquals(List.of(1), result.getShippingAddresses());
    }

    @Test
    void shouldMapAddresses() {
        var customer = JsonUtils.fromJsonString(stringFromResource("src/test/resources/customer.example.json"),
            Customer.class);
        var result = util.toCustomerImport(customer);

        assertEquals(2, result.getAddresses().size());
        assertEquals("DE", result.getAddresses().get(0).getCountry());
    }

    @Test
    void shouldHandleNullCustomerGroup() {
        var customer = JsonUtils.fromJsonString(stringFromResource("src/test/resources/customer.no-group.json"),
            Customer.class);
        var result = util.toCustomerImport(customer);
        assertNull(result.getCustomerGroup());
    }
}
