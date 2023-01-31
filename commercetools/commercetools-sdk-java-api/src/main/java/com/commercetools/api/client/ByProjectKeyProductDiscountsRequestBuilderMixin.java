
package com.commercetools.api.client;

import java.util.List;
import java.util.function.UnaryOperator;

import com.commercetools.api.models.Versioned;
import com.commercetools.api.models.product_discount.ProductDiscount;
import com.commercetools.api.models.product_discount.ProductDiscountDraft;
import com.commercetools.api.models.product_discount.ProductDiscountDraftBuilder;
import com.commercetools.api.models.product_discount.ProductDiscountUpdate;
import com.commercetools.api.models.product_discount.ProductDiscountUpdateAction;
import com.commercetools.api.models.product_discount.ProductDiscountUpdateActionBuilder;

public interface ByProjectKeyProductDiscountsRequestBuilderMixin {
    public ByProjectKeyProductDiscountsPost post(ProductDiscountDraft productDiscountDraft);

    public ByProjectKeyProductDiscountsByIDRequestBuilder withId(String ID);

    public default ByProjectKeyProductDiscountsByIDPost update(Versioned<ProductDiscount> productDiscount,
            List<ProductDiscountUpdateAction> actions) {
        return withId(productDiscount.getId()).post(
            builder -> ProductDiscountUpdate.builder().version(productDiscount.getVersion()).actions(actions));
    }

    public default ByProjectKeyProductDiscountsByIDPost update(Versioned<ProductDiscount> productDiscount,
            UnaryOperator<UpdateActionBuilder<ProductDiscountUpdateAction, ProductDiscountUpdateActionBuilder>> op) {
        return withId(productDiscount.getId()).post(builder -> ProductDiscountUpdate.builder()
                .version(productDiscount.getVersion())
                .actions(op.apply(UpdateActionBuilder.of(ProductDiscountUpdateActionBuilder::of)).actions));
    }

    public default WithUpdateActionBuilder<ProductDiscountUpdateAction, ProductDiscountUpdateActionBuilder, ByProjectKeyProductDiscountsByIDPost> update(
            Versioned<ProductDiscount> productDiscount) {
        return builder -> withId(productDiscount.getId()).post(b -> ProductDiscountUpdate.builder()
                .version(productDiscount.getVersion())
                .actions(builder.apply(UpdateActionBuilder.of(ProductDiscountUpdateActionBuilder::of)).actions));
    }

    public default ByProjectKeyProductDiscountsByIDDelete delete(Versioned<ProductDiscount> productDiscount) {
        return withId(productDiscount.getId()).delete().withVersion(productDiscount.getVersion());
    }

    public default ByProjectKeyProductDiscountsPost create(ProductDiscountDraft productDiscountDraft) {
        return post(productDiscountDraft);
    }

    public default ByProjectKeyProductDiscountsPost create(UnaryOperator<ProductDiscountDraftBuilder> op) {
        return post(op.apply(ProductDiscountDraftBuilder.of()).build());
    }
}
