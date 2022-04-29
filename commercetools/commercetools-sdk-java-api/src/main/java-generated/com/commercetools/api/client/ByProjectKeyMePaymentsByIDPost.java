
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
public class ByProjectKeyMePaymentsByIDPost extends
        BodyApiMethod<ByProjectKeyMePaymentsByIDPost, com.commercetools.api.models.me.MyPayment, com.commercetools.api.models.me.MyPaymentUpdate>
        implements com.commercetools.api.client.ConflictingTrait<ByProjectKeyMePaymentsByIDPost>,
        com.commercetools.api.client.ExpandableTrait<ByProjectKeyMePaymentsByIDPost>,
        com.commercetools.api.client.Deprecatable200Trait<ByProjectKeyMePaymentsByIDPost>,
        com.commercetools.api.client.ErrorableTrait<ByProjectKeyMePaymentsByIDPost> {

    private String projectKey;
    private String ID;

    private com.commercetools.api.models.me.MyPaymentUpdate myPaymentUpdate;

    public ByProjectKeyMePaymentsByIDPost(final ApiHttpClient apiHttpClient, String projectKey, String ID,
            com.commercetools.api.models.me.MyPaymentUpdate myPaymentUpdate) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.ID = ID;
        this.myPaymentUpdate = myPaymentUpdate;
    }

    public ByProjectKeyMePaymentsByIDPost(ByProjectKeyMePaymentsByIDPost t) {
        super(t);
        this.projectKey = t.projectKey;
        this.ID = t.ID;
        this.myPaymentUpdate = t.myPaymentUpdate;
    }

    @Override
    protected ApiHttpRequest buildHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("/%s/me/payments/%s", this.projectKey, this.ID);
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(),
            io.vrap.rmf.base.client.utils.json.JsonUtils
                    .executing(() -> apiHttpClient().getSerializerService().toJsonByteArray(myPaymentUpdate)));

    }

    @Override
    public ApiHttpResponse<com.commercetools.api.models.me.MyPayment> executeBlocking(final ApiHttpClient client,
            final Duration timeout) {
        return executeBlocking(client, timeout, com.commercetools.api.models.me.MyPayment.class);
    }

    @Override
    public CompletableFuture<ApiHttpResponse<com.commercetools.api.models.me.MyPayment>> execute(
            final ApiHttpClient client) {
        return execute(client, com.commercetools.api.models.me.MyPayment.class);
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
    public <TValue> ByProjectKeyMePaymentsByIDPost withExpand(final TValue expand) {
        return copy().withQueryParam("expand", expand);
    }

    /**
     * add additional expand query parameter
     */
    public <TValue> ByProjectKeyMePaymentsByIDPost addExpand(final TValue expand) {
        return copy().addQueryParam("expand", expand);
    }

    /**
     * set expand with the specified value
     */
    public ByProjectKeyMePaymentsByIDPost withExpand(final Supplier<String> supplier) {
        return copy().withQueryParam("expand", supplier.get());
    }

    /**
     * add additional expand query parameter
     */
    public ByProjectKeyMePaymentsByIDPost addExpand(final Supplier<String> supplier) {
        return copy().addQueryParam("expand", supplier.get());
    }

    /**
     * set expand with the specified value
     */
    public ByProjectKeyMePaymentsByIDPost withExpand(final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("expand", op.apply(new StringBuilder()));
    }

    /**
     * add additional expand query parameter
     */
    public ByProjectKeyMePaymentsByIDPost addExpand(final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("expand", op.apply(new StringBuilder()));
    }

    /**
     * set expand with the specified values
     */
    public <TValue> ByProjectKeyMePaymentsByIDPost withExpand(final List<TValue> expand) {
        return copy().withoutQueryParam("expand")
                .addQueryParams(
                    expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional expand query parameters
     */
    public <TValue> ByProjectKeyMePaymentsByIDPost addExpand(final List<TValue> expand) {
        return copy().addQueryParams(
            expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList()));
    }

    public com.commercetools.api.models.me.MyPaymentUpdate getBody() {
        return myPaymentUpdate;
    }

    public ByProjectKeyMePaymentsByIDPost withBody(com.commercetools.api.models.me.MyPaymentUpdate myPaymentUpdate) {
        ByProjectKeyMePaymentsByIDPost t = copy();
        t.myPaymentUpdate = myPaymentUpdate;
        return t;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ByProjectKeyMePaymentsByIDPost that = (ByProjectKeyMePaymentsByIDPost) o;

        return new EqualsBuilder().append(projectKey, that.projectKey)
                .append(ID, that.ID)
                .append(myPaymentUpdate, that.myPaymentUpdate)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(projectKey).append(ID).append(myPaymentUpdate).toHashCode();
    }

    @Override
    protected ByProjectKeyMePaymentsByIDPost copy() {
        return new ByProjectKeyMePaymentsByIDPost(this);
    }
}
