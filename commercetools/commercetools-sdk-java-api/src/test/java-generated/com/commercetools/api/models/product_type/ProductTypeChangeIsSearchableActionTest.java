
package com.commercetools.api.models.product_type;

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
public class ProductTypeChangeIsSearchableActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ProductTypeChangeIsSearchableActionBuilder builder) {
        ProductTypeChangeIsSearchableAction productTypeChangeIsSearchableAction = builder.buildUnchecked();
        Assertions.assertThat(productTypeChangeIsSearchableAction)
                .isInstanceOf(ProductTypeChangeIsSearchableAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { ProductTypeChangeIsSearchableAction.builder().attributeName("attributeName") },
                new Object[] { ProductTypeChangeIsSearchableAction.builder().isSearchable(true) } };
    }

    @Test
    public void attributeName() {
        ProductTypeChangeIsSearchableAction value = ProductTypeChangeIsSearchableAction.of();
        value.setAttributeName("attributeName");
        Assertions.assertThat(value.getAttributeName()).isEqualTo("attributeName");
    }

    @Test
    public void isSearchable() {
        ProductTypeChangeIsSearchableAction value = ProductTypeChangeIsSearchableAction.of();
        value.setIsSearchable(true);
        Assertions.assertThat(value.getIsSearchable()).isEqualTo(true);
    }
}
