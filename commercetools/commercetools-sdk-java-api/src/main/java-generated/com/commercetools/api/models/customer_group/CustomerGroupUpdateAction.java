
package com.commercetools.api.models.customer_group;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@JsonSubTypes({
        @JsonSubTypes.Type(value = com.commercetools.api.models.customer_group.CustomerGroupChangeNameActionImpl.class, name = CustomerGroupChangeNameAction.CHANGE_NAME),
        @JsonSubTypes.Type(value = com.commercetools.api.models.customer_group.CustomerGroupSetCustomFieldActionImpl.class, name = CustomerGroupSetCustomFieldAction.SET_CUSTOM_FIELD),
        @JsonSubTypes.Type(value = com.commercetools.api.models.customer_group.CustomerGroupSetCustomTypeActionImpl.class, name = CustomerGroupSetCustomTypeAction.SET_CUSTOM_TYPE),
        @JsonSubTypes.Type(value = com.commercetools.api.models.customer_group.CustomerGroupSetKeyActionImpl.class, name = CustomerGroupSetKeyAction.SET_KEY) })
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "action", defaultImpl = CustomerGroupUpdateActionImpl.class, visible = true)
@JsonDeserialize(as = CustomerGroupUpdateActionImpl.class)
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public interface CustomerGroupUpdateAction
        extends com.commercetools.api.models.ResourceUpdateAction<CustomerGroupUpdateAction> {

    @NotNull
    @JsonProperty("action")
    public String getAction();

    default <T> T withCustomerGroupUpdateAction(Function<CustomerGroupUpdateAction, T> helper) {
        return helper.apply(this);
    }
}
