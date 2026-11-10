
package com.commercetools.api.models.customer;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CustomerEmailTokenReferenceTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CustomerEmailTokenReferenceBuilder builder) {
        CustomerEmailTokenReference customerEmailTokenReference = builder.buildUnchecked();
        Assertions.assertThat(customerEmailTokenReference).isInstanceOf(CustomerEmailTokenReference.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "id", CustomerEmailTokenReference.builder().id("id") } };
    }

    @Test
    public void id() {
        CustomerEmailTokenReference value = CustomerEmailTokenReference.of();
        value.setId("id");
        Assertions.assertThat(value.getId()).isEqualTo("id");
    }
}
