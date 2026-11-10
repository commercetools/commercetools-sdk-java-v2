
package com.commercetools.api.models.variant;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class VariantUpdateTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, VariantUpdateBuilder builder) {
        VariantUpdate variantUpdate = builder.buildUnchecked();
        Assertions.assertThat(variantUpdate).isInstanceOf(VariantUpdate.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "version", VariantUpdate.builder().version(2L) },
                new Object[] { "actions",
                        VariantUpdate.builder()
                                .actions(Collections.singletonList(
                                    new com.commercetools.api.models.variant.VariantUpdateActionImpl())) } };
    }

    @Test
    public void version() {
        VariantUpdate value = VariantUpdate.of();
        value.setVersion(2L);
        Assertions.assertThat(value.getVersion()).isEqualTo(2L);
    }

    @Test
    public void actions() {
        VariantUpdate value = VariantUpdate.of();
        value.setActions(Collections.singletonList(new com.commercetools.api.models.variant.VariantUpdateActionImpl()));
        Assertions.assertThat(value.getActions())
                .isEqualTo(
                    Collections.singletonList(new com.commercetools.api.models.variant.VariantUpdateActionImpl()));
    }
}
