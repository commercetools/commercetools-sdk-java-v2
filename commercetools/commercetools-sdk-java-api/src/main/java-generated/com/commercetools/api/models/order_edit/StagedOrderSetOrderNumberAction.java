
package com.commercetools.api.models.order_edit;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.commercetools.api.models.order.StagedOrderUpdateAction;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * StagedOrderSetOrderNumberAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StagedOrderSetOrderNumberAction stagedOrderSetOrderNumberAction = StagedOrderSetOrderNumberAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = StagedOrderSetOrderNumberActionImpl.class)
public interface StagedOrderSetOrderNumberAction extends StagedOrderUpdateAction {

    /**
     * discriminator value for StagedOrderSetOrderNumberAction
     */
    String SET_ORDER_NUMBER = "setOrderNumber";

    /**
     *
     * @return orderNumber
     */

    @JsonProperty("orderNumber")
    public String getOrderNumber();

    /**
     * set orderNumber
     * @param orderNumber value to be set
     */

    public void setOrderNumber(final String orderNumber);

    /**
     * factory method
     * @return instance of StagedOrderSetOrderNumberAction
     */
    public static StagedOrderSetOrderNumberAction of() {
        return new StagedOrderSetOrderNumberActionImpl();
    }

    /**
     * factory method to copy an instance of StagedOrderSetOrderNumberAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static StagedOrderSetOrderNumberAction of(final StagedOrderSetOrderNumberAction template) {
        StagedOrderSetOrderNumberActionImpl instance = new StagedOrderSetOrderNumberActionImpl();
        instance.setOrderNumber(template.getOrderNumber());
        return instance;
    }

    /**
     * builder factory method for StagedOrderSetOrderNumberAction
     * @return builder
     */
    public static StagedOrderSetOrderNumberActionBuilder builder() {
        return StagedOrderSetOrderNumberActionBuilder.of();
    }

    /**
     * create builder for StagedOrderSetOrderNumberAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StagedOrderSetOrderNumberActionBuilder builder(final StagedOrderSetOrderNumberAction template) {
        return StagedOrderSetOrderNumberActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withStagedOrderSetOrderNumberAction(Function<StagedOrderSetOrderNumberAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<StagedOrderSetOrderNumberAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StagedOrderSetOrderNumberAction>() {
            @Override
            public String toString() {
                return "TypeReference<StagedOrderSetOrderNumberAction>";
            }
        };
    }
}
