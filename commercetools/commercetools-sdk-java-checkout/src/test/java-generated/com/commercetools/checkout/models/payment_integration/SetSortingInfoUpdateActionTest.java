
package com.commercetools.checkout.models.payment_integration;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class SetSortingInfoUpdateActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, SetSortingInfoUpdateActionBuilder builder) {
        SetSortingInfoUpdateAction setSortingInfoUpdateAction = builder.buildUnchecked();
        Assertions.assertThat(setSortingInfoUpdateAction).isInstanceOf(SetSortingInfoUpdateAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "sortingInfo", SetSortingInfoUpdateAction.builder()
                .sortingInfo(new com.commercetools.checkout.models.payment_integration.SortingInfoImpl()) } };
    }

    @Test
    public void sortingInfo() {
        SetSortingInfoUpdateAction value = SetSortingInfoUpdateAction.of();
        value.setSortingInfo(new com.commercetools.checkout.models.payment_integration.SortingInfoImpl());
        Assertions.assertThat(value.getSortingInfo())
                .isEqualTo(new com.commercetools.checkout.models.payment_integration.SortingInfoImpl());
    }
}
