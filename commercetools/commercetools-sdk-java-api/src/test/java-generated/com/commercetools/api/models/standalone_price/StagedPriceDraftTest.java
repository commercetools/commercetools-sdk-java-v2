
package com.commercetools.api.models.standalone_price;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class StagedPriceDraftTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, StagedPriceDraftBuilder builder) {
        StagedPriceDraft stagedPriceDraft = builder.buildUnchecked();
        Assertions.assertThat(stagedPriceDraft).isInstanceOf(StagedPriceDraft.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "value",
                StagedPriceDraft.builder().value(new com.commercetools.api.models.common.TypedMoneyDraftImpl()) } };
    }

    @Test
    public void value() {
        StagedPriceDraft value = StagedPriceDraft.of();
        value.setValue(new com.commercetools.api.models.common.TypedMoneyDraftImpl());
        Assertions.assertThat(value.getValue())
                .isEqualTo(new com.commercetools.api.models.common.TypedMoneyDraftImpl());
    }
}
