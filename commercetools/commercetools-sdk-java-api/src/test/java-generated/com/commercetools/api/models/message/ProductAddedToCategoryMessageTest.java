
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
public class ProductAddedToCategoryMessageTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ProductAddedToCategoryMessageBuilder builder) {
        ProductAddedToCategoryMessage productAddedToCategoryMessage = builder.buildUnchecked();
        Assertions.assertThat(productAddedToCategoryMessage).isInstanceOf(ProductAddedToCategoryMessage.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { ProductAddedToCategoryMessage.builder()
                        .category(new com.commercetools.api.models.category.CategoryReferenceImpl()) },
                new Object[] { ProductAddedToCategoryMessage.builder().staged(true) } };
    }

    @Test
    public void category() {
        ProductAddedToCategoryMessage value = ProductAddedToCategoryMessage.of();
        value.setCategory(new com.commercetools.api.models.category.CategoryReferenceImpl());
        Assertions.assertThat(value.getCategory())
                .isEqualTo(new com.commercetools.api.models.category.CategoryReferenceImpl());
    }

    @Test
    public void staged() {
        ProductAddedToCategoryMessage value = ProductAddedToCategoryMessage.of();
        value.setStaged(true);
        Assertions.assertThat(value.getStaged()).isEqualTo(true);
    }
}
