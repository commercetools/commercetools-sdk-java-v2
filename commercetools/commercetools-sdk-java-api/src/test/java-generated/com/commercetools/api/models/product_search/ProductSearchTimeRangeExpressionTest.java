
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
public class ProductSearchTimeRangeExpressionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ProductSearchTimeRangeExpressionBuilder builder) {
        ProductSearchTimeRangeExpression productSearchTimeRangeExpression = builder.buildUnchecked();
        Assertions.assertThat(productSearchTimeRangeExpression).isInstanceOf(ProductSearchTimeRangeExpression.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ProductSearchTimeRangeExpression.builder()
                .range(new com.commercetools.api.models.product_search.ProductSearchTimeRangeValueImpl()) } };
    }

    @Test
    public void range() {
        ProductSearchTimeRangeExpression value = ProductSearchTimeRangeExpression.of();
        value.setRange(new com.commercetools.api.models.product_search.ProductSearchTimeRangeValueImpl());
        Assertions.assertThat(value.getRange())
                .isEqualTo(new com.commercetools.api.models.product_search.ProductSearchTimeRangeValueImpl());
    }
}
