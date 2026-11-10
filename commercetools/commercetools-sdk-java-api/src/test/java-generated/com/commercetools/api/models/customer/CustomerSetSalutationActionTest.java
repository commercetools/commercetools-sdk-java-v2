
package com.commercetools.api.models.customer;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CustomerSetSalutationActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CustomerSetSalutationActionBuilder builder) {
        CustomerSetSalutationAction customerSetSalutationAction = builder.buildUnchecked();
        Assertions.assertThat(customerSetSalutationAction).isInstanceOf(CustomerSetSalutationAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "salutation", CustomerSetSalutationAction.builder().salutation("salutation") } };
    }

    @Test
    public void salutation() {
        CustomerSetSalutationAction value = CustomerSetSalutationAction.of();
        value.setSalutation("salutation");
        Assertions.assertThat(value.getSalutation()).isEqualTo("salutation");
    }
}
