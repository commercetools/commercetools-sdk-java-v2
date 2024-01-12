
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
public class ProductSearchDateTimeRangeExpressionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ProductSearchDateTimeRangeExpressionBuilder builder) {
        ProductSearchDateTimeRangeExpression productSearchDateTimeRangeExpression = builder.buildUnchecked();
        Assertions.assertThat(productSearchDateTimeRangeExpression)
                .isInstanceOf(ProductSearchDateTimeRangeExpression.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ProductSearchDateTimeRangeExpression.builder()
                .range(new com.commercetools.api.models.product_search.ProductSearchDateTimeRangeValueImpl()) } };
    }

    @Test
    public void range() {
        ProductSearchDateTimeRangeExpression value = ProductSearchDateTimeRangeExpression.of();
        value.setRange(new com.commercetools.api.models.product_search.ProductSearchDateTimeRangeValueImpl());
        Assertions.assertThat(value.getRange())
                .isEqualTo(new com.commercetools.api.models.product_search.ProductSearchDateTimeRangeValueImpl());
    }
}
