package com.commercetools.api.models.cart_discount;

import com.commercetools.api.models.cart_discount.CartDiscountValueDraft;
import com.commercetools.api.models.channel.ChannelReference;
import com.commercetools.api.models.product.ProductReference;
import com.commercetools.api.models.cart_discount.CartDiscountValueGiftLineItemDraftImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.function.Function;
import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = CartDiscountValueGiftLineItemDraftImpl.class)
public interface CartDiscountValueGiftLineItemDraft extends CartDiscountValueDraft {

    
    @NotNull
    @Valid
    @JsonProperty("product")
    public ProductReference getProduct();
    
    @NotNull
    @JsonProperty("variantId")
    public Long getVariantId();
    
    @Valid
    @JsonProperty("supplyChannel")
    public ChannelReference getSupplyChannel();
    
    @Valid
    @JsonProperty("distributionChannel")
    public ChannelReference getDistributionChannel();

    public void setProduct(final ProductReference product);
    
    public void setVariantId(final Long variantId);
    
    public void setSupplyChannel(final ChannelReference supplyChannel);
    
    public void setDistributionChannel(final ChannelReference distributionChannel);

    public static CartDiscountValueGiftLineItemDraftImpl of(){
        return new CartDiscountValueGiftLineItemDraftImpl();
    }
    

    public static CartDiscountValueGiftLineItemDraftImpl of(final CartDiscountValueGiftLineItemDraft template) {
        CartDiscountValueGiftLineItemDraftImpl instance = new CartDiscountValueGiftLineItemDraftImpl();
        instance.setProduct(template.getProduct());
        instance.setVariantId(template.getVariantId());
        instance.setSupplyChannel(template.getSupplyChannel());
        instance.setDistributionChannel(template.getDistributionChannel());
        return instance;
    }

    default <T> T withCartDiscountValueGiftLineItemDraft(Function<CartDiscountValueGiftLineItemDraft, T> helper) {
        return helper.apply(this);
    }
}
