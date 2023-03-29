
package com.commercetools.api.models.order;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.Valid;

import com.commercetools.api.models.type.FieldContainer;
import com.commercetools.api.models.type.TypeResourceIdentifier;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * OrderSetBillingAddressCustomTypeAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderSetBillingAddressCustomTypeAction orderSetBillingAddressCustomTypeAction = OrderSetBillingAddressCustomTypeAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = OrderSetBillingAddressCustomTypeActionImpl.class)
public interface OrderSetBillingAddressCustomTypeAction extends OrderUpdateAction {

    /**
     * discriminator value for OrderSetBillingAddressCustomTypeAction
     */
    String SET_BILLING_ADDRESS_CUSTOM_TYPE = "setBillingAddressCustomType";

    /**
     *  <p>Defines the Type that extends the <code>billingAddress</code> with Custom Fields. If absent, any existing Type and Custom Fields are removed from the <code>billingAddress</code>.</p>
     * @return type
     */
    @Valid
    @JsonProperty("type")
    public TypeResourceIdentifier getType();

    /**
     *  <p>Sets the Custom Fields fields for the <code>billingAddress</code>.</p>
     * @return fields
     */
    @Valid
    @JsonProperty("fields")
    public FieldContainer getFields();

    /**
     *  <p>Defines the Type that extends the <code>billingAddress</code> with Custom Fields. If absent, any existing Type and Custom Fields are removed from the <code>billingAddress</code>.</p>
     * @param type value to be set
     */

    public void setType(final TypeResourceIdentifier type);

    /**
     *  <p>Sets the Custom Fields fields for the <code>billingAddress</code>.</p>
     * @param fields value to be set
     */

    public void setFields(final FieldContainer fields);

    /**
     * factory method
     * @return instance of OrderSetBillingAddressCustomTypeAction
     */
    public static OrderSetBillingAddressCustomTypeAction of() {
        return new OrderSetBillingAddressCustomTypeActionImpl();
    }

    /**
     * factory method to create a shallow copy OrderSetBillingAddressCustomTypeAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static OrderSetBillingAddressCustomTypeAction of(final OrderSetBillingAddressCustomTypeAction template) {
        OrderSetBillingAddressCustomTypeActionImpl instance = new OrderSetBillingAddressCustomTypeActionImpl();
        instance.setType(template.getType());
        instance.setFields(template.getFields());
        return instance;
    }

    /**
     * factory method to create a deep copy of OrderSetBillingAddressCustomTypeAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static OrderSetBillingAddressCustomTypeAction deepCopy(
            @Nullable final OrderSetBillingAddressCustomTypeAction template) {
        if (template == null) {
            return null;
        }
        OrderSetBillingAddressCustomTypeActionImpl instance = new OrderSetBillingAddressCustomTypeActionImpl();
        instance.setType(Optional.ofNullable(template.getType())
                .map(com.commercetools.api.models.type.TypeResourceIdentifier::deepCopy)
                .orElse(null));
        instance.setFields(Optional.ofNullable(template.getFields())
                .map(com.commercetools.api.models.type.FieldContainer::deepCopy)
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for OrderSetBillingAddressCustomTypeAction
     * @return builder
     */
    public static OrderSetBillingAddressCustomTypeActionBuilder builder() {
        return OrderSetBillingAddressCustomTypeActionBuilder.of();
    }

    /**
     * create builder for OrderSetBillingAddressCustomTypeAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderSetBillingAddressCustomTypeActionBuilder builder(
            final OrderSetBillingAddressCustomTypeAction template) {
        return OrderSetBillingAddressCustomTypeActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withOrderSetBillingAddressCustomTypeAction(
            Function<OrderSetBillingAddressCustomTypeAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<OrderSetBillingAddressCustomTypeAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderSetBillingAddressCustomTypeAction>() {
            @Override
            public String toString() {
                return "TypeReference<OrderSetBillingAddressCustomTypeAction>";
            }
        };
    }
}
