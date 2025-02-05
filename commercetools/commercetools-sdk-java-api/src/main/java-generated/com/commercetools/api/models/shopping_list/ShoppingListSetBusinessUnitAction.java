
package com.commercetools.api.models.shopping_list;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifier;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Updates the Business Unit on the Shopping List. The Shopping List must have an existing Business Unit assigned already.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ShoppingListSetBusinessUnitAction shoppingListSetBusinessUnitAction = ShoppingListSetBusinessUnitAction.builder()
 *             .businessUnit(businessUnitBuilder -> businessUnitBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ShoppingListSetBusinessUnitActionImpl.class)
public interface ShoppingListSetBusinessUnitAction extends ShoppingListUpdateAction {

    /**
     * discriminator value for ShoppingListSetBusinessUnitAction
     */
    String SET_BUSINESS_UNIT = "setBusinessUnit";

    /**
     *  <p>The Business Unit to assign to the Shopping List, which must have access to the Store that is set on the Shopping List.</p>
     * @return businessUnit
     */
    @NotNull
    @Valid
    @JsonProperty("businessUnit")
    public BusinessUnitResourceIdentifier getBusinessUnit();

    /**
     *  <p>The Business Unit to assign to the Shopping List, which must have access to the Store that is set on the Shopping List.</p>
     * @param businessUnit value to be set
     */

    public void setBusinessUnit(final BusinessUnitResourceIdentifier businessUnit);

    /**
     * factory method
     * @return instance of ShoppingListSetBusinessUnitAction
     */
    public static ShoppingListSetBusinessUnitAction of() {
        return new ShoppingListSetBusinessUnitActionImpl();
    }

    /**
     * factory method to create a shallow copy ShoppingListSetBusinessUnitAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static ShoppingListSetBusinessUnitAction of(final ShoppingListSetBusinessUnitAction template) {
        ShoppingListSetBusinessUnitActionImpl instance = new ShoppingListSetBusinessUnitActionImpl();
        instance.setBusinessUnit(template.getBusinessUnit());
        return instance;
    }

    /**
     * factory method to create a deep copy of ShoppingListSetBusinessUnitAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ShoppingListSetBusinessUnitAction deepCopy(
            @Nullable final ShoppingListSetBusinessUnitAction template) {
        if (template == null) {
            return null;
        }
        ShoppingListSetBusinessUnitActionImpl instance = new ShoppingListSetBusinessUnitActionImpl();
        instance.setBusinessUnit(com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifier
                .deepCopy(template.getBusinessUnit()));
        return instance;
    }

    /**
     * builder factory method for ShoppingListSetBusinessUnitAction
     * @return builder
     */
    public static ShoppingListSetBusinessUnitActionBuilder builder() {
        return ShoppingListSetBusinessUnitActionBuilder.of();
    }

    /**
     * create builder for ShoppingListSetBusinessUnitAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ShoppingListSetBusinessUnitActionBuilder builder(final ShoppingListSetBusinessUnitAction template) {
        return ShoppingListSetBusinessUnitActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withShoppingListSetBusinessUnitAction(Function<ShoppingListSetBusinessUnitAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ShoppingListSetBusinessUnitAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ShoppingListSetBusinessUnitAction>() {
            @Override
            public String toString() {
                return "TypeReference<ShoppingListSetBusinessUnitAction>";
            }
        };
    }
}
