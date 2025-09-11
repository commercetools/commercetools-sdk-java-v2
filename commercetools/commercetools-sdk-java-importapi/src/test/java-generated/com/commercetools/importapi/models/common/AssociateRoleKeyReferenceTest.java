
package com.commercetools.importapi.models.common;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class AssociateRoleKeyReferenceTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, AssociateRoleKeyReferenceBuilder builder) {
        AssociateRoleKeyReference associateRoleKeyReference = builder.buildUnchecked();
        Assertions.assertThat(associateRoleKeyReference).isInstanceOf(AssociateRoleKeyReference.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "key", AssociateRoleKeyReference.builder().key("key") } };
    }

    @Test
    public void key() {
        AssociateRoleKeyReference value = AssociateRoleKeyReference.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }
}
