
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
public class CategorySetMetaKeywordsActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(CategorySetMetaKeywordsActionBuilder builder) {
        CategorySetMetaKeywordsAction categorySetMetaKeywordsAction = builder.buildUnchecked();
        Assertions.assertThat(categorySetMetaKeywordsAction).isInstanceOf(CategorySetMetaKeywordsAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { CategorySetMetaKeywordsAction.builder()
                .metaKeywords(new com.commercetools.api.models.common.LocalizedStringImpl()) } };
    }

    @Test
    public void metaKeywords() {
        CategorySetMetaKeywordsAction value = CategorySetMetaKeywordsAction.of();
        value.setMetaKeywords(new com.commercetools.api.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getMetaKeywords())
                .isEqualTo(new com.commercetools.api.models.common.LocalizedStringImpl());
    }
}
