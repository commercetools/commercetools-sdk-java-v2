
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
public class CategoryCreatedMessagePayloadTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(CategoryCreatedMessagePayloadBuilder builder) {
        CategoryCreatedMessagePayload categoryCreatedMessagePayload = builder.buildUnchecked();
        Assertions.assertThat(categoryCreatedMessagePayload).isInstanceOf(CategoryCreatedMessagePayload.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { CategoryCreatedMessagePayload.builder()
                .category(new com.commercetools.api.models.category.CategoryImpl()) } };
    }

    @Test
    public void category() {
        CategoryCreatedMessagePayload value = CategoryCreatedMessagePayload.of();
        value.setCategory(new com.commercetools.api.models.category.CategoryImpl());
        Assertions.assertThat(value.getCategory()).isEqualTo(new com.commercetools.api.models.category.CategoryImpl());
    }
}
