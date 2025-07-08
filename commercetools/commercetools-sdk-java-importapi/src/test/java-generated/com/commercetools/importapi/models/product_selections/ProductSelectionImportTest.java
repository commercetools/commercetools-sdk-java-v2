
package com.commercetools.importapi.models.product_selections;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ProductSelectionImportTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ProductSelectionImportBuilder builder) {
        ProductSelectionImport productSelectionImport = builder.buildUnchecked();
        Assertions.assertThat(productSelectionImport).isInstanceOf(ProductSelectionImport.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "key", ProductSelectionImport.builder().key("key") },
                new Object[] { "name",
                        ProductSelectionImport.builder()
                                .name(new com.commercetools.importapi.models.common.LocalizedStringImpl()) },
                new Object[] { "mode",
                        ProductSelectionImport.builder()
                                .mode(com.commercetools.importapi.models.product_selections.ProductSelectionMode
                                        .findEnum("Individual")) },
                new Object[] { "custom",
                        ProductSelectionImport.builder()
                                .custom(new com.commercetools.importapi.models.customfields.CustomImpl()) },
                new Object[] { "assignments", ProductSelectionImport.builder()
                        .assignments(Collections.singletonList(
                            new com.commercetools.importapi.models.product_selections.ProductSelectionAssignmentImpl())) } };
    }

    @Test
    public void key() {
        ProductSelectionImport value = ProductSelectionImport.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }

    @Test
    public void name() {
        ProductSelectionImport value = ProductSelectionImport.of();
        value.setName(new com.commercetools.importapi.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getName())
                .isEqualTo(new com.commercetools.importapi.models.common.LocalizedStringImpl());
    }

    @Test
    public void mode() {
        ProductSelectionImport value = ProductSelectionImport.of();
        value.setMode(
            com.commercetools.importapi.models.product_selections.ProductSelectionMode.findEnum("Individual"));
        Assertions.assertThat(value.getMode())
                .isEqualTo(
                    com.commercetools.importapi.models.product_selections.ProductSelectionMode.findEnum("Individual"));
    }

    @Test
    public void custom() {
        ProductSelectionImport value = ProductSelectionImport.of();
        value.setCustom(new com.commercetools.importapi.models.customfields.CustomImpl());
        Assertions.assertThat(value.getCustom())
                .isEqualTo(new com.commercetools.importapi.models.customfields.CustomImpl());
    }

    @Test
    public void assignments() {
        ProductSelectionImport value = ProductSelectionImport.of();
        value.setAssignments(Collections.singletonList(
            new com.commercetools.importapi.models.product_selections.ProductSelectionAssignmentImpl()));
        Assertions.assertThat(value.getAssignments())
                .isEqualTo(Collections.singletonList(
                    new com.commercetools.importapi.models.product_selections.ProductSelectionAssignmentImpl()));
    }
}
