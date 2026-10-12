
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
 *  <p>Retrieves a Recurring Payment Job with a given <code>id</code>. Specific Error Codes:</p>
 *  <ul>
 *   <li><a href="https://docs.commercetools.com/apis/ctp:checkout:type:ResourceNotFoundError" rel="nofollow">ResourceNotFound</a></li>
 *   <li><a href="https://docs.commercetools.com/apis/ctp:checkout:type:GeneralError" rel="nofollow">GeneralError</a></li>
 *  </ul>
 *
 * <hr>
 * <div class=code-example>
 * <pre><code class='java'>{@code
 *   CompletableFuture<ApiHttpResponse<com.commercetools.checkout.models.recurring_payment_job.RecurringPaymentJob>> result = apiRoot
 *            .withProjectKey("{projectKey}")
 *            .recurringPaymentJobs()
 *            .withId("{id}")
 *            .get()
 *            .execute()
 * }</code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyRecurringPaymentJobsByIdGet extends
        TypeApiMethod<ByProjectKeyRecurringPaymentJobsByIdGet, com.commercetools.checkout.models.recurring_payment_job.RecurringPaymentJob>
        implements
        com.commercetools.checkout.client.Secured_by_view_recurring_payment_jobsTrait<ByProjectKeyRecurringPaymentJobsByIdGet> {

    @Override
    public TypeReference<com.commercetools.checkout.models.recurring_payment_job.RecurringPaymentJob> resultType() {
        return new TypeReference<com.commercetools.checkout.models.recurring_payment_job.RecurringPaymentJob>() {
        };
    }

    private String projectKey;
    private String id;

    public ByProjectKeyRecurringPaymentJobsByIdGet(final ApiHttpClient apiHttpClient, String projectKey, String id) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.id = id;
    }

    public ByProjectKeyRecurringPaymentJobsByIdGet(ByProjectKeyRecurringPaymentJobsByIdGet t) {
        super(t);
        this.projectKey = t.projectKey;
        this.id = t.id;
    }

    @Override
    protected ApiHttpRequest buildHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("%s/recurring-payment-jobs/%s", encodePathParam(this.projectKey),
            encodePathParam(this.id));
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        return new ApiHttpRequest(ApiHttpMethod.GET, URI.create(httpRequestPath), getHeaders(), null);
    }

    @Override
    public ApiHttpResponse<com.commercetools.checkout.models.recurring_payment_job.RecurringPaymentJob> executeBlocking(
            final ApiHttpClient client, final Duration timeout) {
        return executeBlocking(client, timeout,
            com.commercetools.checkout.models.recurring_payment_job.RecurringPaymentJob.class);
    }

    @Override
    public CompletableFuture<ApiHttpResponse<com.commercetools.checkout.models.recurring_payment_job.RecurringPaymentJob>> execute(
            final ApiHttpClient client) {
        return execute(client, com.commercetools.checkout.models.recurring_payment_job.RecurringPaymentJob.class);
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

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ByProjectKeyRecurringPaymentJobsByIdGet that = (ByProjectKeyRecurringPaymentJobsByIdGet) o;

        return new EqualsBuilder().append(projectKey, that.projectKey).append(id, that.id).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(projectKey).append(id).toHashCode();
    }

    @Override
    protected ByProjectKeyRecurringPaymentJobsByIdGet copy() {
        return new ByProjectKeyRecurringPaymentJobsByIdGet(this);
    }
}
