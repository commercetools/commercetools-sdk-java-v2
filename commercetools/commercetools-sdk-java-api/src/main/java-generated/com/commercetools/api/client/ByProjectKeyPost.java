
package com.commercetools.api.client;

import java.net.URI;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;

import io.vrap.rmf.base.client.*;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ByProjectKeyPost extends
        BodyApiMethod<ByProjectKeyPost, com.commercetools.api.models.project.Project, com.commercetools.api.models.project.ProjectUpdate>
        implements com.commercetools.api.client.ConflictingTrait<ByProjectKeyPost> {

    private String projectKey;

    private com.commercetools.api.models.project.ProjectUpdate projectUpdate;

    public ByProjectKeyPost(final ApiHttpClient apiHttpClient, String projectKey,
            com.commercetools.api.models.project.ProjectUpdate projectUpdate) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.projectUpdate = projectUpdate;
    }

    public ByProjectKeyPost(ByProjectKeyPost t) {
        super(t);
        this.projectKey = t.projectKey;
        this.projectUpdate = t.projectUpdate;
    }

    @Override
    protected ApiHttpRequest buildHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("/%s", this.projectKey);
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(),
            io.vrap.rmf.base.client.utils.json.JsonUtils
                    .executing(() -> apiHttpClient().getSerializerService().toJsonByteArray(projectUpdate)));

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

    public com.commercetools.api.models.project.ProjectUpdate getBody() {
        return projectUpdate;
    }

    public ByProjectKeyPost withBody(com.commercetools.api.models.project.ProjectUpdate projectUpdate) {
        ByProjectKeyPost t = copy();
        t.projectUpdate = projectUpdate;
        return t;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ByProjectKeyPost that = (ByProjectKeyPost) o;

        return new EqualsBuilder().append(projectKey, that.projectKey)
                .append(projectUpdate, that.projectUpdate)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(projectKey).append(projectUpdate).toHashCode();
    }

    @Override
    protected ByProjectKeyPost copy() {
        return new ByProjectKeyPost(this);
    }
}
