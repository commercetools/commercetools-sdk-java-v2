
package com.commercetools.api.models.product_tailoring;

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
public class ProductTailoringResourceIdentifierTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ProductTailoringResourceIdentifierBuilder builder) {
        ProductTailoringResourceIdentifier productTailoringResourceIdentifier = builder.buildUnchecked();
        Assertions.assertThat(productTailoringResourceIdentifier)
                .isInstanceOf(ProductTailoringResourceIdentifier.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ProductTailoringResourceIdentifier.builder().id("id") },
                new Object[] { ProductTailoringResourceIdentifier.builder().key("key") } };
    }

    @Test
    public void id() {
        ProductTailoringResourceIdentifier value = ProductTailoringResourceIdentifier.of();
        value.setId("id");
        Assertions.assertThat(value.getId()).isEqualTo("id");
    }

    @Test
    public void key() {
        ProductTailoringResourceIdentifier value = ProductTailoringResourceIdentifier.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }
}
