
package com.commercetools.importapi.client;

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

/**
*  <p>Retrieves all import containers of a given project key.</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ByProjectKeyImportContainersGet extends
        ApiMethod<ByProjectKeyImportContainersGet, com.commercetools.importapi.models.importcontainers.ImportContainerPagedResponse>
        implements
        com.commercetools.importapi.client.Secured_by_view_import_containersTrait<ByProjectKeyImportContainersGet> {

    private String projectKey;

    public ByProjectKeyImportContainersGet(final ApiHttpClient apiHttpClient, String projectKey) {
        super(apiHttpClient);
        this.projectKey = projectKey;
    }

    public ByProjectKeyImportContainersGet(ByProjectKeyImportContainersGet t) {
        super(t);
        this.projectKey = t.projectKey;
    }

    @Override
    protected ApiHttpRequest buildHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("/%s/import-containers", this.projectKey);
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        return new ApiHttpRequest(ApiHttpMethod.GET, URI.create(httpRequestPath), getHeaders(), null);
    }

    @Override
    public ApiHttpResponse<com.commercetools.importapi.models.importcontainers.ImportContainerPagedResponse> executeBlocking(
            final ApiHttpClient client, final Duration timeout) {
        return executeBlocking(client, timeout,
            com.commercetools.importapi.models.importcontainers.ImportContainerPagedResponse.class);
    }

    @Override
    public CompletableFuture<ApiHttpResponse<com.commercetools.importapi.models.importcontainers.ImportContainerPagedResponse>> execute(
            final ApiHttpClient client) {
        return execute(client, com.commercetools.importapi.models.importcontainers.ImportContainerPagedResponse.class);
    }

    public String getProjectKey() {
        return this.projectKey;
    }

    public List<String> getLimit() {
        return this.getQueryParam("limit");
    }

    public List<String> getOffset() {
        return this.getQueryParam("offset");
    }

    public List<String> getSort() {
        return this.getQueryParam("sort");
    }

    public void setProjectKey(final String projectKey) {
        this.projectKey = projectKey;
    }

    /**
     * set limit with the specified value
     */
    public <TValue> ByProjectKeyImportContainersGet withLimit(final TValue limit) {
        return copy().withQueryParam("limit", limit);
    }

    /**
     * add additional limit query parameter
     */
    public <TValue> ByProjectKeyImportContainersGet addLimit(final TValue limit) {
        return copy().addQueryParam("limit", limit);
    }

    /**
     * set limit with the specified value
     */
    public ByProjectKeyImportContainersGet withLimit(final Supplier<Double> supplier) {
        return copy().withQueryParam("limit", supplier.get());
    }

    /**
     * add additional limit query parameter
     */
    public ByProjectKeyImportContainersGet addLimit(final Supplier<Double> supplier) {
        return copy().addQueryParam("limit", supplier.get());
    }

    /**
     * set limit with the specified value
     */
    public ByProjectKeyImportContainersGet withLimit(final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("limit", op.apply(new StringBuilder()));
    }

    /**
     * add additional limit query parameter
     */
    public ByProjectKeyImportContainersGet addLimit(final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("limit", op.apply(new StringBuilder()));
    }

    /**
     * set limit with the specified values
     */
    public <TValue> ByProjectKeyImportContainersGet withLimit(final List<TValue> limit) {
        return copy().withoutQueryParam("limit")
                .addQueryParams(
                    limit.stream().map(s -> new ParamEntry<>("limit", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional limit query parameters
     */
    public <TValue> ByProjectKeyImportContainersGet addLimit(final List<TValue> limit) {
        return copy().addQueryParams(
            limit.stream().map(s -> new ParamEntry<>("limit", s.toString())).collect(Collectors.toList()));
    }

    /**
     * set offset with the specified value
     */
    public <TValue> ByProjectKeyImportContainersGet withOffset(final TValue offset) {
        return copy().withQueryParam("offset", offset);
    }

    /**
     * add additional offset query parameter
     */
    public <TValue> ByProjectKeyImportContainersGet addOffset(final TValue offset) {
        return copy().addQueryParam("offset", offset);
    }

    /**
     * set offset with the specified value
     */
    public ByProjectKeyImportContainersGet withOffset(final Supplier<Double> supplier) {
        return copy().withQueryParam("offset", supplier.get());
    }

    /**
     * add additional offset query parameter
     */
    public ByProjectKeyImportContainersGet addOffset(final Supplier<Double> supplier) {
        return copy().addQueryParam("offset", supplier.get());
    }

    /**
     * set offset with the specified value
     */
    public ByProjectKeyImportContainersGet withOffset(final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("offset", op.apply(new StringBuilder()));
    }

    /**
     * add additional offset query parameter
     */
    public ByProjectKeyImportContainersGet addOffset(final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("offset", op.apply(new StringBuilder()));
    }

    /**
     * set offset with the specified values
     */
    public <TValue> ByProjectKeyImportContainersGet withOffset(final List<TValue> offset) {
        return copy().withoutQueryParam("offset")
                .addQueryParams(
                    offset.stream().map(s -> new ParamEntry<>("offset", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional offset query parameters
     */
    public <TValue> ByProjectKeyImportContainersGet addOffset(final List<TValue> offset) {
        return copy().addQueryParams(
            offset.stream().map(s -> new ParamEntry<>("offset", s.toString())).collect(Collectors.toList()));
    }

    /**
     * set sort with the specified value
     */
    public <TValue> ByProjectKeyImportContainersGet withSort(final TValue sort) {
        return copy().withQueryParam("sort", sort);
    }

    /**
     * add additional sort query parameter
     */
    public <TValue> ByProjectKeyImportContainersGet addSort(final TValue sort) {
        return copy().addQueryParam("sort", sort);
    }

    /**
     * set sort with the specified value
     */
    public ByProjectKeyImportContainersGet withSort(final Supplier<String> supplier) {
        return copy().withQueryParam("sort", supplier.get());
    }

    /**
     * add additional sort query parameter
     */
    public ByProjectKeyImportContainersGet addSort(final Supplier<String> supplier) {
        return copy().addQueryParam("sort", supplier.get());
    }

    /**
     * set sort with the specified value
     */
    public ByProjectKeyImportContainersGet withSort(final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("sort", op.apply(new StringBuilder()));
    }

    /**
     * add additional sort query parameter
     */
    public ByProjectKeyImportContainersGet addSort(final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("sort", op.apply(new StringBuilder()));
    }

    /**
     * set sort with the specified values
     */
    public <TValue> ByProjectKeyImportContainersGet withSort(final List<TValue> sort) {
        return copy().withoutQueryParam("sort")
                .addQueryParams(
                    sort.stream().map(s -> new ParamEntry<>("sort", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional sort query parameters
     */
    public <TValue> ByProjectKeyImportContainersGet addSort(final List<TValue> sort) {
        return copy().addQueryParams(
            sort.stream().map(s -> new ParamEntry<>("sort", s.toString())).collect(Collectors.toList()));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ByProjectKeyImportContainersGet that = (ByProjectKeyImportContainersGet) o;

        return new EqualsBuilder().append(projectKey, that.projectKey).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(projectKey).toHashCode();
    }

    @Override
    protected ByProjectKeyImportContainersGet copy() {
        return new ByProjectKeyImportContainersGet(this);
    }
}
