
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
*  <p>Retrieves all order-patches import operations of an import sink key.</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ByProjectKeyOrderPatchesImportSinkKeyByImportSinkKeyImportOperationsGet extends
        ApiMethod<ByProjectKeyOrderPatchesImportSinkKeyByImportSinkKeyImportOperationsGet, com.commercetools.importapi.models.importoperations.ImportOperationPagedResponse>
        implements
        com.commercetools.importapi.client.Secured_by_view_ordersTrait<ByProjectKeyOrderPatchesImportSinkKeyByImportSinkKeyImportOperationsGet> {

    private String projectKey;
    private String importSinkKey;

    public ByProjectKeyOrderPatchesImportSinkKeyByImportSinkKeyImportOperationsGet(final ApiHttpClient apiHttpClient,
            String projectKey, String importSinkKey) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.importSinkKey = importSinkKey;
    }

    public ByProjectKeyOrderPatchesImportSinkKeyByImportSinkKeyImportOperationsGet(
            ByProjectKeyOrderPatchesImportSinkKeyByImportSinkKeyImportOperationsGet t) {
        super(t);
        this.projectKey = t.projectKey;
        this.importSinkKey = t.importSinkKey;
    }

    @Override
    protected ApiHttpRequest buildHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("/%s/order-patches/importSinkKey=%s/import-operations", this.projectKey,
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
    public <TValue> ByProjectKeyOrderPatchesImportSinkKeyByImportSinkKeyImportOperationsGet withLimit(
            final TValue limit) {
        return copy().withQueryParam("limit", limit);
    }

    /**
     * add additional limit query parameter
     */
    public <TValue> ByProjectKeyOrderPatchesImportSinkKeyByImportSinkKeyImportOperationsGet addLimit(
            final TValue limit) {
        return copy().addQueryParam("limit", limit);
    }

    /**
     * set limit with the specified value
     */
    public ByProjectKeyOrderPatchesImportSinkKeyByImportSinkKeyImportOperationsGet withLimit(
            final Supplier<Double> supplier) {
        return copy().withQueryParam("limit", supplier.get());
    }

    /**
     * add additional limit query parameter
     */
    public ByProjectKeyOrderPatchesImportSinkKeyByImportSinkKeyImportOperationsGet addLimit(
            final Supplier<Double> supplier) {
        return copy().addQueryParam("limit", supplier.get());
    }

    /**
     * set limit with the specified value
     */
    public ByProjectKeyOrderPatchesImportSinkKeyByImportSinkKeyImportOperationsGet withLimit(
            final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("limit", op.apply(new StringBuilder()));
    }

    /**
     * add additional limit query parameter
     */
    public ByProjectKeyOrderPatchesImportSinkKeyByImportSinkKeyImportOperationsGet addLimit(
            final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("limit", op.apply(new StringBuilder()));
    }

    /**
     * set limit with the specified values
     */
    public <TValue> ByProjectKeyOrderPatchesImportSinkKeyByImportSinkKeyImportOperationsGet withLimit(
            final List<TValue> limit) {
        return copy().withoutQueryParam("limit")
                .addQueryParams(
                    limit.stream().map(s -> new ParamEntry<>("limit", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional limit query parameters
     */
    public <TValue> ByProjectKeyOrderPatchesImportSinkKeyByImportSinkKeyImportOperationsGet addLimit(
            final List<TValue> limit) {
        return copy().addQueryParams(
            limit.stream().map(s -> new ParamEntry<>("limit", s.toString())).collect(Collectors.toList()));
    }

    /**
     * set offset with the specified value
     */
    public <TValue> ByProjectKeyOrderPatchesImportSinkKeyByImportSinkKeyImportOperationsGet withOffset(
            final TValue offset) {
        return copy().withQueryParam("offset", offset);
    }

    /**
     * add additional offset query parameter
     */
    public <TValue> ByProjectKeyOrderPatchesImportSinkKeyByImportSinkKeyImportOperationsGet addOffset(
            final TValue offset) {
        return copy().addQueryParam("offset", offset);
    }

    /**
     * set offset with the specified value
     */
    public ByProjectKeyOrderPatchesImportSinkKeyByImportSinkKeyImportOperationsGet withOffset(
            final Supplier<Double> supplier) {
        return copy().withQueryParam("offset", supplier.get());
    }

    /**
     * add additional offset query parameter
     */
    public ByProjectKeyOrderPatchesImportSinkKeyByImportSinkKeyImportOperationsGet addOffset(
            final Supplier<Double> supplier) {
        return copy().addQueryParam("offset", supplier.get());
    }

    /**
     * set offset with the specified value
     */
    public ByProjectKeyOrderPatchesImportSinkKeyByImportSinkKeyImportOperationsGet withOffset(
            final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("offset", op.apply(new StringBuilder()));
    }

    /**
     * add additional offset query parameter
     */
    public ByProjectKeyOrderPatchesImportSinkKeyByImportSinkKeyImportOperationsGet addOffset(
            final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("offset", op.apply(new StringBuilder()));
    }

    /**
     * set offset with the specified values
     */
    public <TValue> ByProjectKeyOrderPatchesImportSinkKeyByImportSinkKeyImportOperationsGet withOffset(
            final List<TValue> offset) {
        return copy().withoutQueryParam("offset")
                .addQueryParams(
                    offset.stream().map(s -> new ParamEntry<>("offset", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional offset query parameters
     */
    public <TValue> ByProjectKeyOrderPatchesImportSinkKeyByImportSinkKeyImportOperationsGet addOffset(
            final List<TValue> offset) {
        return copy().addQueryParams(
            offset.stream().map(s -> new ParamEntry<>("offset", s.toString())).collect(Collectors.toList()));
    }

    /**
     * set sort with the specified value
     */
    public <TValue> ByProjectKeyOrderPatchesImportSinkKeyByImportSinkKeyImportOperationsGet withSort(
            final TValue sort) {
        return copy().withQueryParam("sort", sort);
    }

    /**
     * add additional sort query parameter
     */
    public <TValue> ByProjectKeyOrderPatchesImportSinkKeyByImportSinkKeyImportOperationsGet addSort(final TValue sort) {
        return copy().addQueryParam("sort", sort);
    }

    /**
     * set sort with the specified value
     */
    public ByProjectKeyOrderPatchesImportSinkKeyByImportSinkKeyImportOperationsGet withSort(
            final Supplier<String> supplier) {
        return copy().withQueryParam("sort", supplier.get());
    }

    /**
     * add additional sort query parameter
     */
    public ByProjectKeyOrderPatchesImportSinkKeyByImportSinkKeyImportOperationsGet addSort(
            final Supplier<String> supplier) {
        return copy().addQueryParam("sort", supplier.get());
    }

    /**
     * set sort with the specified value
     */
    public ByProjectKeyOrderPatchesImportSinkKeyByImportSinkKeyImportOperationsGet withSort(
            final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("sort", op.apply(new StringBuilder()));
    }

    /**
     * add additional sort query parameter
     */
    public ByProjectKeyOrderPatchesImportSinkKeyByImportSinkKeyImportOperationsGet addSort(
            final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("sort", op.apply(new StringBuilder()));
    }

    /**
     * set sort with the specified values
     */
    public <TValue> ByProjectKeyOrderPatchesImportSinkKeyByImportSinkKeyImportOperationsGet withSort(
            final List<TValue> sort) {
        return copy().withoutQueryParam("sort")
                .addQueryParams(
                    sort.stream().map(s -> new ParamEntry<>("sort", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional sort query parameters
     */
    public <TValue> ByProjectKeyOrderPatchesImportSinkKeyByImportSinkKeyImportOperationsGet addSort(
            final List<TValue> sort) {
        return copy().addQueryParams(
            sort.stream().map(s -> new ParamEntry<>("sort", s.toString())).collect(Collectors.toList()));
    }

    /**
     * set resourceKey with the specified value
     */
    public <TValue> ByProjectKeyOrderPatchesImportSinkKeyByImportSinkKeyImportOperationsGet withResourceKey(
            final TValue resourceKey) {
        return copy().withQueryParam("resourceKey", resourceKey);
    }

    /**
     * add additional resourceKey query parameter
     */
    public <TValue> ByProjectKeyOrderPatchesImportSinkKeyByImportSinkKeyImportOperationsGet addResourceKey(
            final TValue resourceKey) {
        return copy().addQueryParam("resourceKey", resourceKey);
    }

    /**
     * set resourceKey with the specified value
     */
    public ByProjectKeyOrderPatchesImportSinkKeyByImportSinkKeyImportOperationsGet withResourceKey(
            final Supplier<String> supplier) {
        return copy().withQueryParam("resourceKey", supplier.get());
    }

    /**
     * add additional resourceKey query parameter
     */
    public ByProjectKeyOrderPatchesImportSinkKeyByImportSinkKeyImportOperationsGet addResourceKey(
            final Supplier<String> supplier) {
        return copy().addQueryParam("resourceKey", supplier.get());
    }

    /**
     * set resourceKey with the specified value
     */
    public ByProjectKeyOrderPatchesImportSinkKeyByImportSinkKeyImportOperationsGet withResourceKey(
            final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("resourceKey", op.apply(new StringBuilder()));
    }

    /**
     * add additional resourceKey query parameter
     */
    public ByProjectKeyOrderPatchesImportSinkKeyByImportSinkKeyImportOperationsGet addResourceKey(
            final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("resourceKey", op.apply(new StringBuilder()));
    }

    /**
     * set resourceKey with the specified values
     */
    public <TValue> ByProjectKeyOrderPatchesImportSinkKeyByImportSinkKeyImportOperationsGet withResourceKey(
            final List<TValue> resourceKey) {
        return copy().withoutQueryParam("resourceKey")
                .addQueryParams(resourceKey.stream()
                        .map(s -> new ParamEntry<>("resourceKey", s.toString()))
                        .collect(Collectors.toList()));
    }

    /**
     * add additional resourceKey query parameters
     */
    public <TValue> ByProjectKeyOrderPatchesImportSinkKeyByImportSinkKeyImportOperationsGet addResourceKey(
            final List<TValue> resourceKey) {
        return copy().addQueryParams(
            resourceKey.stream().map(s -> new ParamEntry<>("resourceKey", s.toString())).collect(Collectors.toList()));
    }

    /**
     * set state with the specified value
     */
    public <TValue> ByProjectKeyOrderPatchesImportSinkKeyByImportSinkKeyImportOperationsGet withState(
            final TValue state) {
        return copy().withQueryParam("state", state);
    }

    /**
     * add additional state query parameter
     */
    public <TValue> ByProjectKeyOrderPatchesImportSinkKeyByImportSinkKeyImportOperationsGet addState(
            final TValue state) {
        return copy().addQueryParam("state", state);
    }

    /**
     * set state with the specified value
     */
    public ByProjectKeyOrderPatchesImportSinkKeyByImportSinkKeyImportOperationsGet withState(
            final Supplier<ProcessingState> supplier) {
        return copy().withQueryParam("state", supplier.get());
    }

    /**
     * add additional state query parameter
     */
    public ByProjectKeyOrderPatchesImportSinkKeyByImportSinkKeyImportOperationsGet addState(
            final Supplier<ProcessingState> supplier) {
        return copy().addQueryParam("state", supplier.get());
    }

    /**
     * set state with the specified value
     */
    public ByProjectKeyOrderPatchesImportSinkKeyByImportSinkKeyImportOperationsGet withState(
            final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("state", op.apply(new StringBuilder()));
    }

    /**
     * add additional state query parameter
     */
    public ByProjectKeyOrderPatchesImportSinkKeyByImportSinkKeyImportOperationsGet addState(
            final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("state", op.apply(new StringBuilder()));
    }

    /**
     * set state with the specified values
     */
    public <TValue> ByProjectKeyOrderPatchesImportSinkKeyByImportSinkKeyImportOperationsGet withState(
            final List<TValue> state) {
        return copy().withoutQueryParam("state")
                .addQueryParams(
                    state.stream().map(s -> new ParamEntry<>("state", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional state query parameters
     */
    public <TValue> ByProjectKeyOrderPatchesImportSinkKeyByImportSinkKeyImportOperationsGet addState(
            final List<TValue> state) {
        return copy().addQueryParams(
            state.stream().map(s -> new ParamEntry<>("state", s.toString())).collect(Collectors.toList()));
    }

    /**
     * set debug with the specified value
     */
    public <TValue> ByProjectKeyOrderPatchesImportSinkKeyByImportSinkKeyImportOperationsGet withDebug(
            final TValue debug) {
        return copy().withQueryParam("debug", debug);
    }

    /**
     * add additional debug query parameter
     */
    public <TValue> ByProjectKeyOrderPatchesImportSinkKeyByImportSinkKeyImportOperationsGet addDebug(
            final TValue debug) {
        return copy().addQueryParam("debug", debug);
    }

    /**
     * set debug with the specified value
     */
    public ByProjectKeyOrderPatchesImportSinkKeyByImportSinkKeyImportOperationsGet withDebug(
            final Supplier<Boolean> supplier) {
        return copy().withQueryParam("debug", supplier.get());
    }

    /**
     * add additional debug query parameter
     */
    public ByProjectKeyOrderPatchesImportSinkKeyByImportSinkKeyImportOperationsGet addDebug(
            final Supplier<Boolean> supplier) {
        return copy().addQueryParam("debug", supplier.get());
    }

    /**
     * set debug with the specified value
     */
    public ByProjectKeyOrderPatchesImportSinkKeyByImportSinkKeyImportOperationsGet withDebug(
            final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("debug", op.apply(new StringBuilder()));
    }

    /**
     * add additional debug query parameter
     */
    public ByProjectKeyOrderPatchesImportSinkKeyByImportSinkKeyImportOperationsGet addDebug(
            final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("debug", op.apply(new StringBuilder()));
    }

    /**
     * set debug with the specified values
     */
    public <TValue> ByProjectKeyOrderPatchesImportSinkKeyByImportSinkKeyImportOperationsGet withDebug(
            final List<TValue> debug) {
        return copy().withoutQueryParam("debug")
                .addQueryParams(
                    debug.stream().map(s -> new ParamEntry<>("debug", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional debug query parameters
     */
    public <TValue> ByProjectKeyOrderPatchesImportSinkKeyByImportSinkKeyImportOperationsGet addDebug(
            final List<TValue> debug) {
        return copy().addQueryParams(
            debug.stream().map(s -> new ParamEntry<>("debug", s.toString())).collect(Collectors.toList()));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ByProjectKeyOrderPatchesImportSinkKeyByImportSinkKeyImportOperationsGet that = (ByProjectKeyOrderPatchesImportSinkKeyByImportSinkKeyImportOperationsGet) o;

        return new EqualsBuilder().append(projectKey, that.projectKey)
                .append(importSinkKey, that.importSinkKey)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(projectKey).append(importSinkKey).toHashCode();
    }

    @Override
    protected ByProjectKeyOrderPatchesImportSinkKeyByImportSinkKeyImportOperationsGet copy() {
        return new ByProjectKeyOrderPatchesImportSinkKeyByImportSinkKeyImportOperationsGet(this);
    }
}
