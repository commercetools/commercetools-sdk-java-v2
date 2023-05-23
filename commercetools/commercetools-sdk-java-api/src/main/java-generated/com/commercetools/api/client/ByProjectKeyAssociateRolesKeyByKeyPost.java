
package com.commercetools.api.client;

import java.net.URI;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;

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
 *   CompletableFuture<ApiHttpResponse<com.commercetools.api.models.associate_role.AssociateRole>> result = apiRoot
 *            .withProjectKey("{projectKey}")
 *            .associateRoles()
 *            .withKey("{key}")
 *            .post(null)
 *            .execute()
 * }</code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyAssociateRolesKeyByKeyPost extends
        BodyApiMethod<ByProjectKeyAssociateRolesKeyByKeyPost, com.commercetools.api.models.associate_role.AssociateRole, com.commercetools.api.models.associate_role.AssociateRoleUpdate>
        implements com.commercetools.api.client.ConflictingTrait<ByProjectKeyAssociateRolesKeyByKeyPost>,
        com.commercetools.api.client.ExpandableTrait<ByProjectKeyAssociateRolesKeyByKeyPost>,
        com.commercetools.api.client.Deprecatable200Trait<ByProjectKeyAssociateRolesKeyByKeyPost>,
        com.commercetools.api.client.ErrorableTrait<ByProjectKeyAssociateRolesKeyByKeyPost> {

    private String projectKey;
    private String key;

    private com.commercetools.api.models.associate_role.AssociateRoleUpdate associateRoleUpdate;

    public ByProjectKeyAssociateRolesKeyByKeyPost(final ApiHttpClient apiHttpClient, String projectKey, String key,
            com.commercetools.api.models.associate_role.AssociateRoleUpdate associateRoleUpdate) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.key = key;
        this.associateRoleUpdate = associateRoleUpdate;
    }

    public ByProjectKeyAssociateRolesKeyByKeyPost(ByProjectKeyAssociateRolesKeyByKeyPost t) {
        super(t);
        this.projectKey = t.projectKey;
        this.key = t.key;
        this.associateRoleUpdate = t.associateRoleUpdate;
    }

    @Override
    protected ApiHttpRequest buildHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("%s/associate-roles/key=%s", this.projectKey, this.key);
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(),
            io.vrap.rmf.base.client.utils.json.JsonUtils
                    .executing(() -> apiHttpClient().getSerializerService().toJsonByteArray(associateRoleUpdate)));

    }

    @Override
    public ApiHttpResponse<com.commercetools.api.models.associate_role.AssociateRole> executeBlocking(
            final ApiHttpClient client, final Duration timeout) {
        return executeBlocking(client, timeout, com.commercetools.api.models.associate_role.AssociateRole.class);
    }

    @Override
    public CompletableFuture<ApiHttpResponse<com.commercetools.api.models.associate_role.AssociateRole>> execute(
            final ApiHttpClient client) {
        return execute(client, com.commercetools.api.models.associate_role.AssociateRole.class);
    }

    public String getProjectKey() {
        return this.projectKey;
    }

    public String getKey() {
        return this.key;
    }

    public List<String> getExpand() {
        return this.getQueryParam("expand");
    }

    public void setProjectKey(final String projectKey) {
        this.projectKey = projectKey;
    }

    public void setKey(final String key) {
        this.key = key;
    }

    /**
     * set expand with the specified value
     * @param expand value to be set
     * @param <TValue> value type
     * @return ByProjectKeyAssociateRolesKeyByKeyPost
     */
    public <TValue> ByProjectKeyAssociateRolesKeyByKeyPost withExpand(final TValue expand) {
        return copy().withQueryParam("expand", expand);
    }

    /**
     * add additional expand query parameter
     * @param expand value to be added
     * @param <TValue> value type
     * @return ByProjectKeyAssociateRolesKeyByKeyPost
     */
    public <TValue> ByProjectKeyAssociateRolesKeyByKeyPost addExpand(final TValue expand) {
        return copy().addQueryParam("expand", expand);
    }

    /**
     * set expand with the specified value
     * @param supplier supplier for the value to be set
     * @return ByProjectKeyAssociateRolesKeyByKeyPost
     */
    public ByProjectKeyAssociateRolesKeyByKeyPost withExpand(final Supplier<String> supplier) {
        return copy().withQueryParam("expand", supplier.get());
    }

    /**
     * add additional expand query parameter
     * @param supplier supplier for the value to be added
     * @return ByProjectKeyAssociateRolesKeyByKeyPost
     */
    public ByProjectKeyAssociateRolesKeyByKeyPost addExpand(final Supplier<String> supplier) {
        return copy().addQueryParam("expand", supplier.get());
    }

    /**
     * set expand with the specified value
     * @param op builder for the value to be set
     * @return ByProjectKeyAssociateRolesKeyByKeyPost
     */
    public ByProjectKeyAssociateRolesKeyByKeyPost withExpand(final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("expand", op.apply(new StringBuilder()));
    }

    /**
     * add additional expand query parameter
     * @param op builder for the value to be added
     * @return ByProjectKeyAssociateRolesKeyByKeyPost
     */
    public ByProjectKeyAssociateRolesKeyByKeyPost addExpand(final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("expand", op.apply(new StringBuilder()));
    }

    /**
     * set expand with the specified values
     * @param expand values to be set
     * @param <TValue> value type
     * @return ByProjectKeyAssociateRolesKeyByKeyPost
     */
    public <TValue> ByProjectKeyAssociateRolesKeyByKeyPost withExpand(final Collection<TValue> expand) {
        return copy().withoutQueryParam("expand")
                .addQueryParams(
                    expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional expand query parameters
     * @param expand values to be added
     * @param <TValue> value type
     * @return ByProjectKeyAssociateRolesKeyByKeyPost
     */
    public <TValue> ByProjectKeyAssociateRolesKeyByKeyPost addExpand(final Collection<TValue> expand) {
        return copy().addQueryParams(
            expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList()));
    }

    public com.commercetools.api.models.associate_role.AssociateRoleUpdate getBody() {
        return associateRoleUpdate;
    }

    public ByProjectKeyAssociateRolesKeyByKeyPost withBody(
            com.commercetools.api.models.associate_role.AssociateRoleUpdate associateRoleUpdate) {
        ByProjectKeyAssociateRolesKeyByKeyPost t = copy();
        t.associateRoleUpdate = associateRoleUpdate;
        return t;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ByProjectKeyAssociateRolesKeyByKeyPost that = (ByProjectKeyAssociateRolesKeyByKeyPost) o;

        return new EqualsBuilder().append(projectKey, that.projectKey)
                .append(key, that.key)
                .append(associateRoleUpdate, that.associateRoleUpdate)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(projectKey).append(key).append(associateRoleUpdate).toHashCode();
    }

    @Override
    protected ByProjectKeyAssociateRolesKeyByKeyPost copy() {
        return new ByProjectKeyAssociateRolesKeyByKeyPost(this);
    }
}
