package com.commercetools.api.models.shipping_method;

import com.commercetools.api.models.shipping_method.ShippingMethodAddShippingRateAction;
import com.commercetools.api.models.shipping_method.ShippingMethodAddZoneAction;
import com.commercetools.api.models.shipping_method.ShippingMethodChangeIsDefaultAction;
import com.commercetools.api.models.shipping_method.ShippingMethodChangeNameAction;
import com.commercetools.api.models.shipping_method.ShippingMethodChangeTaxCategoryAction;
import com.commercetools.api.models.shipping_method.ShippingMethodRemoveShippingRateAction;
import com.commercetools.api.models.shipping_method.ShippingMethodRemoveZoneAction;
import com.commercetools.api.models.shipping_method.ShippingMethodSetDescriptionAction;
import com.commercetools.api.models.shipping_method.ShippingMethodSetKeyAction;
import com.commercetools.api.models.shipping_method.ShippingMethodSetLocalizedDescriptionAction;
import com.commercetools.api.models.shipping_method.ShippingMethodSetPredicateAction;


import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import java.io.IOException;

@JsonSubTypes({
   @JsonSubTypes.Type(value = com.commercetools.api.models.shipping_method.ShippingMethodAddShippingRateActionImpl.class, name = "addShippingRate"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.shipping_method.ShippingMethodAddZoneActionImpl.class, name = "addZone"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.shipping_method.ShippingMethodChangeIsDefaultActionImpl.class, name = "changeIsDefault"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.shipping_method.ShippingMethodChangeNameActionImpl.class, name = "changeName"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.shipping_method.ShippingMethodChangeTaxCategoryActionImpl.class, name = "changeTaxCategory"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.shipping_method.ShippingMethodRemoveShippingRateActionImpl.class, name = "removeShippingRate"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.shipping_method.ShippingMethodRemoveZoneActionImpl.class, name = "removeZone"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.shipping_method.ShippingMethodSetDescriptionActionImpl.class, name = "setDescription"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.shipping_method.ShippingMethodSetKeyActionImpl.class, name = "setKey"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.shipping_method.ShippingMethodSetLocalizedDescriptionActionImpl.class, name = "setLocalizedDescription"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.shipping_method.ShippingMethodSetPredicateActionImpl.class, name = "setPredicate")
})
@JsonTypeInfo(
   use = JsonTypeInfo.Id.NAME,
   include = JsonTypeInfo.As.PROPERTY,
   property = "action",
   defaultImpl = ShippingMethodUpdateActionImpl.class
)
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public interface ShippingMethodUpdateAction  {


   


}
