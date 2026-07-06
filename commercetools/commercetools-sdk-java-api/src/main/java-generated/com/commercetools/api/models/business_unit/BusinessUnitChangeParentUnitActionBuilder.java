
package com.commercetools.api.models.business_unit;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * BusinessUnitChangeParentUnitActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     BusinessUnitChangeParentUnitAction businessUnitChangeParentUnitAction = BusinessUnitChangeParentUnitAction.builder()
 *             .parentUnit(parentUnitBuilder -> parentUnitBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class BusinessUnitChangeParentUnitActionBuilder implements Builder<BusinessUnitChangeParentUnitAction> {

    private com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifier parentUnit;

    /**
     *  <p>New parent unit of the <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnit" rel="nofollow">Business Unit</a>. It must be associated with the same Stores, as the old parent unit.</p>
     *  <p>The Business Unit <code>inheritedAssociates</code> and <code>inheritedStores</code> field values will be <span>eventually consistent</span>.</p>
     * @param builder function to build the parentUnit value
     * @return Builder
     */

    public BusinessUnitChangeParentUnitActionBuilder parentUnit(
            Function<com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifierBuilder, com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifierBuilder> builder) {
        this.parentUnit = builder
                .apply(com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifierBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>New parent unit of the <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnit" rel="nofollow">Business Unit</a>. It must be associated with the same Stores, as the old parent unit.</p>
     *  <p>The Business Unit <code>inheritedAssociates</code> and <code>inheritedStores</code> field values will be <span>eventually consistent</span>.</p>
     * @param builder function to build the parentUnit value
     * @return Builder
     */

    public BusinessUnitChangeParentUnitActionBuilder withParentUnit(
            Function<com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifierBuilder, com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifier> builder) {
        this.parentUnit = builder
                .apply(com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifierBuilder.of());
        return this;
    }

    /**
     *  <p>New parent unit of the <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnit" rel="nofollow">Business Unit</a>. It must be associated with the same Stores, as the old parent unit.</p>
     *  <p>The Business Unit <code>inheritedAssociates</code> and <code>inheritedStores</code> field values will be <span>eventually consistent</span>.</p>
     * @param parentUnit value to be set
     * @return Builder
     */

    public BusinessUnitChangeParentUnitActionBuilder parentUnit(
            final com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifier parentUnit) {
        this.parentUnit = parentUnit;
        return this;
    }

    /**
     *  <p>New parent unit of the <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnit" rel="nofollow">Business Unit</a>. It must be associated with the same Stores, as the old parent unit.</p>
     *  <p>The Business Unit <code>inheritedAssociates</code> and <code>inheritedStores</code> field values will be <span>eventually consistent</span>.</p>
     * @return parentUnit
     */

    public com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifier getParentUnit() {
        return this.parentUnit;
    }

    /**
     * builds BusinessUnitChangeParentUnitAction with checking for non-null required values
     * @return BusinessUnitChangeParentUnitAction
     */
    public BusinessUnitChangeParentUnitAction build() {
        Objects.requireNonNull(parentUnit, BusinessUnitChangeParentUnitAction.class + ": parentUnit is missing");
        return new BusinessUnitChangeParentUnitActionImpl(parentUnit);
    }

    /**
     * builds BusinessUnitChangeParentUnitAction without checking for non-null required values
     * @return BusinessUnitChangeParentUnitAction
     */
    public BusinessUnitChangeParentUnitAction buildUnchecked() {
        return new BusinessUnitChangeParentUnitActionImpl(parentUnit);
    }

    /**
     * factory method for an instance of BusinessUnitChangeParentUnitActionBuilder
     * @return builder
     */
    public static BusinessUnitChangeParentUnitActionBuilder of() {
        return new BusinessUnitChangeParentUnitActionBuilder();
    }

    /**
     * create builder for BusinessUnitChangeParentUnitAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static BusinessUnitChangeParentUnitActionBuilder of(final BusinessUnitChangeParentUnitAction template) {
        BusinessUnitChangeParentUnitActionBuilder builder = new BusinessUnitChangeParentUnitActionBuilder();
        builder.parentUnit = template.getParentUnit();
        return builder;
    }

}
