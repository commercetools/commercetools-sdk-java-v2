package com.commercetools.models.ShippingMethod;

import com.commercetools.models.ShippingMethod.ShippingMethodAddShippingRateAction;
import com.commercetools.models.ShippingMethod.ShippingMethodAddZoneAction;
import com.commercetools.models.ShippingMethod.ShippingMethodChangeIsDefaultAction;
import com.commercetools.models.ShippingMethod.ShippingMethodChangeNameAction;
import com.commercetools.models.ShippingMethod.ShippingMethodChangeTaxCategoryAction;
import com.commercetools.models.ShippingMethod.ShippingMethodRemoveShippingRateAction;
import com.commercetools.models.ShippingMethod.ShippingMethodRemoveZoneAction;
import com.commercetools.models.ShippingMethod.ShippingMethodSetDescriptionAction;
import com.commercetools.models.ShippingMethod.ShippingMethodSetKeyAction;
import com.commercetools.models.ShippingMethod.ShippingMethodSetPredicateAction;
import java.lang.String;


import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import java.io.IOException;

@JsonSubTypes({
   @JsonSubTypes.Type(value = com.commercetools.models.ShippingMethod.ShippingMethodAddShippingRateActionImpl.class, name = "addShippingRate"),
   @JsonSubTypes.Type(value = com.commercetools.models.ShippingMethod.ShippingMethodAddZoneActionImpl.class, name = "addZone"),
   @JsonSubTypes.Type(value = com.commercetools.models.ShippingMethod.ShippingMethodChangeIsDefaultActionImpl.class, name = "changeIsDefault"),
   @JsonSubTypes.Type(value = com.commercetools.models.ShippingMethod.ShippingMethodChangeNameActionImpl.class, name = "changeName"),
   @JsonSubTypes.Type(value = com.commercetools.models.ShippingMethod.ShippingMethodChangeTaxCategoryActionImpl.class, name = "changeTaxCategory"),
   @JsonSubTypes.Type(value = com.commercetools.models.ShippingMethod.ShippingMethodRemoveShippingRateActionImpl.class, name = "removeShippingRate"),
   @JsonSubTypes.Type(value = com.commercetools.models.ShippingMethod.ShippingMethodRemoveZoneActionImpl.class, name = "removeZone"),
   @JsonSubTypes.Type(value = com.commercetools.models.ShippingMethod.ShippingMethodSetDescriptionActionImpl.class, name = "setDescription"),
   @JsonSubTypes.Type(value = com.commercetools.models.ShippingMethod.ShippingMethodSetKeyActionImpl.class, name = "setKey"),
   @JsonSubTypes.Type(value = com.commercetools.models.ShippingMethod.ShippingMethodSetPredicateActionImpl.class, name = "setPredicate")
})
@JsonTypeInfo(
   use = JsonTypeInfo.Id.NAME,
   include = JsonTypeInfo.As.PROPERTY,
   property = "action"
)
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public interface ShippingMethodUpdateAction  {


   


}