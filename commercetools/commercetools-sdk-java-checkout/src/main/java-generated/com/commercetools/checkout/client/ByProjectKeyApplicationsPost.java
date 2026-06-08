
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
 *  <p>Creates a new <a href="https://docs.commercetools.com/apis/ctp:checkout:type:Application" rel="nofollow">Application</a>.</p>
 *
 * <hr>
 * <div class=code-example>
 * <pre><code class='java'>{@code
 *   CompletableFuture<ApiHttpResponse<com.commercetools.checkout.models.application.Application>> result = apiRoot
 *            .withProjectKey("{projectKey}")
 *            .applications()
 *            .post(null)
 *            .execute()
 * }</code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyApplicationsPost extends
        TypeBodyApiMethod<ByProjectKeyApplicationsPost, com.commercetools.checkout.models.application.Application, com.commercetools.checkout.models.application.ApplicationDraft>
        implements com.commercetools.checkout.client.Secured_by_manage_applicationsTrait<ByProjectKeyApplicationsPost> {

    @Override
    public TypeReference<com.commercetools.checkout.models.application.Application> resultType() {
        return new TypeReference<com.commercetools.checkout.models.application.Application>() {
        };
    }

    private String projectKey;

    private com.commercetools.checkout.models.application.ApplicationDraft applicationDraft;

    public ByProjectKeyApplicationsPost(final ApiHttpClient apiHttpClient, String projectKey,
            com.commercetools.checkout.models.application.ApplicationDraft applicationDraft) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.applicationDraft = applicationDraft;
    }

    public ByProjectKeyApplicationsPost(ByProjectKeyApplicationsPost t) {
        super(t);
        this.projectKey = t.projectKey;
        this.applicationDraft = t.applicationDraft;
    }

    @Override
    protected ApiHttpRequest buildHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("%s/applications", encodePathParam(this.projectKey));
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(),
            io.vrap.rmf.base.client.utils.json.JsonUtils
                    .executing(() -> apiHttpClient().getSerializerService().toJsonByteArray(applicationDraft)));

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

    public void setProjectKey(final String projectKey) {
        this.projectKey = projectKey;
    }

    public com.commercetools.checkout.models.application.ApplicationDraft getBody() {
        return applicationDraft;
    }

    public ByProjectKeyApplicationsPost withBody(
            com.commercetools.checkout.models.application.ApplicationDraft applicationDraft) {
        ByProjectKeyApplicationsPost t = copy();
        t.applicationDraft = applicationDraft;
        return t;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ByProjectKeyApplicationsPost that = (ByProjectKeyApplicationsPost) o;

        return new EqualsBuilder().append(projectKey, that.projectKey)
                .append(applicationDraft, that.applicationDraft)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(projectKey).append(applicationDraft).toHashCode();
    }

    @Override
    protected ByProjectKeyApplicationsPost copy() {
        return new ByProjectKeyApplicationsPost(this);
    }
}
