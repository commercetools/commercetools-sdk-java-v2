
package com.commercetools.api.client;

import java.net.URI;
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
 *  <p>Updates a PaymentMethod in the Project using one or more <span>update actions</span>.</p>
 *
 * <hr>
 * <div class=code-example>
 * <pre><code class='java'>{@code
 *   CompletableFuture<ApiHttpResponse<com.commercetools.api.models.payment_method.PaymentMethod>> result = apiRoot
 *            .withProjectKey("{projectKey}")
 *            .paymentMethods()
 *            .withId("{ID}")
 *            .post(null)
 *            .execute()
 * }</code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyPaymentMethodsByIDPost extends
        TypeBodyApiMethod<ByProjectKeyPaymentMethodsByIDPost, com.commercetools.api.models.payment_method.PaymentMethod, com.commercetools.api.models.payment_method.PaymentMethodUpdate>
        implements com.commercetools.api.client.ConflictingTrait<ByProjectKeyPaymentMethodsByIDPost>,
        com.commercetools.api.client.ExpandableTrait<ByProjectKeyPaymentMethodsByIDPost>,
        com.commercetools.api.client.Deprecatable200Trait<ByProjectKeyPaymentMethodsByIDPost>,
        com.commercetools.api.client.ErrorableTrait<ByProjectKeyPaymentMethodsByIDPost> {

    @Override
    public TypeReference<com.commercetools.api.models.payment_method.PaymentMethod> resultType() {
        return new TypeReference<com.commercetools.api.models.payment_method.PaymentMethod>() {
        };
    }

    private String projectKey;
    private String ID;

    private com.commercetools.api.models.payment_method.PaymentMethodUpdate paymentMethodUpdate;

    public ByProjectKeyPaymentMethodsByIDPost(final ApiHttpClient apiHttpClient, String projectKey, String ID,
            com.commercetools.api.models.payment_method.PaymentMethodUpdate paymentMethodUpdate) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.ID = ID;
        this.paymentMethodUpdate = paymentMethodUpdate;
    }

    public ByProjectKeyPaymentMethodsByIDPost(ByProjectKeyPaymentMethodsByIDPost t) {
        super(t);
        this.projectKey = t.projectKey;
        this.ID = t.ID;
        this.paymentMethodUpdate = t.paymentMethodUpdate;
    }

    @Override
    protected ApiHttpRequest buildHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("%s/payment-methods/%s", encodePathParam(this.projectKey),
            encodePathParam(this.ID));
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(),
            io.vrap.rmf.base.client.utils.json.JsonUtils
                    .executing(() -> apiHttpClient().getSerializerService().toJsonByteArray(paymentMethodUpdate)));

    }

    @Override
    public ApiHttpResponse<com.commercetools.api.models.payment_method.PaymentMethod> executeBlocking(
            final ApiHttpClient client, final Duration timeout) {
        return executeBlocking(client, timeout, com.commercetools.api.models.payment_method.PaymentMethod.class);
    }

    @Override
    public CompletableFuture<ApiHttpResponse<com.commercetools.api.models.payment_method.PaymentMethod>> execute(
            final ApiHttpClient client) {
        return execute(client, com.commercetools.api.models.payment_method.PaymentMethod.class);
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
     * @param expand value to be set
     * @param <TValue> value type
     * @return ByProjectKeyPaymentMethodsByIDPost
     */
    public <TValue> ByProjectKeyPaymentMethodsByIDPost withExpand(final TValue expand) {
        return copy().withQueryParam("expand", expand);
    }

    /**
     * add additional expand query parameter
     * @param expand value to be added
     * @param <TValue> value type
     * @return ByProjectKeyPaymentMethodsByIDPost
     */
    public <TValue> ByProjectKeyPaymentMethodsByIDPost addExpand(final TValue expand) {
        return copy().addQueryParam("expand", expand);
    }

    /**
     * set expand with the specified value
     * @param supplier supplier for the value to be set
     * @return ByProjectKeyPaymentMethodsByIDPost
     */
    public ByProjectKeyPaymentMethodsByIDPost withExpand(final Supplier<String> supplier) {
        return copy().withQueryParam("expand", supplier.get());
    }

    /**
     * add additional expand query parameter
     * @param supplier supplier for the value to be added
     * @return ByProjectKeyPaymentMethodsByIDPost
     */
    public ByProjectKeyPaymentMethodsByIDPost addExpand(final Supplier<String> supplier) {
        return copy().addQueryParam("expand", supplier.get());
    }

    /**
     * set expand with the specified value
     * @param op builder for the value to be set
     * @return ByProjectKeyPaymentMethodsByIDPost
     */
    public ByProjectKeyPaymentMethodsByIDPost withExpand(final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("expand", op.apply(new StringBuilder()));
    }

    /**
     * add additional expand query parameter
     * @param op builder for the value to be added
     * @return ByProjectKeyPaymentMethodsByIDPost
     */
    public ByProjectKeyPaymentMethodsByIDPost addExpand(final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("expand", op.apply(new StringBuilder()));
    }

    /**
     * set expand with the specified values
     * @param expand values to be set
     * @param <TValue> value type
     * @return ByProjectKeyPaymentMethodsByIDPost
     */
    public <TValue> ByProjectKeyPaymentMethodsByIDPost withExpand(final Collection<TValue> expand) {
        return copy().withoutQueryParam("expand")
                .addQueryParams(
                    expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional expand query parameters
     * @param expand values to be added
     * @param <TValue> value type
     * @return ByProjectKeyPaymentMethodsByIDPost
     */
    public <TValue> ByProjectKeyPaymentMethodsByIDPost addExpand(final Collection<TValue> expand) {
        return copy().addQueryParams(
            expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList()));
    }

    public com.commercetools.api.models.payment_method.PaymentMethodUpdate getBody() {
        return paymentMethodUpdate;
    }

    public ByProjectKeyPaymentMethodsByIDPost withBody(
            com.commercetools.api.models.payment_method.PaymentMethodUpdate paymentMethodUpdate) {
        ByProjectKeyPaymentMethodsByIDPost t = copy();
        t.paymentMethodUpdate = paymentMethodUpdate;
        return t;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ByProjectKeyPaymentMethodsByIDPost that = (ByProjectKeyPaymentMethodsByIDPost) o;

        return new EqualsBuilder().append(projectKey, that.projectKey)
                .append(ID, that.ID)
                .append(paymentMethodUpdate, that.paymentMethodUpdate)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(projectKey).append(ID).append(paymentMethodUpdate).toHashCode();
    }

    @Override
    protected ByProjectKeyPaymentMethodsByIDPost copy() {
        return new ByProjectKeyPaymentMethodsByIDPost(this);
    }
}
