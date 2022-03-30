
package com.commercetools.api.models.product_selection;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@JsonSubTypes({
        @JsonSubTypes.Type(value = com.commercetools.api.models.product_selection.ProductSelectionAddProductActionImpl.class, name = ProductSelectionAddProductAction.ADD_PRODUCT),
        @JsonSubTypes.Type(value = com.commercetools.api.models.product_selection.ProductSelectionChangeNameActionImpl.class, name = ProductSelectionChangeNameAction.CHANGE_NAME),
        @JsonSubTypes.Type(value = com.commercetools.api.models.product_selection.ProductSelectionRemoveProductActionImpl.class, name = ProductSelectionRemoveProductAction.REMOVE_PRODUCT),
        @JsonSubTypes.Type(value = com.commercetools.api.models.product_selection.ProductSelectionSetCustomFieldActionImpl.class, name = ProductSelectionSetCustomFieldAction.SET_CUSTOM_FIELD),
        @JsonSubTypes.Type(value = com.commercetools.api.models.product_selection.ProductSelectionSetCustomTypeActionImpl.class, name = ProductSelectionSetCustomTypeAction.SET_CUSTOM_TYPE),
        @JsonSubTypes.Type(value = com.commercetools.api.models.product_selection.ProductSelectionSetKeyActionImpl.class, name = ProductSelectionSetKeyAction.SET_KEY) })
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "action", defaultImpl = ProductSelectionUpdateActionImpl.class, visible = true)
@JsonDeserialize(as = ProductSelectionUpdateActionImpl.class)
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public interface ProductSelectionUpdateAction
        extends com.commercetools.api.models.ResourceUpdateAction<ProductSelectionUpdateAction> {

    @NotNull
    @JsonProperty("action")
    public String getAction();

    default <T> T withProductSelectionUpdateAction(Function<ProductSelectionUpdateAction, T> helper) {
        return helper.apply(this);
    }
}
