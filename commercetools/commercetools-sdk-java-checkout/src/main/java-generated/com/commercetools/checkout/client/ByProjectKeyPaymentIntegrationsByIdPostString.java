
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
 *            .withId("{id}")
 *            .post("")
 *            .execute()
 * }</code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyPaymentIntegrationsByIdPostString extends
        StringBodyApiMethod<ByProjectKeyPaymentIntegrationsByIdPostString, com.commercetools.checkout.models.payment_integration.PaymentIntegration>
        implements
        com.commercetools.checkout.client.Secured_by_manage_payment_integrationsTrait<ByProjectKeyPaymentIntegrationsByIdPostString> {

    @Override
    public TypeReference<com.commercetools.checkout.models.payment_integration.PaymentIntegration> resultType() {
        return new TypeReference<com.commercetools.checkout.models.payment_integration.PaymentIntegration>() {
        };
    }

    private String projectKey;
    private String id;

    private String paymentIntegrationUpdateActions;

    public ByProjectKeyPaymentIntegrationsByIdPostString(final ApiHttpClient apiHttpClient, String projectKey,
            String id, String paymentIntegrationUpdateActions) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.id = id;
        this.paymentIntegrationUpdateActions = paymentIntegrationUpdateActions;
    }

    public ByProjectKeyPaymentIntegrationsByIdPostString(ByProjectKeyPaymentIntegrationsByIdPostString t) {
        super(t);
        this.projectKey = t.projectKey;
        this.id = t.id;
        this.paymentIntegrationUpdateActions = t.paymentIntegrationUpdateActions;
    }

    @Override
    protected ApiHttpRequest buildHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("%s/payment-integrations/%s", this.projectKey, this.id);
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(),
            paymentIntegrationUpdateActions.getBytes(StandardCharsets.UTF_8));

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

    public String getId() {
        return this.id;
    }

    public void setProjectKey(final String projectKey) {
        this.projectKey = projectKey;
    }

    public void setId(final String id) {
        this.id = id;
    }

    public String getBody() {
        return paymentIntegrationUpdateActions;
    }

    public ByProjectKeyPaymentIntegrationsByIdPostString withBody(String paymentIntegrationUpdateActions) {
        ByProjectKeyPaymentIntegrationsByIdPostString t = copy();
        t.paymentIntegrationUpdateActions = paymentIntegrationUpdateActions;
        return t;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ByProjectKeyPaymentIntegrationsByIdPostString that = (ByProjectKeyPaymentIntegrationsByIdPostString) o;

        return new EqualsBuilder().append(projectKey, that.projectKey)
                .append(id, that.id)
                .append(paymentIntegrationUpdateActions, that.paymentIntegrationUpdateActions)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(projectKey)
                .append(id)
                .append(paymentIntegrationUpdateActions)
                .toHashCode();
    }

    @Override
    protected ByProjectKeyPaymentIntegrationsByIdPostString copy() {
        return new ByProjectKeyPaymentIntegrationsByIdPostString(this);
    }
}
