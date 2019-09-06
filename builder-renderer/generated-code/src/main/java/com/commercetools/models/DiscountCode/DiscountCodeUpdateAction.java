package com.commercetools.models.DiscountCode;

import com.commercetools.models.DiscountCode.DiscountCodeChangeCartDiscountsAction;
import com.commercetools.models.DiscountCode.DiscountCodeChangeGroupsAction;
import com.commercetools.models.DiscountCode.DiscountCodeChangeIsActiveAction;
import com.commercetools.models.DiscountCode.DiscountCodeSetCartPredicateAction;
import com.commercetools.models.DiscountCode.DiscountCodeSetCustomFieldAction;
import com.commercetools.models.DiscountCode.DiscountCodeSetCustomTypeAction;
import com.commercetools.models.DiscountCode.DiscountCodeSetDescriptionAction;
import com.commercetools.models.DiscountCode.DiscountCodeSetMaxApplicationsAction;
import com.commercetools.models.DiscountCode.DiscountCodeSetMaxApplicationsPerCustomerAction;
import com.commercetools.models.DiscountCode.DiscountCodeSetNameAction;
import com.commercetools.models.DiscountCode.DiscountCodeSetValidFromAction;
import com.commercetools.models.DiscountCode.DiscountCodeSetValidFromAndUntilAction;
import com.commercetools.models.DiscountCode.DiscountCodeSetValidUntilAction;
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
   @JsonSubTypes.Type(value = com.commercetools.models.DiscountCode.DiscountCodeChangeCartDiscountsActionImpl.class, name = "changeCartDiscounts"),
   @JsonSubTypes.Type(value = com.commercetools.models.DiscountCode.DiscountCodeChangeGroupsActionImpl.class, name = "changeGroups"),
   @JsonSubTypes.Type(value = com.commercetools.models.DiscountCode.DiscountCodeChangeIsActiveActionImpl.class, name = "changeIsActive"),
   @JsonSubTypes.Type(value = com.commercetools.models.DiscountCode.DiscountCodeSetCartPredicateActionImpl.class, name = "setCartPredicate"),
   @JsonSubTypes.Type(value = com.commercetools.models.DiscountCode.DiscountCodeSetCustomFieldActionImpl.class, name = "setCustomField"),
   @JsonSubTypes.Type(value = com.commercetools.models.DiscountCode.DiscountCodeSetCustomTypeActionImpl.class, name = "setCustomType"),
   @JsonSubTypes.Type(value = com.commercetools.models.DiscountCode.DiscountCodeSetDescriptionActionImpl.class, name = "setDescription"),
   @JsonSubTypes.Type(value = com.commercetools.models.DiscountCode.DiscountCodeSetMaxApplicationsActionImpl.class, name = "setMaxApplications"),
   @JsonSubTypes.Type(value = com.commercetools.models.DiscountCode.DiscountCodeSetMaxApplicationsPerCustomerActionImpl.class, name = "setMaxApplicationsPerCustomer"),
   @JsonSubTypes.Type(value = com.commercetools.models.DiscountCode.DiscountCodeSetNameActionImpl.class, name = "setName"),
   @JsonSubTypes.Type(value = com.commercetools.models.DiscountCode.DiscountCodeSetValidFromActionImpl.class, name = "setValidFrom"),
   @JsonSubTypes.Type(value = com.commercetools.models.DiscountCode.DiscountCodeSetValidFromAndUntilActionImpl.class, name = "setValidFromAndUntil"),
   @JsonSubTypes.Type(value = com.commercetools.models.DiscountCode.DiscountCodeSetValidUntilActionImpl.class, name = "setValidUntil")
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
public interface DiscountCodeUpdateAction  {


   


}