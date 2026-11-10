
package com.commercetools.api.models.discount_group;

import java.time.ZonedDateTime;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class DiscountGroupTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, DiscountGroupBuilder builder) {
        DiscountGroup discountGroup = builder.buildUnchecked();
        Assertions.assertThat(discountGroup).isInstanceOf(DiscountGroup.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "id", DiscountGroup.builder().id("id") },
                new Object[] { "version", DiscountGroup.builder().version(2L) },
                new Object[] { "name",
                        DiscountGroup.builder().name(new com.commercetools.api.models.common.LocalizedStringImpl()) },
                new Object[] { "key", DiscountGroup.builder().key("key") },
                new Object[] { "description",
                        DiscountGroup.builder()
                                .description(new com.commercetools.api.models.common.LocalizedStringImpl()) },
                new Object[] { "sortOrder", DiscountGroup.builder().sortOrder("sortOrder") },
                new Object[] { "isActive", DiscountGroup.builder().isActive(true) },
                new Object[] { "createdAt",
                        DiscountGroup.builder().createdAt(ZonedDateTime.parse("2023-06-01T12:00Z")) },
                new Object[] { "lastModifiedAt",
                        DiscountGroup.builder().lastModifiedAt(ZonedDateTime.parse("2023-06-01T12:00Z")) },
                new Object[] { "lastModifiedBy",
                        DiscountGroup.builder()
                                .lastModifiedBy(new com.commercetools.api.models.common.LastModifiedByImpl()) },
                new Object[] { "createdBy",
                        DiscountGroup.builder().createdBy(new com.commercetools.api.models.common.CreatedByImpl()) } };
    }

    @Test
    public void id() {
        DiscountGroup value = DiscountGroup.of();
        value.setId("id");
        Assertions.assertThat(value.getId()).isEqualTo("id");
    }

    @Test
    public void version() {
        DiscountGroup value = DiscountGroup.of();
        value.setVersion(2L);
        Assertions.assertThat(value.getVersion()).isEqualTo(2L);
    }

    @Test
    public void name() {
        DiscountGroup value = DiscountGroup.of();
        value.setName(new com.commercetools.api.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getName()).isEqualTo(new com.commercetools.api.models.common.LocalizedStringImpl());
    }

    @Test
    public void key() {
        DiscountGroup value = DiscountGroup.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }

    @Test
    public void description() {
        DiscountGroup value = DiscountGroup.of();
        value.setDescription(new com.commercetools.api.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getDescription())
                .isEqualTo(new com.commercetools.api.models.common.LocalizedStringImpl());
    }

    @Test
    public void sortOrder() {
        DiscountGroup value = DiscountGroup.of();
        value.setSortOrder("sortOrder");
        Assertions.assertThat(value.getSortOrder()).isEqualTo("sortOrder");
    }

    @Test
    public void isActive() {
        DiscountGroup value = DiscountGroup.of();
        value.setIsActive(true);
        Assertions.assertThat(value.getIsActive()).isEqualTo(true);
    }

    @Test
    public void createdAt() {
        DiscountGroup value = DiscountGroup.of();
        value.setCreatedAt(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getCreatedAt()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }

    @Test
    public void lastModifiedAt() {
        DiscountGroup value = DiscountGroup.of();
        value.setLastModifiedAt(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getLastModifiedAt()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }

    @Test
    public void lastModifiedBy() {
        DiscountGroup value = DiscountGroup.of();
        value.setLastModifiedBy(new com.commercetools.api.models.common.LastModifiedByImpl());
        Assertions.assertThat(value.getLastModifiedBy())
                .isEqualTo(new com.commercetools.api.models.common.LastModifiedByImpl());
    }

    @Test
    public void createdBy() {
        DiscountGroup value = DiscountGroup.of();
        value.setCreatedBy(new com.commercetools.api.models.common.CreatedByImpl());
        Assertions.assertThat(value.getCreatedBy()).isEqualTo(new com.commercetools.api.models.common.CreatedByImpl());
    }
}
