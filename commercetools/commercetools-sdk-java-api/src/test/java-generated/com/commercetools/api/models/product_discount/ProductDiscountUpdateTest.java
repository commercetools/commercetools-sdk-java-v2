
package com.commercetools.api.models.product_discount;

import java.util.Collections;

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
public class ProductDiscountUpdateTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ProductDiscountUpdateBuilder builder) {
        ProductDiscountUpdate productDiscountUpdate = builder.buildUnchecked();
        Assertions.assertThat(productDiscountUpdate).isInstanceOf(ProductDiscountUpdate.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ProductDiscountUpdate.builder().version(2L) },
                new Object[] { ProductDiscountUpdate.builder()
                        .actions(Collections.singletonList(
                            new com.commercetools.api.models.product_discount.ProductDiscountUpdateActionImpl())) } };
    }

    @Test
    public void version() {
        ProductDiscountUpdate value = ProductDiscountUpdate.of();
        value.setVersion(2L);
        Assertions.assertThat(value.getVersion()).isEqualTo(2L);
    }

    @Test
    public void actions() {
        ProductDiscountUpdate value = ProductDiscountUpdate.of();
        value.setActions(Collections
                .singletonList(new com.commercetools.api.models.product_discount.ProductDiscountUpdateActionImpl()));
        Assertions.assertThat(value.getActions())
                .isEqualTo(Collections.singletonList(
                    new com.commercetools.api.models.product_discount.ProductDiscountUpdateActionImpl()));
    }
}
