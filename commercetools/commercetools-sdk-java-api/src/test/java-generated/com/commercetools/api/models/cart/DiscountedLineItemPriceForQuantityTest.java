
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
public class DiscountedLineItemPriceForQuantityTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(DiscountedLineItemPriceForQuantityBuilder builder) {
        DiscountedLineItemPriceForQuantity discountedLineItemPriceForQuantity = builder.buildUnchecked();
        Assertions.assertThat(discountedLineItemPriceForQuantity)
                .isInstanceOf(DiscountedLineItemPriceForQuantity.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { DiscountedLineItemPriceForQuantity.builder().quantity(8L) },
                new Object[] { DiscountedLineItemPriceForQuantity.builder()
                        .discountedPrice(new com.commercetools.api.models.cart.DiscountedLineItemPriceImpl()) } };
    }

    @Test
    public void quantity() {
        DiscountedLineItemPriceForQuantity value = DiscountedLineItemPriceForQuantity.of();
        value.setQuantity(8L);
        Assertions.assertThat(value.getQuantity()).isEqualTo(8L);
    }

    @Test
    public void discountedPrice() {
        DiscountedLineItemPriceForQuantity value = DiscountedLineItemPriceForQuantity.of();
        value.setDiscountedPrice(new com.commercetools.api.models.cart.DiscountedLineItemPriceImpl());
        Assertions.assertThat(value.getDiscountedPrice())
                .isEqualTo(new com.commercetools.api.models.cart.DiscountedLineItemPriceImpl());
    }
}
