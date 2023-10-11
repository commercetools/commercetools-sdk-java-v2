
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
 *            .withKey("{key}")
 *            .post(null)
 *            .execute()
 * }</code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyExtensionsKeyByKeyPost extends
        BodyApiMethod<ByProjectKeyExtensionsKeyByKeyPost, com.commercetools.api.models.extension.Extension, com.commercetools.api.models.extension.ExtensionUpdate>
        implements com.commercetools.api.client.ConflictingTrait<ByProjectKeyExtensionsKeyByKeyPost>,
        com.commercetools.api.client.Deprecatable200Trait<ByProjectKeyExtensionsKeyByKeyPost>,
        com.commercetools.api.client.ErrorableTrait<ByProjectKeyExtensionsKeyByKeyPost> {

    public TypeReference<com.commercetools.api.models.extension.Extension> resultType() {
        return new TypeReference<com.commercetools.api.models.extension.Extension>() {
        };
    }

    private String projectKey;
    private String key;

    private com.commercetools.api.models.extension.ExtensionUpdate extensionUpdate;

    public ByProjectKeyExtensionsKeyByKeyPost(final ApiHttpClient apiHttpClient, String projectKey, String key,
            com.commercetools.api.models.extension.ExtensionUpdate extensionUpdate) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.key = key;
        this.extensionUpdate = extensionUpdate;
    }

    public ByProjectKeyExtensionsKeyByKeyPost(ByProjectKeyExtensionsKeyByKeyPost t) {
        super(t);
        this.projectKey = t.projectKey;
        this.key = t.key;
        this.extensionUpdate = t.extensionUpdate;
    }

    @Override
    protected ApiHttpRequest buildHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("%s/extensions/key=%s", this.projectKey, this.key);
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(),
            io.vrap.rmf.base.client.utils.json.JsonUtils
                    .executing(() -> apiHttpClient().getSerializerService().toJsonByteArray(extensionUpdate)));

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

    public String getKey() {
        return this.key;
    }

    public void setProjectKey(final String projectKey) {
        this.projectKey = projectKey;
    }

    public void setKey(final String key) {
        this.key = key;
    }

    public com.commercetools.api.models.extension.ExtensionUpdate getBody() {
        return extensionUpdate;
    }

    public ByProjectKeyExtensionsKeyByKeyPost withBody(
            com.commercetools.api.models.extension.ExtensionUpdate extensionUpdate) {
        ByProjectKeyExtensionsKeyByKeyPost t = copy();
        t.extensionUpdate = extensionUpdate;
        return t;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ByProjectKeyExtensionsKeyByKeyPost that = (ByProjectKeyExtensionsKeyByKeyPost) o;

        return new EqualsBuilder().append(projectKey, that.projectKey)
                .append(key, that.key)
                .append(extensionUpdate, that.extensionUpdate)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(projectKey).append(key).append(extensionUpdate).toHashCode();
    }

    @Override
    protected ByProjectKeyExtensionsKeyByKeyPost copy() {
        return new ByProjectKeyExtensionsKeyByKeyPost(this);
    }
}
