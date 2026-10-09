
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
 *  <p>Updates a Recurring Payment with a given <code>id</code>. Specific Error Codes:</p>
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
 *            .withId("{id}")
 *            .post("")
 *            .execute()
 * }</code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyRecurringPaymentsByIdPostString extends
        StringBodyApiMethod<ByProjectKeyRecurringPaymentsByIdPostString, com.commercetools.checkout.models.recurring_payment.RecurringPayment>
        implements
        com.commercetools.checkout.client.Secured_by_manage_recurring_paymentsTrait<ByProjectKeyRecurringPaymentsByIdPostString> {

    @Override
    public TypeReference<com.commercetools.checkout.models.recurring_payment.RecurringPayment> resultType() {
        return new TypeReference<com.commercetools.checkout.models.recurring_payment.RecurringPayment>() {
        };
    }

    private String projectKey;
    private String id;

    private String recurringPaymentUpdateActions;

    public ByProjectKeyRecurringPaymentsByIdPostString(final ApiHttpClient apiHttpClient, String projectKey, String id,
            String recurringPaymentUpdateActions) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.id = id;
        this.recurringPaymentUpdateActions = recurringPaymentUpdateActions;
    }

    public ByProjectKeyRecurringPaymentsByIdPostString(ByProjectKeyRecurringPaymentsByIdPostString t) {
        super(t);
        this.projectKey = t.projectKey;
        this.id = t.id;
        this.recurringPaymentUpdateActions = t.recurringPaymentUpdateActions;
    }

    @Override
    protected ApiHttpRequest buildHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("%s/recurring-payments/%s", encodePathParam(this.projectKey),
            encodePathParam(this.id));
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(),
            recurringPaymentUpdateActions.getBytes(StandardCharsets.UTF_8));

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
        return recurringPaymentUpdateActions;
    }

    public ByProjectKeyRecurringPaymentsByIdPostString withBody(String recurringPaymentUpdateActions) {
        ByProjectKeyRecurringPaymentsByIdPostString t = copy();
        t.recurringPaymentUpdateActions = recurringPaymentUpdateActions;
        return t;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ByProjectKeyRecurringPaymentsByIdPostString that = (ByProjectKeyRecurringPaymentsByIdPostString) o;

        return new EqualsBuilder().append(projectKey, that.projectKey)
                .append(id, that.id)
                .append(recurringPaymentUpdateActions, that.recurringPaymentUpdateActions)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(projectKey)
                .append(id)
                .append(recurringPaymentUpdateActions)
                .toHashCode();
    }

    @Override
    protected ByProjectKeyRecurringPaymentsByIdPostString copy() {
        return new ByProjectKeyRecurringPaymentsByIdPostString(this);
    }
}
