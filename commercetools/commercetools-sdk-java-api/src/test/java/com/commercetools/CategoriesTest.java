
package com.commercetools;

import java.net.URI;
import java.time.ZonedDateTime;
import java.util.List;
import java.util.Locale;

import com.commercetools.api.client.ByProjectKeyCategoriesPost;
import com.commercetools.api.models.category.Category;
import com.commercetools.api.models.category.CategoryTreeFactory;
import com.commercetools.api.models.common.LocalizedString;
import com.commercetools.api.models.common.LocalizedStringEntry;

import io.vrap.rmf.base.client.ApiHttpRequest;
import io.vrap.rmf.base.client.SerializerOnlyApiHttpClient;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class CategoriesTest {
    private static final ApiHttpRequest request = new ByProjectKeyCategoriesPost(SerializerOnlyApiHttpClient.of(),
        "test", null).createHttpRequest();

    @Test
    public void testImmutableUriWithHostAndPath() {
        ApiHttpRequest newRequest = request.resolve(URI.create("https://example.com/path/"));

        Assertions.assertThat(request.getUri().toString()).isEqualTo("test/categories");
        Assertions.assertThat(newRequest.getUri().toString()).isEqualTo("https://example.com/path/test/categories");
        Assertions.assertThat(newRequest).isNotEqualTo(request);
    }

    @Test
    public void testImmutableUriWithHost() {
        ApiHttpRequest newRequest = request.resolve(URI.create("https://example.com/"));

        Assertions.assertThat(request.getUri().toString()).isEqualTo("test/categories");
        Assertions.assertThat(newRequest.getUri().toString()).isEqualTo("https://example.com/test/categories");
        Assertions.assertThat(newRequest).isNotEqualTo(request);
    }

    @Test
    public void testLocalizedStringEntryEqualsOverride() {
        var entry = LocalizedStringEntry.of("en", "women");
        var entry2 = LocalizedStringEntry.of("en", "women");
        var entry3 = LocalizedStringEntry.of("en", "woman");
        Assertions.assertThat(entry).isEqualTo(entry2);
        Assertions.assertThat(entry).isNotEqualTo(entry3);
    }

    @Test
    public void testCategoryTree() {
        List<Category> allCategoriesAsFlatList = List.of(Category.builder()
                .name(LocalizedString.of(Locale.ENGLISH, "Women"))
                .slug(LocalizedString.of(Locale.ENGLISH, "women"))
                .id("1")
                .version(1L)
                .createdAt(ZonedDateTime.now())
                .lastModifiedAt(ZonedDateTime.now())
                .ancestors()
                .orderHint("c2")
                .build());
        CategoryTreeFactory factory = CategoryTreeFactory.of();
        var tree = factory.create(allCategoriesAsFlatList);
        var result = tree.findBySlug(Locale.ENGLISH, "women");
        Assertions.assertThat(result).isNotEmpty();
    }

    @Test
    public void testGetLocalizedStringEntryCategoryMap() {
        List<Category> allCategoriesAsFlatList = List.of(
            Category.builder()
                    .name(LocalizedString.of(Locale.forLanguageTag("en-US"), "Women"))
                    .slug(LocalizedString.of(Locale.forLanguageTag("en-US"), "women"))
                    .id("1")
                    .version(1L)
                    .createdAt(ZonedDateTime.now())
                    .lastModifiedAt(ZonedDateTime.now())
                    .ancestors()
                    .orderHint("c2")
                    .build(),
            Category.builder()
                    .name(LocalizedString.of(Locale.forLanguageTag("en"), "Men"))
                    .slug(LocalizedString.of(Locale.forLanguageTag("en"), "men"))
                    .id("2")
                    .version(1L)
                    .createdAt(ZonedDateTime.now())
                    .lastModifiedAt(ZonedDateTime.now())
                    .ancestors()
                    .orderHint("c2")
                    .build(),
            Category.builder()
                    .name(LocalizedString.of(Locale.forLanguageTag("en-us"), "Kids"))
                    .slug(LocalizedString.of(Locale.forLanguageTag("en-us"), "kids"))
                    .id("3")
                    .version(1L)
                    .createdAt(ZonedDateTime.now())
                    .lastModifiedAt(ZonedDateTime.now())
                    .ancestors()
                    .orderHint("c2")
                    .build());
        CategoryTreeFactory factory = CategoryTreeFactory.of();

        var tree = factory.create(allCategoriesAsFlatList);
        var result = tree.findBySlug(Locale.forLanguageTag("en-US"), "women");
        Assertions.assertThat(result).isNotEmpty();
        var enUsResult = tree.findBySlug(Locale.forLanguageTag("en-us"), "women");
        Assertions.assertThat(enUsResult).isNotEmpty();

        var enResult = tree.findBySlug(Locale.forLanguageTag("en"), "women");
        Assertions.assertThat(enResult).isEmpty();

        var menResult = tree.findBySlug(Locale.forLanguageTag("en-US"), "men");
        Assertions.assertThat(menResult).isEmpty();
        var menEnUsResult = tree.findBySlug(Locale.forLanguageTag("en-us"), "men");
        Assertions.assertThat(menEnUsResult).isEmpty();
        var menEnResult = tree.findBySlug(Locale.forLanguageTag("en"), "men");
        Assertions.assertThat(menEnResult).isNotEmpty();

        var kidsResult = tree.findBySlug(Locale.forLanguageTag("en-US"), "kids");
        Assertions.assertThat(kidsResult).isNotEmpty();
        var kidsEnUsResult = tree.findBySlug(Locale.forLanguageTag("en-us"), "kids");
        Assertions.assertThat(kidsEnUsResult).isNotEmpty();
        var kidsEnResult = tree.findBySlug(Locale.forLanguageTag("en"), "kids");
        Assertions.assertThat(kidsEnResult).isEmpty();
    }
}
