
package com.commercetools.history.models.change;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class PublishChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, PublishChangeBuilder builder) {
        PublishChange publishChange = builder.buildUnchecked();
        Assertions.assertThat(publishChange).isInstanceOf(PublishChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "change", PublishChange.builder().change("change") } };
    }

    @Test
    public void change() {
        PublishChange value = PublishChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }
}
