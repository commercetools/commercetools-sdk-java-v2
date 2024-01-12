
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
public class ProductSearchFullTextValueTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ProductSearchFullTextValueBuilder builder) {
        ProductSearchFullTextValue productSearchFullTextValue = builder.buildUnchecked();
        Assertions.assertThat(productSearchFullTextValue).isInstanceOf(ProductSearchFullTextValue.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ProductSearchFullTextValue.builder().value("value") },
                new Object[] { ProductSearchFullTextValue.builder().language("language") },
                new Object[] { ProductSearchFullTextValue.builder()
                        .mustMatch(
                            com.commercetools.api.models.product_search.ProductSearchMatchType.findEnum("any")) } };
    }

    @Test
    public void value() {
        ProductSearchFullTextValue value = ProductSearchFullTextValue.of();
        value.setValue("value");
        Assertions.assertThat(value.getValue()).isEqualTo("value");
    }

    @Test
    public void language() {
        ProductSearchFullTextValue value = ProductSearchFullTextValue.of();
        value.setLanguage("language");
        Assertions.assertThat(value.getLanguage()).isEqualTo("language");
    }

    @Test
    public void mustMatch() {
        ProductSearchFullTextValue value = ProductSearchFullTextValue.of();
        value.setMustMatch(com.commercetools.api.models.product_search.ProductSearchMatchType.findEnum("any"));
        Assertions.assertThat(value.getMustMatch())
                .isEqualTo(com.commercetools.api.models.product_search.ProductSearchMatchType.findEnum("any"));
    }
}
