
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
 *
 *
 * <hr>
 * <div class=code-example>
 * <pre><code class='java'>{@code
 *   CompletableFuture<ApiHttpResponse<com.commercetools.api.models.quote.Quote>> result = apiRoot
 *            .withProjectKey("{projectKey}")
 *            .me()
 *            .quotes()
 *            .withId("{ID}")
 *            .post("")
 *            .execute()
 * }</code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyMeQuotesByIDPostString
        extends StringBodyApiMethod<ByProjectKeyMeQuotesByIDPostString, com.commercetools.api.models.quote.Quote>
        implements com.commercetools.api.client.ConflictingTrait<ByProjectKeyMeQuotesByIDPostString>,
        com.commercetools.api.client.ExpandableTrait<ByProjectKeyMeQuotesByIDPostString>,
        com.commercetools.api.client.Deprecatable200Trait<ByProjectKeyMeQuotesByIDPostString>,
        com.commercetools.api.client.ErrorableTrait<ByProjectKeyMeQuotesByIDPostString> {

    public TypeReference<com.commercetools.api.models.quote.Quote> resultType() {
        return new TypeReference<com.commercetools.api.models.quote.Quote>() {
        };
    }

    private String projectKey;
    private String ID;

    private String myQuoteUpdate;

    public ByProjectKeyMeQuotesByIDPostString(final ApiHttpClient apiHttpClient, String projectKey, String ID,
            String myQuoteUpdate) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.ID = ID;
        this.myQuoteUpdate = myQuoteUpdate;
    }

    public ByProjectKeyMeQuotesByIDPostString(ByProjectKeyMeQuotesByIDPostString t) {
        super(t);
        this.projectKey = t.projectKey;
        this.ID = t.ID;
        this.myQuoteUpdate = t.myQuoteUpdate;
    }

    @Override
    protected ApiHttpRequest buildHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("%s/me/quotes/%s", this.projectKey, this.ID);
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(),
            myQuoteUpdate.getBytes(StandardCharsets.UTF_8));

    }

    @Override
    public ApiHttpResponse<com.commercetools.api.models.quote.Quote> executeBlocking(final ApiHttpClient client,
            final Duration timeout) {
        return executeBlocking(client, timeout, com.commercetools.api.models.quote.Quote.class);
    }

    @Override
    public CompletableFuture<ApiHttpResponse<com.commercetools.api.models.quote.Quote>> execute(
            final ApiHttpClient client) {
        return execute(client, com.commercetools.api.models.quote.Quote.class);
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
     * @return ByProjectKeyMeQuotesByIDPostString
     */
    public <TValue> ByProjectKeyMeQuotesByIDPostString withExpand(final TValue expand) {
        return copy().withQueryParam("expand", expand);
    }

    /**
     * add additional expand query parameter
     * @param <TValue> value type
     * @param expand value to be added
     * @return ByProjectKeyMeQuotesByIDPostString
     */
    public <TValue> ByProjectKeyMeQuotesByIDPostString addExpand(final TValue expand) {
        return copy().addQueryParam("expand", expand);
    }

    /**
     * set expand with the specified value
     * @param supplier supplier for the value to be set
     * @return ByProjectKeyMeQuotesByIDPostString
     */
    public ByProjectKeyMeQuotesByIDPostString withExpand(final Supplier<String> supplier) {
        return copy().withQueryParam("expand", supplier.get());
    }

    /**
     * add additional expand query parameter
     * @param supplier supplier for the value to be added
     * @return ByProjectKeyMeQuotesByIDPostString
     */
    public ByProjectKeyMeQuotesByIDPostString addExpand(final Supplier<String> supplier) {
        return copy().addQueryParam("expand", supplier.get());
    }

    /**
     * set expand with the specified value
     * @param op builder for the value to be set
     * @return ByProjectKeyMeQuotesByIDPostString
     */
    public ByProjectKeyMeQuotesByIDPostString withExpand(final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("expand", op.apply(new StringBuilder()));
    }

    /**
     * add additional expand query parameter
     * @param op builder for the value to be added
     * @return ByProjectKeyMeQuotesByIDPostString
     */
    public ByProjectKeyMeQuotesByIDPostString addExpand(final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("expand", op.apply(new StringBuilder()));
    }

    /**
     * set expand with the specified values
     * @param <TValue> value type
     * @param expand values to be set
     * @return ByProjectKeyMeQuotesByIDPostString
     */
    public <TValue> ByProjectKeyMeQuotesByIDPostString withExpand(final Collection<TValue> expand) {
        return copy().withoutQueryParam("expand")
                .addQueryParams(
                    expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional expand query parameters
     * @param <TValue> value type
     * @param expand values to be added
     * @return ByProjectKeyMeQuotesByIDPostString
     */
    public <TValue> ByProjectKeyMeQuotesByIDPostString addExpand(final Collection<TValue> expand) {
        return copy().addQueryParams(
            expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList()));
    }

    public String getBody() {
        return myQuoteUpdate;
    }

    public ByProjectKeyMeQuotesByIDPostString withBody(String myQuoteUpdate) {
        ByProjectKeyMeQuotesByIDPostString t = copy();
        t.myQuoteUpdate = myQuoteUpdate;
        return t;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ByProjectKeyMeQuotesByIDPostString that = (ByProjectKeyMeQuotesByIDPostString) o;

        return new EqualsBuilder().append(projectKey, that.projectKey)
                .append(ID, that.ID)
                .append(myQuoteUpdate, that.myQuoteUpdate)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(projectKey).append(ID).append(myQuoteUpdate).toHashCode();
    }

    @Override
    protected ByProjectKeyMeQuotesByIDPostString copy() {
        return new ByProjectKeyMeQuotesByIDPostString(this);
    }
}
