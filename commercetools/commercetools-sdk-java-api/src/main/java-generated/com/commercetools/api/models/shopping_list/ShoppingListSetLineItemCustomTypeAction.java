
package com.commercetools.api.models.shopping_list;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.type.FieldContainer;
import com.commercetools.api.models.type.TypeResourceIdentifier;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * ShoppingListSetLineItemCustomTypeAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ShoppingListSetLineItemCustomTypeAction shoppingListSetLineItemCustomTypeAction = ShoppingListSetLineItemCustomTypeAction.builder()
 *             .lineItemId("{lineItemId}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ShoppingListSetLineItemCustomTypeActionImpl.class)
public interface ShoppingListSetLineItemCustomTypeAction extends ShoppingListUpdateAction {

    /**
     * discriminator value for ShoppingListSetLineItemCustomTypeAction
     */
    String SET_LINE_ITEM_CUSTOM_TYPE = "setLineItemCustomType";

    /**
     *  <p>The <code>id</code> of the ShoppingListLineItem to update.</p>
     * @return lineItemId
     */
    @NotNull
    @JsonProperty("lineItemId")
    public String getLineItemId();

    /**
     *  <p>Defines the Type that extends the ShoppingListLineItem with Custom Fields. If absent, any existing Type and Custom Fields are removed from the ShoppingListLineItem.</p>
     * @return type
     */
    @Valid
    @JsonProperty("type")
    public TypeResourceIdentifier getType();

    /**
     *  <p>Sets the Custom Fields fields for the ShoppingListLineItem.</p>
     * @return fields
     */
    @Valid
    @JsonProperty("fields")
    public FieldContainer getFields();

    /**
     *  <p>The <code>id</code> of the ShoppingListLineItem to update.</p>
     * @param lineItemId value to be set
     */

    public void setLineItemId(final String lineItemId);

    /**
     *  <p>Defines the Type that extends the ShoppingListLineItem with Custom Fields. If absent, any existing Type and Custom Fields are removed from the ShoppingListLineItem.</p>
     * @param type value to be set
     */

    public void setType(final TypeResourceIdentifier type);

    /**
     *  <p>Sets the Custom Fields fields for the ShoppingListLineItem.</p>
     * @param fields value to be set
     */

    public void setFields(final FieldContainer fields);

    /**
     * factory method
     * @return instance of ShoppingListSetLineItemCustomTypeAction
     */
    public static ShoppingListSetLineItemCustomTypeAction of() {
        return new ShoppingListSetLineItemCustomTypeActionImpl();
    }

    /**
     * factory method to create a shallow copy ShoppingListSetLineItemCustomTypeAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static ShoppingListSetLineItemCustomTypeAction of(final ShoppingListSetLineItemCustomTypeAction template) {
        ShoppingListSetLineItemCustomTypeActionImpl instance = new ShoppingListSetLineItemCustomTypeActionImpl();
        instance.setLineItemId(template.getLineItemId());
        instance.setType(template.getType());
        instance.setFields(template.getFields());
        return instance;
    }

    /**
     * factory method to create a deep copy of ShoppingListSetLineItemCustomTypeAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ShoppingListSetLineItemCustomTypeAction deepCopy(
            @Nullable final ShoppingListSetLineItemCustomTypeAction template) {
        if (template == null) {
            return null;
        }
        ShoppingListSetLineItemCustomTypeActionImpl instance = new ShoppingListSetLineItemCustomTypeActionImpl();
        instance.setLineItemId(template.getLineItemId());
        instance.setType(Optional.ofNullable(template.getType())
                .map(com.commercetools.api.models.type.TypeResourceIdentifier::deepCopy)
                .orElse(null));
        instance.setFields(Optional.ofNullable(template.getFields())
                .map(com.commercetools.api.models.type.FieldContainer::deepCopy)
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for ShoppingListSetLineItemCustomTypeAction
     * @return builder
     */
    public static ShoppingListSetLineItemCustomTypeActionBuilder builder() {
        return ShoppingListSetLineItemCustomTypeActionBuilder.of();
    }

    /**
     * create builder for ShoppingListSetLineItemCustomTypeAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ShoppingListSetLineItemCustomTypeActionBuilder builder(
            final ShoppingListSetLineItemCustomTypeAction template) {
        return ShoppingListSetLineItemCustomTypeActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withShoppingListSetLineItemCustomTypeAction(
            Function<ShoppingListSetLineItemCustomTypeAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ShoppingListSetLineItemCustomTypeAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ShoppingListSetLineItemCustomTypeAction>() {
            @Override
            public String toString() {
                return "TypeReference<ShoppingListSetLineItemCustomTypeAction>";
            }
        };
    }
}
