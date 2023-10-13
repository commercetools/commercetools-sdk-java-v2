
package com.commercetools.api.models.category;

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
public class CategoryDraftTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(CategoryDraftBuilder builder) {
        CategoryDraft categoryDraft = builder.buildUnchecked();
        Assertions.assertThat(categoryDraft).isInstanceOf(CategoryDraft.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] {
                        CategoryDraft.builder().name(new com.commercetools.api.models.common.LocalizedStringImpl()) },
                new Object[] {
                        CategoryDraft.builder().slug(new com.commercetools.api.models.common.LocalizedStringImpl()) },
                new Object[] { CategoryDraft.builder()
                        .description(new com.commercetools.api.models.common.LocalizedStringImpl()) },
                new Object[] { CategoryDraft.builder()
                        .parent(new com.commercetools.api.models.category.CategoryResourceIdentifierImpl()) },
                new Object[] { CategoryDraft.builder().orderHint("orderHint") },
                new Object[] { CategoryDraft.builder().externalId("externalId") },
                new Object[] { CategoryDraft.builder()
                        .metaTitle(new com.commercetools.api.models.common.LocalizedStringImpl()) },
                new Object[] { CategoryDraft.builder()
                        .metaDescription(new com.commercetools.api.models.common.LocalizedStringImpl()) },
                new Object[] { CategoryDraft.builder()
                        .metaKeywords(new com.commercetools.api.models.common.LocalizedStringImpl()) },
                new Object[] {
                        CategoryDraft.builder().custom(new com.commercetools.api.models.type.CustomFieldsDraftImpl()) },
                new Object[] { CategoryDraft.builder()
                        .assets(Collections.singletonList(new com.commercetools.api.models.common.AssetDraftImpl())) },
                new Object[] { CategoryDraft.builder().key("key") } };
    }

    @Test
    public void name() {
        CategoryDraft value = CategoryDraft.of();
        value.setName(new com.commercetools.api.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getName()).isEqualTo(new com.commercetools.api.models.common.LocalizedStringImpl());
    }

    @Test
    public void slug() {
        CategoryDraft value = CategoryDraft.of();
        value.setSlug(new com.commercetools.api.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getSlug()).isEqualTo(new com.commercetools.api.models.common.LocalizedStringImpl());
    }

    @Test
    public void description() {
        CategoryDraft value = CategoryDraft.of();
        value.setDescription(new com.commercetools.api.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getDescription())
                .isEqualTo(new com.commercetools.api.models.common.LocalizedStringImpl());
    }

    @Test
    public void parent() {
        CategoryDraft value = CategoryDraft.of();
        value.setParent(new com.commercetools.api.models.category.CategoryResourceIdentifierImpl());
        Assertions.assertThat(value.getParent())
                .isEqualTo(new com.commercetools.api.models.category.CategoryResourceIdentifierImpl());
    }

    @Test
    public void orderHint() {
        CategoryDraft value = CategoryDraft.of();
        value.setOrderHint("orderHint");
        Assertions.assertThat(value.getOrderHint()).isEqualTo("orderHint");
    }

    @Test
    public void externalId() {
        CategoryDraft value = CategoryDraft.of();
        value.setExternalId("externalId");
        Assertions.assertThat(value.getExternalId()).isEqualTo("externalId");
    }

    @Test
    public void metaTitle() {
        CategoryDraft value = CategoryDraft.of();
        value.setMetaTitle(new com.commercetools.api.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getMetaTitle())
                .isEqualTo(new com.commercetools.api.models.common.LocalizedStringImpl());
    }

    @Test
    public void metaDescription() {
        CategoryDraft value = CategoryDraft.of();
        value.setMetaDescription(new com.commercetools.api.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getMetaDescription())
                .isEqualTo(new com.commercetools.api.models.common.LocalizedStringImpl());
    }

    @Test
    public void metaKeywords() {
        CategoryDraft value = CategoryDraft.of();
        value.setMetaKeywords(new com.commercetools.api.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getMetaKeywords())
                .isEqualTo(new com.commercetools.api.models.common.LocalizedStringImpl());
    }

    @Test
    public void custom() {
        CategoryDraft value = CategoryDraft.of();
        value.setCustom(new com.commercetools.api.models.type.CustomFieldsDraftImpl());
        Assertions.assertThat(value.getCustom())
                .isEqualTo(new com.commercetools.api.models.type.CustomFieldsDraftImpl());
    }

    @Test
    public void assets() {
        CategoryDraft value = CategoryDraft.of();
        value.setAssets(Collections.singletonList(new com.commercetools.api.models.common.AssetDraftImpl()));
        Assertions.assertThat(value.getAssets())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.common.AssetDraftImpl()));
    }

    @Test
    public void key() {
        CategoryDraft value = CategoryDraft.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }
}
