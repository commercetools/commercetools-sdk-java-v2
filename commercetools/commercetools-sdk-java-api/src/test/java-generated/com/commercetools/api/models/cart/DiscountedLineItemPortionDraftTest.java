
package com.commercetools.api.models.cart;

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
public class DiscountedLineItemPortionDraftTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(DiscountedLineItemPortionDraftBuilder builder) {
        DiscountedLineItemPortionDraft discountedLineItemPortionDraft = builder.buildUnchecked();
        Assertions.assertThat(discountedLineItemPortionDraft).isInstanceOf(DiscountedLineItemPortionDraft.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { DiscountedLineItemPortionDraft.builder()
                        .discount(new com.commercetools.api.models.common.ReferenceImpl()) },
                new Object[] { DiscountedLineItemPortionDraft.builder()
                        .discountedAmount(new com.commercetools.api.models.common.TypedMoneyDraftImpl()) } };
    }

    @Test
    public void discount() {
        DiscountedLineItemPortionDraft value = DiscountedLineItemPortionDraft.of();
        value.setDiscount(new com.commercetools.api.models.common.ReferenceImpl());
        Assertions.assertThat(value.getDiscount()).isEqualTo(new com.commercetools.api.models.common.ReferenceImpl());
    }

    @Test
    public void discountedAmount() {
        DiscountedLineItemPortionDraft value = DiscountedLineItemPortionDraft.of();
        value.setDiscountedAmount(new com.commercetools.api.models.common.TypedMoneyDraftImpl());
        Assertions.assertThat(value.getDiscountedAmount())
                .isEqualTo(new com.commercetools.api.models.common.TypedMoneyDraftImpl());
    }
}
