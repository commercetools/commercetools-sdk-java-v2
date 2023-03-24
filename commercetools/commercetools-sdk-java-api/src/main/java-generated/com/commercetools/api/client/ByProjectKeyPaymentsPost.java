
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

import io.vrap.rmf.base.client.*;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 *  <p>Creating a Payment produces the PaymentCreated Message.</p>
 *
 * <hr>
 * <div class=code-example>
 * <pre><code class='java'>{@code
 *   CompletableFuture<ApiHttpResponse<com.commercetools.api.models.payment.Payment>> result = apiRoot
 *            .withProjectKey("{projectKey}")
 *            .payments()
 *            .post(null)
 *            .execute()
 * }</code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyPaymentsPost extends
        BodyApiMethod<ByProjectKeyPaymentsPost, com.commercetools.api.models.payment.Payment, com.commercetools.api.models.payment.PaymentDraft>
        implements com.commercetools.api.client.ExpandableTrait<ByProjectKeyPaymentsPost>,
        com.commercetools.api.client.Deprecatable201Trait<ByProjectKeyPaymentsPost>,
        com.commercetools.api.client.ErrorableTrait<ByProjectKeyPaymentsPost> {

    private String projectKey;

    private com.commercetools.api.models.payment.PaymentDraft paymentDraft;

    public ByProjectKeyPaymentsPost(final ApiHttpClient apiHttpClient, String projectKey,
            com.commercetools.api.models.payment.PaymentDraft paymentDraft) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.paymentDraft = paymentDraft;
    }

    public ByProjectKeyPaymentsPost(ByProjectKeyPaymentsPost t) {
        super(t);
        this.projectKey = t.projectKey;
        this.paymentDraft = t.paymentDraft;
    }

    @Override
    protected ApiHttpRequest buildHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("%s/payments", this.projectKey);
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(),
            io.vrap.rmf.base.client.utils.json.JsonUtils
                    .executing(() -> apiHttpClient().getSerializerService().toJsonByteArray(paymentDraft)));

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
     * @return ByProjectKeyPaymentsPost
     */
    public <TValue> ByProjectKeyPaymentsPost withExpand(final TValue expand) {
        return copy().withQueryParam("expand", expand);
    }

    /**
     * add additional expand query parameter
     * @param expand value to be added
     * @param <TValue> value type
     * @return ByProjectKeyPaymentsPost
     */
    public <TValue> ByProjectKeyPaymentsPost addExpand(final TValue expand) {
        return copy().addQueryParam("expand", expand);
    }

    /**
     * set expand with the specified value
     * @param supplier supplier for the value to be set
     * @return ByProjectKeyPaymentsPost
     */
    public ByProjectKeyPaymentsPost withExpand(final Supplier<String> supplier) {
        return copy().withQueryParam("expand", supplier.get());
    }

    /**
     * add additional expand query parameter
     * @param supplier supplier for the value to be added
     * @return ByProjectKeyPaymentsPost
     */
    public ByProjectKeyPaymentsPost addExpand(final Supplier<String> supplier) {
        return copy().addQueryParam("expand", supplier.get());
    }

    /**
     * set expand with the specified value
     * @param op builder for the value to be set
     * @return ByProjectKeyPaymentsPost
     */
    public ByProjectKeyPaymentsPost withExpand(final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("expand", op.apply(new StringBuilder()));
    }

    /**
     * add additional expand query parameter
     * @param op builder for the value to be added
     * @return ByProjectKeyPaymentsPost
     */
    public ByProjectKeyPaymentsPost addExpand(final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("expand", op.apply(new StringBuilder()));
    }

    /**
     * set expand with the specified values
     * @param expand values to be set
     * @param <TValue> value type
     * @return ByProjectKeyPaymentsPost
     */
    public <TValue> ByProjectKeyPaymentsPost withExpand(final Collection<TValue> expand) {
        return copy().withoutQueryParam("expand")
                .addQueryParams(
                    expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional expand query parameters
     * @param expand values to be added
     * @param <TValue> value type
     * @return ByProjectKeyPaymentsPost
     */
    public <TValue> ByProjectKeyPaymentsPost addExpand(final Collection<TValue> expand) {
        return copy().addQueryParams(
            expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList()));
    }

    public com.commercetools.api.models.payment.PaymentDraft getBody() {
        return paymentDraft;
    }

    public ByProjectKeyPaymentsPost withBody(com.commercetools.api.models.payment.PaymentDraft paymentDraft) {
        ByProjectKeyPaymentsPost t = copy();
        t.paymentDraft = paymentDraft;
        return t;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ByProjectKeyPaymentsPost that = (ByProjectKeyPaymentsPost) o;

        return new EqualsBuilder().append(projectKey, that.projectKey)
                .append(paymentDraft, that.paymentDraft)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(projectKey).append(paymentDraft).toHashCode();
    }

    @Override
    protected ByProjectKeyPaymentsPost copy() {
        return new ByProjectKeyPaymentsPost(this);
    }
}
