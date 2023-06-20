
package com.commercetools.history.models.change;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ChangePlainEnumValueLabelChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ChangePlainEnumValueLabelChange changePlainEnumValueLabelChange = ChangePlainEnumValueLabelChange.builder()
 *             .change("{change}")
 *             .previousValue("{previousValue}")
 *             .nextValue("{nextValue}")
 *             .attributeName("{attributeName}")
 *             .valueKey("{valueKey}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ChangePlainEnumValueLabelChangeBuilder implements Builder<ChangePlainEnumValueLabelChange> {

    private String change;

    private String previousValue;

    private String nextValue;

    private String attributeName;

    private String valueKey;

    /**
     * set the value to the change
     * @param change value to be set
     * @return Builder
     */

    public ChangePlainEnumValueLabelChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     * @return Builder
     */

    public ChangePlainEnumValueLabelChangeBuilder previousValue(final String previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     * @return Builder
     */

    public ChangePlainEnumValueLabelChangeBuilder nextValue(final String nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    /**
     *  <p>Name of the updated AttributeDefinition.</p>
     * @param attributeName value to be set
     * @return Builder
     */

    public ChangePlainEnumValueLabelChangeBuilder attributeName(final String attributeName) {
        this.attributeName = attributeName;
        return this;
    }

    /**
     *  <p>Key of the updated values.</p>
     * @param valueKey value to be set
     * @return Builder
     */

    public ChangePlainEnumValueLabelChangeBuilder valueKey(final String valueKey) {
        this.valueKey = valueKey;
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

    public String getPreviousValue() {
        return this.previousValue;
    }

    /**
     *  <p>Value after the change.</p>
     * @return nextValue
     */

    public String getNextValue() {
        return this.nextValue;
    }

    /**
     *  <p>Name of the updated AttributeDefinition.</p>
     * @return attributeName
     */

    public String getAttributeName() {
        return this.attributeName;
    }

    /**
     *  <p>Key of the updated values.</p>
     * @return valueKey
     */

    public String getValueKey() {
        return this.valueKey;
    }

    /**
     * builds ChangePlainEnumValueLabelChange with checking for non-null required values
     * @return ChangePlainEnumValueLabelChange
     */
    public ChangePlainEnumValueLabelChange build() {
        Objects.requireNonNull(change, ChangePlainEnumValueLabelChange.class + ": change is missing");
        Objects.requireNonNull(previousValue, ChangePlainEnumValueLabelChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, ChangePlainEnumValueLabelChange.class + ": nextValue is missing");
        Objects.requireNonNull(attributeName, ChangePlainEnumValueLabelChange.class + ": attributeName is missing");
        Objects.requireNonNull(valueKey, ChangePlainEnumValueLabelChange.class + ": valueKey is missing");
        return new ChangePlainEnumValueLabelChangeImpl(change, previousValue, nextValue, attributeName, valueKey);
    }

    /**
     * builds ChangePlainEnumValueLabelChange without checking for non-null required values
     * @return ChangePlainEnumValueLabelChange
     */
    public ChangePlainEnumValueLabelChange buildUnchecked() {
        return new ChangePlainEnumValueLabelChangeImpl(change, previousValue, nextValue, attributeName, valueKey);
    }

    /**
     * factory method for an instance of ChangePlainEnumValueLabelChangeBuilder
     * @return builder
     */
    public static ChangePlainEnumValueLabelChangeBuilder of() {
        return new ChangePlainEnumValueLabelChangeBuilder();
    }

    /**
     * create builder for ChangePlainEnumValueLabelChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ChangePlainEnumValueLabelChangeBuilder of(final ChangePlainEnumValueLabelChange template) {
        ChangePlainEnumValueLabelChangeBuilder builder = new ChangePlainEnumValueLabelChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        builder.attributeName = template.getAttributeName();
        builder.valueKey = template.getValueKey();
        return builder;
    }

}
