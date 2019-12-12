package com.commercetools.api.generated.models.cart_discount;

import com.commercetools.api.generated.models.cart_discount.CartDiscountChangeCartPredicateAction;
import com.commercetools.api.generated.models.cart_discount.CartDiscountChangeIsActiveAction;
import com.commercetools.api.generated.models.cart_discount.CartDiscountChangeNameAction;
import com.commercetools.api.generated.models.cart_discount.CartDiscountChangeRequiresDiscountCodeAction;
import com.commercetools.api.generated.models.cart_discount.CartDiscountChangeSortOrderAction;
import com.commercetools.api.generated.models.cart_discount.CartDiscountChangeStackingModeAction;
import com.commercetools.api.generated.models.cart_discount.CartDiscountChangeTargetAction;
import com.commercetools.api.generated.models.cart_discount.CartDiscountChangeValueAction;
import com.commercetools.api.generated.models.cart_discount.CartDiscountSetCustomFieldAction;
import com.commercetools.api.generated.models.cart_discount.CartDiscountSetCustomTypeAction;
import com.commercetools.api.generated.models.cart_discount.CartDiscountSetDescriptionAction;
import com.commercetools.api.generated.models.cart_discount.CartDiscountSetKeyAction;
import com.commercetools.api.generated.models.cart_discount.CartDiscountSetValidFromAction;
import com.commercetools.api.generated.models.cart_discount.CartDiscountSetValidFromAndUntilAction;
import com.commercetools.api.generated.models.cart_discount.CartDiscountSetValidUntilAction;


import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import java.io.IOException;

@JsonSubTypes({
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.cart_discount.CartDiscountChangeCartPredicateActionImpl.class, name = "changeCartPredicate"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.cart_discount.CartDiscountChangeIsActiveActionImpl.class, name = "changeIsActive"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.cart_discount.CartDiscountChangeNameActionImpl.class, name = "changeName"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.cart_discount.CartDiscountChangeRequiresDiscountCodeActionImpl.class, name = "changeRequiresDiscountCode"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.cart_discount.CartDiscountChangeSortOrderActionImpl.class, name = "changeSortOrder"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.cart_discount.CartDiscountChangeStackingModeActionImpl.class, name = "changeStackingMode"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.cart_discount.CartDiscountChangeTargetActionImpl.class, name = "changeTarget"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.cart_discount.CartDiscountChangeValueActionImpl.class, name = "changeValue"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.cart_discount.CartDiscountSetCustomFieldActionImpl.class, name = "setCustomField"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.cart_discount.CartDiscountSetCustomTypeActionImpl.class, name = "setCustomType"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.cart_discount.CartDiscountSetDescriptionActionImpl.class, name = "setDescription"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.cart_discount.CartDiscountSetKeyActionImpl.class, name = "setKey"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.cart_discount.CartDiscountSetValidFromActionImpl.class, name = "setValidFrom"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.cart_discount.CartDiscountSetValidFromAndUntilActionImpl.class, name = "setValidFromAndUntil"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.cart_discount.CartDiscountSetValidUntilActionImpl.class, name = "setValidUntil")
})
@JsonTypeInfo(
   use = JsonTypeInfo.Id.NAME,
   include = JsonTypeInfo.As.PROPERTY,
   property = "action",
   defaultImpl = CartDiscountUpdateActionImpl.class
)
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public interface CartDiscountUpdateAction  {


   


}