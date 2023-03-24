
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

import io.vrap.rmf.base.client.*;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 *  <p>This endpoint can only update a Payment when it has no Transactions.</p>
 *
 * <hr>
 * <div class=code-example>
 * <pre><code class='java'>{@code
 *   CompletableFuture<ApiHttpResponse<com.commercetools.api.models.me.MyPayment>> result = apiRoot
 *            .withProjectKey("{projectKey}")
 *            .me()
 *            .payments()
 *            .withKey("{key}")
 *            .post("")
 *            .execute()
 * }</code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyMePaymentsKeyByKeyPostString
        extends StringBodyApiMethod<ByProjectKeyMePaymentsKeyByKeyPostString, com.commercetools.api.models.me.MyPayment>
        implements com.commercetools.api.client.ConflictingTrait<ByProjectKeyMePaymentsKeyByKeyPostString>,
        com.commercetools.api.client.ExpandableTrait<ByProjectKeyMePaymentsKeyByKeyPostString>,
        com.commercetools.api.client.Deprecatable200Trait<ByProjectKeyMePaymentsKeyByKeyPostString>,
        com.commercetools.api.client.ErrorableTrait<ByProjectKeyMePaymentsKeyByKeyPostString> {

    private String projectKey;
    private String key;

    private String myPaymentUpdate;

    public ByProjectKeyMePaymentsKeyByKeyPostString(final ApiHttpClient apiHttpClient, String projectKey, String key,
            String myPaymentUpdate) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.key = key;
        this.myPaymentUpdate = myPaymentUpdate;
    }

    public ByProjectKeyMePaymentsKeyByKeyPostString(ByProjectKeyMePaymentsKeyByKeyPostString t) {
        super(t);
        this.projectKey = t.projectKey;
        this.key = t.key;
        this.myPaymentUpdate = t.myPaymentUpdate;
    }

    @Override
    protected ApiHttpRequest buildHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("%s/me/payments/key=%s", this.projectKey, this.key);
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(),
            myPaymentUpdate.getBytes(StandardCharsets.UTF_8));

    }

    @Override
    public ApiHttpResponse<com.commercetools.api.models.me.MyPayment> executeBlocking(final ApiHttpClient client,
            final Duration timeout) {
        return executeBlocking(client, timeout, com.commercetools.api.models.me.MyPayment.class);
    }

    @Override
    public CompletableFuture<ApiHttpResponse<com.commercetools.api.models.me.MyPayment>> execute(
            final ApiHttpClient client) {
        return execute(client, com.commercetools.api.models.me.MyPayment.class);
    }

    public String getProjectKey() {
        return this.projectKey;
    }

    public String getKey() {
        return this.key;
    }

    public List<String> getExpand() {
        return this.getQueryParam("expand");
    }

    public void setProjectKey(final String projectKey) {
        this.projectKey = projectKey;
    }

    public void setKey(final String key) {
        this.key = key;
    }

    /**
     * set expand with the specified value
     * @param <TValue> value type
     * @param expand value to be set
     * @return ByProjectKeyMePaymentsKeyByKeyPostString
     */
    public <TValue> ByProjectKeyMePaymentsKeyByKeyPostString withExpand(final TValue expand) {
        return copy().withQueryParam("expand", expand);
    }

    /**
     * add additional expand query parameter
     * @param <TValue> value type
     * @param expand value to be added
     * @return ByProjectKeyMePaymentsKeyByKeyPostString
     */
    public <TValue> ByProjectKeyMePaymentsKeyByKeyPostString addExpand(final TValue expand) {
        return copy().addQueryParam("expand", expand);
    }

    /**
     * set expand with the specified value
     * @param supplier supplier for the value to be set
     * @return ByProjectKeyMePaymentsKeyByKeyPostString
     */
    public ByProjectKeyMePaymentsKeyByKeyPostString withExpand(final Supplier<String> supplier) {
        return copy().withQueryParam("expand", supplier.get());
    }

    /**
     * add additional expand query parameter
     * @param supplier supplier for the value to be added
     * @return ByProjectKeyMePaymentsKeyByKeyPostString
     */
    public ByProjectKeyMePaymentsKeyByKeyPostString addExpand(final Supplier<String> supplier) {
        return copy().addQueryParam("expand", supplier.get());
    }

    /**
     * set expand with the specified value
     * @param op builder for the value to be set
     * @return ByProjectKeyMePaymentsKeyByKeyPostString
     */
    public ByProjectKeyMePaymentsKeyByKeyPostString withExpand(final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("expand", op.apply(new StringBuilder()));
    }

    /**
     * add additional expand query parameter
     * @param op builder for the value to be added
     * @return ByProjectKeyMePaymentsKeyByKeyPostString
     */
    public ByProjectKeyMePaymentsKeyByKeyPostString addExpand(final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("expand", op.apply(new StringBuilder()));
    }

    /**
     * set expand with the specified values
     * @param <TValue> value type
     * @param expand values to be set
     * @return ByProjectKeyMePaymentsKeyByKeyPostString
     */
    public <TValue> ByProjectKeyMePaymentsKeyByKeyPostString withExpand(final Collection<TValue> expand) {
        return copy().withoutQueryParam("expand")
                .addQueryParams(
                    expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional expand query parameters
     * @param <TValue> value type
     * @param expand values to be added
     * @return ByProjectKeyMePaymentsKeyByKeyPostString
     */
    public <TValue> ByProjectKeyMePaymentsKeyByKeyPostString addExpand(final Collection<TValue> expand) {
        return copy().addQueryParams(
            expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList()));
    }

    public String getBody() {
        return myPaymentUpdate;
    }

    public ByProjectKeyMePaymentsKeyByKeyPostString withBody(String myPaymentUpdate) {
        ByProjectKeyMePaymentsKeyByKeyPostString t = copy();
        t.myPaymentUpdate = myPaymentUpdate;
        return t;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ByProjectKeyMePaymentsKeyByKeyPostString that = (ByProjectKeyMePaymentsKeyByKeyPostString) o;

        return new EqualsBuilder().append(projectKey, that.projectKey)
                .append(key, that.key)
                .append(myPaymentUpdate, that.myPaymentUpdate)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(projectKey).append(key).append(myPaymentUpdate).toHashCode();
    }

    @Override
    protected ByProjectKeyMePaymentsKeyByKeyPostString copy() {
        return new ByProjectKeyMePaymentsKeyByKeyPostString(this);
    }
}
