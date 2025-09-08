
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.business_unit.BusinessUnitKeyReference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;

/**
 *  <p>Generated after a successful <a href="https://docs.commercetools.com/apis/ctp:api:type:OrderSetBusinessUnitAction" rel="nofollow">Set Business Unit</a> update action on Orders or <a href="https://docs.commercetools.com/apis/ctp:api:type:StagedOrderSetBusinessUnitAction" rel="nofollow">Set Business Unit</a> update action on Order Edits.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderBusinessUnitSetMessagePayload orderBusinessUnitSetMessagePayload = OrderBusinessUnitSetMessagePayload.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("OrderBusinessUnitSet")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = OrderBusinessUnitSetMessagePayloadImpl.class)
public interface OrderBusinessUnitSetMessagePayload extends OrderMessagePayload {

    /**
     * discriminator value for OrderBusinessUnitSetMessagePayload
     */
    String ORDER_BUSINESS_UNIT_SET = "OrderBusinessUnitSet";

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnit" rel="nofollow">BusinessUnit</a> on the <a href="https://docs.commercetools.com/apis/ctp:api:type:Order" rel="nofollow">Order</a> after the <a href="https://docs.commercetools.com/apis/ctp:api:type:OrderSetBusinessUnitAction" rel="nofollow">Set Business Unit</a> update action on Orders or <a href="https://docs.commercetools.com/apis/ctp:api:type:StagedOrderSetBusinessUnitAction" rel="nofollow">Set Business Unit</a> update action on Order Edits.</p>
     * @return businessUnit
     */
    @Valid
    @JsonProperty("businessUnit")
    public BusinessUnitKeyReference getBusinessUnit();

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnit" rel="nofollow">BusinessUnit</a> on the <a href="https://docs.commercetools.com/apis/ctp:api:type:Order" rel="nofollow">Order</a> before the <a href="https://docs.commercetools.com/apis/ctp:api:type:OrderSetBusinessUnitAction" rel="nofollow">Set Business Unit</a> update action on Orders or <a href="https://docs.commercetools.com/apis/ctp:api:type:StagedOrderSetBusinessUnitAction" rel="nofollow">Set Business Unit</a> update action on Order Edits.</p>
     * @return oldbusinessUnit
     */
    @Valid
    @JsonProperty("oldbusinessUnit")
    public BusinessUnitKeyReference getOldbusinessUnit();

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnit" rel="nofollow">BusinessUnit</a> on the <a href="https://docs.commercetools.com/apis/ctp:api:type:Order" rel="nofollow">Order</a> after the <a href="https://docs.commercetools.com/apis/ctp:api:type:OrderSetBusinessUnitAction" rel="nofollow">Set Business Unit</a> update action on Orders or <a href="https://docs.commercetools.com/apis/ctp:api:type:StagedOrderSetBusinessUnitAction" rel="nofollow">Set Business Unit</a> update action on Order Edits.</p>
     * @param businessUnit value to be set
     */

    public void setBusinessUnit(final BusinessUnitKeyReference businessUnit);

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnit" rel="nofollow">BusinessUnit</a> on the <a href="https://docs.commercetools.com/apis/ctp:api:type:Order" rel="nofollow">Order</a> before the <a href="https://docs.commercetools.com/apis/ctp:api:type:OrderSetBusinessUnitAction" rel="nofollow">Set Business Unit</a> update action on Orders or <a href="https://docs.commercetools.com/apis/ctp:api:type:StagedOrderSetBusinessUnitAction" rel="nofollow">Set Business Unit</a> update action on Order Edits.</p>
     * @param oldbusinessUnit value to be set
     */

    public void setOldbusinessUnit(final BusinessUnitKeyReference oldbusinessUnit);

    /**
     * factory method
     * @return instance of OrderBusinessUnitSetMessagePayload
     */
    public static OrderBusinessUnitSetMessagePayload of() {
        return new OrderBusinessUnitSetMessagePayloadImpl();
    }

    /**
     * factory method to create a shallow copy OrderBusinessUnitSetMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static OrderBusinessUnitSetMessagePayload of(final OrderBusinessUnitSetMessagePayload template) {
        OrderBusinessUnitSetMessagePayloadImpl instance = new OrderBusinessUnitSetMessagePayloadImpl();
        instance.setBusinessUnit(template.getBusinessUnit());
        instance.setOldbusinessUnit(template.getOldbusinessUnit());
        return instance;
    }

    public OrderBusinessUnitSetMessagePayload copyDeep();

    /**
     * factory method to create a deep copy of OrderBusinessUnitSetMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static OrderBusinessUnitSetMessagePayload deepCopy(
            @Nullable final OrderBusinessUnitSetMessagePayload template) {
        if (template == null) {
            return null;
        }
        OrderBusinessUnitSetMessagePayloadImpl instance = new OrderBusinessUnitSetMessagePayloadImpl();
        instance.setBusinessUnit(
            com.commercetools.api.models.business_unit.BusinessUnitKeyReference.deepCopy(template.getBusinessUnit()));
        instance.setOldbusinessUnit(com.commercetools.api.models.business_unit.BusinessUnitKeyReference
                .deepCopy(template.getOldbusinessUnit()));
        return instance;
    }

    /**
     * builder factory method for OrderBusinessUnitSetMessagePayload
     * @return builder
     */
    public static OrderBusinessUnitSetMessagePayloadBuilder builder() {
        return OrderBusinessUnitSetMessagePayloadBuilder.of();
    }

    /**
     * create builder for OrderBusinessUnitSetMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderBusinessUnitSetMessagePayloadBuilder builder(final OrderBusinessUnitSetMessagePayload template) {
        return OrderBusinessUnitSetMessagePayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withOrderBusinessUnitSetMessagePayload(Function<OrderBusinessUnitSetMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<OrderBusinessUnitSetMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderBusinessUnitSetMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<OrderBusinessUnitSetMessagePayload>";
            }
        };
    }
}
