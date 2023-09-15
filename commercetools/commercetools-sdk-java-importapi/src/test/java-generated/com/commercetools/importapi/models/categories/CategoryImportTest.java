
package com.commercetools.importapi.models.categories;

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
public class CategoryImportTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(CategoryImportBuilder builder) {
        CategoryImport categoryImport = builder.buildUnchecked();
        Assertions.assertThat(categoryImport).isInstanceOf(CategoryImport.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { CategoryImport.builder()
                        .name(new com.commercetools.importapi.models.common.LocalizedStringImpl()) },
                new Object[] { CategoryImport.builder()
                        .slug(new com.commercetools.importapi.models.common.LocalizedStringImpl()) },
                new Object[] { CategoryImport.builder()
                        .description(new com.commercetools.importapi.models.common.LocalizedStringImpl()) },
                new Object[] { CategoryImport.builder()
                        .parent(new com.commercetools.importapi.models.common.CategoryKeyReferenceImpl()) },
                new Object[] { CategoryImport.builder().orderHint("orderHint") },
                new Object[] { CategoryImport.builder().externalId("externalId") },
                new Object[] { CategoryImport.builder()
                        .metaTitle(new com.commercetools.importapi.models.common.LocalizedStringImpl()) },
                new Object[] { CategoryImport.builder()
                        .metaDescription(new com.commercetools.importapi.models.common.LocalizedStringImpl()) },
                new Object[] { CategoryImport.builder()
                        .metaKeywords(new com.commercetools.importapi.models.common.LocalizedStringImpl()) },
                new Object[] { CategoryImport.builder()
                        .assets(Collections.singletonList(new com.commercetools.importapi.models.common.AssetImpl())) },
                new Object[] { CategoryImport.builder()
                        .custom(new com.commercetools.importapi.models.customfields.CustomImpl()) } };
    }

    @Test
    public void name() {
        CategoryImport value = CategoryImport.of();
        value.setName(new com.commercetools.importapi.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getName())
                .isEqualTo(new com.commercetools.importapi.models.common.LocalizedStringImpl());
    }

    @Test
    public void slug() {
        CategoryImport value = CategoryImport.of();
        value.setSlug(new com.commercetools.importapi.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getSlug())
                .isEqualTo(new com.commercetools.importapi.models.common.LocalizedStringImpl());
    }

    @Test
    public void description() {
        CategoryImport value = CategoryImport.of();
        value.setDescription(new com.commercetools.importapi.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getDescription())
                .isEqualTo(new com.commercetools.importapi.models.common.LocalizedStringImpl());
    }

    @Test
    public void parent() {
        CategoryImport value = CategoryImport.of();
        value.setParent(new com.commercetools.importapi.models.common.CategoryKeyReferenceImpl());
        Assertions.assertThat(value.getParent())
                .isEqualTo(new com.commercetools.importapi.models.common.CategoryKeyReferenceImpl());
    }

    @Test
    public void orderHint() {
        CategoryImport value = CategoryImport.of();
        value.setOrderHint("orderHint");
        Assertions.assertThat(value.getOrderHint()).isEqualTo("orderHint");
    }

    @Test
    public void externalId() {
        CategoryImport value = CategoryImport.of();
        value.setExternalId("externalId");
        Assertions.assertThat(value.getExternalId()).isEqualTo("externalId");
    }

    @Test
    public void metaTitle() {
        CategoryImport value = CategoryImport.of();
        value.setMetaTitle(new com.commercetools.importapi.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getMetaTitle())
                .isEqualTo(new com.commercetools.importapi.models.common.LocalizedStringImpl());
    }

    @Test
    public void metaDescription() {
        CategoryImport value = CategoryImport.of();
        value.setMetaDescription(new com.commercetools.importapi.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getMetaDescription())
                .isEqualTo(new com.commercetools.importapi.models.common.LocalizedStringImpl());
    }

    @Test
    public void metaKeywords() {
        CategoryImport value = CategoryImport.of();
        value.setMetaKeywords(new com.commercetools.importapi.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getMetaKeywords())
                .isEqualTo(new com.commercetools.importapi.models.common.LocalizedStringImpl());
    }

    @Test
    public void assets() {
        CategoryImport value = CategoryImport.of();
        value.setAssets(Collections.singletonList(new com.commercetools.importapi.models.common.AssetImpl()));
        Assertions.assertThat(value.getAssets())
                .isEqualTo(Collections.singletonList(new com.commercetools.importapi.models.common.AssetImpl()));
    }

    @Test
    public void custom() {
        CategoryImport value = CategoryImport.of();
        value.setCustom(new com.commercetools.importapi.models.customfields.CustomImpl());
        Assertions.assertThat(value.getCustom())
                .isEqualTo(new com.commercetools.importapi.models.customfields.CustomImpl());
    }
}
