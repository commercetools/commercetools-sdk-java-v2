
package com.commercetools.api.models.product_search;

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
public class ProductSearchDateRangeValueTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ProductSearchDateRangeValueBuilder builder) {
        ProductSearchDateRangeValue productSearchDateRangeValue = builder.buildUnchecked();
        Assertions.assertThat(productSearchDateRangeValue).isInstanceOf(ProductSearchDateRangeValue.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { ProductSearchDateRangeValue.builder().gte(LocalDate.parse("2023-06-01")) },
                new Object[] { ProductSearchDateRangeValue.builder().gt(LocalDate.parse("2023-06-01")) },
                new Object[] { ProductSearchDateRangeValue.builder().lte(LocalDate.parse("2023-06-01")) },
                new Object[] { ProductSearchDateRangeValue.builder().lt(LocalDate.parse("2023-06-01")) } };
    }

    @Test
    public void gte() {
        ProductSearchDateRangeValue value = ProductSearchDateRangeValue.of();
        value.setGte(LocalDate.parse("2023-06-01"));
        Assertions.assertThat(value.getGte()).isEqualTo(LocalDate.parse("2023-06-01"));
    }

    @Test
    public void gt() {
        ProductSearchDateRangeValue value = ProductSearchDateRangeValue.of();
        value.setGt(LocalDate.parse("2023-06-01"));
        Assertions.assertThat(value.getGt()).isEqualTo(LocalDate.parse("2023-06-01"));
    }

    @Test
    public void lte() {
        ProductSearchDateRangeValue value = ProductSearchDateRangeValue.of();
        value.setLte(LocalDate.parse("2023-06-01"));
        Assertions.assertThat(value.getLte()).isEqualTo(LocalDate.parse("2023-06-01"));
    }

    @Test
    public void lt() {
        ProductSearchDateRangeValue value = ProductSearchDateRangeValue.of();
        value.setLt(LocalDate.parse("2023-06-01"));
        Assertions.assertThat(value.getLt()).isEqualTo(LocalDate.parse("2023-06-01"));
    }
}
