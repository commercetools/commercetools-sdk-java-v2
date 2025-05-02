
package com.commercetools.api.models.order;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class TaxedItemPriceDraftTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, TaxedItemPriceDraftBuilder builder) {
        TaxedItemPriceDraft taxedItemPriceDraft = builder.buildUnchecked();
        Assertions.assertThat(taxedItemPriceDraft).isInstanceOf(TaxedItemPriceDraft.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "totalNet",
                        TaxedItemPriceDraft.builder().totalNet(new com.commercetools.api.models.common.MoneyImpl()) },
                new Object[] { "totalGross", TaxedItemPriceDraft.builder()
                        .totalGross(new com.commercetools.api.models.common.MoneyImpl()) } };
    }

    @Test
    public void totalNet() {
        TaxedItemPriceDraft value = TaxedItemPriceDraft.of();
        value.setTotalNet(new com.commercetools.api.models.common.MoneyImpl());
        Assertions.assertThat(value.getTotalNet()).isEqualTo(new com.commercetools.api.models.common.MoneyImpl());
    }

    @Test
    public void totalGross() {
        TaxedItemPriceDraft value = TaxedItemPriceDraft.of();
        value.setTotalGross(new com.commercetools.api.models.common.MoneyImpl());
        Assertions.assertThat(value.getTotalGross()).isEqualTo(new com.commercetools.api.models.common.MoneyImpl());
    }
}
