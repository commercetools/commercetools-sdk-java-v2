
package com.commercetools.api.models.me;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = MyPaymentSetMethodInfoInterfaceActionImpl.class)
public interface MyPaymentSetMethodInfoInterfaceAction extends MyPaymentUpdateAction {

    String SET_METHOD_INFO_INTERFACE = "setMethodInfoInterface";

    @NotNull
    @JsonProperty("interface")
    public String getInterface();

    public void setInterface(final String _interface);

    public static MyPaymentSetMethodInfoInterfaceAction of() {
        return new MyPaymentSetMethodInfoInterfaceActionImpl();
    }

    public static MyPaymentSetMethodInfoInterfaceAction of(final MyPaymentSetMethodInfoInterfaceAction template) {
        MyPaymentSetMethodInfoInterfaceActionImpl instance = new MyPaymentSetMethodInfoInterfaceActionImpl();
        instance.setInterface(template.getInterface());
        return instance;
    }

    public static MyPaymentSetMethodInfoInterfaceActionBuilder builder() {
        return MyPaymentSetMethodInfoInterfaceActionBuilder.of();
    }

    public static MyPaymentSetMethodInfoInterfaceActionBuilder builder(
            final MyPaymentSetMethodInfoInterfaceAction template) {
        return MyPaymentSetMethodInfoInterfaceActionBuilder.of(template);
    }

    default <T> T withMyPaymentSetMethodInfoInterfaceAction(Function<MyPaymentSetMethodInfoInterfaceAction, T> helper) {
        return helper.apply(this);
    }
}
