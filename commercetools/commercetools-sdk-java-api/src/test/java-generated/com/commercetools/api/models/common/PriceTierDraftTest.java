
package com.commercetools.api.models.common;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class PriceTierDraftTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, PriceTierDraftBuilder builder) {
        PriceTierDraft priceTierDraft = builder.buildUnchecked();
        Assertions.assertThat(priceTierDraft).isInstanceOf(PriceTierDraft.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "minimumQuantity", PriceTierDraft.builder().minimumQuantity(1L) },
                new Object[] { "value",
                        PriceTierDraft.builder().value(new com.commercetools.api.models.common.MoneyImpl()) } };
    }

    @Test
    public void minimumQuantity() {
        PriceTierDraft value = PriceTierDraft.of();
        value.setMinimumQuantity(1L);
        Assertions.assertThat(value.getMinimumQuantity()).isEqualTo(1L);
    }

    @Test
    public void value() {
        PriceTierDraft value = PriceTierDraft.of();
        value.setValue(new com.commercetools.api.models.common.MoneyImpl());
        Assertions.assertThat(value.getValue()).isEqualTo(new com.commercetools.api.models.common.MoneyImpl());
    }
}
