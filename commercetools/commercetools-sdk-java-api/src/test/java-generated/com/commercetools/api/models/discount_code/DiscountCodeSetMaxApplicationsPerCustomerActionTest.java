
package com.commercetools.api.models.discount_code;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class DiscountCodeSetMaxApplicationsPerCustomerActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, DiscountCodeSetMaxApplicationsPerCustomerActionBuilder builder) {
        DiscountCodeSetMaxApplicationsPerCustomerAction discountCodeSetMaxApplicationsPerCustomerAction = builder
                .buildUnchecked();
        Assertions.assertThat(discountCodeSetMaxApplicationsPerCustomerAction)
                .isInstanceOf(DiscountCodeSetMaxApplicationsPerCustomerAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "maxApplicationsPerCustomer",
                DiscountCodeSetMaxApplicationsPerCustomerAction.builder().maxApplicationsPerCustomer(5L) } };
    }

    @Test
    public void maxApplicationsPerCustomer() {
        DiscountCodeSetMaxApplicationsPerCustomerAction value = DiscountCodeSetMaxApplicationsPerCustomerAction.of();
        value.setMaxApplicationsPerCustomer(5L);
        Assertions.assertThat(value.getMaxApplicationsPerCustomer()).isEqualTo(5L);
    }
}
