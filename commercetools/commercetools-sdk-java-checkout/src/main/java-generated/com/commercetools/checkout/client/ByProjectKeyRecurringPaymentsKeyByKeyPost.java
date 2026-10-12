
package com.commercetools.checkout.client;

import java.net.URI;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;

import io.vrap.rmf.base.client.*;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import tools.jackson.core.type.TypeReference;

/**
 *  <p>Updates a Recurring Payment with a given <code>key</code>. Specific Error Codes:</p>
 *  <ul>
 *   <li><a href="https://docs.commercetools.com/apis/ctp:checkout:type:InvalidInputError" rel="nofollow">InvalidInput</a></li>
 *   <li><a href="https://docs.commercetools.com/apis/ctp:checkout:type:ReferencedResourceNotFoundError" rel="nofollow">ReferencedResourceNotFound</a></li>
 *   <li><a href="https://docs.commercetools.com/apis/ctp:checkout:type:ResourceNotFoundError" rel="nofollow">ResourceNotFound</a></li>
 *   <li><a href="https://docs.commercetools.com/apis/ctp:checkout:type:ConcurrentModificationError" rel="nofollow">ConcurrentModification</a></li>
 *  </ul>
 *
 * <hr>
 * <div class=code-example>
 * <pre><code class='java'>{@code
 *   CompletableFuture<ApiHttpResponse<com.commercetools.checkout.models.recurring_payment.RecurringPayment>> result = apiRoot
 *            .withProjectKey("{projectKey}")
 *            .recurringPayments()
 *            .withKey("{key}")
 *            .post(null)
 *            .execute()
 * }</code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyRecurringPaymentsKeyByKeyPost extends
        TypeBodyApiMethod<ByProjectKeyRecurringPaymentsKeyByKeyPost, com.commercetools.checkout.models.recurring_payment.RecurringPayment, com.commercetools.checkout.models.recurring_payment.RecurringPaymentUpdateActions>
        implements
        com.commercetools.checkout.client.Secured_by_manage_recurring_paymentsTrait<ByProjectKeyRecurringPaymentsKeyByKeyPost> {

    @Override
    public TypeReference<com.commercetools.checkout.models.recurring_payment.RecurringPayment> resultType() {
        return new TypeReference<com.commercetools.checkout.models.recurring_payment.RecurringPayment>() {
        };
    }

    private String projectKey;
    private String key;

    private com.commercetools.checkout.models.recurring_payment.RecurringPaymentUpdateActions recurringPaymentUpdateActions;

    public ByProjectKeyRecurringPaymentsKeyByKeyPost(final ApiHttpClient apiHttpClient, String projectKey, String key,
            com.commercetools.checkout.models.recurring_payment.RecurringPaymentUpdateActions recurringPaymentUpdateActions) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.key = key;
        this.recurringPaymentUpdateActions = recurringPaymentUpdateActions;
    }

    public ByProjectKeyRecurringPaymentsKeyByKeyPost(ByProjectKeyRecurringPaymentsKeyByKeyPost t) {
        super(t);
        this.projectKey = t.projectKey;
        this.key = t.key;
        this.recurringPaymentUpdateActions = t.recurringPaymentUpdateActions;
    }

    @Override
    protected ApiHttpRequest buildHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("%s/recurring-payments/key=%s", encodePathParam(this.projectKey),
            encodePathParam(this.key));
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(),
            io.vrap.rmf.base.client.utils.json.JsonUtils.executing(
                () -> apiHttpClient().getSerializerService().toJsonByteArray(recurringPaymentUpdateActions)));

    }

    @Override
    public ApiHttpResponse<com.commercetools.checkout.models.recurring_payment.RecurringPayment> executeBlocking(
            final ApiHttpClient client, final Duration timeout) {
        return executeBlocking(client, timeout,
            com.commercetools.checkout.models.recurring_payment.RecurringPayment.class);
    }

    @Override
    public CompletableFuture<ApiHttpResponse<com.commercetools.checkout.models.recurring_payment.RecurringPayment>> execute(
            final ApiHttpClient client) {
        return execute(client, com.commercetools.checkout.models.recurring_payment.RecurringPayment.class);
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

    public com.commercetools.checkout.models.recurring_payment.RecurringPaymentUpdateActions getBody() {
        return recurringPaymentUpdateActions;
    }

    public ByProjectKeyRecurringPaymentsKeyByKeyPost withBody(
            com.commercetools.checkout.models.recurring_payment.RecurringPaymentUpdateActions recurringPaymentUpdateActions) {
        ByProjectKeyRecurringPaymentsKeyByKeyPost t = copy();
        t.recurringPaymentUpdateActions = recurringPaymentUpdateActions;
        return t;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ByProjectKeyRecurringPaymentsKeyByKeyPost that = (ByProjectKeyRecurringPaymentsKeyByKeyPost) o;

        return new EqualsBuilder().append(projectKey, that.projectKey)
                .append(key, that.key)
                .append(recurringPaymentUpdateActions, that.recurringPaymentUpdateActions)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(projectKey)
                .append(key)
                .append(recurringPaymentUpdateActions)
                .toHashCode();
    }

    @Override
    protected ByProjectKeyRecurringPaymentsKeyByKeyPost copy() {
        return new ByProjectKeyRecurringPaymentsKeyByKeyPost(this);
    }
}
