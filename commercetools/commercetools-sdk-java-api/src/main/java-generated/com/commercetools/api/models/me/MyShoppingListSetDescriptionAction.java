
package com.commercetools.api.models.me;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.Valid;

import com.commercetools.api.models.common.LocalizedString;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * MyShoppingListSetDescriptionAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MyShoppingListSetDescriptionAction myShoppingListSetDescriptionAction = MyShoppingListSetDescriptionAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = MyShoppingListSetDescriptionActionImpl.class)
public interface MyShoppingListSetDescriptionAction extends MyShoppingListUpdateAction {

    /**
     * discriminator value for MyShoppingListSetDescriptionAction
     */
    String SET_DESCRIPTION = "setDescription";

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @return description
     */
    @Valid
    @JsonProperty("description")
    public LocalizedString getDescription();

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @param description value to be set
     */

    public void setDescription(final LocalizedString description);

    /**
     * factory method
     * @return instance of MyShoppingListSetDescriptionAction
     */
    public static MyShoppingListSetDescriptionAction of() {
        return new MyShoppingListSetDescriptionActionImpl();
    }

    /**
     * factory method to create a shallow copy MyShoppingListSetDescriptionAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static MyShoppingListSetDescriptionAction of(final MyShoppingListSetDescriptionAction template) {
        MyShoppingListSetDescriptionActionImpl instance = new MyShoppingListSetDescriptionActionImpl();
        instance.setDescription(template.getDescription());
        return instance;
    }

    /**
     * factory method to create a deep copy of MyShoppingListSetDescriptionAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static MyShoppingListSetDescriptionAction deepCopy(
            @Nullable final MyShoppingListSetDescriptionAction template) {
        if (template == null) {
            return null;
        }
        MyShoppingListSetDescriptionActionImpl instance = new MyShoppingListSetDescriptionActionImpl();
        instance.setDescription(Optional.ofNullable(template.getDescription())
                .map(com.commercetools.api.models.common.LocalizedString::deepCopy)
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for MyShoppingListSetDescriptionAction
     * @return builder
     */
    public static MyShoppingListSetDescriptionActionBuilder builder() {
        return MyShoppingListSetDescriptionActionBuilder.of();
    }

    /**
     * create builder for MyShoppingListSetDescriptionAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static MyShoppingListSetDescriptionActionBuilder builder(final MyShoppingListSetDescriptionAction template) {
        return MyShoppingListSetDescriptionActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withMyShoppingListSetDescriptionAction(Function<MyShoppingListSetDescriptionAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<MyShoppingListSetDescriptionAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<MyShoppingListSetDescriptionAction>() {
            @Override
            public String toString() {
                return "TypeReference<MyShoppingListSetDescriptionAction>";
            }
        };
    }
}
