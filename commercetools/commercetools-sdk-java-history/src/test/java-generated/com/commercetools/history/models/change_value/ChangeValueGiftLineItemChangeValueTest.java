
package com.commercetools.history.models.change_value;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ChangeValueGiftLineItemChangeValueTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ChangeValueGiftLineItemChangeValueBuilder builder) {
        ChangeValueGiftLineItemChangeValue changeValueGiftLineItemChangeValue = builder.buildUnchecked();
        Assertions.assertThat(changeValueGiftLineItemChangeValue)
                .isInstanceOf(ChangeValueGiftLineItemChangeValue.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "product",
                        ChangeValueGiftLineItemChangeValue.builder()
                                .product(new com.commercetools.history.models.common.ReferenceImpl()) },
                new Object[] { "variantId", ChangeValueGiftLineItemChangeValue.builder().variantId(5) },
                new Object[] { "supplyChannel",
                        ChangeValueGiftLineItemChangeValue.builder()
                                .supplyChannel(new com.commercetools.history.models.common.ReferenceImpl()) },
                new Object[] { "distributionChannel", ChangeValueGiftLineItemChangeValue.builder()
                        .distributionChannel(new com.commercetools.history.models.common.ReferenceImpl()) } };
    }

    @Test
    public void product() {
        ChangeValueGiftLineItemChangeValue value = ChangeValueGiftLineItemChangeValue.of();
        value.setProduct(new com.commercetools.history.models.common.ReferenceImpl());
        Assertions.assertThat(value.getProduct())
                .isEqualTo(new com.commercetools.history.models.common.ReferenceImpl());
    }

    @Test
    public void variantId() {
        ChangeValueGiftLineItemChangeValue value = ChangeValueGiftLineItemChangeValue.of();
        value.setVariantId(5);
        Assertions.assertThat(value.getVariantId()).isEqualTo(5);
    }

    @Test
    public void supplyChannel() {
        ChangeValueGiftLineItemChangeValue value = ChangeValueGiftLineItemChangeValue.of();
        value.setSupplyChannel(new com.commercetools.history.models.common.ReferenceImpl());
        Assertions.assertThat(value.getSupplyChannel())
                .isEqualTo(new com.commercetools.history.models.common.ReferenceImpl());
    }

    @Test
    public void distributionChannel() {
        ChangeValueGiftLineItemChangeValue value = ChangeValueGiftLineItemChangeValue.of();
        value.setDistributionChannel(new com.commercetools.history.models.common.ReferenceImpl());
        Assertions.assertThat(value.getDistributionChannel())
                .isEqualTo(new com.commercetools.history.models.common.ReferenceImpl());
    }
}
