
package com.commercetools.api.models.business_unit;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * BusinessUnitSetUnitTypeActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     BusinessUnitSetUnitTypeAction businessUnitSetUnitTypeAction = BusinessUnitSetUnitTypeAction.builder()
 *             .unitType(BusinessUnitType.COMPANY)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class BusinessUnitSetUnitTypeActionBuilder implements Builder<BusinessUnitSetUnitTypeAction> {

    private com.commercetools.api.models.business_unit.BusinessUnitType unitType;

    @Nullable
    private com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifier parentUnit;

    /**
     *  <p>New type of the <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnit" rel="nofollow">Business Unit</a>.</p>
     *  <p>If <code>unitType="Company"</code>, the Business Unit <code>storeMode</code>, <code>associateMode</code>, and <code>approvalRuleMode</code> field values must be <code>Explicit</code>.</p>
     * @param unitType value to be set
     * @return Builder
     */

    public BusinessUnitSetUnitTypeActionBuilder unitType(
            final com.commercetools.api.models.business_unit.BusinessUnitType unitType) {
        this.unitType = unitType;
        return this;
    }

    /**
     *  <p>New parent unit for the <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnit" rel="nofollow">Business Unit</a>, if <code>unitType="Division"</code>.</p>
     * @param builder function to build the parentUnit value
     * @return Builder
     */

    public BusinessUnitSetUnitTypeActionBuilder parentUnit(
            Function<com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifierBuilder, com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifierBuilder> builder) {
        this.parentUnit = builder
                .apply(com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifierBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>New parent unit for the <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnit" rel="nofollow">Business Unit</a>, if <code>unitType="Division"</code>.</p>
     * @param builder function to build the parentUnit value
     * @return Builder
     */

    public BusinessUnitSetUnitTypeActionBuilder withParentUnit(
            Function<com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifierBuilder, com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifier> builder) {
        this.parentUnit = builder
                .apply(com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifierBuilder.of());
        return this;
    }

    /**
     *  <p>New parent unit for the <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnit" rel="nofollow">Business Unit</a>, if <code>unitType="Division"</code>.</p>
     * @param parentUnit value to be set
     * @return Builder
     */

    public BusinessUnitSetUnitTypeActionBuilder parentUnit(
            @Nullable final com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifier parentUnit) {
        this.parentUnit = parentUnit;
        return this;
    }

    /**
     *  <p>New type of the <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnit" rel="nofollow">Business Unit</a>.</p>
     *  <p>If <code>unitType="Company"</code>, the Business Unit <code>storeMode</code>, <code>associateMode</code>, and <code>approvalRuleMode</code> field values must be <code>Explicit</code>.</p>
     * @return unitType
     */

    public com.commercetools.api.models.business_unit.BusinessUnitType getUnitType() {
        return this.unitType;
    }

    /**
     *  <p>New parent unit for the <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnit" rel="nofollow">Business Unit</a>, if <code>unitType="Division"</code>.</p>
     * @return parentUnit
     */

    @Nullable
    public com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifier getParentUnit() {
        return this.parentUnit;
    }

    /**
     * builds BusinessUnitSetUnitTypeAction with checking for non-null required values
     * @return BusinessUnitSetUnitTypeAction
     */
    public BusinessUnitSetUnitTypeAction build() {
        Objects.requireNonNull(unitType, BusinessUnitSetUnitTypeAction.class + ": unitType is missing");
        return new BusinessUnitSetUnitTypeActionImpl(unitType, parentUnit);
    }

    /**
     * builds BusinessUnitSetUnitTypeAction without checking for non-null required values
     * @return BusinessUnitSetUnitTypeAction
     */
    public BusinessUnitSetUnitTypeAction buildUnchecked() {
        return new BusinessUnitSetUnitTypeActionImpl(unitType, parentUnit);
    }

    /**
     * factory method for an instance of BusinessUnitSetUnitTypeActionBuilder
     * @return builder
     */
    public static BusinessUnitSetUnitTypeActionBuilder of() {
        return new BusinessUnitSetUnitTypeActionBuilder();
    }

    /**
     * create builder for BusinessUnitSetUnitTypeAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static BusinessUnitSetUnitTypeActionBuilder of(final BusinessUnitSetUnitTypeAction template) {
        BusinessUnitSetUnitTypeActionBuilder builder = new BusinessUnitSetUnitTypeActionBuilder();
        builder.unitType = template.getUnitType();
        builder.parentUnit = template.getParentUnit();
        return builder;
    }

}
