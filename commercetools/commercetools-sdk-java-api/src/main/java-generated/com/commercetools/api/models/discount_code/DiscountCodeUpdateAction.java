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
   @JsonSubTypes.Type(value = com.commercetools.api.models.discount_code.DiscountCodeChangeCartDiscountsActionImpl.class, name = DiscountCodeChangeCartDiscountsAction.CHANGE_CART_DISCOUNTS),
   @JsonSubTypes.Type(value = com.commercetools.api.models.discount_code.DiscountCodeChangeGroupsActionImpl.class, name = DiscountCodeChangeGroupsAction.CHANGE_GROUPS),
   @JsonSubTypes.Type(value = com.commercetools.api.models.discount_code.DiscountCodeChangeIsActiveActionImpl.class, name = DiscountCodeChangeIsActiveAction.CHANGE_IS_ACTIVE),
   @JsonSubTypes.Type(value = com.commercetools.api.models.discount_code.DiscountCodeSetCartPredicateActionImpl.class, name = DiscountCodeSetCartPredicateAction.SET_CART_PREDICATE),
   @JsonSubTypes.Type(value = com.commercetools.api.models.discount_code.DiscountCodeSetCustomFieldActionImpl.class, name = DiscountCodeSetCustomFieldAction.SET_CUSTOM_FIELD),
   @JsonSubTypes.Type(value = com.commercetools.api.models.discount_code.DiscountCodeSetCustomTypeActionImpl.class, name = DiscountCodeSetCustomTypeAction.SET_CUSTOM_TYPE),
   @JsonSubTypes.Type(value = com.commercetools.api.models.discount_code.DiscountCodeSetDescriptionActionImpl.class, name = DiscountCodeSetDescriptionAction.SET_DESCRIPTION),
   @JsonSubTypes.Type(value = com.commercetools.api.models.discount_code.DiscountCodeSetMaxApplicationsActionImpl.class, name = DiscountCodeSetMaxApplicationsAction.SET_MAX_APPLICATIONS),
   @JsonSubTypes.Type(value = com.commercetools.api.models.discount_code.DiscountCodeSetMaxApplicationsPerCustomerActionImpl.class, name = DiscountCodeSetMaxApplicationsPerCustomerAction.SET_MAX_APPLICATIONS_PER_CUSTOMER),
   @JsonSubTypes.Type(value = com.commercetools.api.models.discount_code.DiscountCodeSetNameActionImpl.class, name = DiscountCodeSetNameAction.SET_NAME),
   @JsonSubTypes.Type(value = com.commercetools.api.models.discount_code.DiscountCodeSetValidFromActionImpl.class, name = DiscountCodeSetValidFromAction.SET_VALID_FROM),
   @JsonSubTypes.Type(value = com.commercetools.api.models.discount_code.DiscountCodeSetValidFromAndUntilActionImpl.class, name = DiscountCodeSetValidFromAndUntilAction.SET_VALID_FROM_AND_UNTIL),
   @JsonSubTypes.Type(value = com.commercetools.api.models.discount_code.DiscountCodeSetValidUntilActionImpl.class, name = DiscountCodeSetValidUntilAction.SET_VALID_UNTIL)
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
public interface DiscountCodeUpdateAction extends com.commercetools.api.models.ResourceUpdateAction<DiscountCodeUpdateAction> {


    
    @NotNull
    @JsonProperty("action")
    public String getAction();





    default <T> T withDiscountCodeUpdateAction(Function<DiscountCodeUpdateAction, T> helper) {
        return helper.apply(this);
    }
}
