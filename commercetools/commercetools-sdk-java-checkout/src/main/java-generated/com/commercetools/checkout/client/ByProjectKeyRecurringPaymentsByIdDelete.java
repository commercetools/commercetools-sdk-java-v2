
package com.commercetools.checkout.client;

import java.net.URI;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;

import io.vrap.rmf.base.client.*;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import tools.jackson.core.type.TypeReference;

/**
 *  <p>Deletes a Recurring Payment with a given <code>id</code>. Specific Error Codes:</p>
 *  <ul>
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
 *            .delete()
 *            .withVersion(version)
 *            .execute()
 * }</code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyRecurringPaymentsByIdDelete extends
        TypeApiMethod<ByProjectKeyRecurringPaymentsByIdDelete, com.commercetools.checkout.models.recurring_payment.RecurringPayment>
        implements
        com.commercetools.checkout.client.Secured_by_manage_recurring_paymentsTrait<ByProjectKeyRecurringPaymentsByIdDelete> {

    @Override
    public TypeReference<com.commercetools.checkout.models.recurring_payment.RecurringPayment> resultType() {
        return new TypeReference<com.commercetools.checkout.models.recurring_payment.RecurringPayment>() {
        };
    }

    private String projectKey;
    private String id;

    public ByProjectKeyRecurringPaymentsByIdDelete(final ApiHttpClient apiHttpClient, String projectKey, String id) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.id = id;
    }

    public ByProjectKeyRecurringPaymentsByIdDelete(ByProjectKeyRecurringPaymentsByIdDelete t) {
        super(t);
        this.projectKey = t.projectKey;
        this.id = t.id;
    }

    @Override
    protected ApiHttpRequest buildHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("%s/recurring-payments/%s", encodePathParam(this.projectKey),
            encodePathParam(this.id));
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        return new ApiHttpRequest(ApiHttpMethod.DELETE, URI.create(httpRequestPath), getHeaders(), null);
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

    public List<String> getVersion() {
        return this.getQueryParam("version");
    }

    public void setProjectKey(final String projectKey) {
        this.projectKey = projectKey;
    }

    public void setId(final String id) {
        this.id = id;
    }

    /**
     * set version with the specified value
     * @param version value to be set
     * @param <TValue> value type
     * @return ByProjectKeyRecurringPaymentsByIdDelete
     */
    public <TValue> ByProjectKeyRecurringPaymentsByIdDelete withVersion(final TValue version) {
        return copy().withQueryParam("version", version);
    }

    /**
     * add additional version query parameter
     * @param version value to be added
     * @param <TValue> value type
     * @return ByProjectKeyRecurringPaymentsByIdDelete
     */
    public <TValue> ByProjectKeyRecurringPaymentsByIdDelete addVersion(final TValue version) {
        return copy().addQueryParam("version", version);
    }

    /**
     * set version with the specified value
     * @param supplier supplier for the value to be set
     * @return ByProjectKeyRecurringPaymentsByIdDelete
     */
    public ByProjectKeyRecurringPaymentsByIdDelete withVersion(final Supplier<Long> supplier) {
        return copy().withQueryParam("version", supplier.get());
    }

    /**
     * add additional version query parameter
     * @param supplier supplier for the value to be added
     * @return ByProjectKeyRecurringPaymentsByIdDelete
     */
    public ByProjectKeyRecurringPaymentsByIdDelete addVersion(final Supplier<Long> supplier) {
        return copy().addQueryParam("version", supplier.get());
    }

    /**
     * set version with the specified value
     * @param op builder for the value to be set
     * @return ByProjectKeyRecurringPaymentsByIdDelete
     */
    public ByProjectKeyRecurringPaymentsByIdDelete withVersion(final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("version", op.apply(new StringBuilder()));
    }

    /**
     * add additional version query parameter
     * @param op builder for the value to be added
     * @return ByProjectKeyRecurringPaymentsByIdDelete
     */
    public ByProjectKeyRecurringPaymentsByIdDelete addVersion(final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("version", op.apply(new StringBuilder()));
    }

    /**
     * set version with the specified values
     * @param version values to be set
     * @param <TValue> value type
     * @return ByProjectKeyRecurringPaymentsByIdDelete
     */
    public <TValue> ByProjectKeyRecurringPaymentsByIdDelete withVersion(final Collection<TValue> version) {
        return copy().withoutQueryParam("version")
                .addQueryParams(
                    version.stream().map(s -> new ParamEntry<>("version", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional version query parameters
     * @param version values to be added
     * @param <TValue> value type
     * @return ByProjectKeyRecurringPaymentsByIdDelete
     */
    public <TValue> ByProjectKeyRecurringPaymentsByIdDelete addVersion(final Collection<TValue> version) {
        return copy().addQueryParams(
            version.stream().map(s -> new ParamEntry<>("version", s.toString())).collect(Collectors.toList()));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ByProjectKeyRecurringPaymentsByIdDelete that = (ByProjectKeyRecurringPaymentsByIdDelete) o;

        return new EqualsBuilder().append(projectKey, that.projectKey).append(id, that.id).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(projectKey).append(id).toHashCode();
    }

    @Override
    protected ByProjectKeyRecurringPaymentsByIdDelete copy() {
        return new ByProjectKeyRecurringPaymentsByIdDelete(this);
    }
}
