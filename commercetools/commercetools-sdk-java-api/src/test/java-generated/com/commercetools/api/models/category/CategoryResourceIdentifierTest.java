
package com.commercetools.api.models.category;

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
public class CategoryResourceIdentifierTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(CategoryResourceIdentifierBuilder builder) {
        CategoryResourceIdentifier categoryResourceIdentifier = builder.buildUnchecked();
        Assertions.assertThat(categoryResourceIdentifier).isInstanceOf(CategoryResourceIdentifier.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { CategoryResourceIdentifier.builder().id("id") },
                new Object[] { CategoryResourceIdentifier.builder().key("key") } };
    }

    @Test
    public void id() {
        CategoryResourceIdentifier value = CategoryResourceIdentifier.of();
        value.setId("id");
        Assertions.assertThat(value.getId()).isEqualTo("id");
    }

    @Test
    public void key() {
        CategoryResourceIdentifier value = CategoryResourceIdentifier.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }
}
