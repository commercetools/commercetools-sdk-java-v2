
package com.commercetools.history.models.change_value;

import com.tngtech.junit.dataprovider.DataProvider;
import com.tngtech.junit.dataprovider.DataProviderExtension;
import com.tngtech.junit.dataprovider.UseDataProvider;
import com.tngtech.junit.dataprovider.UseDataProviderExtension;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestTemplate;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(UseDataProviderExtension.class)
@ExtendWith(DataProviderExtension.class)
public class ChangeValueGiftLineItemChangeValueTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ChangeValueGiftLineItemChangeValueBuilder builder) {
        ChangeValueGiftLineItemChangeValue changeValueGiftLineItemChangeValue = builder.buildUnchecked();
        Assertions.assertThat(changeValueGiftLineItemChangeValue)
                .isInstanceOf(ChangeValueGiftLineItemChangeValue.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { ChangeValueGiftLineItemChangeValue.builder()
                        .product(new com.commercetools.history.models.common.ReferenceImpl()) },
                new Object[] { ChangeValueGiftLineItemChangeValue.builder().variantId(5) },
                new Object[] { ChangeValueGiftLineItemChangeValue.builder()
                        .supplyChannel(new com.commercetools.history.models.common.ReferenceImpl()) },
                new Object[] { ChangeValueGiftLineItemChangeValue.builder()
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
