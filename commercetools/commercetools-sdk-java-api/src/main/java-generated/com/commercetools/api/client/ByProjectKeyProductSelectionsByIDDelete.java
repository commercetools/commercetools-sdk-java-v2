package com.commercetools.api.client;

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
 *  <p>Deletion will only succeed if the Product Selection is not assigned to any Store.</p>
 *
 * <hr>
 * <div class=code-example>
 * <pre><code class='java'>{@code
 *   CompletableFuture<ApiHttpResponse<com.commercetools.api.models.product_selection.ProductSelection>> result = apiRoot
 *            .withProjectKey("{projectKey}")
 *            .productSelections()
 *            .withId("{ID}")
 *            .delete()
 *            .withVersion(version)
 *            .execute()
 * }</code></pre>
 * </div>
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class ByProjectKeyProductSelectionsByIDDelete extends ApiMethod<ByProjectKeyProductSelectionsByIDDelete, com.commercetools.api.models.product_selection.ProductSelection> implements com.commercetools.api.client.ApiDeleteMethod<ByProjectKeyProductSelectionsByIDDelete, com.commercetools.api.models.product_selection.ProductSelection>, com.commercetools.api.client.VersionedTrait<ByProjectKeyProductSelectionsByIDDelete>, com.commercetools.api.client.ConflictingTrait<ByProjectKeyProductSelectionsByIDDelete>, com.commercetools.api.client.ExpandableTrait<ByProjectKeyProductSelectionsByIDDelete>, com.commercetools.api.client.ErrorableTrait<ByProjectKeyProductSelectionsByIDDelete>, com.commercetools.api.client.Deprecatable200Trait<ByProjectKeyProductSelectionsByIDDelete> {

    
    private String projectKey;
    private String ID;
    

    public ByProjectKeyProductSelectionsByIDDelete(final ApiHttpClient apiHttpClient, String projectKey, String ID) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.ID = ID;
    }

    public ByProjectKeyProductSelectionsByIDDelete(ByProjectKeyProductSelectionsByIDDelete t) {
        super(t);
        this.projectKey = t.projectKey;
        this.ID = t.ID;
    }

    @Override
    protected ApiHttpRequest buildHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("%s/product-selections/%s", this.projectKey, this.ID);
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        return new ApiHttpRequest(ApiHttpMethod.DELETE, URI.create(httpRequestPath), getHeaders(), null);
    }

    @Override
    public ApiHttpResponse<com.commercetools.api.models.product_selection.ProductSelection> executeBlocking(final ApiHttpClient client, final Duration timeout) {
        return executeBlocking(client, timeout, com.commercetools.api.models.product_selection.ProductSelection.class);
    }

    @Override
    public CompletableFuture<ApiHttpResponse<com.commercetools.api.models.product_selection.ProductSelection>> execute(final ApiHttpClient client) {
        return execute(client, com.commercetools.api.models.product_selection.ProductSelection.class);
    }

    public String getProjectKey() {return this.projectKey;}
    public String getID() {return this.ID;}

    public List<String> getVersion() {
        return this.getQueryParam("version");
    }
    
    public List<String> getExpand() {
        return this.getQueryParam("expand");
    }

    public void setProjectKey(final String projectKey) { this.projectKey = projectKey; }
    
    public void setID(final String ID) { this.ID = ID; }

    /**
     * set version with the specified value
     * @param version value to be set
     * @param <TValue> value type
     * @return ByProjectKeyProductSelectionsByIDDelete
     */
    public <TValue> ByProjectKeyProductSelectionsByIDDelete withVersion(final TValue version) {
        return copy().withQueryParam("version", version);
    }
    
    /**
     * add additional version query parameter
     * @param version value to be added
     * @param <TValue> value type
     * @return ByProjectKeyProductSelectionsByIDDelete
     */
    public <TValue> ByProjectKeyProductSelectionsByIDDelete addVersion(final TValue version) {
        return copy().addQueryParam("version", version);
    }
    
    /**
     * set version with the specified value
     * @param supplier supplier for the value to be set
     * @return ByProjectKeyProductSelectionsByIDDelete
     */
    public ByProjectKeyProductSelectionsByIDDelete withVersion(final Supplier<Long> supplier) {
        return copy().withQueryParam("version", supplier.get());
    }
    
    /**
     * add additional version query parameter
     * @param supplier supplier for the value to be added
     * @return ByProjectKeyProductSelectionsByIDDelete
     */
    public ByProjectKeyProductSelectionsByIDDelete addVersion(final Supplier<Long> supplier) {
        return copy().addQueryParam("version", supplier.get());
    }
    
    /**
     * set version with the specified value
     * @param op builder for the value to be set
     * @return ByProjectKeyProductSelectionsByIDDelete
     */
    public ByProjectKeyProductSelectionsByIDDelete withVersion(final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("version", op.apply(new StringBuilder()));
    }
    
    /**
     * add additional version query parameter
     * @param op builder for the value to be added
     * @return ByProjectKeyProductSelectionsByIDDelete
     */
    public ByProjectKeyProductSelectionsByIDDelete addVersion(final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("version", op.apply(new StringBuilder()));
    }
    
    /**
     * set version with the specified values
     * @param version values to be set
     * @param <TValue> value type
     * @return ByProjectKeyProductSelectionsByIDDelete
     */
    public <TValue> ByProjectKeyProductSelectionsByIDDelete withVersion(final Collection<TValue> version) {
        return copy().withoutQueryParam("version").addQueryParams(version.stream().map(s -> new ParamEntry<>("version", s.toString())).collect(Collectors.toList())); 
    }
    
    /**
     * add additional version query parameters
     * @param version values to be added
     * @param <TValue> value type
     * @return ByProjectKeyProductSelectionsByIDDelete
     */
    public <TValue> ByProjectKeyProductSelectionsByIDDelete addVersion(final Collection<TValue> version) {
        return copy().addQueryParams(version.stream().map(s -> new ParamEntry<>("version", s.toString())).collect(Collectors.toList())); 
    }
    
    /**
     * set expand with the specified value
     * @param expand value to be set
     * @param <TValue> value type
     * @return ByProjectKeyProductSelectionsByIDDelete
     */
    public <TValue> ByProjectKeyProductSelectionsByIDDelete withExpand(final TValue expand) {
        return copy().withQueryParam("expand", expand);
    }
    
    /**
     * add additional expand query parameter
     * @param expand value to be added
     * @param <TValue> value type
     * @return ByProjectKeyProductSelectionsByIDDelete
     */
    public <TValue> ByProjectKeyProductSelectionsByIDDelete addExpand(final TValue expand) {
        return copy().addQueryParam("expand", expand);
    }
    
    /**
     * set expand with the specified value
     * @param supplier supplier for the value to be set
     * @return ByProjectKeyProductSelectionsByIDDelete
     */
    public ByProjectKeyProductSelectionsByIDDelete withExpand(final Supplier<String> supplier) {
        return copy().withQueryParam("expand", supplier.get());
    }
    
    /**
     * add additional expand query parameter
     * @param supplier supplier for the value to be added
     * @return ByProjectKeyProductSelectionsByIDDelete
     */
    public ByProjectKeyProductSelectionsByIDDelete addExpand(final Supplier<String> supplier) {
        return copy().addQueryParam("expand", supplier.get());
    }
    
    /**
     * set expand with the specified value
     * @param op builder for the value to be set
     * @return ByProjectKeyProductSelectionsByIDDelete
     */
    public ByProjectKeyProductSelectionsByIDDelete withExpand(final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("expand", op.apply(new StringBuilder()));
    }
    
    /**
     * add additional expand query parameter
     * @param op builder for the value to be added
     * @return ByProjectKeyProductSelectionsByIDDelete
     */
    public ByProjectKeyProductSelectionsByIDDelete addExpand(final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("expand", op.apply(new StringBuilder()));
    }
    
    /**
     * set expand with the specified values
     * @param expand values to be set
     * @param <TValue> value type
     * @return ByProjectKeyProductSelectionsByIDDelete
     */
    public <TValue> ByProjectKeyProductSelectionsByIDDelete withExpand(final Collection<TValue> expand) {
        return copy().withoutQueryParam("expand").addQueryParams(expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList())); 
    }
    
    /**
     * add additional expand query parameters
     * @param expand values to be added
     * @param <TValue> value type
     * @return ByProjectKeyProductSelectionsByIDDelete
     */
    public <TValue> ByProjectKeyProductSelectionsByIDDelete addExpand(final Collection<TValue> expand) {
        return copy().addQueryParams(expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList())); 
    }

    

    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        ByProjectKeyProductSelectionsByIDDelete that = (ByProjectKeyProductSelectionsByIDDelete) o;
    
        return new EqualsBuilder()
                .append(projectKey, that.projectKey)
                .append(ID, that.ID)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(projectKey)
            .append(ID)
            .toHashCode();
    }

    @Override
    protected ByProjectKeyProductSelectionsByIDDelete copy() {
        return new ByProjectKeyProductSelectionsByIDDelete(this);
    }
}
