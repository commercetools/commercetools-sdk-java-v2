
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
public class ByProjectKeyZonesKeyByKeyDelete
        extends ApiMethod<ByProjectKeyZonesKeyByKeyDelete, com.commercetools.api.models.zone.Zone>
        implements com.commercetools.api.client.VersionedTrait<ByProjectKeyZonesKeyByKeyDelete>,
        com.commercetools.api.client.ConflictingTrait<ByProjectKeyZonesKeyByKeyDelete>,
        com.commercetools.api.client.ExpandableTrait<ByProjectKeyZonesKeyByKeyDelete>,
        com.commercetools.api.client.ErrorableTrait<ByProjectKeyZonesKeyByKeyDelete>,
        com.commercetools.api.client.Deprecatable200Trait<ByProjectKeyZonesKeyByKeyDelete> {

    private String projectKey;
    private String key;

    public ByProjectKeyZonesKeyByKeyDelete(final ApiHttpClient apiHttpClient, String projectKey, String key) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.key = key;
    }

    public ByProjectKeyZonesKeyByKeyDelete(ByProjectKeyZonesKeyByKeyDelete t) {
        super(t);
        this.projectKey = t.projectKey;
        this.key = t.key;
    }

    @Override
    public ApiHttpRequest createHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("/%s/zones/key=%s", this.projectKey, this.key);
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }

        return new ApiHttpRequest(ApiHttpMethod.DELETE, URI.create(httpRequestPath), getHeaders(), null);
    }

    @Override
    public ApiHttpResponse<com.commercetools.api.models.zone.Zone> executeBlocking(final ApiHttpClient client,
            Duration timeout) {
        ApiHttpRequest request = this.createHttpRequest();
        return blockingWait(client.execute(request, com.commercetools.api.models.zone.Zone.class).toCompletableFuture(),
            request, timeout);
    }

    @Override
    public CompletableFuture<ApiHttpResponse<com.commercetools.api.models.zone.Zone>> execute(
            final ApiHttpClient client) {
        return client.execute(this.createHttpRequest(), com.commercetools.api.models.zone.Zone.class)
                .toCompletableFuture();
    }

    public String getProjectKey() {
        return this.projectKey;
    }

    public String getKey() {
        return this.key;
    }

    public List<String> getVersion() {
        return this.getQueryParam("version");
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
     * set version with the specificied value
     */
    public ByProjectKeyZonesKeyByKeyDelete withVersion(final long version) {
        return copy().withQueryParam("version", version);
    }

    /**
     * add additional version query parameter
     */
    public ByProjectKeyZonesKeyByKeyDelete addVersion(final long version) {
        return copy().addQueryParam("version", version);
    }

    /**
     * set version with the specificied values
     */
    public ByProjectKeyZonesKeyByKeyDelete withVersion(final List<Long> version) {
        return copy().withoutQueryParam("version")
                .addQueryParams(
                    version.stream().map(s -> new ParamEntry<>("version", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional version query parameters
     */
    public ByProjectKeyZonesKeyByKeyDelete addVersion(final List<Long> version) {
        return copy().addQueryParams(
            version.stream().map(s -> new ParamEntry<>("version", s.toString())).collect(Collectors.toList()));
    }

    /**
     * set expand with the specificied value
     */
    public ByProjectKeyZonesKeyByKeyDelete withExpand(final String expand) {
        return copy().withQueryParam("expand", expand);
    }

    /**
     * add additional expand query parameter
     */
    public ByProjectKeyZonesKeyByKeyDelete addExpand(final String expand) {
        return copy().addQueryParam("expand", expand);
    }

    /**
     * set expand with the specificied values
     */
    public ByProjectKeyZonesKeyByKeyDelete withExpand(final List<String> expand) {
        return copy().withoutQueryParam("expand")
                .addQueryParams(
                    expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional expand query parameters
     */
    public ByProjectKeyZonesKeyByKeyDelete addExpand(final List<String> expand) {
        return copy().addQueryParams(
            expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList()));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ByProjectKeyZonesKeyByKeyDelete that = (ByProjectKeyZonesKeyByKeyDelete) o;

        return new EqualsBuilder().append(projectKey, that.projectKey).append(key, that.key).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(projectKey).append(key).toHashCode();
    }

    @Override
    protected ByProjectKeyZonesKeyByKeyDelete copy() {
        return new ByProjectKeyZonesKeyByKeyDelete(this);
    }
}