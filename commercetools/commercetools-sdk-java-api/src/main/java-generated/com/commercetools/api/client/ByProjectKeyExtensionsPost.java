
package com.commercetools.api.client;

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
 *   CompletableFuture<ApiHttpResponse<com.commercetools.api.models.extension.Extension>> result = apiRoot
 *            .withProjectKey("{projectKey}")
 *            .extensions()
 *            .post(null)
 *            .execute()
 * }</code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyExtensionsPost extends
        BodyApiMethod<ByProjectKeyExtensionsPost, com.commercetools.api.models.extension.Extension, com.commercetools.api.models.extension.ExtensionDraft>
        implements com.commercetools.api.client.Deprecatable201Trait<ByProjectKeyExtensionsPost>,
        com.commercetools.api.client.ErrorableTrait<ByProjectKeyExtensionsPost> {

    public TypeReference<com.commercetools.api.models.extension.Extension> resultType() {
        return new TypeReference<com.commercetools.api.models.extension.Extension>() {
        };
    }

    private String projectKey;

    private com.commercetools.api.models.extension.ExtensionDraft extensionDraft;

    public ByProjectKeyExtensionsPost(final ApiHttpClient apiHttpClient, String projectKey,
            com.commercetools.api.models.extension.ExtensionDraft extensionDraft) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.extensionDraft = extensionDraft;
    }

    public ByProjectKeyExtensionsPost(ByProjectKeyExtensionsPost t) {
        super(t);
        this.projectKey = t.projectKey;
        this.extensionDraft = t.extensionDraft;
    }

    @Override
    protected ApiHttpRequest buildHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("%s/extensions", this.projectKey);
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(),
            io.vrap.rmf.base.client.utils.json.JsonUtils
                    .executing(() -> apiHttpClient().getSerializerService().toJsonByteArray(extensionDraft)));

    }

    @Override
    public ApiHttpResponse<com.commercetools.api.models.extension.Extension> executeBlocking(final ApiHttpClient client,
            final Duration timeout) {
        return executeBlocking(client, timeout, com.commercetools.api.models.extension.Extension.class);
    }

    @Override
    public CompletableFuture<ApiHttpResponse<com.commercetools.api.models.extension.Extension>> execute(
            final ApiHttpClient client) {
        return execute(client, com.commercetools.api.models.extension.Extension.class);
    }

    public String getProjectKey() {
        return this.projectKey;
    }

    public void setProjectKey(final String projectKey) {
        this.projectKey = projectKey;
    }

    public com.commercetools.api.models.extension.ExtensionDraft getBody() {
        return extensionDraft;
    }

    public ByProjectKeyExtensionsPost withBody(com.commercetools.api.models.extension.ExtensionDraft extensionDraft) {
        ByProjectKeyExtensionsPost t = copy();
        t.extensionDraft = extensionDraft;
        return t;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ByProjectKeyExtensionsPost that = (ByProjectKeyExtensionsPost) o;

        return new EqualsBuilder().append(projectKey, that.projectKey)
                .append(extensionDraft, that.extensionDraft)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(projectKey).append(extensionDraft).toHashCode();
    }

    @Override
    protected ByProjectKeyExtensionsPost copy() {
        return new ByProjectKeyExtensionsPost(this);
    }
}
