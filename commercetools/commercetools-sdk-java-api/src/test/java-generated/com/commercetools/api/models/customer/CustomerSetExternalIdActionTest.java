
package com.commercetools.api.models.customer;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CustomerSetExternalIdActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CustomerSetExternalIdActionBuilder builder) {
        CustomerSetExternalIdAction customerSetExternalIdAction = builder.buildUnchecked();
        Assertions.assertThat(customerSetExternalIdAction).isInstanceOf(CustomerSetExternalIdAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "externalId", CustomerSetExternalIdAction.builder().externalId("externalId") } };
    }

    @Test
    public void externalId() {
        CustomerSetExternalIdAction value = CustomerSetExternalIdAction.of();
        value.setExternalId("externalId");
        Assertions.assertThat(value.getExternalId()).isEqualTo("externalId");
    }
}
