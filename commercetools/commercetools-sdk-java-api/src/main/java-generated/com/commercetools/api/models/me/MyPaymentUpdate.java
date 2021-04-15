package com.commercetools.api.models.me;

import com.commercetools.api.models.me.MyPaymentUpdateAction;
import com.commercetools.api.models.me.MyPaymentUpdateImpl;

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
@JsonDeserialize(as = MyPaymentUpdateImpl.class)
public interface MyPaymentUpdate extends com.commercetools.api.models.ResourceUpdate<MyPaymentUpdate, MyPaymentUpdateAction> {


    
    @NotNull
    @JsonProperty("version")
    public Long getVersion();
    
    @NotNull
    @Valid
    @JsonProperty("actions")
    public List<MyPaymentUpdateAction> getActions();

    
    public void setVersion(final Long version);
    
    
    
    @JsonIgnore
    public void setActions(final MyPaymentUpdateAction ...actions);
    public void setActions(final List<MyPaymentUpdateAction> actions);

    public static MyPaymentUpdate of(){
        return new MyPaymentUpdateImpl();
    }
    

    public static MyPaymentUpdate of(final MyPaymentUpdate template) {
        MyPaymentUpdateImpl instance = new MyPaymentUpdateImpl();
        instance.setVersion(template.getVersion());
        instance.setActions(template.getActions());
        return instance;
    }

    public static MyPaymentUpdateBuilder builder(){
        return MyPaymentUpdateBuilder.of();
    }
    
    public static MyPaymentUpdateBuilder builder(final MyPaymentUpdate template){
        return MyPaymentUpdateBuilder.of(template);
    }
    

    default <T> T withMyPaymentUpdate(Function<MyPaymentUpdate, T> helper) {
        return helper.apply(this);
    }
}
