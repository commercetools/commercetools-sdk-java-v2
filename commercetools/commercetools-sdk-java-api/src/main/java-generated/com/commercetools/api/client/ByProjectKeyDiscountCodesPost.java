
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
public class ByProjectKeyDiscountCodesPost extends
        BodyApiMethod<ByProjectKeyDiscountCodesPost, com.commercetools.api.models.discount_code.DiscountCode, com.commercetools.api.models.discount_code.DiscountCodeDraft>
        implements com.commercetools.api.client.ExpandableTrait<ByProjectKeyDiscountCodesPost>,
        com.commercetools.api.client.Deprecatable201Trait<ByProjectKeyDiscountCodesPost>,
        com.commercetools.api.client.ErrorableTrait<ByProjectKeyDiscountCodesPost> {

    private String projectKey;

    private com.commercetools.api.models.discount_code.DiscountCodeDraft discountCodeDraft;

    public ByProjectKeyDiscountCodesPost(final ApiHttpClient apiHttpClient, String projectKey,
            com.commercetools.api.models.discount_code.DiscountCodeDraft discountCodeDraft) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.discountCodeDraft = discountCodeDraft;
    }

    public ByProjectKeyDiscountCodesPost(ByProjectKeyDiscountCodesPost t) {
        super(t);
        this.projectKey = t.projectKey;
        this.discountCodeDraft = t.discountCodeDraft;
    }

    @Override
    public ApiHttpRequest createHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("/%s/discount-codes", this.projectKey);
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(),
            io.vrap.rmf.base.client.utils.json.JsonUtils
                    .executing(() -> apiHttpClient().getSerializerService().toJsonByteArray(discountCodeDraft)));

    }

    @Override
    public ApiHttpResponse<com.commercetools.api.models.discount_code.DiscountCode> executeBlocking(
            final ApiHttpClient client, final Duration timeout) {
        return executeBlocking(client, timeout, com.commercetools.api.models.discount_code.DiscountCode.class);
    }

    @Override
    public CompletableFuture<ApiHttpResponse<com.commercetools.api.models.discount_code.DiscountCode>> execute(
            final ApiHttpClient client) {
        return execute(client, com.commercetools.api.models.discount_code.DiscountCode.class);
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
     * set expand with the specificied value
     */
    public ByProjectKeyDiscountCodesPost withExpand(final String expand) {
        return copy().withQueryParam("expand", expand);
    }

    /**
     * add additional expand query parameter
     */
    public ByProjectKeyDiscountCodesPost addExpand(final String expand) {
        return copy().addQueryParam("expand", expand);
    }

    /**
     * set expand with the specificied values
     */
    public ByProjectKeyDiscountCodesPost withExpand(final List<String> expand) {
        return copy().withoutQueryParam("expand")
                .addQueryParams(
                    expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional expand query parameters
     */
    public ByProjectKeyDiscountCodesPost addExpand(final List<String> expand) {
        return copy().addQueryParams(
            expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList()));
    }

    public com.commercetools.api.models.discount_code.DiscountCodeDraft getBody() {
        return discountCodeDraft;
    }

    public ByProjectKeyDiscountCodesPost withBody(
            com.commercetools.api.models.discount_code.DiscountCodeDraft discountCodeDraft) {
        ByProjectKeyDiscountCodesPost t = copy();
        t.discountCodeDraft = discountCodeDraft;
        return t;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ByProjectKeyDiscountCodesPost that = (ByProjectKeyDiscountCodesPost) o;

        return new EqualsBuilder().append(projectKey, that.projectKey)
                .append(discountCodeDraft, that.discountCodeDraft)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(projectKey).append(discountCodeDraft).toHashCode();
    }

    @Override
    protected ByProjectKeyDiscountCodesPost copy() {
        return new ByProjectKeyDiscountCodesPost(this);
    }
}
