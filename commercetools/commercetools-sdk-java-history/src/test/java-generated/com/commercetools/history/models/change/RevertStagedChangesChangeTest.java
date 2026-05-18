
package com.commercetools.history.models.change;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class RevertStagedChangesChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, RevertStagedChangesChangeBuilder builder) {
        RevertStagedChangesChange revertStagedChangesChange = builder.buildUnchecked();
        Assertions.assertThat(revertStagedChangesChange).isInstanceOf(RevertStagedChangesChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "change", RevertStagedChangesChange.builder().change("change") } };
    }

    @Test
    public void change() {
        RevertStagedChangesChange value = RevertStagedChangesChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }
}
