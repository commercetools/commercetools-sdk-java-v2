
package com.commercetools.api.models.type;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class TypeUpdateTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, TypeUpdateBuilder builder) {
        TypeUpdate typeUpdate = builder.buildUnchecked();
        Assertions.assertThat(typeUpdate).isInstanceOf(TypeUpdate.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "version", TypeUpdate.builder().version(2L) }, new Object[] { "actions",
                TypeUpdate.builder()
                        .actions(Collections
                                .singletonList(new com.commercetools.api.models.type.TypeUpdateActionImpl())) } };
    }

    @Test
    public void version() {
        TypeUpdate value = TypeUpdate.of();
        value.setVersion(2L);
        Assertions.assertThat(value.getVersion()).isEqualTo(2L);
    }

    @Test
    public void actions() {
        TypeUpdate value = TypeUpdate.of();
        value.setActions(Collections.singletonList(new com.commercetools.api.models.type.TypeUpdateActionImpl()));
        Assertions.assertThat(value.getActions())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.type.TypeUpdateActionImpl()));
    }
}
