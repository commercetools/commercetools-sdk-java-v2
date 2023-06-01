package com.commercetools.importapi.client;

import io.vrap.rmf.base.client.utils.Utils;

import java.io.InputStream;
import java.io.IOException;

import java.net.URI;
import java.net.URLConnection;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.concurrent.CompletableFuture;
import io.vrap.rmf.base.client.utils.Generated;

import javax.annotation.Nullable;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import io.vrap.rmf.base.client.*;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import static io.vrap.rmf.base.client.utils.ClientUtils.blockingWait;

/**
 *  <p>Retrieves all import containers of a given project key.</p>
 *
 * <hr>
 * <div class=code-example>
 * <pre><code class='java'>{@code
 *   CompletableFuture<ApiHttpResponse<com.commercetools.importapi.models.importcontainers.ImportContainerPagedResponse>> result = apiRoot
 *            .withProjectKeyValue("{projectKey}")
 *            .importContainers()
 *            .get()
 *            .execute()
 * }</code></pre>
 * </div>
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class ByProjectKeyImportContainersGet extends ApiMethod<ByProjectKeyImportContainersGet, com.commercetools.importapi.models.importcontainers.ImportContainerPagedResponse> implements com.commercetools.importapi.client.Secured_by_view_import_containersTrait<ByProjectKeyImportContainersGet> {

    
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
        String httpRequestPath = String.format("%s/import-containers", this.projectKey);
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        return new ApiHttpRequest(ApiHttpMethod.GET, URI.create(httpRequestPath), getHeaders(), null);
    }

    @Override
    public ApiHttpResponse<com.commercetools.importapi.models.importcontainers.ImportContainerPagedResponse> executeBlocking(final ApiHttpClient client, final Duration timeout) {
        return executeBlocking(client, timeout, com.commercetools.importapi.models.importcontainers.ImportContainerPagedResponse.class);
    }

    @Override
    public CompletableFuture<ApiHttpResponse<com.commercetools.importapi.models.importcontainers.ImportContainerPagedResponse>> execute(final ApiHttpClient client) {
        return execute(client, com.commercetools.importapi.models.importcontainers.ImportContainerPagedResponse.class);
    }

    public String getProjectKey() {return this.projectKey;}

    public List<String> getLimit() {
        return this.getQueryParam("limit");
    }
    
    public List<String> getOffset() {
        return this.getQueryParam("offset");
    }
    
    public List<String> getSort() {
        return this.getQueryParam("sort");
    }

    public void setProjectKey(final String projectKey) { this.projectKey = projectKey; }

    /**
     * set limit with the specified value
     * @param limit value to be set
     * @param <TValue> value type
     * @return ByProjectKeyImportContainersGet
     */
    public <TValue> ByProjectKeyImportContainersGet withLimit(final TValue limit) {
        return copy().withQueryParam("limit", limit);
    }
    
    /**
     * add additional limit query parameter
     * @param limit value to be added
     * @param <TValue> value type
     * @return ByProjectKeyImportContainersGet
     */
    public <TValue> ByProjectKeyImportContainersGet addLimit(final TValue limit) {
        return copy().addQueryParam("limit", limit);
    }
    
    /**
     * set limit with the specified value
     * @param supplier supplier for the value to be set
     * @return ByProjectKeyImportContainersGet
     */
    public ByProjectKeyImportContainersGet withLimit(final Supplier<Double> supplier) {
        return copy().withQueryParam("limit", supplier.get());
    }
    
    /**
     * add additional limit query parameter
     * @param supplier supplier for the value to be added
     * @return ByProjectKeyImportContainersGet
     */
    public ByProjectKeyImportContainersGet addLimit(final Supplier<Double> supplier) {
        return copy().addQueryParam("limit", supplier.get());
    }
    
    /**
     * set limit with the specified value
     * @param op builder for the value to be set
     * @return ByProjectKeyImportContainersGet
     */
    public ByProjectKeyImportContainersGet withLimit(final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("limit", op.apply(new StringBuilder()));
    }
    
    /**
     * add additional limit query parameter
     * @param op builder for the value to be added
     * @return ByProjectKeyImportContainersGet
     */
    public ByProjectKeyImportContainersGet addLimit(final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("limit", op.apply(new StringBuilder()));
    }
    
    /**
     * set limit with the specified values
     * @param limit values to be set
     * @param <TValue> value type
     * @return ByProjectKeyImportContainersGet
     */
    public <TValue> ByProjectKeyImportContainersGet withLimit(final Collection<TValue> limit) {
        return copy().withoutQueryParam("limit").addQueryParams(limit.stream().map(s -> new ParamEntry<>("limit", s.toString())).collect(Collectors.toList())); 
    }
    
    /**
     * add additional limit query parameters
     * @param limit values to be added
     * @param <TValue> value type
     * @return ByProjectKeyImportContainersGet
     */
    public <TValue> ByProjectKeyImportContainersGet addLimit(final Collection<TValue> limit) {
        return copy().addQueryParams(limit.stream().map(s -> new ParamEntry<>("limit", s.toString())).collect(Collectors.toList())); 
    }
    
    /**
     * set offset with the specified value
     * @param offset value to be set
     * @param <TValue> value type
     * @return ByProjectKeyImportContainersGet
     */
    public <TValue> ByProjectKeyImportContainersGet withOffset(final TValue offset) {
        return copy().withQueryParam("offset", offset);
    }
    
    /**
     * add additional offset query parameter
     * @param offset value to be added
     * @param <TValue> value type
     * @return ByProjectKeyImportContainersGet
     */
    public <TValue> ByProjectKeyImportContainersGet addOffset(final TValue offset) {
        return copy().addQueryParam("offset", offset);
    }
    
    /**
     * set offset with the specified value
     * @param supplier supplier for the value to be set
     * @return ByProjectKeyImportContainersGet
     */
    public ByProjectKeyImportContainersGet withOffset(final Supplier<Double> supplier) {
        return copy().withQueryParam("offset", supplier.get());
    }
    
    /**
     * add additional offset query parameter
     * @param supplier supplier for the value to be added
     * @return ByProjectKeyImportContainersGet
     */
    public ByProjectKeyImportContainersGet addOffset(final Supplier<Double> supplier) {
        return copy().addQueryParam("offset", supplier.get());
    }
    
    /**
     * set offset with the specified value
     * @param op builder for the value to be set
     * @return ByProjectKeyImportContainersGet
     */
    public ByProjectKeyImportContainersGet withOffset(final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("offset", op.apply(new StringBuilder()));
    }
    
    /**
     * add additional offset query parameter
     * @param op builder for the value to be added
     * @return ByProjectKeyImportContainersGet
     */
    public ByProjectKeyImportContainersGet addOffset(final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("offset", op.apply(new StringBuilder()));
    }
    
    /**
     * set offset with the specified values
     * @param offset values to be set
     * @param <TValue> value type
     * @return ByProjectKeyImportContainersGet
     */
    public <TValue> ByProjectKeyImportContainersGet withOffset(final Collection<TValue> offset) {
        return copy().withoutQueryParam("offset").addQueryParams(offset.stream().map(s -> new ParamEntry<>("offset", s.toString())).collect(Collectors.toList())); 
    }
    
    /**
     * add additional offset query parameters
     * @param offset values to be added
     * @param <TValue> value type
     * @return ByProjectKeyImportContainersGet
     */
    public <TValue> ByProjectKeyImportContainersGet addOffset(final Collection<TValue> offset) {
        return copy().addQueryParams(offset.stream().map(s -> new ParamEntry<>("offset", s.toString())).collect(Collectors.toList())); 
    }
    
    /**
     * set sort with the specified value
     * @param sort value to be set
     * @param <TValue> value type
     * @return ByProjectKeyImportContainersGet
     */
    public <TValue> ByProjectKeyImportContainersGet withSort(final TValue sort) {
        return copy().withQueryParam("sort", sort);
    }
    
    /**
     * add additional sort query parameter
     * @param sort value to be added
     * @param <TValue> value type
     * @return ByProjectKeyImportContainersGet
     */
    public <TValue> ByProjectKeyImportContainersGet addSort(final TValue sort) {
        return copy().addQueryParam("sort", sort);
    }
    
    /**
     * set sort with the specified value
     * @param supplier supplier for the value to be set
     * @return ByProjectKeyImportContainersGet
     */
    public ByProjectKeyImportContainersGet withSort(final Supplier<String> supplier) {
        return copy().withQueryParam("sort", supplier.get());
    }
    
    /**
     * add additional sort query parameter
     * @param supplier supplier for the value to be added
     * @return ByProjectKeyImportContainersGet
     */
    public ByProjectKeyImportContainersGet addSort(final Supplier<String> supplier) {
        return copy().addQueryParam("sort", supplier.get());
    }
    
    /**
     * set sort with the specified value
     * @param op builder for the value to be set
     * @return ByProjectKeyImportContainersGet
     */
    public ByProjectKeyImportContainersGet withSort(final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("sort", op.apply(new StringBuilder()));
    }
    
    /**
     * add additional sort query parameter
     * @param op builder for the value to be added
     * @return ByProjectKeyImportContainersGet
     */
    public ByProjectKeyImportContainersGet addSort(final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("sort", op.apply(new StringBuilder()));
    }
    
    /**
     * set sort with the specified values
     * @param sort values to be set
     * @param <TValue> value type
     * @return ByProjectKeyImportContainersGet
     */
    public <TValue> ByProjectKeyImportContainersGet withSort(final Collection<TValue> sort) {
        return copy().withoutQueryParam("sort").addQueryParams(sort.stream().map(s -> new ParamEntry<>("sort", s.toString())).collect(Collectors.toList())); 
    }
    
    /**
     * add additional sort query parameters
     * @param sort values to be added
     * @param <TValue> value type
     * @return ByProjectKeyImportContainersGet
     */
    public <TValue> ByProjectKeyImportContainersGet addSort(final Collection<TValue> sort) {
        return copy().addQueryParams(sort.stream().map(s -> new ParamEntry<>("sort", s.toString())).collect(Collectors.toList())); 
    }

    

    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        ByProjectKeyImportContainersGet that = (ByProjectKeyImportContainersGet) o;
    
        return new EqualsBuilder()
                .append(projectKey, that.projectKey)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(projectKey)
            .toHashCode();
    }

    @Override
    protected ByProjectKeyImportContainersGet copy() {
        return new ByProjectKeyImportContainersGet(this);
    }
}
