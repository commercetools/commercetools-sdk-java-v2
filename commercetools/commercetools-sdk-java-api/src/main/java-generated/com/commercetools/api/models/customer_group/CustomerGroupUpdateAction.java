package com.commercetools.api.models.customer_group;

import com.commercetools.api.models.customer_group.CustomerGroupChangeNameAction;
import com.commercetools.api.models.customer_group.CustomerGroupSetCustomFieldAction;
import com.commercetools.api.models.customer_group.CustomerGroupSetCustomTypeAction;
import com.commercetools.api.models.customer_group.CustomerGroupSetKeyAction;


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
   @JsonSubTypes.Type(value = com.commercetools.api.models.customer_group.CustomerGroupChangeNameActionImpl.class, name = "changeName"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.customer_group.CustomerGroupSetCustomFieldActionImpl.class, name = "setCustomField"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.customer_group.CustomerGroupSetCustomTypeActionImpl.class, name = "setCustomType"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.customer_group.CustomerGroupSetKeyActionImpl.class, name = "setKey")
})
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.EXISTING_PROPERTY,
    property = "action",
    defaultImpl = CustomerGroupUpdateActionImpl.class,
    visible = true
)
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public interface CustomerGroupUpdateAction  {

    
    @NotNull
    @JsonProperty("action")
    public String getAction();




    default <T> T withCustomerGroupUpdateAction(Function<CustomerGroupUpdateAction, T> helper) {
        return helper.apply(this);
    }
}
