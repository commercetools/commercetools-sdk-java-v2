
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

import com.fasterxml.jackson.core.type.TypeReference;

import io.vrap.rmf.base.client.*;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 *  <p>Updates a Recurrence Policy using one or more <span>update actions</span>.</p>
 *  <p>The <code>manage_recurring_orders:{projectKey}</code> scope is deprecated for use on this endpoint. Update your clients to use the <code>manage_recurrence_policies:{projectKey}</code> scope instead. For more information, see the <span>Deprecations and removals</span> list.</p>
 *
 * <hr>
 * <div class=code-example>
 * <pre><code class='java'>{@code
 *   CompletableFuture<ApiHttpResponse<com.commercetools.api.models.recurrence_policy.RecurrencePolicy>> result = apiRoot
 *            .withProjectKey("{projectKey}")
 *            .recurrencePolicies()
 *            .withKey("{key}")
 *            .post(null)
 *            .execute()
 * }</code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyRecurrencePoliciesKeyByKeyPost extends
        TypeBodyApiMethod<ByProjectKeyRecurrencePoliciesKeyByKeyPost, com.commercetools.api.models.recurrence_policy.RecurrencePolicy, com.commercetools.api.models.recurrence_policy.RecurrencePolicyUpdate>
        implements com.commercetools.api.client.ConflictingTrait<ByProjectKeyRecurrencePoliciesKeyByKeyPost>,
        com.commercetools.api.client.ExpandableTrait<ByProjectKeyRecurrencePoliciesKeyByKeyPost>,
        com.commercetools.api.client.Deprecatable200Trait<ByProjectKeyRecurrencePoliciesKeyByKeyPost>,
        com.commercetools.api.client.ErrorableTrait<ByProjectKeyRecurrencePoliciesKeyByKeyPost> {

    @Override
    public TypeReference<com.commercetools.api.models.recurrence_policy.RecurrencePolicy> resultType() {
        return new TypeReference<com.commercetools.api.models.recurrence_policy.RecurrencePolicy>() {
        };
    }

    private String projectKey;
    private String key;

    private com.commercetools.api.models.recurrence_policy.RecurrencePolicyUpdate recurrencePolicyUpdate;

    public ByProjectKeyRecurrencePoliciesKeyByKeyPost(final ApiHttpClient apiHttpClient, String projectKey, String key,
            com.commercetools.api.models.recurrence_policy.RecurrencePolicyUpdate recurrencePolicyUpdate) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.key = key;
        this.recurrencePolicyUpdate = recurrencePolicyUpdate;
    }

    public ByProjectKeyRecurrencePoliciesKeyByKeyPost(ByProjectKeyRecurrencePoliciesKeyByKeyPost t) {
        super(t);
        this.projectKey = t.projectKey;
        this.key = t.key;
        this.recurrencePolicyUpdate = t.recurrencePolicyUpdate;
    }

    @Override
    protected ApiHttpRequest buildHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("%s/recurrence-policies/key=%s", encodePathParam(this.projectKey),
            encodePathParam(this.key));
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(),
            io.vrap.rmf.base.client.utils.json.JsonUtils
                    .executing(() -> apiHttpClient().getSerializerService().toJsonByteArray(recurrencePolicyUpdate)));

    }

    @Override
    public ApiHttpResponse<com.commercetools.api.models.recurrence_policy.RecurrencePolicy> executeBlocking(
            final ApiHttpClient client, final Duration timeout) {
        return executeBlocking(client, timeout, com.commercetools.api.models.recurrence_policy.RecurrencePolicy.class);
    }

    @Override
    public CompletableFuture<ApiHttpResponse<com.commercetools.api.models.recurrence_policy.RecurrencePolicy>> execute(
            final ApiHttpClient client) {
        return execute(client, com.commercetools.api.models.recurrence_policy.RecurrencePolicy.class);
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
     * @return ByProjectKeyRecurrencePoliciesKeyByKeyPost
     */
    public <TValue> ByProjectKeyRecurrencePoliciesKeyByKeyPost withExpand(final TValue expand) {
        return copy().withQueryParam("expand", expand);
    }

    /**
     * add additional expand query parameter
     * @param expand value to be added
     * @param <TValue> value type
     * @return ByProjectKeyRecurrencePoliciesKeyByKeyPost
     */
    public <TValue> ByProjectKeyRecurrencePoliciesKeyByKeyPost addExpand(final TValue expand) {
        return copy().addQueryParam("expand", expand);
    }

    /**
     * set expand with the specified value
     * @param supplier supplier for the value to be set
     * @return ByProjectKeyRecurrencePoliciesKeyByKeyPost
     */
    public ByProjectKeyRecurrencePoliciesKeyByKeyPost withExpand(final Supplier<String> supplier) {
        return copy().withQueryParam("expand", supplier.get());
    }

    /**
     * add additional expand query parameter
     * @param supplier supplier for the value to be added
     * @return ByProjectKeyRecurrencePoliciesKeyByKeyPost
     */
    public ByProjectKeyRecurrencePoliciesKeyByKeyPost addExpand(final Supplier<String> supplier) {
        return copy().addQueryParam("expand", supplier.get());
    }

    /**
     * set expand with the specified value
     * @param op builder for the value to be set
     * @return ByProjectKeyRecurrencePoliciesKeyByKeyPost
     */
    public ByProjectKeyRecurrencePoliciesKeyByKeyPost withExpand(final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("expand", op.apply(new StringBuilder()));
    }

    /**
     * add additional expand query parameter
     * @param op builder for the value to be added
     * @return ByProjectKeyRecurrencePoliciesKeyByKeyPost
     */
    public ByProjectKeyRecurrencePoliciesKeyByKeyPost addExpand(final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("expand", op.apply(new StringBuilder()));
    }

    /**
     * set expand with the specified values
     * @param expand values to be set
     * @param <TValue> value type
     * @return ByProjectKeyRecurrencePoliciesKeyByKeyPost
     */
    public <TValue> ByProjectKeyRecurrencePoliciesKeyByKeyPost withExpand(final Collection<TValue> expand) {
        return copy().withoutQueryParam("expand")
                .addQueryParams(
                    expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional expand query parameters
     * @param expand values to be added
     * @param <TValue> value type
     * @return ByProjectKeyRecurrencePoliciesKeyByKeyPost
     */
    public <TValue> ByProjectKeyRecurrencePoliciesKeyByKeyPost addExpand(final Collection<TValue> expand) {
        return copy().addQueryParams(
            expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList()));
    }

    public com.commercetools.api.models.recurrence_policy.RecurrencePolicyUpdate getBody() {
        return recurrencePolicyUpdate;
    }

    public ByProjectKeyRecurrencePoliciesKeyByKeyPost withBody(
            com.commercetools.api.models.recurrence_policy.RecurrencePolicyUpdate recurrencePolicyUpdate) {
        ByProjectKeyRecurrencePoliciesKeyByKeyPost t = copy();
        t.recurrencePolicyUpdate = recurrencePolicyUpdate;
        return t;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ByProjectKeyRecurrencePoliciesKeyByKeyPost that = (ByProjectKeyRecurrencePoliciesKeyByKeyPost) o;

        return new EqualsBuilder().append(projectKey, that.projectKey)
                .append(key, that.key)
                .append(recurrencePolicyUpdate, that.recurrencePolicyUpdate)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(projectKey).append(key).append(recurrencePolicyUpdate).toHashCode();
    }

    @Override
    protected ByProjectKeyRecurrencePoliciesKeyByKeyPost copy() {
        return new ByProjectKeyRecurrencePoliciesKeyByKeyPost(this);
    }
}
