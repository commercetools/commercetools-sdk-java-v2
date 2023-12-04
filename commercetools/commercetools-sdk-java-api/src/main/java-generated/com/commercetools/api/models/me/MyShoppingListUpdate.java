
package com.commercetools.api.models.me;

import java.time.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * MyShoppingListUpdate
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MyShoppingListUpdate myShoppingListUpdate = MyShoppingListUpdate.builder()
 *             .version(0.3)
 *             .plusActions(actionsBuilder -> actionsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = MyShoppingListUpdateImpl.class)
public interface MyShoppingListUpdate extends
        com.commercetools.api.models.ResourceUpdate<MyShoppingListUpdate, MyShoppingListUpdateAction, MyShoppingListUpdateBuilder> {

    /**
     *  <p>Expected version of the ShoppingList on which the changes should be applied. If the expected version does not match the actual version, a ConcurrentModification error will be returned.</p>
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
    public List<MyShoppingListUpdateAction> getActions();

    /**
     *  <p>Expected version of the ShoppingList on which the changes should be applied. If the expected version does not match the actual version, a ConcurrentModification error will be returned.</p>
     * @param version value to be set
     */

    public void setVersion(final Long version);

    /**
     *  <p>List of update actions to be performed on the ShoppingList.</p>
     * @param actions values to be set
     */

    @JsonIgnore
    public void setActions(final MyShoppingListUpdateAction... actions);

    /**
     *  <p>List of update actions to be performed on the ShoppingList.</p>
     * @param actions values to be set
     */

    public void setActions(final List<MyShoppingListUpdateAction> actions);

    /**
     * factory method
     * @return instance of MyShoppingListUpdate
     */
    public static MyShoppingListUpdate of() {
        return new MyShoppingListUpdateImpl();
    }

    /**
     * factory method to create a shallow copy MyShoppingListUpdate
     * @param template instance to be copied
     * @return copy instance
     */
    public static MyShoppingListUpdate of(final MyShoppingListUpdate template) {
        MyShoppingListUpdateImpl instance = new MyShoppingListUpdateImpl();
        instance.setVersion(template.getVersion());
        instance.setActions(template.getActions());
        return instance;
    }

    /**
     * factory method to create a deep copy of MyShoppingListUpdate
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static MyShoppingListUpdate deepCopy(@Nullable final MyShoppingListUpdate template) {
        if (template == null) {
            return null;
        }
        MyShoppingListUpdateImpl instance = new MyShoppingListUpdateImpl();
        instance.setVersion(template.getVersion());
        instance.setActions(Optional.ofNullable(template.getActions())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.me.MyShoppingListUpdateAction::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for MyShoppingListUpdate
     * @return builder
     */
    public static MyShoppingListUpdateBuilder builder() {
        return MyShoppingListUpdateBuilder.of();
    }

    /**
     * create builder for MyShoppingListUpdate instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static MyShoppingListUpdateBuilder builder(final MyShoppingListUpdate template) {
        return MyShoppingListUpdateBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withMyShoppingListUpdate(Function<MyShoppingListUpdate, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<MyShoppingListUpdate> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<MyShoppingListUpdate>() {
            @Override
            public String toString() {
                return "TypeReference<MyShoppingListUpdate>";
            }
        };
    }
}
