
package com.commercetools.api.client;

import java.util.function.UnaryOperator;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyDiscountGroupsRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;

    public ByProjectKeyDiscountGroupsRequestBuilder(final ApiHttpClient apiHttpClient, final String projectKey) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
    }

    public ByProjectKeyDiscountGroupsGet get() {
        return new ByProjectKeyDiscountGroupsGet(apiHttpClient, projectKey);
    }

    public ByProjectKeyDiscountGroupsHead head() {
        return new ByProjectKeyDiscountGroupsHead(apiHttpClient, projectKey);
    }

    public ByProjectKeyDiscountGroupsPost post(
            com.commercetools.api.models.discount_group.DiscountGroupDraft discountGroupDraft) {
        return new ByProjectKeyDiscountGroupsPost(apiHttpClient, projectKey, discountGroupDraft);
    }

    public ByProjectKeyDiscountGroupsPostString post(final String discountGroupDraft) {
        return new ByProjectKeyDiscountGroupsPostString(apiHttpClient, projectKey, discountGroupDraft);
    }

    public ByProjectKeyDiscountGroupsPost post(
            UnaryOperator<com.commercetools.api.models.discount_group.DiscountGroupDraftBuilder> op) {
        return post(op.apply(com.commercetools.api.models.discount_group.DiscountGroupDraftBuilder.of()).build());
    }

    public ByProjectKeyDiscountGroupsKeyByKeyRequestBuilder withKey(String key) {
        return new ByProjectKeyDiscountGroupsKeyByKeyRequestBuilder(apiHttpClient, projectKey, key);
    }

    public ByProjectKeyDiscountGroupsByIDRequestBuilder withId(String ID) {
        return new ByProjectKeyDiscountGroupsByIDRequestBuilder(apiHttpClient, projectKey, ID);
    }

}
