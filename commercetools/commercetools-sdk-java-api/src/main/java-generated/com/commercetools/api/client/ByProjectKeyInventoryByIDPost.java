
package com.commercetools.api.client;

import static io.vrap.rmf.base.client.utils.ClientUtils.blockingWait;

import java.net.URI;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;

import io.vrap.rmf.base.client.*;
import io.vrap.rmf.base.client.utils.Generated;

/**
*  <p>Update InventoryEntry by ID</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ByProjectKeyInventoryByIDPost
        extends ApiMethod<ByProjectKeyInventoryByIDPost, com.commercetools.api.models.inventory.InventoryEntry>
        implements com.commercetools.api.client.ConflictingTrait<ByProjectKeyInventoryByIDPost>,
        com.commercetools.api.client.ExpandableTrait<ByProjectKeyInventoryByIDPost>,
        com.commercetools.api.client.ErrorableTrait<ByProjectKeyInventoryByIDPost>,
        com.commercetools.api.client.DeprecatableTrait<ByProjectKeyInventoryByIDPost> {

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
    public ApiHttpResponse<com.commercetools.api.models.inventory.InventoryEntry> executeBlocking(Duration timeout) {
        return blockingWait(execute(), timeout);
    }

    @Override
    public CompletableFuture<ApiHttpResponse<com.commercetools.api.models.inventory.InventoryEntry>> execute() {
        return apiHttpClient().execute(this.createHttpRequest(),
            com.commercetools.api.models.inventory.InventoryEntry.class);
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

    public ByProjectKeyInventoryByIDPost withExpand(final String expand) {
        return copy().withQueryParam("expand", expand);
    }

    public ByProjectKeyInventoryByIDPost addExpand(final String expand) {
        return copy().addQueryParam("expand", expand);
    }

    @Override
    protected ByProjectKeyInventoryByIDPost copy() {
        return new ByProjectKeyInventoryByIDPost(this);
    }
}
