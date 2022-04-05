
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
public class ByProjectKeyStoresKeyByKeyPost extends
        BodyApiMethod<ByProjectKeyStoresKeyByKeyPost, com.commercetools.api.models.store.Store, com.commercetools.api.models.store.StoreUpdate>
        implements com.commercetools.api.client.ConflictingTrait<ByProjectKeyStoresKeyByKeyPost>,
        com.commercetools.api.client.ExpandableTrait<ByProjectKeyStoresKeyByKeyPost>,
        com.commercetools.api.client.Deprecatable200Trait<ByProjectKeyStoresKeyByKeyPost>,
        com.commercetools.api.client.ErrorableTrait<ByProjectKeyStoresKeyByKeyPost> {

    private String projectKey;
    private String key;

    private com.commercetools.api.models.store.StoreUpdate storeUpdate;

    public ByProjectKeyStoresKeyByKeyPost(final ApiHttpClient apiHttpClient, String projectKey, String key,
            com.commercetools.api.models.store.StoreUpdate storeUpdate) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.key = key;
        this.storeUpdate = storeUpdate;
    }

    public ByProjectKeyStoresKeyByKeyPost(ByProjectKeyStoresKeyByKeyPost t) {
        super(t);
        this.projectKey = t.projectKey;
        this.key = t.key;
        this.storeUpdate = t.storeUpdate;
    }

    @Override
    protected ApiHttpRequest buildHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("/%s/stores/key=%s", this.projectKey, this.key);
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(),
            io.vrap.rmf.base.client.utils.json.JsonUtils
                    .executing(() -> apiHttpClient().getSerializerService().toJsonByteArray(storeUpdate)));

    }

    @Override
    public ApiHttpResponse<com.commercetools.api.models.store.Store> executeBlocking(final ApiHttpClient client,
            final Duration timeout) {
        return executeBlocking(client, timeout, com.commercetools.api.models.store.Store.class);
    }

    @Override
    public CompletableFuture<ApiHttpResponse<com.commercetools.api.models.store.Store>> execute(
            final ApiHttpClient client) {
        return execute(client, com.commercetools.api.models.store.Store.class);
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
    public <TValue> ByProjectKeyStoresKeyByKeyPost withExpand(final TValue expand) {
        return copy().withQueryParam("expand", expand);
    }

    /**
     * add additional expand query parameter
     */
    public <TValue> ByProjectKeyStoresKeyByKeyPost addExpand(final TValue expand) {
        return copy().addQueryParam("expand", expand);
    }

    /**
     * set expand with the specified value
     */
    public ByProjectKeyStoresKeyByKeyPost withExpand(final Supplier<String> supplier) {
        return copy().withQueryParam("expand", supplier.get());
    }

    /**
     * add additional expand query parameter
     */
    public ByProjectKeyStoresKeyByKeyPost addExpand(final Supplier<String> supplier) {
        return copy().addQueryParam("expand", supplier.get());
    }

    /**
     * set expand with the specified value
     */
    public ByProjectKeyStoresKeyByKeyPost withExpand(final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("expand", op.apply(new StringBuilder()));
    }

    /**
     * add additional expand query parameter
     */
    public ByProjectKeyStoresKeyByKeyPost addExpand(final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("expand", op.apply(new StringBuilder()));
    }

    /**
     * set expand with the specified values
     */
    public <TValue> ByProjectKeyStoresKeyByKeyPost withExpand(final List<TValue> expand) {
        return copy().withoutQueryParam("expand")
                .addQueryParams(
                    expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional expand query parameters
     */
    public <TValue> ByProjectKeyStoresKeyByKeyPost addExpand(final List<TValue> expand) {
        return copy().addQueryParams(
            expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList()));
    }

    public com.commercetools.api.models.store.StoreUpdate getBody() {
        return storeUpdate;
    }

    public ByProjectKeyStoresKeyByKeyPost withBody(com.commercetools.api.models.store.StoreUpdate storeUpdate) {
        ByProjectKeyStoresKeyByKeyPost t = copy();
        t.storeUpdate = storeUpdate;
        return t;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ByProjectKeyStoresKeyByKeyPost that = (ByProjectKeyStoresKeyByKeyPost) o;

        return new EqualsBuilder().append(projectKey, that.projectKey)
                .append(key, that.key)
                .append(storeUpdate, that.storeUpdate)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(projectKey).append(key).append(storeUpdate).toHashCode();
    }

    @Override
    protected ByProjectKeyStoresKeyByKeyPost copy() {
        return new ByProjectKeyStoresKeyByKeyPost(this);
    }
}
