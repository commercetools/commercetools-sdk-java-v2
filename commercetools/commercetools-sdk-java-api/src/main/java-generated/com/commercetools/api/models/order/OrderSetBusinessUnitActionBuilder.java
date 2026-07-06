
package com.commercetools.api.models.order;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * OrderSetBusinessUnitActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderSetBusinessUnitAction orderSetBusinessUnitAction = OrderSetBusinessUnitAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class OrderSetBusinessUnitActionBuilder implements Builder<OrderSetBusinessUnitAction> {

    @Nullable
    private com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifier businessUnit;

    /**
     *  <p>New Business Unit to assign to the Order. If empty, any existing value is removed.</p>
     *  <p>If the referenced Business Unit does not exist, a <a href="https://docs.commercetools.com/apis/ctp:api:type:ReferencedResourceNotFoundError" rel="nofollow">ReferencedResourceNotFound</a> error is returned.</p>
     * @param builder function to build the businessUnit value
     * @return Builder
     */

    public OrderSetBusinessUnitActionBuilder businessUnit(
            Function<com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifierBuilder, com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifierBuilder> builder) {
        this.businessUnit = builder
                .apply(com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifierBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>New Business Unit to assign to the Order. If empty, any existing value is removed.</p>
     *  <p>If the referenced Business Unit does not exist, a <a href="https://docs.commercetools.com/apis/ctp:api:type:ReferencedResourceNotFoundError" rel="nofollow">ReferencedResourceNotFound</a> error is returned.</p>
     * @param builder function to build the businessUnit value
     * @return Builder
     */

    public OrderSetBusinessUnitActionBuilder withBusinessUnit(
            Function<com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifierBuilder, com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifier> builder) {
        this.businessUnit = builder
                .apply(com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifierBuilder.of());
        return this;
    }

    /**
     *  <p>New Business Unit to assign to the Order. If empty, any existing value is removed.</p>
     *  <p>If the referenced Business Unit does not exist, a <a href="https://docs.commercetools.com/apis/ctp:api:type:ReferencedResourceNotFoundError" rel="nofollow">ReferencedResourceNotFound</a> error is returned.</p>
     * @param businessUnit value to be set
     * @return Builder
     */

    public OrderSetBusinessUnitActionBuilder businessUnit(
            @Nullable final com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifier businessUnit) {
        this.businessUnit = businessUnit;
        return this;
    }

    /**
     *  <p>New Business Unit to assign to the Order. If empty, any existing value is removed.</p>
     *  <p>If the referenced Business Unit does not exist, a <a href="https://docs.commercetools.com/apis/ctp:api:type:ReferencedResourceNotFoundError" rel="nofollow">ReferencedResourceNotFound</a> error is returned.</p>
     * @return businessUnit
     */

    @Nullable
    public com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifier getBusinessUnit() {
        return this.businessUnit;
    }

    /**
     * builds OrderSetBusinessUnitAction with checking for non-null required values
     * @return OrderSetBusinessUnitAction
     */
    public OrderSetBusinessUnitAction build() {
        return new OrderSetBusinessUnitActionImpl(businessUnit);
    }

    /**
     * builds OrderSetBusinessUnitAction without checking for non-null required values
     * @return OrderSetBusinessUnitAction
     */
    public OrderSetBusinessUnitAction buildUnchecked() {
        return new OrderSetBusinessUnitActionImpl(businessUnit);
    }

    /**
     * factory method for an instance of OrderSetBusinessUnitActionBuilder
     * @return builder
     */
    public static OrderSetBusinessUnitActionBuilder of() {
        return new OrderSetBusinessUnitActionBuilder();
    }

    /**
     * create builder for OrderSetBusinessUnitAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderSetBusinessUnitActionBuilder of(final OrderSetBusinessUnitAction template) {
        OrderSetBusinessUnitActionBuilder builder = new OrderSetBusinessUnitActionBuilder();
        builder.businessUnit = template.getBusinessUnit();
        return builder;
    }

}
