
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
 *  <p>Creates a DiscountGroup in the Project. This request generates the <a href="https://docs.commercetools.com/apis/ctp:api:type:DiscountGroupCreatedMessage" rel="nofollow">DiscountGroupCreated</a> Message.</p>
 *  <p>If the <span>limit</span> for active Discount Groups has been reached, a <a href="https://docs.commercetools.com/apis/ctp:api:type:MaxDiscountGroupsReachedError" rel="nofollow">MaxDiscountGroupsReached</a> error is returned.</p>
 *
 * <hr>
 * <div class=code-example>
 * <pre><code class='java'>{@code
 *   CompletableFuture<ApiHttpResponse<com.commercetools.api.models.discount_group.DiscountGroup>> result = apiRoot
 *            .withProjectKey("{projectKey}")
 *            .discountGroups()
 *            .post("")
 *            .execute()
 * }</code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyDiscountGroupsPostString extends
        StringBodyApiMethod<ByProjectKeyDiscountGroupsPostString, com.commercetools.api.models.discount_group.DiscountGroup>
        implements com.commercetools.api.client.ExpandableTrait<ByProjectKeyDiscountGroupsPostString>,
        com.commercetools.api.client.Deprecatable201Trait<ByProjectKeyDiscountGroupsPostString>,
        com.commercetools.api.client.ErrorableTrait<ByProjectKeyDiscountGroupsPostString> {

    @Override
    public TypeReference<com.commercetools.api.models.discount_group.DiscountGroup> resultType() {
        return new TypeReference<com.commercetools.api.models.discount_group.DiscountGroup>() {
        };
    }

    private String projectKey;

    private String discountGroupDraft;

    public ByProjectKeyDiscountGroupsPostString(final ApiHttpClient apiHttpClient, String projectKey,
            String discountGroupDraft) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.discountGroupDraft = discountGroupDraft;
    }

    public ByProjectKeyDiscountGroupsPostString(ByProjectKeyDiscountGroupsPostString t) {
        super(t);
        this.projectKey = t.projectKey;
        this.discountGroupDraft = t.discountGroupDraft;
    }

    @Override
    protected ApiHttpRequest buildHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("%s/discount-groups", this.projectKey);
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(),
            discountGroupDraft.getBytes(StandardCharsets.UTF_8));

    }

    @Override
    public ApiHttpResponse<com.commercetools.api.models.discount_group.DiscountGroup> executeBlocking(
            final ApiHttpClient client, final Duration timeout) {
        return executeBlocking(client, timeout, com.commercetools.api.models.discount_group.DiscountGroup.class);
    }

    @Override
    public CompletableFuture<ApiHttpResponse<com.commercetools.api.models.discount_group.DiscountGroup>> execute(
            final ApiHttpClient client) {
        return execute(client, com.commercetools.api.models.discount_group.DiscountGroup.class);
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
     * @return ByProjectKeyDiscountGroupsPostString
     */
    public <TValue> ByProjectKeyDiscountGroupsPostString withExpand(final TValue expand) {
        return copy().withQueryParam("expand", expand);
    }

    /**
     * add additional expand query parameter
     * @param <TValue> value type
     * @param expand value to be added
     * @return ByProjectKeyDiscountGroupsPostString
     */
    public <TValue> ByProjectKeyDiscountGroupsPostString addExpand(final TValue expand) {
        return copy().addQueryParam("expand", expand);
    }

    /**
     * set expand with the specified value
     * @param supplier supplier for the value to be set
     * @return ByProjectKeyDiscountGroupsPostString
     */
    public ByProjectKeyDiscountGroupsPostString withExpand(final Supplier<String> supplier) {
        return copy().withQueryParam("expand", supplier.get());
    }

    /**
     * add additional expand query parameter
     * @param supplier supplier for the value to be added
     * @return ByProjectKeyDiscountGroupsPostString
     */
    public ByProjectKeyDiscountGroupsPostString addExpand(final Supplier<String> supplier) {
        return copy().addQueryParam("expand", supplier.get());
    }

    /**
     * set expand with the specified value
     * @param op builder for the value to be set
     * @return ByProjectKeyDiscountGroupsPostString
     */
    public ByProjectKeyDiscountGroupsPostString withExpand(final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("expand", op.apply(new StringBuilder()));
    }

    /**
     * add additional expand query parameter
     * @param op builder for the value to be added
     * @return ByProjectKeyDiscountGroupsPostString
     */
    public ByProjectKeyDiscountGroupsPostString addExpand(final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("expand", op.apply(new StringBuilder()));
    }

    /**
     * set expand with the specified values
     * @param <TValue> value type
     * @param expand values to be set
     * @return ByProjectKeyDiscountGroupsPostString
     */
    public <TValue> ByProjectKeyDiscountGroupsPostString withExpand(final Collection<TValue> expand) {
        return copy().withoutQueryParam("expand")
                .addQueryParams(
                    expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional expand query parameters
     * @param <TValue> value type
     * @param expand values to be added
     * @return ByProjectKeyDiscountGroupsPostString
     */
    public <TValue> ByProjectKeyDiscountGroupsPostString addExpand(final Collection<TValue> expand) {
        return copy().addQueryParams(
            expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList()));
    }

    public String getBody() {
        return discountGroupDraft;
    }

    public ByProjectKeyDiscountGroupsPostString withBody(String discountGroupDraft) {
        ByProjectKeyDiscountGroupsPostString t = copy();
        t.discountGroupDraft = discountGroupDraft;
        return t;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ByProjectKeyDiscountGroupsPostString that = (ByProjectKeyDiscountGroupsPostString) o;

        return new EqualsBuilder().append(projectKey, that.projectKey)
                .append(discountGroupDraft, that.discountGroupDraft)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(projectKey).append(discountGroupDraft).toHashCode();
    }

    @Override
    protected ByProjectKeyDiscountGroupsPostString copy() {
        return new ByProjectKeyDiscountGroupsPostString(this);
    }
}
