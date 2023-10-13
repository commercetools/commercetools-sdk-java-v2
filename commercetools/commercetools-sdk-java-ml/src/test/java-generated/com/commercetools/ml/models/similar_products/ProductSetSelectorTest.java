
package com.commercetools.ml.models.similar_products;

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
public class ProductSetSelectorTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ProductSetSelectorBuilder builder) {
        ProductSetSelector productSetSelector = builder.buildUnchecked();
        Assertions.assertThat(productSetSelector).isInstanceOf(ProductSetSelector.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ProductSetSelector.builder().projectKey("projectKey") },
                new Object[] { ProductSetSelector.builder().productIds(Collections.singletonList("productIds")) },
                new Object[] {
                        ProductSetSelector.builder().productTypeIds(Collections.singletonList("productTypeIds")) },
                new Object[] { ProductSetSelector.builder().staged(true) },
                new Object[] { ProductSetSelector.builder().includeVariants(true) },
                new Object[] { ProductSetSelector.builder().productSetLimit(6L) } };
    }

    @Test
    public void projectKey() {
        ProductSetSelector value = ProductSetSelector.of();
        value.setProjectKey("projectKey");
        Assertions.assertThat(value.getProjectKey()).isEqualTo("projectKey");
    }

    @Test
    public void productIds() {
        ProductSetSelector value = ProductSetSelector.of();
        value.setProductIds(Collections.singletonList("productIds"));
        Assertions.assertThat(value.getProductIds()).isEqualTo(Collections.singletonList("productIds"));
    }

    @Test
    public void productTypeIds() {
        ProductSetSelector value = ProductSetSelector.of();
        value.setProductTypeIds(Collections.singletonList("productTypeIds"));
        Assertions.assertThat(value.getProductTypeIds()).isEqualTo(Collections.singletonList("productTypeIds"));
    }

    @Test
    public void staged() {
        ProductSetSelector value = ProductSetSelector.of();
        value.setStaged(true);
        Assertions.assertThat(value.getStaged()).isEqualTo(true);
    }

    @Test
    public void includeVariants() {
        ProductSetSelector value = ProductSetSelector.of();
        value.setIncludeVariants(true);
        Assertions.assertThat(value.getIncludeVariants()).isEqualTo(true);
    }

    @Test
    public void productSetLimit() {
        ProductSetSelector value = ProductSetSelector.of();
        value.setProductSetLimit(6L);
        Assertions.assertThat(value.getProductSetLimit()).isEqualTo(6L);
    }
}
