
package com.commercetools.api.client;

import java.net.URI;
import java.nio.charset.StandardCharsets;
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
 *  <p>Creates a Recurrence Policy in the Project.</p>
 *  <p>The <code>manage_recurring_orders:{projectKey}</code> scope is deprecated for use on this endpoint. Update your clients to use the <code>manage_recurrence_policies:{projectKey}</code> scope instead. For more information, see the <span>Deprecations and removals</span> list.</p>
 *
 * <hr>
 * <div class=code-example>
 * <pre><code class='java'>{@code
 *   CompletableFuture<ApiHttpResponse<com.commercetools.api.models.recurrence_policy.RecurrencePolicy>> result = apiRoot
 *            .withProjectKey("{projectKey}")
 *            .recurrencePolicies()
 *            .post("")
 *            .execute()
 * }</code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyRecurrencePoliciesPostString extends
        StringBodyApiMethod<ByProjectKeyRecurrencePoliciesPostString, com.commercetools.api.models.recurrence_policy.RecurrencePolicy>
        implements com.commercetools.api.client.ExpandableTrait<ByProjectKeyRecurrencePoliciesPostString>,
        com.commercetools.api.client.Deprecatable201Trait<ByProjectKeyRecurrencePoliciesPostString>,
        com.commercetools.api.client.ErrorableTrait<ByProjectKeyRecurrencePoliciesPostString> {

    @Override
    public TypeReference<com.commercetools.api.models.recurrence_policy.RecurrencePolicy> resultType() {
        return new TypeReference<com.commercetools.api.models.recurrence_policy.RecurrencePolicy>() {
        };
    }

    private String projectKey;

    private String recurrencePolicyDraft;

    public ByProjectKeyRecurrencePoliciesPostString(final ApiHttpClient apiHttpClient, String projectKey,
            String recurrencePolicyDraft) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.recurrencePolicyDraft = recurrencePolicyDraft;
    }

    public ByProjectKeyRecurrencePoliciesPostString(ByProjectKeyRecurrencePoliciesPostString t) {
        super(t);
        this.projectKey = t.projectKey;
        this.recurrencePolicyDraft = t.recurrencePolicyDraft;
    }

    @Override
    protected ApiHttpRequest buildHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("%s/recurrence-policies", this.projectKey);
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(),
            recurrencePolicyDraft.getBytes(StandardCharsets.UTF_8));

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

    public List<String> getExpand() {
        return this.getQueryParam("expand");
    }

    public void setProjectKey(final String projectKey) {
        this.projectKey = projectKey;
    }

    /**
     * set expand with the specified value
     * @param <TValue> value type
     * @param expand value to be set
     * @return ByProjectKeyRecurrencePoliciesPostString
     */
    public <TValue> ByProjectKeyRecurrencePoliciesPostString withExpand(final TValue expand) {
        return copy().withQueryParam("expand", expand);
    }

    /**
     * add additional expand query parameter
     * @param <TValue> value type
     * @param expand value to be added
     * @return ByProjectKeyRecurrencePoliciesPostString
     */
    public <TValue> ByProjectKeyRecurrencePoliciesPostString addExpand(final TValue expand) {
        return copy().addQueryParam("expand", expand);
    }

    /**
     * set expand with the specified value
     * @param supplier supplier for the value to be set
     * @return ByProjectKeyRecurrencePoliciesPostString
     */
    public ByProjectKeyRecurrencePoliciesPostString withExpand(final Supplier<String> supplier) {
        return copy().withQueryParam("expand", supplier.get());
    }

    /**
     * add additional expand query parameter
     * @param supplier supplier for the value to be added
     * @return ByProjectKeyRecurrencePoliciesPostString
     */
    public ByProjectKeyRecurrencePoliciesPostString addExpand(final Supplier<String> supplier) {
        return copy().addQueryParam("expand", supplier.get());
    }

    /**
     * set expand with the specified value
     * @param op builder for the value to be set
     * @return ByProjectKeyRecurrencePoliciesPostString
     */
    public ByProjectKeyRecurrencePoliciesPostString withExpand(final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("expand", op.apply(new StringBuilder()));
    }

    /**
     * add additional expand query parameter
     * @param op builder for the value to be added
     * @return ByProjectKeyRecurrencePoliciesPostString
     */
    public ByProjectKeyRecurrencePoliciesPostString addExpand(final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("expand", op.apply(new StringBuilder()));
    }

    /**
     * set expand with the specified values
     * @param <TValue> value type
     * @param expand values to be set
     * @return ByProjectKeyRecurrencePoliciesPostString
     */
    public <TValue> ByProjectKeyRecurrencePoliciesPostString withExpand(final Collection<TValue> expand) {
        return copy().withoutQueryParam("expand")
                .addQueryParams(
                    expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional expand query parameters
     * @param <TValue> value type
     * @param expand values to be added
     * @return ByProjectKeyRecurrencePoliciesPostString
     */
    public <TValue> ByProjectKeyRecurrencePoliciesPostString addExpand(final Collection<TValue> expand) {
        return copy().addQueryParams(
            expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList()));
    }

    public String getBody() {
        return recurrencePolicyDraft;
    }

    public ByProjectKeyRecurrencePoliciesPostString withBody(String recurrencePolicyDraft) {
        ByProjectKeyRecurrencePoliciesPostString t = copy();
        t.recurrencePolicyDraft = recurrencePolicyDraft;
        return t;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ByProjectKeyRecurrencePoliciesPostString that = (ByProjectKeyRecurrencePoliciesPostString) o;

        return new EqualsBuilder().append(projectKey, that.projectKey)
                .append(recurrencePolicyDraft, that.recurrencePolicyDraft)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(projectKey).append(recurrencePolicyDraft).toHashCode();
    }

    @Override
    protected ByProjectKeyRecurrencePoliciesPostString copy() {
        return new ByProjectKeyRecurrencePoliciesPostString(this);
    }
}
