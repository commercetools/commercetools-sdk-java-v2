
package com.commercetools.api.models.cart;

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
public class ProductTailoringUpdateTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ProductTailoringUpdateBuilder builder) {
        ProductTailoringUpdate productTailoringUpdate = builder.buildUnchecked();
        Assertions.assertThat(productTailoringUpdate).isInstanceOf(ProductTailoringUpdate.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ProductTailoringUpdate.builder().version(2L) },
                new Object[] { ProductTailoringUpdate.builder()
                        .actions(Collections.singletonList(
                            new com.commercetools.api.models.product_tailoring.ProductTailoringUpdateActionImpl())) } };
    }

    @Test
    public void version() {
        ProductTailoringUpdate value = ProductTailoringUpdate.of();
        value.setVersion(2L);
        Assertions.assertThat(value.getVersion()).isEqualTo(2L);
    }

    @Test
    public void actions() {
        ProductTailoringUpdate value = ProductTailoringUpdate.of();
        value.setActions(Collections
                .singletonList(new com.commercetools.api.models.product_tailoring.ProductTailoringUpdateActionImpl()));
        Assertions.assertThat(value.getActions())
                .isEqualTo(Collections.singletonList(
                    new com.commercetools.api.models.product_tailoring.ProductTailoringUpdateActionImpl()));
    }
}
