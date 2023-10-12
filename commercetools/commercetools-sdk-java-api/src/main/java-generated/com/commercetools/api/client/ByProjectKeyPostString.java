
package com.commercetools.api.client;

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
 *   CompletableFuture<ApiHttpResponse<com.commercetools.api.models.project.Project>> result = apiRoot
 *            .withProjectKey("{projectKey}")
 *            .post("")
 *            .execute()
 * }</code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyPostString
        extends StringBodyApiMethod<ByProjectKeyPostString, com.commercetools.api.models.project.Project>
        implements com.commercetools.api.client.ConflictingTrait<ByProjectKeyPostString> {

    @Override
    public TypeReference<com.commercetools.api.models.project.Project> resultType() {
        return new TypeReference<com.commercetools.api.models.project.Project>() {
        };
    }

    private String projectKey;

    private String projectUpdate;

    public ByProjectKeyPostString(final ApiHttpClient apiHttpClient, String projectKey, String projectUpdate) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.projectUpdate = projectUpdate;
    }

    public ByProjectKeyPostString(ByProjectKeyPostString t) {
        super(t);
        this.projectKey = t.projectKey;
        this.projectUpdate = t.projectUpdate;
    }

    @Override
    protected ApiHttpRequest buildHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("%s", this.projectKey);
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(),
            projectUpdate.getBytes(StandardCharsets.UTF_8));

    }

    @Override
    public ApiHttpResponse<com.commercetools.api.models.project.Project> executeBlocking(final ApiHttpClient client,
            final Duration timeout) {
        return executeBlocking(client, timeout, com.commercetools.api.models.project.Project.class);
    }

    @Override
    public CompletableFuture<ApiHttpResponse<com.commercetools.api.models.project.Project>> execute(
            final ApiHttpClient client) {
        return execute(client, com.commercetools.api.models.project.Project.class);
    }

    public String getProjectKey() {
        return this.projectKey;
    }

    public void setProjectKey(final String projectKey) {
        this.projectKey = projectKey;
    }

    public String getBody() {
        return projectUpdate;
    }

    public ByProjectKeyPostString withBody(String projectUpdate) {
        ByProjectKeyPostString t = copy();
        t.projectUpdate = projectUpdate;
        return t;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ByProjectKeyPostString that = (ByProjectKeyPostString) o;

        return new EqualsBuilder().append(projectKey, that.projectKey)
                .append(projectUpdate, that.projectUpdate)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(projectKey).append(projectUpdate).toHashCode();
    }

    @Override
    protected ByProjectKeyPostString copy() {
        return new ByProjectKeyPostString(this);
    }
}
