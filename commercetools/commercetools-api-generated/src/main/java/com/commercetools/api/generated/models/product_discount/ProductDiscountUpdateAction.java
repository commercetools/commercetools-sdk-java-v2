package com.commercetools.api.generated.models.product_discount;

import com.commercetools.api.generated.models.product_discount.ProductDiscountChangeIsActiveAction;
import com.commercetools.api.generated.models.product_discount.ProductDiscountChangeNameAction;
import com.commercetools.api.generated.models.product_discount.ProductDiscountChangePredicateAction;
import com.commercetools.api.generated.models.product_discount.ProductDiscountChangeSortOrderAction;
import com.commercetools.api.generated.models.product_discount.ProductDiscountChangeValueAction;
import com.commercetools.api.generated.models.product_discount.ProductDiscountSetDescriptionAction;
import com.commercetools.api.generated.models.product_discount.ProductDiscountSetKeyAction;
import com.commercetools.api.generated.models.product_discount.ProductDiscountSetValidFromAction;
import com.commercetools.api.generated.models.product_discount.ProductDiscountSetValidFromAndUntilAction;
import com.commercetools.api.generated.models.product_discount.ProductDiscountSetValidUntilAction;


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
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.product_discount.ProductDiscountChangeIsActiveActionImpl.class, name = "changeIsActive"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.product_discount.ProductDiscountChangeNameActionImpl.class, name = "changeName"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.product_discount.ProductDiscountChangePredicateActionImpl.class, name = "changePredicate"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.product_discount.ProductDiscountChangeSortOrderActionImpl.class, name = "changeSortOrder"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.product_discount.ProductDiscountChangeValueActionImpl.class, name = "changeValue"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.product_discount.ProductDiscountSetDescriptionActionImpl.class, name = "setDescription"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.product_discount.ProductDiscountSetKeyActionImpl.class, name = "setKey"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.product_discount.ProductDiscountSetValidFromActionImpl.class, name = "setValidFrom"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.product_discount.ProductDiscountSetValidFromAndUntilActionImpl.class, name = "setValidFromAndUntil"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.product_discount.ProductDiscountSetValidUntilActionImpl.class, name = "setValidUntil")
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