
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
public class CategorySetMetaDescriptionActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(CategorySetMetaDescriptionActionBuilder builder) {
        CategorySetMetaDescriptionAction categorySetMetaDescriptionAction = builder.buildUnchecked();
        Assertions.assertThat(categorySetMetaDescriptionAction).isInstanceOf(CategorySetMetaDescriptionAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { CategorySetMetaDescriptionAction.builder()
                .metaDescription(new com.commercetools.api.models.common.LocalizedStringImpl()) } };
    }

    @Test
    public void metaDescription() {
        CategorySetMetaDescriptionAction value = CategorySetMetaDescriptionAction.of();
        value.setMetaDescription(new com.commercetools.api.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getMetaDescription())
                .isEqualTo(new com.commercetools.api.models.common.LocalizedStringImpl());
    }
}
