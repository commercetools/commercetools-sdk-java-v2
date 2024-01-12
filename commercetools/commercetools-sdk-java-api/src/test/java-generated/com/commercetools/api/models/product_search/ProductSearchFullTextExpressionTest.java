
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
public class ProductSearchFullTextExpressionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ProductSearchFullTextExpressionBuilder builder) {
        ProductSearchFullTextExpression productSearchFullTextExpression = builder.buildUnchecked();
        Assertions.assertThat(productSearchFullTextExpression).isInstanceOf(ProductSearchFullTextExpression.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ProductSearchFullTextExpression.builder()
                .fullText(new com.commercetools.api.models.product_search.ProductSearchFullTextValueImpl()) } };
    }

    @Test
    public void fullText() {
        ProductSearchFullTextExpression value = ProductSearchFullTextExpression.of();
        value.setFullText(new com.commercetools.api.models.product_search.ProductSearchFullTextValueImpl());
        Assertions.assertThat(value.getFullText())
                .isEqualTo(new com.commercetools.api.models.product_search.ProductSearchFullTextValueImpl());
    }
}
