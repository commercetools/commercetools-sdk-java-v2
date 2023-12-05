
package com.commercetools.api.models.category;

import java.util.Collections;

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
public class CategoryUpdateTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(CategoryUpdateBuilder builder) {
        CategoryUpdate categoryUpdate = builder.buildUnchecked();
        Assertions.assertThat(categoryUpdate).isInstanceOf(CategoryUpdate.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { CategoryUpdate.builder().version(2L) },
                new Object[] { CategoryUpdate.builder()
                        .actions(Collections.singletonList(
                            new com.commercetools.api.models.category.CategoryUpdateActionImpl())) } };
    }

    @Test
    public void version() {
        CategoryUpdate value = CategoryUpdate.of();
        value.setVersion(2L);
        Assertions.assertThat(value.getVersion()).isEqualTo(2L);
    }

    @Test
    public void actions() {
        CategoryUpdate value = CategoryUpdate.of();
        value.setActions(
            Collections.singletonList(new com.commercetools.api.models.category.CategoryUpdateActionImpl()));
        Assertions.assertThat(value.getActions())
                .isEqualTo(
                    Collections.singletonList(new com.commercetools.api.models.category.CategoryUpdateActionImpl()));
    }
}
