
package com.commercetools.api.client;

import java.net.URI;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;

import io.vrap.rmf.base.client.*;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ByProjectKeyInventoryPost extends
        BodyApiMethod<ByProjectKeyInventoryPost, com.commercetools.api.models.inventory.InventoryEntry, com.commercetools.api.models.inventory.InventoryEntryDraft>
        implements com.commercetools.api.client.ExpandableTrait<ByProjectKeyInventoryPost>,
        com.commercetools.api.client.Deprecatable201Trait<ByProjectKeyInventoryPost>,
        com.commercetools.api.client.ErrorableTrait<ByProjectKeyInventoryPost> {

    private String projectKey;

    private com.commercetools.api.models.inventory.InventoryEntryDraft inventoryEntryDraft;

    public ByProjectKeyInventoryPost(final ApiHttpClient apiHttpClient, String projectKey,
            com.commercetools.api.models.inventory.InventoryEntryDraft inventoryEntryDraft) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.inventoryEntryDraft = inventoryEntryDraft;
    }

    public ByProjectKeyInventoryPost(ByProjectKeyInventoryPost t) {
        super(t);
        this.projectKey = t.projectKey;
        this.inventoryEntryDraft = t.inventoryEntryDraft;
    }

    @Override
    public ApiHttpRequest createHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("/%s/inventory", this.projectKey);
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(),
            io.vrap.rmf.base.client.utils.json.JsonUtils
                    .executing(() -> apiHttpClient().getSerializerService().toJsonByteArray(inventoryEntryDraft)));

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

    public List<String> getExpand() {
        return this.getQueryParam("expand");
    }

    public void setProjectKey(final String projectKey) {
        this.projectKey = projectKey;
    }

    /**
     * set expand with the specificied value
     */
    public ByProjectKeyInventoryPost withExpand(final String expand) {
        return copy().withQueryParam("expand", expand);
    }

    /**
     * add additional expand query parameter
     */
    public ByProjectKeyInventoryPost addExpand(final String expand) {
        return copy().addQueryParam("expand", expand);
    }

    /**
     * set expand with the specificied values
     */
    public ByProjectKeyInventoryPost withExpand(final List<String> expand) {
        return copy().withoutQueryParam("expand")
                .addQueryParams(
                    expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional expand query parameters
     */
    public ByProjectKeyInventoryPost addExpand(final List<String> expand) {
        return copy().addQueryParams(
            expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList()));
    }

    public com.commercetools.api.models.inventory.InventoryEntryDraft getBody() {
        return inventoryEntryDraft;
    }

    public ByProjectKeyInventoryPost withBody(
            com.commercetools.api.models.inventory.InventoryEntryDraft inventoryEntryDraft) {
        ByProjectKeyInventoryPost t = copy();
        t.inventoryEntryDraft = inventoryEntryDraft;
        return t;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ByProjectKeyInventoryPost that = (ByProjectKeyInventoryPost) o;

        return new EqualsBuilder().append(projectKey, that.projectKey)
                .append(inventoryEntryDraft, that.inventoryEntryDraft)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(projectKey).append(inventoryEntryDraft).toHashCode();
    }

    @Override
    protected ByProjectKeyInventoryPost copy() {
        return new ByProjectKeyInventoryPost(this);
    }
}
