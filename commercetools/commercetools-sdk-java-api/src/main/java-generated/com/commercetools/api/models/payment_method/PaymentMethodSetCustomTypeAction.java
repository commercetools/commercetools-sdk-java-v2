
package com.commercetools.api.models.payment_method;

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
 *  <p>Adding or updating a Custom Type on a PaymentMethod generates the PaymentMethodCustomTypeSet Message, removing one generates the PaymentMethodCustomTypeRemoved Message.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     PaymentMethodSetCustomTypeAction paymentMethodSetCustomTypeAction = PaymentMethodSetCustomTypeAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("setCustomType")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = PaymentMethodSetCustomTypeActionImpl.class)
public interface PaymentMethodSetCustomTypeAction extends PaymentMethodUpdateAction {

    /**
     * discriminator value for PaymentMethodSetCustomTypeAction
     */
    String SET_CUSTOM_TYPE = "setCustomType";

    /**
     *  <p>Defines the Type that extends the PaymentMethod with Custom Fields. If absent, any existing Type and Custom Fields are removed from the PaymentMethod.</p>
     * @return type
     */
    @Valid
    @JsonProperty("type")
    public TypeResourceIdentifier getType();

    /**
     *  <p>Sets the Custom Fields fields for the PaymentMethod.</p>
     * @return fields
     */
    @Valid
    @JsonProperty("fields")
    public FieldContainer getFields();

    /**
     *  <p>Defines the Type that extends the PaymentMethod with Custom Fields. If absent, any existing Type and Custom Fields are removed from the PaymentMethod.</p>
     * @param type value to be set
     */

    public void setType(final TypeResourceIdentifier type);

    /**
     *  <p>Sets the Custom Fields fields for the PaymentMethod.</p>
     * @param fields value to be set
     */

    public void setFields(final FieldContainer fields);

    /**
     * factory method
     * @return instance of PaymentMethodSetCustomTypeAction
     */
    public static PaymentMethodSetCustomTypeAction of() {
        return new PaymentMethodSetCustomTypeActionImpl();
    }

    /**
     * factory method to create a shallow copy PaymentMethodSetCustomTypeAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static PaymentMethodSetCustomTypeAction of(final PaymentMethodSetCustomTypeAction template) {
        PaymentMethodSetCustomTypeActionImpl instance = new PaymentMethodSetCustomTypeActionImpl();
        instance.setType(template.getType());
        instance.setFields(template.getFields());
        return instance;
    }

    public PaymentMethodSetCustomTypeAction copyDeep();

    /**
     * factory method to create a deep copy of PaymentMethodSetCustomTypeAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static PaymentMethodSetCustomTypeAction deepCopy(@Nullable final PaymentMethodSetCustomTypeAction template) {
        if (template == null) {
            return null;
        }
        PaymentMethodSetCustomTypeActionImpl instance = new PaymentMethodSetCustomTypeActionImpl();
        instance.setType(com.commercetools.api.models.type.TypeResourceIdentifier.deepCopy(template.getType()));
        instance.setFields(com.commercetools.api.models.type.FieldContainer.deepCopy(template.getFields()));
        return instance;
    }

    /**
     * builder factory method for PaymentMethodSetCustomTypeAction
     * @return builder
     */
    public static PaymentMethodSetCustomTypeActionBuilder builder() {
        return PaymentMethodSetCustomTypeActionBuilder.of();
    }

    /**
     * create builder for PaymentMethodSetCustomTypeAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static PaymentMethodSetCustomTypeActionBuilder builder(final PaymentMethodSetCustomTypeAction template) {
        return PaymentMethodSetCustomTypeActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withPaymentMethodSetCustomTypeAction(Function<PaymentMethodSetCustomTypeAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<PaymentMethodSetCustomTypeAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<PaymentMethodSetCustomTypeAction>() {
            @Override
            public String toString() {
                return "TypeReference<PaymentMethodSetCustomTypeAction>";
            }
        };
    }
}
