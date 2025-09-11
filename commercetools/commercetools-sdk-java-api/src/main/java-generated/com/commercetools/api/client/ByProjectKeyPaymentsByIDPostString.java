
package com.commercetools.api.client;

import java.net.URI;
import java.nio.charset.StandardCharsets;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;

import com.fasterxml.jackson.core.type.TypeReference;

import io.vrap.rmf.base.client.*;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 *  <p>Updates a Payment in the Project using one or more <span>update actions</span>.</p>
 *
 * <hr>
 * <div class=code-example>
 * <pre><code class='java'>{@code
 *   CompletableFuture<ApiHttpResponse<com.commercetools.api.models.payment.Payment>> result = apiRoot
 *            .withProjectKey("{projectKey}")
 *            .payments()
 *            .withId("{ID}")
 *            .post("")
 *            .execute()
 * }</code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyPaymentsByIDPostString
        extends StringBodyApiMethod<ByProjectKeyPaymentsByIDPostString, com.commercetools.api.models.payment.Payment>
        implements com.commercetools.api.client.ConflictingTrait<ByProjectKeyPaymentsByIDPostString>,
        com.commercetools.api.client.ExpandableTrait<ByProjectKeyPaymentsByIDPostString>,
        com.commercetools.api.client.Deprecatable200Trait<ByProjectKeyPaymentsByIDPostString>,
        com.commercetools.api.client.ErrorableTrait<ByProjectKeyPaymentsByIDPostString> {

    @Override
    public TypeReference<com.commercetools.api.models.payment.Payment> resultType() {
        return new TypeReference<com.commercetools.api.models.payment.Payment>() {
        };
    }

    private String projectKey;
    private String ID;

    private String paymentUpdate;

    public ByProjectKeyPaymentsByIDPostString(final ApiHttpClient apiHttpClient, String projectKey, String ID,
            String paymentUpdate) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.ID = ID;
        this.paymentUpdate = paymentUpdate;
    }

    public ByProjectKeyPaymentsByIDPostString(ByProjectKeyPaymentsByIDPostString t) {
        super(t);
        this.projectKey = t.projectKey;
        this.ID = t.ID;
        this.paymentUpdate = t.paymentUpdate;
    }

    @Override
    protected ApiHttpRequest buildHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("%s/payments/%s", this.projectKey, this.ID);
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(),
            paymentUpdate.getBytes(StandardCharsets.UTF_8));

    }

    @Override
    public ApiHttpResponse<com.commercetools.api.models.payment.Payment> executeBlocking(final ApiHttpClient client,
            final Duration timeout) {
        return executeBlocking(client, timeout, com.commercetools.api.models.payment.Payment.class);
    }

    @Override
    public CompletableFuture<ApiHttpResponse<com.commercetools.api.models.payment.Payment>> execute(
            final ApiHttpClient client) {
        return execute(client, com.commercetools.api.models.payment.Payment.class);
    }

    public String getProjectKey() {
        return this.projectKey;
    }

    public String getID() {
        return this.ID;
    }

    public List<String> getExpand() {
        return this.getQueryParam("expand");
    }

    public void setProjectKey(final String projectKey) {
        this.projectKey = projectKey;
    }

    public void setID(final String ID) {
        this.ID = ID;
    }

    /**
     * set expand with the specified value
     * @param <TValue> value type
     * @param expand value to be set
     * @return ByProjectKeyPaymentsByIDPostString
     */
    public <TValue> ByProjectKeyPaymentsByIDPostString withExpand(final TValue expand) {
        return copy().withQueryParam("expand", expand);
    }

    /**
     * add additional expand query parameter
     * @param <TValue> value type
     * @param expand value to be added
     * @return ByProjectKeyPaymentsByIDPostString
     */
    public <TValue> ByProjectKeyPaymentsByIDPostString addExpand(final TValue expand) {
        return copy().addQueryParam("expand", expand);
    }

    /**
     * set expand with the specified value
     * @param supplier supplier for the value to be set
     * @return ByProjectKeyPaymentsByIDPostString
     */
    public ByProjectKeyPaymentsByIDPostString withExpand(final Supplier<String> supplier) {
        return copy().withQueryParam("expand", supplier.get());
    }

    /**
     * add additional expand query parameter
     * @param supplier supplier for the value to be added
     * @return ByProjectKeyPaymentsByIDPostString
     */
    public ByProjectKeyPaymentsByIDPostString addExpand(final Supplier<String> supplier) {
        return copy().addQueryParam("expand", supplier.get());
    }

    /**
     * set expand with the specified value
     * @param op builder for the value to be set
     * @return ByProjectKeyPaymentsByIDPostString
     */
    public ByProjectKeyPaymentsByIDPostString withExpand(final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("expand", op.apply(new StringBuilder()));
    }

    /**
     * add additional expand query parameter
     * @param op builder for the value to be added
     * @return ByProjectKeyPaymentsByIDPostString
     */
    public ByProjectKeyPaymentsByIDPostString addExpand(final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("expand", op.apply(new StringBuilder()));
    }

    /**
     * set expand with the specified values
     * @param <TValue> value type
     * @param expand values to be set
     * @return ByProjectKeyPaymentsByIDPostString
     */
    public <TValue> ByProjectKeyPaymentsByIDPostString withExpand(final Collection<TValue> expand) {
        return copy().withoutQueryParam("expand")
                .addQueryParams(
                    expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional expand query parameters
     * @param <TValue> value type
     * @param expand values to be added
     * @return ByProjectKeyPaymentsByIDPostString
     */
    public <TValue> ByProjectKeyPaymentsByIDPostString addExpand(final Collection<TValue> expand) {
        return copy().addQueryParams(
            expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList()));
    }

    public String getBody() {
        return paymentUpdate;
    }

    public ByProjectKeyPaymentsByIDPostString withBody(String paymentUpdate) {
        ByProjectKeyPaymentsByIDPostString t = copy();
        t.paymentUpdate = paymentUpdate;
        return t;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ByProjectKeyPaymentsByIDPostString that = (ByProjectKeyPaymentsByIDPostString) o;

        return new EqualsBuilder().append(projectKey, that.projectKey)
                .append(ID, that.ID)
                .append(paymentUpdate, that.paymentUpdate)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(projectKey).append(ID).append(paymentUpdate).toHashCode();
    }

    @Override
    protected ByProjectKeyPaymentsByIDPostString copy() {
        return new ByProjectKeyPaymentsByIDPostString(this);
    }
}
