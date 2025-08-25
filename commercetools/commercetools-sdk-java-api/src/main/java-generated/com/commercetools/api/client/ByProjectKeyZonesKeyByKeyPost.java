
package com.commercetools.api.client;

import java.net.URI;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;

import com.fasterxml.jackson.core.type.TypeReference;

import io.vrap.rmf.base.client.*;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 *  <p>Updates a Zone in the Project using one or more <span>update actions</span>.</p>
 *
 * <hr>
 * <div class=code-example>
 * <pre><code class='java'>{@code
 *   CompletableFuture<ApiHttpResponse<com.commercetools.api.models.zone.Zone>> result = apiRoot
 *            .withProjectKey("{projectKey}")
 *            .zones()
 *            .withKey("{key}")
 *            .post(null)
 *            .execute()
 * }</code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyZonesKeyByKeyPost extends
        TypeBodyApiMethod<ByProjectKeyZonesKeyByKeyPost, com.commercetools.api.models.zone.Zone, com.commercetools.api.models.zone.ZoneUpdate>
        implements com.commercetools.api.client.ConflictingTrait<ByProjectKeyZonesKeyByKeyPost>,
        com.commercetools.api.client.ExpandableTrait<ByProjectKeyZonesKeyByKeyPost>,
        com.commercetools.api.client.Deprecatable200Trait<ByProjectKeyZonesKeyByKeyPost>,
        com.commercetools.api.client.ErrorableTrait<ByProjectKeyZonesKeyByKeyPost> {

    @Override
    public TypeReference<com.commercetools.api.models.zone.Zone> resultType() {
        return new TypeReference<com.commercetools.api.models.zone.Zone>() {
        };
    }

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
    protected ApiHttpRequest buildHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("%s/zones/key=%s", encodePathParam(this.projectKey),
            encodePathParam(this.key));
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
     * set expand with the specified value
     * @param expand value to be set
     * @param <TValue> value type
     * @return ByProjectKeyZonesKeyByKeyPost
     */
    public <TValue> ByProjectKeyZonesKeyByKeyPost withExpand(final TValue expand) {
        return copy().withQueryParam("expand", expand);
    }

    /**
     * add additional expand query parameter
     * @param expand value to be added
     * @param <TValue> value type
     * @return ByProjectKeyZonesKeyByKeyPost
     */
    public <TValue> ByProjectKeyZonesKeyByKeyPost addExpand(final TValue expand) {
        return copy().addQueryParam("expand", expand);
    }

    /**
     * set expand with the specified value
     * @param supplier supplier for the value to be set
     * @return ByProjectKeyZonesKeyByKeyPost
     */
    public ByProjectKeyZonesKeyByKeyPost withExpand(final Supplier<String> supplier) {
        return copy().withQueryParam("expand", supplier.get());
    }

    /**
     * add additional expand query parameter
     * @param supplier supplier for the value to be added
     * @return ByProjectKeyZonesKeyByKeyPost
     */
    public ByProjectKeyZonesKeyByKeyPost addExpand(final Supplier<String> supplier) {
        return copy().addQueryParam("expand", supplier.get());
    }

    /**
     * set expand with the specified value
     * @param op builder for the value to be set
     * @return ByProjectKeyZonesKeyByKeyPost
     */
    public ByProjectKeyZonesKeyByKeyPost withExpand(final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("expand", op.apply(new StringBuilder()));
    }

    /**
     * add additional expand query parameter
     * @param op builder for the value to be added
     * @return ByProjectKeyZonesKeyByKeyPost
     */
    public ByProjectKeyZonesKeyByKeyPost addExpand(final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("expand", op.apply(new StringBuilder()));
    }

    /**
     * set expand with the specified values
     * @param expand values to be set
     * @param <TValue> value type
     * @return ByProjectKeyZonesKeyByKeyPost
     */
    public <TValue> ByProjectKeyZonesKeyByKeyPost withExpand(final Collection<TValue> expand) {
        return copy().withoutQueryParam("expand")
                .addQueryParams(
                    expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional expand query parameters
     * @param expand values to be added
     * @param <TValue> value type
     * @return ByProjectKeyZonesKeyByKeyPost
     */
    public <TValue> ByProjectKeyZonesKeyByKeyPost addExpand(final Collection<TValue> expand) {
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
