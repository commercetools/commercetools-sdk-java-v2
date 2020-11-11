package com.commercetools.api.models.discount_code;

import com.commercetools.api.models.discount_code.DiscountCodeChangeCartDiscountsAction;
import com.commercetools.api.models.discount_code.DiscountCodeChangeGroupsAction;
import com.commercetools.api.models.discount_code.DiscountCodeChangeIsActiveAction;
import com.commercetools.api.models.discount_code.DiscountCodeSetCartPredicateAction;
import com.commercetools.api.models.discount_code.DiscountCodeSetCustomFieldAction;
import com.commercetools.api.models.discount_code.DiscountCodeSetCustomTypeAction;
import com.commercetools.api.models.discount_code.DiscountCodeSetDescriptionAction;
import com.commercetools.api.models.discount_code.DiscountCodeSetMaxApplicationsAction;
import com.commercetools.api.models.discount_code.DiscountCodeSetMaxApplicationsPerCustomerAction;
import com.commercetools.api.models.discount_code.DiscountCodeSetNameAction;
import com.commercetools.api.models.discount_code.DiscountCodeSetValidFromAction;
import com.commercetools.api.models.discount_code.DiscountCodeSetValidFromAndUntilAction;
import com.commercetools.api.models.discount_code.DiscountCodeSetValidUntilAction;


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
   @JsonSubTypes.Type(value = com.commercetools.api.models.discount_code.DiscountCodeChangeCartDiscountsActionImpl.class, name = "changeCartDiscounts"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.discount_code.DiscountCodeChangeGroupsActionImpl.class, name = "changeGroups"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.discount_code.DiscountCodeChangeIsActiveActionImpl.class, name = "changeIsActive"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.discount_code.DiscountCodeSetCartPredicateActionImpl.class, name = "setCartPredicate"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.discount_code.DiscountCodeSetCustomFieldActionImpl.class, name = "setCustomField"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.discount_code.DiscountCodeSetCustomTypeActionImpl.class, name = "setCustomType"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.discount_code.DiscountCodeSetDescriptionActionImpl.class, name = "setDescription"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.discount_code.DiscountCodeSetMaxApplicationsActionImpl.class, name = "setMaxApplications"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.discount_code.DiscountCodeSetMaxApplicationsPerCustomerActionImpl.class, name = "setMaxApplicationsPerCustomer"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.discount_code.DiscountCodeSetNameActionImpl.class, name = "setName"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.discount_code.DiscountCodeSetValidFromActionImpl.class, name = "setValidFrom"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.discount_code.DiscountCodeSetValidFromAndUntilActionImpl.class, name = "setValidFromAndUntil"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.discount_code.DiscountCodeSetValidUntilActionImpl.class, name = "setValidUntil")
})
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.EXISTING_PROPERTY,
    property = "action",
    defaultImpl = DiscountCodeUpdateActionImpl.class,
    visible = true
)
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public interface DiscountCodeUpdateAction  {

    
    @NotNull
    @JsonProperty("action")
    public String getAction();




    default <T> T withDiscountCodeUpdateAction(Function<DiscountCodeUpdateAction, T> helper) {
        return helper.apply(this);
    }
}
