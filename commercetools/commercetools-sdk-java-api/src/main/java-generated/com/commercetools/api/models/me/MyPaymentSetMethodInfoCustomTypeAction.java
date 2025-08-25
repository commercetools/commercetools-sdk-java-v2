
package com.commercetools.api.models.me;

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
 *  <p>Adding or updating a Custom Type on a PaymentMethodInfo generates the <a href="https://docs.commercetools.com/apis/ctp:api:type:PaymentMethodInfoCustomTypeSetMessage" rel="nofollow">PaymentMethodInfoCustomTypeSet</a> Message, removing one generates the <a href="https://docs.commercetools.com/apis/ctp:api:type:PaymentMethodInfoCustomTypeRemovedMessage" rel="nofollow">PaymentMethodInfoCustomTypeRemoved</a> Message.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MyPaymentSetMethodInfoCustomTypeAction myPaymentSetMethodInfoCustomTypeAction = MyPaymentSetMethodInfoCustomTypeAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("setMethodInfoCustomType")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = MyPaymentSetMethodInfoCustomTypeActionImpl.class)
public interface MyPaymentSetMethodInfoCustomTypeAction extends MyPaymentUpdateAction {

    /**
     * discriminator value for MyPaymentSetMethodInfoCustomTypeAction
     */
    String SET_METHOD_INFO_CUSTOM_TYPE = "setMethodInfoCustomType";

    /**
     *  <p>Defines the <a href="https://docs.commercetools.com/apis/ctp:api:type:Type" rel="nofollow">Type</a> that extends the <code>paymentMethodInfo</code> with <span>Custom Fields</span>.</p>
     * @return type
     */
    @Valid
    @JsonProperty("type")
    public TypeResourceIdentifier getType();

    /**
     *  <p>Sets the <span>Custom Fields</span> fields for the <code>paymentMethodInfo</code>.</p>
     * @return fields
     */
    @Valid
    @JsonProperty("fields")
    public FieldContainer getFields();

    /**
     *  <p>Defines the <a href="https://docs.commercetools.com/apis/ctp:api:type:Type" rel="nofollow">Type</a> that extends the <code>paymentMethodInfo</code> with <span>Custom Fields</span>.</p>
     * @param type value to be set
     */

    public void setType(final TypeResourceIdentifier type);

    /**
     *  <p>Sets the <span>Custom Fields</span> fields for the <code>paymentMethodInfo</code>.</p>
     * @param fields value to be set
     */

    public void setFields(final FieldContainer fields);

    /**
     * factory method
     * @return instance of MyPaymentSetMethodInfoCustomTypeAction
     */
    public static MyPaymentSetMethodInfoCustomTypeAction of() {
        return new MyPaymentSetMethodInfoCustomTypeActionImpl();
    }

    /**
     * factory method to create a shallow copy MyPaymentSetMethodInfoCustomTypeAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static MyPaymentSetMethodInfoCustomTypeAction of(final MyPaymentSetMethodInfoCustomTypeAction template) {
        MyPaymentSetMethodInfoCustomTypeActionImpl instance = new MyPaymentSetMethodInfoCustomTypeActionImpl();
        instance.setType(template.getType());
        instance.setFields(template.getFields());
        return instance;
    }

    public MyPaymentSetMethodInfoCustomTypeAction copyDeep();

    /**
     * factory method to create a deep copy of MyPaymentSetMethodInfoCustomTypeAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static MyPaymentSetMethodInfoCustomTypeAction deepCopy(
            @Nullable final MyPaymentSetMethodInfoCustomTypeAction template) {
        if (template == null) {
            return null;
        }
        MyPaymentSetMethodInfoCustomTypeActionImpl instance = new MyPaymentSetMethodInfoCustomTypeActionImpl();
        instance.setType(com.commercetools.api.models.type.TypeResourceIdentifier.deepCopy(template.getType()));
        instance.setFields(com.commercetools.api.models.type.FieldContainer.deepCopy(template.getFields()));
        return instance;
    }

    /**
     * builder factory method for MyPaymentSetMethodInfoCustomTypeAction
     * @return builder
     */
    public static MyPaymentSetMethodInfoCustomTypeActionBuilder builder() {
        return MyPaymentSetMethodInfoCustomTypeActionBuilder.of();
    }

    /**
     * create builder for MyPaymentSetMethodInfoCustomTypeAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static MyPaymentSetMethodInfoCustomTypeActionBuilder builder(
            final MyPaymentSetMethodInfoCustomTypeAction template) {
        return MyPaymentSetMethodInfoCustomTypeActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withMyPaymentSetMethodInfoCustomTypeAction(
            Function<MyPaymentSetMethodInfoCustomTypeAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<MyPaymentSetMethodInfoCustomTypeAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<MyPaymentSetMethodInfoCustomTypeAction>() {
            @Override
            public String toString() {
                return "TypeReference<MyPaymentSetMethodInfoCustomTypeAction>";
            }
        };
    }
}
