
package com.commercetools.api.models.product_search;

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
public class ProductSearchLongRangeValueTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ProductSearchLongRangeValueBuilder builder) {
        ProductSearchLongRangeValue productSearchLongRangeValue = builder.buildUnchecked();
        Assertions.assertThat(productSearchLongRangeValue).isInstanceOf(ProductSearchLongRangeValue.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ProductSearchLongRangeValue.builder().gte(8L) },
                new Object[] { ProductSearchLongRangeValue.builder().gt(6L) },
                new Object[] { ProductSearchLongRangeValue.builder().lte(1L) },
                new Object[] { ProductSearchLongRangeValue.builder().lt(2L) } };
    }

    @Test
    public void gte() {
        ProductSearchLongRangeValue value = ProductSearchLongRangeValue.of();
        value.setGte(8L);
        Assertions.assertThat(value.getGte()).isEqualTo(8L);
    }

    @Test
    public void gt() {
        ProductSearchLongRangeValue value = ProductSearchLongRangeValue.of();
        value.setGt(6L);
        Assertions.assertThat(value.getGt()).isEqualTo(6L);
    }

    @Test
    public void lte() {
        ProductSearchLongRangeValue value = ProductSearchLongRangeValue.of();
        value.setLte(1L);
        Assertions.assertThat(value.getLte()).isEqualTo(1L);
    }

    @Test
    public void lt() {
        ProductSearchLongRangeValue value = ProductSearchLongRangeValue.of();
        value.setLt(2L);
        Assertions.assertThat(value.getLt()).isEqualTo(2L);
    }
}
