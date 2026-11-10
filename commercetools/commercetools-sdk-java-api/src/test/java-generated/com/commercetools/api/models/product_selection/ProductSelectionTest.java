
package com.commercetools.api.models.product_selection;

import java.time.ZonedDateTime;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ProductSelectionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ProductSelectionBuilder builder) {
        ProductSelection productSelection = builder.buildUnchecked();
        Assertions.assertThat(productSelection).isInstanceOf(ProductSelection.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "id", ProductSelection.builder().id("id") },
                new Object[] { "version", ProductSelection.builder().version(2L) },
                new Object[] { "createdAt",
                        ProductSelection.builder().createdAt(ZonedDateTime.parse("2023-06-01T12:00Z")) },
                new Object[] { "lastModifiedAt",
                        ProductSelection.builder().lastModifiedAt(ZonedDateTime.parse("2023-06-01T12:00Z")) },
                new Object[] { "lastModifiedBy",
                        ProductSelection.builder()
                                .lastModifiedBy(new com.commercetools.api.models.common.LastModifiedByImpl()) },
                new Object[] { "createdBy",
                        ProductSelection.builder().createdBy(new com.commercetools.api.models.common.CreatedByImpl()) },
                new Object[] { "key", ProductSelection.builder().key("key") },
                new Object[] { "name",
                        ProductSelection.builder()
                                .name(new com.commercetools.api.models.common.LocalizedStringImpl()) },
                new Object[] { "productCount", ProductSelection.builder().productCount(1) },
                new Object[] { "mode",
                        ProductSelection.builder()
                                .mode(com.commercetools.api.models.product_selection.ProductSelectionMode
                                        .findEnum("Individual")) },
                new Object[] { "custom",
                        ProductSelection.builder().custom(new com.commercetools.api.models.type.CustomFieldsImpl()) } };
    }

    @Test
    public void id() {
        ProductSelection value = ProductSelection.of();
        value.setId("id");
        Assertions.assertThat(value.getId()).isEqualTo("id");
    }

    @Test
    public void version() {
        ProductSelection value = ProductSelection.of();
        value.setVersion(2L);
        Assertions.assertThat(value.getVersion()).isEqualTo(2L);
    }

    @Test
    public void createdAt() {
        ProductSelection value = ProductSelection.of();
        value.setCreatedAt(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getCreatedAt()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }

    @Test
    public void lastModifiedAt() {
        ProductSelection value = ProductSelection.of();
        value.setLastModifiedAt(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getLastModifiedAt()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }

    @Test
    public void lastModifiedBy() {
        ProductSelection value = ProductSelection.of();
        value.setLastModifiedBy(new com.commercetools.api.models.common.LastModifiedByImpl());
        Assertions.assertThat(value.getLastModifiedBy())
                .isEqualTo(new com.commercetools.api.models.common.LastModifiedByImpl());
    }

    @Test
    public void createdBy() {
        ProductSelection value = ProductSelection.of();
        value.setCreatedBy(new com.commercetools.api.models.common.CreatedByImpl());
        Assertions.assertThat(value.getCreatedBy()).isEqualTo(new com.commercetools.api.models.common.CreatedByImpl());
    }

    @Test
    public void key() {
        ProductSelection value = ProductSelection.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }

    @Test
    public void name() {
        ProductSelection value = ProductSelection.of();
        value.setName(new com.commercetools.api.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getName()).isEqualTo(new com.commercetools.api.models.common.LocalizedStringImpl());
    }

    @Test
    public void productCount() {
        ProductSelection value = ProductSelection.of();
        value.setProductCount(1);
        Assertions.assertThat(value.getProductCount()).isEqualTo(1);
    }

    @Test
    public void mode() {
        ProductSelection value = ProductSelection.of();
        value.setMode(com.commercetools.api.models.product_selection.ProductSelectionMode.findEnum("Individual"));
        Assertions.assertThat(value.getMode())
                .isEqualTo(com.commercetools.api.models.product_selection.ProductSelectionMode.findEnum("Individual"));
    }

    @Test
    public void custom() {
        ProductSelection value = ProductSelection.of();
        value.setCustom(new com.commercetools.api.models.type.CustomFieldsImpl());
        Assertions.assertThat(value.getCustom()).isEqualTo(new com.commercetools.api.models.type.CustomFieldsImpl());
    }
}
