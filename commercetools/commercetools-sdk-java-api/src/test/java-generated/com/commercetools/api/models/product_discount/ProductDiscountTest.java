
package com.commercetools.api.models.product_discount;

import java.time.ZonedDateTime;
import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ProductDiscountTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ProductDiscountBuilder builder) {
        ProductDiscount productDiscount = builder.buildUnchecked();
        Assertions.assertThat(productDiscount).isInstanceOf(ProductDiscount.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "id", ProductDiscount.builder().id("id") },
                new Object[] { "version", ProductDiscount.builder().version(2L) },
                new Object[] { "createdAt",
                        ProductDiscount.builder().createdAt(ZonedDateTime.parse("2023-06-01T12:00Z")) },
                new Object[] { "lastModifiedAt",
                        ProductDiscount.builder().lastModifiedAt(ZonedDateTime.parse("2023-06-01T12:00Z")) },
                new Object[] { "lastModifiedBy",
                        ProductDiscount.builder()
                                .lastModifiedBy(new com.commercetools.api.models.common.LastModifiedByImpl()) },
                new Object[] { "createdBy",
                        ProductDiscount.builder().createdBy(new com.commercetools.api.models.common.CreatedByImpl()) },
                new Object[] { "name",
                        ProductDiscount.builder().name(new com.commercetools.api.models.common.LocalizedStringImpl()) },
                new Object[] { "key", ProductDiscount.builder().key("key") },
                new Object[] { "description",
                        ProductDiscount.builder()
                                .description(new com.commercetools.api.models.common.LocalizedStringImpl()) },
                new Object[] { "value",
                        ProductDiscount.builder()
                                .value(new com.commercetools.api.models.product_discount.ProductDiscountValueImpl()) },
                new Object[] { "predicate", ProductDiscount.builder().predicate("predicate") },
                new Object[] { "sortOrder", ProductDiscount.builder().sortOrder("sortOrder") },
                new Object[] { "isActive", ProductDiscount.builder().isActive(true) },
                new Object[] { "references",
                        ProductDiscount.builder()
                                .references(Collections
                                        .singletonList(new com.commercetools.api.models.common.ReferenceImpl())) },
                new Object[] { "validFrom",
                        ProductDiscount.builder().validFrom(ZonedDateTime.parse("2023-06-01T12:00Z")) },
                new Object[] { "validUntil",
                        ProductDiscount.builder().validUntil(ZonedDateTime.parse("2023-06-01T12:00Z")) } };
    }

    @Test
    public void id() {
        ProductDiscount value = ProductDiscount.of();
        value.setId("id");
        Assertions.assertThat(value.getId()).isEqualTo("id");
    }

    @Test
    public void version() {
        ProductDiscount value = ProductDiscount.of();
        value.setVersion(2L);
        Assertions.assertThat(value.getVersion()).isEqualTo(2L);
    }

    @Test
    public void createdAt() {
        ProductDiscount value = ProductDiscount.of();
        value.setCreatedAt(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getCreatedAt()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }

    @Test
    public void lastModifiedAt() {
        ProductDiscount value = ProductDiscount.of();
        value.setLastModifiedAt(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getLastModifiedAt()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }

    @Test
    public void lastModifiedBy() {
        ProductDiscount value = ProductDiscount.of();
        value.setLastModifiedBy(new com.commercetools.api.models.common.LastModifiedByImpl());
        Assertions.assertThat(value.getLastModifiedBy())
                .isEqualTo(new com.commercetools.api.models.common.LastModifiedByImpl());
    }

    @Test
    public void createdBy() {
        ProductDiscount value = ProductDiscount.of();
        value.setCreatedBy(new com.commercetools.api.models.common.CreatedByImpl());
        Assertions.assertThat(value.getCreatedBy()).isEqualTo(new com.commercetools.api.models.common.CreatedByImpl());
    }

    @Test
    public void name() {
        ProductDiscount value = ProductDiscount.of();
        value.setName(new com.commercetools.api.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getName()).isEqualTo(new com.commercetools.api.models.common.LocalizedStringImpl());
    }

    @Test
    public void key() {
        ProductDiscount value = ProductDiscount.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }

    @Test
    public void description() {
        ProductDiscount value = ProductDiscount.of();
        value.setDescription(new com.commercetools.api.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getDescription())
                .isEqualTo(new com.commercetools.api.models.common.LocalizedStringImpl());
    }

    @Test
    public void value() {
        ProductDiscount value = ProductDiscount.of();
        value.setValue(new com.commercetools.api.models.product_discount.ProductDiscountValueImpl());
        Assertions.assertThat(value.getValue())
                .isEqualTo(new com.commercetools.api.models.product_discount.ProductDiscountValueImpl());
    }

    @Test
    public void predicate() {
        ProductDiscount value = ProductDiscount.of();
        value.setPredicate("predicate");
        Assertions.assertThat(value.getPredicate()).isEqualTo("predicate");
    }

    @Test
    public void sortOrder() {
        ProductDiscount value = ProductDiscount.of();
        value.setSortOrder("sortOrder");
        Assertions.assertThat(value.getSortOrder()).isEqualTo("sortOrder");
    }

    @Test
    public void isActive() {
        ProductDiscount value = ProductDiscount.of();
        value.setIsActive(true);
        Assertions.assertThat(value.getIsActive()).isEqualTo(true);
    }

    @Test
    public void references() {
        ProductDiscount value = ProductDiscount.of();
        value.setReferences(Collections.singletonList(new com.commercetools.api.models.common.ReferenceImpl()));
        Assertions.assertThat(value.getReferences())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.common.ReferenceImpl()));
    }

    @Test
    public void validFrom() {
        ProductDiscount value = ProductDiscount.of();
        value.setValidFrom(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getValidFrom()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }

    @Test
    public void validUntil() {
        ProductDiscount value = ProductDiscount.of();
        value.setValidUntil(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getValidUntil()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }
}
