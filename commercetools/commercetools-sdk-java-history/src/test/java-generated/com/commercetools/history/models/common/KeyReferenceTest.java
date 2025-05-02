
package com.commercetools.history.models.common;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class KeyReferenceTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, KeyReferenceBuilder builder) {
        KeyReference keyReference = builder.buildUnchecked();
        Assertions.assertThat(keyReference).isInstanceOf(KeyReference.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "key", KeyReference.builder().key("key") },
                new Object[] { "typeId", KeyReference.builder()
                        .typeId(com.commercetools.history.models.common.ReferenceTypeId.findEnum("associate-role")) } };
    }

    @Test
    public void key() {
        KeyReference value = KeyReference.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }

    @Test
    public void typeId() {
        KeyReference value = KeyReference.of();
        value.setTypeId(com.commercetools.history.models.common.ReferenceTypeId.findEnum("associate-role"));
        Assertions.assertThat(value.getTypeId())
                .isEqualTo(com.commercetools.history.models.common.ReferenceTypeId.findEnum("associate-role"));
    }
}
