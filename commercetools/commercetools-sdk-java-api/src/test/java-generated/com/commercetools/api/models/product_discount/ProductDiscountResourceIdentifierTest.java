
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
public class ProductDiscountResourceIdentifierTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ProductDiscountResourceIdentifierBuilder builder) {
        ProductDiscountResourceIdentifier productDiscountResourceIdentifier = builder.buildUnchecked();
        Assertions.assertThat(productDiscountResourceIdentifier).isInstanceOf(ProductDiscountResourceIdentifier.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ProductDiscountResourceIdentifier.builder().id("id") },
                new Object[] { ProductDiscountResourceIdentifier.builder().key("key") } };
    }

    @Test
    public void id() {
        ProductDiscountResourceIdentifier value = ProductDiscountResourceIdentifier.of();
        value.setId("id");
        Assertions.assertThat(value.getId()).isEqualTo("id");
    }

    @Test
    public void key() {
        ProductDiscountResourceIdentifier value = ProductDiscountResourceIdentifier.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }
}
