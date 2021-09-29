
package com.commercetools.api.client;

import static io.vrap.rmf.base.client.utils.ClientUtils.blockingWait;

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
public class ByProjectKeyInventoryByIDPost
        extends ApiMethod<ByProjectKeyInventoryByIDPost, com.commercetools.api.models.inventory.InventoryEntry>
        implements com.commercetools.api.client.ConflictingTrait<ByProjectKeyInventoryByIDPost>,
        com.commercetools.api.client.ExpandableTrait<ByProjectKeyInventoryByIDPost>,
        com.commercetools.api.client.Deprecatable200Trait<ByProjectKeyInventoryByIDPost>,
        com.commercetools.api.client.ErrorableTrait<ByProjectKeyInventoryByIDPost> {

    private String projectKey;
    private String ID;

    private com.commercetools.api.models.inventory.InventoryEntryUpdate inventoryEntryUpdate;

    public ByProjectKeyInventoryByIDPost(final ApiHttpClient apiHttpClient, String projectKey, String ID,
            com.commercetools.api.models.inventory.InventoryEntryUpdate inventoryEntryUpdate) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.ID = ID;
        this.inventoryEntryUpdate = inventoryEntryUpdate;
    }

    public ByProjectKeyInventoryByIDPost(ByProjectKeyInventoryByIDPost t) {
        super(t);
        this.projectKey = t.projectKey;
        this.ID = t.ID;
        this.inventoryEntryUpdate = t.inventoryEntryUpdate;
    }

    @Override
    public ApiHttpRequest createHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("/%s/inventory/%s", this.projectKey, this.ID);
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        try {
            final byte[] body = apiHttpClient().getSerializerService().toJsonByteArray(inventoryEntryUpdate);
            return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(), body);
        }
        catch (Exception e) {
            e.printStackTrace();
        }

        return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(), null);
    }

    @Override
    public ApiHttpResponse<com.commercetools.api.models.inventory.InventoryEntry> executeBlocking(
            final ApiHttpClient client, Duration timeout) {
        ApiHttpRequest request = this.createHttpRequest();
        return blockingWait(
            client.execute(request, com.commercetools.api.models.inventory.InventoryEntry.class).toCompletableFuture(),
            request, timeout);
    }

    @Override
    public CompletableFuture<ApiHttpResponse<com.commercetools.api.models.inventory.InventoryEntry>> execute(
            final ApiHttpClient client) {
        return client.execute(this.createHttpRequest(), com.commercetools.api.models.inventory.InventoryEntry.class)
                .toCompletableFuture();
    }

    public String getProjectKey() {
        return this.projectKey;
    }

    public String getID() {
        return this.ID;
    }

    public List<String> getExpand() {
        return this.getQueryParam("expand");
    }

    public void setProjectKey(final String projectKey) {
        this.projectKey = projectKey;
    }

    public void setID(final String ID) {
        this.ID = ID;
    }

    /**
     * set expand with the specificied value
     */
    public ByProjectKeyInventoryByIDPost withExpand(final String expand) {
        return copy().withQueryParam("expand", expand);
    }

    /**
     * add additional expand query parameter
     */
    public ByProjectKeyInventoryByIDPost addExpand(final String expand) {
        return copy().addQueryParam("expand", expand);
    }

    /**
     * set expand with the specificied values
     */
    public ByProjectKeyInventoryByIDPost withExpand(final List<String> expand) {
        return copy().withoutQueryParam("expand")
                .addQueryParams(
                    expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional expand query parameters
     */
    public ByProjectKeyInventoryByIDPost addExpand(final List<String> expand) {
        return copy().addQueryParams(
            expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList()));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ByProjectKeyInventoryByIDPost that = (ByProjectKeyInventoryByIDPost) o;

        return new EqualsBuilder().append(projectKey, that.projectKey)
                .append(ID, that.ID)
                .append(inventoryEntryUpdate, that.inventoryEntryUpdate)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(projectKey).append(ID).append(inventoryEntryUpdate).toHashCode();
    }

    @Override
    protected ByProjectKeyInventoryByIDPost copy() {
        return new ByProjectKeyInventoryByIDPost(this);
    }
}
