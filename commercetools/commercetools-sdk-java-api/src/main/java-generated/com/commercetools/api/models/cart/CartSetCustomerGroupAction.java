
package com.commercetools.api.models.cart;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifier;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;

/**
 *  <p>This update action can only be used if a Customer is not assigned to the Cart. If a Customer is already assigned, the Cart uses the Customer Group of the assigned Customer.</p>
 *  <p>To reflect the new Customer Group, this update action can result in updates to the Cart. When this occurs, the following errors can be returned: MatchingPriceNotFound and MissingTaxRateForCountry.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartSetCustomerGroupAction cartSetCustomerGroupAction = CartSetCustomerGroupAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("setCustomerGroup")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CartSetCustomerGroupActionImpl.class)
public interface CartSetCustomerGroupAction extends CartUpdateAction {

    /**
     * discriminator value for CartSetCustomerGroupAction
     */
    String SET_CUSTOMER_GROUP = "setCustomerGroup";

    /**
     *  <p>Value to set. If empty, any existing value is removed.</p>
     * @return customerGroup
     */
    @Valid
    @JsonProperty("customerGroup")
    public CustomerGroupResourceIdentifier getCustomerGroup();

    /**
     *  <p>Value to set. If empty, any existing value is removed.</p>
     * @param customerGroup value to be set
     */

    public void setCustomerGroup(final CustomerGroupResourceIdentifier customerGroup);

    /**
     * factory method
     * @return instance of CartSetCustomerGroupAction
     */
    public static CartSetCustomerGroupAction of() {
        return new CartSetCustomerGroupActionImpl();
    }

    /**
     * factory method to create a shallow copy CartSetCustomerGroupAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static CartSetCustomerGroupAction of(final CartSetCustomerGroupAction template) {
        CartSetCustomerGroupActionImpl instance = new CartSetCustomerGroupActionImpl();
        instance.setCustomerGroup(template.getCustomerGroup());
        return instance;
    }

    public CartSetCustomerGroupAction copyDeep();

    /**
     * factory method to create a deep copy of CartSetCustomerGroupAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CartSetCustomerGroupAction deepCopy(@Nullable final CartSetCustomerGroupAction template) {
        if (template == null) {
            return null;
        }
        CartSetCustomerGroupActionImpl instance = new CartSetCustomerGroupActionImpl();
        instance.setCustomerGroup(com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifier
                .deepCopy(template.getCustomerGroup()));
        return instance;
    }

    /**
     * builder factory method for CartSetCustomerGroupAction
     * @return builder
     */
    public static CartSetCustomerGroupActionBuilder builder() {
        return CartSetCustomerGroupActionBuilder.of();
    }

    /**
     * create builder for CartSetCustomerGroupAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CartSetCustomerGroupActionBuilder builder(final CartSetCustomerGroupAction template) {
        return CartSetCustomerGroupActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCartSetCustomerGroupAction(Function<CartSetCustomerGroupAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CartSetCustomerGroupAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CartSetCustomerGroupAction>() {
            @Override
            public String toString() {
                return "TypeReference<CartSetCustomerGroupAction>";
            }
        };
    }
}
