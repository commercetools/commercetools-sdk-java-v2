package com.commercetools.api.client;

import io.vrap.rmf.base.client.utils.Utils;

import java.io.InputStream;
import java.io.IOException;

import java.net.URI;
import java.net.URLConnection;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.concurrent.CompletableFuture;
import io.vrap.rmf.base.client.utils.Generated;

import javax.annotation.Nullable;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import io.vrap.rmf.base.client.*;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import static io.vrap.rmf.base.client.utils.ClientUtils.blockingWait;

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
 *            .post("")
 *            .execute()
 * }</code></pre>
 * </div>
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class ByProjectKeyAssociateRolesKeyByKeyPostString extends StringBodyApiMethod<ByProjectKeyAssociateRolesKeyByKeyPostString, com.commercetools.api.models.associate_role.AssociateRole> implements com.commercetools.api.client.ConflictingTrait<ByProjectKeyAssociateRolesKeyByKeyPostString>, com.commercetools.api.client.ExpandableTrait<ByProjectKeyAssociateRolesKeyByKeyPostString>, com.commercetools.api.client.Deprecatable200Trait<ByProjectKeyAssociateRolesKeyByKeyPostString>, com.commercetools.api.client.ErrorableTrait<ByProjectKeyAssociateRolesKeyByKeyPostString> {

    
    private String projectKey;
    private String key;
    
    private String associateRoleUpdate;

    public ByProjectKeyAssociateRolesKeyByKeyPostString(final ApiHttpClient apiHttpClient, String projectKey, String key, String associateRoleUpdate) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.key = key;
        this.associateRoleUpdate = associateRoleUpdate;
    }

    public ByProjectKeyAssociateRolesKeyByKeyPostString(ByProjectKeyAssociateRolesKeyByKeyPostString t) {
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
        return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(), associateRoleUpdate.getBytes(StandardCharsets.UTF_8));
    
    }

    @Override
    public ApiHttpResponse<com.commercetools.api.models.associate_role.AssociateRole> executeBlocking(final ApiHttpClient client, final Duration timeout) {
        return executeBlocking(client, timeout, com.commercetools.api.models.associate_role.AssociateRole.class);
    }

    @Override
    public CompletableFuture<ApiHttpResponse<com.commercetools.api.models.associate_role.AssociateRole>> execute(final ApiHttpClient client) {
        return execute(client, com.commercetools.api.models.associate_role.AssociateRole.class);
    }

    public String getProjectKey() {return this.projectKey;}
    public String getKey() {return this.key;}

    public List<String> getExpand() {
        return this.getQueryParam("expand");
    }

    public void setProjectKey(final String projectKey) { this.projectKey = projectKey; }
    
    public void setKey(final String key) { this.key = key; }

    /**
     * set expand with the specified value
     * @param <TValue> value type
     * @param expand value to be set
     * @return ByProjectKeyAssociateRolesKeyByKeyPostString
     */
    public <TValue> ByProjectKeyAssociateRolesKeyByKeyPostString withExpand(final TValue expand) {
        return copy().withQueryParam("expand", expand);
    }
    
    /**
     * add additional expand query parameter
     * @param <TValue> value type
     * @param expand value to be added
     * @return ByProjectKeyAssociateRolesKeyByKeyPostString
     */
    public <TValue> ByProjectKeyAssociateRolesKeyByKeyPostString addExpand(final TValue expand) {
        return copy().addQueryParam("expand", expand);
    }
    
    /**
     * set expand with the specified value
     * @param supplier supplier for the value to be set
     * @return ByProjectKeyAssociateRolesKeyByKeyPostString
     */
    public ByProjectKeyAssociateRolesKeyByKeyPostString withExpand(final Supplier<String> supplier) {
        return copy().withQueryParam("expand", supplier.get());
    }
    
    /**
     * add additional expand query parameter
     * @param supplier supplier for the value to be added
     * @return ByProjectKeyAssociateRolesKeyByKeyPostString
     */
    public ByProjectKeyAssociateRolesKeyByKeyPostString addExpand(final Supplier<String> supplier) {
        return copy().addQueryParam("expand", supplier.get());
    }
    
    /**
     * set expand with the specified value
     * @param op builder for the value to be set
     * @return ByProjectKeyAssociateRolesKeyByKeyPostString
     */
    public ByProjectKeyAssociateRolesKeyByKeyPostString withExpand(final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("expand", op.apply(new StringBuilder()));
    }
    
    /**
     * add additional expand query parameter
     * @param op builder for the value to be added
     * @return ByProjectKeyAssociateRolesKeyByKeyPostString
     */
    public ByProjectKeyAssociateRolesKeyByKeyPostString addExpand(final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("expand", op.apply(new StringBuilder()));
    }
    
    /**
     * set expand with the specified values
     * @param <TValue> value type
     * @param expand values to be set
     * @return ByProjectKeyAssociateRolesKeyByKeyPostString
     */
    public <TValue> ByProjectKeyAssociateRolesKeyByKeyPostString withExpand(final Collection<TValue> expand) {
        return copy().withoutQueryParam("expand").addQueryParams(expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList())); 
    }
    
    /**
     * add additional expand query parameters
     * @param <TValue> value type
     * @param expand values to be added
     * @return ByProjectKeyAssociateRolesKeyByKeyPostString
     */
    public <TValue> ByProjectKeyAssociateRolesKeyByKeyPostString addExpand(final Collection<TValue> expand) {
        return copy().addQueryParams(expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList())); 
    }

    
    public String getBody() {
        return associateRoleUpdate;
    }
    
    public ByProjectKeyAssociateRolesKeyByKeyPostString withBody(String associateRoleUpdate) {
        ByProjectKeyAssociateRolesKeyByKeyPostString t = copy();
        t.associateRoleUpdate = associateRoleUpdate;
        return t;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        ByProjectKeyAssociateRolesKeyByKeyPostString that = (ByProjectKeyAssociateRolesKeyByKeyPostString) o;
    
        return new EqualsBuilder()
                .append(projectKey, that.projectKey)
                .append(key, that.key)
                .append(associateRoleUpdate, that.associateRoleUpdate)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(projectKey)
            .append(key)
            .append(associateRoleUpdate)
            .toHashCode();
    }

    @Override
    protected ByProjectKeyAssociateRolesKeyByKeyPostString copy() {
        return new ByProjectKeyAssociateRolesKeyByKeyPostString(this);
    }
}
