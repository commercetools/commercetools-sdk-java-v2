
package com.commercetools.api.models.customer;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CustomerPasswordTokenReferenceTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CustomerPasswordTokenReferenceBuilder builder) {
        CustomerPasswordTokenReference customerPasswordTokenReference = builder.buildUnchecked();
        Assertions.assertThat(customerPasswordTokenReference).isInstanceOf(CustomerPasswordTokenReference.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "id", CustomerPasswordTokenReference.builder().id("id") } };
    }

    @Test
    public void id() {
        CustomerPasswordTokenReference value = CustomerPasswordTokenReference.of();
        value.setId("id");
        Assertions.assertThat(value.getId()).isEqualTo("id");
    }
}
