
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
public class ByProjectKeyZonesKeyByKeyPost extends
        BodyApiMethod<ByProjectKeyZonesKeyByKeyPost, com.commercetools.api.models.zone.Zone, com.commercetools.api.models.zone.ZoneUpdate>
        implements com.commercetools.api.client.ConflictingTrait<ByProjectKeyZonesKeyByKeyPost>,
        com.commercetools.api.client.ExpandableTrait<ByProjectKeyZonesKeyByKeyPost>,
        com.commercetools.api.client.Deprecatable200Trait<ByProjectKeyZonesKeyByKeyPost>,
        com.commercetools.api.client.ErrorableTrait<ByProjectKeyZonesKeyByKeyPost> {

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
        return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(),
            io.vrap.rmf.base.client.utils.json.JsonUtils
                    .executing(() -> apiHttpClient().getSerializerService().toJsonByteArray(zoneUpdate)));

    }

    @Override
    public ApiHttpResponse<com.commercetools.api.models.zone.Zone> executeBlocking(final ApiHttpClient client,
            final Duration timeout) {
        return executeBlocking(client, timeout, com.commercetools.api.models.zone.Zone.class);
    }

    @Override
    public CompletableFuture<ApiHttpResponse<com.commercetools.api.models.zone.Zone>> execute(
            final ApiHttpClient client) {
        return execute(client, com.commercetools.api.models.zone.Zone.class);
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
     * set expand with the specificied value
     */
    public ByProjectKeyZonesKeyByKeyPost withExpand(final String expand) {
        return copy().withQueryParam("expand", expand);
    }

    /**
     * add additional expand query parameter
     */
    public ByProjectKeyZonesKeyByKeyPost addExpand(final String expand) {
        return copy().addQueryParam("expand", expand);
    }

    /**
     * set expand with the specificied values
     */
    public ByProjectKeyZonesKeyByKeyPost withExpand(final List<String> expand) {
        return copy().withoutQueryParam("expand")
                .addQueryParams(
                    expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional expand query parameters
     */
    public ByProjectKeyZonesKeyByKeyPost addExpand(final List<String> expand) {
        return copy().addQueryParams(
            expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList()));
    }

    public com.commercetools.api.models.zone.ZoneUpdate getBody() {
        return zoneUpdate;
    }

    public ByProjectKeyZonesKeyByKeyPost withBody(com.commercetools.api.models.zone.ZoneUpdate zoneUpdate) {
        ByProjectKeyZonesKeyByKeyPost t = copy();
        t.zoneUpdate = zoneUpdate;
        return t;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ByProjectKeyZonesKeyByKeyPost that = (ByProjectKeyZonesKeyByKeyPost) o;

        return new EqualsBuilder().append(projectKey, that.projectKey)
                .append(key, that.key)
                .append(zoneUpdate, that.zoneUpdate)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(projectKey).append(key).append(zoneUpdate).toHashCode();
    }

    @Override
    protected ByProjectKeyZonesKeyByKeyPost copy() {
        return new ByProjectKeyZonesKeyByKeyPost(this);
    }
}
