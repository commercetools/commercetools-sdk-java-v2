
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
*  <p>Update Zone by key</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ByProjectKeyZonesKeyByKeyPost
        extends ApiMethod<ByProjectKeyZonesKeyByKeyPost, com.commercetools.api.models.zone.Zone>
        implements com.commercetools.api.client.ConflictingTrait<ByProjectKeyZonesKeyByKeyPost>,
        com.commercetools.api.client.ExpandableTrait<ByProjectKeyZonesKeyByKeyPost>,
        com.commercetools.api.client.ErrorableTrait<ByProjectKeyZonesKeyByKeyPost>,
        com.commercetools.api.client.DeprecatableTrait<ByProjectKeyZonesKeyByKeyPost> {

    private String projectKey;
    private String key;

    private com.commercetools.api.models.zone.ZoneUpdate zoneUpdate;

    public ByProjectKeyZonesKeyByKeyPost(final ApiHttpClient apiHttpClient, String projectKey, String key,
            com.commercetools.api.models.zone.ZoneUpdate zoneUpdate) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.key = key;
        this.zoneUpdate = zoneUpdate;
    }

    public ByProjectKeyZonesKeyByKeyPost(ByProjectKeyZonesKeyByKeyPost t) {
        super(t);
        this.projectKey = t.projectKey;
        this.key = t.key;
        this.zoneUpdate = t.zoneUpdate;
    }

    @Override
    public ApiHttpRequest createHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("/%s/zones/key=%s", this.projectKey, this.key);
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        try {
            final byte[] body = apiHttpClient().getSerializerService().toJsonByteArray(zoneUpdate);
            return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(), body);
        }
        catch (Exception e) {
            e.printStackTrace();
        }

        return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(), null);
    }

    @Override
    public ApiHttpResponse<com.commercetools.api.models.zone.Zone> executeBlocking(Duration timeout) {
        return blockingWait(execute(), timeout);
    }

    @Override
    public CompletableFuture<ApiHttpResponse<com.commercetools.api.models.zone.Zone>> execute() {
        return apiHttpClient().execute(this.createHttpRequest(), com.commercetools.api.models.zone.Zone.class);
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

    public ByProjectKeyZonesKeyByKeyPost withExpand(final String expand) {
        return copy().withQueryParam("expand", expand);
    }

    public ByProjectKeyZonesKeyByKeyPost addExpand(final String expand) {
        return copy().addQueryParam("expand", expand);
    }

    @Override
    protected ByProjectKeyZonesKeyByKeyPost copy() {
        return new ByProjectKeyZonesKeyByKeyPost(this);
    }
}
