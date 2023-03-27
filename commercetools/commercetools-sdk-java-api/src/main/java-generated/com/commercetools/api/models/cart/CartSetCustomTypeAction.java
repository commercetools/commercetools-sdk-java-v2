
package com.commercetools.api.models.cart;

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
 * CartSetCustomTypeAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartSetCustomTypeAction cartSetCustomTypeAction = CartSetCustomTypeAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CartSetCustomTypeActionImpl.class)
public interface CartSetCustomTypeAction extends CartUpdateAction {

    /**
     * discriminator value for CartSetCustomTypeAction
     */
    String SET_CUSTOM_TYPE = "setCustomType";

    /**
     *  <p>Defines the Type that extends the Cart with Custom Fields. If absent, any existing Type and Custom Fields are removed from the Cart.</p>
     * @return type
     */
    @Valid
    @JsonProperty("type")
    public TypeResourceIdentifier getType();

    /**
     *  <p>Sets the Custom Fields fields for the Cart.</p>
     * @return fields
     */
    @Valid
    @JsonProperty("fields")
    public FieldContainer getFields();

    /**
     *  <p>Defines the Type that extends the Cart with Custom Fields. If absent, any existing Type and Custom Fields are removed from the Cart.</p>
     * @param type value to be set
     */

    public void setType(final TypeResourceIdentifier type);

    /**
     *  <p>Sets the Custom Fields fields for the Cart.</p>
     * @param fields value to be set
     */

    public void setFields(final FieldContainer fields);

    /**
     * factory method
     * @return instance of CartSetCustomTypeAction
     */
    public static CartSetCustomTypeAction of() {
        return new CartSetCustomTypeActionImpl();
    }

    /**
     * factory method to copy an instance of CartSetCustomTypeAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static CartSetCustomTypeAction of(final CartSetCustomTypeAction template) {
        CartSetCustomTypeActionImpl instance = new CartSetCustomTypeActionImpl();
        instance.setType(template.getType());
        instance.setFields(template.getFields());
        return instance;
    }

    /**
     * builder factory method for CartSetCustomTypeAction
     * @return builder
     */
    public static CartSetCustomTypeActionBuilder builder() {
        return CartSetCustomTypeActionBuilder.of();
    }

    /**
     * create builder for CartSetCustomTypeAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CartSetCustomTypeActionBuilder builder(final CartSetCustomTypeAction template) {
        return CartSetCustomTypeActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCartSetCustomTypeAction(Function<CartSetCustomTypeAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CartSetCustomTypeAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CartSetCustomTypeAction>() {
            @Override
            public String toString() {
                return "TypeReference<CartSetCustomTypeAction>";
            }
        };
    }
}
