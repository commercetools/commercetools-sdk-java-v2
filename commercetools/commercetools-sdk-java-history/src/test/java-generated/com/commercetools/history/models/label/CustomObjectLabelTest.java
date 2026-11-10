
package com.commercetools.history.models.label;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CustomObjectLabelTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CustomObjectLabelBuilder builder) {
        CustomObjectLabel customObjectLabel = builder.buildUnchecked();
        Assertions.assertThat(customObjectLabel).isInstanceOf(CustomObjectLabel.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "key", CustomObjectLabel.builder().key("key") },
                new Object[] { "container", CustomObjectLabel.builder().container("container") } };
    }

    @Test
    public void key() {
        CustomObjectLabel value = CustomObjectLabel.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }

    @Test
    public void container() {
        CustomObjectLabel value = CustomObjectLabel.of();
        value.setContainer("container");
        Assertions.assertThat(value.getContainer()).isEqualTo("container");
    }
}
