
package com.commercetools.api.models.me;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * MyShoppingListSetDeleteDaysAfterLastModificationAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MyShoppingListSetDeleteDaysAfterLastModificationAction myShoppingListSetDeleteDaysAfterLastModificationAction = MyShoppingListSetDeleteDaysAfterLastModificationAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = MyShoppingListSetDeleteDaysAfterLastModificationActionImpl.class)
public interface MyShoppingListSetDeleteDaysAfterLastModificationAction extends MyShoppingListUpdateAction {

    /**
     * discriminator value for MyShoppingListSetDeleteDaysAfterLastModificationAction
     */
    String SET_DELETE_DAYS_AFTER_LAST_MODIFICATION = "setDeleteDaysAfterLastModification";

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @return deleteDaysAfterLastModification
     */

    @JsonProperty("deleteDaysAfterLastModification")
    public Long getDeleteDaysAfterLastModification();

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @param deleteDaysAfterLastModification value to be set
     */

    public void setDeleteDaysAfterLastModification(final Long deleteDaysAfterLastModification);

    /**
     * factory method
     * @return instance of MyShoppingListSetDeleteDaysAfterLastModificationAction
     */
    public static MyShoppingListSetDeleteDaysAfterLastModificationAction of() {
        return new MyShoppingListSetDeleteDaysAfterLastModificationActionImpl();
    }

    /**
     * factory method to copy an instance of MyShoppingListSetDeleteDaysAfterLastModificationAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static MyShoppingListSetDeleteDaysAfterLastModificationAction of(
            final MyShoppingListSetDeleteDaysAfterLastModificationAction template) {
        MyShoppingListSetDeleteDaysAfterLastModificationActionImpl instance = new MyShoppingListSetDeleteDaysAfterLastModificationActionImpl();
        instance.setDeleteDaysAfterLastModification(template.getDeleteDaysAfterLastModification());
        return instance;
    }

    /**
     * builder factory method for MyShoppingListSetDeleteDaysAfterLastModificationAction
     * @return builder
     */
    public static MyShoppingListSetDeleteDaysAfterLastModificationActionBuilder builder() {
        return MyShoppingListSetDeleteDaysAfterLastModificationActionBuilder.of();
    }

    /**
     * create builder for MyShoppingListSetDeleteDaysAfterLastModificationAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static MyShoppingListSetDeleteDaysAfterLastModificationActionBuilder builder(
            final MyShoppingListSetDeleteDaysAfterLastModificationAction template) {
        return MyShoppingListSetDeleteDaysAfterLastModificationActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withMyShoppingListSetDeleteDaysAfterLastModificationAction(
            Function<MyShoppingListSetDeleteDaysAfterLastModificationAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<MyShoppingListSetDeleteDaysAfterLastModificationAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<MyShoppingListSetDeleteDaysAfterLastModificationAction>() {
            @Override
            public String toString() {
                return "TypeReference<MyShoppingListSetDeleteDaysAfterLastModificationAction>";
            }
        };
    }
}
