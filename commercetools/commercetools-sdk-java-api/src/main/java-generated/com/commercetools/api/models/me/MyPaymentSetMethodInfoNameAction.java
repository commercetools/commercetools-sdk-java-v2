
package com.commercetools.api.models.me;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;

import com.commercetools.api.models.common.LocalizedString;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * MyPaymentSetMethodInfoNameAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MyPaymentSetMethodInfoNameAction myPaymentSetMethodInfoNameAction = MyPaymentSetMethodInfoNameAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = MyPaymentSetMethodInfoNameActionImpl.class)
public interface MyPaymentSetMethodInfoNameAction extends MyPaymentUpdateAction {

    String SET_METHOD_INFO_NAME = "setMethodInfoName";

    /**
     *  <p>JSON object where the keys are of type Locale, and the values are the strings used for the corresponding language.</p>
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
