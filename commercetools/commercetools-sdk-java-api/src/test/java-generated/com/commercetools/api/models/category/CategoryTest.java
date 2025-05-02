
package com.commercetools.api.models.category;

import java.time.ZonedDateTime;
import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CategoryTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CategoryBuilder builder) {
        Category category = builder.buildUnchecked();
        Assertions.assertThat(category).isInstanceOf(Category.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "id", Category.builder().id("id") },
                new Object[] { "version", Category.builder().version(2L) },
                new Object[] { "createdAt", Category.builder().createdAt(ZonedDateTime.parse("2023-06-01T12:00Z")) },
                new Object[] { "lastModifiedAt",
                        Category.builder().lastModifiedAt(ZonedDateTime.parse("2023-06-01T12:00Z")) },
                new Object[] { "lastModifiedBy",
                        Category.builder()
                                .lastModifiedBy(new com.commercetools.api.models.common.LastModifiedByImpl()) },
                new Object[] { "createdBy",
                        Category.builder().createdBy(new com.commercetools.api.models.common.CreatedByImpl()) },
                new Object[] { "name",
                        Category.builder().name(new com.commercetools.api.models.common.LocalizedStringImpl()) },
                new Object[] { "slug",
                        Category.builder().slug(new com.commercetools.api.models.common.LocalizedStringImpl()) },
                new Object[] { "description",
                        Category.builder().description(new com.commercetools.api.models.common.LocalizedStringImpl()) },
                new Object[] { "ancestors",
                        Category.builder()
                                .ancestors(Collections.singletonList(
                                    new com.commercetools.api.models.category.CategoryReferenceImpl())) },
                new Object[] { "parent",
                        Category.builder().parent(new com.commercetools.api.models.category.CategoryReferenceImpl()) },
                new Object[] { "orderHint", Category.builder().orderHint("orderHint") },
                new Object[] { "externalId", Category.builder().externalId("externalId") },
                new Object[] { "metaTitle",
                        Category.builder().metaTitle(new com.commercetools.api.models.common.LocalizedStringImpl()) },
                new Object[] { "metaDescription",
                        Category.builder()
                                .metaDescription(new com.commercetools.api.models.common.LocalizedStringImpl()) },
                new Object[] { "metaKeywords",
                        Category.builder()
                                .metaKeywords(new com.commercetools.api.models.common.LocalizedStringImpl()) },
                new Object[] { "custom",
                        Category.builder().custom(new com.commercetools.api.models.type.CustomFieldsImpl()) },
                new Object[] { "assets", Category.builder()
                        .assets(Collections.singletonList(new com.commercetools.api.models.common.AssetImpl())) },
                new Object[] { "key", Category.builder().key("key") } };
    }

    @Test
    public void id() {
        Category value = Category.of();
        value.setId("id");
        Assertions.assertThat(value.getId()).isEqualTo("id");
    }

    @Test
    public void version() {
        Category value = Category.of();
        value.setVersion(2L);
        Assertions.assertThat(value.getVersion()).isEqualTo(2L);
    }

    @Test
    public void createdAt() {
        Category value = Category.of();
        value.setCreatedAt(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getCreatedAt()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }

    @Test
    public void lastModifiedAt() {
        Category value = Category.of();
        value.setLastModifiedAt(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getLastModifiedAt()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }

    @Test
    public void lastModifiedBy() {
        Category value = Category.of();
        value.setLastModifiedBy(new com.commercetools.api.models.common.LastModifiedByImpl());
        Assertions.assertThat(value.getLastModifiedBy())
                .isEqualTo(new com.commercetools.api.models.common.LastModifiedByImpl());
    }

    @Test
    public void createdBy() {
        Category value = Category.of();
        value.setCreatedBy(new com.commercetools.api.models.common.CreatedByImpl());
        Assertions.assertThat(value.getCreatedBy()).isEqualTo(new com.commercetools.api.models.common.CreatedByImpl());
    }

    @Test
    public void name() {
        Category value = Category.of();
        value.setName(new com.commercetools.api.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getName()).isEqualTo(new com.commercetools.api.models.common.LocalizedStringImpl());
    }

    @Test
    public void slug() {
        Category value = Category.of();
        value.setSlug(new com.commercetools.api.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getSlug()).isEqualTo(new com.commercetools.api.models.common.LocalizedStringImpl());
    }

    @Test
    public void description() {
        Category value = Category.of();
        value.setDescription(new com.commercetools.api.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getDescription())
                .isEqualTo(new com.commercetools.api.models.common.LocalizedStringImpl());
    }

    @Test
    public void ancestors() {
        Category value = Category.of();
        value.setAncestors(
            Collections.singletonList(new com.commercetools.api.models.category.CategoryReferenceImpl()));
        Assertions.assertThat(value.getAncestors())
                .isEqualTo(
                    Collections.singletonList(new com.commercetools.api.models.category.CategoryReferenceImpl()));
    }

    @Test
    public void parent() {
        Category value = Category.of();
        value.setParent(new com.commercetools.api.models.category.CategoryReferenceImpl());
        Assertions.assertThat(value.getParent())
                .isEqualTo(new com.commercetools.api.models.category.CategoryReferenceImpl());
    }

    @Test
    public void orderHint() {
        Category value = Category.of();
        value.setOrderHint("orderHint");
        Assertions.assertThat(value.getOrderHint()).isEqualTo("orderHint");
    }

    @Test
    public void externalId() {
        Category value = Category.of();
        value.setExternalId("externalId");
        Assertions.assertThat(value.getExternalId()).isEqualTo("externalId");
    }

    @Test
    public void metaTitle() {
        Category value = Category.of();
        value.setMetaTitle(new com.commercetools.api.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getMetaTitle())
                .isEqualTo(new com.commercetools.api.models.common.LocalizedStringImpl());
    }

    @Test
    public void metaDescription() {
        Category value = Category.of();
        value.setMetaDescription(new com.commercetools.api.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getMetaDescription())
                .isEqualTo(new com.commercetools.api.models.common.LocalizedStringImpl());
    }

    @Test
    public void metaKeywords() {
        Category value = Category.of();
        value.setMetaKeywords(new com.commercetools.api.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getMetaKeywords())
                .isEqualTo(new com.commercetools.api.models.common.LocalizedStringImpl());
    }

    @Test
    public void custom() {
        Category value = Category.of();
        value.setCustom(new com.commercetools.api.models.type.CustomFieldsImpl());
        Assertions.assertThat(value.getCustom()).isEqualTo(new com.commercetools.api.models.type.CustomFieldsImpl());
    }

    @Test
    public void assets() {
        Category value = Category.of();
        value.setAssets(Collections.singletonList(new com.commercetools.api.models.common.AssetImpl()));
        Assertions.assertThat(value.getAssets())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.common.AssetImpl()));
    }

    @Test
    public void key() {
        Category value = Category.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }
}
