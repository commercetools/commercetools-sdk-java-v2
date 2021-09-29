
package com.commercetools.api.client;

import static io.vrap.rmf.base.client.utils.ClientUtils.blockingWait;

import java.net.URI;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;

import io.vrap.rmf.base.client.*;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
*  <p>Delete my Customer</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ByProjectKeyMeDelete
        extends ApiMethod<ByProjectKeyMeDelete, com.commercetools.api.models.customer.Customer>
        implements com.commercetools.api.client.VersionedTrait<ByProjectKeyMeDelete>,
        com.commercetools.api.client.ConflictingTrait<ByProjectKeyMeDelete>,
        com.commercetools.api.client.ErrorableTrait<ByProjectKeyMeDelete>,
        com.commercetools.api.client.Deprecatable200Trait<ByProjectKeyMeDelete> {

    private String projectKey;

    public ByProjectKeyMeDelete(final ApiHttpClient apiHttpClient, String projectKey) {
        super(apiHttpClient);
        this.projectKey = projectKey;
    }

    public ByProjectKeyMeDelete(ByProjectKeyMeDelete t) {
        super(t);
        this.projectKey = t.projectKey;
    }

    @Override
    public ApiHttpRequest createHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("/%s/me", this.projectKey);
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }

        return new ApiHttpRequest(ApiHttpMethod.DELETE, URI.create(httpRequestPath), getHeaders(), null);
    }

    @Override
    public ApiHttpResponse<com.commercetools.api.models.customer.Customer> executeBlocking(final ApiHttpClient client,
            Duration timeout) {
        ApiHttpRequest request = this.createHttpRequest();
        return blockingWait(
            client.execute(request, com.commercetools.api.models.customer.Customer.class).toCompletableFuture(),
            request, timeout);
    }

    @Override
    public CompletableFuture<ApiHttpResponse<com.commercetools.api.models.customer.Customer>> execute(
            final ApiHttpClient client) {
        return client.execute(this.createHttpRequest(), com.commercetools.api.models.customer.Customer.class)
                .toCompletableFuture();
    }

    public String getProjectKey() {
        return this.projectKey;
    }

    public List<String> getVersion() {
        return this.getQueryParam("version");
    }

    public void setProjectKey(final String projectKey) {
        this.projectKey = projectKey;
    }

    /**
     * set version with the specificied value
     */
    public ByProjectKeyMeDelete withVersion(final long version) {
        return copy().withQueryParam("version", version);
    }

    /**
     * add additional version query parameter
     */
    public ByProjectKeyMeDelete addVersion(final long version) {
        return copy().addQueryParam("version", version);
    }

    /**
     * set version with the specificied values
     */
    public ByProjectKeyMeDelete withVersion(final List<Long> version) {
        return copy().withoutQueryParam("version")
                .addQueryParams(
                    version.stream().map(s -> new ParamEntry<>("version", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional version query parameters
     */
    public ByProjectKeyMeDelete addVersion(final List<Long> version) {
        return copy().addQueryParams(
            version.stream().map(s -> new ParamEntry<>("version", s.toString())).collect(Collectors.toList()));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ByProjectKeyMeDelete that = (ByProjectKeyMeDelete) o;

        return new EqualsBuilder().append(projectKey, that.projectKey).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(projectKey).toHashCode();
    }

    @Override
    protected ByProjectKeyMeDelete copy() {
        return new ByProjectKeyMeDelete(this);
    }
}
