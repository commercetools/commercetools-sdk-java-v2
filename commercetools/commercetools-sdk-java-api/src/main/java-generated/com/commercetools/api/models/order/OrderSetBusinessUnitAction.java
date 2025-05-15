
package com.commercetools.api.models.order;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifier;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;

/**
 *  <p>Updates the Business Unit on the Order. Setting the Order's <code>businessUnit</code> does not recalculate prices or discounts on the Order.</p>
 *  <p>Produces the OrderBusinessUnitSet Message.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderSetBusinessUnitAction orderSetBusinessUnitAction = OrderSetBusinessUnitAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("setBusinessUnit")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = OrderSetBusinessUnitActionImpl.class)
public interface OrderSetBusinessUnitAction extends OrderUpdateAction {

    /**
     * discriminator value for OrderSetBusinessUnitAction
     */
    String SET_BUSINESS_UNIT = "setBusinessUnit";

    /**
     *  <p>New Business Unit to assign to the Order. If empty, any existing value is removed.</p>
     *  <p>If the referenced Business Unit does not exist, a ReferencedResourceNotFound error is returned.</p>
     * @return businessUnit
     */
    @Valid
    @JsonProperty("businessUnit")
    public BusinessUnitResourceIdentifier getBusinessUnit();

    /**
     *  <p>New Business Unit to assign to the Order. If empty, any existing value is removed.</p>
     *  <p>If the referenced Business Unit does not exist, a ReferencedResourceNotFound error is returned.</p>
     * @param businessUnit value to be set
     */

    public void setBusinessUnit(final BusinessUnitResourceIdentifier businessUnit);

    /**
     * factory method
     * @return instance of OrderSetBusinessUnitAction
     */
    public static OrderSetBusinessUnitAction of() {
        return new OrderSetBusinessUnitActionImpl();
    }

    /**
     * factory method to create a shallow copy OrderSetBusinessUnitAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static OrderSetBusinessUnitAction of(final OrderSetBusinessUnitAction template) {
        OrderSetBusinessUnitActionImpl instance = new OrderSetBusinessUnitActionImpl();
        instance.setBusinessUnit(template.getBusinessUnit());
        return instance;
    }

    public OrderSetBusinessUnitAction copyDeep();

    /**
     * factory method to create a deep copy of OrderSetBusinessUnitAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static OrderSetBusinessUnitAction deepCopy(@Nullable final OrderSetBusinessUnitAction template) {
        if (template == null) {
            return null;
        }
        OrderSetBusinessUnitActionImpl instance = new OrderSetBusinessUnitActionImpl();
        instance.setBusinessUnit(com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifier
                .deepCopy(template.getBusinessUnit()));
        return instance;
    }

    /**
     * builder factory method for OrderSetBusinessUnitAction
     * @return builder
     */
    public static OrderSetBusinessUnitActionBuilder builder() {
        return OrderSetBusinessUnitActionBuilder.of();
    }

    /**
     * create builder for OrderSetBusinessUnitAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderSetBusinessUnitActionBuilder builder(final OrderSetBusinessUnitAction template) {
        return OrderSetBusinessUnitActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withOrderSetBusinessUnitAction(Function<OrderSetBusinessUnitAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<OrderSetBusinessUnitAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderSetBusinessUnitAction>() {
            @Override
            public String toString() {
                return "TypeReference<OrderSetBusinessUnitAction>";
            }
        };
    }
}
