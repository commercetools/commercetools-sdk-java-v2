
package com.commercetools.api.models.shopping_list;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.common.Reference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Reference to a ShoppingList.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ShoppingListReference shoppingListReference = ShoppingListReference.builder()
 *             .id("{id}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ShoppingListReferenceImpl.class)
public interface ShoppingListReference extends Reference, com.commercetools.api.models.Identifiable<ShoppingList> {

    /**
     * discriminator value for ShoppingListReference
     */
    String SHOPPING_LIST = "shopping-list";

    /**
     *  <p>Contains the representation of the expanded ShoppingList. Only present in responses to requests with Reference Expansion for ShoppingLists.</p>
     * @return obj
     */
    @Valid
    @JsonProperty("obj")
    public ShoppingList getObj();

    /**
     *  <p>Unique identifier of the referenced ShoppingList.</p>
     * @return id
     */
    @NotNull
    @JsonProperty("id")
    public String getId();

    /**
     *  <p>Contains the representation of the expanded ShoppingList. Only present in responses to requests with Reference Expansion for ShoppingLists.</p>
     * @param obj value to be set
     */

    public void setObj(final ShoppingList obj);

    /**
     *  <p>Unique identifier of the referenced ShoppingList.</p>
     * @param id value to be set
     */

    public void setId(final String id);

    /**
     * factory method
     * @return instance of ShoppingListReference
     */
    public static ShoppingListReference of() {
        return new ShoppingListReferenceImpl();
    }

    /**
     * factory method to copy an instance of ShoppingListReference
     * @param template instance to be copied
     * @return copy instance
     */
    public static ShoppingListReference of(final ShoppingListReference template) {
        ShoppingListReferenceImpl instance = new ShoppingListReferenceImpl();
        instance.setId(template.getId());
        instance.setObj(template.getObj());
        return instance;
    }

    /**
     * builder factory method for ShoppingListReference
     * @return builder
     */
    public static ShoppingListReferenceBuilder builder() {
        return ShoppingListReferenceBuilder.of();
    }

    /**
     * create builder for ShoppingListReference instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ShoppingListReferenceBuilder builder(final ShoppingListReference template) {
        return ShoppingListReferenceBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withShoppingListReference(Function<ShoppingListReference, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ShoppingListReference> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ShoppingListReference>() {
            @Override
            public String toString() {
                return "TypeReference<ShoppingListReference>";
            }
        };
    }
}
