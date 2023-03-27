
package com.commercetools.api.models.shopping_list;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * ShoppingListUpdate
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ShoppingListUpdate shoppingListUpdate = ShoppingListUpdate.builder()
 *             .version(0.3)
 *             .plusActions(actionsBuilder -> actionsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ShoppingListUpdateImpl.class)
public interface ShoppingListUpdate extends
        com.commercetools.api.models.ResourceUpdate<ShoppingListUpdate, ShoppingListUpdateAction, ShoppingListUpdateBuilder> {

    /**
     *  <p>Expected version of the ShoppingList on which the changes should be applied. If the expected version does not match the actual version, a 409 Conflict will be returned.</p>
     * @return version
     */
    @NotNull
    @JsonProperty("version")
    public Long getVersion();

    /**
     *  <p>List of update actions to be performed on the ShoppingList.</p>
     * @return actions
     */
    @NotNull
    @Valid
    @JsonProperty("actions")
    public List<ShoppingListUpdateAction> getActions();

    /**
     *  <p>Expected version of the ShoppingList on which the changes should be applied. If the expected version does not match the actual version, a 409 Conflict will be returned.</p>
     * @param version value to be set
     */

    public void setVersion(final Long version);

    /**
     *  <p>List of update actions to be performed on the ShoppingList.</p>
     * @param actions values to be set
     */

    @JsonIgnore
    public void setActions(final ShoppingListUpdateAction... actions);

    /**
     *  <p>List of update actions to be performed on the ShoppingList.</p>
     * @param actions values to be set
     */

    public void setActions(final List<ShoppingListUpdateAction> actions);

    /**
     * factory method
     * @return instance of ShoppingListUpdate
     */
    public static ShoppingListUpdate of() {
        return new ShoppingListUpdateImpl();
    }

    /**
     * factory method to copy an instance of ShoppingListUpdate
     * @param template instance to be copied
     * @return copy instance
     */
    public static ShoppingListUpdate of(final ShoppingListUpdate template) {
        ShoppingListUpdateImpl instance = new ShoppingListUpdateImpl();
        instance.setVersion(template.getVersion());
        instance.setActions(template.getActions());
        return instance;
    }

    /**
     * builder factory method for ShoppingListUpdate
     * @return builder
     */
    public static ShoppingListUpdateBuilder builder() {
        return ShoppingListUpdateBuilder.of();
    }

    /**
     * create builder for ShoppingListUpdate instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ShoppingListUpdateBuilder builder(final ShoppingListUpdate template) {
        return ShoppingListUpdateBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withShoppingListUpdate(Function<ShoppingListUpdate, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ShoppingListUpdate> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ShoppingListUpdate>() {
            @Override
            public String toString() {
                return "TypeReference<ShoppingListUpdate>";
            }
        };
    }
}
