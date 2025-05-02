
package com.commercetools.api.models.customer_group;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CustomerGroupResourceIdentifierTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CustomerGroupResourceIdentifierBuilder builder) {
        CustomerGroupResourceIdentifier customerGroupResourceIdentifier = builder.buildUnchecked();
        Assertions.assertThat(customerGroupResourceIdentifier).isInstanceOf(CustomerGroupResourceIdentifier.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "id", CustomerGroupResourceIdentifier.builder().id("id") },
                new Object[] { "key", CustomerGroupResourceIdentifier.builder().key("key") } };
    }

    @Test
    public void id() {
        CustomerGroupResourceIdentifier value = CustomerGroupResourceIdentifier.of();
        value.setId("id");
        Assertions.assertThat(value.getId()).isEqualTo("id");
    }

    @Test
    public void key() {
        CustomerGroupResourceIdentifier value = CustomerGroupResourceIdentifier.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }
}
