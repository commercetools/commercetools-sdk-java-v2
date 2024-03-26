
package com.commercetools.api.models.search;

import java.time.ZonedDateTime;

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
public class SearchDateTimeRangeValueTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(SearchDateTimeRangeValueBuilder builder) {
        SearchDateTimeRangeValue searchDateTimeRangeValue = builder.buildUnchecked();
        Assertions.assertThat(searchDateTimeRangeValue).isInstanceOf(SearchDateTimeRangeValue.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { SearchDateTimeRangeValue.builder().gte(ZonedDateTime.parse("2023-06-01T12:00Z")) },
                new Object[] { SearchDateTimeRangeValue.builder().gt(ZonedDateTime.parse("2023-06-01T12:00Z")) },
                new Object[] { SearchDateTimeRangeValue.builder().lte(ZonedDateTime.parse("2023-06-01T12:00Z")) },
                new Object[] { SearchDateTimeRangeValue.builder().lt(ZonedDateTime.parse("2023-06-01T12:00Z")) } };
    }

    @Test
    public void gte() {
        SearchDateTimeRangeValue value = SearchDateTimeRangeValue.of();
        value.setGte(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getGte()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }

    @Test
    public void gt() {
        SearchDateTimeRangeValue value = SearchDateTimeRangeValue.of();
        value.setGt(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getGt()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }

    @Test
    public void lte() {
        SearchDateTimeRangeValue value = SearchDateTimeRangeValue.of();
        value.setLte(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getLte()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }

    @Test
    public void lt() {
        SearchDateTimeRangeValue value = SearchDateTimeRangeValue.of();
        value.setLt(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getLt()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }
}
