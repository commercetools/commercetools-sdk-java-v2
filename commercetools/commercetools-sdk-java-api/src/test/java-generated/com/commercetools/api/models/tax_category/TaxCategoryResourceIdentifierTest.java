
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
public class TaxCategoryResourceIdentifierTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(TaxCategoryResourceIdentifierBuilder builder) {
        TaxCategoryResourceIdentifier taxCategoryResourceIdentifier = builder.buildUnchecked();
        Assertions.assertThat(taxCategoryResourceIdentifier).isInstanceOf(TaxCategoryResourceIdentifier.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { TaxCategoryResourceIdentifier.builder().id("id") },
                new Object[] { TaxCategoryResourceIdentifier.builder().key("key") } };
    }

    @Test
    public void id() {
        TaxCategoryResourceIdentifier value = TaxCategoryResourceIdentifier.of();
        value.setId("id");
        Assertions.assertThat(value.getId()).isEqualTo("id");
    }

    @Test
    public void key() {
        TaxCategoryResourceIdentifier value = TaxCategoryResourceIdentifier.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }
}
