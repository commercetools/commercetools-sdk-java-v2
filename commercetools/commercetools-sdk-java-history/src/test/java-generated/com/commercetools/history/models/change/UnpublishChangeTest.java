
package com.commercetools.history.models.change;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class UnpublishChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, UnpublishChangeBuilder builder) {
        UnpublishChange unpublishChange = builder.buildUnchecked();
        Assertions.assertThat(unpublishChange).isInstanceOf(UnpublishChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "change", UnpublishChange.builder().change("change") } };
    }

    @Test
    public void change() {
        UnpublishChange value = UnpublishChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }
}
