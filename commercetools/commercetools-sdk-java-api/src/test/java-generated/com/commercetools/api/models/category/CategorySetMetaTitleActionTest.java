
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
public class CategorySetMetaTitleActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(CategorySetMetaTitleActionBuilder builder) {
        CategorySetMetaTitleAction categorySetMetaTitleAction = builder.buildUnchecked();
        Assertions.assertThat(categorySetMetaTitleAction).isInstanceOf(CategorySetMetaTitleAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { CategorySetMetaTitleAction.builder()
                .metaTitle(new com.commercetools.api.models.common.LocalizedStringImpl()) } };
    }

    @Test
    public void metaTitle() {
        CategorySetMetaTitleAction value = CategorySetMetaTitleAction.of();
        value.setMetaTitle(new com.commercetools.api.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getMetaTitle())
                .isEqualTo(new com.commercetools.api.models.common.LocalizedStringImpl());
    }
}
