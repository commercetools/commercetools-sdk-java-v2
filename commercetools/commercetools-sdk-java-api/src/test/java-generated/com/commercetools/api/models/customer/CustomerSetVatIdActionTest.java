
package com.commercetools.api.models.customer;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CustomerSetVatIdActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CustomerSetVatIdActionBuilder builder) {
        CustomerSetVatIdAction customerSetVatIdAction = builder.buildUnchecked();
        Assertions.assertThat(customerSetVatIdAction).isInstanceOf(CustomerSetVatIdAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "vatId", CustomerSetVatIdAction.builder().vatId("vatId") } };
    }

    @Test
    public void vatId() {
        CustomerSetVatIdAction value = CustomerSetVatIdAction.of();
        value.setVatId("vatId");
        Assertions.assertThat(value.getVatId()).isEqualTo("vatId");
    }
}
