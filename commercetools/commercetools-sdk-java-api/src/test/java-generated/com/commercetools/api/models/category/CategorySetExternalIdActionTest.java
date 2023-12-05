
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
public class CategorySetExternalIdActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(CategorySetExternalIdActionBuilder builder) {
        CategorySetExternalIdAction categorySetExternalIdAction = builder.buildUnchecked();
        Assertions.assertThat(categorySetExternalIdAction).isInstanceOf(CategorySetExternalIdAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { CategorySetExternalIdAction.builder().externalId("externalId") } };
    }

    @Test
    public void externalId() {
        CategorySetExternalIdAction value = CategorySetExternalIdAction.of();
        value.setExternalId("externalId");
        Assertions.assertThat(value.getExternalId()).isEqualTo("externalId");
    }
}
