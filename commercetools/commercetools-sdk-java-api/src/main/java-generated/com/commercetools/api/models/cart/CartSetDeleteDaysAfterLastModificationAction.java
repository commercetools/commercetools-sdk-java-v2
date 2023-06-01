package com.commercetools.api.models.cart;

import com.commercetools.api.models.cart.CartUpdateAction;
import com.commercetools.api.models.cart.CartSetDeleteDaysAfterLastModificationActionImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.annotation.Nullable;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.io.IOException;

/**
 *  <p>Number of days after which a Cart with <code>Active</code> CartState is deleted since its last modification.</p>
 *  <p>If a ChangeSubscription exists for Carts, a ResourceDeletedDeliveryPayload is sent.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartSetDeleteDaysAfterLastModificationAction cartSetDeleteDaysAfterLastModificationAction = CartSetDeleteDaysAfterLastModificationAction.builder()
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
@JsonDeserialize(as = CartSetDeleteDaysAfterLastModificationActionImpl.class)
public interface CartSetDeleteDaysAfterLastModificationAction extends CartUpdateAction {

    /**
     * discriminator value for CartSetDeleteDaysAfterLastModificationAction
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
     * @return instance of CartSetDeleteDaysAfterLastModificationAction
     */
    public static CartSetDeleteDaysAfterLastModificationAction of(){
        return new CartSetDeleteDaysAfterLastModificationActionImpl();
    }
    

    /**
     * factory method to create a shallow copy CartSetDeleteDaysAfterLastModificationAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static CartSetDeleteDaysAfterLastModificationAction of(final CartSetDeleteDaysAfterLastModificationAction template) {
        CartSetDeleteDaysAfterLastModificationActionImpl instance = new CartSetDeleteDaysAfterLastModificationActionImpl();
        instance.setDeleteDaysAfterLastModification(template.getDeleteDaysAfterLastModification());
        return instance;
    }

    /**
     * factory method to create a deep copy of CartSetDeleteDaysAfterLastModificationAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CartSetDeleteDaysAfterLastModificationAction deepCopy(@Nullable final CartSetDeleteDaysAfterLastModificationAction template) {
        if (template == null) {
            return null;
        }
        CartSetDeleteDaysAfterLastModificationActionImpl instance = new CartSetDeleteDaysAfterLastModificationActionImpl();
        instance.setDeleteDaysAfterLastModification(template.getDeleteDaysAfterLastModification());
        return instance;
    }

    /**
     * builder factory method for CartSetDeleteDaysAfterLastModificationAction
     * @return builder
     */
    public static CartSetDeleteDaysAfterLastModificationActionBuilder builder() {
        return CartSetDeleteDaysAfterLastModificationActionBuilder.of();
    }
    
    /**
     * create builder for CartSetDeleteDaysAfterLastModificationAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CartSetDeleteDaysAfterLastModificationActionBuilder builder(final CartSetDeleteDaysAfterLastModificationAction template) {
        return CartSetDeleteDaysAfterLastModificationActionBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCartSetDeleteDaysAfterLastModificationAction(Function<CartSetDeleteDaysAfterLastModificationAction, T> helper) {
        return helper.apply(this);
    }
    public static CartSetDeleteDaysAfterLastModificationAction ofUnset() {
        return CartSetDeleteDaysAfterLastModificationAction.of();
    }
    
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CartSetDeleteDaysAfterLastModificationAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CartSetDeleteDaysAfterLastModificationAction>() {
            @Override
            public String toString() {
                return "TypeReference<CartSetDeleteDaysAfterLastModificationAction>";
            }
        };
    }
}
