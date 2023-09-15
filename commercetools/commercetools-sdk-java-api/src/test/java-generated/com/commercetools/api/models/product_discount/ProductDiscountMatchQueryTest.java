
package com.commercetools.api.models.product_discount;

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
public class ProductDiscountMatchQueryTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ProductDiscountMatchQueryBuilder builder) {
        ProductDiscountMatchQuery productDiscountMatchQuery = builder.buildUnchecked();
        Assertions.assertThat(productDiscountMatchQuery).isInstanceOf(ProductDiscountMatchQuery.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ProductDiscountMatchQuery.builder().productId("productId") },
                new Object[] { ProductDiscountMatchQuery.builder().variantId(5) },
                new Object[] { ProductDiscountMatchQuery.builder().staged(true) },
                new Object[] { ProductDiscountMatchQuery.builder()
                        .price(new com.commercetools.api.models.common.QueryPriceImpl()) } };
    }

    @Test
    public void productId() {
        ProductDiscountMatchQuery value = ProductDiscountMatchQuery.of();
        value.setProductId("productId");
        Assertions.assertThat(value.getProductId()).isEqualTo("productId");
    }

    @Test
    public void variantId() {
        ProductDiscountMatchQuery value = ProductDiscountMatchQuery.of();
        value.setVariantId(5);
        Assertions.assertThat(value.getVariantId()).isEqualTo(5);
    }

    @Test
    public void staged() {
        ProductDiscountMatchQuery value = ProductDiscountMatchQuery.of();
        value.setStaged(true);
        Assertions.assertThat(value.getStaged()).isEqualTo(true);
    }

    @Test
    public void price() {
        ProductDiscountMatchQuery value = ProductDiscountMatchQuery.of();
        value.setPrice(new com.commercetools.api.models.common.QueryPriceImpl());
        Assertions.assertThat(value.getPrice()).isEqualTo(new com.commercetools.api.models.common.QueryPriceImpl());
    }
}
