
package com.commercetools.api.models.me;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Number of days after the last modification before a Cart is deleted.</p>
 *  <p>If a ChangeSubscription exists for Carts, a ResourceDeletedDeliveryPayload is sent.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MyCartSetDeleteDaysAfterLastModificationAction myCartSetDeleteDaysAfterLastModificationAction = MyCartSetDeleteDaysAfterLastModificationAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = MyCartSetDeleteDaysAfterLastModificationActionImpl.class)
public interface MyCartSetDeleteDaysAfterLastModificationAction extends MyCartUpdateAction {

    /**
     * discriminator value for MyCartSetDeleteDaysAfterLastModificationAction
     */
    String SET_DELETE_DAYS_AFTER_LAST_MODIFICATION = "setDeleteDaysAfterLastModification";

    /**
     *  <p>Value to set. If not provided, the default value for this field configured in Project settings is assigned.</p>
     * @return deleteDaysAfterLastModification
     */

    @JsonProperty("deleteDaysAfterLastModification")
    public Integer getDeleteDaysAfterLastModification();

    /**
     *  <p>Value to set. If not provided, the default value for this field configured in Project settings is assigned.</p>
     * @param deleteDaysAfterLastModification value to be set
     */

    public void setDeleteDaysAfterLastModification(final Integer deleteDaysAfterLastModification);

    /**
     * factory method
     * @return instance of MyCartSetDeleteDaysAfterLastModificationAction
     */
    public static MyCartSetDeleteDaysAfterLastModificationAction of() {
        return new MyCartSetDeleteDaysAfterLastModificationActionImpl();
    }

    /**
     * factory method to create a shallow copy MyCartSetDeleteDaysAfterLastModificationAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static MyCartSetDeleteDaysAfterLastModificationAction of(
            final MyCartSetDeleteDaysAfterLastModificationAction template) {
        MyCartSetDeleteDaysAfterLastModificationActionImpl instance = new MyCartSetDeleteDaysAfterLastModificationActionImpl();
        instance.setDeleteDaysAfterLastModification(template.getDeleteDaysAfterLastModification());
        return instance;
    }

    /**
     * factory method to create a deep copy of MyCartSetDeleteDaysAfterLastModificationAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static MyCartSetDeleteDaysAfterLastModificationAction deepCopy(
            @Nullable final MyCartSetDeleteDaysAfterLastModificationAction template) {
        if (template == null) {
            return null;
        }
        MyCartSetDeleteDaysAfterLastModificationActionImpl instance = new MyCartSetDeleteDaysAfterLastModificationActionImpl();
        instance.setDeleteDaysAfterLastModification(template.getDeleteDaysAfterLastModification());
        return instance;
    }

    /**
     * builder factory method for MyCartSetDeleteDaysAfterLastModificationAction
     * @return builder
     */
    public static MyCartSetDeleteDaysAfterLastModificationActionBuilder builder() {
        return MyCartSetDeleteDaysAfterLastModificationActionBuilder.of();
    }

    /**
     * create builder for MyCartSetDeleteDaysAfterLastModificationAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static MyCartSetDeleteDaysAfterLastModificationActionBuilder builder(
            final MyCartSetDeleteDaysAfterLastModificationAction template) {
        return MyCartSetDeleteDaysAfterLastModificationActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withMyCartSetDeleteDaysAfterLastModificationAction(
            Function<MyCartSetDeleteDaysAfterLastModificationAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<MyCartSetDeleteDaysAfterLastModificationAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<MyCartSetDeleteDaysAfterLastModificationAction>() {
            @Override
            public String toString() {
                return "TypeReference<MyCartSetDeleteDaysAfterLastModificationAction>";
            }
        };
    }
}
