
package com.commercetools.history.models.change;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class RevertStagedVariantChangesChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, RevertStagedVariantChangesChangeBuilder builder) {
        RevertStagedVariantChangesChange revertStagedVariantChangesChange = builder.buildUnchecked();
        Assertions.assertThat(revertStagedVariantChangesChange).isInstanceOf(RevertStagedVariantChangesChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "change", RevertStagedVariantChangesChange.builder().change("change") } };
    }

    @Test
    public void change() {
        RevertStagedVariantChangesChange value = RevertStagedVariantChangesChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }
}
