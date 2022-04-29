
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
public class ByProjectKeyShippingMethodsByIDPost extends
        BodyApiMethod<ByProjectKeyShippingMethodsByIDPost, com.commercetools.api.models.shipping_method.ShippingMethod, com.commercetools.api.models.shipping_method.ShippingMethodUpdate>
        implements com.commercetools.api.client.ConflictingTrait<ByProjectKeyShippingMethodsByIDPost>,
        com.commercetools.api.client.ExpandableTrait<ByProjectKeyShippingMethodsByIDPost>,
        com.commercetools.api.client.Deprecatable200Trait<ByProjectKeyShippingMethodsByIDPost>,
        com.commercetools.api.client.ErrorableTrait<ByProjectKeyShippingMethodsByIDPost> {

    private String projectKey;
    private String ID;

    private com.commercetools.api.models.shipping_method.ShippingMethodUpdate shippingMethodUpdate;

    public ByProjectKeyShippingMethodsByIDPost(final ApiHttpClient apiHttpClient, String projectKey, String ID,
            com.commercetools.api.models.shipping_method.ShippingMethodUpdate shippingMethodUpdate) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.ID = ID;
        this.shippingMethodUpdate = shippingMethodUpdate;
    }

    public ByProjectKeyShippingMethodsByIDPost(ByProjectKeyShippingMethodsByIDPost t) {
        super(t);
        this.projectKey = t.projectKey;
        this.ID = t.ID;
        this.shippingMethodUpdate = t.shippingMethodUpdate;
    }

    @Override
    protected ApiHttpRequest buildHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("/%s/shipping-methods/%s", this.projectKey, this.ID);
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(),
            io.vrap.rmf.base.client.utils.json.JsonUtils
                    .executing(() -> apiHttpClient().getSerializerService().toJsonByteArray(shippingMethodUpdate)));

    }

    @Override
    public ApiHttpResponse<com.commercetools.api.models.shipping_method.ShippingMethod> executeBlocking(
            final ApiHttpClient client, final Duration timeout) {
        return executeBlocking(client, timeout, com.commercetools.api.models.shipping_method.ShippingMethod.class);
    }

    @Override
    public CompletableFuture<ApiHttpResponse<com.commercetools.api.models.shipping_method.ShippingMethod>> execute(
            final ApiHttpClient client) {
        return execute(client, com.commercetools.api.models.shipping_method.ShippingMethod.class);
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
     * set expand with the specified value
     */
    public <TValue> ByProjectKeyShippingMethodsByIDPost withExpand(final TValue expand) {
        return copy().withQueryParam("expand", expand);
    }

    /**
     * add additional expand query parameter
     */
    public <TValue> ByProjectKeyShippingMethodsByIDPost addExpand(final TValue expand) {
        return copy().addQueryParam("expand", expand);
    }

    /**
     * set expand with the specified value
     */
    public ByProjectKeyShippingMethodsByIDPost withExpand(final Supplier<String> supplier) {
        return copy().withQueryParam("expand", supplier.get());
    }

    /**
     * add additional expand query parameter
     */
    public ByProjectKeyShippingMethodsByIDPost addExpand(final Supplier<String> supplier) {
        return copy().addQueryParam("expand", supplier.get());
    }

    /**
     * set expand with the specified value
     */
    public ByProjectKeyShippingMethodsByIDPost withExpand(final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("expand", op.apply(new StringBuilder()));
    }

    /**
     * add additional expand query parameter
     */
    public ByProjectKeyShippingMethodsByIDPost addExpand(final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("expand", op.apply(new StringBuilder()));
    }

    /**
     * set expand with the specified values
     */
    public <TValue> ByProjectKeyShippingMethodsByIDPost withExpand(final List<TValue> expand) {
        return copy().withoutQueryParam("expand")
                .addQueryParams(
                    expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional expand query parameters
     */
    public <TValue> ByProjectKeyShippingMethodsByIDPost addExpand(final List<TValue> expand) {
        return copy().addQueryParams(
            expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList()));
    }

    public com.commercetools.api.models.shipping_method.ShippingMethodUpdate getBody() {
        return shippingMethodUpdate;
    }

    public ByProjectKeyShippingMethodsByIDPost withBody(
            com.commercetools.api.models.shipping_method.ShippingMethodUpdate shippingMethodUpdate) {
        ByProjectKeyShippingMethodsByIDPost t = copy();
        t.shippingMethodUpdate = shippingMethodUpdate;
        return t;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ByProjectKeyShippingMethodsByIDPost that = (ByProjectKeyShippingMethodsByIDPost) o;

        return new EqualsBuilder().append(projectKey, that.projectKey)
                .append(ID, that.ID)
                .append(shippingMethodUpdate, that.shippingMethodUpdate)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(projectKey).append(ID).append(shippingMethodUpdate).toHashCode();
    }

    @Override
    protected ByProjectKeyShippingMethodsByIDPost copy() {
        return new ByProjectKeyShippingMethodsByIDPost(this);
    }
}
