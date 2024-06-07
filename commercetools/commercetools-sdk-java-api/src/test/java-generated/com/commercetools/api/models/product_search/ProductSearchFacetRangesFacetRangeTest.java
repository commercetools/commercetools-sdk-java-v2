
package com.commercetools.api.models.product_search;

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
public class ProductSearchFacetRangesFacetRangeTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ProductSearchFacetRangesFacetRangeBuilder builder) {
        ProductSearchFacetRangesFacetRange productSearchFacetRangesFacetRange = builder.buildUnchecked();
        Assertions.assertThat(productSearchFacetRangesFacetRange)
                .isInstanceOf(ProductSearchFacetRangesFacetRange.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ProductSearchFacetRangesFacetRange.builder().from("from") },
                new Object[] { ProductSearchFacetRangesFacetRange.builder().to("to") },
                new Object[] { ProductSearchFacetRangesFacetRange.builder().key("key") } };
    }

    @Test
    public void from() {
        ProductSearchFacetRangesFacetRange value = ProductSearchFacetRangesFacetRange.of();
        value.setFrom("from");
        Assertions.assertThat(value.getFrom()).isEqualTo("from");
    }

    @Test
    public void to() {
        ProductSearchFacetRangesFacetRange value = ProductSearchFacetRangesFacetRange.of();
        value.setTo("to");
        Assertions.assertThat(value.getTo()).isEqualTo("to");
    }

    @Test
    public void key() {
        ProductSearchFacetRangesFacetRange value = ProductSearchFacetRangesFacetRange.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }
}
