
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
 *
 *
 * <hr>
 * <div class=code-example>
 * <pre><code class='java'>{@code
 *   CompletableFuture<ApiHttpResponse<com.commercetools.checkout.models.payment_integration.PaymentIntegration>> result = apiRoot
 *            .withProjectKey("{projectKey}")
 *            .paymentIntegrations()
 *            .withKey("{key}")
 *            .post(null)
 *            .execute()
 * }</code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyPaymentIntegrationsKeyByKeyPost extends
        TypeBodyApiMethod<ByProjectKeyPaymentIntegrationsKeyByKeyPost, com.commercetools.checkout.models.payment_integration.PaymentIntegration, com.commercetools.checkout.models.payment_integration.PaymentIntegrationUpdateActions>
        implements
        com.commercetools.checkout.client.Secured_by_manage_payment_integrationsTrait<ByProjectKeyPaymentIntegrationsKeyByKeyPost> {

    @Override
    public TypeReference<com.commercetools.checkout.models.payment_integration.PaymentIntegration> resultType() {
        return new TypeReference<com.commercetools.checkout.models.payment_integration.PaymentIntegration>() {
        };
    }

    private String projectKey;
    private String key;

    private com.commercetools.checkout.models.payment_integration.PaymentIntegrationUpdateActions paymentIntegrationUpdateActions;

    public ByProjectKeyPaymentIntegrationsKeyByKeyPost(final ApiHttpClient apiHttpClient, String projectKey, String key,
            com.commercetools.checkout.models.payment_integration.PaymentIntegrationUpdateActions paymentIntegrationUpdateActions) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.key = key;
        this.paymentIntegrationUpdateActions = paymentIntegrationUpdateActions;
    }

    public ByProjectKeyPaymentIntegrationsKeyByKeyPost(ByProjectKeyPaymentIntegrationsKeyByKeyPost t) {
        super(t);
        this.projectKey = t.projectKey;
        this.key = t.key;
        this.paymentIntegrationUpdateActions = t.paymentIntegrationUpdateActions;
    }

    @Override
    protected ApiHttpRequest buildHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("%s/payment-integrations/key=%s", encodePathParam(this.projectKey),
            encodePathParam(this.key));
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(),
            io.vrap.rmf.base.client.utils.json.JsonUtils.executing(
                () -> apiHttpClient().getSerializerService().toJsonByteArray(paymentIntegrationUpdateActions)));

    }

    @Override
    public ApiHttpResponse<com.commercetools.checkout.models.payment_integration.PaymentIntegration> executeBlocking(
            final ApiHttpClient client, final Duration timeout) {
        return executeBlocking(client, timeout,
            com.commercetools.checkout.models.payment_integration.PaymentIntegration.class);
    }

    @Override
    public CompletableFuture<ApiHttpResponse<com.commercetools.checkout.models.payment_integration.PaymentIntegration>> execute(
            final ApiHttpClient client) {
        return execute(client, com.commercetools.checkout.models.payment_integration.PaymentIntegration.class);
    }

    public String getProjectKey() {
        return this.projectKey;
    }

    public String getKey() {
        return this.key;
    }

    public void setProjectKey(final String projectKey) {
        this.projectKey = projectKey;
    }

    public void setKey(final String key) {
        this.key = key;
    }

    public com.commercetools.checkout.models.payment_integration.PaymentIntegrationUpdateActions getBody() {
        return paymentIntegrationUpdateActions;
    }

    public ByProjectKeyPaymentIntegrationsKeyByKeyPost withBody(
            com.commercetools.checkout.models.payment_integration.PaymentIntegrationUpdateActions paymentIntegrationUpdateActions) {
        ByProjectKeyPaymentIntegrationsKeyByKeyPost t = copy();
        t.paymentIntegrationUpdateActions = paymentIntegrationUpdateActions;
        return t;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ByProjectKeyPaymentIntegrationsKeyByKeyPost that = (ByProjectKeyPaymentIntegrationsKeyByKeyPost) o;

        return new EqualsBuilder().append(projectKey, that.projectKey)
                .append(key, that.key)
                .append(paymentIntegrationUpdateActions, that.paymentIntegrationUpdateActions)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(projectKey)
                .append(key)
                .append(paymentIntegrationUpdateActions)
                .toHashCode();
    }

    @Override
    protected ByProjectKeyPaymentIntegrationsKeyByKeyPost copy() {
        return new ByProjectKeyPaymentIntegrationsKeyByKeyPost(this);
    }
}
