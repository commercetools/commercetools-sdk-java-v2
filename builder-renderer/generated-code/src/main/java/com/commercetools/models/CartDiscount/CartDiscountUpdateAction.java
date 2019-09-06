package com.commercetools.models.CartDiscount;

import com.commercetools.models.CartDiscount.CartDiscountChangeCartPredicateAction;
import com.commercetools.models.CartDiscount.CartDiscountChangeIsActiveAction;
import com.commercetools.models.CartDiscount.CartDiscountChangeNameAction;
import com.commercetools.models.CartDiscount.CartDiscountChangeRequiresDiscountCodeAction;
import com.commercetools.models.CartDiscount.CartDiscountChangeSortOrderAction;
import com.commercetools.models.CartDiscount.CartDiscountChangeStackingModeAction;
import com.commercetools.models.CartDiscount.CartDiscountChangeTargetAction;
import com.commercetools.models.CartDiscount.CartDiscountChangeValueAction;
import com.commercetools.models.CartDiscount.CartDiscountSetCustomFieldAction;
import com.commercetools.models.CartDiscount.CartDiscountSetCustomTypeAction;
import com.commercetools.models.CartDiscount.CartDiscountSetDescriptionAction;
import com.commercetools.models.CartDiscount.CartDiscountSetKeyAction;
import com.commercetools.models.CartDiscount.CartDiscountSetValidFromAction;
import com.commercetools.models.CartDiscount.CartDiscountSetValidFromAndUntilAction;
import com.commercetools.models.CartDiscount.CartDiscountSetValidUntilAction;
import java.lang.String;


import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import json.CommercetoolsJsonUtils;
import java.io.IOException;

@JsonSubTypes({
   @JsonSubTypes.Type(value = com.commercetools.models.CartDiscount.CartDiscountChangeCartPredicateActionImpl.class, name = "changeCartPredicate"),
   @JsonSubTypes.Type(value = com.commercetools.models.CartDiscount.CartDiscountChangeIsActiveActionImpl.class, name = "changeIsActive"),
   @JsonSubTypes.Type(value = com.commercetools.models.CartDiscount.CartDiscountChangeNameActionImpl.class, name = "changeName"),
   @JsonSubTypes.Type(value = com.commercetools.models.CartDiscount.CartDiscountChangeRequiresDiscountCodeActionImpl.class, name = "changeRequiresDiscountCode"),
   @JsonSubTypes.Type(value = com.commercetools.models.CartDiscount.CartDiscountChangeSortOrderActionImpl.class, name = "changeSortOrder"),
   @JsonSubTypes.Type(value = com.commercetools.models.CartDiscount.CartDiscountChangeStackingModeActionImpl.class, name = "changeStackingMode"),
   @JsonSubTypes.Type(value = com.commercetools.models.CartDiscount.CartDiscountChangeTargetActionImpl.class, name = "changeTarget"),
   @JsonSubTypes.Type(value = com.commercetools.models.CartDiscount.CartDiscountChangeValueActionImpl.class, name = "changeValue"),
   @JsonSubTypes.Type(value = com.commercetools.models.CartDiscount.CartDiscountSetCustomFieldActionImpl.class, name = "setCustomField"),
   @JsonSubTypes.Type(value = com.commercetools.models.CartDiscount.CartDiscountSetCustomTypeActionImpl.class, name = "setCustomType"),
   @JsonSubTypes.Type(value = com.commercetools.models.CartDiscount.CartDiscountSetDescriptionActionImpl.class, name = "setDescription"),
   @JsonSubTypes.Type(value = com.commercetools.models.CartDiscount.CartDiscountSetKeyActionImpl.class, name = "setKey"),
   @JsonSubTypes.Type(value = com.commercetools.models.CartDiscount.CartDiscountSetValidFromActionImpl.class, name = "setValidFrom"),
   @JsonSubTypes.Type(value = com.commercetools.models.CartDiscount.CartDiscountSetValidFromAndUntilActionImpl.class, name = "setValidFromAndUntil"),
   @JsonSubTypes.Type(value = com.commercetools.models.CartDiscount.CartDiscountSetValidUntilActionImpl.class, name = "setValidUntil")
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
public interface CartDiscountUpdateAction  {


   


}