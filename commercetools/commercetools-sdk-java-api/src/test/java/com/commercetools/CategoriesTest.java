
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
}
