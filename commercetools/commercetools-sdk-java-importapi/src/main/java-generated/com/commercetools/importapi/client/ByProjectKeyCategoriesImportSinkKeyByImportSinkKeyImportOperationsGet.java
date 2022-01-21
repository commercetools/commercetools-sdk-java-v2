
package com.commercetools.importapi.client;

import java.net.URI;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;

import com.commercetools.importapi.models.common.ProcessingState;

import io.vrap.rmf.base.client.*;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
*  <p>Retrieves all category import operations of an import sink key.</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ByProjectKeyCategoriesImportSinkKeyByImportSinkKeyImportOperationsGet extends
        ApiMethod<ByProjectKeyCategoriesImportSinkKeyByImportSinkKeyImportOperationsGet, com.commercetools.importapi.models.importoperations.ImportOperationPagedResponse>
        implements
        com.commercetools.importapi.client.Secured_by_view_productsTrait<ByProjectKeyCategoriesImportSinkKeyByImportSinkKeyImportOperationsGet> {

    private String projectKey;
    private String importSinkKey;

    public ByProjectKeyCategoriesImportSinkKeyByImportSinkKeyImportOperationsGet(final ApiHttpClient apiHttpClient,
            String projectKey, String importSinkKey) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.importSinkKey = importSinkKey;
    }

    public ByProjectKeyCategoriesImportSinkKeyByImportSinkKeyImportOperationsGet(
            ByProjectKeyCategoriesImportSinkKeyByImportSinkKeyImportOperationsGet t) {
        super(t);
        this.projectKey = t.projectKey;
        this.importSinkKey = t.importSinkKey;
    }

    @Override
    public ApiHttpRequest createHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("/%s/categories/importSinkKey=%s/import-operations", this.projectKey,
            this.importSinkKey);
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }

        return new ApiHttpRequest(ApiHttpMethod.GET, URI.create(httpRequestPath), getHeaders(), null);
    }

    @Override
    public ApiHttpResponse<com.commercetools.importapi.models.importoperations.ImportOperationPagedResponse> executeBlocking(
            final ApiHttpClient client, final Duration timeout) {
        return executeBlocking(client, timeout,
            com.commercetools.importapi.models.importoperations.ImportOperationPagedResponse.class);
    }

    @Override
    public CompletableFuture<ApiHttpResponse<com.commercetools.importapi.models.importoperations.ImportOperationPagedResponse>> execute(
            final ApiHttpClient client) {
        return execute(client, com.commercetools.importapi.models.importoperations.ImportOperationPagedResponse.class);
    }

    public String getProjectKey() {
        return this.projectKey;
    }

    public String getImportSinkKey() {
        return this.importSinkKey;
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

    public List<String> getResourceKey() {
        return this.getQueryParam("resourceKey");
    }

    public List<String> getState() {
        return this.getQueryParam("state");
    }

    public List<String> getDebug() {
        return this.getQueryParam("debug");
    }

    public void setProjectKey(final String projectKey) {
        this.projectKey = projectKey;
    }

    public void setImportSinkKey(final String importSinkKey) {
        this.importSinkKey = importSinkKey;
    }

    /**
     * set limit with the specificied value
     */
    public ByProjectKeyCategoriesImportSinkKeyByImportSinkKeyImportOperationsGet withLimit(final double limit) {
        return copy().withQueryParam("limit", limit);
    }

    /**
     * add additional limit query parameter
     */
    public ByProjectKeyCategoriesImportSinkKeyByImportSinkKeyImportOperationsGet addLimit(final double limit) {
        return copy().addQueryParam("limit", limit);
    }

    /**
     * set limit with the specificied values
     */
    public ByProjectKeyCategoriesImportSinkKeyByImportSinkKeyImportOperationsGet withLimit(final List<Double> limit) {
        return copy().withoutQueryParam("limit")
                .addQueryParams(
                    limit.stream().map(s -> new ParamEntry<>("limit", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional limit query parameters
     */
    public ByProjectKeyCategoriesImportSinkKeyByImportSinkKeyImportOperationsGet addLimit(final List<Double> limit) {
        return copy().addQueryParams(
            limit.stream().map(s -> new ParamEntry<>("limit", s.toString())).collect(Collectors.toList()));
    }

    /**
     * set offset with the specificied value
     */
    public ByProjectKeyCategoriesImportSinkKeyByImportSinkKeyImportOperationsGet withOffset(final double offset) {
        return copy().withQueryParam("offset", offset);
    }

    /**
     * add additional offset query parameter
     */
    public ByProjectKeyCategoriesImportSinkKeyByImportSinkKeyImportOperationsGet addOffset(final double offset) {
        return copy().addQueryParam("offset", offset);
    }

    /**
     * set offset with the specificied values
     */
    public ByProjectKeyCategoriesImportSinkKeyByImportSinkKeyImportOperationsGet withOffset(final List<Double> offset) {
        return copy().withoutQueryParam("offset")
                .addQueryParams(
                    offset.stream().map(s -> new ParamEntry<>("offset", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional offset query parameters
     */
    public ByProjectKeyCategoriesImportSinkKeyByImportSinkKeyImportOperationsGet addOffset(final List<Double> offset) {
        return copy().addQueryParams(
            offset.stream().map(s -> new ParamEntry<>("offset", s.toString())).collect(Collectors.toList()));
    }

    /**
     * set sort with the specificied value
     */
    public ByProjectKeyCategoriesImportSinkKeyByImportSinkKeyImportOperationsGet withSort(final String sort) {
        return copy().withQueryParam("sort", sort);
    }

    /**
     * add additional sort query parameter
     */
    public ByProjectKeyCategoriesImportSinkKeyByImportSinkKeyImportOperationsGet addSort(final String sort) {
        return copy().addQueryParam("sort", sort);
    }

    /**
     * set sort with the specificied values
     */
    public ByProjectKeyCategoriesImportSinkKeyByImportSinkKeyImportOperationsGet withSort(final List<String> sort) {
        return copy().withoutQueryParam("sort")
                .addQueryParams(
                    sort.stream().map(s -> new ParamEntry<>("sort", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional sort query parameters
     */
    public ByProjectKeyCategoriesImportSinkKeyByImportSinkKeyImportOperationsGet addSort(final List<String> sort) {
        return copy().addQueryParams(
            sort.stream().map(s -> new ParamEntry<>("sort", s.toString())).collect(Collectors.toList()));
    }

    /**
     * set resourceKey with the specificied value
     */
    public ByProjectKeyCategoriesImportSinkKeyByImportSinkKeyImportOperationsGet withResourceKey(
            final String resourceKey) {
        return copy().withQueryParam("resourceKey", resourceKey);
    }

    /**
     * add additional resourceKey query parameter
     */
    public ByProjectKeyCategoriesImportSinkKeyByImportSinkKeyImportOperationsGet addResourceKey(
            final String resourceKey) {
        return copy().addQueryParam("resourceKey", resourceKey);
    }

    /**
     * set resourceKey with the specificied values
     */
    public ByProjectKeyCategoriesImportSinkKeyByImportSinkKeyImportOperationsGet withResourceKey(
            final List<String> resourceKey) {
        return copy().withoutQueryParam("resourceKey")
                .addQueryParams(resourceKey.stream()
                        .map(s -> new ParamEntry<>("resourceKey", s.toString()))
                        .collect(Collectors.toList()));
    }

    /**
     * add additional resourceKey query parameters
     */
    public ByProjectKeyCategoriesImportSinkKeyByImportSinkKeyImportOperationsGet addResourceKey(
            final List<String> resourceKey) {
        return copy().addQueryParams(
            resourceKey.stream().map(s -> new ParamEntry<>("resourceKey", s.toString())).collect(Collectors.toList()));
    }

    /**
     * set state with the specificied value
     */
    public ByProjectKeyCategoriesImportSinkKeyByImportSinkKeyImportOperationsGet withState(
            final ProcessingState state) {
        return copy().withQueryParam("state", state);
    }

    /**
     * add additional state query parameter
     */
    public ByProjectKeyCategoriesImportSinkKeyByImportSinkKeyImportOperationsGet addState(final ProcessingState state) {
        return copy().addQueryParam("state", state);
    }

    /**
     * set state with the specificied values
     */
    public ByProjectKeyCategoriesImportSinkKeyByImportSinkKeyImportOperationsGet withState(
            final List<ProcessingState> state) {
        return copy().withoutQueryParam("state")
                .addQueryParams(
                    state.stream().map(s -> new ParamEntry<>("state", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional state query parameters
     */
    public ByProjectKeyCategoriesImportSinkKeyByImportSinkKeyImportOperationsGet addState(
            final List<ProcessingState> state) {
        return copy().addQueryParams(
            state.stream().map(s -> new ParamEntry<>("state", s.toString())).collect(Collectors.toList()));
    }

    /**
     * set debug with the specificied value
     */
    public ByProjectKeyCategoriesImportSinkKeyByImportSinkKeyImportOperationsGet withDebug(final boolean debug) {
        return copy().withQueryParam("debug", debug);
    }

    /**
     * add additional debug query parameter
     */
    public ByProjectKeyCategoriesImportSinkKeyByImportSinkKeyImportOperationsGet addDebug(final boolean debug) {
        return copy().addQueryParam("debug", debug);
    }

    /**
     * set debug with the specificied values
     */
    public ByProjectKeyCategoriesImportSinkKeyByImportSinkKeyImportOperationsGet withDebug(final List<Boolean> debug) {
        return copy().withoutQueryParam("debug")
                .addQueryParams(
                    debug.stream().map(s -> new ParamEntry<>("debug", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional debug query parameters
     */
    public ByProjectKeyCategoriesImportSinkKeyByImportSinkKeyImportOperationsGet addDebug(final List<Boolean> debug) {
        return copy().addQueryParams(
            debug.stream().map(s -> new ParamEntry<>("debug", s.toString())).collect(Collectors.toList()));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ByProjectKeyCategoriesImportSinkKeyByImportSinkKeyImportOperationsGet that = (ByProjectKeyCategoriesImportSinkKeyByImportSinkKeyImportOperationsGet) o;

        return new EqualsBuilder().append(projectKey, that.projectKey)
                .append(importSinkKey, that.importSinkKey)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(projectKey).append(importSinkKey).toHashCode();
    }

    @Override
    protected ByProjectKeyCategoriesImportSinkKeyByImportSinkKeyImportOperationsGet copy() {
        return new ByProjectKeyCategoriesImportSinkKeyByImportSinkKeyImportOperationsGet(this);
    }
}
