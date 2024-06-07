
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
public class SearchLongRangeValueTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(SearchLongRangeValueBuilder builder) {
        SearchLongRangeValue searchLongRangeValue = builder.buildUnchecked();
        Assertions.assertThat(searchLongRangeValue).isInstanceOf(SearchLongRangeValue.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { SearchLongRangeValue.builder().gte(8L) },
                new Object[] { SearchLongRangeValue.builder().gt(6L) },
                new Object[] { SearchLongRangeValue.builder().lte(1L) },
                new Object[] { SearchLongRangeValue.builder().lt(2L) } };
    }

    @Test
    public void gte() {
        SearchLongRangeValue value = SearchLongRangeValue.of();
        value.setGte(8L);
        Assertions.assertThat(value.getGte()).isEqualTo(8L);
    }

    @Test
    public void gt() {
        SearchLongRangeValue value = SearchLongRangeValue.of();
        value.setGt(6L);
        Assertions.assertThat(value.getGt()).isEqualTo(6L);
    }

    @Test
    public void lte() {
        SearchLongRangeValue value = SearchLongRangeValue.of();
        value.setLte(1L);
        Assertions.assertThat(value.getLte()).isEqualTo(1L);
    }

    @Test
    public void lt() {
        SearchLongRangeValue value = SearchLongRangeValue.of();
        value.setLt(2L);
        Assertions.assertThat(value.getLt()).isEqualTo(2L);
    }
}
