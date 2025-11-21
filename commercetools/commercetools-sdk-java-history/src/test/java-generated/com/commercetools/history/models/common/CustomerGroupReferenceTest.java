
package com.commercetools.history.models.common;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CustomerGroupReferenceTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CustomerGroupReferenceBuilder builder) {
        CustomerGroupReference customerGroupReference = builder.buildUnchecked();
        Assertions.assertThat(customerGroupReference).isInstanceOf(CustomerGroupReference.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "id", CustomerGroupReference.builder().id("id") } };
    }

    @Test
    public void id() {
        CustomerGroupReference value = CustomerGroupReference.of();
        value.setId("id");
        Assertions.assertThat(value.getId()).isEqualTo("id");
    }
}
