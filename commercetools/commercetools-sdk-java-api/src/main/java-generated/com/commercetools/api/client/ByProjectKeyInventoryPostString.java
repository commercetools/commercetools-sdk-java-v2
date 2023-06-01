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
 *  <p>Produces the InventoryEntryCreated Message.</p>
 *
 * <hr>
 * <div class=code-example>
 * <pre><code class='java'>{@code
 *   CompletableFuture<ApiHttpResponse<com.commercetools.api.models.inventory.InventoryEntry>> result = apiRoot
 *            .withProjectKey("{projectKey}")
 *            .inventory()
 *            .post("")
 *            .execute()
 * }</code></pre>
 * </div>
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class ByProjectKeyInventoryPostString extends StringBodyApiMethod<ByProjectKeyInventoryPostString, com.commercetools.api.models.inventory.InventoryEntry> implements com.commercetools.api.client.ExpandableTrait<ByProjectKeyInventoryPostString>, com.commercetools.api.client.Deprecatable201Trait<ByProjectKeyInventoryPostString>, com.commercetools.api.client.ErrorableTrait<ByProjectKeyInventoryPostString> {

    
    private String projectKey;
    
    private String inventoryEntryDraft;

    public ByProjectKeyInventoryPostString(final ApiHttpClient apiHttpClient, String projectKey, String inventoryEntryDraft) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.inventoryEntryDraft = inventoryEntryDraft;
    }

    public ByProjectKeyInventoryPostString(ByProjectKeyInventoryPostString t) {
        super(t);
        this.projectKey = t.projectKey;
        this.inventoryEntryDraft = t.inventoryEntryDraft;
    }

    @Override
    protected ApiHttpRequest buildHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("%s/inventory", this.projectKey);
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(), inventoryEntryDraft.getBytes(StandardCharsets.UTF_8));
    
    }

    @Override
    public ApiHttpResponse<com.commercetools.api.models.inventory.InventoryEntry> executeBlocking(final ApiHttpClient client, final Duration timeout) {
        return executeBlocking(client, timeout, com.commercetools.api.models.inventory.InventoryEntry.class);
    }

    @Override
    public CompletableFuture<ApiHttpResponse<com.commercetools.api.models.inventory.InventoryEntry>> execute(final ApiHttpClient client) {
        return execute(client, com.commercetools.api.models.inventory.InventoryEntry.class);
    }

    public String getProjectKey() {return this.projectKey;}

    public List<String> getExpand() {
        return this.getQueryParam("expand");
    }

    public void setProjectKey(final String projectKey) { this.projectKey = projectKey; }

    /**
     * set expand with the specified value
     * @param <TValue> value type
     * @param expand value to be set
     * @return ByProjectKeyInventoryPostString
     */
    public <TValue> ByProjectKeyInventoryPostString withExpand(final TValue expand) {
        return copy().withQueryParam("expand", expand);
    }
    
    /**
     * add additional expand query parameter
     * @param <TValue> value type
     * @param expand value to be added
     * @return ByProjectKeyInventoryPostString
     */
    public <TValue> ByProjectKeyInventoryPostString addExpand(final TValue expand) {
        return copy().addQueryParam("expand", expand);
    }
    
    /**
     * set expand with the specified value
     * @param supplier supplier for the value to be set
     * @return ByProjectKeyInventoryPostString
     */
    public ByProjectKeyInventoryPostString withExpand(final Supplier<String> supplier) {
        return copy().withQueryParam("expand", supplier.get());
    }
    
    /**
     * add additional expand query parameter
     * @param supplier supplier for the value to be added
     * @return ByProjectKeyInventoryPostString
     */
    public ByProjectKeyInventoryPostString addExpand(final Supplier<String> supplier) {
        return copy().addQueryParam("expand", supplier.get());
    }
    
    /**
     * set expand with the specified value
     * @param op builder for the value to be set
     * @return ByProjectKeyInventoryPostString
     */
    public ByProjectKeyInventoryPostString withExpand(final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("expand", op.apply(new StringBuilder()));
    }
    
    /**
     * add additional expand query parameter
     * @param op builder for the value to be added
     * @return ByProjectKeyInventoryPostString
     */
    public ByProjectKeyInventoryPostString addExpand(final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("expand", op.apply(new StringBuilder()));
    }
    
    /**
     * set expand with the specified values
     * @param <TValue> value type
     * @param expand values to be set
     * @return ByProjectKeyInventoryPostString
     */
    public <TValue> ByProjectKeyInventoryPostString withExpand(final Collection<TValue> expand) {
        return copy().withoutQueryParam("expand").addQueryParams(expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList())); 
    }
    
    /**
     * add additional expand query parameters
     * @param <TValue> value type
     * @param expand values to be added
     * @return ByProjectKeyInventoryPostString
     */
    public <TValue> ByProjectKeyInventoryPostString addExpand(final Collection<TValue> expand) {
        return copy().addQueryParams(expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList())); 
    }

    
    public String getBody() {
        return inventoryEntryDraft;
    }
    
    public ByProjectKeyInventoryPostString withBody(String inventoryEntryDraft) {
        ByProjectKeyInventoryPostString t = copy();
        t.inventoryEntryDraft = inventoryEntryDraft;
        return t;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        ByProjectKeyInventoryPostString that = (ByProjectKeyInventoryPostString) o;
    
        return new EqualsBuilder()
                .append(projectKey, that.projectKey)
                .append(inventoryEntryDraft, that.inventoryEntryDraft)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(projectKey)
            .append(inventoryEntryDraft)
            .toHashCode();
    }

    @Override
    protected ByProjectKeyInventoryPostString copy() {
        return new ByProjectKeyInventoryPostString(this);
    }
}
