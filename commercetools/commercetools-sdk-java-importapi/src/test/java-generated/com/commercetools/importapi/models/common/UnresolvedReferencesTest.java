
package com.commercetools.importapi.models.common;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class UnresolvedReferencesTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, UnresolvedReferencesBuilder builder) {
        UnresolvedReferences unresolvedReferences = builder.buildUnchecked();
        Assertions.assertThat(unresolvedReferences).isInstanceOf(UnresolvedReferences.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "key", UnresolvedReferences.builder().key("key") },
                new Object[] { "typeId", UnresolvedReferences.builder()
                        .typeId(com.commercetools.importapi.models.common.ReferenceType.findEnum("associate-role")) } };
    }

    @Test
    public void key() {
        UnresolvedReferences value = UnresolvedReferences.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }

    @Test
    public void typeId() {
        UnresolvedReferences value = UnresolvedReferences.of();
        value.setTypeId(com.commercetools.importapi.models.common.ReferenceType.findEnum("associate-role"));
        Assertions.assertThat(value.getTypeId())
                .isEqualTo(com.commercetools.importapi.models.common.ReferenceType.findEnum("associate-role"));
    }
}
