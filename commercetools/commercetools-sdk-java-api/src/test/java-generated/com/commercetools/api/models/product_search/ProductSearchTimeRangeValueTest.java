
package com.commercetools.api.models.product_search;

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
public class ProductSearchTimeRangeValueTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ProductSearchTimeRangeValueBuilder builder) {
        ProductSearchTimeRangeValue productSearchTimeRangeValue = builder.buildUnchecked();
        Assertions.assertThat(productSearchTimeRangeValue).isInstanceOf(ProductSearchTimeRangeValue.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ProductSearchTimeRangeValue.builder().gte(LocalTime.parse("12:00")) },
                new Object[] { ProductSearchTimeRangeValue.builder().gt(LocalTime.parse("12:00")) },
                new Object[] { ProductSearchTimeRangeValue.builder().lte(LocalTime.parse("12:00")) },
                new Object[] { ProductSearchTimeRangeValue.builder().lt(LocalTime.parse("12:00")) } };
    }

    @Test
    public void gte() {
        ProductSearchTimeRangeValue value = ProductSearchTimeRangeValue.of();
        value.setGte(LocalTime.parse("12:00"));
        Assertions.assertThat(value.getGte()).isEqualTo(LocalTime.parse("12:00"));
    }

    @Test
    public void gt() {
        ProductSearchTimeRangeValue value = ProductSearchTimeRangeValue.of();
        value.setGt(LocalTime.parse("12:00"));
        Assertions.assertThat(value.getGt()).isEqualTo(LocalTime.parse("12:00"));
    }

    @Test
    public void lte() {
        ProductSearchTimeRangeValue value = ProductSearchTimeRangeValue.of();
        value.setLte(LocalTime.parse("12:00"));
        Assertions.assertThat(value.getLte()).isEqualTo(LocalTime.parse("12:00"));
    }

    @Test
    public void lt() {
        ProductSearchTimeRangeValue value = ProductSearchTimeRangeValue.of();
        value.setLt(LocalTime.parse("12:00"));
        Assertions.assertThat(value.getLt()).isEqualTo(LocalTime.parse("12:00"));
    }
}
