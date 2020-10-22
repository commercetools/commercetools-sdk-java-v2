package com.commercetools.api.models.me;

import com.commercetools.api.models.me.MyCustomerUpdateAction;
import com.commercetools.api.models.me.MyCustomerSetVatIdActionImpl;

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
@JsonDeserialize(as = MyCustomerSetVatIdActionImpl.class)
public interface MyCustomerSetVatIdAction extends MyCustomerUpdateAction {

    
    
    @JsonProperty("vatId")
    public String getVatId();

    public void setVatId(final String vatId);

    public static MyCustomerSetVatIdActionImpl of(){
        return new MyCustomerSetVatIdActionImpl();
    }
    

    public static MyCustomerSetVatIdActionImpl of(final MyCustomerSetVatIdAction template) {
        MyCustomerSetVatIdActionImpl instance = new MyCustomerSetVatIdActionImpl();
        instance.setVatId(template.getVatId());
        return instance;
    }

    default <T extends Accessor<MyCustomerSetVatIdAction>> T withMyCustomerSetVatIdAction(Function<MyCustomerSetVatIdAction, T> helper) {
        return helper.apply(this);
    }
}
