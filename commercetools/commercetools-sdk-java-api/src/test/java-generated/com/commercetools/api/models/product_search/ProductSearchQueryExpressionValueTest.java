
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
public class ProductSearchQueryExpressionValueTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ProductSearchQueryExpressionValueBuilder builder) {
        ProductSearchQueryExpressionValue productSearchQueryExpressionValue = builder.buildUnchecked();
        Assertions.assertThat(productSearchQueryExpressionValue).isInstanceOf(ProductSearchQueryExpressionValue.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ProductSearchQueryExpressionValue.builder().field("field") },
                new Object[] { ProductSearchQueryExpressionValue.builder().boost(0.8968434466791833) },
                new Object[] { ProductSearchQueryExpressionValue.builder()
                        .attributeType(com.commercetools.api.models.product_search.ProductSearchAttributeType
                                .findEnum("boolean")) } };
    }

    @Test
    public void field() {
        ProductSearchQueryExpressionValue value = ProductSearchQueryExpressionValue.of();
        value.setField("field");
        Assertions.assertThat(value.getField()).isEqualTo("field");
    }

    @Test
    public void boost() {
        ProductSearchQueryExpressionValue value = ProductSearchQueryExpressionValue.of();
        value.setBoost(0.8968434466791833);
        Assertions.assertThat(value.getBoost()).isEqualTo(0.8968434466791833);
    }

    @Test
    public void attributeType() {
        ProductSearchQueryExpressionValue value = ProductSearchQueryExpressionValue.of();
        value.setAttributeType(
            com.commercetools.api.models.product_search.ProductSearchAttributeType.findEnum("boolean"));
        Assertions.assertThat(value.getAttributeType())
                .isEqualTo(com.commercetools.api.models.product_search.ProductSearchAttributeType.findEnum("boolean"));
    }
}
