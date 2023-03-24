
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
 *
 *
 * <hr>
 * <div class=code-example>
 * <pre><code class='java'>{@code
 *   CompletableFuture<ApiHttpResponse<com.commercetools.api.models.standalone_price.StandalonePrice>> result = apiRoot
 *            .withProjectKey("{projectKey}")
 *            .standalonePrices()
 *            .withId("{ID}")
 *            .post("")
 *            .execute()
 * }</code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyStandalonePricesByIDPostString extends
        StringBodyApiMethod<ByProjectKeyStandalonePricesByIDPostString, com.commercetools.api.models.standalone_price.StandalonePrice>
        implements com.commercetools.api.client.ConflictingTrait<ByProjectKeyStandalonePricesByIDPostString>,
        com.commercetools.api.client.ExpandableTrait<ByProjectKeyStandalonePricesByIDPostString>,
        com.commercetools.api.client.Deprecatable200Trait<ByProjectKeyStandalonePricesByIDPostString>,
        com.commercetools.api.client.ErrorableTrait<ByProjectKeyStandalonePricesByIDPostString> {

    private String projectKey;
    private String ID;

    private String standalonePriceUpdate;

    public ByProjectKeyStandalonePricesByIDPostString(final ApiHttpClient apiHttpClient, String projectKey, String ID,
            String standalonePriceUpdate) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.ID = ID;
        this.standalonePriceUpdate = standalonePriceUpdate;
    }

    public ByProjectKeyStandalonePricesByIDPostString(ByProjectKeyStandalonePricesByIDPostString t) {
        super(t);
        this.projectKey = t.projectKey;
        this.ID = t.ID;
        this.standalonePriceUpdate = t.standalonePriceUpdate;
    }

    @Override
    protected ApiHttpRequest buildHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("%s/standalone-prices/%s", this.projectKey, this.ID);
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(),
            standalonePriceUpdate.getBytes(StandardCharsets.UTF_8));

    }

    @Override
    public ApiHttpResponse<com.commercetools.api.models.standalone_price.StandalonePrice> executeBlocking(
            final ApiHttpClient client, final Duration timeout) {
        return executeBlocking(client, timeout, com.commercetools.api.models.standalone_price.StandalonePrice.class);
    }

    @Override
    public CompletableFuture<ApiHttpResponse<com.commercetools.api.models.standalone_price.StandalonePrice>> execute(
            final ApiHttpClient client) {
        return execute(client, com.commercetools.api.models.standalone_price.StandalonePrice.class);
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
     * @return ByProjectKeyStandalonePricesByIDPostString
     */
    public <TValue> ByProjectKeyStandalonePricesByIDPostString withExpand(final TValue expand) {
        return copy().withQueryParam("expand", expand);
    }

    /**
     * add additional expand query parameter
     * @param <TValue> value type
     * @param expand value to be added
     * @return ByProjectKeyStandalonePricesByIDPostString
     */
    public <TValue> ByProjectKeyStandalonePricesByIDPostString addExpand(final TValue expand) {
        return copy().addQueryParam("expand", expand);
    }

    /**
     * set expand with the specified value
     * @param supplier supplier for the value to be set
     * @return ByProjectKeyStandalonePricesByIDPostString
     */
    public ByProjectKeyStandalonePricesByIDPostString withExpand(final Supplier<String> supplier) {
        return copy().withQueryParam("expand", supplier.get());
    }

    /**
     * add additional expand query parameter
     * @param supplier supplier for the value to be added
     * @return ByProjectKeyStandalonePricesByIDPostString
     */
    public ByProjectKeyStandalonePricesByIDPostString addExpand(final Supplier<String> supplier) {
        return copy().addQueryParam("expand", supplier.get());
    }

    /**
     * set expand with the specified value
     * @param op builder for the value to be set
     * @return ByProjectKeyStandalonePricesByIDPostString
     */
    public ByProjectKeyStandalonePricesByIDPostString withExpand(final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("expand", op.apply(new StringBuilder()));
    }

    /**
     * add additional expand query parameter
     * @param op builder for the value to be added
     * @return ByProjectKeyStandalonePricesByIDPostString
     */
    public ByProjectKeyStandalonePricesByIDPostString addExpand(final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("expand", op.apply(new StringBuilder()));
    }

    /**
     * set expand with the specified values
     * @param <TValue> value type
     * @param expand values to be set
     * @return ByProjectKeyStandalonePricesByIDPostString
     */
    public <TValue> ByProjectKeyStandalonePricesByIDPostString withExpand(final Collection<TValue> expand) {
        return copy().withoutQueryParam("expand")
                .addQueryParams(
                    expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional expand query parameters
     * @param <TValue> value type
     * @param expand values to be added
     * @return ByProjectKeyStandalonePricesByIDPostString
     */
    public <TValue> ByProjectKeyStandalonePricesByIDPostString addExpand(final Collection<TValue> expand) {
        return copy().addQueryParams(
            expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList()));
    }

    public String getBody() {
        return standalonePriceUpdate;
    }

    public ByProjectKeyStandalonePricesByIDPostString withBody(String standalonePriceUpdate) {
        ByProjectKeyStandalonePricesByIDPostString t = copy();
        t.standalonePriceUpdate = standalonePriceUpdate;
        return t;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ByProjectKeyStandalonePricesByIDPostString that = (ByProjectKeyStandalonePricesByIDPostString) o;

        return new EqualsBuilder().append(projectKey, that.projectKey)
                .append(ID, that.ID)
                .append(standalonePriceUpdate, that.standalonePriceUpdate)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(projectKey).append(ID).append(standalonePriceUpdate).toHashCode();
    }

    @Override
    protected ByProjectKeyStandalonePricesByIDPostString copy() {
        return new ByProjectKeyStandalonePricesByIDPostString(this);
    }
}
