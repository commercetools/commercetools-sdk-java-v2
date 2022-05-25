
package com.commercetools.api.models.payment;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;

import com.commercetools.api.models.type.FieldContainer;
import com.commercetools.api.models.type.TypeResourceIdentifier;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * PaymentSetCustomTypeAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     PaymentSetCustomTypeAction paymentSetCustomTypeAction = PaymentSetCustomTypeAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = PaymentSetCustomTypeActionImpl.class)
public interface PaymentSetCustomTypeAction extends PaymentUpdateAction {

    String SET_CUSTOM_TYPE = "setCustomType";

    /**
     *  <p>Defines the Type that extends the Payment with Custom Fields. If absent, any existing Type and Custom Fields are removed from the Payment.</p>
     */
    @Valid
    @JsonProperty("type")
    public TypeResourceIdentifier getType();

    /**
     *  <p>Sets the Custom Fields fields for the Payment.</p>
     */
    @Valid
    @JsonProperty("fields")
    public FieldContainer getFields();

    public void setType(final TypeResourceIdentifier type);

    public void setFields(final FieldContainer fields);

    public static PaymentSetCustomTypeAction of() {
        return new PaymentSetCustomTypeActionImpl();
    }

    public static PaymentSetCustomTypeAction of(final PaymentSetCustomTypeAction template) {
        PaymentSetCustomTypeActionImpl instance = new PaymentSetCustomTypeActionImpl();
        instance.setType(template.getType());
        instance.setFields(template.getFields());
        return instance;
    }

    public static PaymentSetCustomTypeActionBuilder builder() {
        return PaymentSetCustomTypeActionBuilder.of();
    }

    public static PaymentSetCustomTypeActionBuilder builder(final PaymentSetCustomTypeAction template) {
        return PaymentSetCustomTypeActionBuilder.of(template);
    }

    default <T> T withPaymentSetCustomTypeAction(Function<PaymentSetCustomTypeAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<PaymentSetCustomTypeAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<PaymentSetCustomTypeAction>() {
            @Override
            public String toString() {
                return "TypeReference<PaymentSetCustomTypeAction>";
            }
        };
    }
}
