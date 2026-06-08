
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
 *  <p>Creates a ShippingMethod in the Project.</p>
 *
 * <hr>
 * <div class=code-example>
 * <pre><code class='java'>{@code
 *   CompletableFuture<ApiHttpResponse<com.commercetools.api.models.shipping_method.ShippingMethod>> result = apiRoot
 *            .withProjectKey("{projectKey}")
 *            .shippingMethods()
 *            .post("")
 *            .execute()
 * }</code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyShippingMethodsPostString extends
        StringBodyApiMethod<ByProjectKeyShippingMethodsPostString, com.commercetools.api.models.shipping_method.ShippingMethod>
        implements com.commercetools.api.client.ExpandableTrait<ByProjectKeyShippingMethodsPostString>,
        com.commercetools.api.client.Deprecatable201Trait<ByProjectKeyShippingMethodsPostString>,
        com.commercetools.api.client.ErrorableTrait<ByProjectKeyShippingMethodsPostString> {

    @Override
    public TypeReference<com.commercetools.api.models.shipping_method.ShippingMethod> resultType() {
        return new TypeReference<com.commercetools.api.models.shipping_method.ShippingMethod>() {
        };
    }

    private String projectKey;

    private String shippingMethodDraft;

    public ByProjectKeyShippingMethodsPostString(final ApiHttpClient apiHttpClient, String projectKey,
            String shippingMethodDraft) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.shippingMethodDraft = shippingMethodDraft;
    }

    public ByProjectKeyShippingMethodsPostString(ByProjectKeyShippingMethodsPostString t) {
        super(t);
        this.projectKey = t.projectKey;
        this.shippingMethodDraft = t.shippingMethodDraft;
    }

    @Override
    protected ApiHttpRequest buildHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("%s/shipping-methods", this.projectKey);
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(),
            shippingMethodDraft.getBytes(StandardCharsets.UTF_8));

    }

    @Override
    public ApiHttpResponse<com.commercetools.api.models.shipping_method.ShippingMethod> executeBlocking(
            final ApiHttpClient client, final Duration timeout) {
        return executeBlocking(client, timeout, com.commercetools.api.models.shipping_method.ShippingMethod.class);
    }

    @Override
    public CompletableFuture<ApiHttpResponse<com.commercetools.api.models.shipping_method.ShippingMethod>> execute(
            final ApiHttpClient client) {
        return execute(client, com.commercetools.api.models.shipping_method.ShippingMethod.class);
    }

    public String getProjectKey() {
        return this.projectKey;
    }

    public List<String> getExpand() {
        return this.getQueryParam("expand");
    }

    public void setProjectKey(final String projectKey) {
        this.projectKey = projectKey;
    }

    /**
     * set expand with the specified value
     * @param <TValue> value type
     * @param expand value to be set
     * @return ByProjectKeyShippingMethodsPostString
     */
    public <TValue> ByProjectKeyShippingMethodsPostString withExpand(final TValue expand) {
        return copy().withQueryParam("expand", expand);
    }

    /**
     * add additional expand query parameter
     * @param <TValue> value type
     * @param expand value to be added
     * @return ByProjectKeyShippingMethodsPostString
     */
    public <TValue> ByProjectKeyShippingMethodsPostString addExpand(final TValue expand) {
        return copy().addQueryParam("expand", expand);
    }

    /**
     * set expand with the specified value
     * @param supplier supplier for the value to be set
     * @return ByProjectKeyShippingMethodsPostString
     */
    public ByProjectKeyShippingMethodsPostString withExpand(final Supplier<String> supplier) {
        return copy().withQueryParam("expand", supplier.get());
    }

    /**
     * add additional expand query parameter
     * @param supplier supplier for the value to be added
     * @return ByProjectKeyShippingMethodsPostString
     */
    public ByProjectKeyShippingMethodsPostString addExpand(final Supplier<String> supplier) {
        return copy().addQueryParam("expand", supplier.get());
    }

    /**
     * set expand with the specified value
     * @param op builder for the value to be set
     * @return ByProjectKeyShippingMethodsPostString
     */
    public ByProjectKeyShippingMethodsPostString withExpand(final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("expand", op.apply(new StringBuilder()));
    }

    /**
     * add additional expand query parameter
     * @param op builder for the value to be added
     * @return ByProjectKeyShippingMethodsPostString
     */
    public ByProjectKeyShippingMethodsPostString addExpand(final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("expand", op.apply(new StringBuilder()));
    }

    /**
     * set expand with the specified values
     * @param <TValue> value type
     * @param expand values to be set
     * @return ByProjectKeyShippingMethodsPostString
     */
    public <TValue> ByProjectKeyShippingMethodsPostString withExpand(final Collection<TValue> expand) {
        return copy().withoutQueryParam("expand")
                .addQueryParams(
                    expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional expand query parameters
     * @param <TValue> value type
     * @param expand values to be added
     * @return ByProjectKeyShippingMethodsPostString
     */
    public <TValue> ByProjectKeyShippingMethodsPostString addExpand(final Collection<TValue> expand) {
        return copy().addQueryParams(
            expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList()));
    }

    public String getBody() {
        return shippingMethodDraft;
    }

    public ByProjectKeyShippingMethodsPostString withBody(String shippingMethodDraft) {
        ByProjectKeyShippingMethodsPostString t = copy();
        t.shippingMethodDraft = shippingMethodDraft;
        return t;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ByProjectKeyShippingMethodsPostString that = (ByProjectKeyShippingMethodsPostString) o;

        return new EqualsBuilder().append(projectKey, that.projectKey)
                .append(shippingMethodDraft, that.shippingMethodDraft)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(projectKey).append(shippingMethodDraft).toHashCode();
    }

    @Override
    protected ByProjectKeyShippingMethodsPostString copy() {
        return new ByProjectKeyShippingMethodsPostString(this);
    }
}
