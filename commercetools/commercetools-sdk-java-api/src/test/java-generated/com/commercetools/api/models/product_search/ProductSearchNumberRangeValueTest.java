
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
public class ProductSearchNumberRangeValueTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ProductSearchNumberRangeValueBuilder builder) {
        ProductSearchNumberRangeValue productSearchNumberRangeValue = builder.buildUnchecked();
        Assertions.assertThat(productSearchNumberRangeValue).isInstanceOf(ProductSearchNumberRangeValue.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ProductSearchNumberRangeValue.builder().gte(0.8498576) },
                new Object[] { ProductSearchNumberRangeValue.builder().gt(0.15980393) },
                new Object[] { ProductSearchNumberRangeValue.builder().lte(0.26076245) },
                new Object[] { ProductSearchNumberRangeValue.builder().lt(0.5197181) } };
    }

    @Test
    public void gte() {
        ProductSearchNumberRangeValue value = ProductSearchNumberRangeValue.of();
        value.setGte(0.8498576);
        Assertions.assertThat(value.getGte()).isEqualTo(0.8498576);
    }

    @Test
    public void gt() {
        ProductSearchNumberRangeValue value = ProductSearchNumberRangeValue.of();
        value.setGt(0.15980393);
        Assertions.assertThat(value.getGt()).isEqualTo(0.15980393);
    }

    @Test
    public void lte() {
        ProductSearchNumberRangeValue value = ProductSearchNumberRangeValue.of();
        value.setLte(0.26076245);
        Assertions.assertThat(value.getLte()).isEqualTo(0.26076245);
    }

    @Test
    public void lt() {
        ProductSearchNumberRangeValue value = ProductSearchNumberRangeValue.of();
        value.setLt(0.5197181);
        Assertions.assertThat(value.getLt()).isEqualTo(0.5197181);
    }
}
