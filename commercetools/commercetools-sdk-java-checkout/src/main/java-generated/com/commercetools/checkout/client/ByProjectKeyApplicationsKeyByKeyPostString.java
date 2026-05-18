
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
 *
 *
 * <hr>
 * <div class=code-example>
 * <pre><code class='java'>{@code
 *   CompletableFuture<ApiHttpResponse<com.commercetools.checkout.models.application.Application>> result = apiRoot
 *            .withProjectKey("{projectKey}")
 *            .applications()
 *            .withKey("{key}")
 *            .post("")
 *            .execute()
 * }</code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyApplicationsKeyByKeyPostString extends
        StringBodyApiMethod<ByProjectKeyApplicationsKeyByKeyPostString, com.commercetools.checkout.models.application.Application>
        implements
        com.commercetools.checkout.client.Secured_by_manage_applicationsTrait<ByProjectKeyApplicationsKeyByKeyPostString> {

    @Override
    public TypeReference<com.commercetools.checkout.models.application.Application> resultType() {
        return new TypeReference<com.commercetools.checkout.models.application.Application>() {
        };
    }

    private String projectKey;
    private String key;

    private String applicationUpdateActions;

    public ByProjectKeyApplicationsKeyByKeyPostString(final ApiHttpClient apiHttpClient, String projectKey, String key,
            String applicationUpdateActions) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.key = key;
        this.applicationUpdateActions = applicationUpdateActions;
    }

    public ByProjectKeyApplicationsKeyByKeyPostString(ByProjectKeyApplicationsKeyByKeyPostString t) {
        super(t);
        this.projectKey = t.projectKey;
        this.key = t.key;
        this.applicationUpdateActions = t.applicationUpdateActions;
    }

    @Override
    protected ApiHttpRequest buildHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("%s/applications/key=%s", this.projectKey, this.key);
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(),
            applicationUpdateActions.getBytes(StandardCharsets.UTF_8));

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

    public String getKey() {
        return this.key;
    }

    public void setProjectKey(final String projectKey) {
        this.projectKey = projectKey;
    }

    public void setKey(final String key) {
        this.key = key;
    }

    public String getBody() {
        return applicationUpdateActions;
    }

    public ByProjectKeyApplicationsKeyByKeyPostString withBody(String applicationUpdateActions) {
        ByProjectKeyApplicationsKeyByKeyPostString t = copy();
        t.applicationUpdateActions = applicationUpdateActions;
        return t;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ByProjectKeyApplicationsKeyByKeyPostString that = (ByProjectKeyApplicationsKeyByKeyPostString) o;

        return new EqualsBuilder().append(projectKey, that.projectKey)
                .append(key, that.key)
                .append(applicationUpdateActions, that.applicationUpdateActions)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(projectKey).append(key).append(applicationUpdateActions).toHashCode();
    }

    @Override
    protected ByProjectKeyApplicationsKeyByKeyPostString copy() {
        return new ByProjectKeyApplicationsKeyByKeyPostString(this);
    }
}
