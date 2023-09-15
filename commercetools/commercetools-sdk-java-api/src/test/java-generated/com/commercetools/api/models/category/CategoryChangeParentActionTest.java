
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
public class CategoryChangeParentActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(CategoryChangeParentActionBuilder builder) {
        CategoryChangeParentAction categoryChangeParentAction = builder.buildUnchecked();
        Assertions.assertThat(categoryChangeParentAction).isInstanceOf(CategoryChangeParentAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { CategoryChangeParentAction.builder()
                .parent(new com.commercetools.api.models.category.CategoryResourceIdentifierImpl()) } };
    }

    @Test
    public void parent() {
        CategoryChangeParentAction value = CategoryChangeParentAction.of();
        value.setParent(new com.commercetools.api.models.category.CategoryResourceIdentifierImpl());
        Assertions.assertThat(value.getParent())
                .isEqualTo(new com.commercetools.api.models.category.CategoryResourceIdentifierImpl());
    }
}
