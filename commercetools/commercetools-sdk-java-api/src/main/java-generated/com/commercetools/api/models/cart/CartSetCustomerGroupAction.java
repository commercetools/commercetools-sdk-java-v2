package com.commercetools.api.models.cart;

import com.commercetools.api.models.cart.CartUpdateAction;
import com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifier;
import com.commercetools.api.models.cart.CartSetCustomerGroupActionImpl;

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

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = CartSetCustomerGroupActionImpl.class)
public interface CartSetCustomerGroupAction extends CartUpdateAction {

    
    @Valid
    @JsonProperty("customerGroup")
    public CustomerGroupResourceIdentifier getCustomerGroup();

    public void setCustomerGroup(final CustomerGroupResourceIdentifier customerGroup);

    public static CartSetCustomerGroupActionImpl of(){
        return new CartSetCustomerGroupActionImpl();
    }
    

    public static CartSetCustomerGroupActionImpl of(final CartSetCustomerGroupAction template) {
        CartSetCustomerGroupActionImpl instance = new CartSetCustomerGroupActionImpl();
        instance.setCustomerGroup(template.getCustomerGroup());
        return instance;
    }

    default <T> T withCartSetCustomerGroupAction(Function<CartSetCustomerGroupAction, T> helper) {
        return helper.apply(this);
    }
}
