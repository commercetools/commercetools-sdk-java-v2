
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
 *  <p>Creates a Zone in the Project.</p>
 *
 * <hr>
 * <div class=code-example>
 * <pre><code class='java'>{@code
 *   CompletableFuture<ApiHttpResponse<com.commercetools.api.models.zone.Zone>> result = apiRoot
 *            .withProjectKey("{projectKey}")
 *            .zones()
 *            .post(null)
 *            .execute()
 * }</code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyZonesPost extends
        TypeBodyApiMethod<ByProjectKeyZonesPost, com.commercetools.api.models.zone.Zone, com.commercetools.api.models.zone.ZoneDraft>
        implements com.commercetools.api.client.ExpandableTrait<ByProjectKeyZonesPost>,
        com.commercetools.api.client.Deprecatable201Trait<ByProjectKeyZonesPost>,
        com.commercetools.api.client.ErrorableTrait<ByProjectKeyZonesPost> {

    @Override
    public TypeReference<com.commercetools.api.models.zone.Zone> resultType() {
        return new TypeReference<com.commercetools.api.models.zone.Zone>() {
        };
    }

    private String projectKey;

    private com.commercetools.api.models.zone.ZoneDraft zoneDraft;

    public ByProjectKeyZonesPost(final ApiHttpClient apiHttpClient, String projectKey,
            com.commercetools.api.models.zone.ZoneDraft zoneDraft) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.zoneDraft = zoneDraft;
    }

    public ByProjectKeyZonesPost(ByProjectKeyZonesPost t) {
        super(t);
        this.projectKey = t.projectKey;
        this.zoneDraft = t.zoneDraft;
    }

    @Override
    protected ApiHttpRequest buildHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("%s/zones", encodePathParam(this.projectKey));
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(),
            io.vrap.rmf.base.client.utils.json.JsonUtils
                    .executing(() -> apiHttpClient().getSerializerService().toJsonByteArray(zoneDraft)));

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

    public List<String> getExpand() {
        return this.getQueryParam("expand");
    }

    public void setProjectKey(final String projectKey) {
        this.projectKey = projectKey;
    }

    /**
     * set expand with the specified value
     * @param expand value to be set
     * @param <TValue> value type
     * @return ByProjectKeyZonesPost
     */
    public <TValue> ByProjectKeyZonesPost withExpand(final TValue expand) {
        return copy().withQueryParam("expand", expand);
    }

    /**
     * add additional expand query parameter
     * @param expand value to be added
     * @param <TValue> value type
     * @return ByProjectKeyZonesPost
     */
    public <TValue> ByProjectKeyZonesPost addExpand(final TValue expand) {
        return copy().addQueryParam("expand", expand);
    }

    /**
     * set expand with the specified value
     * @param supplier supplier for the value to be set
     * @return ByProjectKeyZonesPost
     */
    public ByProjectKeyZonesPost withExpand(final Supplier<String> supplier) {
        return copy().withQueryParam("expand", supplier.get());
    }

    /**
     * add additional expand query parameter
     * @param supplier supplier for the value to be added
     * @return ByProjectKeyZonesPost
     */
    public ByProjectKeyZonesPost addExpand(final Supplier<String> supplier) {
        return copy().addQueryParam("expand", supplier.get());
    }

    /**
     * set expand with the specified value
     * @param op builder for the value to be set
     * @return ByProjectKeyZonesPost
     */
    public ByProjectKeyZonesPost withExpand(final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("expand", op.apply(new StringBuilder()));
    }

    /**
     * add additional expand query parameter
     * @param op builder for the value to be added
     * @return ByProjectKeyZonesPost
     */
    public ByProjectKeyZonesPost addExpand(final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("expand", op.apply(new StringBuilder()));
    }

    /**
     * set expand with the specified values
     * @param expand values to be set
     * @param <TValue> value type
     * @return ByProjectKeyZonesPost
     */
    public <TValue> ByProjectKeyZonesPost withExpand(final Collection<TValue> expand) {
        return copy().withoutQueryParam("expand")
                .addQueryParams(
                    expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional expand query parameters
     * @param expand values to be added
     * @param <TValue> value type
     * @return ByProjectKeyZonesPost
     */
    public <TValue> ByProjectKeyZonesPost addExpand(final Collection<TValue> expand) {
        return copy().addQueryParams(
            expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList()));
    }

    public com.commercetools.api.models.zone.ZoneDraft getBody() {
        return zoneDraft;
    }

    public ByProjectKeyZonesPost withBody(com.commercetools.api.models.zone.ZoneDraft zoneDraft) {
        ByProjectKeyZonesPost t = copy();
        t.zoneDraft = zoneDraft;
        return t;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ByProjectKeyZonesPost that = (ByProjectKeyZonesPost) o;

        return new EqualsBuilder().append(projectKey, that.projectKey).append(zoneDraft, that.zoneDraft).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(projectKey).append(zoneDraft).toHashCode();
    }

    @Override
    protected ByProjectKeyZonesPost copy() {
        return new ByProjectKeyZonesPost(this);
    }
}
