
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
 *  <p>Deletes a PaymentMethod in the Project. This request generates the <a href="https://docs.commercetools.com/apis/ctp:api:type:PaymentMethodDeletedMessage" rel="nofollow">PaymentMethodDeleted</a> Message.</p>
 *
 * <hr>
 * <div class=code-example>
 * <pre><code class='java'>{@code
 *   CompletableFuture<ApiHttpResponse<com.commercetools.api.models.payment_method.PaymentMethod>> result = apiRoot
 *            .withProjectKey("{projectKey}")
 *            .paymentMethods()
 *            .withId("{ID}")
 *            .delete()
 *            .withVersion(version)
 *            .execute()
 * }</code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyPaymentMethodsByIDDelete extends
        TypeApiMethod<ByProjectKeyPaymentMethodsByIDDelete, com.commercetools.api.models.payment_method.PaymentMethod>
        implements com.commercetools.api.client.VersionedTrait<ByProjectKeyPaymentMethodsByIDDelete>,
        com.commercetools.api.client.ConflictingTrait<ByProjectKeyPaymentMethodsByIDDelete>,
        com.commercetools.api.client.ExpandableTrait<ByProjectKeyPaymentMethodsByIDDelete>,
        com.commercetools.api.client.ErrorableTrait<ByProjectKeyPaymentMethodsByIDDelete>,
        com.commercetools.api.client.Deprecatable200Trait<ByProjectKeyPaymentMethodsByIDDelete> {

    @Override
    public TypeReference<com.commercetools.api.models.payment_method.PaymentMethod> resultType() {
        return new TypeReference<com.commercetools.api.models.payment_method.PaymentMethod>() {
        };
    }

    private String projectKey;
    private String ID;

    public ByProjectKeyPaymentMethodsByIDDelete(final ApiHttpClient apiHttpClient, String projectKey, String ID) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.ID = ID;
    }

    public ByProjectKeyPaymentMethodsByIDDelete(ByProjectKeyPaymentMethodsByIDDelete t) {
        super(t);
        this.projectKey = t.projectKey;
        this.ID = t.ID;
    }

    @Override
    protected ApiHttpRequest buildHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("%s/payment-methods/%s", encodePathParam(this.projectKey),
            encodePathParam(this.ID));
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        return new ApiHttpRequest(ApiHttpMethod.DELETE, URI.create(httpRequestPath), getHeaders(), null);
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

    public List<String> getVersion() {
        return this.getQueryParam("version");
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
     * set version with the specified value
     * @param version value to be set
     * @param <TValue> value type
     * @return ByProjectKeyPaymentMethodsByIDDelete
     */
    public <TValue> ByProjectKeyPaymentMethodsByIDDelete withVersion(final TValue version) {
        return copy().withQueryParam("version", version);
    }

    /**
     * add additional version query parameter
     * @param version value to be added
     * @param <TValue> value type
     * @return ByProjectKeyPaymentMethodsByIDDelete
     */
    public <TValue> ByProjectKeyPaymentMethodsByIDDelete addVersion(final TValue version) {
        return copy().addQueryParam("version", version);
    }

    /**
     * set version with the specified value
     * @param supplier supplier for the value to be set
     * @return ByProjectKeyPaymentMethodsByIDDelete
     */
    public ByProjectKeyPaymentMethodsByIDDelete withVersion(final Supplier<Long> supplier) {
        return copy().withQueryParam("version", supplier.get());
    }

    /**
     * add additional version query parameter
     * @param supplier supplier for the value to be added
     * @return ByProjectKeyPaymentMethodsByIDDelete
     */
    public ByProjectKeyPaymentMethodsByIDDelete addVersion(final Supplier<Long> supplier) {
        return copy().addQueryParam("version", supplier.get());
    }

    /**
     * set version with the specified value
     * @param op builder for the value to be set
     * @return ByProjectKeyPaymentMethodsByIDDelete
     */
    public ByProjectKeyPaymentMethodsByIDDelete withVersion(final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("version", op.apply(new StringBuilder()));
    }

    /**
     * add additional version query parameter
     * @param op builder for the value to be added
     * @return ByProjectKeyPaymentMethodsByIDDelete
     */
    public ByProjectKeyPaymentMethodsByIDDelete addVersion(final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("version", op.apply(new StringBuilder()));
    }

    /**
     * set version with the specified values
     * @param version values to be set
     * @param <TValue> value type
     * @return ByProjectKeyPaymentMethodsByIDDelete
     */
    public <TValue> ByProjectKeyPaymentMethodsByIDDelete withVersion(final Collection<TValue> version) {
        return copy().withoutQueryParam("version")
                .addQueryParams(
                    version.stream().map(s -> new ParamEntry<>("version", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional version query parameters
     * @param version values to be added
     * @param <TValue> value type
     * @return ByProjectKeyPaymentMethodsByIDDelete
     */
    public <TValue> ByProjectKeyPaymentMethodsByIDDelete addVersion(final Collection<TValue> version) {
        return copy().addQueryParams(
            version.stream().map(s -> new ParamEntry<>("version", s.toString())).collect(Collectors.toList()));
    }

    /**
     * set expand with the specified value
     * @param expand value to be set
     * @param <TValue> value type
     * @return ByProjectKeyPaymentMethodsByIDDelete
     */
    public <TValue> ByProjectKeyPaymentMethodsByIDDelete withExpand(final TValue expand) {
        return copy().withQueryParam("expand", expand);
    }

    /**
     * add additional expand query parameter
     * @param expand value to be added
     * @param <TValue> value type
     * @return ByProjectKeyPaymentMethodsByIDDelete
     */
    public <TValue> ByProjectKeyPaymentMethodsByIDDelete addExpand(final TValue expand) {
        return copy().addQueryParam("expand", expand);
    }

    /**
     * set expand with the specified value
     * @param supplier supplier for the value to be set
     * @return ByProjectKeyPaymentMethodsByIDDelete
     */
    public ByProjectKeyPaymentMethodsByIDDelete withExpand(final Supplier<String> supplier) {
        return copy().withQueryParam("expand", supplier.get());
    }

    /**
     * add additional expand query parameter
     * @param supplier supplier for the value to be added
     * @return ByProjectKeyPaymentMethodsByIDDelete
     */
    public ByProjectKeyPaymentMethodsByIDDelete addExpand(final Supplier<String> supplier) {
        return copy().addQueryParam("expand", supplier.get());
    }

    /**
     * set expand with the specified value
     * @param op builder for the value to be set
     * @return ByProjectKeyPaymentMethodsByIDDelete
     */
    public ByProjectKeyPaymentMethodsByIDDelete withExpand(final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("expand", op.apply(new StringBuilder()));
    }

    /**
     * add additional expand query parameter
     * @param op builder for the value to be added
     * @return ByProjectKeyPaymentMethodsByIDDelete
     */
    public ByProjectKeyPaymentMethodsByIDDelete addExpand(final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("expand", op.apply(new StringBuilder()));
    }

    /**
     * set expand with the specified values
     * @param expand values to be set
     * @param <TValue> value type
     * @return ByProjectKeyPaymentMethodsByIDDelete
     */
    public <TValue> ByProjectKeyPaymentMethodsByIDDelete withExpand(final Collection<TValue> expand) {
        return copy().withoutQueryParam("expand")
                .addQueryParams(
                    expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional expand query parameters
     * @param expand values to be added
     * @param <TValue> value type
     * @return ByProjectKeyPaymentMethodsByIDDelete
     */
    public <TValue> ByProjectKeyPaymentMethodsByIDDelete addExpand(final Collection<TValue> expand) {
        return copy().addQueryParams(
            expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList()));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ByProjectKeyPaymentMethodsByIDDelete that = (ByProjectKeyPaymentMethodsByIDDelete) o;

        return new EqualsBuilder().append(projectKey, that.projectKey).append(ID, that.ID).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(projectKey).append(ID).toHashCode();
    }

    @Override
    protected ByProjectKeyPaymentMethodsByIDDelete copy() {
        return new ByProjectKeyPaymentMethodsByIDDelete(this);
    }
}
