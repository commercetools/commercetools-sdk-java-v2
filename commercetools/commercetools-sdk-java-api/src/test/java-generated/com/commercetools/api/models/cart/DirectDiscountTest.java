
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
public class DirectDiscountTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(DirectDiscountBuilder builder) {
        DirectDiscount directDiscount = builder.buildUnchecked();
        Assertions.assertThat(directDiscount).isInstanceOf(DirectDiscount.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { DirectDiscount.builder().id("id") },
                new Object[] { DirectDiscount.builder()
                        .value(new com.commercetools.api.models.cart_discount.CartDiscountValueImpl()) },
                new Object[] { DirectDiscount.builder()
                        .target(new com.commercetools.api.models.cart_discount.CartDiscountTargetImpl()) } };
    }

    @Test
    public void id() {
        DirectDiscount value = DirectDiscount.of();
        value.setId("id");
        Assertions.assertThat(value.getId()).isEqualTo("id");
    }

    @Test
    public void value() {
        DirectDiscount value = DirectDiscount.of();
        value.setValue(new com.commercetools.api.models.cart_discount.CartDiscountValueImpl());
        Assertions.assertThat(value.getValue())
                .isEqualTo(new com.commercetools.api.models.cart_discount.CartDiscountValueImpl());
    }

    @Test
    public void target() {
        DirectDiscount value = DirectDiscount.of();
        value.setTarget(new com.commercetools.api.models.cart_discount.CartDiscountTargetImpl());
        Assertions.assertThat(value.getTarget())
                .isEqualTo(new com.commercetools.api.models.cart_discount.CartDiscountTargetImpl());
    }
}
