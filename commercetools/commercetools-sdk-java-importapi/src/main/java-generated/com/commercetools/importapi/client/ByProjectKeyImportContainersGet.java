
package com.commercetools.importapi.client;

import static io.vrap.rmf.base.client.utils.ClientUtils.blockingWait;

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
    public ApiHttpRequest createHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("/%s/import-containers", this.projectKey);
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }

        return new ApiHttpRequest(ApiHttpMethod.GET, URI.create(httpRequestPath), getHeaders(), null);
    }

    @Override
    public ApiHttpResponse<com.commercetools.importapi.models.importcontainers.ImportContainerPagedResponse> executeBlocking(
            final ApiHttpClient client, Duration timeout) {
        ApiHttpRequest request = this.createHttpRequest();
        return blockingWait(client
                .execute(request,
                    com.commercetools.importapi.models.importcontainers.ImportContainerPagedResponse.class)
                .toCompletableFuture(),
            request, timeout);
    }

    @Override
    public CompletableFuture<ApiHttpResponse<com.commercetools.importapi.models.importcontainers.ImportContainerPagedResponse>> execute(
            final ApiHttpClient client) {
        return client
                .execute(this.createHttpRequest(),
                    com.commercetools.importapi.models.importcontainers.ImportContainerPagedResponse.class)
                .toCompletableFuture();
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
    public ByProjectKeyImportContainersGet withLimit(final double limit) {
        return copy().withQueryParam("limit", limit);
    }

    /**
     * add additional limit query parameter
     */
    public ByProjectKeyImportContainersGet addLimit(final double limit) {
        return copy().addQueryParam("limit", limit);
    }

    /**
     * set limit with the specificied values
     */
    public ByProjectKeyImportContainersGet withLimit(final List<Double> limit) {
        return copy().withoutQueryParam("limit")
                .addQueryParams(
                    limit.stream().map(s -> new ParamEntry<>("limit", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional limit query parameters
     */
    public ByProjectKeyImportContainersGet addLimit(final List<Double> limit) {
        return copy().addQueryParams(
            limit.stream().map(s -> new ParamEntry<>("limit", s.toString())).collect(Collectors.toList()));
    }

    /**
     * set offset with the specificied value
     */
    public ByProjectKeyImportContainersGet withOffset(final double offset) {
        return copy().withQueryParam("offset", offset);
    }

    /**
     * add additional offset query parameter
     */
    public ByProjectKeyImportContainersGet addOffset(final double offset) {
        return copy().addQueryParam("offset", offset);
    }

    /**
     * set offset with the specificied values
     */
    public ByProjectKeyImportContainersGet withOffset(final List<Double> offset) {
        return copy().withoutQueryParam("offset")
                .addQueryParams(
                    offset.stream().map(s -> new ParamEntry<>("offset", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional offset query parameters
     */
    public ByProjectKeyImportContainersGet addOffset(final List<Double> offset) {
        return copy().addQueryParams(
            offset.stream().map(s -> new ParamEntry<>("offset", s.toString())).collect(Collectors.toList()));
    }

    /**
     * set sort with the specificied value
     */
    public ByProjectKeyImportContainersGet withSort(final String sort) {
        return copy().withQueryParam("sort", sort);
    }

    /**
     * add additional sort query parameter
     */
    public ByProjectKeyImportContainersGet addSort(final String sort) {
        return copy().addQueryParam("sort", sort);
    }

    /**
     * set sort with the specificied values
     */
    public ByProjectKeyImportContainersGet withSort(final List<String> sort) {
        return copy().withoutQueryParam("sort")
                .addQueryParams(
                    sort.stream().map(s -> new ParamEntry<>("sort", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional sort query parameters
     */
    public ByProjectKeyImportContainersGet addSort(final List<String> sort) {
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
