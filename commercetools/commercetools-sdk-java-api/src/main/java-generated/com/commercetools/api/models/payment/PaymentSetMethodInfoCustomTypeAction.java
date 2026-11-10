
package com.commercetools.api.models.payment;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.type.FieldContainer;
import com.commercetools.api.models.type.TypeResourceIdentifier;
import com.fasterxml.jackson.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import tools.jackson.databind.annotation.*;

/**
 *  <p>Adding or updating a Custom Type on a PaymentMethodInfo generates the <a href="https://docs.commercetools.com/apis/ctp:api:type:PaymentMethodInfoCustomTypeSetMessage" rel="nofollow">PaymentMethodInfoCustomTypeSet</a> Message, removing one generates the <a href="https://docs.commercetools.com/apis/ctp:api:type:PaymentMethodInfoCustomTypeRemovedMessage" rel="nofollow">PaymentMethodInfoCustomTypeRemoved</a> Message.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     PaymentSetMethodInfoCustomTypeAction paymentSetMethodInfoCustomTypeAction = PaymentSetMethodInfoCustomTypeAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("setMethodInfoCustomType")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = PaymentSetMethodInfoCustomTypeActionImpl.class)
public interface PaymentSetMethodInfoCustomTypeAction extends PaymentUpdateAction {

    /**
     * discriminator value for PaymentSetMethodInfoCustomTypeAction
     */
    String SET_METHOD_INFO_CUSTOM_TYPE = "setMethodInfoCustomType";

    /**
     *  <p>Defines the <a href="https://docs.commercetools.com/apis/ctp:api:type:Type" rel="nofollow">Type</a> that extends the <code>paymentMethodInfo</code> with <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomFields" rel="nofollow">Custom Fields</a>.</p>
     * @return type
     */
    @Valid
    @JsonProperty("type")
    public TypeResourceIdentifier getType();

    /**
     *  <p>Object containing the <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomFields" rel="nofollow">Custom Fields</a> fields for the <code>paymentMethodInfo</code>.</p>
     *  <p>Required if at least one Custom Field is defined as required in the <code>fieldDefinitions</code> of the referenced <a href="https://docs.commercetools.com/apis/ctp:api:type:Type" rel="nofollow">Type</a>.</p>
     * @return fields
     */
    @Valid
    @JsonProperty("fields")
    public FieldContainer getFields();

    /**
     *  <p>Defines the <a href="https://docs.commercetools.com/apis/ctp:api:type:Type" rel="nofollow">Type</a> that extends the <code>paymentMethodInfo</code> with <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomFields" rel="nofollow">Custom Fields</a>.</p>
     * @param type value to be set
     */

    public void setType(final TypeResourceIdentifier type);

    /**
     *  <p>Object containing the <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomFields" rel="nofollow">Custom Fields</a> fields for the <code>paymentMethodInfo</code>.</p>
     *  <p>Required if at least one Custom Field is defined as required in the <code>fieldDefinitions</code> of the referenced <a href="https://docs.commercetools.com/apis/ctp:api:type:Type" rel="nofollow">Type</a>.</p>
     * @param fields value to be set
     */

    public void setFields(final FieldContainer fields);

    /**
     * factory method
     * @return instance of PaymentSetMethodInfoCustomTypeAction
     */
    public static PaymentSetMethodInfoCustomTypeAction of() {
        return new PaymentSetMethodInfoCustomTypeActionImpl();
    }

    /**
     * factory method to create a shallow copy PaymentSetMethodInfoCustomTypeAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static PaymentSetMethodInfoCustomTypeAction of(final PaymentSetMethodInfoCustomTypeAction template) {
        PaymentSetMethodInfoCustomTypeActionImpl instance = new PaymentSetMethodInfoCustomTypeActionImpl();
        instance.setType(template.getType());
        instance.setFields(template.getFields());
        return instance;
    }

    public PaymentSetMethodInfoCustomTypeAction copyDeep();

    /**
     * factory method to create a deep copy of PaymentSetMethodInfoCustomTypeAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static PaymentSetMethodInfoCustomTypeAction deepCopy(
            @Nullable final PaymentSetMethodInfoCustomTypeAction template) {
        if (template == null) {
            return null;
        }
        PaymentSetMethodInfoCustomTypeActionImpl instance = new PaymentSetMethodInfoCustomTypeActionImpl();
        instance.setType(com.commercetools.api.models.type.TypeResourceIdentifier.deepCopy(template.getType()));
        instance.setFields(com.commercetools.api.models.type.FieldContainer.deepCopy(template.getFields()));
        return instance;
    }

    /**
     * builder factory method for PaymentSetMethodInfoCustomTypeAction
     * @return builder
     */
    public static PaymentSetMethodInfoCustomTypeActionBuilder builder() {
        return PaymentSetMethodInfoCustomTypeActionBuilder.of();
    }

    /**
     * create builder for PaymentSetMethodInfoCustomTypeAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static PaymentSetMethodInfoCustomTypeActionBuilder builder(
            final PaymentSetMethodInfoCustomTypeAction template) {
        return PaymentSetMethodInfoCustomTypeActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withPaymentSetMethodInfoCustomTypeAction(Function<PaymentSetMethodInfoCustomTypeAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static tools.jackson.core.type.TypeReference<PaymentSetMethodInfoCustomTypeAction> typeReference() {
        return new tools.jackson.core.type.TypeReference<PaymentSetMethodInfoCustomTypeAction>() {
            @Override
            public String toString() {
                return "TypeReference<PaymentSetMethodInfoCustomTypeAction>";
            }
        };
    }
}
