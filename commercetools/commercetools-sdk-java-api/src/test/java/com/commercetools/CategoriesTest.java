
package com.commercetools;

import java.net.URI;

import com.commercetools.api.client.ByProjectKeyCategoriesPost;

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
}
