
package com.commercetools.api.models.payment;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.type.FieldContainer;
import com.commercetools.api.models.type.TypeResourceIdentifier;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;

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
@io.vrap.rmf.base.client.utils.json.SubType("setCustomType")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = PaymentSetCustomTypeActionImpl.class)
public interface PaymentSetCustomTypeAction extends PaymentUpdateAction {

    /**
     * discriminator value for PaymentSetCustomTypeAction
     */
    String SET_CUSTOM_TYPE = "setCustomType";

    /**
     *  <p>Defines the <a href="https://docs.commercetools.com/apis/ctp:api:type:Type" rel="nofollow">Type</a> that extends the Payment with <span>Custom Fields</span>. If absent, any existing Type and Custom Fields are removed from the Payment.</p>
     * @return type
     */
    @Valid
    @JsonProperty("type")
    public TypeResourceIdentifier getType();

    /**
     *  <p>Sets the <span>Custom Fields</span> fields for the Payment.</p>
     * @return fields
     */
    @Valid
    @JsonProperty("fields")
    public FieldContainer getFields();

    /**
     *  <p>Defines the <a href="https://docs.commercetools.com/apis/ctp:api:type:Type" rel="nofollow">Type</a> that extends the Payment with <span>Custom Fields</span>. If absent, any existing Type and Custom Fields are removed from the Payment.</p>
     * @param type value to be set
     */

    public void setType(final TypeResourceIdentifier type);

    /**
     *  <p>Sets the <span>Custom Fields</span> fields for the Payment.</p>
     * @param fields value to be set
     */

    public void setFields(final FieldContainer fields);

    /**
     * factory method
     * @return instance of PaymentSetCustomTypeAction
     */
    public static PaymentSetCustomTypeAction of() {
        return new PaymentSetCustomTypeActionImpl();
    }

    /**
     * factory method to create a shallow copy PaymentSetCustomTypeAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static PaymentSetCustomTypeAction of(final PaymentSetCustomTypeAction template) {
        PaymentSetCustomTypeActionImpl instance = new PaymentSetCustomTypeActionImpl();
        instance.setType(template.getType());
        instance.setFields(template.getFields());
        return instance;
    }

    public PaymentSetCustomTypeAction copyDeep();

    /**
     * factory method to create a deep copy of PaymentSetCustomTypeAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static PaymentSetCustomTypeAction deepCopy(@Nullable final PaymentSetCustomTypeAction template) {
        if (template == null) {
            return null;
        }
        PaymentSetCustomTypeActionImpl instance = new PaymentSetCustomTypeActionImpl();
        instance.setType(com.commercetools.api.models.type.TypeResourceIdentifier.deepCopy(template.getType()));
        instance.setFields(com.commercetools.api.models.type.FieldContainer.deepCopy(template.getFields()));
        return instance;
    }

    /**
     * builder factory method for PaymentSetCustomTypeAction
     * @return builder
     */
    public static PaymentSetCustomTypeActionBuilder builder() {
        return PaymentSetCustomTypeActionBuilder.of();
    }

    /**
     * create builder for PaymentSetCustomTypeAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static PaymentSetCustomTypeActionBuilder builder(final PaymentSetCustomTypeAction template) {
        return PaymentSetCustomTypeActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withPaymentSetCustomTypeAction(Function<PaymentSetCustomTypeAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<PaymentSetCustomTypeAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<PaymentSetCustomTypeAction>() {
            @Override
            public String toString() {
                return "TypeReference<PaymentSetCustomTypeAction>";
            }
        };
    }
}
