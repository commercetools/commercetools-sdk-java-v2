
package com.commercetools.api.models.me;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = MyPaymentSetMethodInfoMethodActionImpl.class)
public interface MyPaymentSetMethodInfoMethodAction extends MyPaymentUpdateAction {

    String SET_METHOD_INFO_METHOD = "setMethodInfoMethod";

    @JsonProperty("method")
    public String getMethod();

    public void setMethod(final String method);

    public static MyPaymentSetMethodInfoMethodAction of() {
        return new MyPaymentSetMethodInfoMethodActionImpl();
    }

    public static MyPaymentSetMethodInfoMethodAction of(final MyPaymentSetMethodInfoMethodAction template) {
        MyPaymentSetMethodInfoMethodActionImpl instance = new MyPaymentSetMethodInfoMethodActionImpl();
        instance.setMethod(template.getMethod());
        return instance;
    }

    public static MyPaymentSetMethodInfoMethodActionBuilder builder() {
        return MyPaymentSetMethodInfoMethodActionBuilder.of();
    }

    public static MyPaymentSetMethodInfoMethodActionBuilder builder(final MyPaymentSetMethodInfoMethodAction template) {
        return MyPaymentSetMethodInfoMethodActionBuilder.of(template);
    }

    default <T> T withMyPaymentSetMethodInfoMethodAction(Function<MyPaymentSetMethodInfoMethodAction, T> helper) {
        return helper.apply(this);
    }
}
