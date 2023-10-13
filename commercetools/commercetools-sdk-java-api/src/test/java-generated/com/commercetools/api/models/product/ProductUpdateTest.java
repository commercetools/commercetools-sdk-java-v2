
package com.commercetools.api.models.product;

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
public class ProductUpdateTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ProductUpdateBuilder builder) {
        ProductUpdate productUpdate = builder.buildUnchecked();
        Assertions.assertThat(productUpdate).isInstanceOf(ProductUpdate.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ProductUpdate.builder().version(2L) },
                new Object[] { ProductUpdate.builder()
                        .actions(Collections
                                .singletonList(new com.commercetools.api.models.product.ProductUpdateActionImpl())) } };
    }

    @Test
    public void version() {
        ProductUpdate value = ProductUpdate.of();
        value.setVersion(2L);
        Assertions.assertThat(value.getVersion()).isEqualTo(2L);
    }

    @Test
    public void actions() {
        ProductUpdate value = ProductUpdate.of();
        value.setActions(Collections.singletonList(new com.commercetools.api.models.product.ProductUpdateActionImpl()));
        Assertions.assertThat(value.getActions())
                .isEqualTo(
                    Collections.singletonList(new com.commercetools.api.models.product.ProductUpdateActionImpl()));
    }
}
