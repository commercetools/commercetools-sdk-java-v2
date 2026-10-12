
package com.commercetools.checkout.client;

import java.net.URI;
import java.nio.charset.StandardCharsets;
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
 *  <p>Creates a new <a href="https://docs.commercetools.com/apis/ctp:checkout:type:RecurringPayment" rel="nofollow">RecurringPayment</a>. Specific Error Codes:</p>
 *  <ul>
 *   <li><a href="https://docs.commercetools.com/apis/ctp:checkout:type:InvalidInputError" rel="nofollow">InvalidInput</a></li>
 *   <li><a href="https://docs.commercetools.com/apis/ctp:checkout:type:ReferencedResourceNotFoundError" rel="nofollow">ReferencedResourceNotFound</a></li>
 *   <li><a href="https://docs.commercetools.com/apis/ctp:checkout:type:RequiredFieldError" rel="nofollow">RequiredField</a></li>
 *  </ul>
 *
 * <hr>
 * <div class=code-example>
 * <pre><code class='java'>{@code
 *   CompletableFuture<ApiHttpResponse<com.commercetools.checkout.models.recurring_payment.RecurringPayment>> result = apiRoot
 *            .withProjectKey("{projectKey}")
 *            .recurringPayments()
 *            .post("")
 *            .execute()
 * }</code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyRecurringPaymentsPostString extends
        StringBodyApiMethod<ByProjectKeyRecurringPaymentsPostString, com.commercetools.checkout.models.recurring_payment.RecurringPayment>
        implements
        com.commercetools.checkout.client.Secured_by_manage_recurring_paymentsTrait<ByProjectKeyRecurringPaymentsPostString> {

    @Override
    public TypeReference<com.commercetools.checkout.models.recurring_payment.RecurringPayment> resultType() {
        return new TypeReference<com.commercetools.checkout.models.recurring_payment.RecurringPayment>() {
        };
    }

    private String projectKey;

    private String recurringPaymentDraft;

    public ByProjectKeyRecurringPaymentsPostString(final ApiHttpClient apiHttpClient, String projectKey,
            String recurringPaymentDraft) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.recurringPaymentDraft = recurringPaymentDraft;
    }

    public ByProjectKeyRecurringPaymentsPostString(ByProjectKeyRecurringPaymentsPostString t) {
        super(t);
        this.projectKey = t.projectKey;
        this.recurringPaymentDraft = t.recurringPaymentDraft;
    }

    @Override
    protected ApiHttpRequest buildHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("%s/recurring-payments", encodePathParam(this.projectKey));
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(),
            recurringPaymentDraft.getBytes(StandardCharsets.UTF_8));

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

    public void setProjectKey(final String projectKey) {
        this.projectKey = projectKey;
    }

    public String getBody() {
        return recurringPaymentDraft;
    }

    public ByProjectKeyRecurringPaymentsPostString withBody(String recurringPaymentDraft) {
        ByProjectKeyRecurringPaymentsPostString t = copy();
        t.recurringPaymentDraft = recurringPaymentDraft;
        return t;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ByProjectKeyRecurringPaymentsPostString that = (ByProjectKeyRecurringPaymentsPostString) o;

        return new EqualsBuilder().append(projectKey, that.projectKey)
                .append(recurringPaymentDraft, that.recurringPaymentDraft)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(projectKey).append(recurringPaymentDraft).toHashCode();
    }

    @Override
    protected ByProjectKeyRecurringPaymentsPostString copy() {
        return new ByProjectKeyRecurringPaymentsPostString(this);
    }
}
