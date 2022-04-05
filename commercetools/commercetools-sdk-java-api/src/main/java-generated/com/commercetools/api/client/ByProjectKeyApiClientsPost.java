
package com.commercetools.api.client;

import java.net.URI;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;

import io.vrap.rmf.base.client.*;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ByProjectKeyApiClientsPost extends
        BodyApiMethod<ByProjectKeyApiClientsPost, com.commercetools.api.models.api_client.ApiClient, com.commercetools.api.models.api_client.ApiClientDraft>
        implements com.commercetools.api.client.ExpandableTrait<ByProjectKeyApiClientsPost>,
        com.commercetools.api.client.Deprecatable201Trait<ByProjectKeyApiClientsPost>,
        com.commercetools.api.client.ErrorableTrait<ByProjectKeyApiClientsPost> {

    private String projectKey;

    private com.commercetools.api.models.api_client.ApiClientDraft apiClientDraft;

    public ByProjectKeyApiClientsPost(final ApiHttpClient apiHttpClient, String projectKey,
            com.commercetools.api.models.api_client.ApiClientDraft apiClientDraft) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.apiClientDraft = apiClientDraft;
    }

    public ByProjectKeyApiClientsPost(ByProjectKeyApiClientsPost t) {
        super(t);
        this.projectKey = t.projectKey;
        this.apiClientDraft = t.apiClientDraft;
    }

    @Override
    protected ApiHttpRequest buildHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("/%s/api-clients", this.projectKey);
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(),
            io.vrap.rmf.base.client.utils.json.JsonUtils
                    .executing(() -> apiHttpClient().getSerializerService().toJsonByteArray(apiClientDraft)));

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
     */
    public <TValue> ByProjectKeyApiClientsPost withExpand(final TValue expand) {
        return copy().withQueryParam("expand", expand);
    }

    /**
     * add additional expand query parameter
     */
    public <TValue> ByProjectKeyApiClientsPost addExpand(final TValue expand) {
        return copy().addQueryParam("expand", expand);
    }

    /**
     * set expand with the specified value
     */
    public ByProjectKeyApiClientsPost withExpand(final Supplier<String> supplier) {
        return copy().withQueryParam("expand", supplier.get());
    }

    /**
     * add additional expand query parameter
     */
    public ByProjectKeyApiClientsPost addExpand(final Supplier<String> supplier) {
        return copy().addQueryParam("expand", supplier.get());
    }

    /**
     * set expand with the specified value
     */
    public ByProjectKeyApiClientsPost withExpand(final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("expand", op.apply(new StringBuilder()));
    }

    /**
     * add additional expand query parameter
     */
    public ByProjectKeyApiClientsPost addExpand(final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("expand", op.apply(new StringBuilder()));
    }

    /**
     * set expand with the specified values
     */
    public <TValue> ByProjectKeyApiClientsPost withExpand(final List<TValue> expand) {
        return copy().withoutQueryParam("expand")
                .addQueryParams(
                    expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional expand query parameters
     */
    public <TValue> ByProjectKeyApiClientsPost addExpand(final List<TValue> expand) {
        return copy().addQueryParams(
            expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList()));
    }

    public com.commercetools.api.models.api_client.ApiClientDraft getBody() {
        return apiClientDraft;
    }

    public ByProjectKeyApiClientsPost withBody(com.commercetools.api.models.api_client.ApiClientDraft apiClientDraft) {
        ByProjectKeyApiClientsPost t = copy();
        t.apiClientDraft = apiClientDraft;
        return t;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ByProjectKeyApiClientsPost that = (ByProjectKeyApiClientsPost) o;

        return new EqualsBuilder().append(projectKey, that.projectKey)
                .append(apiClientDraft, that.apiClientDraft)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(projectKey).append(apiClientDraft).toHashCode();
    }

    @Override
    protected ByProjectKeyApiClientsPost copy() {
        return new ByProjectKeyApiClientsPost(this);
    }
}
