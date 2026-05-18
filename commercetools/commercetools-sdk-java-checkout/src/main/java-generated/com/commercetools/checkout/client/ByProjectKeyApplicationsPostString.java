
package com.commercetools.checkout.client;

import java.net.URI;
import java.nio.charset.StandardCharsets;
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
 *            .post("")
 *            .execute()
 * }</code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyApplicationsPostString extends
        StringBodyApiMethod<ByProjectKeyApplicationsPostString, com.commercetools.checkout.models.application.Application>
        implements
        com.commercetools.checkout.client.Secured_by_manage_applicationsTrait<ByProjectKeyApplicationsPostString> {

    @Override
    public TypeReference<com.commercetools.checkout.models.application.Application> resultType() {
        return new TypeReference<com.commercetools.checkout.models.application.Application>() {
        };
    }

    private String projectKey;

    private String applicationDraft;

    public ByProjectKeyApplicationsPostString(final ApiHttpClient apiHttpClient, String projectKey,
            String applicationDraft) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.applicationDraft = applicationDraft;
    }

    public ByProjectKeyApplicationsPostString(ByProjectKeyApplicationsPostString t) {
        super(t);
        this.projectKey = t.projectKey;
        this.applicationDraft = t.applicationDraft;
    }

    @Override
    protected ApiHttpRequest buildHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("%s/applications", this.projectKey);
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(),
            applicationDraft.getBytes(StandardCharsets.UTF_8));

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

    public String getBody() {
        return applicationDraft;
    }

    public ByProjectKeyApplicationsPostString withBody(String applicationDraft) {
        ByProjectKeyApplicationsPostString t = copy();
        t.applicationDraft = applicationDraft;
        return t;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ByProjectKeyApplicationsPostString that = (ByProjectKeyApplicationsPostString) o;

        return new EqualsBuilder().append(projectKey, that.projectKey)
                .append(applicationDraft, that.applicationDraft)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(projectKey).append(applicationDraft).toHashCode();
    }

    @Override
    protected ByProjectKeyApplicationsPostString copy() {
        return new ByProjectKeyApplicationsPostString(this);
    }
}
