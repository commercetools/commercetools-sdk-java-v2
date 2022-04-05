
package com.commercetools.api.client;

import java.net.URI;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;

import io.vrap.rmf.base.client.*;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ByProjectKeyCustomObjectsByContainerGet extends
        ApiMethod<ByProjectKeyCustomObjectsByContainerGet, com.commercetools.api.models.custom_object.CustomObjectPagedQueryResponse>
        implements com.commercetools.api.client.QueryTrait<ByProjectKeyCustomObjectsByContainerGet>,
        com.commercetools.api.client.ExpandableTrait<ByProjectKeyCustomObjectsByContainerGet>,
        com.commercetools.api.client.ErrorableTrait<ByProjectKeyCustomObjectsByContainerGet>,
        com.commercetools.api.client.Deprecatable200Trait<ByProjectKeyCustomObjectsByContainerGet> {

    private String projectKey;
    private String container;

    public ByProjectKeyCustomObjectsByContainerGet(final ApiHttpClient apiHttpClient, String projectKey,
            String container) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.container = container;
    }

    public ByProjectKeyCustomObjectsByContainerGet(ByProjectKeyCustomObjectsByContainerGet t) {
        super(t);
        this.projectKey = t.projectKey;
        this.container = t.container;
    }

    @Override
    protected ApiHttpRequest buildHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("/%s/custom-objects/%s", this.projectKey, this.container);
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        return new ApiHttpRequest(ApiHttpMethod.GET, URI.create(httpRequestPath), getHeaders(), null);
    }

    @Override
    public ApiHttpResponse<com.commercetools.api.models.custom_object.CustomObjectPagedQueryResponse> executeBlocking(
            final ApiHttpClient client, final Duration timeout) {
        return executeBlocking(client, timeout,
            com.commercetools.api.models.custom_object.CustomObjectPagedQueryResponse.class);
    }

    @Override
    public CompletableFuture<ApiHttpResponse<com.commercetools.api.models.custom_object.CustomObjectPagedQueryResponse>> execute(
            final ApiHttpClient client) {
        return execute(client, com.commercetools.api.models.custom_object.CustomObjectPagedQueryResponse.class);
    }

    public String getProjectKey() {
        return this.projectKey;
    }

    public String getContainer() {
        return this.container;
    }

    public List<String> getWhere() {
        return this.getQueryParam("where");
    }

    public List<String> getExpand() {
        return this.getQueryParam("expand");
    }

    public void setProjectKey(final String projectKey) {
        this.projectKey = projectKey;
    }

    public void setContainer(final String container) {
        this.container = container;
    }

    /**
     * set where with the specified value
     */
    public <TValue> ByProjectKeyCustomObjectsByContainerGet withWhere(final TValue where) {
        return copy().withQueryParam("where", where);
    }

    /**
     * add additional where query parameter
     */
    public <TValue> ByProjectKeyCustomObjectsByContainerGet addWhere(final TValue where) {
        return copy().addQueryParam("where", where);
    }

    /**
     * set where with the specified value
     */
    public ByProjectKeyCustomObjectsByContainerGet withWhere(final Supplier<String> supplier) {
        return copy().withQueryParam("where", supplier.get());
    }

    /**
     * add additional where query parameter
     */
    public ByProjectKeyCustomObjectsByContainerGet addWhere(final Supplier<String> supplier) {
        return copy().addQueryParam("where", supplier.get());
    }

    /**
     * set where with the specified value
     */
    public ByProjectKeyCustomObjectsByContainerGet withWhere(final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("where", op.apply(new StringBuilder()));
    }

    /**
     * add additional where query parameter
     */
    public ByProjectKeyCustomObjectsByContainerGet addWhere(final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("where", op.apply(new StringBuilder()));
    }

    /**
     * set where with the specified values
     */
    public <TValue> ByProjectKeyCustomObjectsByContainerGet withWhere(final List<TValue> where) {
        return copy().withoutQueryParam("where")
                .addQueryParams(
                    where.stream().map(s -> new ParamEntry<>("where", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional where query parameters
     */
    public <TValue> ByProjectKeyCustomObjectsByContainerGet addWhere(final List<TValue> where) {
        return copy().addQueryParams(
            where.stream().map(s -> new ParamEntry<>("where", s.toString())).collect(Collectors.toList()));
    }

    /**
     * set expand with the specified value
     */
    public <TValue> ByProjectKeyCustomObjectsByContainerGet withExpand(final TValue expand) {
        return copy().withQueryParam("expand", expand);
    }

    /**
     * add additional expand query parameter
     */
    public <TValue> ByProjectKeyCustomObjectsByContainerGet addExpand(final TValue expand) {
        return copy().addQueryParam("expand", expand);
    }

    /**
     * set expand with the specified value
     */
    public ByProjectKeyCustomObjectsByContainerGet withExpand(final Supplier<String> supplier) {
        return copy().withQueryParam("expand", supplier.get());
    }

    /**
     * add additional expand query parameter
     */
    public ByProjectKeyCustomObjectsByContainerGet addExpand(final Supplier<String> supplier) {
        return copy().addQueryParam("expand", supplier.get());
    }

    /**
     * set expand with the specified value
     */
    public ByProjectKeyCustomObjectsByContainerGet withExpand(final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("expand", op.apply(new StringBuilder()));
    }

    /**
     * add additional expand query parameter
     */
    public ByProjectKeyCustomObjectsByContainerGet addExpand(final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("expand", op.apply(new StringBuilder()));
    }

    /**
     * set expand with the specified values
     */
    public <TValue> ByProjectKeyCustomObjectsByContainerGet withExpand(final List<TValue> expand) {
        return copy().withoutQueryParam("expand")
                .addQueryParams(
                    expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional expand query parameters
     */
    public <TValue> ByProjectKeyCustomObjectsByContainerGet addExpand(final List<TValue> expand) {
        return copy().addQueryParams(
            expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList()));
    }

    /**
     * set predicateVar with the specificied value
     */
    public <TValue> ByProjectKeyCustomObjectsByContainerGet withPredicateVar(final String varName,
            final TValue predicateVar) {
        return copy().withQueryParam(String.format("var.%s", varName), predicateVar);
    }

    /**
     * add additional predicateVar query parameter
     */
    public <TValue> ByProjectKeyCustomObjectsByContainerGet addPredicateVar(final String varName,
            final TValue predicateVar) {
        return copy().addQueryParam(String.format("var.%s", varName), predicateVar);
    }

    /**
     * set predicateVar with the specificied values
     */
    public <TValue> ByProjectKeyCustomObjectsByContainerGet withPredicateVar(final String varName,
            final List<TValue> predicateVar) {
        final String placeholderName = String.format("var.%s", varName);
        return copy().withoutQueryParam(placeholderName)
                .addQueryParams(predicateVar.stream()
                        .map(s -> new ParamEntry<>(placeholderName, s.toString()))
                        .collect(Collectors.toList()));
    }

    /**
     * add additional predicateVar query parameters
     */
    public <TValue> ByProjectKeyCustomObjectsByContainerGet addPredicateVar(final String varName,
            final List<TValue> predicateVar) {
        final String placeholderName = String.format("var.%s", varName);
        return copy().addQueryParams(predicateVar.stream()
                .map(s -> new ParamEntry<>(placeholderName, s.toString()))
                .collect(Collectors.toList()));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ByProjectKeyCustomObjectsByContainerGet that = (ByProjectKeyCustomObjectsByContainerGet) o;

        return new EqualsBuilder().append(projectKey, that.projectKey).append(container, that.container).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(projectKey).append(container).toHashCode();
    }

    @Override
    protected ByProjectKeyCustomObjectsByContainerGet copy() {
        return new ByProjectKeyCustomObjectsByContainerGet(this);
    }
}
