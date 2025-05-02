
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ContainerAndKeyTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ContainerAndKeyBuilder builder) {
        ContainerAndKey containerAndKey = builder.buildUnchecked();
        Assertions.assertThat(containerAndKey).isInstanceOf(ContainerAndKey.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "key", ContainerAndKey.builder().key("key") },
                new Object[] { "container", ContainerAndKey.builder().container("container") } };
    }

    @Test
    public void key() {
        ContainerAndKey value = ContainerAndKey.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }

    @Test
    public void container() {
        ContainerAndKey value = ContainerAndKey.of();
        value.setContainer("container");
        Assertions.assertThat(value.getContainer()).isEqualTo("container");
    }
}
