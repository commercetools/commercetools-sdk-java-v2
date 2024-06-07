
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
public class DirectDiscountDraftTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(DirectDiscountDraftBuilder builder) {
        DirectDiscountDraft directDiscountDraft = builder.buildUnchecked();
        Assertions.assertThat(directDiscountDraft).isInstanceOf(DirectDiscountDraft.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { DirectDiscountDraft.builder()
                        .value(new com.commercetools.api.models.cart_discount.CartDiscountValueDraftImpl()) },
                new Object[] { DirectDiscountDraft.builder()
                        .target(new com.commercetools.api.models.cart_discount.CartDiscountTargetImpl()) } };
    }

    @Test
    public void value() {
        DirectDiscountDraft value = DirectDiscountDraft.of();
        value.setValue(new com.commercetools.api.models.cart_discount.CartDiscountValueDraftImpl());
        Assertions.assertThat(value.getValue())
                .isEqualTo(new com.commercetools.api.models.cart_discount.CartDiscountValueDraftImpl());
    }

    @Test
    public void target() {
        DirectDiscountDraft value = DirectDiscountDraft.of();
        value.setTarget(new com.commercetools.api.models.cart_discount.CartDiscountTargetImpl());
        Assertions.assertThat(value.getTarget())
                .isEqualTo(new com.commercetools.api.models.cart_discount.CartDiscountTargetImpl());
    }
}
