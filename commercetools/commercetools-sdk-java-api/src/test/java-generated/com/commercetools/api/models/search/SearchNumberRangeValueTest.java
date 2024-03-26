
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
public class SearchNumberRangeValueTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(SearchNumberRangeValueBuilder builder) {
        SearchNumberRangeValue searchNumberRangeValue = builder.buildUnchecked();
        Assertions.assertThat(searchNumberRangeValue).isInstanceOf(SearchNumberRangeValue.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { SearchNumberRangeValue.builder().gte(0.8498576) },
                new Object[] { SearchNumberRangeValue.builder().gt(0.15980393) },
                new Object[] { SearchNumberRangeValue.builder().lte(0.26076245) },
                new Object[] { SearchNumberRangeValue.builder().lt(0.5197181) } };
    }

    @Test
    public void gte() {
        SearchNumberRangeValue value = SearchNumberRangeValue.of();
        value.setGte(0.8498576);
        Assertions.assertThat(value.getGte()).isEqualTo(0.8498576);
    }

    @Test
    public void gt() {
        SearchNumberRangeValue value = SearchNumberRangeValue.of();
        value.setGt(0.15980393);
        Assertions.assertThat(value.getGt()).isEqualTo(0.15980393);
    }

    @Test
    public void lte() {
        SearchNumberRangeValue value = SearchNumberRangeValue.of();
        value.setLte(0.26076245);
        Assertions.assertThat(value.getLte()).isEqualTo(0.26076245);
    }

    @Test
    public void lt() {
        SearchNumberRangeValue value = SearchNumberRangeValue.of();
        value.setLt(0.5197181);
        Assertions.assertThat(value.getLt()).isEqualTo(0.5197181);
    }
}
