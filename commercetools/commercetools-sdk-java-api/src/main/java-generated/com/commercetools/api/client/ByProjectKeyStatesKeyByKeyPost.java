
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
public class ByProjectKeyStatesKeyByKeyPost extends
        BodyApiMethod<ByProjectKeyStatesKeyByKeyPost, com.commercetools.api.models.state.State, com.commercetools.api.models.state.StateUpdate>
        implements com.commercetools.api.client.ConflictingTrait<ByProjectKeyStatesKeyByKeyPost>,
        com.commercetools.api.client.ExpandableTrait<ByProjectKeyStatesKeyByKeyPost>,
        com.commercetools.api.client.Deprecatable200Trait<ByProjectKeyStatesKeyByKeyPost>,
        com.commercetools.api.client.ErrorableTrait<ByProjectKeyStatesKeyByKeyPost> {

    private String projectKey;
    private String key;

    private com.commercetools.api.models.state.StateUpdate stateUpdate;

    public ByProjectKeyStatesKeyByKeyPost(final ApiHttpClient apiHttpClient, String projectKey, String key,
            com.commercetools.api.models.state.StateUpdate stateUpdate) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.key = key;
        this.stateUpdate = stateUpdate;
    }

    public ByProjectKeyStatesKeyByKeyPost(ByProjectKeyStatesKeyByKeyPost t) {
        super(t);
        this.projectKey = t.projectKey;
        this.key = t.key;
        this.stateUpdate = t.stateUpdate;
    }

    @Override
    protected ApiHttpRequest buildHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("/%s/states/key=%s", this.projectKey, this.key);
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(),
            io.vrap.rmf.base.client.utils.json.JsonUtils
                    .executing(() -> apiHttpClient().getSerializerService().toJsonByteArray(stateUpdate)));

    }

    @Override
    public ApiHttpResponse<com.commercetools.api.models.state.State> executeBlocking(final ApiHttpClient client,
            final Duration timeout) {
        return executeBlocking(client, timeout, com.commercetools.api.models.state.State.class);
    }

    @Override
    public CompletableFuture<ApiHttpResponse<com.commercetools.api.models.state.State>> execute(
            final ApiHttpClient client) {
        return execute(client, com.commercetools.api.models.state.State.class);
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
    public <TValue> ByProjectKeyStatesKeyByKeyPost withExpand(final TValue expand) {
        return copy().withQueryParam("expand", expand);
    }

    /**
     * add additional expand query parameter
     */
    public <TValue> ByProjectKeyStatesKeyByKeyPost addExpand(final TValue expand) {
        return copy().addQueryParam("expand", expand);
    }

    /**
     * set expand with the specified value
     */
    public ByProjectKeyStatesKeyByKeyPost withExpand(final Supplier<String> supplier) {
        return copy().withQueryParam("expand", supplier.get());
    }

    /**
     * add additional expand query parameter
     */
    public ByProjectKeyStatesKeyByKeyPost addExpand(final Supplier<String> supplier) {
        return copy().addQueryParam("expand", supplier.get());
    }

    /**
     * set expand with the specified value
     */
    public ByProjectKeyStatesKeyByKeyPost withExpand(final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("expand", op.apply(new StringBuilder()));
    }

    /**
     * add additional expand query parameter
     */
    public ByProjectKeyStatesKeyByKeyPost addExpand(final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("expand", op.apply(new StringBuilder()));
    }

    /**
     * set expand with the specified values
     */
    public <TValue> ByProjectKeyStatesKeyByKeyPost withExpand(final List<TValue> expand) {
        return copy().withoutQueryParam("expand")
                .addQueryParams(
                    expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional expand query parameters
     */
    public <TValue> ByProjectKeyStatesKeyByKeyPost addExpand(final List<TValue> expand) {
        return copy().addQueryParams(
            expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList()));
    }

    public com.commercetools.api.models.state.StateUpdate getBody() {
        return stateUpdate;
    }

    public ByProjectKeyStatesKeyByKeyPost withBody(com.commercetools.api.models.state.StateUpdate stateUpdate) {
        ByProjectKeyStatesKeyByKeyPost t = copy();
        t.stateUpdate = stateUpdate;
        return t;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ByProjectKeyStatesKeyByKeyPost that = (ByProjectKeyStatesKeyByKeyPost) o;

        return new EqualsBuilder().append(projectKey, that.projectKey)
                .append(key, that.key)
                .append(stateUpdate, that.stateUpdate)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(projectKey).append(key).append(stateUpdate).toHashCode();
    }

    @Override
    protected ByProjectKeyStatesKeyByKeyPost copy() {
        return new ByProjectKeyStatesKeyByKeyPost(this);
    }
}
