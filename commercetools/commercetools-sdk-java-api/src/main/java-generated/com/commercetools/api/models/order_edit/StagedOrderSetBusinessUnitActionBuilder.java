
package com.commercetools.api.models.order_edit;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * StagedOrderSetBusinessUnitActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StagedOrderSetBusinessUnitAction stagedOrderSetBusinessUnitAction = StagedOrderSetBusinessUnitAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StagedOrderSetBusinessUnitActionBuilder implements Builder<StagedOrderSetBusinessUnitAction> {

    @Nullable
    private com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifier businessUnit;

    /**
     *  <p>New Business Unit to assign to the Order. If empty, any existing value is removed.</p>
     *  <p>If the referenced Business Unit does not exist, a ReferencedResourceNotFound error is returned.</p>
     * @param builder function to build the businessUnit value
     * @return Builder
     */

    public StagedOrderSetBusinessUnitActionBuilder businessUnit(
            Function<com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifierBuilder, com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifierBuilder> builder) {
        this.businessUnit = builder
                .apply(com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifierBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>New Business Unit to assign to the Order. If empty, any existing value is removed.</p>
     *  <p>If the referenced Business Unit does not exist, a ReferencedResourceNotFound error is returned.</p>
     * @param builder function to build the businessUnit value
     * @return Builder
     */

    public StagedOrderSetBusinessUnitActionBuilder withBusinessUnit(
            Function<com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifierBuilder, com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifier> builder) {
        this.businessUnit = builder
                .apply(com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifierBuilder.of());
        return this;
    }

    /**
     *  <p>New Business Unit to assign to the Order. If empty, any existing value is removed.</p>
     *  <p>If the referenced Business Unit does not exist, a ReferencedResourceNotFound error is returned.</p>
     * @param businessUnit value to be set
     * @return Builder
     */

    public StagedOrderSetBusinessUnitActionBuilder businessUnit(
            @Nullable final com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifier businessUnit) {
        this.businessUnit = businessUnit;
        return this;
    }

    /**
     *  <p>New Business Unit to assign to the Order. If empty, any existing value is removed.</p>
     *  <p>If the referenced Business Unit does not exist, a ReferencedResourceNotFound error is returned.</p>
     * @return businessUnit
     */

    @Nullable
    public com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifier getBusinessUnit() {
        return this.businessUnit;
    }

    /**
     * builds StagedOrderSetBusinessUnitAction with checking for non-null required values
     * @return StagedOrderSetBusinessUnitAction
     */
    public StagedOrderSetBusinessUnitAction build() {
        return new StagedOrderSetBusinessUnitActionImpl(businessUnit);
    }

    /**
     * builds StagedOrderSetBusinessUnitAction without checking for non-null required values
     * @return StagedOrderSetBusinessUnitAction
     */
    public StagedOrderSetBusinessUnitAction buildUnchecked() {
        return new StagedOrderSetBusinessUnitActionImpl(businessUnit);
    }

    /**
     * factory method for an instance of StagedOrderSetBusinessUnitActionBuilder
     * @return builder
     */
    public static StagedOrderSetBusinessUnitActionBuilder of() {
        return new StagedOrderSetBusinessUnitActionBuilder();
    }

    /**
     * create builder for StagedOrderSetBusinessUnitAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StagedOrderSetBusinessUnitActionBuilder of(final StagedOrderSetBusinessUnitAction template) {
        StagedOrderSetBusinessUnitActionBuilder builder = new StagedOrderSetBusinessUnitActionBuilder();
        builder.businessUnit = template.getBusinessUnit();
        return builder;
    }

}
