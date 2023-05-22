
package com.commercetools;

import static com.commercetools.TestUtils.stringFromResource;
import static org.assertj.core.api.Assertions.assertThat;

import java.io.IOException;

import com.commercetools.api.models.customer.Customer;

import io.vrap.rmf.base.client.utils.json.JsonUtils;

import org.junit.jupiter.api.Test;

public class CustomersTest {
    @Test
    public void multipleAddresses() throws IOException {
        Customer customer = JsonUtils.fromJsonString(stringFromResource("customer.json"), Customer.class);

        assertThat(customer.getAddresses()).isNotEmpty();
    }
}
