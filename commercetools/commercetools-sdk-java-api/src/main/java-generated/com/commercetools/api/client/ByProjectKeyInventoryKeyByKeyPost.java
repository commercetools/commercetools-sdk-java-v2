
package com.commercetools.api.client;

import java.net.URI;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;

import io.vrap.rmf.base.client.*;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ByProjectKeyInventoryKeyByKeyPost extends
        BodyApiMethod<ByProjectKeyInventoryKeyByKeyPost, com.commercetools.api.models.inventory.InventoryEntry, com.commercetools.api.models.inventory.InventoryEntryUpdate>
        implements com.commercetools.api.client.ConflictingTrait<ByProjectKeyInventoryKeyByKeyPost>,
        com.commercetools.api.client.ExpandableTrait<ByProjectKeyInventoryKeyByKeyPost>,
        com.commercetools.api.client.Deprecatable200Trait<ByProjectKeyInventoryKeyByKeyPost>,
        com.commercetools.api.client.ErrorableTrait<ByProjectKeyInventoryKeyByKeyPost> {

    private String projectKey;
    private String key;

    private com.commercetools.api.models.inventory.InventoryEntryUpdate inventoryEntryUpdate;

    public ByProjectKeyInventoryKeyByKeyPost(final ApiHttpClient apiHttpClient, String projectKey, String key,
            com.commercetools.api.models.inventory.InventoryEntryUpdate inventoryEntryUpdate) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.key = key;
        this.inventoryEntryUpdate = inventoryEntryUpdate;
    }

    public ByProjectKeyInventoryKeyByKeyPost(ByProjectKeyInventoryKeyByKeyPost t) {
        super(t);
        this.projectKey = t.projectKey;
        this.key = t.key;
        this.inventoryEntryUpdate = t.inventoryEntryUpdate;
    }

    @Override
    protected ApiHttpRequest buildHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("/%s/inventory/key=%s", this.projectKey, this.key);
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(),
            io.vrap.rmf.base.client.utils.json.JsonUtils
                    .executing(() -> apiHttpClient().getSerializerService().toJsonByteArray(inventoryEntryUpdate)));

    }

    @Override
    public ApiHttpResponse<com.commercetools.api.models.inventory.InventoryEntry> executeBlocking(
            final ApiHttpClient client, final Duration timeout) {
        return executeBlocking(client, timeout, com.commercetools.api.models.inventory.InventoryEntry.class);
    }

    @Override
    public CompletableFuture<ApiHttpResponse<com.commercetools.api.models.inventory.InventoryEntry>> execute(
            final ApiHttpClient client) {
        return execute(client, com.commercetools.api.models.inventory.InventoryEntry.class);
    }

    public String getProjectKey() {
        return this.projectKey;
    }

    public String getKey() {
        return this.key;
    }

    public List<String> getExpand() {
        return this.getQueryParam("expand");
    }

    public void setProjectKey(final String projectKey) {
        this.projectKey = projectKey;
    }

    public void setKey(final String key) {
        this.key = key;
    }

    /**
     * set expand with the specified value
     */
    public <TValue> ByProjectKeyInventoryKeyByKeyPost withExpand(final TValue expand) {
        return copy().withQueryParam("expand", expand);
    }

    /**
     * add additional expand query parameter
     */
    public <TValue> ByProjectKeyInventoryKeyByKeyPost addExpand(final TValue expand) {
        return copy().addQueryParam("expand", expand);
    }

    /**
     * set expand with the specified value
     */
    public ByProjectKeyInventoryKeyByKeyPost withExpand(final Supplier<String> supplier) {
        return copy().withQueryParam("expand", supplier.get());
    }

    /**
     * add additional expand query parameter
     */
    public ByProjectKeyInventoryKeyByKeyPost addExpand(final Supplier<String> supplier) {
        return copy().addQueryParam("expand", supplier.get());
    }

    /**
     * set expand with the specified value
     */
    public ByProjectKeyInventoryKeyByKeyPost withExpand(final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("expand", op.apply(new StringBuilder()));
    }

    /**
     * add additional expand query parameter
     */
    public ByProjectKeyInventoryKeyByKeyPost addExpand(final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("expand", op.apply(new StringBuilder()));
    }

    /**
     * set expand with the specified values
     */
    public <TValue> ByProjectKeyInventoryKeyByKeyPost withExpand(final List<TValue> expand) {
        return copy().withoutQueryParam("expand")
                .addQueryParams(
                    expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional expand query parameters
     */
    public <TValue> ByProjectKeyInventoryKeyByKeyPost addExpand(final List<TValue> expand) {
        return copy().addQueryParams(
            expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList()));
    }

    public com.commercetools.api.models.inventory.InventoryEntryUpdate getBody() {
        return inventoryEntryUpdate;
    }

    public ByProjectKeyInventoryKeyByKeyPost withBody(
            com.commercetools.api.models.inventory.InventoryEntryUpdate inventoryEntryUpdate) {
        ByProjectKeyInventoryKeyByKeyPost t = copy();
        t.inventoryEntryUpdate = inventoryEntryUpdate;
        return t;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ByProjectKeyInventoryKeyByKeyPost that = (ByProjectKeyInventoryKeyByKeyPost) o;

        return new EqualsBuilder().append(projectKey, that.projectKey)
                .append(key, that.key)
                .append(inventoryEntryUpdate, that.inventoryEntryUpdate)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(projectKey).append(key).append(inventoryEntryUpdate).toHashCode();
    }

    @Override
    protected ByProjectKeyInventoryKeyByKeyPost copy() {
        return new ByProjectKeyInventoryKeyByKeyPost(this);
    }
}
