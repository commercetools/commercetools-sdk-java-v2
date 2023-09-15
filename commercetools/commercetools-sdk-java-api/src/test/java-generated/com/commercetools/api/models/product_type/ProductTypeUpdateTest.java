
package com.commercetools.api.models.product_type;

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
public class ProductTypeUpdateTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ProductTypeUpdateBuilder builder) {
        ProductTypeUpdate productTypeUpdate = builder.buildUnchecked();
        Assertions.assertThat(productTypeUpdate).isInstanceOf(ProductTypeUpdate.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ProductTypeUpdate.builder().version(2L) },
                new Object[] { ProductTypeUpdate.builder()
                        .actions(Collections.singletonList(
                            new com.commercetools.api.models.product_type.ProductTypeUpdateActionImpl())) } };
    }

    @Test
    public void version() {
        ProductTypeUpdate value = ProductTypeUpdate.of();
        value.setVersion(2L);
        Assertions.assertThat(value.getVersion()).isEqualTo(2L);
    }

    @Test
    public void actions() {
        ProductTypeUpdate value = ProductTypeUpdate.of();
        value.setActions(
            Collections.singletonList(new com.commercetools.api.models.product_type.ProductTypeUpdateActionImpl()));
        Assertions.assertThat(value.getActions())
                .isEqualTo(Collections
                        .singletonList(new com.commercetools.api.models.product_type.ProductTypeUpdateActionImpl()));
    }
}
