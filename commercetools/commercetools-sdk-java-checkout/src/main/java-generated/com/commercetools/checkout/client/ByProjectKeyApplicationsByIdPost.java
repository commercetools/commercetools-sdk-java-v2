
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
 *            .post(null)
 *            .execute()
 * }</code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyApplicationsByIdPost extends
        TypeBodyApiMethod<ByProjectKeyApplicationsByIdPost, com.commercetools.checkout.models.application.Application, com.commercetools.checkout.models.application.ApplicationUpdateActions>
        implements
        com.commercetools.checkout.client.Secured_by_manage_applicationsTrait<ByProjectKeyApplicationsByIdPost> {

    @Override
    public TypeReference<com.commercetools.checkout.models.application.Application> resultType() {
        return new TypeReference<com.commercetools.checkout.models.application.Application>() {
        };
    }

    private String projectKey;
    private String id;

    private com.commercetools.checkout.models.application.ApplicationUpdateActions applicationUpdateActions;

    public ByProjectKeyApplicationsByIdPost(final ApiHttpClient apiHttpClient, String projectKey, String id,
            com.commercetools.checkout.models.application.ApplicationUpdateActions applicationUpdateActions) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.id = id;
        this.applicationUpdateActions = applicationUpdateActions;
    }

    public ByProjectKeyApplicationsByIdPost(ByProjectKeyApplicationsByIdPost t) {
        super(t);
        this.projectKey = t.projectKey;
        this.id = t.id;
        this.applicationUpdateActions = t.applicationUpdateActions;
    }

    @Override
    protected ApiHttpRequest buildHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("%s/applications/%s", encodePathParam(this.projectKey),
            encodePathParam(this.id));
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(),
            io.vrap.rmf.base.client.utils.json.JsonUtils
                    .executing(() -> apiHttpClient().getSerializerService().toJsonByteArray(applicationUpdateActions)));

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

    public com.commercetools.checkout.models.application.ApplicationUpdateActions getBody() {
        return applicationUpdateActions;
    }

    public ByProjectKeyApplicationsByIdPost withBody(
            com.commercetools.checkout.models.application.ApplicationUpdateActions applicationUpdateActions) {
        ByProjectKeyApplicationsByIdPost t = copy();
        t.applicationUpdateActions = applicationUpdateActions;
        return t;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ByProjectKeyApplicationsByIdPost that = (ByProjectKeyApplicationsByIdPost) o;

        return new EqualsBuilder().append(projectKey, that.projectKey)
                .append(id, that.id)
                .append(applicationUpdateActions, that.applicationUpdateActions)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(projectKey).append(id).append(applicationUpdateActions).toHashCode();
    }

    @Override
    protected ByProjectKeyApplicationsByIdPost copy() {
        return new ByProjectKeyApplicationsByIdPost(this);
    }
}
