
package com.commercetools.api.models.cart_discount;

import java.util.Optional;

import com.commercetools.api.models.channel.ChannelReference;
import com.commercetools.api.models.product.ProductReference;

public interface CartDiscountValueGiftLineItemMixin
        extends GenericCartDiscountValueMixin<CartDiscountValueGiftLineItemDraft> {
    public ProductReference getProduct();

    public Long getVariantId();

    public ChannelReference getSupplyChannel();

    public ChannelReference getDistributionChannel();

    @Override
    default CartDiscountValueGiftLineItemDraft toDraft() {
        return toDraftBuilder().build();
    }

    @Override
    default CartDiscountValueGiftLineItemDraftBuilder toDraftBuilder() {
        return CartDiscountValueGiftLineItemDraft.builder()
                .distributionChannel(Optional.ofNullable(getDistributionChannel())
                        .map(ChannelReference::toResourceIdentifier)
                        .orElse(null))
                .supplyChannel(
                    Optional.ofNullable(getSupplyChannel()).map(ChannelReference::toResourceIdentifier).orElse(null))
                .product(Optional.ofNullable(getProduct()).map(ProductReference::toResourceIdentifier).orElse(null))
                .variantId(getVariantId());
    }
}
