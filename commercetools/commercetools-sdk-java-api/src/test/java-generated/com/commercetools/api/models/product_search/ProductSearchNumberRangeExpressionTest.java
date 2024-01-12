
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
public class ProductSearchNumberRangeExpressionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ProductSearchNumberRangeExpressionBuilder builder) {
        ProductSearchNumberRangeExpression productSearchNumberRangeExpression = builder.buildUnchecked();
        Assertions.assertThat(productSearchNumberRangeExpression)
                .isInstanceOf(ProductSearchNumberRangeExpression.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ProductSearchNumberRangeExpression.builder()
                .range(new com.commercetools.api.models.product_search.ProductSearchNumberRangeValueImpl()) } };
    }

    @Test
    public void range() {
        ProductSearchNumberRangeExpression value = ProductSearchNumberRangeExpression.of();
        value.setRange(new com.commercetools.api.models.product_search.ProductSearchNumberRangeValueImpl());
        Assertions.assertThat(value.getRange())
                .isEqualTo(new com.commercetools.api.models.product_search.ProductSearchNumberRangeValueImpl());
    }
}
