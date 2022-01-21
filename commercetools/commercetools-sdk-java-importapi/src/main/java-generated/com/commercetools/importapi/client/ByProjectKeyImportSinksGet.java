
package com.commercetools.importapi.client;

import java.net.URI;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;

import io.vrap.rmf.base.client.*;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
*  <p>Retrieves all import sinks of a project key.</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ByProjectKeyImportSinksGet extends
        ApiMethod<ByProjectKeyImportSinksGet, com.commercetools.importapi.models.importsinks.ImportSinkPagedResponse>
        implements com.commercetools.importapi.client.Secured_by_view_import_sinksTrait<ByProjectKeyImportSinksGet> {

    private String projectKey;

    public ByProjectKeyImportSinksGet(final ApiHttpClient apiHttpClient, String projectKey) {
        super(apiHttpClient);
        this.projectKey = projectKey;
    }

    public ByProjectKeyImportSinksGet(ByProjectKeyImportSinksGet t) {
        super(t);
        this.projectKey = t.projectKey;
    }

    @Override
    public ApiHttpRequest createHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("/%s/import-sinks", this.projectKey);
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }

        return new ApiHttpRequest(ApiHttpMethod.GET, URI.create(httpRequestPath), getHeaders(), null);
    }

    @Override
    public ApiHttpResponse<com.commercetools.importapi.models.importsinks.ImportSinkPagedResponse> executeBlocking(
            final ApiHttpClient client, final Duration timeout) {
        return executeBlocking(client, timeout,
            com.commercetools.importapi.models.importsinks.ImportSinkPagedResponse.class);
    }

    @Override
    public CompletableFuture<ApiHttpResponse<com.commercetools.importapi.models.importsinks.ImportSinkPagedResponse>> execute(
            final ApiHttpClient client) {
        return execute(client, com.commercetools.importapi.models.importsinks.ImportSinkPagedResponse.class);
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
     * set limit with the specificied value
     */
    public ByProjectKeyImportSinksGet withLimit(final double limit) {
        return copy().withQueryParam("limit", limit);
    }

    /**
     * add additional limit query parameter
     */
    public ByProjectKeyImportSinksGet addLimit(final double limit) {
        return copy().addQueryParam("limit", limit);
    }

    /**
     * set limit with the specificied values
     */
    public ByProjectKeyImportSinksGet withLimit(final List<Double> limit) {
        return copy().withoutQueryParam("limit")
                .addQueryParams(
                    limit.stream().map(s -> new ParamEntry<>("limit", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional limit query parameters
     */
    public ByProjectKeyImportSinksGet addLimit(final List<Double> limit) {
        return copy().addQueryParams(
            limit.stream().map(s -> new ParamEntry<>("limit", s.toString())).collect(Collectors.toList()));
    }

    /**
     * set offset with the specificied value
     */
    public ByProjectKeyImportSinksGet withOffset(final double offset) {
        return copy().withQueryParam("offset", offset);
    }

    /**
     * add additional offset query parameter
     */
    public ByProjectKeyImportSinksGet addOffset(final double offset) {
        return copy().addQueryParam("offset", offset);
    }

    /**
     * set offset with the specificied values
     */
    public ByProjectKeyImportSinksGet withOffset(final List<Double> offset) {
        return copy().withoutQueryParam("offset")
                .addQueryParams(
                    offset.stream().map(s -> new ParamEntry<>("offset", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional offset query parameters
     */
    public ByProjectKeyImportSinksGet addOffset(final List<Double> offset) {
        return copy().addQueryParams(
            offset.stream().map(s -> new ParamEntry<>("offset", s.toString())).collect(Collectors.toList()));
    }

    /**
     * set sort with the specificied value
     */
    public ByProjectKeyImportSinksGet withSort(final String sort) {
        return copy().withQueryParam("sort", sort);
    }

    /**
     * add additional sort query parameter
     */
    public ByProjectKeyImportSinksGet addSort(final String sort) {
        return copy().addQueryParam("sort", sort);
    }

    /**
     * set sort with the specificied values
     */
    public ByProjectKeyImportSinksGet withSort(final List<String> sort) {
        return copy().withoutQueryParam("sort")
                .addQueryParams(
                    sort.stream().map(s -> new ParamEntry<>("sort", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional sort query parameters
     */
    public ByProjectKeyImportSinksGet addSort(final List<String> sort) {
        return copy().addQueryParams(
            sort.stream().map(s -> new ParamEntry<>("sort", s.toString())).collect(Collectors.toList()));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ByProjectKeyImportSinksGet that = (ByProjectKeyImportSinksGet) o;

        return new EqualsBuilder().append(projectKey, that.projectKey).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(projectKey).toHashCode();
    }

    @Override
    protected ByProjectKeyImportSinksGet copy() {
        return new ByProjectKeyImportSinksGet(this);
    }
}
