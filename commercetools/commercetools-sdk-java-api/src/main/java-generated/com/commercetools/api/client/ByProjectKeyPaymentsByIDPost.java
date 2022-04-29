
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
public class ByProjectKeyPaymentsByIDPost extends
        BodyApiMethod<ByProjectKeyPaymentsByIDPost, com.commercetools.api.models.payment.Payment, com.commercetools.api.models.payment.PaymentUpdate>
        implements com.commercetools.api.client.ConflictingTrait<ByProjectKeyPaymentsByIDPost>,
        com.commercetools.api.client.ExpandableTrait<ByProjectKeyPaymentsByIDPost>,
        com.commercetools.api.client.Deprecatable200Trait<ByProjectKeyPaymentsByIDPost>,
        com.commercetools.api.client.ErrorableTrait<ByProjectKeyPaymentsByIDPost> {

    private String projectKey;
    private String ID;

    private com.commercetools.api.models.payment.PaymentUpdate paymentUpdate;

    public ByProjectKeyPaymentsByIDPost(final ApiHttpClient apiHttpClient, String projectKey, String ID,
            com.commercetools.api.models.payment.PaymentUpdate paymentUpdate) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.ID = ID;
        this.paymentUpdate = paymentUpdate;
    }

    public ByProjectKeyPaymentsByIDPost(ByProjectKeyPaymentsByIDPost t) {
        super(t);
        this.projectKey = t.projectKey;
        this.ID = t.ID;
        this.paymentUpdate = t.paymentUpdate;
    }

    @Override
    protected ApiHttpRequest buildHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("/%s/payments/%s", this.projectKey, this.ID);
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(),
            io.vrap.rmf.base.client.utils.json.JsonUtils
                    .executing(() -> apiHttpClient().getSerializerService().toJsonByteArray(paymentUpdate)));

    }

    @Override
    public ApiHttpResponse<com.commercetools.api.models.payment.Payment> executeBlocking(final ApiHttpClient client,
            final Duration timeout) {
        return executeBlocking(client, timeout, com.commercetools.api.models.payment.Payment.class);
    }

    @Override
    public CompletableFuture<ApiHttpResponse<com.commercetools.api.models.payment.Payment>> execute(
            final ApiHttpClient client) {
        return execute(client, com.commercetools.api.models.payment.Payment.class);
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
    public <TValue> ByProjectKeyPaymentsByIDPost withExpand(final TValue expand) {
        return copy().withQueryParam("expand", expand);
    }

    /**
     * add additional expand query parameter
     */
    public <TValue> ByProjectKeyPaymentsByIDPost addExpand(final TValue expand) {
        return copy().addQueryParam("expand", expand);
    }

    /**
     * set expand with the specified value
     */
    public ByProjectKeyPaymentsByIDPost withExpand(final Supplier<String> supplier) {
        return copy().withQueryParam("expand", supplier.get());
    }

    /**
     * add additional expand query parameter
     */
    public ByProjectKeyPaymentsByIDPost addExpand(final Supplier<String> supplier) {
        return copy().addQueryParam("expand", supplier.get());
    }

    /**
     * set expand with the specified value
     */
    public ByProjectKeyPaymentsByIDPost withExpand(final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("expand", op.apply(new StringBuilder()));
    }

    /**
     * add additional expand query parameter
     */
    public ByProjectKeyPaymentsByIDPost addExpand(final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("expand", op.apply(new StringBuilder()));
    }

    /**
     * set expand with the specified values
     */
    public <TValue> ByProjectKeyPaymentsByIDPost withExpand(final List<TValue> expand) {
        return copy().withoutQueryParam("expand")
                .addQueryParams(
                    expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional expand query parameters
     */
    public <TValue> ByProjectKeyPaymentsByIDPost addExpand(final List<TValue> expand) {
        return copy().addQueryParams(
            expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList()));
    }

    public com.commercetools.api.models.payment.PaymentUpdate getBody() {
        return paymentUpdate;
    }

    public ByProjectKeyPaymentsByIDPost withBody(com.commercetools.api.models.payment.PaymentUpdate paymentUpdate) {
        ByProjectKeyPaymentsByIDPost t = copy();
        t.paymentUpdate = paymentUpdate;
        return t;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ByProjectKeyPaymentsByIDPost that = (ByProjectKeyPaymentsByIDPost) o;

        return new EqualsBuilder().append(projectKey, that.projectKey)
                .append(ID, that.ID)
                .append(paymentUpdate, that.paymentUpdate)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(projectKey).append(ID).append(paymentUpdate).toHashCode();
    }

    @Override
    protected ByProjectKeyPaymentsByIDPost copy() {
        return new ByProjectKeyPaymentsByIDPost(this);
    }
}
