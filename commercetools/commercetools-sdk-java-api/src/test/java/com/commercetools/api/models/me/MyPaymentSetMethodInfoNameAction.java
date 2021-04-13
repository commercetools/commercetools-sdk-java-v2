package com.commercetools.api.models.me;

import com.commercetools.api.models.common.LocalizedString;
import com.commercetools.api.models.me.MyPaymentUpdateAction;
import com.commercetools.api.models.me.MyPaymentSetMethodInfoNameActionImpl;

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
@JsonDeserialize(as = MyPaymentSetMethodInfoNameActionImpl.class)
public interface MyPaymentSetMethodInfoNameAction extends MyPaymentUpdateAction {

    String SET_METHOD_INFO_NAME = "setMethodInfoName";

    
    @Valid
    @JsonProperty("name")
    public LocalizedString getName();

    
    public void setName(final LocalizedString name);
    

    public static MyPaymentSetMethodInfoNameAction of(){
        return new MyPaymentSetMethodInfoNameActionImpl();
    }
    

    public static MyPaymentSetMethodInfoNameAction of(final MyPaymentSetMethodInfoNameAction template) {
        MyPaymentSetMethodInfoNameActionImpl instance = new MyPaymentSetMethodInfoNameActionImpl();
        instance.setName(template.getName());
        return instance;
    }

    public static MyPaymentSetMethodInfoNameActionBuilder builder(){
        return MyPaymentSetMethodInfoNameActionBuilder.of();
    }
    
    public static MyPaymentSetMethodInfoNameActionBuilder builder(final MyPaymentSetMethodInfoNameAction template){
        return MyPaymentSetMethodInfoNameActionBuilder.of(template);
    }
    

    default <T> T withMyPaymentSetMethodInfoNameAction(Function<MyPaymentSetMethodInfoNameAction, T> helper) {
        return helper.apply(this);
    }
}
