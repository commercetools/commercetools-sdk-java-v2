
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
public class CategoryCreatedMessageTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(CategoryCreatedMessageBuilder builder) {
        CategoryCreatedMessage categoryCreatedMessage = builder.buildUnchecked();
        Assertions.assertThat(categoryCreatedMessage).isInstanceOf(CategoryCreatedMessage.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] {
                CategoryCreatedMessage.builder().category(new com.commercetools.api.models.category.CategoryImpl()) } };
    }

    @Test
    public void category() {
        CategoryCreatedMessage value = CategoryCreatedMessage.of();
        value.setCategory(new com.commercetools.api.models.category.CategoryImpl());
        Assertions.assertThat(value.getCategory()).isEqualTo(new com.commercetools.api.models.category.CategoryImpl());
    }
}
