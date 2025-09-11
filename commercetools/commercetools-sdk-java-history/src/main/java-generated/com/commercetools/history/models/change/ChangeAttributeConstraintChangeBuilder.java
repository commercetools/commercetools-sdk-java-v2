
package com.commercetools.history.models.change;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ChangeAttributeConstraintChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ChangeAttributeConstraintChange changeAttributeConstraintChange = ChangeAttributeConstraintChange.builder()
 *             .change("{change}")
 *             .previousValue(AttributeConstraintEnum.NONE)
 *             .nextValue(AttributeConstraintEnum.NONE)
 *             .attributeName("{attributeName}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ChangeAttributeConstraintChangeBuilder implements Builder<ChangeAttributeConstraintChange> {

    private String change;

    private com.commercetools.history.models.common.AttributeConstraintEnum previousValue;

    private com.commercetools.history.models.common.AttributeConstraintEnum nextValue;

    private String attributeName;

    /**
     * set the value to the change
     * @param change value to be set
     * @return Builder
     */

    public ChangeAttributeConstraintChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     * @return Builder
     */

    public ChangeAttributeConstraintChangeBuilder previousValue(
            final com.commercetools.history.models.common.AttributeConstraintEnum previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     * @return Builder
     */

    public ChangeAttributeConstraintChangeBuilder nextValue(
            final com.commercetools.history.models.common.AttributeConstraintEnum nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    /**
     *  <p>Name of the updated <a href="https://docs.commercetools.com/apis/ctp:api:type:AttributeDefinition" rel="nofollow">AttributeDefinition</a>.</p>
     * @param attributeName value to be set
     * @return Builder
     */

    public ChangeAttributeConstraintChangeBuilder attributeName(final String attributeName) {
        this.attributeName = attributeName;
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
     *  <p>Value before the change.</p>
     * @return previousValue
     */

    public com.commercetools.history.models.common.AttributeConstraintEnum getPreviousValue() {
        return this.previousValue;
    }

    /**
     *  <p>Value after the change.</p>
     * @return nextValue
     */

    public com.commercetools.history.models.common.AttributeConstraintEnum getNextValue() {
        return this.nextValue;
    }

    /**
     *  <p>Name of the updated <a href="https://docs.commercetools.com/apis/ctp:api:type:AttributeDefinition" rel="nofollow">AttributeDefinition</a>.</p>
     * @return attributeName
     */

    public String getAttributeName() {
        return this.attributeName;
    }

    /**
     * builds ChangeAttributeConstraintChange with checking for non-null required values
     * @return ChangeAttributeConstraintChange
     */
    public ChangeAttributeConstraintChange build() {
        Objects.requireNonNull(change, ChangeAttributeConstraintChange.class + ": change is missing");
        Objects.requireNonNull(previousValue, ChangeAttributeConstraintChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, ChangeAttributeConstraintChange.class + ": nextValue is missing");
        Objects.requireNonNull(attributeName, ChangeAttributeConstraintChange.class + ": attributeName is missing");
        return new ChangeAttributeConstraintChangeImpl(change, previousValue, nextValue, attributeName);
    }

    /**
     * builds ChangeAttributeConstraintChange without checking for non-null required values
     * @return ChangeAttributeConstraintChange
     */
    public ChangeAttributeConstraintChange buildUnchecked() {
        return new ChangeAttributeConstraintChangeImpl(change, previousValue, nextValue, attributeName);
    }

    /**
     * factory method for an instance of ChangeAttributeConstraintChangeBuilder
     * @return builder
     */
    public static ChangeAttributeConstraintChangeBuilder of() {
        return new ChangeAttributeConstraintChangeBuilder();
    }

    /**
     * create builder for ChangeAttributeConstraintChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ChangeAttributeConstraintChangeBuilder of(final ChangeAttributeConstraintChange template) {
        ChangeAttributeConstraintChangeBuilder builder = new ChangeAttributeConstraintChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        builder.attributeName = template.getAttributeName();
        return builder;
    }

}
