
package com.commercetools.api.models.customer;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CustomerResourceIdentifierTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CustomerResourceIdentifierBuilder builder) {
        CustomerResourceIdentifier customerResourceIdentifier = builder.buildUnchecked();
        Assertions.assertThat(customerResourceIdentifier).isInstanceOf(CustomerResourceIdentifier.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "id", CustomerResourceIdentifier.builder().id("id") },
                new Object[] { "key", CustomerResourceIdentifier.builder().key("key") } };
    }

    @Test
    public void id() {
        CustomerResourceIdentifier value = CustomerResourceIdentifier.of();
        value.setId("id");
        Assertions.assertThat(value.getId()).isEqualTo("id");
    }

    @Test
    public void key() {
        CustomerResourceIdentifier value = CustomerResourceIdentifier.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }
}
