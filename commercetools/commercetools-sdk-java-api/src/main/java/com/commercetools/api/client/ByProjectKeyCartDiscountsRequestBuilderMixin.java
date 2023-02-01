
package com.commercetools.api.client;

import java.util.List;
import java.util.function.UnaryOperator;

import com.commercetools.api.models.Versioned;
import com.commercetools.api.models.cart_discount.CartDiscount;
import com.commercetools.api.models.cart_discount.CartDiscountDraft;
import com.commercetools.api.models.cart_discount.CartDiscountDraftBuilder;
import com.commercetools.api.models.cart_discount.CartDiscountUpdate;
import com.commercetools.api.models.cart_discount.CartDiscountUpdateAction;
import com.commercetools.api.models.cart_discount.CartDiscountUpdateActionBuilder;

public interface ByProjectKeyCartDiscountsRequestBuilderMixin {
    public ByProjectKeyCartDiscountsByIDRequestBuilder withId(String ID);

    public ByProjectKeyCartDiscountsPost post(CartDiscountDraft cartDiscountDraft);

    public default ByProjectKeyCartDiscountsByIDPost update(Versioned<CartDiscount> cartDiscount,
            List<CartDiscountUpdateAction> actions) {
        return withId(cartDiscount.getId())
                .post(builder -> CartDiscountUpdate.builder().version(cartDiscount.getVersion()).actions(actions));
    }

    public default ByProjectKeyCartDiscountsByIDPost update(Versioned<CartDiscount> cartDiscount,
            UnaryOperator<UpdateActionBuilder<CartDiscountUpdateAction, CartDiscountUpdateActionBuilder>> op) {
        return withId(cartDiscount.getId()).post(builder -> CartDiscountUpdate.builder()
                .version(cartDiscount.getVersion())
                .actions(op.apply(UpdateActionBuilder.of(CartDiscountUpdateActionBuilder::of)).actions));
    }

    public default WithUpdateActionBuilder<CartDiscountUpdateAction, CartDiscountUpdateActionBuilder, ByProjectKeyCartDiscountsByIDPost> update(
            Versioned<CartDiscount> cartDiscount) {
        return builder -> withId(cartDiscount.getId()).post(b -> CartDiscountUpdate.builder()
                .version(cartDiscount.getVersion())
                .actions(builder.apply(UpdateActionBuilder.of(CartDiscountUpdateActionBuilder::of)).actions));
    }

    public default ByProjectKeyCartDiscountsByIDDelete delete(Versioned<CartDiscount> cartDiscount) {
        return withId(cartDiscount.getId()).delete().withVersion(cartDiscount.getVersion());
    }

    public default ByProjectKeyCartDiscountsPost create(CartDiscountDraft cartDiscountDraft) {
        return post(cartDiscountDraft);
    }

    public default ByProjectKeyCartDiscountsPost create(UnaryOperator<CartDiscountDraftBuilder> op) {
        return post(op.apply(CartDiscountDraftBuilder.of()).build());
    }

}
