
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
 *   CompletableFuture<ApiHttpResponse<com.commercetools.api.models.api_client.ApiClient>> result = apiRoot
 *            .withProjectKey("{projectKey}")
 *            .apiClients()
 *            .post("")
 *            .execute()
 * }</code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyApiClientsPostString
        extends StringBodyApiMethod<ByProjectKeyApiClientsPostString, com.commercetools.api.models.api_client.ApiClient>
        implements com.commercetools.api.client.ExpandableTrait<ByProjectKeyApiClientsPostString>,
        com.commercetools.api.client.Deprecatable201Trait<ByProjectKeyApiClientsPostString>,
        com.commercetools.api.client.ErrorableTrait<ByProjectKeyApiClientsPostString> {

    @Override
    public TypeReference<com.commercetools.api.models.api_client.ApiClient> resultType() {
        return new TypeReference<com.commercetools.api.models.api_client.ApiClient>() {
        };
    }

    private String projectKey;

    private String apiClientDraft;

    public ByProjectKeyApiClientsPostString(final ApiHttpClient apiHttpClient, String projectKey,
            String apiClientDraft) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.apiClientDraft = apiClientDraft;
    }

    public ByProjectKeyApiClientsPostString(ByProjectKeyApiClientsPostString t) {
        super(t);
        this.projectKey = t.projectKey;
        this.apiClientDraft = t.apiClientDraft;
    }

    @Override
    protected ApiHttpRequest buildHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("%s/api-clients", this.projectKey);
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(),
            apiClientDraft.getBytes(StandardCharsets.UTF_8));

    }

    @Override
    public ApiHttpResponse<com.commercetools.api.models.api_client.ApiClient> executeBlocking(
            final ApiHttpClient client, final Duration timeout) {
        return executeBlocking(client, timeout, com.commercetools.api.models.api_client.ApiClient.class);
    }

    @Override
    public CompletableFuture<ApiHttpResponse<com.commercetools.api.models.api_client.ApiClient>> execute(
            final ApiHttpClient client) {
        return execute(client, com.commercetools.api.models.api_client.ApiClient.class);
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
     * @return ByProjectKeyApiClientsPostString
     */
    public <TValue> ByProjectKeyApiClientsPostString withExpand(final TValue expand) {
        return copy().withQueryParam("expand", expand);
    }

    /**
     * add additional expand query parameter
     * @param <TValue> value type
     * @param expand value to be added
     * @return ByProjectKeyApiClientsPostString
     */
    public <TValue> ByProjectKeyApiClientsPostString addExpand(final TValue expand) {
        return copy().addQueryParam("expand", expand);
    }

    /**
     * set expand with the specified value
     * @param supplier supplier for the value to be set
     * @return ByProjectKeyApiClientsPostString
     */
    public ByProjectKeyApiClientsPostString withExpand(final Supplier<String> supplier) {
        return copy().withQueryParam("expand", supplier.get());
    }

    /**
     * add additional expand query parameter
     * @param supplier supplier for the value to be added
     * @return ByProjectKeyApiClientsPostString
     */
    public ByProjectKeyApiClientsPostString addExpand(final Supplier<String> supplier) {
        return copy().addQueryParam("expand", supplier.get());
    }

    /**
     * set expand with the specified value
     * @param op builder for the value to be set
     * @return ByProjectKeyApiClientsPostString
     */
    public ByProjectKeyApiClientsPostString withExpand(final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("expand", op.apply(new StringBuilder()));
    }

    /**
     * add additional expand query parameter
     * @param op builder for the value to be added
     * @return ByProjectKeyApiClientsPostString
     */
    public ByProjectKeyApiClientsPostString addExpand(final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("expand", op.apply(new StringBuilder()));
    }

    /**
     * set expand with the specified values
     * @param <TValue> value type
     * @param expand values to be set
     * @return ByProjectKeyApiClientsPostString
     */
    public <TValue> ByProjectKeyApiClientsPostString withExpand(final Collection<TValue> expand) {
        return copy().withoutQueryParam("expand")
                .addQueryParams(
                    expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional expand query parameters
     * @param <TValue> value type
     * @param expand values to be added
     * @return ByProjectKeyApiClientsPostString
     */
    public <TValue> ByProjectKeyApiClientsPostString addExpand(final Collection<TValue> expand) {
        return copy().addQueryParams(
            expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList()));
    }

    public String getBody() {
        return apiClientDraft;
    }

    public ByProjectKeyApiClientsPostString withBody(String apiClientDraft) {
        ByProjectKeyApiClientsPostString t = copy();
        t.apiClientDraft = apiClientDraft;
        return t;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ByProjectKeyApiClientsPostString that = (ByProjectKeyApiClientsPostString) o;

        return new EqualsBuilder().append(projectKey, that.projectKey)
                .append(apiClientDraft, that.apiClientDraft)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(projectKey).append(apiClientDraft).toHashCode();
    }

    @Override
    protected ByProjectKeyApiClientsPostString copy() {
        return new ByProjectKeyApiClientsPostString(this);
    }
}
