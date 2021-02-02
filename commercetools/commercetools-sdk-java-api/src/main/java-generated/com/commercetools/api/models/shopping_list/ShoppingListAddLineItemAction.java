
package com.commercetools.api.models.shopping_list;

import java.time.*;
import java.time.ZonedDateTime;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;

import com.commercetools.api.models.type.CustomFieldsDraft;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ShoppingListAddLineItemActionImpl.class)
public interface ShoppingListAddLineItemAction extends ShoppingListUpdateAction {

    String ADD_LINE_ITEM = "addLineItem";

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

    public static ShoppingListAddLineItemAction of() {
        return new ShoppingListAddLineItemActionImpl();
    }

    public static ShoppingListAddLineItemAction of(final ShoppingListAddLineItemAction template) {
        ShoppingListAddLineItemActionImpl instance = new ShoppingListAddLineItemActionImpl();
        instance.setSku(template.getSku());
        instance.setProductId(template.getProductId());
        instance.setVariantId(template.getVariantId());
        instance.setQuantity(template.getQuantity());
        instance.setAddedAt(template.getAddedAt());
        instance.setCustom(template.getCustom());
        return instance;
    }

    public static ShoppingListAddLineItemActionBuilder builder() {
        return ShoppingListAddLineItemActionBuilder.of();
    }

    public static ShoppingListAddLineItemActionBuilder builder(final ShoppingListAddLineItemAction template) {
        return ShoppingListAddLineItemActionBuilder.of(template);
    }

    default <T> T withShoppingListAddLineItemAction(Function<ShoppingListAddLineItemAction, T> helper) {
        return helper.apply(this);
    }
}
