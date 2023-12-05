
package com.commercetools.api.models.tax_category;

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
public class TaxCategorySetDescriptionActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(TaxCategorySetDescriptionActionBuilder builder) {
        TaxCategorySetDescriptionAction taxCategorySetDescriptionAction = builder.buildUnchecked();
        Assertions.assertThat(taxCategorySetDescriptionAction).isInstanceOf(TaxCategorySetDescriptionAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { TaxCategorySetDescriptionAction.builder().description("description") } };
    }

    @Test
    public void description() {
        TaxCategorySetDescriptionAction value = TaxCategorySetDescriptionAction.of();
        value.setDescription("description");
        Assertions.assertThat(value.getDescription()).isEqualTo("description");
    }
}
