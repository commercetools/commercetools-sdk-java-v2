
package com.commercetools.checkout.client;

import java.net.URI;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;

import com.fasterxml.jackson.core.type.TypeReference;

import io.vrap.rmf.base.client.*;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 *  <p>Specific Error Codes:</p>
 *  <ul>
 *   <li><a href="https://docs.commercetools.com/apis/ctp:checkout:type:MultipleActionsNotAllowedError" rel="nofollow">MultipleActionsNotAllowed</a></li>
 *   <li><a href="https://docs.commercetools.com/apis/ctp:checkout:type:RequiredFieldError" rel="nofollow">RequiredField</a></li>
 *   <li><a href="https://docs.commercetools.com/apis/ctp:checkout:type:ResourceNotFoundError" rel="nofollow">ResourceNotFound</a></li>
 *  </ul>
 *
 * <hr>
 * <div class=code-example>
 * <pre><code class='java'>{@code
 *   CompletableFuture<ApiHttpResponse<java.lang.Object>> result = apiRoot
 *            .withProjectKey("{projectKey}")
 *            .paymentIntents()
 *            .withPaymentId("{paymentId}")
 *            .post(null)
 *            .execute()
 * }</code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyPaymentIntentsByPaymentIdPost extends
        TypeBodyApiMethod<ByProjectKeyPaymentIntentsByPaymentIdPost, java.lang.Object, com.commercetools.checkout.models.payment_intents.PaymentIntent>
        implements
        com.commercetools.checkout.client.Secured_by_manage_paymentsTrait<ByProjectKeyPaymentIntentsByPaymentIdPost> {

    @Override
    public TypeReference<java.lang.Object> resultType() {
        return new TypeReference<java.lang.Object>() {
        };
    }

    private String projectKey;
    private String paymentId;

    private com.commercetools.checkout.models.payment_intents.PaymentIntent paymentIntent;

    public ByProjectKeyPaymentIntentsByPaymentIdPost(final ApiHttpClient apiHttpClient, String projectKey,
            String paymentId, com.commercetools.checkout.models.payment_intents.PaymentIntent paymentIntent) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.paymentId = paymentId;
        this.paymentIntent = paymentIntent;
    }

    public ByProjectKeyPaymentIntentsByPaymentIdPost(ByProjectKeyPaymentIntentsByPaymentIdPost t) {
        super(t);
        this.projectKey = t.projectKey;
        this.paymentId = t.paymentId;
        this.paymentIntent = t.paymentIntent;
    }

    @Override
    protected ApiHttpRequest buildHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("%s/payment-intents/%s", encodePathParam(this.projectKey),
            encodePathParam(this.paymentId));
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(),
            io.vrap.rmf.base.client.utils.json.JsonUtils
                    .executing(() -> apiHttpClient().getSerializerService().toJsonByteArray(paymentIntent)));

    }

    @Override
    public ApiHttpResponse<java.lang.Object> executeBlocking(final ApiHttpClient client, final Duration timeout) {
        return executeBlocking(client, timeout, java.lang.Object.class);
    }

    @Override
    public CompletableFuture<ApiHttpResponse<java.lang.Object>> execute(final ApiHttpClient client) {
        return execute(client, java.lang.Object.class);
    }

    public String getProjectKey() {
        return this.projectKey;
    }

    public String getPaymentId() {
        return this.paymentId;
    }

    public void setProjectKey(final String projectKey) {
        this.projectKey = projectKey;
    }

    public void setPaymentId(final String paymentId) {
        this.paymentId = paymentId;
    }

    public com.commercetools.checkout.models.payment_intents.PaymentIntent getBody() {
        return paymentIntent;
    }

    public ByProjectKeyPaymentIntentsByPaymentIdPost withBody(
            com.commercetools.checkout.models.payment_intents.PaymentIntent paymentIntent) {
        ByProjectKeyPaymentIntentsByPaymentIdPost t = copy();
        t.paymentIntent = paymentIntent;
        return t;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ByProjectKeyPaymentIntentsByPaymentIdPost that = (ByProjectKeyPaymentIntentsByPaymentIdPost) o;

        return new EqualsBuilder().append(projectKey, that.projectKey)
                .append(paymentId, that.paymentId)
                .append(paymentIntent, that.paymentIntent)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(projectKey).append(paymentId).append(paymentIntent).toHashCode();
    }

    @Override
    protected ByProjectKeyPaymentIntentsByPaymentIdPost copy() {
        return new ByProjectKeyPaymentIntentsByPaymentIdPost(this);
    }
}
