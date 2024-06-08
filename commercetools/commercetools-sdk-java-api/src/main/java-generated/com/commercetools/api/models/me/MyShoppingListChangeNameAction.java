
package com.commercetools.api.models.me;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.common.LocalizedString;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 * MyShoppingListChangeNameAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MyShoppingListChangeNameAction myShoppingListChangeNameAction = MyShoppingListChangeNameAction.builder()
 *             .name(nameBuilder -> nameBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = MyShoppingListChangeNameActionImpl.class)
public interface MyShoppingListChangeNameAction extends MyShoppingListUpdateAction {

    /**
     * discriminator value for MyShoppingListChangeNameAction
     */
    String CHANGE_NAME = "changeName";

    /**
     *  <p>New value to set. Must not be empty.</p>
     * @return name
     */
    @NotNull
    @Valid
    @JsonProperty("name")
    public LocalizedString getName();

    /**
     *  <p>New value to set. Must not be empty.</p>
     * @param name value to be set
     */

    public void setName(final LocalizedString name);

    /**
     * factory method
     * @return instance of MyShoppingListChangeNameAction
     */
    public static MyShoppingListChangeNameAction of() {
        return new MyShoppingListChangeNameActionImpl();
    }

    /**
     * factory method to create a shallow copy MyShoppingListChangeNameAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static MyShoppingListChangeNameAction of(final MyShoppingListChangeNameAction template) {
        MyShoppingListChangeNameActionImpl instance = new MyShoppingListChangeNameActionImpl();
        instance.setName(template.getName());
        return instance;
    }

    /**
     * factory method to create a deep copy of MyShoppingListChangeNameAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static MyShoppingListChangeNameAction deepCopy(@Nullable final MyShoppingListChangeNameAction template) {
        if (template == null) {
            return null;
        }
        MyShoppingListChangeNameActionImpl instance = new MyShoppingListChangeNameActionImpl();
        instance.setName(com.commercetools.api.models.common.LocalizedString.deepCopy(template.getName()));
        return instance;
    }

    /**
     * builder factory method for MyShoppingListChangeNameAction
     * @return builder
     */
    public static MyShoppingListChangeNameActionBuilder builder() {
        return MyShoppingListChangeNameActionBuilder.of();
    }

    /**
     * create builder for MyShoppingListChangeNameAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static MyShoppingListChangeNameActionBuilder builder(final MyShoppingListChangeNameAction template) {
        return MyShoppingListChangeNameActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withMyShoppingListChangeNameAction(Function<MyShoppingListChangeNameAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<MyShoppingListChangeNameAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<MyShoppingListChangeNameAction>() {
            @Override
            public String toString() {
                return "TypeReference<MyShoppingListChangeNameAction>";
            }
        };
    }
}
