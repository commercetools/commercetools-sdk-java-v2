
package com.commercetools.api.models.standalone_price;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class StagedStandalonePriceTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, StagedStandalonePriceBuilder builder) {
        StagedStandalonePrice stagedStandalonePrice = builder.buildUnchecked();
        Assertions.assertThat(stagedStandalonePrice).isInstanceOf(StagedStandalonePrice.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "value",
                        StagedStandalonePrice.builder()
                                .value(new com.commercetools.api.models.common.TypedMoneyImpl()) },
                new Object[] { "discounted", StagedStandalonePrice.builder()
                        .discounted(new com.commercetools.api.models.common.DiscountedPriceImpl()) } };
    }

    @Test
    public void value() {
        StagedStandalonePrice value = StagedStandalonePrice.of();
        value.setValue(new com.commercetools.api.models.common.TypedMoneyImpl());
        Assertions.assertThat(value.getValue()).isEqualTo(new com.commercetools.api.models.common.TypedMoneyImpl());
    }

    @Test
    public void discounted() {
        StagedStandalonePrice value = StagedStandalonePrice.of();
        value.setDiscounted(new com.commercetools.api.models.common.DiscountedPriceImpl());
        Assertions.assertThat(value.getDiscounted())
                .isEqualTo(new com.commercetools.api.models.common.DiscountedPriceImpl());
    }
}
