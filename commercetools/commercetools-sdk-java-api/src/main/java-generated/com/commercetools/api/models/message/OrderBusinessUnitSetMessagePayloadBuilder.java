
package com.commercetools.api.models.message;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * OrderBusinessUnitSetMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderBusinessUnitSetMessagePayload orderBusinessUnitSetMessagePayload = OrderBusinessUnitSetMessagePayload.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class OrderBusinessUnitSetMessagePayloadBuilder implements Builder<OrderBusinessUnitSetMessagePayload> {

    @Nullable
    private com.commercetools.api.models.business_unit.BusinessUnitKeyReference businessUnit;

    @Nullable
    private com.commercetools.api.models.business_unit.BusinessUnitKeyReference oldBusinessUnit;

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnit" rel="nofollow">BusinessUnit</a> on the <a href="https://docs.commercetools.com/apis/ctp:api:type:Order" rel="nofollow">Order</a> after the <a href="https://docs.commercetools.com/apis/ctp:api:type:OrderSetBusinessUnitAction" rel="nofollow">Set Business Unit</a> update action on Orders or <a href="https://docs.commercetools.com/apis/ctp:api:type:StagedOrderSetBusinessUnitAction" rel="nofollow">Set Business Unit</a> update action on Order Edits.</p>
     * @param builder function to build the businessUnit value
     * @return Builder
     */

    public OrderBusinessUnitSetMessagePayloadBuilder businessUnit(
            Function<com.commercetools.api.models.business_unit.BusinessUnitKeyReferenceBuilder, com.commercetools.api.models.business_unit.BusinessUnitKeyReferenceBuilder> builder) {
        this.businessUnit = builder
                .apply(com.commercetools.api.models.business_unit.BusinessUnitKeyReferenceBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnit" rel="nofollow">BusinessUnit</a> on the <a href="https://docs.commercetools.com/apis/ctp:api:type:Order" rel="nofollow">Order</a> after the <a href="https://docs.commercetools.com/apis/ctp:api:type:OrderSetBusinessUnitAction" rel="nofollow">Set Business Unit</a> update action on Orders or <a href="https://docs.commercetools.com/apis/ctp:api:type:StagedOrderSetBusinessUnitAction" rel="nofollow">Set Business Unit</a> update action on Order Edits.</p>
     * @param builder function to build the businessUnit value
     * @return Builder
     */

    public OrderBusinessUnitSetMessagePayloadBuilder withBusinessUnit(
            Function<com.commercetools.api.models.business_unit.BusinessUnitKeyReferenceBuilder, com.commercetools.api.models.business_unit.BusinessUnitKeyReference> builder) {
        this.businessUnit = builder
                .apply(com.commercetools.api.models.business_unit.BusinessUnitKeyReferenceBuilder.of());
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnit" rel="nofollow">BusinessUnit</a> on the <a href="https://docs.commercetools.com/apis/ctp:api:type:Order" rel="nofollow">Order</a> after the <a href="https://docs.commercetools.com/apis/ctp:api:type:OrderSetBusinessUnitAction" rel="nofollow">Set Business Unit</a> update action on Orders or <a href="https://docs.commercetools.com/apis/ctp:api:type:StagedOrderSetBusinessUnitAction" rel="nofollow">Set Business Unit</a> update action on Order Edits.</p>
     * @param businessUnit value to be set
     * @return Builder
     */

    public OrderBusinessUnitSetMessagePayloadBuilder businessUnit(
            @Nullable final com.commercetools.api.models.business_unit.BusinessUnitKeyReference businessUnit) {
        this.businessUnit = businessUnit;
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnit" rel="nofollow">BusinessUnit</a> on the <a href="https://docs.commercetools.com/apis/ctp:api:type:Order" rel="nofollow">Order</a> before the <a href="https://docs.commercetools.com/apis/ctp:api:type:OrderSetBusinessUnitAction" rel="nofollow">Set Business Unit</a> update action on Orders or <a href="https://docs.commercetools.com/apis/ctp:api:type:StagedOrderSetBusinessUnitAction" rel="nofollow">Set Business Unit</a> update action on Order Edits.</p>
     * @param builder function to build the oldBusinessUnit value
     * @return Builder
     */

    public OrderBusinessUnitSetMessagePayloadBuilder oldBusinessUnit(
            Function<com.commercetools.api.models.business_unit.BusinessUnitKeyReferenceBuilder, com.commercetools.api.models.business_unit.BusinessUnitKeyReferenceBuilder> builder) {
        this.oldBusinessUnit = builder
                .apply(com.commercetools.api.models.business_unit.BusinessUnitKeyReferenceBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnit" rel="nofollow">BusinessUnit</a> on the <a href="https://docs.commercetools.com/apis/ctp:api:type:Order" rel="nofollow">Order</a> before the <a href="https://docs.commercetools.com/apis/ctp:api:type:OrderSetBusinessUnitAction" rel="nofollow">Set Business Unit</a> update action on Orders or <a href="https://docs.commercetools.com/apis/ctp:api:type:StagedOrderSetBusinessUnitAction" rel="nofollow">Set Business Unit</a> update action on Order Edits.</p>
     * @param builder function to build the oldBusinessUnit value
     * @return Builder
     */

    public OrderBusinessUnitSetMessagePayloadBuilder withOldBusinessUnit(
            Function<com.commercetools.api.models.business_unit.BusinessUnitKeyReferenceBuilder, com.commercetools.api.models.business_unit.BusinessUnitKeyReference> builder) {
        this.oldBusinessUnit = builder
                .apply(com.commercetools.api.models.business_unit.BusinessUnitKeyReferenceBuilder.of());
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnit" rel="nofollow">BusinessUnit</a> on the <a href="https://docs.commercetools.com/apis/ctp:api:type:Order" rel="nofollow">Order</a> before the <a href="https://docs.commercetools.com/apis/ctp:api:type:OrderSetBusinessUnitAction" rel="nofollow">Set Business Unit</a> update action on Orders or <a href="https://docs.commercetools.com/apis/ctp:api:type:StagedOrderSetBusinessUnitAction" rel="nofollow">Set Business Unit</a> update action on Order Edits.</p>
     * @param oldBusinessUnit value to be set
     * @return Builder
     */

    public OrderBusinessUnitSetMessagePayloadBuilder oldBusinessUnit(
            @Nullable final com.commercetools.api.models.business_unit.BusinessUnitKeyReference oldBusinessUnit) {
        this.oldBusinessUnit = oldBusinessUnit;
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnit" rel="nofollow">BusinessUnit</a> on the <a href="https://docs.commercetools.com/apis/ctp:api:type:Order" rel="nofollow">Order</a> after the <a href="https://docs.commercetools.com/apis/ctp:api:type:OrderSetBusinessUnitAction" rel="nofollow">Set Business Unit</a> update action on Orders or <a href="https://docs.commercetools.com/apis/ctp:api:type:StagedOrderSetBusinessUnitAction" rel="nofollow">Set Business Unit</a> update action on Order Edits.</p>
     * @return businessUnit
     */

    @Nullable
    public com.commercetools.api.models.business_unit.BusinessUnitKeyReference getBusinessUnit() {
        return this.businessUnit;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnit" rel="nofollow">BusinessUnit</a> on the <a href="https://docs.commercetools.com/apis/ctp:api:type:Order" rel="nofollow">Order</a> before the <a href="https://docs.commercetools.com/apis/ctp:api:type:OrderSetBusinessUnitAction" rel="nofollow">Set Business Unit</a> update action on Orders or <a href="https://docs.commercetools.com/apis/ctp:api:type:StagedOrderSetBusinessUnitAction" rel="nofollow">Set Business Unit</a> update action on Order Edits.</p>
     * @return oldBusinessUnit
     */

    @Nullable
    public com.commercetools.api.models.business_unit.BusinessUnitKeyReference getOldBusinessUnit() {
        return this.oldBusinessUnit;
    }

    /**
     * builds OrderBusinessUnitSetMessagePayload with checking for non-null required values
     * @return OrderBusinessUnitSetMessagePayload
     */
    public OrderBusinessUnitSetMessagePayload build() {
        return new OrderBusinessUnitSetMessagePayloadImpl(businessUnit, oldBusinessUnit);
    }

    /**
     * builds OrderBusinessUnitSetMessagePayload without checking for non-null required values
     * @return OrderBusinessUnitSetMessagePayload
     */
    public OrderBusinessUnitSetMessagePayload buildUnchecked() {
        return new OrderBusinessUnitSetMessagePayloadImpl(businessUnit, oldBusinessUnit);
    }

    /**
     * factory method for an instance of OrderBusinessUnitSetMessagePayloadBuilder
     * @return builder
     */
    public static OrderBusinessUnitSetMessagePayloadBuilder of() {
        return new OrderBusinessUnitSetMessagePayloadBuilder();
    }

    /**
     * create builder for OrderBusinessUnitSetMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderBusinessUnitSetMessagePayloadBuilder of(final OrderBusinessUnitSetMessagePayload template) {
        OrderBusinessUnitSetMessagePayloadBuilder builder = new OrderBusinessUnitSetMessagePayloadBuilder();
        builder.businessUnit = template.getBusinessUnit();
        builder.oldBusinessUnit = template.getOldBusinessUnit();
        return builder;
    }

}
