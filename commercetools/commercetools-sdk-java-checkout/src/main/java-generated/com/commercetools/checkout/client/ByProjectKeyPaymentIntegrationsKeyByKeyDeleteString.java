
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
 *
 *
 * <hr>
 * <div class=code-example>
 * <pre><code class='java'>{@code
 *   CompletableFuture<ApiHttpResponse<com.commercetools.checkout.models.payment_integration.PaymentIntegration>> result = apiRoot
 *            .withProjectKey("{projectKey}")
 *            .paymentIntegrations()
 *            .withKey("{key}")
 *            .delete("")
 *            .execute()
 * }</code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyPaymentIntegrationsKeyByKeyDeleteString extends
        StringBodyApiMethod<ByProjectKeyPaymentIntegrationsKeyByKeyDeleteString, com.commercetools.checkout.models.payment_integration.PaymentIntegration>
        implements
        com.commercetools.checkout.client.Secured_by_manage_payment_integrationsTrait<ByProjectKeyPaymentIntegrationsKeyByKeyDeleteString> {

    @Override
    public TypeReference<com.commercetools.checkout.models.payment_integration.PaymentIntegration> resultType() {
        return new TypeReference<com.commercetools.checkout.models.payment_integration.PaymentIntegration>() {
        };
    }

    private String projectKey;
    private String key;

    private String paymentIntegration;

    public ByProjectKeyPaymentIntegrationsKeyByKeyDeleteString(final ApiHttpClient apiHttpClient, String projectKey,
            String key, String paymentIntegration) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.key = key;
        this.paymentIntegration = paymentIntegration;
    }

    public ByProjectKeyPaymentIntegrationsKeyByKeyDeleteString(ByProjectKeyPaymentIntegrationsKeyByKeyDeleteString t) {
        super(t);
        this.projectKey = t.projectKey;
        this.key = t.key;
        this.paymentIntegration = t.paymentIntegration;
    }

    @Override
    protected ApiHttpRequest buildHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("%s/payment-integrations/key=%s", this.projectKey, this.key);
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        return new ApiHttpRequest(ApiHttpMethod.DELETE, URI.create(httpRequestPath), getHeaders(),
            paymentIntegration.getBytes(StandardCharsets.UTF_8));

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

    public String getBody() {
        return paymentIntegration;
    }

    public ByProjectKeyPaymentIntegrationsKeyByKeyDeleteString withBody(String paymentIntegration) {
        ByProjectKeyPaymentIntegrationsKeyByKeyDeleteString t = copy();
        t.paymentIntegration = paymentIntegration;
        return t;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ByProjectKeyPaymentIntegrationsKeyByKeyDeleteString that = (ByProjectKeyPaymentIntegrationsKeyByKeyDeleteString) o;

        return new EqualsBuilder().append(projectKey, that.projectKey)
                .append(key, that.key)
                .append(paymentIntegration, that.paymentIntegration)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(projectKey).append(key).append(paymentIntegration).toHashCode();
    }

    @Override
    protected ByProjectKeyPaymentIntegrationsKeyByKeyDeleteString copy() {
        return new ByProjectKeyPaymentIntegrationsKeyByKeyDeleteString(this);
    }
}
