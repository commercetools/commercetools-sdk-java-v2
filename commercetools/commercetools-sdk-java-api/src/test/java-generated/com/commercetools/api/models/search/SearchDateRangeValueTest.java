
package com.commercetools.api.models.search;

import java.time.LocalDate;

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
public class SearchDateRangeValueTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(SearchDateRangeValueBuilder builder) {
        SearchDateRangeValue searchDateRangeValue = builder.buildUnchecked();
        Assertions.assertThat(searchDateRangeValue).isInstanceOf(SearchDateRangeValue.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { SearchDateRangeValue.builder().gte(LocalDate.parse("2023-06-01")) },
                new Object[] { SearchDateRangeValue.builder().gt(LocalDate.parse("2023-06-01")) },
                new Object[] { SearchDateRangeValue.builder().lte(LocalDate.parse("2023-06-01")) },
                new Object[] { SearchDateRangeValue.builder().lt(LocalDate.parse("2023-06-01")) } };
    }

    @Test
    public void gte() {
        SearchDateRangeValue value = SearchDateRangeValue.of();
        value.setGte(LocalDate.parse("2023-06-01"));
        Assertions.assertThat(value.getGte()).isEqualTo(LocalDate.parse("2023-06-01"));
    }

    @Test
    public void gt() {
        SearchDateRangeValue value = SearchDateRangeValue.of();
        value.setGt(LocalDate.parse("2023-06-01"));
        Assertions.assertThat(value.getGt()).isEqualTo(LocalDate.parse("2023-06-01"));
    }

    @Test
    public void lte() {
        SearchDateRangeValue value = SearchDateRangeValue.of();
        value.setLte(LocalDate.parse("2023-06-01"));
        Assertions.assertThat(value.getLte()).isEqualTo(LocalDate.parse("2023-06-01"));
    }

    @Test
    public void lt() {
        SearchDateRangeValue value = SearchDateRangeValue.of();
        value.setLt(LocalDate.parse("2023-06-01"));
        Assertions.assertThat(value.getLt()).isEqualTo(LocalDate.parse("2023-06-01"));
    }
}
