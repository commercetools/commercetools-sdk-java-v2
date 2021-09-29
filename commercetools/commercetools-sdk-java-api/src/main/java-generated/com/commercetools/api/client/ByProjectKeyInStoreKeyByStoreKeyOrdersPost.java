
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

/**
*  <p>Creates an order from a Cart from a specific Store. The {storeKey} path parameter maps to a Store's key.
*  When using this endpoint the orders's store field is always set to the store specified in the path parameter.
*  The cart must have a shipping address set before creating an order. When using the Platform TaxMode,
*  the shipping address is used for tax calculation.</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ByProjectKeyInStoreKeyByStoreKeyOrdersPost
        extends ApiMethod<ByProjectKeyInStoreKeyByStoreKeyOrdersPost, com.commercetools.api.models.order.Order>
        implements com.commercetools.api.client.ExpandableTrait<ByProjectKeyInStoreKeyByStoreKeyOrdersPost>,
        com.commercetools.api.client.Deprecatable201Trait<ByProjectKeyInStoreKeyByStoreKeyOrdersPost>,
        com.commercetools.api.client.ErrorableTrait<ByProjectKeyInStoreKeyByStoreKeyOrdersPost> {

    private String projectKey;
    private String storeKey;

    private com.commercetools.api.models.order.OrderFromCartDraft orderFromCartDraft;

    public ByProjectKeyInStoreKeyByStoreKeyOrdersPost(final ApiHttpClient apiHttpClient, String projectKey,
            String storeKey, com.commercetools.api.models.order.OrderFromCartDraft orderFromCartDraft) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.storeKey = storeKey;
        this.orderFromCartDraft = orderFromCartDraft;
    }

    public ByProjectKeyInStoreKeyByStoreKeyOrdersPost(ByProjectKeyInStoreKeyByStoreKeyOrdersPost t) {
        super(t);
        this.projectKey = t.projectKey;
        this.storeKey = t.storeKey;
        this.orderFromCartDraft = t.orderFromCartDraft;
    }

    @Override
    public ApiHttpRequest createHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("/%s/in-store/key=%s/orders", this.projectKey, this.storeKey);
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        try {
            final byte[] body = apiHttpClient().getSerializerService().toJsonByteArray(orderFromCartDraft);
            return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(), body);
        }
        catch (Exception e) {
            e.printStackTrace();
        }

        return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(), null);
    }

    @Override
    public ApiHttpResponse<com.commercetools.api.models.order.Order> executeBlocking(final ApiHttpClient client,
            Duration timeout) {
        ApiHttpRequest request = this.createHttpRequest();
        return blockingWait(
            client.execute(request, com.commercetools.api.models.order.Order.class).toCompletableFuture(), request,
            timeout);
    }

    @Override
    public CompletableFuture<ApiHttpResponse<com.commercetools.api.models.order.Order>> execute(
            final ApiHttpClient client) {
        return client.execute(this.createHttpRequest(), com.commercetools.api.models.order.Order.class)
                .toCompletableFuture();
    }

    public String getProjectKey() {
        return this.projectKey;
    }

    public String getStoreKey() {
        return this.storeKey;
    }

    public List<String> getExpand() {
        return this.getQueryParam("expand");
    }

    public void setProjectKey(final String projectKey) {
        this.projectKey = projectKey;
    }

    public void setStoreKey(final String storeKey) {
        this.storeKey = storeKey;
    }

    /**
     * set expand with the specificied value
     */
    public ByProjectKeyInStoreKeyByStoreKeyOrdersPost withExpand(final String expand) {
        return copy().withQueryParam("expand", expand);
    }

    /**
     * add additional expand query parameter
     */
    public ByProjectKeyInStoreKeyByStoreKeyOrdersPost addExpand(final String expand) {
        return copy().addQueryParam("expand", expand);
    }

    /**
     * set expand with the specificied values
     */
    public ByProjectKeyInStoreKeyByStoreKeyOrdersPost withExpand(final List<String> expand) {
        return copy().withoutQueryParam("expand")
                .addQueryParams(
                    expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional expand query parameters
     */
    public ByProjectKeyInStoreKeyByStoreKeyOrdersPost addExpand(final List<String> expand) {
        return copy().addQueryParams(
            expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList()));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ByProjectKeyInStoreKeyByStoreKeyOrdersPost that = (ByProjectKeyInStoreKeyByStoreKeyOrdersPost) o;

        return new EqualsBuilder().append(projectKey, that.projectKey)
                .append(storeKey, that.storeKey)
                .append(orderFromCartDraft, that.orderFromCartDraft)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(projectKey).append(storeKey).append(orderFromCartDraft).toHashCode();
    }

    @Override
    protected ByProjectKeyInStoreKeyByStoreKeyOrdersPost copy() {
        return new ByProjectKeyInStoreKeyByStoreKeyOrdersPost(this);
    }
}
