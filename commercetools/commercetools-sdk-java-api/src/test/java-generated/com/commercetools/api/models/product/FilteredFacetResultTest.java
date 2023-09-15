
package com.commercetools.api.models.product;

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
public class FilteredFacetResultTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(FilteredFacetResultBuilder builder) {
        FilteredFacetResult filteredFacetResult = builder.buildUnchecked();
        Assertions.assertThat(filteredFacetResult).isInstanceOf(FilteredFacetResult.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { FilteredFacetResult.builder().count(2L) },
                new Object[] { FilteredFacetResult.builder().productCount(1L) } };
    }

    @Test
    public void count() {
        FilteredFacetResult value = FilteredFacetResult.of();
        value.setCount(2L);
        Assertions.assertThat(value.getCount()).isEqualTo(2L);
    }

    @Test
    public void productCount() {
        FilteredFacetResult value = FilteredFacetResult.of();
        value.setProductCount(1L);
        Assertions.assertThat(value.getProductCount()).isEqualTo(1L);
    }
}
