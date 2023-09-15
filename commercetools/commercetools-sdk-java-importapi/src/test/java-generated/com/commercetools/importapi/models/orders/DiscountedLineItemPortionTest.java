
package com.commercetools.importapi.models.orders;

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
public class DiscountedLineItemPortionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(DiscountedLineItemPortionBuilder builder) {
        DiscountedLineItemPortion discountedLineItemPortion = builder.buildUnchecked();
        Assertions.assertThat(discountedLineItemPortion).isInstanceOf(DiscountedLineItemPortion.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { DiscountedLineItemPortion.builder()
                        .discount(new com.commercetools.importapi.models.common.CartDiscountKeyReferenceImpl()) },
                new Object[] { DiscountedLineItemPortion.builder()
                        .discountedAmount(new com.commercetools.importapi.models.common.MoneyImpl()) } };
    }

    @Test
    public void discount() {
        DiscountedLineItemPortion value = DiscountedLineItemPortion.of();
        value.setDiscount(new com.commercetools.importapi.models.common.CartDiscountKeyReferenceImpl());
        Assertions.assertThat(value.getDiscount())
                .isEqualTo(new com.commercetools.importapi.models.common.CartDiscountKeyReferenceImpl());
    }

    @Test
    public void discountedAmount() {
        DiscountedLineItemPortion value = DiscountedLineItemPortion.of();
        value.setDiscountedAmount(new com.commercetools.importapi.models.common.MoneyImpl());
        Assertions.assertThat(value.getDiscountedAmount())
                .isEqualTo(new com.commercetools.importapi.models.common.MoneyImpl());
    }
}
