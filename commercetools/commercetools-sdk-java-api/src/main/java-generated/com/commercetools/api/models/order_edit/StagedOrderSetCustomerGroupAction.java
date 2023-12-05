
package com.commercetools.api.models.order_edit;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.Valid;

import com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifier;
import com.commercetools.api.models.order.StagedOrderUpdateAction;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>This update action can only be used if a Customer is not assigned to a Cart. If a Customer is already assigned, the Cart has the same Customer Group as the assigned Customer.</p>
 *  <p>Setting the Customer Group also updates the LineItem <code>prices</code> according to the Customer Group.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StagedOrderSetCustomerGroupAction stagedOrderSetCustomerGroupAction = StagedOrderSetCustomerGroupAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = StagedOrderSetCustomerGroupActionImpl.class)
public interface StagedOrderSetCustomerGroupAction extends StagedOrderUpdateAction {

    /**
     * discriminator value for StagedOrderSetCustomerGroupAction
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
     * @return instance of StagedOrderSetCustomerGroupAction
     */
    public static StagedOrderSetCustomerGroupAction of() {
        return new StagedOrderSetCustomerGroupActionImpl();
    }

    /**
     * factory method to create a shallow copy StagedOrderSetCustomerGroupAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static StagedOrderSetCustomerGroupAction of(final StagedOrderSetCustomerGroupAction template) {
        StagedOrderSetCustomerGroupActionImpl instance = new StagedOrderSetCustomerGroupActionImpl();
        instance.setCustomerGroup(template.getCustomerGroup());
        return instance;
    }

    /**
     * factory method to create a deep copy of StagedOrderSetCustomerGroupAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static StagedOrderSetCustomerGroupAction deepCopy(
            @Nullable final StagedOrderSetCustomerGroupAction template) {
        if (template == null) {
            return null;
        }
        StagedOrderSetCustomerGroupActionImpl instance = new StagedOrderSetCustomerGroupActionImpl();
        instance.setCustomerGroup(com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifier
                .deepCopy(template.getCustomerGroup()));
        return instance;
    }

    /**
     * builder factory method for StagedOrderSetCustomerGroupAction
     * @return builder
     */
    public static StagedOrderSetCustomerGroupActionBuilder builder() {
        return StagedOrderSetCustomerGroupActionBuilder.of();
    }

    /**
     * create builder for StagedOrderSetCustomerGroupAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StagedOrderSetCustomerGroupActionBuilder builder(final StagedOrderSetCustomerGroupAction template) {
        return StagedOrderSetCustomerGroupActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withStagedOrderSetCustomerGroupAction(Function<StagedOrderSetCustomerGroupAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<StagedOrderSetCustomerGroupAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StagedOrderSetCustomerGroupAction>() {
            @Override
            public String toString() {
                return "TypeReference<StagedOrderSetCustomerGroupAction>";
            }
        };
    }
}
