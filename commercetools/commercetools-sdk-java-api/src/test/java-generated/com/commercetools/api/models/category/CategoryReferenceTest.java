
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
public class CategoryReferenceTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(CategoryReferenceBuilder builder) {
        CategoryReference categoryReference = builder.buildUnchecked();
        Assertions.assertThat(categoryReference).isInstanceOf(CategoryReference.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] {
                        CategoryReference.builder().obj(new com.commercetools.api.models.category.CategoryImpl()) },
                new Object[] { CategoryReference.builder().id("id") } };
    }

    @Test
    public void obj() {
        CategoryReference value = CategoryReference.of();
        value.setObj(new com.commercetools.api.models.category.CategoryImpl());
        Assertions.assertThat(value.getObj()).isEqualTo(new com.commercetools.api.models.category.CategoryImpl());
    }

    @Test
    public void id() {
        CategoryReference value = CategoryReference.of();
        value.setId("id");
        Assertions.assertThat(value.getId()).isEqualTo("id");
    }
}
