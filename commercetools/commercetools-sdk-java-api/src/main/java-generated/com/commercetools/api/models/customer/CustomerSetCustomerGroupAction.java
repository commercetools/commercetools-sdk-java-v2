
package com.commercetools.api.models.customer;

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
 *  <p>Setting the Customer Group of the Customer produces the CustomerGroupSet Message.</p>
 *  <p>To reflect the new Customer Group, this update action can result in updates to the most recently modified active Cart. When this occurs, the following errors can be returned: MatchingPriceNotFound and MissingTaxRateForCountry.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomerSetCustomerGroupAction customerSetCustomerGroupAction = CustomerSetCustomerGroupAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CustomerSetCustomerGroupActionImpl.class)
public interface CustomerSetCustomerGroupAction extends CustomerUpdateAction {

    /**
     * discriminator value for CustomerSetCustomerGroupAction
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
     * @return instance of CustomerSetCustomerGroupAction
     */
    public static CustomerSetCustomerGroupAction of() {
        return new CustomerSetCustomerGroupActionImpl();
    }

    /**
     * factory method to create a shallow copy CustomerSetCustomerGroupAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static CustomerSetCustomerGroupAction of(final CustomerSetCustomerGroupAction template) {
        CustomerSetCustomerGroupActionImpl instance = new CustomerSetCustomerGroupActionImpl();
        instance.setCustomerGroup(template.getCustomerGroup());
        return instance;
    }

    /**
     * factory method to create a deep copy of CustomerSetCustomerGroupAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CustomerSetCustomerGroupAction deepCopy(@Nullable final CustomerSetCustomerGroupAction template) {
        if (template == null) {
            return null;
        }
        CustomerSetCustomerGroupActionImpl instance = new CustomerSetCustomerGroupActionImpl();
        instance.setCustomerGroup(com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifier
                .deepCopy(template.getCustomerGroup()));
        return instance;
    }

    /**
     * builder factory method for CustomerSetCustomerGroupAction
     * @return builder
     */
    public static CustomerSetCustomerGroupActionBuilder builder() {
        return CustomerSetCustomerGroupActionBuilder.of();
    }

    /**
     * create builder for CustomerSetCustomerGroupAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CustomerSetCustomerGroupActionBuilder builder(final CustomerSetCustomerGroupAction template) {
        return CustomerSetCustomerGroupActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCustomerSetCustomerGroupAction(Function<CustomerSetCustomerGroupAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CustomerSetCustomerGroupAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CustomerSetCustomerGroupAction>() {
            @Override
            public String toString() {
                return "TypeReference<CustomerSetCustomerGroupAction>";
            }
        };
    }
}
