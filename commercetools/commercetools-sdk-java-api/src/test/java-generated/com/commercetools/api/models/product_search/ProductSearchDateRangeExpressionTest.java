
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
public class ProductSearchDateRangeExpressionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ProductSearchDateRangeExpressionBuilder builder) {
        ProductSearchDateRangeExpression productSearchDateRangeExpression = builder.buildUnchecked();
        Assertions.assertThat(productSearchDateRangeExpression).isInstanceOf(ProductSearchDateRangeExpression.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ProductSearchDateRangeExpression.builder()
                .range(new com.commercetools.api.models.product_search.ProductSearchDateRangeValueImpl()) } };
    }

    @Test
    public void range() {
        ProductSearchDateRangeExpression value = ProductSearchDateRangeExpression.of();
        value.setRange(new com.commercetools.api.models.product_search.ProductSearchDateRangeValueImpl());
        Assertions.assertThat(value.getRange())
                .isEqualTo(new com.commercetools.api.models.product_search.ProductSearchDateRangeValueImpl());
    }
}
