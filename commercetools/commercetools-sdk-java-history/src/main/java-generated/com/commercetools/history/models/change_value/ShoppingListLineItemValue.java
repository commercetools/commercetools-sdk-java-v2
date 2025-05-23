
package com.commercetools.history.models.change_value;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.history.models.common.LocalizedString;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 * ShoppingListLineItemValue
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ShoppingListLineItemValue shoppingListLineItemValue = ShoppingListLineItemValue.builder()
 *             .id("{id}")
 *             .name(nameBuilder -> nameBuilder)
 *             .variantId(1)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ShoppingListLineItemValueImpl.class)
public interface ShoppingListLineItemValue {

    /**
     *  <p><code>id</code> of the ShoppingListLineItem.</p>
     * @return id
     */
    @NotNull
    @JsonProperty("id")
    public String getId();

    /**
     *  <p>Name of the corresponding Product the Product Variant belongs to.</p>
     * @return name
     */
    @NotNull
    @Valid
    @JsonProperty("name")
    public LocalizedString getName();

    /**
     *  <p><code>id</code> of the ProductVariant the ShoppingListLineItem refers to.</p>
     * @return variantId
     */
    @NotNull
    @JsonProperty("variantId")
    public Integer getVariantId();

    /**
     *  <p><code>id</code> of the ShoppingListLineItem.</p>
     * @param id value to be set
     */

    public void setId(final String id);

    /**
     *  <p>Name of the corresponding Product the Product Variant belongs to.</p>
     * @param name value to be set
     */

    public void setName(final LocalizedString name);

    /**
     *  <p><code>id</code> of the ProductVariant the ShoppingListLineItem refers to.</p>
     * @param variantId value to be set
     */

    public void setVariantId(final Integer variantId);

    /**
     * factory method
     * @return instance of ShoppingListLineItemValue
     */
    public static ShoppingListLineItemValue of() {
        return new ShoppingListLineItemValueImpl();
    }

    /**
     * factory method to create a shallow copy ShoppingListLineItemValue
     * @param template instance to be copied
     * @return copy instance
     */
    public static ShoppingListLineItemValue of(final ShoppingListLineItemValue template) {
        ShoppingListLineItemValueImpl instance = new ShoppingListLineItemValueImpl();
        instance.setId(template.getId());
        instance.setName(template.getName());
        instance.setVariantId(template.getVariantId());
        return instance;
    }

    public ShoppingListLineItemValue copyDeep();

    /**
     * factory method to create a deep copy of ShoppingListLineItemValue
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ShoppingListLineItemValue deepCopy(@Nullable final ShoppingListLineItemValue template) {
        if (template == null) {
            return null;
        }
        ShoppingListLineItemValueImpl instance = new ShoppingListLineItemValueImpl();
        instance.setId(template.getId());
        instance.setName(com.commercetools.history.models.common.LocalizedString.deepCopy(template.getName()));
        instance.setVariantId(template.getVariantId());
        return instance;
    }

    /**
     * builder factory method for ShoppingListLineItemValue
     * @return builder
     */
    public static ShoppingListLineItemValueBuilder builder() {
        return ShoppingListLineItemValueBuilder.of();
    }

    /**
     * create builder for ShoppingListLineItemValue instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ShoppingListLineItemValueBuilder builder(final ShoppingListLineItemValue template) {
        return ShoppingListLineItemValueBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withShoppingListLineItemValue(Function<ShoppingListLineItemValue, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ShoppingListLineItemValue> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ShoppingListLineItemValue>() {
            @Override
            public String toString() {
                return "TypeReference<ShoppingListLineItemValue>";
            }
        };
    }
}
