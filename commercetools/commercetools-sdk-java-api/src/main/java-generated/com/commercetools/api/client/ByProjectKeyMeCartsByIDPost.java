
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
 *  <p>Updates the Cart for a given <code>id</code>. Returns a <code>200 OK</code> status if successful.</p>
 *  <p>A ResourceNotFound error is returned in the following scenarios:</p>
 *  <ul>
 *   <li>If no Cart exists with the provided <code>id</code>.</li>
 *   <li>If the Cart exists but does not have a <code>customerId</code> that matches the customer:{id} scope, or <code>anonymousId</code> that matches the anonymous_id:{id} scope.</li>
 *  </ul>
 *
 * <hr>
 * <div class=code-example>
 * <pre><code class='java'>{@code
 *   CompletableFuture<ApiHttpResponse<com.commercetools.api.models.cart.Cart>> result = apiRoot
 *            .withProjectKey("{projectKey}")
 *            .me()
 *            .carts()
 *            .withId("{ID}")
 *            .post(null)
 *            .execute()
 * }</code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyMeCartsByIDPost extends
        TypeBodyApiMethod<ByProjectKeyMeCartsByIDPost, com.commercetools.api.models.cart.Cart, com.commercetools.api.models.me.MyCartUpdate>
        implements com.commercetools.api.client.ConflictingTrait<ByProjectKeyMeCartsByIDPost>,
        com.commercetools.api.client.ExpandableTrait<ByProjectKeyMeCartsByIDPost>,
        com.commercetools.api.client.Deprecatable200Trait<ByProjectKeyMeCartsByIDPost>,
        com.commercetools.api.client.ErrorableTrait<ByProjectKeyMeCartsByIDPost> {

    @Override
    public TypeReference<com.commercetools.api.models.cart.Cart> resultType() {
        return new TypeReference<com.commercetools.api.models.cart.Cart>() {
        };
    }

    private String projectKey;
    private String ID;

    private com.commercetools.api.models.me.MyCartUpdate myCartUpdate;

    public ByProjectKeyMeCartsByIDPost(final ApiHttpClient apiHttpClient, String projectKey, String ID,
            com.commercetools.api.models.me.MyCartUpdate myCartUpdate) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.ID = ID;
        this.myCartUpdate = myCartUpdate;
    }

    public ByProjectKeyMeCartsByIDPost(ByProjectKeyMeCartsByIDPost t) {
        super(t);
        this.projectKey = t.projectKey;
        this.ID = t.ID;
        this.myCartUpdate = t.myCartUpdate;
    }

    @Override
    protected ApiHttpRequest buildHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("%s/me/carts/%s", encodePathParam(this.projectKey),
            encodePathParam(this.ID));
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(),
            io.vrap.rmf.base.client.utils.json.JsonUtils
                    .executing(() -> apiHttpClient().getSerializerService().toJsonByteArray(myCartUpdate)));

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
     * @param expand value to be set
     * @param <TValue> value type
     * @return ByProjectKeyMeCartsByIDPost
     */
    public <TValue> ByProjectKeyMeCartsByIDPost withExpand(final TValue expand) {
        return copy().withQueryParam("expand", expand);
    }

    /**
     * add additional expand query parameter
     * @param expand value to be added
     * @param <TValue> value type
     * @return ByProjectKeyMeCartsByIDPost
     */
    public <TValue> ByProjectKeyMeCartsByIDPost addExpand(final TValue expand) {
        return copy().addQueryParam("expand", expand);
    }

    /**
     * set expand with the specified value
     * @param supplier supplier for the value to be set
     * @return ByProjectKeyMeCartsByIDPost
     */
    public ByProjectKeyMeCartsByIDPost withExpand(final Supplier<String> supplier) {
        return copy().withQueryParam("expand", supplier.get());
    }

    /**
     * add additional expand query parameter
     * @param supplier supplier for the value to be added
     * @return ByProjectKeyMeCartsByIDPost
     */
    public ByProjectKeyMeCartsByIDPost addExpand(final Supplier<String> supplier) {
        return copy().addQueryParam("expand", supplier.get());
    }

    /**
     * set expand with the specified value
     * @param op builder for the value to be set
     * @return ByProjectKeyMeCartsByIDPost
     */
    public ByProjectKeyMeCartsByIDPost withExpand(final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("expand", op.apply(new StringBuilder()));
    }

    /**
     * add additional expand query parameter
     * @param op builder for the value to be added
     * @return ByProjectKeyMeCartsByIDPost
     */
    public ByProjectKeyMeCartsByIDPost addExpand(final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("expand", op.apply(new StringBuilder()));
    }

    /**
     * set expand with the specified values
     * @param expand values to be set
     * @param <TValue> value type
     * @return ByProjectKeyMeCartsByIDPost
     */
    public <TValue> ByProjectKeyMeCartsByIDPost withExpand(final Collection<TValue> expand) {
        return copy().withoutQueryParam("expand")
                .addQueryParams(
                    expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional expand query parameters
     * @param expand values to be added
     * @param <TValue> value type
     * @return ByProjectKeyMeCartsByIDPost
     */
    public <TValue> ByProjectKeyMeCartsByIDPost addExpand(final Collection<TValue> expand) {
        return copy().addQueryParams(
            expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList()));
    }

    public com.commercetools.api.models.me.MyCartUpdate getBody() {
        return myCartUpdate;
    }

    public ByProjectKeyMeCartsByIDPost withBody(com.commercetools.api.models.me.MyCartUpdate myCartUpdate) {
        ByProjectKeyMeCartsByIDPost t = copy();
        t.myCartUpdate = myCartUpdate;
        return t;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ByProjectKeyMeCartsByIDPost that = (ByProjectKeyMeCartsByIDPost) o;

        return new EqualsBuilder().append(projectKey, that.projectKey)
                .append(ID, that.ID)
                .append(myCartUpdate, that.myCartUpdate)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(projectKey).append(ID).append(myCartUpdate).toHashCode();
    }

    @Override
    protected ByProjectKeyMeCartsByIDPost copy() {
        return new ByProjectKeyMeCartsByIDPost(this);
    }
}
