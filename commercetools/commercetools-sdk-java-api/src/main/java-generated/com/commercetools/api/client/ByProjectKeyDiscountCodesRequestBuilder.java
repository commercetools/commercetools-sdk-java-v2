
package com.commercetools.api.client;

import java.util.function.UnaryOperator;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyDiscountCodesRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;

    public ByProjectKeyDiscountCodesRequestBuilder(final ApiHttpClient apiHttpClient, final String projectKey) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
    }

    public ByProjectKeyDiscountCodesGet get() {
        return new ByProjectKeyDiscountCodesGet(apiHttpClient, projectKey);
    }

    public ByProjectKeyDiscountCodesPost post(
            com.commercetools.api.models.discount_code.DiscountCodeDraft discountCodeDraft) {
        return new ByProjectKeyDiscountCodesPost(apiHttpClient, projectKey, discountCodeDraft);
    }

    public ByProjectKeyDiscountCodesPost post(
            UnaryOperator<com.commercetools.api.models.discount_code.DiscountCodeDraftBuilder> op) {
        return post(op.apply(com.commercetools.api.models.discount_code.DiscountCodeDraftBuilder.of()).build());
    }

    public ByProjectKeyDiscountCodesByIDRequestBuilder withId(String ID) {
        return new ByProjectKeyDiscountCodesByIDRequestBuilder(apiHttpClient, projectKey, ID);
    }

    public ByProjectKeyDiscountCodesByIDPost update(
            com.commercetools.api.models.Versioned<com.commercetools.api.models.discount_code.DiscountCode> discountCode,
            java.util.List<com.commercetools.api.models.discount_code.DiscountCodeUpdateAction> actions) {
        return withId(discountCode.getId())
                .post(builder -> com.commercetools.api.models.discount_code.DiscountCodeUpdate.builder()
                        .version(discountCode.getVersion())
                        .actions(actions));
    }

    public ByProjectKeyDiscountCodesByIDPost update(
            com.commercetools.api.models.Versioned<com.commercetools.api.models.discount_code.DiscountCode> discountCode,
            UnaryOperator<UpdateActionBuilder<com.commercetools.api.models.discount_code.DiscountCodeUpdateAction, com.commercetools.api.models.discount_code.DiscountCodeUpdateActionBuilder>> op) {
        return withId(discountCode.getId())
                .post(builder -> com.commercetools.api.models.discount_code.DiscountCodeUpdate.builder()
                        .version(discountCode.getVersion())
                        .actions(op.apply(UpdateActionBuilder.of(
                            com.commercetools.api.models.discount_code.DiscountCodeUpdateActionBuilder::of)).actions));
    }

    public WithUpdateActionBuilder<com.commercetools.api.models.discount_code.DiscountCodeUpdateAction, com.commercetools.api.models.discount_code.DiscountCodeUpdateActionBuilder, ByProjectKeyDiscountCodesByIDPost> update(
            com.commercetools.api.models.Versioned<com.commercetools.api.models.discount_code.DiscountCode> discountCode) {
        return builder -> withId(discountCode.getId())
                .post(b -> com.commercetools.api.models.discount_code.DiscountCodeUpdate.builder()
                        .version(discountCode.getVersion())
                        .actions(builder.apply(UpdateActionBuilder.of(
                            com.commercetools.api.models.discount_code.DiscountCodeUpdateActionBuilder::of)).actions));
    }

    public ByProjectKeyDiscountCodesByIDDelete delete(
            com.commercetools.api.models.Versioned<com.commercetools.api.models.discount_code.DiscountCode> discountCode) {
        return withId(discountCode.getId()).delete().withVersion(discountCode.getVersion());
    }

    public ByProjectKeyDiscountCodesPost create(
            com.commercetools.api.models.discount_code.DiscountCodeDraft discountCodeDraft) {
        return post(discountCodeDraft);
    }

    public ByProjectKeyDiscountCodesPost create(
            UnaryOperator<com.commercetools.api.models.discount_code.DiscountCodeDraftBuilder> op) {
        return post(op.apply(com.commercetools.api.models.discount_code.DiscountCodeDraftBuilder.of()).build());
    }

}
