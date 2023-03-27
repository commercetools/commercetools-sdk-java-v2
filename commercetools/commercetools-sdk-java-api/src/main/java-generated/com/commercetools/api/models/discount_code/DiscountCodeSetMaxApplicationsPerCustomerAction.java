
package com.commercetools.api.models.discount_code;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * DiscountCodeSetMaxApplicationsPerCustomerAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     DiscountCodeSetMaxApplicationsPerCustomerAction discountCodeSetMaxApplicationsPerCustomerAction = DiscountCodeSetMaxApplicationsPerCustomerAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = DiscountCodeSetMaxApplicationsPerCustomerActionImpl.class)
public interface DiscountCodeSetMaxApplicationsPerCustomerAction extends DiscountCodeUpdateAction {

    /**
     * discriminator value for DiscountCodeSetMaxApplicationsPerCustomerAction
     */
    String SET_MAX_APPLICATIONS_PER_CUSTOMER = "setMaxApplicationsPerCustomer";

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @return maxApplicationsPerCustomer
     */

    @JsonProperty("maxApplicationsPerCustomer")
    public Long getMaxApplicationsPerCustomer();

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @param maxApplicationsPerCustomer value to be set
     */

    public void setMaxApplicationsPerCustomer(final Long maxApplicationsPerCustomer);

    /**
     * factory method
     * @return instance of DiscountCodeSetMaxApplicationsPerCustomerAction
     */
    public static DiscountCodeSetMaxApplicationsPerCustomerAction of() {
        return new DiscountCodeSetMaxApplicationsPerCustomerActionImpl();
    }

    /**
     * factory method to copy an instance of DiscountCodeSetMaxApplicationsPerCustomerAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static DiscountCodeSetMaxApplicationsPerCustomerAction of(
            final DiscountCodeSetMaxApplicationsPerCustomerAction template) {
        DiscountCodeSetMaxApplicationsPerCustomerActionImpl instance = new DiscountCodeSetMaxApplicationsPerCustomerActionImpl();
        instance.setMaxApplicationsPerCustomer(template.getMaxApplicationsPerCustomer());
        return instance;
    }

    /**
     * builder factory method for DiscountCodeSetMaxApplicationsPerCustomerAction
     * @return builder
     */
    public static DiscountCodeSetMaxApplicationsPerCustomerActionBuilder builder() {
        return DiscountCodeSetMaxApplicationsPerCustomerActionBuilder.of();
    }

    /**
     * create builder for DiscountCodeSetMaxApplicationsPerCustomerAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static DiscountCodeSetMaxApplicationsPerCustomerActionBuilder builder(
            final DiscountCodeSetMaxApplicationsPerCustomerAction template) {
        return DiscountCodeSetMaxApplicationsPerCustomerActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withDiscountCodeSetMaxApplicationsPerCustomerAction(
            Function<DiscountCodeSetMaxApplicationsPerCustomerAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<DiscountCodeSetMaxApplicationsPerCustomerAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<DiscountCodeSetMaxApplicationsPerCustomerAction>() {
            @Override
            public String toString() {
                return "TypeReference<DiscountCodeSetMaxApplicationsPerCustomerAction>";
            }
        };
    }
}
