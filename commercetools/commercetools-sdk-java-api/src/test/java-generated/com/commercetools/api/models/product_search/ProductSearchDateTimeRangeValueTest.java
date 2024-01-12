
package com.commercetools.api.models.product_search;

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
public class ProductSearchDateTimeRangeValueTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ProductSearchDateTimeRangeValueBuilder builder) {
        ProductSearchDateTimeRangeValue productSearchDateTimeRangeValue = builder.buildUnchecked();
        Assertions.assertThat(productSearchDateTimeRangeValue).isInstanceOf(ProductSearchDateTimeRangeValue.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] {
                        ProductSearchDateTimeRangeValue.builder().gte(ZonedDateTime.parse("2023-06-01T12:00Z")) },
                new Object[] { ProductSearchDateTimeRangeValue.builder().gt(ZonedDateTime.parse("2023-06-01T12:00Z")) },
                new Object[] {
                        ProductSearchDateTimeRangeValue.builder().lte(ZonedDateTime.parse("2023-06-01T12:00Z")) },
                new Object[] {
                        ProductSearchDateTimeRangeValue.builder().lt(ZonedDateTime.parse("2023-06-01T12:00Z")) } };
    }

    @Test
    public void gte() {
        ProductSearchDateTimeRangeValue value = ProductSearchDateTimeRangeValue.of();
        value.setGte(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getGte()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }

    @Test
    public void gt() {
        ProductSearchDateTimeRangeValue value = ProductSearchDateTimeRangeValue.of();
        value.setGt(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getGt()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }

    @Test
    public void lte() {
        ProductSearchDateTimeRangeValue value = ProductSearchDateTimeRangeValue.of();
        value.setLte(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getLte()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }

    @Test
    public void lt() {
        ProductSearchDateTimeRangeValue value = ProductSearchDateTimeRangeValue.of();
        value.setLt(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getLt()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }
}
