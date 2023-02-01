
package com.commercetools.api.client;

import java.util.List;
import java.util.function.UnaryOperator;

import com.commercetools.api.models.Versioned;
import com.commercetools.api.models.discount_code.DiscountCode;
import com.commercetools.api.models.discount_code.DiscountCodeDraft;
import com.commercetools.api.models.discount_code.DiscountCodeDraftBuilder;
import com.commercetools.api.models.discount_code.DiscountCodeUpdate;
import com.commercetools.api.models.discount_code.DiscountCodeUpdateAction;
import com.commercetools.api.models.discount_code.DiscountCodeUpdateActionBuilder;

public interface ByProjectKeyDiscountCodesRequestBuilderMixin {
    public ByProjectKeyDiscountCodesByIDRequestBuilder withId(String ID);

    public ByProjectKeyDiscountCodesPost post(DiscountCodeDraft discountCodeDraft);

    public default ByProjectKeyDiscountCodesByIDPost update(Versioned<DiscountCode> discountCode,
            List<DiscountCodeUpdateAction> actions) {
        return withId(discountCode.getId())
                .post(builder -> DiscountCodeUpdate.builder().version(discountCode.getVersion()).actions(actions));
    }

    public default ByProjectKeyDiscountCodesByIDPost update(Versioned<DiscountCode> discountCode,
            UnaryOperator<UpdateActionBuilder<DiscountCodeUpdateAction, DiscountCodeUpdateActionBuilder>> op) {
        return withId(discountCode.getId()).post(builder -> DiscountCodeUpdate.builder()
                .version(discountCode.getVersion())
                .actions(op.apply(UpdateActionBuilder.of(DiscountCodeUpdateActionBuilder::of)).actions));
    }

    public default WithUpdateActionBuilder<DiscountCodeUpdateAction, DiscountCodeUpdateActionBuilder, ByProjectKeyDiscountCodesByIDPost> update(
            Versioned<DiscountCode> discountCode) {
        return builder -> withId(discountCode.getId()).post(b -> DiscountCodeUpdate.builder()
                .version(discountCode.getVersion())
                .actions(builder.apply(UpdateActionBuilder.of(DiscountCodeUpdateActionBuilder::of)).actions));
    }

    public default ByProjectKeyDiscountCodesByIDDelete delete(Versioned<DiscountCode> discountCode) {
        return withId(discountCode.getId()).delete().withVersion(discountCode.getVersion());
    }

    public default ByProjectKeyDiscountCodesPost create(DiscountCodeDraft discountCodeDraft) {
        return post(discountCodeDraft);
    }

    public default ByProjectKeyDiscountCodesPost create(UnaryOperator<DiscountCodeDraftBuilder> op) {
        return post(op.apply(DiscountCodeDraftBuilder.of()).build());
    }
}
