
package com.commercetools.api.models.cart;

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
 * CartSetBillingAddressCustomTypeAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartSetBillingAddressCustomTypeAction cartSetBillingAddressCustomTypeAction = CartSetBillingAddressCustomTypeAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("setBillingAddressCustomType")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CartSetBillingAddressCustomTypeActionImpl.class)
public interface CartSetBillingAddressCustomTypeAction extends CartUpdateAction {

    /**
     * discriminator value for CartSetBillingAddressCustomTypeAction
     */
    String SET_BILLING_ADDRESS_CUSTOM_TYPE = "setBillingAddressCustomType";

    /**
     *  <p>Defines the <a href="https://docs.commercetools.com/apis/ctp:api:type:Type" rel="nofollow">Type</a> that extends the <code>billingAddress</code> with <span>Custom Fields</span>. If absent, any existing Type and Custom Fields are removed from the <code>billingAddress</code>.</p>
     * @return type
     */
    @Valid
    @JsonProperty("type")
    public TypeResourceIdentifier getType();

    /**
     *  <p>Sets the <span>Custom Fields</span> fields for the <code>billingAddress</code>.</p>
     * @return fields
     */
    @Valid
    @JsonProperty("fields")
    public FieldContainer getFields();

    /**
     *  <p>Defines the <a href="https://docs.commercetools.com/apis/ctp:api:type:Type" rel="nofollow">Type</a> that extends the <code>billingAddress</code> with <span>Custom Fields</span>. If absent, any existing Type and Custom Fields are removed from the <code>billingAddress</code>.</p>
     * @param type value to be set
     */

    public void setType(final TypeResourceIdentifier type);

    /**
     *  <p>Sets the <span>Custom Fields</span> fields for the <code>billingAddress</code>.</p>
     * @param fields value to be set
     */

    public void setFields(final FieldContainer fields);

    /**
     * factory method
     * @return instance of CartSetBillingAddressCustomTypeAction
     */
    public static CartSetBillingAddressCustomTypeAction of() {
        return new CartSetBillingAddressCustomTypeActionImpl();
    }

    /**
     * factory method to create a shallow copy CartSetBillingAddressCustomTypeAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static CartSetBillingAddressCustomTypeAction of(final CartSetBillingAddressCustomTypeAction template) {
        CartSetBillingAddressCustomTypeActionImpl instance = new CartSetBillingAddressCustomTypeActionImpl();
        instance.setType(template.getType());
        instance.setFields(template.getFields());
        return instance;
    }

    public CartSetBillingAddressCustomTypeAction copyDeep();

    /**
     * factory method to create a deep copy of CartSetBillingAddressCustomTypeAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CartSetBillingAddressCustomTypeAction deepCopy(
            @Nullable final CartSetBillingAddressCustomTypeAction template) {
        if (template == null) {
            return null;
        }
        CartSetBillingAddressCustomTypeActionImpl instance = new CartSetBillingAddressCustomTypeActionImpl();
        instance.setType(com.commercetools.api.models.type.TypeResourceIdentifier.deepCopy(template.getType()));
        instance.setFields(com.commercetools.api.models.type.FieldContainer.deepCopy(template.getFields()));
        return instance;
    }

    /**
     * builder factory method for CartSetBillingAddressCustomTypeAction
     * @return builder
     */
    public static CartSetBillingAddressCustomTypeActionBuilder builder() {
        return CartSetBillingAddressCustomTypeActionBuilder.of();
    }

    /**
     * create builder for CartSetBillingAddressCustomTypeAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CartSetBillingAddressCustomTypeActionBuilder builder(
            final CartSetBillingAddressCustomTypeAction template) {
        return CartSetBillingAddressCustomTypeActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCartSetBillingAddressCustomTypeAction(Function<CartSetBillingAddressCustomTypeAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CartSetBillingAddressCustomTypeAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CartSetBillingAddressCustomTypeAction>() {
            @Override
            public String toString() {
                return "TypeReference<CartSetBillingAddressCustomTypeAction>";
            }
        };
    }
}
