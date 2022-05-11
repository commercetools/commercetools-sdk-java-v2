
package com.commercetools.api.models.me;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;

import com.commercetools.api.models.common.LocalizedString;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = MyPaymentSetMethodInfoNameActionImpl.class)
public interface MyPaymentSetMethodInfoNameAction extends MyPaymentUpdateAction {

    String SET_METHOD_INFO_NAME = "setMethodInfoName";

    /**
    *  <p>JSON object where the keys are of <a href="https://en.wikipedia.org/wiki/IETF_language_tag">IETF language tag</a>, and the values are the corresponding strings used for that language.</p>
    */
    @Valid
    @JsonProperty("name")
    public LocalizedString getName();

    public void setName(final LocalizedString name);

    public static MyPaymentSetMethodInfoNameAction of() {
        return new MyPaymentSetMethodInfoNameActionImpl();
    }

    public static MyPaymentSetMethodInfoNameAction of(final MyPaymentSetMethodInfoNameAction template) {
        MyPaymentSetMethodInfoNameActionImpl instance = new MyPaymentSetMethodInfoNameActionImpl();
        instance.setName(template.getName());
        return instance;
    }

    public static MyPaymentSetMethodInfoNameActionBuilder builder() {
        return MyPaymentSetMethodInfoNameActionBuilder.of();
    }

    public static MyPaymentSetMethodInfoNameActionBuilder builder(final MyPaymentSetMethodInfoNameAction template) {
        return MyPaymentSetMethodInfoNameActionBuilder.of(template);
    }

    default <T> T withMyPaymentSetMethodInfoNameAction(Function<MyPaymentSetMethodInfoNameAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<MyPaymentSetMethodInfoNameAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<MyPaymentSetMethodInfoNameAction>() {
            @Override
            public String toString() {
                return "TypeReference<MyPaymentSetMethodInfoNameAction>";
            }
        };
    }
}
