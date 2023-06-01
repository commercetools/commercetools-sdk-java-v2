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
 *  <p>Deleting a Customer produces the CustomerDeleted Message.</p>
 *  <p>If the Customer exists in the Project but the <code>stores</code> field references a different Store, this method returns a ResourceNotFound error.</p>
 *
 * <hr>
 * <div class=code-example>
 * <pre><code class='java'>{@code
 *   CompletableFuture<ApiHttpResponse<com.commercetools.api.models.customer.Customer>> result = apiRoot
 *            .withProjectKey("{projectKey}")
 *            .inStoreKeyWithStoreKeyValue("{storeKey}")
 *            .customers()
 *            .withKey("{key}")
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
public class ByProjectKeyInStoreKeyByStoreKeyCustomersKeyByKeyDelete extends ApiMethod<ByProjectKeyInStoreKeyByStoreKeyCustomersKeyByKeyDelete, com.commercetools.api.models.customer.Customer> implements com.commercetools.api.client.DataerasureTrait<ByProjectKeyInStoreKeyByStoreKeyCustomersKeyByKeyDelete>, com.commercetools.api.client.VersionedTrait<ByProjectKeyInStoreKeyByStoreKeyCustomersKeyByKeyDelete>, com.commercetools.api.client.ConflictingTrait<ByProjectKeyInStoreKeyByStoreKeyCustomersKeyByKeyDelete>, com.commercetools.api.client.ExpandableTrait<ByProjectKeyInStoreKeyByStoreKeyCustomersKeyByKeyDelete>, com.commercetools.api.client.ErrorableTrait<ByProjectKeyInStoreKeyByStoreKeyCustomersKeyByKeyDelete>, com.commercetools.api.client.Deprecatable200Trait<ByProjectKeyInStoreKeyByStoreKeyCustomersKeyByKeyDelete> {

    
    private String projectKey;
    private String storeKey;
    private String key;
    

    public ByProjectKeyInStoreKeyByStoreKeyCustomersKeyByKeyDelete(final ApiHttpClient apiHttpClient, String projectKey, String storeKey, String key) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.storeKey = storeKey;
        this.key = key;
    }

    public ByProjectKeyInStoreKeyByStoreKeyCustomersKeyByKeyDelete(ByProjectKeyInStoreKeyByStoreKeyCustomersKeyByKeyDelete t) {
        super(t);
        this.projectKey = t.projectKey;
        this.storeKey = t.storeKey;
        this.key = t.key;
    }

    @Override
    protected ApiHttpRequest buildHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("%s/in-store/key=%s/customers/key=%s", this.projectKey, this.storeKey, this.key);
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        return new ApiHttpRequest(ApiHttpMethod.DELETE, URI.create(httpRequestPath), getHeaders(), null);
    }

    @Override
    public ApiHttpResponse<com.commercetools.api.models.customer.Customer> executeBlocking(final ApiHttpClient client, final Duration timeout) {
        return executeBlocking(client, timeout, com.commercetools.api.models.customer.Customer.class);
    }

    @Override
    public CompletableFuture<ApiHttpResponse<com.commercetools.api.models.customer.Customer>> execute(final ApiHttpClient client) {
        return execute(client, com.commercetools.api.models.customer.Customer.class);
    }

    public String getProjectKey() {return this.projectKey;}
    public String getStoreKey() {return this.storeKey;}
    public String getKey() {return this.key;}

    public List<String> getDataErasure() {
        return this.getQueryParam("dataErasure");
    }
    
    public List<String> getVersion() {
        return this.getQueryParam("version");
    }
    
    public List<String> getExpand() {
        return this.getQueryParam("expand");
    }

    public void setProjectKey(final String projectKey) { this.projectKey = projectKey; }
    
    public void setStoreKey(final String storeKey) { this.storeKey = storeKey; }
    
    public void setKey(final String key) { this.key = key; }

    /**
     * set dataErasure with the specified value
     * @param dataErasure value to be set
     * @param <TValue> value type
     * @return ByProjectKeyInStoreKeyByStoreKeyCustomersKeyByKeyDelete
     */
    public <TValue> ByProjectKeyInStoreKeyByStoreKeyCustomersKeyByKeyDelete withDataErasure(final TValue dataErasure) {
        return copy().withQueryParam("dataErasure", dataErasure);
    }
    
    /**
     * add additional dataErasure query parameter
     * @param dataErasure value to be added
     * @param <TValue> value type
     * @return ByProjectKeyInStoreKeyByStoreKeyCustomersKeyByKeyDelete
     */
    public <TValue> ByProjectKeyInStoreKeyByStoreKeyCustomersKeyByKeyDelete addDataErasure(final TValue dataErasure) {
        return copy().addQueryParam("dataErasure", dataErasure);
    }
    
    /**
     * set dataErasure with the specified value
     * @param supplier supplier for the value to be set
     * @return ByProjectKeyInStoreKeyByStoreKeyCustomersKeyByKeyDelete
     */
    public ByProjectKeyInStoreKeyByStoreKeyCustomersKeyByKeyDelete withDataErasure(final Supplier<Boolean> supplier) {
        return copy().withQueryParam("dataErasure", supplier.get());
    }
    
    /**
     * add additional dataErasure query parameter
     * @param supplier supplier for the value to be added
     * @return ByProjectKeyInStoreKeyByStoreKeyCustomersKeyByKeyDelete
     */
    public ByProjectKeyInStoreKeyByStoreKeyCustomersKeyByKeyDelete addDataErasure(final Supplier<Boolean> supplier) {
        return copy().addQueryParam("dataErasure", supplier.get());
    }
    
    /**
     * set dataErasure with the specified value
     * @param op builder for the value to be set
     * @return ByProjectKeyInStoreKeyByStoreKeyCustomersKeyByKeyDelete
     */
    public ByProjectKeyInStoreKeyByStoreKeyCustomersKeyByKeyDelete withDataErasure(final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("dataErasure", op.apply(new StringBuilder()));
    }
    
    /**
     * add additional dataErasure query parameter
     * @param op builder for the value to be added
     * @return ByProjectKeyInStoreKeyByStoreKeyCustomersKeyByKeyDelete
     */
    public ByProjectKeyInStoreKeyByStoreKeyCustomersKeyByKeyDelete addDataErasure(final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("dataErasure", op.apply(new StringBuilder()));
    }
    
    /**
     * set dataErasure with the specified values
     * @param dataErasure values to be set
     * @param <TValue> value type
     * @return ByProjectKeyInStoreKeyByStoreKeyCustomersKeyByKeyDelete
     */
    public <TValue> ByProjectKeyInStoreKeyByStoreKeyCustomersKeyByKeyDelete withDataErasure(final Collection<TValue> dataErasure) {
        return copy().withoutQueryParam("dataErasure").addQueryParams(dataErasure.stream().map(s -> new ParamEntry<>("dataErasure", s.toString())).collect(Collectors.toList())); 
    }
    
    /**
     * add additional dataErasure query parameters
     * @param dataErasure values to be added
     * @param <TValue> value type
     * @return ByProjectKeyInStoreKeyByStoreKeyCustomersKeyByKeyDelete
     */
    public <TValue> ByProjectKeyInStoreKeyByStoreKeyCustomersKeyByKeyDelete addDataErasure(final Collection<TValue> dataErasure) {
        return copy().addQueryParams(dataErasure.stream().map(s -> new ParamEntry<>("dataErasure", s.toString())).collect(Collectors.toList())); 
    }
    
    /**
     * set version with the specified value
     * @param version value to be set
     * @param <TValue> value type
     * @return ByProjectKeyInStoreKeyByStoreKeyCustomersKeyByKeyDelete
     */
    public <TValue> ByProjectKeyInStoreKeyByStoreKeyCustomersKeyByKeyDelete withVersion(final TValue version) {
        return copy().withQueryParam("version", version);
    }
    
    /**
     * add additional version query parameter
     * @param version value to be added
     * @param <TValue> value type
     * @return ByProjectKeyInStoreKeyByStoreKeyCustomersKeyByKeyDelete
     */
    public <TValue> ByProjectKeyInStoreKeyByStoreKeyCustomersKeyByKeyDelete addVersion(final TValue version) {
        return copy().addQueryParam("version", version);
    }
    
    /**
     * set version with the specified value
     * @param supplier supplier for the value to be set
     * @return ByProjectKeyInStoreKeyByStoreKeyCustomersKeyByKeyDelete
     */
    public ByProjectKeyInStoreKeyByStoreKeyCustomersKeyByKeyDelete withVersion(final Supplier<Long> supplier) {
        return copy().withQueryParam("version", supplier.get());
    }
    
    /**
     * add additional version query parameter
     * @param supplier supplier for the value to be added
     * @return ByProjectKeyInStoreKeyByStoreKeyCustomersKeyByKeyDelete
     */
    public ByProjectKeyInStoreKeyByStoreKeyCustomersKeyByKeyDelete addVersion(final Supplier<Long> supplier) {
        return copy().addQueryParam("version", supplier.get());
    }
    
    /**
     * set version with the specified value
     * @param op builder for the value to be set
     * @return ByProjectKeyInStoreKeyByStoreKeyCustomersKeyByKeyDelete
     */
    public ByProjectKeyInStoreKeyByStoreKeyCustomersKeyByKeyDelete withVersion(final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("version", op.apply(new StringBuilder()));
    }
    
    /**
     * add additional version query parameter
     * @param op builder for the value to be added
     * @return ByProjectKeyInStoreKeyByStoreKeyCustomersKeyByKeyDelete
     */
    public ByProjectKeyInStoreKeyByStoreKeyCustomersKeyByKeyDelete addVersion(final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("version", op.apply(new StringBuilder()));
    }
    
    /**
     * set version with the specified values
     * @param version values to be set
     * @param <TValue> value type
     * @return ByProjectKeyInStoreKeyByStoreKeyCustomersKeyByKeyDelete
     */
    public <TValue> ByProjectKeyInStoreKeyByStoreKeyCustomersKeyByKeyDelete withVersion(final Collection<TValue> version) {
        return copy().withoutQueryParam("version").addQueryParams(version.stream().map(s -> new ParamEntry<>("version", s.toString())).collect(Collectors.toList())); 
    }
    
    /**
     * add additional version query parameters
     * @param version values to be added
     * @param <TValue> value type
     * @return ByProjectKeyInStoreKeyByStoreKeyCustomersKeyByKeyDelete
     */
    public <TValue> ByProjectKeyInStoreKeyByStoreKeyCustomersKeyByKeyDelete addVersion(final Collection<TValue> version) {
        return copy().addQueryParams(version.stream().map(s -> new ParamEntry<>("version", s.toString())).collect(Collectors.toList())); 
    }
    
    /**
     * set expand with the specified value
     * @param expand value to be set
     * @param <TValue> value type
     * @return ByProjectKeyInStoreKeyByStoreKeyCustomersKeyByKeyDelete
     */
    public <TValue> ByProjectKeyInStoreKeyByStoreKeyCustomersKeyByKeyDelete withExpand(final TValue expand) {
        return copy().withQueryParam("expand", expand);
    }
    
    /**
     * add additional expand query parameter
     * @param expand value to be added
     * @param <TValue> value type
     * @return ByProjectKeyInStoreKeyByStoreKeyCustomersKeyByKeyDelete
     */
    public <TValue> ByProjectKeyInStoreKeyByStoreKeyCustomersKeyByKeyDelete addExpand(final TValue expand) {
        return copy().addQueryParam("expand", expand);
    }
    
    /**
     * set expand with the specified value
     * @param supplier supplier for the value to be set
     * @return ByProjectKeyInStoreKeyByStoreKeyCustomersKeyByKeyDelete
     */
    public ByProjectKeyInStoreKeyByStoreKeyCustomersKeyByKeyDelete withExpand(final Supplier<String> supplier) {
        return copy().withQueryParam("expand", supplier.get());
    }
    
    /**
     * add additional expand query parameter
     * @param supplier supplier for the value to be added
     * @return ByProjectKeyInStoreKeyByStoreKeyCustomersKeyByKeyDelete
     */
    public ByProjectKeyInStoreKeyByStoreKeyCustomersKeyByKeyDelete addExpand(final Supplier<String> supplier) {
        return copy().addQueryParam("expand", supplier.get());
    }
    
    /**
     * set expand with the specified value
     * @param op builder for the value to be set
     * @return ByProjectKeyInStoreKeyByStoreKeyCustomersKeyByKeyDelete
     */
    public ByProjectKeyInStoreKeyByStoreKeyCustomersKeyByKeyDelete withExpand(final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("expand", op.apply(new StringBuilder()));
    }
    
    /**
     * add additional expand query parameter
     * @param op builder for the value to be added
     * @return ByProjectKeyInStoreKeyByStoreKeyCustomersKeyByKeyDelete
     */
    public ByProjectKeyInStoreKeyByStoreKeyCustomersKeyByKeyDelete addExpand(final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("expand", op.apply(new StringBuilder()));
    }
    
    /**
     * set expand with the specified values
     * @param expand values to be set
     * @param <TValue> value type
     * @return ByProjectKeyInStoreKeyByStoreKeyCustomersKeyByKeyDelete
     */
    public <TValue> ByProjectKeyInStoreKeyByStoreKeyCustomersKeyByKeyDelete withExpand(final Collection<TValue> expand) {
        return copy().withoutQueryParam("expand").addQueryParams(expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList())); 
    }
    
    /**
     * add additional expand query parameters
     * @param expand values to be added
     * @param <TValue> value type
     * @return ByProjectKeyInStoreKeyByStoreKeyCustomersKeyByKeyDelete
     */
    public <TValue> ByProjectKeyInStoreKeyByStoreKeyCustomersKeyByKeyDelete addExpand(final Collection<TValue> expand) {
        return copy().addQueryParams(expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList())); 
    }

    

    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        ByProjectKeyInStoreKeyByStoreKeyCustomersKeyByKeyDelete that = (ByProjectKeyInStoreKeyByStoreKeyCustomersKeyByKeyDelete) o;
    
        return new EqualsBuilder()
                .append(projectKey, that.projectKey)
                .append(storeKey, that.storeKey)
                .append(key, that.key)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(projectKey)
            .append(storeKey)
            .append(key)
            .toHashCode();
    }

    @Override
    protected ByProjectKeyInStoreKeyByStoreKeyCustomersKeyByKeyDelete copy() {
        return new ByProjectKeyInStoreKeyByStoreKeyCustomersKeyByKeyDelete(this);
    }
}
