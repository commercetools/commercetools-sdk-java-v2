
package com.commercetools.checkout.client;

import java.net.URI;
import java.nio.charset.StandardCharsets;
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
 *  <p>Creates a new PaymentIntegration.</p>
 *
 * <hr>
 * <div class=code-example>
 * <pre><code class='java'>{@code
 *   CompletableFuture<ApiHttpResponse<com.commercetools.checkout.models.payment_integration.PaymentIntegration>> result = apiRoot
 *            .withProjectKey("{projectKey}")
 *            .paymentIntegrations()
 *            .post("")
 *            .execute()
 * }</code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyPaymentIntegrationsPostString extends
        StringBodyApiMethod<ByProjectKeyPaymentIntegrationsPostString, com.commercetools.checkout.models.payment_integration.PaymentIntegration>
        implements
        com.commercetools.checkout.client.Secured_by_manage_payment_integrationsTrait<ByProjectKeyPaymentIntegrationsPostString> {

    @Override
    public TypeReference<com.commercetools.checkout.models.payment_integration.PaymentIntegration> resultType() {
        return new TypeReference<com.commercetools.checkout.models.payment_integration.PaymentIntegration>() {
        };
    }

    private String projectKey;

    private String paymentIntegrationDraft;

    public ByProjectKeyPaymentIntegrationsPostString(final ApiHttpClient apiHttpClient, String projectKey,
            String paymentIntegrationDraft) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.paymentIntegrationDraft = paymentIntegrationDraft;
    }

    public ByProjectKeyPaymentIntegrationsPostString(ByProjectKeyPaymentIntegrationsPostString t) {
        super(t);
        this.projectKey = t.projectKey;
        this.paymentIntegrationDraft = t.paymentIntegrationDraft;
    }

    @Override
    protected ApiHttpRequest buildHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("%s/payment-integrations", this.projectKey);
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(),
            paymentIntegrationDraft.getBytes(StandardCharsets.UTF_8));

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

    public void setProjectKey(final String projectKey) {
        this.projectKey = projectKey;
    }

    public String getBody() {
        return paymentIntegrationDraft;
    }

    public ByProjectKeyPaymentIntegrationsPostString withBody(String paymentIntegrationDraft) {
        ByProjectKeyPaymentIntegrationsPostString t = copy();
        t.paymentIntegrationDraft = paymentIntegrationDraft;
        return t;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ByProjectKeyPaymentIntegrationsPostString that = (ByProjectKeyPaymentIntegrationsPostString) o;

        return new EqualsBuilder().append(projectKey, that.projectKey)
                .append(paymentIntegrationDraft, that.paymentIntegrationDraft)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(projectKey).append(paymentIntegrationDraft).toHashCode();
    }

    @Override
    protected ByProjectKeyPaymentIntegrationsPostString copy() {
        return new ByProjectKeyPaymentIntegrationsPostString(this);
    }
}
