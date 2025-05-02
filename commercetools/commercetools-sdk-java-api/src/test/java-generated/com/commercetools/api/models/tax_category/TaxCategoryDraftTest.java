
package com.commercetools.api.models.tax_category;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class TaxCategoryDraftTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, TaxCategoryDraftBuilder builder) {
        TaxCategoryDraft taxCategoryDraft = builder.buildUnchecked();
        Assertions.assertThat(taxCategoryDraft).isInstanceOf(TaxCategoryDraft.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "name", TaxCategoryDraft.builder().name("name") },
                new Object[] { "description", TaxCategoryDraft.builder().description("description") },
                new Object[] { "rates",
                        TaxCategoryDraft.builder()
                                .rates(Collections.singletonList(
                                    new com.commercetools.api.models.tax_category.TaxRateDraftImpl())) },
                new Object[] { "key", TaxCategoryDraft.builder().key("key") } };
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
