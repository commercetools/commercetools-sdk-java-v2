
package com.commercetools.api.models.shopping_list;

import java.time.*;
import java.util.*;
import java.util.function.Function;

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

    String SET_LINE_ITEM_CUSTOM_TYPE = "setLineItemCustomType";

    /**
     *  <p>The <code>id</code> of the ShoppingListLineItem to update.</p>
     */
    @NotNull
    @JsonProperty("lineItemId")
    public String getLineItemId();

    /**
     *  <p>Defines the Type that extends the ShoppingListLineItem with Custom Fields. If absent, any existing Type and Custom Fields are removed from the ShoppingListLineItem.</p>
     */
    @Valid
    @JsonProperty("type")
    public TypeResourceIdentifier getType();

    /**
     *  <p>Sets the Custom Fields fields for the ShoppingListLineItem.</p>
     */
    @Valid
    @JsonProperty("fields")
    public FieldContainer getFields();

    public void setLineItemId(final String lineItemId);

    public void setType(final TypeResourceIdentifier type);

    public void setFields(final FieldContainer fields);

    public static ShoppingListSetLineItemCustomTypeAction of() {
        return new ShoppingListSetLineItemCustomTypeActionImpl();
    }

    public static ShoppingListSetLineItemCustomTypeAction of(final ShoppingListSetLineItemCustomTypeAction template) {
        ShoppingListSetLineItemCustomTypeActionImpl instance = new ShoppingListSetLineItemCustomTypeActionImpl();
        instance.setLineItemId(template.getLineItemId());
        instance.setType(template.getType());
        instance.setFields(template.getFields());
        return instance;
    }

    public static ShoppingListSetLineItemCustomTypeActionBuilder builder() {
        return ShoppingListSetLineItemCustomTypeActionBuilder.of();
    }

    public static ShoppingListSetLineItemCustomTypeActionBuilder builder(
            final ShoppingListSetLineItemCustomTypeAction template) {
        return ShoppingListSetLineItemCustomTypeActionBuilder.of(template);
    }

    default <T> T withShoppingListSetLineItemCustomTypeAction(
            Function<ShoppingListSetLineItemCustomTypeAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ShoppingListSetLineItemCustomTypeAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ShoppingListSetLineItemCustomTypeAction>() {
            @Override
            public String toString() {
                return "TypeReference<ShoppingListSetLineItemCustomTypeAction>";
            }
        };
    }
}
