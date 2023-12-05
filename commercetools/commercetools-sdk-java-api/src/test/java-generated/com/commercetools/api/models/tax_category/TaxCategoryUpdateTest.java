
package com.commercetools.api.models.tax_category;

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
public class TaxCategoryUpdateTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(TaxCategoryUpdateBuilder builder) {
        TaxCategoryUpdate taxCategoryUpdate = builder.buildUnchecked();
        Assertions.assertThat(taxCategoryUpdate).isInstanceOf(TaxCategoryUpdate.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { TaxCategoryUpdate.builder().version(2L) },
                new Object[] { TaxCategoryUpdate.builder()
                        .actions(Collections.singletonList(
                            new com.commercetools.api.models.tax_category.TaxCategoryUpdateActionImpl())) } };
    }

    @Test
    public void version() {
        TaxCategoryUpdate value = TaxCategoryUpdate.of();
        value.setVersion(2L);
        Assertions.assertThat(value.getVersion()).isEqualTo(2L);
    }

    @Test
    public void actions() {
        TaxCategoryUpdate value = TaxCategoryUpdate.of();
        value.setActions(
            Collections.singletonList(new com.commercetools.api.models.tax_category.TaxCategoryUpdateActionImpl()));
        Assertions.assertThat(value.getActions())
                .isEqualTo(Collections
                        .singletonList(new com.commercetools.api.models.tax_category.TaxCategoryUpdateActionImpl()));
    }
}
