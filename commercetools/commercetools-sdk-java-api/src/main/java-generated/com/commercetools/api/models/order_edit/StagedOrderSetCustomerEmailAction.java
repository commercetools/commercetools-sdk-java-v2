
package com.commercetools.api.models.order_edit;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.order.StagedOrderUpdateAction;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>This action updates the <code>customerEmail</code> on the Order, but it does not change the Customer email on the <a href="https://docs.commercetools.com/apis/ctp:api:type:Cart" rel="nofollow">Cart</a> the Order has been created from.</p>
 *  <p>Produces the <a href="https://docs.commercetools.com/apis/ctp:api:type:OrderCustomerEmailSetMessage" rel="nofollow">Order Customer Email Set</a> Message.</p>
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
@io.vrap.rmf.base.client.utils.json.SubType("setCustomerEmail")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = StagedOrderSetCustomerEmailActionImpl.class)
public interface StagedOrderSetCustomerEmailAction extends StagedOrderUpdateAction {

    /**
     * discriminator value for StagedOrderSetCustomerEmailAction
     */
    String SET_CUSTOMER_EMAIL = "setCustomerEmail";

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @return email
     */

    @JsonProperty("email")
    public String getEmail();

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
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
     * factory method to create a shallow copy StagedOrderSetCustomerEmailAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static StagedOrderSetCustomerEmailAction of(final StagedOrderSetCustomerEmailAction template) {
        StagedOrderSetCustomerEmailActionImpl instance = new StagedOrderSetCustomerEmailActionImpl();
        instance.setEmail(template.getEmail());
        return instance;
    }

    public StagedOrderSetCustomerEmailAction copyDeep();

    /**
     * factory method to create a deep copy of StagedOrderSetCustomerEmailAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static StagedOrderSetCustomerEmailAction deepCopy(
            @Nullable final StagedOrderSetCustomerEmailAction template) {
        if (template == null) {
            return null;
        }
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
