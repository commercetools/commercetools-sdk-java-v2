
package com.commercetools.checkout.client;

import java.net.URI;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;

import com.fasterxml.jackson.core.type.TypeReference;

import io.vrap.rmf.base.client.*;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 *  <p>Retrieves an <a href="https://docs.commercetools.com/apis/ctp:checkout:type:Application" rel="nofollow">Application</a> by a given <code>id</code>.</p>
 *
 * <hr>
 * <div class=code-example>
 * <pre><code class='java'>{@code
 *   CompletableFuture<ApiHttpResponse<com.commercetools.checkout.models.application.Application>> result = apiRoot
 *            .withProjectKey("{projectKey}")
 *            .applications()
 *            .withId("{id}")
 *            .get()
 *            .execute()
 * }</code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyApplicationsByIdGet extends
        TypeApiMethod<ByProjectKeyApplicationsByIdGet, com.commercetools.checkout.models.application.Application>
        implements
        com.commercetools.checkout.client.Secured_by_view_applicationsTrait<ByProjectKeyApplicationsByIdGet> {

    @Override
    public TypeReference<com.commercetools.checkout.models.application.Application> resultType() {
        return new TypeReference<com.commercetools.checkout.models.application.Application>() {
        };
    }

    private String projectKey;
    private String id;

    public ByProjectKeyApplicationsByIdGet(final ApiHttpClient apiHttpClient, String projectKey, String id) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.id = id;
    }

    public ByProjectKeyApplicationsByIdGet(ByProjectKeyApplicationsByIdGet t) {
        super(t);
        this.projectKey = t.projectKey;
        this.id = t.id;
    }

    @Override
    protected ApiHttpRequest buildHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("%s/applications/%s", encodePathParam(this.projectKey),
            encodePathParam(this.id));
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        return new ApiHttpRequest(ApiHttpMethod.GET, URI.create(httpRequestPath), getHeaders(), null);
    }

    @Override
    public ApiHttpResponse<com.commercetools.checkout.models.application.Application> executeBlocking(
            final ApiHttpClient client, final Duration timeout) {
        return executeBlocking(client, timeout, com.commercetools.checkout.models.application.Application.class);
    }

    @Override
    public CompletableFuture<ApiHttpResponse<com.commercetools.checkout.models.application.Application>> execute(
            final ApiHttpClient client) {
        return execute(client, com.commercetools.checkout.models.application.Application.class);
    }

    public String getProjectKey() {
        return this.projectKey;
    }

    public String getId() {
        return this.id;
    }

    public void setProjectKey(final String projectKey) {
        this.projectKey = projectKey;
    }

    public void setId(final String id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ByProjectKeyApplicationsByIdGet that = (ByProjectKeyApplicationsByIdGet) o;

        return new EqualsBuilder().append(projectKey, that.projectKey).append(id, that.id).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(projectKey).append(id).toHashCode();
    }

    @Override
    protected ByProjectKeyApplicationsByIdGet copy() {
        return new ByProjectKeyApplicationsByIdGet(this);
    }
}
