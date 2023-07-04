
package com.commercetools;

import com.commercetools.api.client.PagedQueryResourceRequest;
import com.commercetools.api.client.ProjectApiRoot;
import com.commercetools.api.defaultconfig.ApiRootBuilder;

import io.vrap.rmf.base.client.ApiHttpRequest;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class DecorateTest {
    @Test
    public void testSortDecorator() {
        final ProjectApiRoot project = ApiRootBuilder.of().withApiBaseUrl("").build("test");

        final ApiHttpRequest httpRequest = project.carts().get().with(DecorateTest::addIdSort).createHttpRequest();
        Assertions.assertThat(httpRequest.getUri().getQuery()).isEqualTo("sort=id+asc");

        final ApiHttpRequest httpRequest2 = project.carts()
                .get()
                .with(DecorateTest::addIdSort, "asc")
                .createHttpRequest();
        Assertions.assertThat(httpRequest2.getUri().getQuery()).isEqualTo("sort=id+asc");
    }

    @SuppressWarnings("unchecked")
    public static <T extends PagedQueryResourceRequest<T, TResult, TQuery>, TResult, TQuery> T addIdSort(T method) {
        return (T) method.addSort("id asc");
    }

    @SuppressWarnings("unchecked")
    public static <T extends PagedQueryResourceRequest<T, TResult, TQuery>, TResult, TQuery> T addIdSort(T method,
            String dir) {
        return (T) method.addSort("id " + dir);
    }
}
