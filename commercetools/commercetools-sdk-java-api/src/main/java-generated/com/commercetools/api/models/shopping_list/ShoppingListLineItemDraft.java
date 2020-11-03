package com.commercetools.api.models.shopping_list;

import com.commercetools.api.models.type.CustomFieldsDraft;
import java.time.ZonedDateTime;
import com.commercetools.api.models.shopping_list.ShoppingListLineItemDraftImpl;

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
@JsonDeserialize(as = ShoppingListLineItemDraftImpl.class)
public interface ShoppingListLineItemDraft  {

    
    
    @JsonProperty("addedAt")
    public ZonedDateTime getAddedAt();
    
    @Valid
    @JsonProperty("custom")
    public CustomFieldsDraft getCustom();
    
    
    @JsonProperty("sku")
    public String getSku();
    
    
    @JsonProperty("productId")
    public String getProductId();
    
    
    @JsonProperty("quantity")
    public Integer getQuantity();
    
    
    @JsonProperty("variantId")
    public Long getVariantId();

    public void setAddedAt(final ZonedDateTime addedAt);
    
    public void setCustom(final CustomFieldsDraft custom);
    
    public void setSku(final String sku);
    
    public void setProductId(final String productId);
    
    public void setQuantity(final Integer quantity);
    
    public void setVariantId(final Long variantId);

    public static ShoppingListLineItemDraftImpl of(){
        return new ShoppingListLineItemDraftImpl();
    }
    

    public static ShoppingListLineItemDraftImpl of(final ShoppingListLineItemDraft template) {
        ShoppingListLineItemDraftImpl instance = new ShoppingListLineItemDraftImpl();
        instance.setAddedAt(template.getAddedAt());
        instance.setCustom(template.getCustom());
        instance.setSku(template.getSku());
        instance.setProductId(template.getProductId());
        instance.setQuantity(template.getQuantity());
        instance.setVariantId(template.getVariantId());
        return instance;
    }

    default <T> T withShoppingListLineItemDraft(Function<ShoppingListLineItemDraft, T> helper) {
        return helper.apply(this);
    }
}
