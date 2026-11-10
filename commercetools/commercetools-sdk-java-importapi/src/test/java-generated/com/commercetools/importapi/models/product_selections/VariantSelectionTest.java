
package com.commercetools.importapi.models.product_selections;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class VariantSelectionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, VariantSelectionBuilder builder) {
        VariantSelection variantSelection = builder.buildUnchecked();
        Assertions.assertThat(variantSelection).isInstanceOf(VariantSelection.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "type",
                        VariantSelection.builder()
                                .type(com.commercetools.importapi.models.product_selections.VariantSelectionType
                                        .findEnum("includeOnly")) },
                new Object[] { "skus", VariantSelection.builder().skus(Collections.singletonList("skus")) } };
    }

    @Test
    public void type() {
        VariantSelection value = VariantSelection.of();
        value.setType(
            com.commercetools.importapi.models.product_selections.VariantSelectionType.findEnum("includeOnly"));
        Assertions.assertThat(value.getType())
                .isEqualTo(
                    com.commercetools.importapi.models.product_selections.VariantSelectionType.findEnum("includeOnly"));
    }

    @Test
    public void skus() {
        VariantSelection value = VariantSelection.of();
        value.setSkus(Collections.singletonList("skus"));
        Assertions.assertThat(value.getSkus()).isEqualTo(Collections.singletonList("skus"));
    }
}
