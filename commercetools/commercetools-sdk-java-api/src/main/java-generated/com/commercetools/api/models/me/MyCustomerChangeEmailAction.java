package com.commercetools.api.models.me;

import com.commercetools.api.models.me.MyCustomerUpdateAction;
import com.commercetools.api.models.me.MyCustomerChangeEmailActionImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;
import java.util.function.Function;
import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = MyCustomerChangeEmailActionImpl.class)
public interface MyCustomerChangeEmailAction extends MyCustomerUpdateAction {

    
    @NotNull
    @JsonProperty("email")
    public String getEmail();

    public void setEmail(final String email);

    public static MyCustomerChangeEmailActionImpl of(){
        return new MyCustomerChangeEmailActionImpl();
    }
    

    public static MyCustomerChangeEmailActionImpl of(final MyCustomerChangeEmailAction template) {
        MyCustomerChangeEmailActionImpl instance = new MyCustomerChangeEmailActionImpl();
        instance.setEmail(template.getEmail());
        return instance;
    }

    default <T extends Accessor<MyCustomerChangeEmailAction>> T withMyCustomerChangeEmailAction(Function<MyCustomerChangeEmailAction, T> helper) {
        return helper.apply(this);
    }
}
