
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

/**
*  <p>Deprecated scope: <code>manage_orders:{projectKey}</code></p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ByProjectKeyDiscountCodesByIDPost extends
        BodyApiMethod<ByProjectKeyDiscountCodesByIDPost, com.commercetools.api.models.discount_code.DiscountCode, com.commercetools.api.models.discount_code.DiscountCodeUpdate>
        implements com.commercetools.api.client.ConflictingTrait<ByProjectKeyDiscountCodesByIDPost>,
        com.commercetools.api.client.ExpandableTrait<ByProjectKeyDiscountCodesByIDPost>,
        com.commercetools.api.client.Deprecatable200Trait<ByProjectKeyDiscountCodesByIDPost>,
        com.commercetools.api.client.ErrorableTrait<ByProjectKeyDiscountCodesByIDPost> {

    private String projectKey;
    private String ID;

    private com.commercetools.api.models.discount_code.DiscountCodeUpdate discountCodeUpdate;

    public ByProjectKeyDiscountCodesByIDPost(final ApiHttpClient apiHttpClient, String projectKey, String ID,
            com.commercetools.api.models.discount_code.DiscountCodeUpdate discountCodeUpdate) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.ID = ID;
        this.discountCodeUpdate = discountCodeUpdate;
    }

    public ByProjectKeyDiscountCodesByIDPost(ByProjectKeyDiscountCodesByIDPost t) {
        super(t);
        this.projectKey = t.projectKey;
        this.ID = t.ID;
        this.discountCodeUpdate = t.discountCodeUpdate;
    }

    @Override
    protected ApiHttpRequest buildHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("/%s/discount-codes/%s", this.projectKey, this.ID);
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(),
            io.vrap.rmf.base.client.utils.json.JsonUtils
                    .executing(() -> apiHttpClient().getSerializerService().toJsonByteArray(discountCodeUpdate)));

    }

    @Override
    public ApiHttpResponse<com.commercetools.api.models.discount_code.DiscountCode> executeBlocking(
            final ApiHttpClient client, final Duration timeout) {
        return executeBlocking(client, timeout, com.commercetools.api.models.discount_code.DiscountCode.class);
    }

    @Override
    public CompletableFuture<ApiHttpResponse<com.commercetools.api.models.discount_code.DiscountCode>> execute(
            final ApiHttpClient client) {
        return execute(client, com.commercetools.api.models.discount_code.DiscountCode.class);
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
    public <TValue> ByProjectKeyDiscountCodesByIDPost withExpand(final TValue expand) {
        return copy().withQueryParam("expand", expand);
    }

    /**
     * add additional expand query parameter
     */
    public <TValue> ByProjectKeyDiscountCodesByIDPost addExpand(final TValue expand) {
        return copy().addQueryParam("expand", expand);
    }

    /**
     * set expand with the specified value
     */
    public ByProjectKeyDiscountCodesByIDPost withExpand(final Supplier<String> supplier) {
        return copy().withQueryParam("expand", supplier.get());
    }

    /**
     * add additional expand query parameter
     */
    public ByProjectKeyDiscountCodesByIDPost addExpand(final Supplier<String> supplier) {
        return copy().addQueryParam("expand", supplier.get());
    }

    /**
     * set expand with the specified value
     */
    public ByProjectKeyDiscountCodesByIDPost withExpand(final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("expand", op.apply(new StringBuilder()));
    }

    /**
     * add additional expand query parameter
     */
    public ByProjectKeyDiscountCodesByIDPost addExpand(final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("expand", op.apply(new StringBuilder()));
    }

    /**
     * set expand with the specified values
     */
    public <TValue> ByProjectKeyDiscountCodesByIDPost withExpand(final List<TValue> expand) {
        return copy().withoutQueryParam("expand")
                .addQueryParams(
                    expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional expand query parameters
     */
    public <TValue> ByProjectKeyDiscountCodesByIDPost addExpand(final List<TValue> expand) {
        return copy().addQueryParams(
            expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList()));
    }

    public com.commercetools.api.models.discount_code.DiscountCodeUpdate getBody() {
        return discountCodeUpdate;
    }

    public ByProjectKeyDiscountCodesByIDPost withBody(
            com.commercetools.api.models.discount_code.DiscountCodeUpdate discountCodeUpdate) {
        ByProjectKeyDiscountCodesByIDPost t = copy();
        t.discountCodeUpdate = discountCodeUpdate;
        return t;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ByProjectKeyDiscountCodesByIDPost that = (ByProjectKeyDiscountCodesByIDPost) o;

        return new EqualsBuilder().append(projectKey, that.projectKey)
                .append(ID, that.ID)
                .append(discountCodeUpdate, that.discountCodeUpdate)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(projectKey).append(ID).append(discountCodeUpdate).toHashCode();
    }

    @Override
    protected ByProjectKeyDiscountCodesByIDPost copy() {
        return new ByProjectKeyDiscountCodesByIDPost(this);
    }
}
