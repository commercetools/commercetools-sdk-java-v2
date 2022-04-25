
package com.commercetools.api.models.me;

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
@JsonDeserialize(as = MyShoppingListAddLineItemActionImpl.class)
public interface MyShoppingListAddLineItemAction extends MyShoppingListUpdateAction,
        com.commercetools.api.models.CustomizableDraft<MyShoppingListAddLineItemAction> {

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

    /**
    *  <p>The representation used when creating or updating a <a href="/../api/projects/types#list-of-customizable-data-types">customizable data type</a> with Custom Fields.</p>
    */
    @Valid
    @JsonProperty("custom")
    public CustomFieldsDraft getCustom();

    public void setSku(final String sku);

    public void setProductId(final String productId);

    public void setVariantId(final Long variantId);

    public void setQuantity(final Long quantity);

    public void setAddedAt(final ZonedDateTime addedAt);

    public void setCustom(final CustomFieldsDraft custom);

    public static MyShoppingListAddLineItemAction of() {
        return new MyShoppingListAddLineItemActionImpl();
    }

    public static MyShoppingListAddLineItemAction of(final MyShoppingListAddLineItemAction template) {
        MyShoppingListAddLineItemActionImpl instance = new MyShoppingListAddLineItemActionImpl();
        instance.setSku(template.getSku());
        instance.setProductId(template.getProductId());
        instance.setVariantId(template.getVariantId());
        instance.setQuantity(template.getQuantity());
        instance.setAddedAt(template.getAddedAt());
        instance.setCustom(template.getCustom());
        return instance;
    }

    public static MyShoppingListAddLineItemActionBuilder builder() {
        return MyShoppingListAddLineItemActionBuilder.of();
    }

    public static MyShoppingListAddLineItemActionBuilder builder(final MyShoppingListAddLineItemAction template) {
        return MyShoppingListAddLineItemActionBuilder.of(template);
    }

    default <T> T withMyShoppingListAddLineItemAction(Function<MyShoppingListAddLineItemAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<MyShoppingListAddLineItemAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<MyShoppingListAddLineItemAction>() {
            @Override
            public String toString() {
                return "TypeReference<MyShoppingListAddLineItemAction>";
            }
        };
    }
}
