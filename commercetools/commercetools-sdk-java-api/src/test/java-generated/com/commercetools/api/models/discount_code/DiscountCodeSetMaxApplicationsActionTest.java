
package com.commercetools.api.models.discount_code;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class DiscountCodeSetMaxApplicationsActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, DiscountCodeSetMaxApplicationsActionBuilder builder) {
        DiscountCodeSetMaxApplicationsAction discountCodeSetMaxApplicationsAction = builder.buildUnchecked();
        Assertions.assertThat(discountCodeSetMaxApplicationsAction)
                .isInstanceOf(DiscountCodeSetMaxApplicationsAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "maxApplications",
                DiscountCodeSetMaxApplicationsAction.builder().maxApplications(9L) } };
    }

    @Test
    public void maxApplications() {
        DiscountCodeSetMaxApplicationsAction value = DiscountCodeSetMaxApplicationsAction.of();
        value.setMaxApplications(9L);
        Assertions.assertThat(value.getMaxApplications()).isEqualTo(9L);
    }
}
