
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
public class TaxCategoryDraftTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(TaxCategoryDraftBuilder builder) {
        TaxCategoryDraft taxCategoryDraft = builder.buildUnchecked();
        Assertions.assertThat(taxCategoryDraft).isInstanceOf(TaxCategoryDraft.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { TaxCategoryDraft.builder().name("name") },
                new Object[] { TaxCategoryDraft.builder().description("description") },
                new Object[] { TaxCategoryDraft.builder()
                        .rates(Collections
                                .singletonList(new com.commercetools.api.models.tax_category.TaxRateDraftImpl())) },
                new Object[] { TaxCategoryDraft.builder().key("key") } };
    }

    @Test
    public void name() {
        TaxCategoryDraft value = TaxCategoryDraft.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }

    @Test
    public void description() {
        TaxCategoryDraft value = TaxCategoryDraft.of();
        value.setDescription("description");
        Assertions.assertThat(value.getDescription()).isEqualTo("description");
    }

    @Test
    public void rates() {
        TaxCategoryDraft value = TaxCategoryDraft.of();
        value.setRates(Collections.singletonList(new com.commercetools.api.models.tax_category.TaxRateDraftImpl()));
        Assertions.assertThat(value.getRates())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.tax_category.TaxRateDraftImpl()));
    }

    @Test
    public void key() {
        TaxCategoryDraft value = TaxCategoryDraft.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }
}
