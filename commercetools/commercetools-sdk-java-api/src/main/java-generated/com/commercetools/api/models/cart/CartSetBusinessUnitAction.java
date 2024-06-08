
package com.commercetools.api.models.cart;

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
 *  <p>Updates the Business Unit on the Cart. The Cart must have an existing Business Unit assigned already.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartSetBusinessUnitAction cartSetBusinessUnitAction = CartSetBusinessUnitAction.builder()
 *             .businessUnit(businessUnitBuilder -> businessUnitBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CartSetBusinessUnitActionImpl.class)
public interface CartSetBusinessUnitAction extends CartUpdateAction {

    /**
     * discriminator value for CartSetBusinessUnitAction
     */
    String SET_BUSINESS_UNIT = "setBusinessUnit";

    /**
     *  <p>New Business Unit to assign to the Cart, which must have access to the Store that is set on the Cart.</p>
     * @return businessUnit
     */
    @NotNull
    @Valid
    @JsonProperty("businessUnit")
    public BusinessUnitResourceIdentifier getBusinessUnit();

    /**
     *  <p>New Business Unit to assign to the Cart, which must have access to the Store that is set on the Cart.</p>
     * @param businessUnit value to be set
     */

    public void setBusinessUnit(final BusinessUnitResourceIdentifier businessUnit);

    /**
     * factory method
     * @return instance of CartSetBusinessUnitAction
     */
    public static CartSetBusinessUnitAction of() {
        return new CartSetBusinessUnitActionImpl();
    }

    /**
     * factory method to create a shallow copy CartSetBusinessUnitAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static CartSetBusinessUnitAction of(final CartSetBusinessUnitAction template) {
        CartSetBusinessUnitActionImpl instance = new CartSetBusinessUnitActionImpl();
        instance.setBusinessUnit(template.getBusinessUnit());
        return instance;
    }

    /**
     * factory method to create a deep copy of CartSetBusinessUnitAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CartSetBusinessUnitAction deepCopy(@Nullable final CartSetBusinessUnitAction template) {
        if (template == null) {
            return null;
        }
        CartSetBusinessUnitActionImpl instance = new CartSetBusinessUnitActionImpl();
        instance.setBusinessUnit(com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifier
                .deepCopy(template.getBusinessUnit()));
        return instance;
    }

    /**
     * builder factory method for CartSetBusinessUnitAction
     * @return builder
     */
    public static CartSetBusinessUnitActionBuilder builder() {
        return CartSetBusinessUnitActionBuilder.of();
    }

    /**
     * create builder for CartSetBusinessUnitAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CartSetBusinessUnitActionBuilder builder(final CartSetBusinessUnitAction template) {
        return CartSetBusinessUnitActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCartSetBusinessUnitAction(Function<CartSetBusinessUnitAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CartSetBusinessUnitAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CartSetBusinessUnitAction>() {
            @Override
            public String toString() {
                return "TypeReference<CartSetBusinessUnitAction>";
            }
        };
    }
}
