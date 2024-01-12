
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
public class ProductSearchFacetDistinctStartsWithTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ProductSearchFacetDistinctStartsWithBuilder builder) {
        ProductSearchFacetDistinctStartsWith productSearchFacetDistinctStartsWith = builder.buildUnchecked();
        Assertions.assertThat(productSearchFacetDistinctStartsWith)
                .isInstanceOf(ProductSearchFacetDistinctStartsWith.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ProductSearchFacetDistinctStartsWith.builder().value("value") },
                new Object[] { ProductSearchFacetDistinctStartsWith.builder().caseInsensitive(true) } };
    }

    @Test
    public void value() {
        ProductSearchFacetDistinctStartsWith value = ProductSearchFacetDistinctStartsWith.of();
        value.setValue("value");
        Assertions.assertThat(value.getValue()).isEqualTo("value");
    }

    @Test
    public void caseInsensitive() {
        ProductSearchFacetDistinctStartsWith value = ProductSearchFacetDistinctStartsWith.of();
        value.setCaseInsensitive(true);
        Assertions.assertThat(value.getCaseInsensitive()).isEqualTo(true);
    }
}
