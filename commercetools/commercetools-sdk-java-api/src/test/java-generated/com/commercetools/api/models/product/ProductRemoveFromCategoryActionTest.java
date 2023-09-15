
package com.commercetools.api.models.product;

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
public class ProductRemoveFromCategoryActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ProductRemoveFromCategoryActionBuilder builder) {
        ProductRemoveFromCategoryAction productRemoveFromCategoryAction = builder.buildUnchecked();
        Assertions.assertThat(productRemoveFromCategoryAction).isInstanceOf(ProductRemoveFromCategoryAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { ProductRemoveFromCategoryAction.builder()
                        .category(new com.commercetools.api.models.category.CategoryResourceIdentifierImpl()) },
                new Object[] { ProductRemoveFromCategoryAction.builder().staged(true) } };
    }

    @Test
    public void category() {
        ProductRemoveFromCategoryAction value = ProductRemoveFromCategoryAction.of();
        value.setCategory(new com.commercetools.api.models.category.CategoryResourceIdentifierImpl());
        Assertions.assertThat(value.getCategory())
                .isEqualTo(new com.commercetools.api.models.category.CategoryResourceIdentifierImpl());
    }

    @Test
    public void staged() {
        ProductRemoveFromCategoryAction value = ProductRemoveFromCategoryAction.of();
        value.setStaged(true);
        Assertions.assertThat(value.getStaged()).isEqualTo(true);
    }
}
