
package com.commercetools.api.models.search;

import java.time.LocalTime;

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
public class SearchTimeRangeValueTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(SearchTimeRangeValueBuilder builder) {
        SearchTimeRangeValue searchTimeRangeValue = builder.buildUnchecked();
        Assertions.assertThat(searchTimeRangeValue).isInstanceOf(SearchTimeRangeValue.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { SearchTimeRangeValue.builder().gte(LocalTime.parse("12:00")) },
                new Object[] { SearchTimeRangeValue.builder().gt(LocalTime.parse("12:00")) },
                new Object[] { SearchTimeRangeValue.builder().lte(LocalTime.parse("12:00")) },
                new Object[] { SearchTimeRangeValue.builder().lt(LocalTime.parse("12:00")) } };
    }

    @Test
    public void gte() {
        SearchTimeRangeValue value = SearchTimeRangeValue.of();
        value.setGte(LocalTime.parse("12:00"));
        Assertions.assertThat(value.getGte()).isEqualTo(LocalTime.parse("12:00"));
    }

    @Test
    public void gt() {
        SearchTimeRangeValue value = SearchTimeRangeValue.of();
        value.setGt(LocalTime.parse("12:00"));
        Assertions.assertThat(value.getGt()).isEqualTo(LocalTime.parse("12:00"));
    }

    @Test
    public void lte() {
        SearchTimeRangeValue value = SearchTimeRangeValue.of();
        value.setLte(LocalTime.parse("12:00"));
        Assertions.assertThat(value.getLte()).isEqualTo(LocalTime.parse("12:00"));
    }

    @Test
    public void lt() {
        SearchTimeRangeValue value = SearchTimeRangeValue.of();
        value.setLt(LocalTime.parse("12:00"));
        Assertions.assertThat(value.getLt()).isEqualTo(LocalTime.parse("12:00"));
    }
}
