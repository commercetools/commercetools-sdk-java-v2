
package com.commercetools.api.models.order_edit;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.commercetools.api.models.order.StagedOrderUpdateAction;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * StagedOrderSetCustomerEmailAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StagedOrderSetCustomerEmailAction stagedOrderSetCustomerEmailAction = StagedOrderSetCustomerEmailAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = StagedOrderSetCustomerEmailActionImpl.class)
public interface StagedOrderSetCustomerEmailAction extends StagedOrderUpdateAction {

    /**
     * discriminator value for StagedOrderSetCustomerEmailAction
     */
    String SET_CUSTOMER_EMAIL = "setCustomerEmail";

    /**
     *
     * @return email
     */

    @JsonProperty("email")
    public String getEmail();

    /**
     * set email
     * @param email value to be set
     */

    public void setEmail(final String email);

    /**
     * factory method
     * @return instance of StagedOrderSetCustomerEmailAction
     */
    public static StagedOrderSetCustomerEmailAction of() {
        return new StagedOrderSetCustomerEmailActionImpl();
    }

    /**
     * factory method to copy an instance of StagedOrderSetCustomerEmailAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static StagedOrderSetCustomerEmailAction of(final StagedOrderSetCustomerEmailAction template) {
        StagedOrderSetCustomerEmailActionImpl instance = new StagedOrderSetCustomerEmailActionImpl();
        instance.setEmail(template.getEmail());
        return instance;
    }

    /**
     * builder factory method for StagedOrderSetCustomerEmailAction
     * @return builder
     */
    public static StagedOrderSetCustomerEmailActionBuilder builder() {
        return StagedOrderSetCustomerEmailActionBuilder.of();
    }

    /**
     * create builder for StagedOrderSetCustomerEmailAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StagedOrderSetCustomerEmailActionBuilder builder(final StagedOrderSetCustomerEmailAction template) {
        return StagedOrderSetCustomerEmailActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withStagedOrderSetCustomerEmailAction(Function<StagedOrderSetCustomerEmailAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<StagedOrderSetCustomerEmailAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StagedOrderSetCustomerEmailAction>() {
            @Override
            public String toString() {
                return "TypeReference<StagedOrderSetCustomerEmailAction>";
            }
        };
    }
}
