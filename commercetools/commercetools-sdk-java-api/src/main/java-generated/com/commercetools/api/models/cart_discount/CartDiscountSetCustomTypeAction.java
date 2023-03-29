
package com.commercetools.api.models.cart_discount;

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
 * CartDiscountSetCustomTypeAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartDiscountSetCustomTypeAction cartDiscountSetCustomTypeAction = CartDiscountSetCustomTypeAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CartDiscountSetCustomTypeActionImpl.class)
public interface CartDiscountSetCustomTypeAction extends CartDiscountUpdateAction {

    /**
     * discriminator value for CartDiscountSetCustomTypeAction
     */
    String SET_CUSTOM_TYPE = "setCustomType";

    /**
     *  <p>Defines the Type that extends the CartDiscount with Custom Fields. If absent, any existing Type and Custom Fields are removed from the CartDiscount.</p>
     * @return type
     */
    @Valid
    @JsonProperty("type")
    public TypeResourceIdentifier getType();

    /**
     *  <p>Sets the Custom Fields fields for the CartDiscount.</p>
     * @return fields
     */
    @Valid
    @JsonProperty("fields")
    public FieldContainer getFields();

    /**
     *  <p>Defines the Type that extends the CartDiscount with Custom Fields. If absent, any existing Type and Custom Fields are removed from the CartDiscount.</p>
     * @param type value to be set
     */

    public void setType(final TypeResourceIdentifier type);

    /**
     *  <p>Sets the Custom Fields fields for the CartDiscount.</p>
     * @param fields value to be set
     */

    public void setFields(final FieldContainer fields);

    /**
     * factory method
     * @return instance of CartDiscountSetCustomTypeAction
     */
    public static CartDiscountSetCustomTypeAction of() {
        return new CartDiscountSetCustomTypeActionImpl();
    }

    /**
     * factory method to create a shallow copy CartDiscountSetCustomTypeAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static CartDiscountSetCustomTypeAction of(final CartDiscountSetCustomTypeAction template) {
        CartDiscountSetCustomTypeActionImpl instance = new CartDiscountSetCustomTypeActionImpl();
        instance.setType(template.getType());
        instance.setFields(template.getFields());
        return instance;
    }

    /**
     * factory method to create a deep copy of CartDiscountSetCustomTypeAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CartDiscountSetCustomTypeAction deepCopy(@Nullable final CartDiscountSetCustomTypeAction template) {
        if (template == null) {
            return null;
        }
        CartDiscountSetCustomTypeActionImpl instance = new CartDiscountSetCustomTypeActionImpl();
        instance.setType(Optional.ofNullable(template.getType())
                .map(com.commercetools.api.models.type.TypeResourceIdentifier::deepCopy)
                .orElse(null));
        instance.setFields(Optional.ofNullable(template.getFields())
                .map(com.commercetools.api.models.type.FieldContainer::deepCopy)
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for CartDiscountSetCustomTypeAction
     * @return builder
     */
    public static CartDiscountSetCustomTypeActionBuilder builder() {
        return CartDiscountSetCustomTypeActionBuilder.of();
    }

    /**
     * create builder for CartDiscountSetCustomTypeAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CartDiscountSetCustomTypeActionBuilder builder(final CartDiscountSetCustomTypeAction template) {
        return CartDiscountSetCustomTypeActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCartDiscountSetCustomTypeAction(Function<CartDiscountSetCustomTypeAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CartDiscountSetCustomTypeAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CartDiscountSetCustomTypeAction>() {
            @Override
            public String toString() {
                return "TypeReference<CartDiscountSetCustomTypeAction>";
            }
        };
    }
}
