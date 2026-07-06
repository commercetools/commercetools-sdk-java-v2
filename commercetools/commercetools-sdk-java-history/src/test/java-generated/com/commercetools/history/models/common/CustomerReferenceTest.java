
package com.commercetools.history.models.common;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CustomerReferenceTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CustomerReferenceBuilder builder) {
        CustomerReference customerReference = builder.buildUnchecked();
        Assertions.assertThat(customerReference).isInstanceOf(CustomerReference.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "id", CustomerReference.builder().id("id") } };
    }

    @Test
    public void id() {
        CustomerReference value = CustomerReference.of();
        value.setId("id");
        Assertions.assertThat(value.getId()).isEqualTo("id");
    }
}
