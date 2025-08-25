
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
 *  <p>Creates a PaymentMethod in the Project. This request generates the <a href="https://docs.commercetools.com/apis/ctp:api:type:PaymentMethodCreatedMessage" rel="nofollow">PaymentMethodCreated</a> Message.</p>
 *
 * <hr>
 * <div class=code-example>
 * <pre><code class='java'>{@code
 *   CompletableFuture<ApiHttpResponse<com.commercetools.api.models.payment_method.PaymentMethod>> result = apiRoot
 *            .withProjectKey("{projectKey}")
 *            .paymentMethods()
 *            .post(null)
 *            .execute()
 * }</code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyPaymentMethodsPost extends
        TypeBodyApiMethod<ByProjectKeyPaymentMethodsPost, com.commercetools.api.models.payment_method.PaymentMethod, com.commercetools.api.models.payment_method.PaymentMethodDraft>
        implements com.commercetools.api.client.ExpandableTrait<ByProjectKeyPaymentMethodsPost>,
        com.commercetools.api.client.Deprecatable201Trait<ByProjectKeyPaymentMethodsPost>,
        com.commercetools.api.client.ErrorableTrait<ByProjectKeyPaymentMethodsPost> {

    @Override
    public TypeReference<com.commercetools.api.models.payment_method.PaymentMethod> resultType() {
        return new TypeReference<com.commercetools.api.models.payment_method.PaymentMethod>() {
        };
    }

    private String projectKey;

    private com.commercetools.api.models.payment_method.PaymentMethodDraft paymentMethodDraft;

    public ByProjectKeyPaymentMethodsPost(final ApiHttpClient apiHttpClient, String projectKey,
            com.commercetools.api.models.payment_method.PaymentMethodDraft paymentMethodDraft) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.paymentMethodDraft = paymentMethodDraft;
    }

    public ByProjectKeyPaymentMethodsPost(ByProjectKeyPaymentMethodsPost t) {
        super(t);
        this.projectKey = t.projectKey;
        this.paymentMethodDraft = t.paymentMethodDraft;
    }

    @Override
    protected ApiHttpRequest buildHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("%s/payment-methods", encodePathParam(this.projectKey));
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(),
            io.vrap.rmf.base.client.utils.json.JsonUtils
                    .executing(() -> apiHttpClient().getSerializerService().toJsonByteArray(paymentMethodDraft)));

    }

    @Override
    public ApiHttpResponse<com.commercetools.api.models.payment_method.PaymentMethod> executeBlocking(
            final ApiHttpClient client, final Duration timeout) {
        return executeBlocking(client, timeout, com.commercetools.api.models.payment_method.PaymentMethod.class);
    }

    @Override
    public CompletableFuture<ApiHttpResponse<com.commercetools.api.models.payment_method.PaymentMethod>> execute(
            final ApiHttpClient client) {
        return execute(client, com.commercetools.api.models.payment_method.PaymentMethod.class);
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
     * @return ByProjectKeyPaymentMethodsPost
     */
    public <TValue> ByProjectKeyPaymentMethodsPost withExpand(final TValue expand) {
        return copy().withQueryParam("expand", expand);
    }

    /**
     * add additional expand query parameter
     * @param expand value to be added
     * @param <TValue> value type
     * @return ByProjectKeyPaymentMethodsPost
     */
    public <TValue> ByProjectKeyPaymentMethodsPost addExpand(final TValue expand) {
        return copy().addQueryParam("expand", expand);
    }

    /**
     * set expand with the specified value
     * @param supplier supplier for the value to be set
     * @return ByProjectKeyPaymentMethodsPost
     */
    public ByProjectKeyPaymentMethodsPost withExpand(final Supplier<String> supplier) {
        return copy().withQueryParam("expand", supplier.get());
    }

    /**
     * add additional expand query parameter
     * @param supplier supplier for the value to be added
     * @return ByProjectKeyPaymentMethodsPost
     */
    public ByProjectKeyPaymentMethodsPost addExpand(final Supplier<String> supplier) {
        return copy().addQueryParam("expand", supplier.get());
    }

    /**
     * set expand with the specified value
     * @param op builder for the value to be set
     * @return ByProjectKeyPaymentMethodsPost
     */
    public ByProjectKeyPaymentMethodsPost withExpand(final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("expand", op.apply(new StringBuilder()));
    }

    /**
     * add additional expand query parameter
     * @param op builder for the value to be added
     * @return ByProjectKeyPaymentMethodsPost
     */
    public ByProjectKeyPaymentMethodsPost addExpand(final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("expand", op.apply(new StringBuilder()));
    }

    /**
     * set expand with the specified values
     * @param expand values to be set
     * @param <TValue> value type
     * @return ByProjectKeyPaymentMethodsPost
     */
    public <TValue> ByProjectKeyPaymentMethodsPost withExpand(final Collection<TValue> expand) {
        return copy().withoutQueryParam("expand")
                .addQueryParams(
                    expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional expand query parameters
     * @param expand values to be added
     * @param <TValue> value type
     * @return ByProjectKeyPaymentMethodsPost
     */
    public <TValue> ByProjectKeyPaymentMethodsPost addExpand(final Collection<TValue> expand) {
        return copy().addQueryParams(
            expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList()));
    }

    public com.commercetools.api.models.payment_method.PaymentMethodDraft getBody() {
        return paymentMethodDraft;
    }

    public ByProjectKeyPaymentMethodsPost withBody(
            com.commercetools.api.models.payment_method.PaymentMethodDraft paymentMethodDraft) {
        ByProjectKeyPaymentMethodsPost t = copy();
        t.paymentMethodDraft = paymentMethodDraft;
        return t;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ByProjectKeyPaymentMethodsPost that = (ByProjectKeyPaymentMethodsPost) o;

        return new EqualsBuilder().append(projectKey, that.projectKey)
                .append(paymentMethodDraft, that.paymentMethodDraft)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(projectKey).append(paymentMethodDraft).toHashCode();
    }

    @Override
    protected ByProjectKeyPaymentMethodsPost copy() {
        return new ByProjectKeyPaymentMethodsPost(this);
    }
}
