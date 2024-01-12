
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
public class ProductSearchExistsExpressionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ProductSearchExistsExpressionBuilder builder) {
        ProductSearchExistsExpression productSearchExistsExpression = builder.buildUnchecked();
        Assertions.assertThat(productSearchExistsExpression).isInstanceOf(ProductSearchExistsExpression.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ProductSearchExistsExpression.builder()
                .exists(new com.commercetools.api.models.product_search.ProductSearchExistsValueImpl()) } };
    }

    @Test
    public void exists() {
        ProductSearchExistsExpression value = ProductSearchExistsExpression.of();
        value.setExists(new com.commercetools.api.models.product_search.ProductSearchExistsValueImpl());
        Assertions.assertThat(value.getExists())
                .isEqualTo(new com.commercetools.api.models.product_search.ProductSearchExistsValueImpl());
    }
}
