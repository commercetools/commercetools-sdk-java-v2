
package com.commercetools.importapi.client;

import java.net.URI;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Collection;
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
 *  <p>Retrieves all ImportOperations of a given ImportContainer key.</p>
 *
 * <hr>
 * <div class=code-example>
 * <pre><code class='java'>{@code
 *   CompletableFuture<ApiHttpResponse<com.commercetools.importapi.models.importoperations.ImportOperationPagedResponse>> result = apiRoot
 *            .withProjectKeyValue("{projectKey}")
 *            .importContainers()
 *            .withImportContainerKeyValue("{importContainerKey}")
 *            .importOperations()
 *            .get()
 *            .execute()
 * }</code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyImportContainersByImportContainerKeyImportOperationsGet extends
        ApiMethod<ByProjectKeyImportContainersByImportContainerKeyImportOperationsGet, com.commercetools.importapi.models.importoperations.ImportOperationPagedResponse>
        implements
        com.commercetools.importapi.client.Secured_by_view_import_containersTrait<ByProjectKeyImportContainersByImportContainerKeyImportOperationsGet> {

    private String projectKey;
    private String importContainerKey;

    public ByProjectKeyImportContainersByImportContainerKeyImportOperationsGet(final ApiHttpClient apiHttpClient,
            String projectKey, String importContainerKey) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.importContainerKey = importContainerKey;
    }

    public ByProjectKeyImportContainersByImportContainerKeyImportOperationsGet(
            ByProjectKeyImportContainersByImportContainerKeyImportOperationsGet t) {
        super(t);
        this.projectKey = t.projectKey;
        this.importContainerKey = t.importContainerKey;
    }

    @Override
    protected ApiHttpRequest buildHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("%s/import-containers/%s/import-operations", this.projectKey,
            this.importContainerKey);
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

    public String getImportContainerKey() {
        return this.importContainerKey;
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

    public void setImportContainerKey(final String importContainerKey) {
        this.importContainerKey = importContainerKey;
    }

    /**
     * set limit with the specified value
     * @param limit value to be set
     * @param <TValue> value type
     * @return ByProjectKeyImportContainersByImportContainerKeyImportOperationsGet
     */
    public <TValue> ByProjectKeyImportContainersByImportContainerKeyImportOperationsGet withLimit(final TValue limit) {
        return copy().withQueryParam("limit", limit);
    }

    /**
     * add additional limit query parameter
     * @param limit value to be added
     * @param <TValue> value type
     * @return ByProjectKeyImportContainersByImportContainerKeyImportOperationsGet
     */
    public <TValue> ByProjectKeyImportContainersByImportContainerKeyImportOperationsGet addLimit(final TValue limit) {
        return copy().addQueryParam("limit", limit);
    }

    /**
     * set limit with the specified value
     * @param supplier supplier for the value to be set
     * @return ByProjectKeyImportContainersByImportContainerKeyImportOperationsGet
     */
    public ByProjectKeyImportContainersByImportContainerKeyImportOperationsGet withLimit(
            final Supplier<Double> supplier) {
        return copy().withQueryParam("limit", supplier.get());
    }

    /**
     * add additional limit query parameter
     * @param supplier supplier for the value to be added
     * @return ByProjectKeyImportContainersByImportContainerKeyImportOperationsGet
     */
    public ByProjectKeyImportContainersByImportContainerKeyImportOperationsGet addLimit(
            final Supplier<Double> supplier) {
        return copy().addQueryParam("limit", supplier.get());
    }

    /**
     * set limit with the specified value
     * @param op builder for the value to be set
     * @return ByProjectKeyImportContainersByImportContainerKeyImportOperationsGet
     */
    public ByProjectKeyImportContainersByImportContainerKeyImportOperationsGet withLimit(
            final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("limit", op.apply(new StringBuilder()));
    }

    /**
     * add additional limit query parameter
     * @param op builder for the value to be added
     * @return ByProjectKeyImportContainersByImportContainerKeyImportOperationsGet
     */
    public ByProjectKeyImportContainersByImportContainerKeyImportOperationsGet addLimit(
            final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("limit", op.apply(new StringBuilder()));
    }

    /**
     * set limit with the specified values
     * @param limit values to be set
     * @param <TValue> value type
     * @return ByProjectKeyImportContainersByImportContainerKeyImportOperationsGet
     */
    public <TValue> ByProjectKeyImportContainersByImportContainerKeyImportOperationsGet withLimit(
            final Collection<TValue> limit) {
        return copy().withoutQueryParam("limit")
                .addQueryParams(
                    limit.stream().map(s -> new ParamEntry<>("limit", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional limit query parameters
     * @param limit values to be added
     * @param <TValue> value type
     * @return ByProjectKeyImportContainersByImportContainerKeyImportOperationsGet
     */
    public <TValue> ByProjectKeyImportContainersByImportContainerKeyImportOperationsGet addLimit(
            final Collection<TValue> limit) {
        return copy().addQueryParams(
            limit.stream().map(s -> new ParamEntry<>("limit", s.toString())).collect(Collectors.toList()));
    }

    /**
     * set offset with the specified value
     * @param offset value to be set
     * @param <TValue> value type
     * @return ByProjectKeyImportContainersByImportContainerKeyImportOperationsGet
     */
    public <TValue> ByProjectKeyImportContainersByImportContainerKeyImportOperationsGet withOffset(
            final TValue offset) {
        return copy().withQueryParam("offset", offset);
    }

    /**
     * add additional offset query parameter
     * @param offset value to be added
     * @param <TValue> value type
     * @return ByProjectKeyImportContainersByImportContainerKeyImportOperationsGet
     */
    public <TValue> ByProjectKeyImportContainersByImportContainerKeyImportOperationsGet addOffset(final TValue offset) {
        return copy().addQueryParam("offset", offset);
    }

    /**
     * set offset with the specified value
     * @param supplier supplier for the value to be set
     * @return ByProjectKeyImportContainersByImportContainerKeyImportOperationsGet
     */
    public ByProjectKeyImportContainersByImportContainerKeyImportOperationsGet withOffset(
            final Supplier<Double> supplier) {
        return copy().withQueryParam("offset", supplier.get());
    }

    /**
     * add additional offset query parameter
     * @param supplier supplier for the value to be added
     * @return ByProjectKeyImportContainersByImportContainerKeyImportOperationsGet
     */
    public ByProjectKeyImportContainersByImportContainerKeyImportOperationsGet addOffset(
            final Supplier<Double> supplier) {
        return copy().addQueryParam("offset", supplier.get());
    }

    /**
     * set offset with the specified value
     * @param op builder for the value to be set
     * @return ByProjectKeyImportContainersByImportContainerKeyImportOperationsGet
     */
    public ByProjectKeyImportContainersByImportContainerKeyImportOperationsGet withOffset(
            final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("offset", op.apply(new StringBuilder()));
    }

    /**
     * add additional offset query parameter
     * @param op builder for the value to be added
     * @return ByProjectKeyImportContainersByImportContainerKeyImportOperationsGet
     */
    public ByProjectKeyImportContainersByImportContainerKeyImportOperationsGet addOffset(
            final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("offset", op.apply(new StringBuilder()));
    }

    /**
     * set offset with the specified values
     * @param offset values to be set
     * @param <TValue> value type
     * @return ByProjectKeyImportContainersByImportContainerKeyImportOperationsGet
     */
    public <TValue> ByProjectKeyImportContainersByImportContainerKeyImportOperationsGet withOffset(
            final Collection<TValue> offset) {
        return copy().withoutQueryParam("offset")
                .addQueryParams(
                    offset.stream().map(s -> new ParamEntry<>("offset", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional offset query parameters
     * @param offset values to be added
     * @param <TValue> value type
     * @return ByProjectKeyImportContainersByImportContainerKeyImportOperationsGet
     */
    public <TValue> ByProjectKeyImportContainersByImportContainerKeyImportOperationsGet addOffset(
            final Collection<TValue> offset) {
        return copy().addQueryParams(
            offset.stream().map(s -> new ParamEntry<>("offset", s.toString())).collect(Collectors.toList()));
    }

    /**
     * set sort with the specified value
     * @param sort value to be set
     * @param <TValue> value type
     * @return ByProjectKeyImportContainersByImportContainerKeyImportOperationsGet
     */
    public <TValue> ByProjectKeyImportContainersByImportContainerKeyImportOperationsGet withSort(final TValue sort) {
        return copy().withQueryParam("sort", sort);
    }

    /**
     * add additional sort query parameter
     * @param sort value to be added
     * @param <TValue> value type
     * @return ByProjectKeyImportContainersByImportContainerKeyImportOperationsGet
     */
    public <TValue> ByProjectKeyImportContainersByImportContainerKeyImportOperationsGet addSort(final TValue sort) {
        return copy().addQueryParam("sort", sort);
    }

    /**
     * set sort with the specified value
     * @param supplier supplier for the value to be set
     * @return ByProjectKeyImportContainersByImportContainerKeyImportOperationsGet
     */
    public ByProjectKeyImportContainersByImportContainerKeyImportOperationsGet withSort(
            final Supplier<String> supplier) {
        return copy().withQueryParam("sort", supplier.get());
    }

    /**
     * add additional sort query parameter
     * @param supplier supplier for the value to be added
     * @return ByProjectKeyImportContainersByImportContainerKeyImportOperationsGet
     */
    public ByProjectKeyImportContainersByImportContainerKeyImportOperationsGet addSort(
            final Supplier<String> supplier) {
        return copy().addQueryParam("sort", supplier.get());
    }

    /**
     * set sort with the specified value
     * @param op builder for the value to be set
     * @return ByProjectKeyImportContainersByImportContainerKeyImportOperationsGet
     */
    public ByProjectKeyImportContainersByImportContainerKeyImportOperationsGet withSort(
            final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("sort", op.apply(new StringBuilder()));
    }

    /**
     * add additional sort query parameter
     * @param op builder for the value to be added
     * @return ByProjectKeyImportContainersByImportContainerKeyImportOperationsGet
     */
    public ByProjectKeyImportContainersByImportContainerKeyImportOperationsGet addSort(
            final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("sort", op.apply(new StringBuilder()));
    }

    /**
     * set sort with the specified values
     * @param sort values to be set
     * @param <TValue> value type
     * @return ByProjectKeyImportContainersByImportContainerKeyImportOperationsGet
     */
    public <TValue> ByProjectKeyImportContainersByImportContainerKeyImportOperationsGet withSort(
            final Collection<TValue> sort) {
        return copy().withoutQueryParam("sort")
                .addQueryParams(
                    sort.stream().map(s -> new ParamEntry<>("sort", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional sort query parameters
     * @param sort values to be added
     * @param <TValue> value type
     * @return ByProjectKeyImportContainersByImportContainerKeyImportOperationsGet
     */
    public <TValue> ByProjectKeyImportContainersByImportContainerKeyImportOperationsGet addSort(
            final Collection<TValue> sort) {
        return copy().addQueryParams(
            sort.stream().map(s -> new ParamEntry<>("sort", s.toString())).collect(Collectors.toList()));
    }

    /**
     * set resourceKey with the specified value
     * @param resourceKey value to be set
     * @param <TValue> value type
     * @return ByProjectKeyImportContainersByImportContainerKeyImportOperationsGet
     */
    public <TValue> ByProjectKeyImportContainersByImportContainerKeyImportOperationsGet withResourceKey(
            final TValue resourceKey) {
        return copy().withQueryParam("resourceKey", resourceKey);
    }

    /**
     * add additional resourceKey query parameter
     * @param resourceKey value to be added
     * @param <TValue> value type
     * @return ByProjectKeyImportContainersByImportContainerKeyImportOperationsGet
     */
    public <TValue> ByProjectKeyImportContainersByImportContainerKeyImportOperationsGet addResourceKey(
            final TValue resourceKey) {
        return copy().addQueryParam("resourceKey", resourceKey);
    }

    /**
     * set resourceKey with the specified value
     * @param supplier supplier for the value to be set
     * @return ByProjectKeyImportContainersByImportContainerKeyImportOperationsGet
     */
    public ByProjectKeyImportContainersByImportContainerKeyImportOperationsGet withResourceKey(
            final Supplier<String> supplier) {
        return copy().withQueryParam("resourceKey", supplier.get());
    }

    /**
     * add additional resourceKey query parameter
     * @param supplier supplier for the value to be added
     * @return ByProjectKeyImportContainersByImportContainerKeyImportOperationsGet
     */
    public ByProjectKeyImportContainersByImportContainerKeyImportOperationsGet addResourceKey(
            final Supplier<String> supplier) {
        return copy().addQueryParam("resourceKey", supplier.get());
    }

    /**
     * set resourceKey with the specified value
     * @param op builder for the value to be set
     * @return ByProjectKeyImportContainersByImportContainerKeyImportOperationsGet
     */
    public ByProjectKeyImportContainersByImportContainerKeyImportOperationsGet withResourceKey(
            final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("resourceKey", op.apply(new StringBuilder()));
    }

    /**
     * add additional resourceKey query parameter
     * @param op builder for the value to be added
     * @return ByProjectKeyImportContainersByImportContainerKeyImportOperationsGet
     */
    public ByProjectKeyImportContainersByImportContainerKeyImportOperationsGet addResourceKey(
            final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("resourceKey", op.apply(new StringBuilder()));
    }

    /**
     * set resourceKey with the specified values
     * @param resourceKey values to be set
     * @param <TValue> value type
     * @return ByProjectKeyImportContainersByImportContainerKeyImportOperationsGet
     */
    public <TValue> ByProjectKeyImportContainersByImportContainerKeyImportOperationsGet withResourceKey(
            final Collection<TValue> resourceKey) {
        return copy().withoutQueryParam("resourceKey")
                .addQueryParams(resourceKey.stream()
                        .map(s -> new ParamEntry<>("resourceKey", s.toString()))
                        .collect(Collectors.toList()));
    }

    /**
     * add additional resourceKey query parameters
     * @param resourceKey values to be added
     * @param <TValue> value type
     * @return ByProjectKeyImportContainersByImportContainerKeyImportOperationsGet
     */
    public <TValue> ByProjectKeyImportContainersByImportContainerKeyImportOperationsGet addResourceKey(
            final Collection<TValue> resourceKey) {
        return copy().addQueryParams(
            resourceKey.stream().map(s -> new ParamEntry<>("resourceKey", s.toString())).collect(Collectors.toList()));
    }

    /**
     * set state with the specified value
     * @param state value to be set
     * @param <TValue> value type
     * @return ByProjectKeyImportContainersByImportContainerKeyImportOperationsGet
     */
    public <TValue> ByProjectKeyImportContainersByImportContainerKeyImportOperationsGet withState(final TValue state) {
        return copy().withQueryParam("state", state);
    }

    /**
     * add additional state query parameter
     * @param state value to be added
     * @param <TValue> value type
     * @return ByProjectKeyImportContainersByImportContainerKeyImportOperationsGet
     */
    public <TValue> ByProjectKeyImportContainersByImportContainerKeyImportOperationsGet addState(final TValue state) {
        return copy().addQueryParam("state", state);
    }

    /**
     * set state with the specified value
     * @param supplier supplier for the value to be set
     * @return ByProjectKeyImportContainersByImportContainerKeyImportOperationsGet
     */
    public ByProjectKeyImportContainersByImportContainerKeyImportOperationsGet withState(
            final Supplier<ProcessingState> supplier) {
        return copy().withQueryParam("state", supplier.get());
    }

    /**
     * add additional state query parameter
     * @param supplier supplier for the value to be added
     * @return ByProjectKeyImportContainersByImportContainerKeyImportOperationsGet
     */
    public ByProjectKeyImportContainersByImportContainerKeyImportOperationsGet addState(
            final Supplier<ProcessingState> supplier) {
        return copy().addQueryParam("state", supplier.get());
    }

    /**
     * set state with the specified value
     * @param op builder for the value to be set
     * @return ByProjectKeyImportContainersByImportContainerKeyImportOperationsGet
     */
    public ByProjectKeyImportContainersByImportContainerKeyImportOperationsGet withState(
            final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("state", op.apply(new StringBuilder()));
    }

    /**
     * add additional state query parameter
     * @param op builder for the value to be added
     * @return ByProjectKeyImportContainersByImportContainerKeyImportOperationsGet
     */
    public ByProjectKeyImportContainersByImportContainerKeyImportOperationsGet addState(
            final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("state", op.apply(new StringBuilder()));
    }

    /**
     * set state with the specified values
     * @param state values to be set
     * @param <TValue> value type
     * @return ByProjectKeyImportContainersByImportContainerKeyImportOperationsGet
     */
    public <TValue> ByProjectKeyImportContainersByImportContainerKeyImportOperationsGet withState(
            final Collection<TValue> state) {
        return copy().withoutQueryParam("state")
                .addQueryParams(
                    state.stream().map(s -> new ParamEntry<>("state", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional state query parameters
     * @param state values to be added
     * @param <TValue> value type
     * @return ByProjectKeyImportContainersByImportContainerKeyImportOperationsGet
     */
    public <TValue> ByProjectKeyImportContainersByImportContainerKeyImportOperationsGet addState(
            final Collection<TValue> state) {
        return copy().addQueryParams(
            state.stream().map(s -> new ParamEntry<>("state", s.toString())).collect(Collectors.toList()));
    }

    /**
     * set debug with the specified value
     * @param debug value to be set
     * @param <TValue> value type
     * @return ByProjectKeyImportContainersByImportContainerKeyImportOperationsGet
     */
    public <TValue> ByProjectKeyImportContainersByImportContainerKeyImportOperationsGet withDebug(final TValue debug) {
        return copy().withQueryParam("debug", debug);
    }

    /**
     * add additional debug query parameter
     * @param debug value to be added
     * @param <TValue> value type
     * @return ByProjectKeyImportContainersByImportContainerKeyImportOperationsGet
     */
    public <TValue> ByProjectKeyImportContainersByImportContainerKeyImportOperationsGet addDebug(final TValue debug) {
        return copy().addQueryParam("debug", debug);
    }

    /**
     * set debug with the specified value
     * @param supplier supplier for the value to be set
     * @return ByProjectKeyImportContainersByImportContainerKeyImportOperationsGet
     */
    public ByProjectKeyImportContainersByImportContainerKeyImportOperationsGet withDebug(
            final Supplier<Boolean> supplier) {
        return copy().withQueryParam("debug", supplier.get());
    }

    /**
     * add additional debug query parameter
     * @param supplier supplier for the value to be added
     * @return ByProjectKeyImportContainersByImportContainerKeyImportOperationsGet
     */
    public ByProjectKeyImportContainersByImportContainerKeyImportOperationsGet addDebug(
            final Supplier<Boolean> supplier) {
        return copy().addQueryParam("debug", supplier.get());
    }

    /**
     * set debug with the specified value
     * @param op builder for the value to be set
     * @return ByProjectKeyImportContainersByImportContainerKeyImportOperationsGet
     */
    public ByProjectKeyImportContainersByImportContainerKeyImportOperationsGet withDebug(
            final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("debug", op.apply(new StringBuilder()));
    }

    /**
     * add additional debug query parameter
     * @param op builder for the value to be added
     * @return ByProjectKeyImportContainersByImportContainerKeyImportOperationsGet
     */
    public ByProjectKeyImportContainersByImportContainerKeyImportOperationsGet addDebug(
            final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("debug", op.apply(new StringBuilder()));
    }

    /**
     * set debug with the specified values
     * @param debug values to be set
     * @param <TValue> value type
     * @return ByProjectKeyImportContainersByImportContainerKeyImportOperationsGet
     */
    public <TValue> ByProjectKeyImportContainersByImportContainerKeyImportOperationsGet withDebug(
            final Collection<TValue> debug) {
        return copy().withoutQueryParam("debug")
                .addQueryParams(
                    debug.stream().map(s -> new ParamEntry<>("debug", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional debug query parameters
     * @param debug values to be added
     * @param <TValue> value type
     * @return ByProjectKeyImportContainersByImportContainerKeyImportOperationsGet
     */
    public <TValue> ByProjectKeyImportContainersByImportContainerKeyImportOperationsGet addDebug(
            final Collection<TValue> debug) {
        return copy().addQueryParams(
            debug.stream().map(s -> new ParamEntry<>("debug", s.toString())).collect(Collectors.toList()));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ByProjectKeyImportContainersByImportContainerKeyImportOperationsGet that = (ByProjectKeyImportContainersByImportContainerKeyImportOperationsGet) o;

        return new EqualsBuilder().append(projectKey, that.projectKey)
                .append(importContainerKey, that.importContainerKey)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(projectKey).append(importContainerKey).toHashCode();
    }

    @Override
    protected ByProjectKeyImportContainersByImportContainerKeyImportOperationsGet copy() {
        return new ByProjectKeyImportContainersByImportContainerKeyImportOperationsGet(this);
    }
}
