
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetUnitTypeChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetUnitTypeChange setUnitTypeChange = SetUnitTypeChange.builder()
 *             .change("{change}")
 *             .parentUnit(parentUnitBuilder -> parentUnitBuilder)
 *             .previousValue(BusinessUnitType.COMPANY)
 *             .nextValue(BusinessUnitType.COMPANY)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SetUnitTypeChangeBuilder implements Builder<SetUnitTypeChange> {

    private String change;

    private com.commercetools.history.models.common.BusinessUnitResourceIdentifier parentUnit;

    private com.commercetools.history.models.common.BusinessUnitType previousValue;

    private com.commercetools.history.models.common.BusinessUnitType nextValue;

    /**
     * set the value to the change
     * @param change value to be set
     * @return Builder
     */

    public SetUnitTypeChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     *  <p>If <code>unitType="Division"</code>, reference to the new parent unit for the <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnit" rel="nofollow">Business Unit</a>.</p>
     * @param builder function to build the parentUnit value
     * @return Builder
     */

    public SetUnitTypeChangeBuilder parentUnit(
            Function<com.commercetools.history.models.common.BusinessUnitResourceIdentifierBuilder, com.commercetools.history.models.common.BusinessUnitResourceIdentifierBuilder> builder) {
        this.parentUnit = builder
                .apply(com.commercetools.history.models.common.BusinessUnitResourceIdentifierBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>If <code>unitType="Division"</code>, reference to the new parent unit for the <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnit" rel="nofollow">Business Unit</a>.</p>
     * @param builder function to build the parentUnit value
     * @return Builder
     */

    public SetUnitTypeChangeBuilder withParentUnit(
            Function<com.commercetools.history.models.common.BusinessUnitResourceIdentifierBuilder, com.commercetools.history.models.common.BusinessUnitResourceIdentifier> builder) {
        this.parentUnit = builder
                .apply(com.commercetools.history.models.common.BusinessUnitResourceIdentifierBuilder.of());
        return this;
    }

    /**
     *  <p>If <code>unitType="Division"</code>, reference to the new parent unit for the <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnit" rel="nofollow">Business Unit</a>.</p>
     * @param parentUnit value to be set
     * @return Builder
     */

    public SetUnitTypeChangeBuilder parentUnit(
            final com.commercetools.history.models.common.BusinessUnitResourceIdentifier parentUnit) {
        this.parentUnit = parentUnit;
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     * @return Builder
     */

    public SetUnitTypeChangeBuilder previousValue(
            final com.commercetools.history.models.common.BusinessUnitType previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     * @return Builder
     */

    public SetUnitTypeChangeBuilder nextValue(
            final com.commercetools.history.models.common.BusinessUnitType nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    /**
     * value of change}
     * @return change
     */

    public String getChange() {
        return this.change;
    }

    /**
     *  <p>If <code>unitType="Division"</code>, reference to the new parent unit for the <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnit" rel="nofollow">Business Unit</a>.</p>
     * @return parentUnit
     */

    public com.commercetools.history.models.common.BusinessUnitResourceIdentifier getParentUnit() {
        return this.parentUnit;
    }

    /**
     *  <p>Value before the change.</p>
     * @return previousValue
     */

    public com.commercetools.history.models.common.BusinessUnitType getPreviousValue() {
        return this.previousValue;
    }

    /**
     *  <p>Value after the change.</p>
     * @return nextValue
     */

    public com.commercetools.history.models.common.BusinessUnitType getNextValue() {
        return this.nextValue;
    }

    /**
     * builds SetUnitTypeChange with checking for non-null required values
     * @return SetUnitTypeChange
     */
    public SetUnitTypeChange build() {
        Objects.requireNonNull(change, SetUnitTypeChange.class + ": change is missing");
        Objects.requireNonNull(parentUnit, SetUnitTypeChange.class + ": parentUnit is missing");
        Objects.requireNonNull(previousValue, SetUnitTypeChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, SetUnitTypeChange.class + ": nextValue is missing");
        return new SetUnitTypeChangeImpl(change, parentUnit, previousValue, nextValue);
    }

    /**
     * builds SetUnitTypeChange without checking for non-null required values
     * @return SetUnitTypeChange
     */
    public SetUnitTypeChange buildUnchecked() {
        return new SetUnitTypeChangeImpl(change, parentUnit, previousValue, nextValue);
    }

    /**
     * factory method for an instance of SetUnitTypeChangeBuilder
     * @return builder
     */
    public static SetUnitTypeChangeBuilder of() {
        return new SetUnitTypeChangeBuilder();
    }

    /**
     * create builder for SetUnitTypeChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetUnitTypeChangeBuilder of(final SetUnitTypeChange template) {
        SetUnitTypeChangeBuilder builder = new SetUnitTypeChangeBuilder();
        builder.change = template.getChange();
        builder.parentUnit = template.getParentUnit();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
