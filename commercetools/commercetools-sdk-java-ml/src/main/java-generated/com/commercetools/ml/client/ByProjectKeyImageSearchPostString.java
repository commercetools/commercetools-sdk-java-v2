package com.commercetools.ml.client;

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
 *  <p>Accepts an image file and returns similar products from product catalogue.</p>
 *
 * <hr>
 * <div class=code-example>
 * <pre><code class='java'>{@code
 *   CompletableFuture<ApiHttpResponse<com.commercetools.ml.models.image_search.ImageSearchResponse>> result = apiRoot
 *            .withProjectKey("{projectKey}")
 *            .imageSearch()
 *            .post("")
 *            .execute()
 * }</code></pre>
 * </div>
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class ByProjectKeyImageSearchPostString extends StringBodyApiMethod<ByProjectKeyImageSearchPostString, com.commercetools.ml.models.image_search.ImageSearchResponse> {

    
    private String projectKey;
    
    private String file;

    public ByProjectKeyImageSearchPostString(final ApiHttpClient apiHttpClient, String projectKey, String file) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.file = file;
    }

    public ByProjectKeyImageSearchPostString(ByProjectKeyImageSearchPostString t) {
        super(t);
        this.projectKey = t.projectKey;
        this.file = t.file;
    }

    @Override
    protected ApiHttpRequest buildHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("%s/image-search", this.projectKey);
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(), file.getBytes(StandardCharsets.UTF_8));
    
    }

    @Override
    public ApiHttpResponse<com.commercetools.ml.models.image_search.ImageSearchResponse> executeBlocking(final ApiHttpClient client, final Duration timeout) {
        return executeBlocking(client, timeout, com.commercetools.ml.models.image_search.ImageSearchResponse.class);
    }

    @Override
    public CompletableFuture<ApiHttpResponse<com.commercetools.ml.models.image_search.ImageSearchResponse>> execute(final ApiHttpClient client) {
        return execute(client, com.commercetools.ml.models.image_search.ImageSearchResponse.class);
    }

    public String getProjectKey() {return this.projectKey;}

    public List<String> getLimit() {
        return this.getQueryParam("limit");
    }
    
    public List<String> getOffset() {
        return this.getQueryParam("offset");
    }

    public void setProjectKey(final String projectKey) { this.projectKey = projectKey; }

    /**
     * set limit with the specified value
     * @param <TValue> value type
     * @param limit value to be set
     * @return ByProjectKeyImageSearchPostString
     */
    public <TValue> ByProjectKeyImageSearchPostString withLimit(final TValue limit) {
        return copy().withQueryParam("limit", limit);
    }
    
    /**
     * add additional limit query parameter
     * @param <TValue> value type
     * @param limit value to be added
     * @return ByProjectKeyImageSearchPostString
     */
    public <TValue> ByProjectKeyImageSearchPostString addLimit(final TValue limit) {
        return copy().addQueryParam("limit", limit);
    }
    
    /**
     * set limit with the specified value
     * @param supplier supplier for the value to be set
     * @return ByProjectKeyImageSearchPostString
     */
    public ByProjectKeyImageSearchPostString withLimit(final Supplier<Integer> supplier) {
        return copy().withQueryParam("limit", supplier.get());
    }
    
    /**
     * add additional limit query parameter
     * @param supplier supplier for the value to be added
     * @return ByProjectKeyImageSearchPostString
     */
    public ByProjectKeyImageSearchPostString addLimit(final Supplier<Integer> supplier) {
        return copy().addQueryParam("limit", supplier.get());
    }
    
    /**
     * set limit with the specified value
     * @param op builder for the value to be set
     * @return ByProjectKeyImageSearchPostString
     */
    public ByProjectKeyImageSearchPostString withLimit(final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("limit", op.apply(new StringBuilder()));
    }
    
    /**
     * add additional limit query parameter
     * @param op builder for the value to be added
     * @return ByProjectKeyImageSearchPostString
     */
    public ByProjectKeyImageSearchPostString addLimit(final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("limit", op.apply(new StringBuilder()));
    }
    
    /**
     * set limit with the specified values
     * @param <TValue> value type
     * @param limit values to be set
     * @return ByProjectKeyImageSearchPostString
     */
    public <TValue> ByProjectKeyImageSearchPostString withLimit(final Collection<TValue> limit) {
        return copy().withoutQueryParam("limit").addQueryParams(limit.stream().map(s -> new ParamEntry<>("limit", s.toString())).collect(Collectors.toList())); 
    }
    
    /**
     * add additional limit query parameters
     * @param <TValue> value type
     * @param limit values to be added
     * @return ByProjectKeyImageSearchPostString
     */
    public <TValue> ByProjectKeyImageSearchPostString addLimit(final Collection<TValue> limit) {
        return copy().addQueryParams(limit.stream().map(s -> new ParamEntry<>("limit", s.toString())).collect(Collectors.toList())); 
    }
    
    /**
     * set offset with the specified value
     * @param <TValue> value type
     * @param offset value to be set
     * @return ByProjectKeyImageSearchPostString
     */
    public <TValue> ByProjectKeyImageSearchPostString withOffset(final TValue offset) {
        return copy().withQueryParam("offset", offset);
    }
    
    /**
     * add additional offset query parameter
     * @param <TValue> value type
     * @param offset value to be added
     * @return ByProjectKeyImageSearchPostString
     */
    public <TValue> ByProjectKeyImageSearchPostString addOffset(final TValue offset) {
        return copy().addQueryParam("offset", offset);
    }
    
    /**
     * set offset with the specified value
     * @param supplier supplier for the value to be set
     * @return ByProjectKeyImageSearchPostString
     */
    public ByProjectKeyImageSearchPostString withOffset(final Supplier<Integer> supplier) {
        return copy().withQueryParam("offset", supplier.get());
    }
    
    /**
     * add additional offset query parameter
     * @param supplier supplier for the value to be added
     * @return ByProjectKeyImageSearchPostString
     */
    public ByProjectKeyImageSearchPostString addOffset(final Supplier<Integer> supplier) {
        return copy().addQueryParam("offset", supplier.get());
    }
    
    /**
     * set offset with the specified value
     * @param op builder for the value to be set
     * @return ByProjectKeyImageSearchPostString
     */
    public ByProjectKeyImageSearchPostString withOffset(final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("offset", op.apply(new StringBuilder()));
    }
    
    /**
     * add additional offset query parameter
     * @param op builder for the value to be added
     * @return ByProjectKeyImageSearchPostString
     */
    public ByProjectKeyImageSearchPostString addOffset(final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("offset", op.apply(new StringBuilder()));
    }
    
    /**
     * set offset with the specified values
     * @param <TValue> value type
     * @param offset values to be set
     * @return ByProjectKeyImageSearchPostString
     */
    public <TValue> ByProjectKeyImageSearchPostString withOffset(final Collection<TValue> offset) {
        return copy().withoutQueryParam("offset").addQueryParams(offset.stream().map(s -> new ParamEntry<>("offset", s.toString())).collect(Collectors.toList())); 
    }
    
    /**
     * add additional offset query parameters
     * @param <TValue> value type
     * @param offset values to be added
     * @return ByProjectKeyImageSearchPostString
     */
    public <TValue> ByProjectKeyImageSearchPostString addOffset(final Collection<TValue> offset) {
        return copy().addQueryParams(offset.stream().map(s -> new ParamEntry<>("offset", s.toString())).collect(Collectors.toList())); 
    }

    
    public String getBody() {
        return file;
    }
    
    public ByProjectKeyImageSearchPostString withBody(String file) {
        ByProjectKeyImageSearchPostString t = copy();
        t.file = file;
        return t;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        ByProjectKeyImageSearchPostString that = (ByProjectKeyImageSearchPostString) o;
    
        return new EqualsBuilder()
                .append(projectKey, that.projectKey)
                .append(file, that.file)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(projectKey)
            .append(file)
            .toHashCode();
    }

    @Override
    protected ByProjectKeyImageSearchPostString copy() {
        return new ByProjectKeyImageSearchPostString(this);
    }
}
