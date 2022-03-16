
package com.commercetools.importapi.client;

import java.net.URI;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;

import com.commercetools.importapi.models.common.ProcessingState;

import io.vrap.rmf.base.client.*;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
*  <p>Retrieves all order import operations of an import sink key.</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ByProjectKeyOrdersImportSinkKeyByImportSinkKeyImportOperationsGet extends
        ApiMethod<ByProjectKeyOrdersImportSinkKeyByImportSinkKeyImportOperationsGet, com.commercetools.importapi.models.importoperations.ImportOperationPagedResponse>
        implements
        com.commercetools.importapi.client.Secured_by_view_ordersTrait<ByProjectKeyOrdersImportSinkKeyByImportSinkKeyImportOperationsGet> {

    private String projectKey;
    private String importSinkKey;

    public ByProjectKeyOrdersImportSinkKeyByImportSinkKeyImportOperationsGet(final ApiHttpClient apiHttpClient,
            String projectKey, String importSinkKey) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.importSinkKey = importSinkKey;
    }

    public ByProjectKeyOrdersImportSinkKeyByImportSinkKeyImportOperationsGet(
            ByProjectKeyOrdersImportSinkKeyByImportSinkKeyImportOperationsGet t) {
        super(t);
        this.projectKey = t.projectKey;
        this.importSinkKey = t.importSinkKey;
    }

    @Override
    public ApiHttpRequest createHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("/%s/orders/importSinkKey=%s/import-operations", this.projectKey,
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
     * set limit with the specified value
     */
    public ByProjectKeyOrdersImportSinkKeyByImportSinkKeyImportOperationsGet withLimit(final double limit) {
        return copy().withQueryParam("limit", limit);
    }

    /**
     * add additional limit query parameter
     */
    public ByProjectKeyOrdersImportSinkKeyByImportSinkKeyImportOperationsGet addLimit(final double limit) {
        return copy().addQueryParam("limit", limit);
    }

    /**
     * set limit with the specified value
     */
    public ByProjectKeyOrdersImportSinkKeyByImportSinkKeyImportOperationsGet withLimit(
            final Supplier<Double> supplier) {
        return copy().withQueryParam("limit", supplier.get());
    }

    /**
     * add additional limit query parameter
     */
    public ByProjectKeyOrdersImportSinkKeyByImportSinkKeyImportOperationsGet addLimit(final Supplier<Double> supplier) {
        return copy().addQueryParam("limit", supplier.get());
    }

    /**
     * set limit with the specified value
     */
    public ByProjectKeyOrdersImportSinkKeyByImportSinkKeyImportOperationsGet withLimit(
            final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("limit", op.apply(new StringBuilder()));
    }

    /**
     * add additional limit query parameter
     */
    public ByProjectKeyOrdersImportSinkKeyByImportSinkKeyImportOperationsGet addLimit(
            final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("limit", op.apply(new StringBuilder()));
    }

    /**
     * set limit with the specified values
     */
    public ByProjectKeyOrdersImportSinkKeyByImportSinkKeyImportOperationsGet withLimit(final List<Double> limit) {
        return copy().withoutQueryParam("limit")
                .addQueryParams(
                    limit.stream().map(s -> new ParamEntry<>("limit", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional limit query parameters
     */
    public ByProjectKeyOrdersImportSinkKeyByImportSinkKeyImportOperationsGet addLimit(final List<Double> limit) {
        return copy().addQueryParams(
            limit.stream().map(s -> new ParamEntry<>("limit", s.toString())).collect(Collectors.toList()));
    }

    /**
     * set offset with the specified value
     */
    public ByProjectKeyOrdersImportSinkKeyByImportSinkKeyImportOperationsGet withOffset(final double offset) {
        return copy().withQueryParam("offset", offset);
    }

    /**
     * add additional offset query parameter
     */
    public ByProjectKeyOrdersImportSinkKeyByImportSinkKeyImportOperationsGet addOffset(final double offset) {
        return copy().addQueryParam("offset", offset);
    }

    /**
     * set offset with the specified value
     */
    public ByProjectKeyOrdersImportSinkKeyByImportSinkKeyImportOperationsGet withOffset(
            final Supplier<Double> supplier) {
        return copy().withQueryParam("offset", supplier.get());
    }

    /**
     * add additional offset query parameter
     */
    public ByProjectKeyOrdersImportSinkKeyByImportSinkKeyImportOperationsGet addOffset(
            final Supplier<Double> supplier) {
        return copy().addQueryParam("offset", supplier.get());
    }

    /**
     * set offset with the specified value
     */
    public ByProjectKeyOrdersImportSinkKeyByImportSinkKeyImportOperationsGet withOffset(
            final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("offset", op.apply(new StringBuilder()));
    }

    /**
     * add additional offset query parameter
     */
    public ByProjectKeyOrdersImportSinkKeyByImportSinkKeyImportOperationsGet addOffset(
            final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("offset", op.apply(new StringBuilder()));
    }

    /**
     * set offset with the specified values
     */
    public ByProjectKeyOrdersImportSinkKeyByImportSinkKeyImportOperationsGet withOffset(final List<Double> offset) {
        return copy().withoutQueryParam("offset")
                .addQueryParams(
                    offset.stream().map(s -> new ParamEntry<>("offset", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional offset query parameters
     */
    public ByProjectKeyOrdersImportSinkKeyByImportSinkKeyImportOperationsGet addOffset(final List<Double> offset) {
        return copy().addQueryParams(
            offset.stream().map(s -> new ParamEntry<>("offset", s.toString())).collect(Collectors.toList()));
    }

    /**
     * set sort with the specified value
     */
    public ByProjectKeyOrdersImportSinkKeyByImportSinkKeyImportOperationsGet withSort(final String sort) {
        return copy().withQueryParam("sort", sort);
    }

    /**
     * add additional sort query parameter
     */
    public ByProjectKeyOrdersImportSinkKeyByImportSinkKeyImportOperationsGet addSort(final String sort) {
        return copy().addQueryParam("sort", sort);
    }

    /**
     * set sort with the specified value
     */
    public ByProjectKeyOrdersImportSinkKeyByImportSinkKeyImportOperationsGet withSort(final Supplier<String> supplier) {
        return copy().withQueryParam("sort", supplier.get());
    }

    /**
     * add additional sort query parameter
     */
    public ByProjectKeyOrdersImportSinkKeyByImportSinkKeyImportOperationsGet addSort(final Supplier<String> supplier) {
        return copy().addQueryParam("sort", supplier.get());
    }

    /**
     * set sort with the specified value
     */
    public ByProjectKeyOrdersImportSinkKeyByImportSinkKeyImportOperationsGet withSort(
            final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("sort", op.apply(new StringBuilder()));
    }

    /**
     * add additional sort query parameter
     */
    public ByProjectKeyOrdersImportSinkKeyByImportSinkKeyImportOperationsGet addSort(
            final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("sort", op.apply(new StringBuilder()));
    }

    /**
     * set sort with the specified values
     */
    public ByProjectKeyOrdersImportSinkKeyByImportSinkKeyImportOperationsGet withSort(final List<String> sort) {
        return copy().withoutQueryParam("sort")
                .addQueryParams(
                    sort.stream().map(s -> new ParamEntry<>("sort", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional sort query parameters
     */
    public ByProjectKeyOrdersImportSinkKeyByImportSinkKeyImportOperationsGet addSort(final List<String> sort) {
        return copy().addQueryParams(
            sort.stream().map(s -> new ParamEntry<>("sort", s.toString())).collect(Collectors.toList()));
    }

    /**
     * set resourceKey with the specified value
     */
    public ByProjectKeyOrdersImportSinkKeyByImportSinkKeyImportOperationsGet withResourceKey(final String resourceKey) {
        return copy().withQueryParam("resourceKey", resourceKey);
    }

    /**
     * add additional resourceKey query parameter
     */
    public ByProjectKeyOrdersImportSinkKeyByImportSinkKeyImportOperationsGet addResourceKey(final String resourceKey) {
        return copy().addQueryParam("resourceKey", resourceKey);
    }

    /**
     * set resourceKey with the specified value
     */
    public ByProjectKeyOrdersImportSinkKeyByImportSinkKeyImportOperationsGet withResourceKey(
            final Supplier<String> supplier) {
        return copy().withQueryParam("resourceKey", supplier.get());
    }

    /**
     * add additional resourceKey query parameter
     */
    public ByProjectKeyOrdersImportSinkKeyByImportSinkKeyImportOperationsGet addResourceKey(
            final Supplier<String> supplier) {
        return copy().addQueryParam("resourceKey", supplier.get());
    }

    /**
     * set resourceKey with the specified value
     */
    public ByProjectKeyOrdersImportSinkKeyByImportSinkKeyImportOperationsGet withResourceKey(
            final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("resourceKey", op.apply(new StringBuilder()));
    }

    /**
     * add additional resourceKey query parameter
     */
    public ByProjectKeyOrdersImportSinkKeyByImportSinkKeyImportOperationsGet addResourceKey(
            final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("resourceKey", op.apply(new StringBuilder()));
    }

    /**
     * set resourceKey with the specified values
     */
    public ByProjectKeyOrdersImportSinkKeyByImportSinkKeyImportOperationsGet withResourceKey(
            final List<String> resourceKey) {
        return copy().withoutQueryParam("resourceKey")
                .addQueryParams(resourceKey.stream()
                        .map(s -> new ParamEntry<>("resourceKey", s.toString()))
                        .collect(Collectors.toList()));
    }

    /**
     * add additional resourceKey query parameters
     */
    public ByProjectKeyOrdersImportSinkKeyByImportSinkKeyImportOperationsGet addResourceKey(
            final List<String> resourceKey) {
        return copy().addQueryParams(
            resourceKey.stream().map(s -> new ParamEntry<>("resourceKey", s.toString())).collect(Collectors.toList()));
    }

    /**
     * set state with the specified value
     */
    public ByProjectKeyOrdersImportSinkKeyByImportSinkKeyImportOperationsGet withState(final ProcessingState state) {
        return copy().withQueryParam("state", state);
    }

    /**
     * add additional state query parameter
     */
    public ByProjectKeyOrdersImportSinkKeyByImportSinkKeyImportOperationsGet addState(final ProcessingState state) {
        return copy().addQueryParam("state", state);
    }

    /**
     * set state with the specified value
     */
    public ByProjectKeyOrdersImportSinkKeyByImportSinkKeyImportOperationsGet withState(
            final Supplier<ProcessingState> supplier) {
        return copy().withQueryParam("state", supplier.get());
    }

    /**
     * add additional state query parameter
     */
    public ByProjectKeyOrdersImportSinkKeyByImportSinkKeyImportOperationsGet addState(
            final Supplier<ProcessingState> supplier) {
        return copy().addQueryParam("state", supplier.get());
    }

    /**
     * set state with the specified value
     */
    public ByProjectKeyOrdersImportSinkKeyByImportSinkKeyImportOperationsGet withState(
            final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("state", op.apply(new StringBuilder()));
    }

    /**
     * add additional state query parameter
     */
    public ByProjectKeyOrdersImportSinkKeyByImportSinkKeyImportOperationsGet addState(
            final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("state", op.apply(new StringBuilder()));
    }

    /**
     * set state with the specified values
     */
    public ByProjectKeyOrdersImportSinkKeyByImportSinkKeyImportOperationsGet withState(
            final List<ProcessingState> state) {
        return copy().withoutQueryParam("state")
                .addQueryParams(
                    state.stream().map(s -> new ParamEntry<>("state", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional state query parameters
     */
    public ByProjectKeyOrdersImportSinkKeyByImportSinkKeyImportOperationsGet addState(
            final List<ProcessingState> state) {
        return copy().addQueryParams(
            state.stream().map(s -> new ParamEntry<>("state", s.toString())).collect(Collectors.toList()));
    }

    /**
     * set debug with the specified value
     */
    public ByProjectKeyOrdersImportSinkKeyByImportSinkKeyImportOperationsGet withDebug(final boolean debug) {
        return copy().withQueryParam("debug", debug);
    }

    /**
     * add additional debug query parameter
     */
    public ByProjectKeyOrdersImportSinkKeyByImportSinkKeyImportOperationsGet addDebug(final boolean debug) {
        return copy().addQueryParam("debug", debug);
    }

    /**
     * set debug with the specified value
     */
    public ByProjectKeyOrdersImportSinkKeyByImportSinkKeyImportOperationsGet withDebug(
            final Supplier<Boolean> supplier) {
        return copy().withQueryParam("debug", supplier.get());
    }

    /**
     * add additional debug query parameter
     */
    public ByProjectKeyOrdersImportSinkKeyByImportSinkKeyImportOperationsGet addDebug(
            final Supplier<Boolean> supplier) {
        return copy().addQueryParam("debug", supplier.get());
    }

    /**
     * set debug with the specified value
     */
    public ByProjectKeyOrdersImportSinkKeyByImportSinkKeyImportOperationsGet withDebug(
            final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("debug", op.apply(new StringBuilder()));
    }

    /**
     * add additional debug query parameter
     */
    public ByProjectKeyOrdersImportSinkKeyByImportSinkKeyImportOperationsGet addDebug(
            final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("debug", op.apply(new StringBuilder()));
    }

    /**
     * set debug with the specified values
     */
    public ByProjectKeyOrdersImportSinkKeyByImportSinkKeyImportOperationsGet withDebug(final List<Boolean> debug) {
        return copy().withoutQueryParam("debug")
                .addQueryParams(
                    debug.stream().map(s -> new ParamEntry<>("debug", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional debug query parameters
     */
    public ByProjectKeyOrdersImportSinkKeyByImportSinkKeyImportOperationsGet addDebug(final List<Boolean> debug) {
        return copy().addQueryParams(
            debug.stream().map(s -> new ParamEntry<>("debug", s.toString())).collect(Collectors.toList()));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ByProjectKeyOrdersImportSinkKeyByImportSinkKeyImportOperationsGet that = (ByProjectKeyOrdersImportSinkKeyByImportSinkKeyImportOperationsGet) o;

        return new EqualsBuilder().append(projectKey, that.projectKey)
                .append(importSinkKey, that.importSinkKey)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(projectKey).append(importSinkKey).toHashCode();
    }

    @Override
    protected ByProjectKeyOrdersImportSinkKeyByImportSinkKeyImportOperationsGet copy() {
        return new ByProjectKeyOrdersImportSinkKeyByImportSinkKeyImportOperationsGet(this);
    }
}
