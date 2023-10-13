
package com.commercetools.api.models.category;

import java.time.ZonedDateTime;
import java.util.Collections;

import com.tngtech.junit.dataprovider.DataProvider;
import com.tngtech.junit.dataprovider.DataProviderExtension;
import com.tngtech.junit.dataprovider.UseDataProvider;
import com.tngtech.junit.dataprovider.UseDataProviderExtension;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestTemplate;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(UseDataProviderExtension.class)
@ExtendWith(DataProviderExtension.class)
public class CategoryTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(CategoryBuilder builder) {
        Category category = builder.buildUnchecked();
        Assertions.assertThat(category).isInstanceOf(Category.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { Category.builder().id("id") },
                new Object[] { Category.builder().version(2L) },
                new Object[] { Category.builder().createdAt(ZonedDateTime.parse("2023-06-01T12:00Z")) },
                new Object[] { Category.builder().lastModifiedAt(ZonedDateTime.parse("2023-06-01T12:00Z")) },
                new Object[] { Category.builder()
                        .lastModifiedBy(new com.commercetools.api.models.common.LastModifiedByImpl()) },
                new Object[] { Category.builder().createdBy(new com.commercetools.api.models.common.CreatedByImpl()) },
                new Object[] { Category.builder().name(new com.commercetools.api.models.common.LocalizedStringImpl()) },
                new Object[] { Category.builder().slug(new com.commercetools.api.models.common.LocalizedStringImpl()) },
                new Object[] {
                        Category.builder().description(new com.commercetools.api.models.common.LocalizedStringImpl()) },
                new Object[] { Category.builder()
                        .ancestors(Collections
                                .singletonList(new com.commercetools.api.models.category.CategoryReferenceImpl())) },
                new Object[] {
                        Category.builder().parent(new com.commercetools.api.models.category.CategoryReferenceImpl()) },
                new Object[] { Category.builder().orderHint("orderHint") },
                new Object[] { Category.builder().externalId("externalId") },
                new Object[] {
                        Category.builder().metaTitle(new com.commercetools.api.models.common.LocalizedStringImpl()) },
                new Object[] { Category.builder()
                        .metaDescription(new com.commercetools.api.models.common.LocalizedStringImpl()) },
                new Object[] { Category.builder()
                        .metaKeywords(new com.commercetools.api.models.common.LocalizedStringImpl()) },
                new Object[] { Category.builder().custom(new com.commercetools.api.models.type.CustomFieldsImpl()) },
                new Object[] { Category.builder()
                        .assets(Collections.singletonList(new com.commercetools.api.models.common.AssetImpl())) },
                new Object[] { Category.builder().key("key") } };
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
