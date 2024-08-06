
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
 *  <p>Creates a Cart in a Store for the Customer or anonymous user. The <code>customerId</code> or <code>anonymousId</code> field on the Cart is automatically set based on the customer:{id} or anonymous_id:{id} scope.</p>
 *  <p>The <code>store</code> field in the created Cart is set to the Store specified by the <code>storeKey</code> path parameter.</p>
 *  <p>Specific Error Codes:</p>
 *  <ul>
 *   <li>CountryNotConfiguredInStore</li>
 *   <li>DiscountCodeNonApplicable</li>
 *   <li>InvalidItemShippingDetails</li>
 *   <li>MatchingPriceNotFound</li>
 *   <li>MissingTaxRateForCountry</li>
 *  </ul>
 *
 * <hr>
 * <div class=code-example>
 * <pre><code class='java'>{@code
 *   CompletableFuture<ApiHttpResponse<com.commercetools.api.models.cart.Cart>> result = apiRoot
 *            .withProjectKey("{projectKey}")
 *            .inStoreKeyWithStoreKeyValue("{storeKey}")
 *            .me()
 *            .carts()
 *            .post(null)
 *            .execute()
 * }</code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyInStoreKeyByStoreKeyMeCartsPost extends
        TypeBodyApiMethod<ByProjectKeyInStoreKeyByStoreKeyMeCartsPost, com.commercetools.api.models.cart.Cart, com.commercetools.api.models.me.MyCartDraft>
        implements com.commercetools.api.client.ExpandableTrait<ByProjectKeyInStoreKeyByStoreKeyMeCartsPost>,
        com.commercetools.api.client.Deprecatable201Trait<ByProjectKeyInStoreKeyByStoreKeyMeCartsPost>,
        com.commercetools.api.client.ErrorableTrait<ByProjectKeyInStoreKeyByStoreKeyMeCartsPost> {

    @Override
    public TypeReference<com.commercetools.api.models.cart.Cart> resultType() {
        return new TypeReference<com.commercetools.api.models.cart.Cart>() {
        };
    }

    private String projectKey;
    private String storeKey;

    private com.commercetools.api.models.me.MyCartDraft myCartDraft;

    public ByProjectKeyInStoreKeyByStoreKeyMeCartsPost(final ApiHttpClient apiHttpClient, String projectKey,
            String storeKey, com.commercetools.api.models.me.MyCartDraft myCartDraft) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.storeKey = storeKey;
        this.myCartDraft = myCartDraft;
    }

    public ByProjectKeyInStoreKeyByStoreKeyMeCartsPost(ByProjectKeyInStoreKeyByStoreKeyMeCartsPost t) {
        super(t);
        this.projectKey = t.projectKey;
        this.storeKey = t.storeKey;
        this.myCartDraft = t.myCartDraft;
    }

    @Override
    protected ApiHttpRequest buildHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("%s/in-store/key=%s/me/carts", encodePathParam(this.projectKey),
            encodePathParam(this.storeKey));
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(),
            io.vrap.rmf.base.client.utils.json.JsonUtils
                    .executing(() -> apiHttpClient().getSerializerService().toJsonByteArray(myCartDraft)));

    }

    @Override
    public ApiHttpResponse<com.commercetools.api.models.cart.Cart> executeBlocking(final ApiHttpClient client,
            final Duration timeout) {
        return executeBlocking(client, timeout, com.commercetools.api.models.cart.Cart.class);
    }

    @Override
    public CompletableFuture<ApiHttpResponse<com.commercetools.api.models.cart.Cart>> execute(
            final ApiHttpClient client) {
        return execute(client, com.commercetools.api.models.cart.Cart.class);
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
     * set expand with the specified value
     * @param expand value to be set
     * @param <TValue> value type
     * @return ByProjectKeyInStoreKeyByStoreKeyMeCartsPost
     */
    public <TValue> ByProjectKeyInStoreKeyByStoreKeyMeCartsPost withExpand(final TValue expand) {
        return copy().withQueryParam("expand", expand);
    }

    /**
     * add additional expand query parameter
     * @param expand value to be added
     * @param <TValue> value type
     * @return ByProjectKeyInStoreKeyByStoreKeyMeCartsPost
     */
    public <TValue> ByProjectKeyInStoreKeyByStoreKeyMeCartsPost addExpand(final TValue expand) {
        return copy().addQueryParam("expand", expand);
    }

    /**
     * set expand with the specified value
     * @param supplier supplier for the value to be set
     * @return ByProjectKeyInStoreKeyByStoreKeyMeCartsPost
     */
    public ByProjectKeyInStoreKeyByStoreKeyMeCartsPost withExpand(final Supplier<String> supplier) {
        return copy().withQueryParam("expand", supplier.get());
    }

    /**
     * add additional expand query parameter
     * @param supplier supplier for the value to be added
     * @return ByProjectKeyInStoreKeyByStoreKeyMeCartsPost
     */
    public ByProjectKeyInStoreKeyByStoreKeyMeCartsPost addExpand(final Supplier<String> supplier) {
        return copy().addQueryParam("expand", supplier.get());
    }

    /**
     * set expand with the specified value
     * @param op builder for the value to be set
     * @return ByProjectKeyInStoreKeyByStoreKeyMeCartsPost
     */
    public ByProjectKeyInStoreKeyByStoreKeyMeCartsPost withExpand(final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("expand", op.apply(new StringBuilder()));
    }

    /**
     * add additional expand query parameter
     * @param op builder for the value to be added
     * @return ByProjectKeyInStoreKeyByStoreKeyMeCartsPost
     */
    public ByProjectKeyInStoreKeyByStoreKeyMeCartsPost addExpand(final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("expand", op.apply(new StringBuilder()));
    }

    /**
     * set expand with the specified values
     * @param expand values to be set
     * @param <TValue> value type
     * @return ByProjectKeyInStoreKeyByStoreKeyMeCartsPost
     */
    public <TValue> ByProjectKeyInStoreKeyByStoreKeyMeCartsPost withExpand(final Collection<TValue> expand) {
        return copy().withoutQueryParam("expand")
                .addQueryParams(
                    expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional expand query parameters
     * @param expand values to be added
     * @param <TValue> value type
     * @return ByProjectKeyInStoreKeyByStoreKeyMeCartsPost
     */
    public <TValue> ByProjectKeyInStoreKeyByStoreKeyMeCartsPost addExpand(final Collection<TValue> expand) {
        return copy().addQueryParams(
            expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList()));
    }

    public com.commercetools.api.models.me.MyCartDraft getBody() {
        return myCartDraft;
    }

    public ByProjectKeyInStoreKeyByStoreKeyMeCartsPost withBody(
            com.commercetools.api.models.me.MyCartDraft myCartDraft) {
        ByProjectKeyInStoreKeyByStoreKeyMeCartsPost t = copy();
        t.myCartDraft = myCartDraft;
        return t;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ByProjectKeyInStoreKeyByStoreKeyMeCartsPost that = (ByProjectKeyInStoreKeyByStoreKeyMeCartsPost) o;

        return new EqualsBuilder().append(projectKey, that.projectKey)
                .append(storeKey, that.storeKey)
                .append(myCartDraft, that.myCartDraft)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(projectKey).append(storeKey).append(myCartDraft).toHashCode();
    }

    @Override
    protected ByProjectKeyInStoreKeyByStoreKeyMeCartsPost copy() {
        return new ByProjectKeyInStoreKeyByStoreKeyMeCartsPost(this);
    }
}
