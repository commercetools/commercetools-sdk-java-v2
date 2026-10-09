
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
 *  <p>Creates a new <a href="https://docs.commercetools.com/apis/ctp:checkout:type:RecurringPaymentJob" rel="nofollow">RecurringPaymentJob</a>. Specific Error Codes:</p>
 *  <ul>
 *   <li><a href="https://docs.commercetools.com/apis/ctp:checkout:type:InvalidInputError" rel="nofollow">InvalidInput</a></li>
 *   <li><a href="https://docs.commercetools.com/apis/ctp:checkout:type:ReferencedResourceNotFoundError" rel="nofollow">ReferencedResourceNotFound</a></li>
 *   <li><a href="https://docs.commercetools.com/apis/ctp:checkout:type:RequiredFieldError" rel="nofollow">RequiredField</a></li>
 *  </ul>
 *
 * <hr>
 * <div class=code-example>
 * <pre><code class='java'>{@code
 *   CompletableFuture<ApiHttpResponse<com.commercetools.checkout.models.recurring_payment_job.RecurringPaymentJob>> result = apiRoot
 *            .withProjectKey("{projectKey}")
 *            .recurringPaymentJobs()
 *            .post("")
 *            .execute()
 * }</code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyRecurringPaymentJobsPostString extends
        StringBodyApiMethod<ByProjectKeyRecurringPaymentJobsPostString, com.commercetools.checkout.models.recurring_payment_job.RecurringPaymentJob>
        implements
        com.commercetools.checkout.client.Secured_by_manage_recurring_payment_jobsTrait<ByProjectKeyRecurringPaymentJobsPostString> {

    @Override
    public TypeReference<com.commercetools.checkout.models.recurring_payment_job.RecurringPaymentJob> resultType() {
        return new TypeReference<com.commercetools.checkout.models.recurring_payment_job.RecurringPaymentJob>() {
        };
    }

    private String projectKey;

    private String recurringPaymentJobDraft;

    public ByProjectKeyRecurringPaymentJobsPostString(final ApiHttpClient apiHttpClient, String projectKey,
            String recurringPaymentJobDraft) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.recurringPaymentJobDraft = recurringPaymentJobDraft;
    }

    public ByProjectKeyRecurringPaymentJobsPostString(ByProjectKeyRecurringPaymentJobsPostString t) {
        super(t);
        this.projectKey = t.projectKey;
        this.recurringPaymentJobDraft = t.recurringPaymentJobDraft;
    }

    @Override
    protected ApiHttpRequest buildHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("%s/recurring-payment-jobs", encodePathParam(this.projectKey));
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(),
            recurringPaymentJobDraft.getBytes(StandardCharsets.UTF_8));

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

    public void setProjectKey(final String projectKey) {
        this.projectKey = projectKey;
    }

    public String getBody() {
        return recurringPaymentJobDraft;
    }

    public ByProjectKeyRecurringPaymentJobsPostString withBody(String recurringPaymentJobDraft) {
        ByProjectKeyRecurringPaymentJobsPostString t = copy();
        t.recurringPaymentJobDraft = recurringPaymentJobDraft;
        return t;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ByProjectKeyRecurringPaymentJobsPostString that = (ByProjectKeyRecurringPaymentJobsPostString) o;

        return new EqualsBuilder().append(projectKey, that.projectKey)
                .append(recurringPaymentJobDraft, that.recurringPaymentJobDraft)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(projectKey).append(recurringPaymentJobDraft).toHashCode();
    }

    @Override
    protected ByProjectKeyRecurringPaymentJobsPostString copy() {
        return new ByProjectKeyRecurringPaymentJobsPostString(this);
    }
}
