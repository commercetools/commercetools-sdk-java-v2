
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
 *  <p>Use this method to retrieve the details of a global Customer by using the password token during their password reset process.</p>
 *
 * <hr>
 * <div class=code-example>
 * <pre><code class='java'>{@code
 *   CompletableFuture<ApiHttpResponse<com.commercetools.api.models.customer.Customer>> result = apiRoot
 *            .withProjectKey("{projectKey}")
 *            .customers()
 *            .withPasswordToken("{passwordToken}")
 *            .get()
 *            .execute()
 * }</code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyCustomersPasswordTokenByPasswordTokenGet extends
        TypeApiMethod<ByProjectKeyCustomersPasswordTokenByPasswordTokenGet, com.commercetools.api.models.customer.Customer>
        implements com.commercetools.api.client.ExpandableTrait<ByProjectKeyCustomersPasswordTokenByPasswordTokenGet>,
        com.commercetools.api.client.ErrorableTrait<ByProjectKeyCustomersPasswordTokenByPasswordTokenGet>,
        com.commercetools.api.client.Deprecatable200Trait<ByProjectKeyCustomersPasswordTokenByPasswordTokenGet> {

    @Override
    public TypeReference<com.commercetools.api.models.customer.Customer> resultType() {
        return new TypeReference<com.commercetools.api.models.customer.Customer>() {
        };
    }

    private String projectKey;
    private String passwordToken;

    public ByProjectKeyCustomersPasswordTokenByPasswordTokenGet(final ApiHttpClient apiHttpClient, String projectKey,
            String passwordToken) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.passwordToken = passwordToken;
    }

    public ByProjectKeyCustomersPasswordTokenByPasswordTokenGet(
            ByProjectKeyCustomersPasswordTokenByPasswordTokenGet t) {
        super(t);
        this.projectKey = t.projectKey;
        this.passwordToken = t.passwordToken;
    }

    @Override
    protected ApiHttpRequest buildHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("%s/customers/password-token=%s", encodePathParam(this.projectKey),
            encodePathParam(this.passwordToken));
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        return new ApiHttpRequest(ApiHttpMethod.GET, URI.create(httpRequestPath), getHeaders(), null);
    }

    @Override
    public ApiHttpResponse<com.commercetools.api.models.customer.Customer> executeBlocking(final ApiHttpClient client,
            final Duration timeout) {
        return executeBlocking(client, timeout, com.commercetools.api.models.customer.Customer.class);
    }

    @Override
    public CompletableFuture<ApiHttpResponse<com.commercetools.api.models.customer.Customer>> execute(
            final ApiHttpClient client) {
        return execute(client, com.commercetools.api.models.customer.Customer.class);
    }

    public String getProjectKey() {
        return this.projectKey;
    }

    public String getPasswordToken() {
        return this.passwordToken;
    }

    public List<String> getExpand() {
        return this.getQueryParam("expand");
    }

    public void setProjectKey(final String projectKey) {
        this.projectKey = projectKey;
    }

    public void setPasswordToken(final String passwordToken) {
        this.passwordToken = passwordToken;
    }

    /**
     * set expand with the specified value
     * @param expand value to be set
     * @param <TValue> value type
     * @return ByProjectKeyCustomersPasswordTokenByPasswordTokenGet
     */
    public <TValue> ByProjectKeyCustomersPasswordTokenByPasswordTokenGet withExpand(final TValue expand) {
        return copy().withQueryParam("expand", expand);
    }

    /**
     * add additional expand query parameter
     * @param expand value to be added
     * @param <TValue> value type
     * @return ByProjectKeyCustomersPasswordTokenByPasswordTokenGet
     */
    public <TValue> ByProjectKeyCustomersPasswordTokenByPasswordTokenGet addExpand(final TValue expand) {
        return copy().addQueryParam("expand", expand);
    }

    /**
     * set expand with the specified value
     * @param supplier supplier for the value to be set
     * @return ByProjectKeyCustomersPasswordTokenByPasswordTokenGet
     */
    public ByProjectKeyCustomersPasswordTokenByPasswordTokenGet withExpand(final Supplier<String> supplier) {
        return copy().withQueryParam("expand", supplier.get());
    }

    /**
     * add additional expand query parameter
     * @param supplier supplier for the value to be added
     * @return ByProjectKeyCustomersPasswordTokenByPasswordTokenGet
     */
    public ByProjectKeyCustomersPasswordTokenByPasswordTokenGet addExpand(final Supplier<String> supplier) {
        return copy().addQueryParam("expand", supplier.get());
    }

    /**
     * set expand with the specified value
     * @param op builder for the value to be set
     * @return ByProjectKeyCustomersPasswordTokenByPasswordTokenGet
     */
    public ByProjectKeyCustomersPasswordTokenByPasswordTokenGet withExpand(
            final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("expand", op.apply(new StringBuilder()));
    }

    /**
     * add additional expand query parameter
     * @param op builder for the value to be added
     * @return ByProjectKeyCustomersPasswordTokenByPasswordTokenGet
     */
    public ByProjectKeyCustomersPasswordTokenByPasswordTokenGet addExpand(
            final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("expand", op.apply(new StringBuilder()));
    }

    /**
     * set expand with the specified values
     * @param expand values to be set
     * @param <TValue> value type
     * @return ByProjectKeyCustomersPasswordTokenByPasswordTokenGet
     */
    public <TValue> ByProjectKeyCustomersPasswordTokenByPasswordTokenGet withExpand(final Collection<TValue> expand) {
        return copy().withoutQueryParam("expand")
                .addQueryParams(
                    expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional expand query parameters
     * @param expand values to be added
     * @param <TValue> value type
     * @return ByProjectKeyCustomersPasswordTokenByPasswordTokenGet
     */
    public <TValue> ByProjectKeyCustomersPasswordTokenByPasswordTokenGet addExpand(final Collection<TValue> expand) {
        return copy().addQueryParams(
            expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList()));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ByProjectKeyCustomersPasswordTokenByPasswordTokenGet that = (ByProjectKeyCustomersPasswordTokenByPasswordTokenGet) o;

        return new EqualsBuilder().append(projectKey, that.projectKey)
                .append(passwordToken, that.passwordToken)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(projectKey).append(passwordToken).toHashCode();
    }

    @Override
    protected ByProjectKeyCustomersPasswordTokenByPasswordTokenGet copy() {
        return new ByProjectKeyCustomersPasswordTokenByPasswordTokenGet(this);
    }
}
