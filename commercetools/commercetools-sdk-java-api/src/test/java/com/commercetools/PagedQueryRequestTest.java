
package com.commercetools;

import java.util.Collections;

import com.commercetools.api.client.*;
import com.tngtech.junit.dataprovider.DataProvider;
import com.tngtech.junit.dataprovider.DataProviderExtension;
import com.tngtech.junit.dataprovider.UseDataProvider;
import com.tngtech.junit.dataprovider.UseDataProviderExtension;

import io.vrap.rmf.base.client.*;

import org.apache.commons.lang3.tuple.Pair;
import org.assertj.core.api.Assertions;
import org.assertj.core.util.Lists;
import org.junit.jupiter.api.TestTemplate;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(UseDataProviderExtension.class)
@ExtendWith(DataProviderExtension.class)
public class PagedQueryRequestTest {

    private final static ApiRoot apiRoot = ApiRoot.of();

    @TestTemplate
    @UseDataProvider("requestWithMethodParameters")
    public void defaultMethods(ApiHttpRequest request, String httpMethod, String uri) {
        Assertions.assertThat(httpMethod).isEqualTo(request.getMethod().name().toLowerCase());
        Assertions.assertThat(request.getUri().toString()).isEqualTo(uri);
    }

    @DataProvider
    public static Object[][] requestWithMethodParameters() {
        return new Object[][] {
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .carts()
                        .get()
                        .withWhere("where", "paramName", "foo")
                        .createHttpRequest(), "get", "test_projectKey/carts?where=where&var.paramName=foo" },
                new Object[] {
                        apiRoot.withProjectKey("test_projectKey")
                                .carts()
                                .get()
                                .withWhere("withWhere",
                                    Collections.singletonMap("paramName", Lists.newArrayList("foo", "bar")))
                                .createHttpRequest(),
                        "get", "test_projectKey/carts?where=withWhere&var.paramName=foo&var.paramName=bar" },
                new Object[] {
                        apiRoot.withProjectKey("test_projectKey")
                                .carts()
                                .get()
                                .withWhere("withWhere",
                                    Lists.newArrayList(Pair.of("paramName", "foo"), Pair.of("paramName", "bar")))
                                .createHttpRequest(),
                        "get", "test_projectKey/carts?where=withWhere&var.paramName=foo&var.paramName=bar" },
                new Object[] {
                        apiRoot.withProjectKey("test_projectKey")
                                .carts()
                                .get()
                                .withWhere("withWhere", "paramName", "foo")
                                .addWhere("addWhere", "paramName", "bar")
                                .createHttpRequest(),
                        "get", "test_projectKey/carts?where=withWhere&where=addWhere&var.paramName=bar" },
                new Object[] {
                        apiRoot.withProjectKey("test_projectKey")
                                .carts()
                                .get()
                                .withWhere("withWhere", "paramName", "foo")
                                .addWhere("addWhere", "paramName", "bar")
                                .createHttpRequest(),
                        "get", "test_projectKey/carts?where=withWhere&where=addWhere&var.paramName=bar" },
                new Object[] {
                        apiRoot.withProjectKey("test_projectKey")
                                .carts()
                                .get()
                                .withWhere("withWhere",
                                    Collections.singletonMap("paramName", Lists.newArrayList("foo", "bar")))
                                .addWhere("addWhere",
                                    Collections.singletonMap("paramName", Lists.newArrayList("fooz", "barz")))
                                .createHttpRequest(),
                        "get",
                        "test_projectKey/carts?where=withWhere&where=addWhere&var.paramName=fooz&var.paramName=barz" },
                new Object[] {
                        apiRoot.withProjectKey("test_projectKey")
                                .carts()
                                .get()
                                .withWhere("withWhere",
                                    Lists.newArrayList(Pair.of("paramName", "foo"), Pair.of("paramName", "bar")))
                                .addWhere("addWhere",
                                    Lists.newArrayList(Pair.of("paramName", "fooz"), Pair.of("paramName", "barz")))
                                .createHttpRequest(),
                        "get",
                        "test_projectKey/carts?where=withWhere&where=addWhere&var.paramName=fooz&var.paramName=barz" },
                new Object[] {
                        apiRoot.withProjectKey("test_projectKey")
                                .carts()
                                .get()
                                .withQuery(query -> query.id().is("foo"), "paramName", "foo")
                                .createHttpRequest(),
                        "get", "test_projectKey/carts?where=id+%3D+%22foo%22&var.paramName=foo" },
                new Object[] {
                        apiRoot.withProjectKey("test_projectKey")
                                .carts()
                                .get()
                                .withQuery(query -> query.id().is("foo"),
                                    Collections.singletonMap("paramName", Lists.newArrayList("foo", "bar")))
                                .createHttpRequest(),
                        "get", "test_projectKey/carts?where=id+%3D+%22foo%22&var.paramName=foo&var.paramName=bar" },
                new Object[] {
                        apiRoot.withProjectKey("test_projectKey")
                                .carts()
                                .get()
                                .withQuery(query -> query.id().is("foo"),
                                    Lists.newArrayList(Pair.of("paramName", "foo"), Pair.of("paramName", "bar")))
                                .createHttpRequest(),
                        "get", "test_projectKey/carts?where=id+%3D+%22foo%22&var.paramName=foo&var.paramName=bar" },
                new Object[] {
                        apiRoot.withProjectKey("test_projectKey")
                                .carts()
                                .get()
                                .withQuery(query -> query.id().is("foo"), "paramName", "foo")
                                .addQuery(query -> query.id().is("bar"), "paramName", "bar")
                                .createHttpRequest(),
                        "get",
                        "test_projectKey/carts?where=id+%3D+%22foo%22&where=id+%3D+%22bar%22&var.paramName=bar" },
                new Object[] {
                        apiRoot.withProjectKey("test_projectKey")
                                .carts()
                                .get()
                                .withQuery(query -> query.id().is("foo"), "paramName", "foo")
                                .addQuery(query -> query.id().is("bar"), "paramName", "bar")
                                .createHttpRequest(),
                        "get",
                        "test_projectKey/carts?where=id+%3D+%22foo%22&where=id+%3D+%22bar%22&var.paramName=bar" },
                new Object[] {
                        apiRoot.withProjectKey("test_projectKey")
                                .carts()
                                .get()
                                .withQuery(query -> query.id().is("foo"),
                                    Collections.singletonMap("paramName", Lists.newArrayList("foo", "bar")))
                                .addQuery(query -> query.id().is("bar"),
                                    Collections.singletonMap("paramName", Lists.newArrayList("fooz", "barz")))
                                .createHttpRequest(),
                        "get",
                        "test_projectKey/carts?where=id+%3D+%22foo%22&where=id+%3D+%22bar%22&var.paramName=fooz&var.paramName=barz" },
                new Object[] {
                        apiRoot.withProjectKey("test_projectKey")
                                .carts()
                                .get()
                                .withQuery(query -> query.id().is("foo"),
                                    Lists.newArrayList(Pair.of("paramName", "foo"), Pair.of("paramName", "bar")))
                                .addQuery(query -> query.id().is("bar"),
                                    Lists.newArrayList(Pair.of("paramName", "fooz"), Pair.of("paramName", "barz")))
                                .createHttpRequest(),
                        "get",
                        "test_projectKey/carts?where=id+%3D+%22foo%22&where=id+%3D+%22bar%22&var.paramName=fooz&var.paramName=barz" }, };
    }
}
