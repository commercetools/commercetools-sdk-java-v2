
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
public class ProductSearchAnyValueTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ProductSearchAnyValueBuilder builder) {
        ProductSearchAnyValue productSearchAnyValue = builder.buildUnchecked();
        Assertions.assertThat(productSearchAnyValue).isInstanceOf(ProductSearchAnyValue.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ProductSearchAnyValue.builder().value("value") },
                new Object[] { ProductSearchAnyValue.builder().language("language") },
                new Object[] { ProductSearchAnyValue.builder().caseInsensitive(true) } };
    }

    @Test
    public void value() {
        ProductSearchAnyValue value = ProductSearchAnyValue.of();
        value.setValue("value");
        Assertions.assertThat(value.getValue()).isEqualTo("value");
    }

    @Test
    public void language() {
        ProductSearchAnyValue value = ProductSearchAnyValue.of();
        value.setLanguage("language");
        Assertions.assertThat(value.getLanguage()).isEqualTo("language");
    }

    @Test
    public void caseInsensitive() {
        ProductSearchAnyValue value = ProductSearchAnyValue.of();
        value.setCaseInsensitive(true);
        Assertions.assertThat(value.getCaseInsensitive()).isEqualTo(true);
    }
}
