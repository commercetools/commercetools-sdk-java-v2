
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
 *  <p>Creating a Associate Role generates the AssociateRoleCreated Message.</p>
 *
 * <hr>
 * <div class=code-example>
 * <pre><code class='java'>{@code
 *   CompletableFuture<ApiHttpResponse<com.commercetools.api.models.associate_role.AssociateRole>> result = apiRoot
 *            .withProjectKey("{projectKey}")
 *            .associateRoles()
 *            .post(null)
 *            .execute()
 * }</code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyAssociateRolesPost extends
        BodyApiMethod<ByProjectKeyAssociateRolesPost, com.commercetools.api.models.associate_role.AssociateRole, com.commercetools.api.models.associate_role.AssociateRoleDraft>
        implements com.commercetools.api.client.ExpandableTrait<ByProjectKeyAssociateRolesPost>,
        com.commercetools.api.client.Deprecatable201Trait<ByProjectKeyAssociateRolesPost>,
        com.commercetools.api.client.ErrorableTrait<ByProjectKeyAssociateRolesPost> {

    private String projectKey;

    private com.commercetools.api.models.associate_role.AssociateRoleDraft associateRoleDraft;

    public ByProjectKeyAssociateRolesPost(final ApiHttpClient apiHttpClient, String projectKey,
            com.commercetools.api.models.associate_role.AssociateRoleDraft associateRoleDraft) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.associateRoleDraft = associateRoleDraft;
    }

    public ByProjectKeyAssociateRolesPost(ByProjectKeyAssociateRolesPost t) {
        super(t);
        this.projectKey = t.projectKey;
        this.associateRoleDraft = t.associateRoleDraft;
    }

    @Override
    protected ApiHttpRequest buildHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("%s/associate-roles", this.projectKey);
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(),
            io.vrap.rmf.base.client.utils.json.JsonUtils
                    .executing(() -> apiHttpClient().getSerializerService().toJsonByteArray(associateRoleDraft)));

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

    public List<String> getExpand() {
        return this.getQueryParam("expand");
    }

    public void setProjectKey(final String projectKey) {
        this.projectKey = projectKey;
    }

    /**
     * set expand with the specified value
     * @param expand value to be set
     * @param <TValue> value type
     * @return ByProjectKeyAssociateRolesPost
     */
    public <TValue> ByProjectKeyAssociateRolesPost withExpand(final TValue expand) {
        return copy().withQueryParam("expand", expand);
    }

    /**
     * add additional expand query parameter
     * @param expand value to be added
     * @param <TValue> value type
     * @return ByProjectKeyAssociateRolesPost
     */
    public <TValue> ByProjectKeyAssociateRolesPost addExpand(final TValue expand) {
        return copy().addQueryParam("expand", expand);
    }

    /**
     * set expand with the specified value
     * @param supplier supplier for the value to be set
     * @return ByProjectKeyAssociateRolesPost
     */
    public ByProjectKeyAssociateRolesPost withExpand(final Supplier<String> supplier) {
        return copy().withQueryParam("expand", supplier.get());
    }

    /**
     * add additional expand query parameter
     * @param supplier supplier for the value to be added
     * @return ByProjectKeyAssociateRolesPost
     */
    public ByProjectKeyAssociateRolesPost addExpand(final Supplier<String> supplier) {
        return copy().addQueryParam("expand", supplier.get());
    }

    /**
     * set expand with the specified value
     * @param op builder for the value to be set
     * @return ByProjectKeyAssociateRolesPost
     */
    public ByProjectKeyAssociateRolesPost withExpand(final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("expand", op.apply(new StringBuilder()));
    }

    /**
     * add additional expand query parameter
     * @param op builder for the value to be added
     * @return ByProjectKeyAssociateRolesPost
     */
    public ByProjectKeyAssociateRolesPost addExpand(final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("expand", op.apply(new StringBuilder()));
    }

    /**
     * set expand with the specified values
     * @param expand values to be set
     * @param <TValue> value type
     * @return ByProjectKeyAssociateRolesPost
     */
    public <TValue> ByProjectKeyAssociateRolesPost withExpand(final Collection<TValue> expand) {
        return copy().withoutQueryParam("expand")
                .addQueryParams(
                    expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional expand query parameters
     * @param expand values to be added
     * @param <TValue> value type
     * @return ByProjectKeyAssociateRolesPost
     */
    public <TValue> ByProjectKeyAssociateRolesPost addExpand(final Collection<TValue> expand) {
        return copy().addQueryParams(
            expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList()));
    }

    public com.commercetools.api.models.associate_role.AssociateRoleDraft getBody() {
        return associateRoleDraft;
    }

    public ByProjectKeyAssociateRolesPost withBody(
            com.commercetools.api.models.associate_role.AssociateRoleDraft associateRoleDraft) {
        ByProjectKeyAssociateRolesPost t = copy();
        t.associateRoleDraft = associateRoleDraft;
        return t;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ByProjectKeyAssociateRolesPost that = (ByProjectKeyAssociateRolesPost) o;

        return new EqualsBuilder().append(projectKey, that.projectKey)
                .append(associateRoleDraft, that.associateRoleDraft)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(projectKey).append(associateRoleDraft).toHashCode();
    }

    @Override
    protected ByProjectKeyAssociateRolesPost copy() {
        return new ByProjectKeyAssociateRolesPost(this);
    }
}
