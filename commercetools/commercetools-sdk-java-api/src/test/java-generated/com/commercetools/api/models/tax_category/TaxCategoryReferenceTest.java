
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
public class TaxCategoryReferenceTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(TaxCategoryReferenceBuilder builder) {
        TaxCategoryReference taxCategoryReference = builder.buildUnchecked();
        Assertions.assertThat(taxCategoryReference).isInstanceOf(TaxCategoryReference.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { TaxCategoryReference.builder()
                        .obj(new com.commercetools.api.models.tax_category.TaxCategoryImpl()) },
                new Object[] { TaxCategoryReference.builder().id("id") } };
    }

    @Test
    public void obj() {
        TaxCategoryReference value = TaxCategoryReference.of();
        value.setObj(new com.commercetools.api.models.tax_category.TaxCategoryImpl());
        Assertions.assertThat(value.getObj())
                .isEqualTo(new com.commercetools.api.models.tax_category.TaxCategoryImpl());
    }

    @Test
    public void id() {
        TaxCategoryReference value = TaxCategoryReference.of();
        value.setId("id");
        Assertions.assertThat(value.getId()).isEqualTo("id");
    }
}
