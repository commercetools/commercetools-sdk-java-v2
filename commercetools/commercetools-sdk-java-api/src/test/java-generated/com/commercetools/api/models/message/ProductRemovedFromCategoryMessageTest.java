
package com.commercetools.api.models.message;

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
public class ProductRemovedFromCategoryMessageTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ProductRemovedFromCategoryMessageBuilder builder) {
        ProductRemovedFromCategoryMessage productRemovedFromCategoryMessage = builder.buildUnchecked();
        Assertions.assertThat(productRemovedFromCategoryMessage).isInstanceOf(ProductRemovedFromCategoryMessage.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { ProductRemovedFromCategoryMessage.builder()
                        .category(new com.commercetools.api.models.category.CategoryReferenceImpl()) },
                new Object[] { ProductRemovedFromCategoryMessage.builder().staged(true) } };
    }

    @Test
    public void category() {
        ProductRemovedFromCategoryMessage value = ProductRemovedFromCategoryMessage.of();
        value.setCategory(new com.commercetools.api.models.category.CategoryReferenceImpl());
        Assertions.assertThat(value.getCategory())
                .isEqualTo(new com.commercetools.api.models.category.CategoryReferenceImpl());
    }

    @Test
    public void staged() {
        ProductRemovedFromCategoryMessage value = ProductRemovedFromCategoryMessage.of();
        value.setStaged(true);
        Assertions.assertThat(value.getStaged()).isEqualTo(true);
    }
}
