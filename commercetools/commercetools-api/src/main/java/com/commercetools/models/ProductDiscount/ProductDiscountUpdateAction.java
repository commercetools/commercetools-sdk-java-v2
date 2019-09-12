package com.commercetools.models.ProductDiscount;

import com.commercetools.models.ProductDiscount.ProductDiscountChangeIsActiveAction;
import com.commercetools.models.ProductDiscount.ProductDiscountChangeNameAction;
import com.commercetools.models.ProductDiscount.ProductDiscountChangePredicateAction;
import com.commercetools.models.ProductDiscount.ProductDiscountChangeSortOrderAction;
import com.commercetools.models.ProductDiscount.ProductDiscountChangeValueAction;
import com.commercetools.models.ProductDiscount.ProductDiscountSetDescriptionAction;
import com.commercetools.models.ProductDiscount.ProductDiscountSetKeyAction;
import com.commercetools.models.ProductDiscount.ProductDiscountSetValidFromAction;
import com.commercetools.models.ProductDiscount.ProductDiscountSetValidFromAndUntilAction;
import com.commercetools.models.ProductDiscount.ProductDiscountSetValidUntilAction;
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
   @JsonSubTypes.Type(value = com.commercetools.models.ProductDiscount.ProductDiscountChangeIsActiveActionImpl.class, name = "changeIsActive"),
   @JsonSubTypes.Type(value = com.commercetools.models.ProductDiscount.ProductDiscountChangeNameActionImpl.class, name = "changeName"),
   @JsonSubTypes.Type(value = com.commercetools.models.ProductDiscount.ProductDiscountChangePredicateActionImpl.class, name = "changePredicate"),
   @JsonSubTypes.Type(value = com.commercetools.models.ProductDiscount.ProductDiscountChangeSortOrderActionImpl.class, name = "changeSortOrder"),
   @JsonSubTypes.Type(value = com.commercetools.models.ProductDiscount.ProductDiscountChangeValueActionImpl.class, name = "changeValue"),
   @JsonSubTypes.Type(value = com.commercetools.models.ProductDiscount.ProductDiscountSetDescriptionActionImpl.class, name = "setDescription"),
   @JsonSubTypes.Type(value = com.commercetools.models.ProductDiscount.ProductDiscountSetKeyActionImpl.class, name = "setKey"),
   @JsonSubTypes.Type(value = com.commercetools.models.ProductDiscount.ProductDiscountSetValidFromActionImpl.class, name = "setValidFrom"),
   @JsonSubTypes.Type(value = com.commercetools.models.ProductDiscount.ProductDiscountSetValidFromAndUntilActionImpl.class, name = "setValidFromAndUntil"),
   @JsonSubTypes.Type(value = com.commercetools.models.ProductDiscount.ProductDiscountSetValidUntilActionImpl.class, name = "setValidUntil")
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
public interface ProductDiscountUpdateAction  {


   


}