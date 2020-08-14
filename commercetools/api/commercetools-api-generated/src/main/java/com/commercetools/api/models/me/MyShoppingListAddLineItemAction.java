package com.commercetools.api.models.me;

import com.commercetools.api.models.me.MyShoppingListUpdateAction;
import com.commercetools.api.models.type.CustomFieldsDraft;
import java.time.ZonedDateTime;
import com.commercetools.api.models.me.MyShoppingListAddLineItemActionImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = MyShoppingListAddLineItemActionImpl.class)
public interface MyShoppingListAddLineItemAction extends MyShoppingListUpdateAction {

    
    
    @JsonProperty("sku")
    public String getSku();
    
    
    @JsonProperty("productId")
    public String getProductId();
    
    
    @JsonProperty("variantId")
    public Long getVariantId();
    
    
    @JsonProperty("quantity")
    public Long getQuantity();
    
    
    @JsonProperty("addedAt")
    public ZonedDateTime getAddedAt();
    
    @Valid
    @JsonProperty("custom")
    public CustomFieldsDraft getCustom();

    public void setSku(final String sku);
    
    public void setProductId(final String productId);
    
    public void setVariantId(final Long variantId);
    
    public void setQuantity(final Long quantity);
    
    public void setAddedAt(final ZonedDateTime addedAt);
    
    public void setCustom(final CustomFieldsDraft custom);

    public static MyShoppingListAddLineItemActionImpl of(){
        return new MyShoppingListAddLineItemActionImpl();
    }
    

    public static MyShoppingListAddLineItemActionImpl of(final MyShoppingListAddLineItemAction template) {
        MyShoppingListAddLineItemActionImpl instance = new MyShoppingListAddLineItemActionImpl();
        instance.setSku(template.getSku());
        instance.setProductId(template.getProductId());
        instance.setVariantId(template.getVariantId());
        instance.setQuantity(template.getQuantity());
        instance.setAddedAt(template.getAddedAt());
        instance.setCustom(template.getCustom());
        return instance;
    }

}
