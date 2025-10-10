
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
 *
 *
 * <hr>
 * <div class=code-example>
 * <pre><code class='java'>{@code
 *   CompletableFuture<ApiHttpResponse<com.commercetools.checkout.models.application.Application>> result = apiRoot
 *            .withProjectKey("{projectKey}")
 *            .applications()
 *            .withId("{id}")
 *            .delete(null)
 *            .execute()
 * }</code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyApplicationsByIdDelete extends
        TypeBodyApiMethod<ByProjectKeyApplicationsByIdDelete, com.commercetools.checkout.models.application.Application, com.commercetools.checkout.models.application.Application>
        implements
        com.commercetools.checkout.client.Secured_by_manage_applicationsTrait<ByProjectKeyApplicationsByIdDelete> {

    @Override
    public TypeReference<com.commercetools.checkout.models.application.Application> resultType() {
        return new TypeReference<com.commercetools.checkout.models.application.Application>() {
        };
    }

    private String projectKey;
    private String id;

    private com.commercetools.checkout.models.application.Application application;

    public ByProjectKeyApplicationsByIdDelete(final ApiHttpClient apiHttpClient, String projectKey, String id,
            com.commercetools.checkout.models.application.Application application) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.id = id;
        this.application = application;
    }

    public ByProjectKeyApplicationsByIdDelete(ByProjectKeyApplicationsByIdDelete t) {
        super(t);
        this.projectKey = t.projectKey;
        this.id = t.id;
        this.application = t.application;
    }

    @Override
    protected ApiHttpRequest buildHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("%s/applications/%s", encodePathParam(this.projectKey),
            encodePathParam(this.id));
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        return new ApiHttpRequest(ApiHttpMethod.DELETE, URI.create(httpRequestPath), getHeaders(),
            io.vrap.rmf.base.client.utils.json.JsonUtils
                    .executing(() -> apiHttpClient().getSerializerService().toJsonByteArray(application)));

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

    public com.commercetools.checkout.models.application.Application getBody() {
        return application;
    }

    public ByProjectKeyApplicationsByIdDelete withBody(
            com.commercetools.checkout.models.application.Application application) {
        ByProjectKeyApplicationsByIdDelete t = copy();
        t.application = application;
        return t;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ByProjectKeyApplicationsByIdDelete that = (ByProjectKeyApplicationsByIdDelete) o;

        return new EqualsBuilder().append(projectKey, that.projectKey)
                .append(id, that.id)
                .append(application, that.application)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(projectKey).append(id).append(application).toHashCode();
    }

    @Override
    protected ByProjectKeyApplicationsByIdDelete copy() {
        return new ByProjectKeyApplicationsByIdDelete(this);
    }
}
