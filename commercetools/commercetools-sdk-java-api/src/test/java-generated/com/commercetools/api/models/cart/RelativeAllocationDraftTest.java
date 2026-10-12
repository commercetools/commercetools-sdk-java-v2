
package com.commercetools.api.models.cart;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class RelativeAllocationDraftTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, RelativeAllocationDraftBuilder builder) {
        RelativeAllocationDraft relativeAllocationDraft = builder.buildUnchecked();
        Assertions.assertThat(relativeAllocationDraft).isInstanceOf(RelativeAllocationDraft.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "percentage", RelativeAllocationDraft.builder().percentage(3) } };
    }

    @Test
    public void percentage() {
        RelativeAllocationDraft value = RelativeAllocationDraft.of();
        value.setPercentage(3);
        Assertions.assertThat(value.getPercentage()).isEqualTo(3);
    }
}
