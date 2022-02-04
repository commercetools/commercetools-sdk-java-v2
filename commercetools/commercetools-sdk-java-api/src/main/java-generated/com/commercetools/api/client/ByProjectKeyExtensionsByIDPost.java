
package com.commercetools.api.client;

import java.net.URI;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;

import io.vrap.rmf.base.client.*;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ByProjectKeyExtensionsByIDPost extends
        BodyApiMethod<ByProjectKeyExtensionsByIDPost, com.commercetools.api.models.extension.Extension, com.commercetools.api.models.extension.ExtensionUpdate>
        implements com.commercetools.api.client.ConflictingTrait<ByProjectKeyExtensionsByIDPost>,
        com.commercetools.api.client.ExpandableTrait<ByProjectKeyExtensionsByIDPost>,
        com.commercetools.api.client.Deprecatable200Trait<ByProjectKeyExtensionsByIDPost>,
        com.commercetools.api.client.ErrorableTrait<ByProjectKeyExtensionsByIDPost> {

    private String projectKey;
    private String ID;

    private com.commercetools.api.models.extension.ExtensionUpdate extensionUpdate;

    public ByProjectKeyExtensionsByIDPost(final ApiHttpClient apiHttpClient, String projectKey, String ID,
            com.commercetools.api.models.extension.ExtensionUpdate extensionUpdate) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.ID = ID;
        this.extensionUpdate = extensionUpdate;
    }

    public ByProjectKeyExtensionsByIDPost(ByProjectKeyExtensionsByIDPost t) {
        super(t);
        this.projectKey = t.projectKey;
        this.ID = t.ID;
        this.extensionUpdate = t.extensionUpdate;
    }

    @Override
    public ApiHttpRequest createHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("/%s/extensions/%s", this.projectKey, this.ID);
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

    public String getID() {
        return this.ID;
    }

    public List<String> getExpand() {
        return this.getQueryParam("expand");
    }

    public void setProjectKey(final String projectKey) {
        this.projectKey = projectKey;
    }

    public void setID(final String ID) {
        this.ID = ID;
    }

    /**
     * set expand with the specificied value
     */
    public ByProjectKeyExtensionsByIDPost withExpand(final String expand) {
        return copy().withQueryParam("expand", expand);
    }

    /**
     * add additional expand query parameter
     */
    public ByProjectKeyExtensionsByIDPost addExpand(final String expand) {
        return copy().addQueryParam("expand", expand);
    }

    /**
     * set expand with the specificied values
     */
    public ByProjectKeyExtensionsByIDPost withExpand(final List<String> expand) {
        return copy().withoutQueryParam("expand")
                .addQueryParams(
                    expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional expand query parameters
     */
    public ByProjectKeyExtensionsByIDPost addExpand(final List<String> expand) {
        return copy().addQueryParams(
            expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList()));
    }

    public com.commercetools.api.models.extension.ExtensionUpdate getBody() {
        return extensionUpdate;
    }

    public ByProjectKeyExtensionsByIDPost withBody(
            com.commercetools.api.models.extension.ExtensionUpdate extensionUpdate) {
        ByProjectKeyExtensionsByIDPost t = copy();
        t.extensionUpdate = extensionUpdate;
        return t;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ByProjectKeyExtensionsByIDPost that = (ByProjectKeyExtensionsByIDPost) o;

        return new EqualsBuilder().append(projectKey, that.projectKey)
                .append(ID, that.ID)
                .append(extensionUpdate, that.extensionUpdate)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(projectKey).append(ID).append(extensionUpdate).toHashCode();
    }

    @Override
    protected ByProjectKeyExtensionsByIDPost copy() {
        return new ByProjectKeyExtensionsByIDPost(this);
    }
}
