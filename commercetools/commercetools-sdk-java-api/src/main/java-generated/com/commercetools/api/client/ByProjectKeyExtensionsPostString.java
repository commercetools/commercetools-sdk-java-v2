
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
 *   CompletableFuture<ApiHttpResponse<com.commercetools.api.models.extension.Extension>> result = apiRoot
 *            .withProjectKey("{projectKey}")
 *            .extensions()
 *            .post("")
 *            .execute()
 * }</code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyExtensionsPostString
        extends StringBodyApiMethod<ByProjectKeyExtensionsPostString, com.commercetools.api.models.extension.Extension>
        implements com.commercetools.api.client.Deprecatable201Trait<ByProjectKeyExtensionsPostString>,
        com.commercetools.api.client.ErrorableTrait<ByProjectKeyExtensionsPostString> {

    public TypeReference<com.commercetools.api.models.extension.Extension> resultType() {
        return new TypeReference<com.commercetools.api.models.extension.Extension>() {
        };
    }

    private String projectKey;

    private String extensionDraft;

    public ByProjectKeyExtensionsPostString(final ApiHttpClient apiHttpClient, String projectKey,
            String extensionDraft) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.extensionDraft = extensionDraft;
    }

    public ByProjectKeyExtensionsPostString(ByProjectKeyExtensionsPostString t) {
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
            extensionDraft.getBytes(StandardCharsets.UTF_8));

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

    public String getBody() {
        return extensionDraft;
    }

    public ByProjectKeyExtensionsPostString withBody(String extensionDraft) {
        ByProjectKeyExtensionsPostString t = copy();
        t.extensionDraft = extensionDraft;
        return t;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ByProjectKeyExtensionsPostString that = (ByProjectKeyExtensionsPostString) o;

        return new EqualsBuilder().append(projectKey, that.projectKey)
                .append(extensionDraft, that.extensionDraft)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(projectKey).append(extensionDraft).toHashCode();
    }

    @Override
    protected ByProjectKeyExtensionsPostString copy() {
        return new ByProjectKeyExtensionsPostString(this);
    }
}
