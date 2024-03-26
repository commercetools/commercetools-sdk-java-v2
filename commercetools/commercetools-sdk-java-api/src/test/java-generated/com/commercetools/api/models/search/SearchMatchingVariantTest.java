
package com.commercetools.api.models.search;

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
public class SearchMatchingVariantTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(SearchMatchingVariantBuilder builder) {
        SearchMatchingVariant searchMatchingVariant = builder.buildUnchecked();
        Assertions.assertThat(searchMatchingVariant).isInstanceOf(SearchMatchingVariant.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { SearchMatchingVariant.builder().id(2) },
                new Object[] { SearchMatchingVariant.builder().sku("sku") } };
    }

    @Test
    public void id() {
        SearchMatchingVariant value = SearchMatchingVariant.of();
        value.setId(2);
        Assertions.assertThat(value.getId()).isEqualTo(2);
    }

    @Test
    public void sku() {
        SearchMatchingVariant value = SearchMatchingVariant.of();
        value.setSku("sku");
        Assertions.assertThat(value.getSku()).isEqualTo("sku");
    }
}
