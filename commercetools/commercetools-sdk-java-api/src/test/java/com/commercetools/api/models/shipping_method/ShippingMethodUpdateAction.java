package com.commercetools.api.models.shipping_method;

import com.commercetools.api.models.shipping_method.ShippingMethodAddShippingRateAction;
import com.commercetools.api.models.shipping_method.ShippingMethodAddZoneAction;
import com.commercetools.api.models.shipping_method.ShippingMethodChangeIsDefaultAction;
import com.commercetools.api.models.shipping_method.ShippingMethodChangeNameAction;
import com.commercetools.api.models.shipping_method.ShippingMethodChangeTaxCategoryAction;
import com.commercetools.api.models.shipping_method.ShippingMethodRemoveShippingRateAction;
import com.commercetools.api.models.shipping_method.ShippingMethodRemoveZoneAction;
import com.commercetools.api.models.shipping_method.ShippingMethodSetCustomFieldAction;
import com.commercetools.api.models.shipping_method.ShippingMethodSetCustomTypeAction;
import com.commercetools.api.models.shipping_method.ShippingMethodSetDescriptionAction;
import com.commercetools.api.models.shipping_method.ShippingMethodSetKeyAction;
import com.commercetools.api.models.shipping_method.ShippingMethodSetLocalizedDescriptionAction;
import com.commercetools.api.models.shipping_method.ShippingMethodSetPredicateAction;


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

@JsonSubTypes({
   @JsonSubTypes.Type(value = com.commercetools.api.models.shipping_method.ShippingMethodAddShippingRateActionImpl.class, name = ShippingMethodAddShippingRateAction.ADD_SHIPPING_RATE),
   @JsonSubTypes.Type(value = com.commercetools.api.models.shipping_method.ShippingMethodAddZoneActionImpl.class, name = ShippingMethodAddZoneAction.ADD_ZONE),
   @JsonSubTypes.Type(value = com.commercetools.api.models.shipping_method.ShippingMethodChangeIsDefaultActionImpl.class, name = ShippingMethodChangeIsDefaultAction.CHANGE_IS_DEFAULT),
   @JsonSubTypes.Type(value = com.commercetools.api.models.shipping_method.ShippingMethodChangeNameActionImpl.class, name = ShippingMethodChangeNameAction.CHANGE_NAME),
   @JsonSubTypes.Type(value = com.commercetools.api.models.shipping_method.ShippingMethodChangeTaxCategoryActionImpl.class, name = ShippingMethodChangeTaxCategoryAction.CHANGE_TAX_CATEGORY),
   @JsonSubTypes.Type(value = com.commercetools.api.models.shipping_method.ShippingMethodRemoveShippingRateActionImpl.class, name = ShippingMethodRemoveShippingRateAction.REMOVE_SHIPPING_RATE),
   @JsonSubTypes.Type(value = com.commercetools.api.models.shipping_method.ShippingMethodRemoveZoneActionImpl.class, name = ShippingMethodRemoveZoneAction.REMOVE_ZONE),
   @JsonSubTypes.Type(value = com.commercetools.api.models.shipping_method.ShippingMethodSetCustomFieldActionImpl.class, name = ShippingMethodSetCustomFieldAction.SET_CUSTOM_FIELD),
   @JsonSubTypes.Type(value = com.commercetools.api.models.shipping_method.ShippingMethodSetCustomTypeActionImpl.class, name = ShippingMethodSetCustomTypeAction.SET_CUSTOM_TYPE),
   @JsonSubTypes.Type(value = com.commercetools.api.models.shipping_method.ShippingMethodSetDescriptionActionImpl.class, name = ShippingMethodSetDescriptionAction.SET_DESCRIPTION),
   @JsonSubTypes.Type(value = com.commercetools.api.models.shipping_method.ShippingMethodSetKeyActionImpl.class, name = ShippingMethodSetKeyAction.SET_KEY),
   @JsonSubTypes.Type(value = com.commercetools.api.models.shipping_method.ShippingMethodSetLocalizedDescriptionActionImpl.class, name = ShippingMethodSetLocalizedDescriptionAction.SET_LOCALIZED_DESCRIPTION),
   @JsonSubTypes.Type(value = com.commercetools.api.models.shipping_method.ShippingMethodSetPredicateActionImpl.class, name = ShippingMethodSetPredicateAction.SET_PREDICATE)
})
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.EXISTING_PROPERTY,
    property = "action",
    defaultImpl = ShippingMethodUpdateActionImpl.class,
    visible = true
)
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public interface ShippingMethodUpdateAction extends com.commercetools.api.models.ResourceUpdateAction<ShippingMethodUpdateAction> {


    
    @NotNull
    @JsonProperty("action")
    public String getAction();





    default <T> T withShippingMethodUpdateAction(Function<ShippingMethodUpdateAction, T> helper) {
        return helper.apply(this);
    }
}
