
package com.commercetools.history.models.change;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ChangeEnumValueLabelChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ChangeEnumValueLabelChange changeEnumValueLabelChange = ChangeEnumValueLabelChange.builder()
 *             .change("{change}")
 *             .previousValue("{previousValue}")
 *             .nextValue("{nextValue}")
 *             .fieldName("{fieldName}")
 *             .valueKey("{valueKey}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ChangeEnumValueLabelChangeBuilder implements Builder<ChangeEnumValueLabelChange> {

    private String change;

    private String previousValue;

    private String nextValue;

    private String fieldName;

    private String valueKey;

    /**
     * set the value to the change
     * @param change value to be set
     * @return Builder
     */

    public ChangeEnumValueLabelChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     * @return Builder
     */

    public ChangeEnumValueLabelChangeBuilder previousValue(final String previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     * @return Builder
     */

    public ChangeEnumValueLabelChangeBuilder nextValue(final String nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    /**
     *  <p>Name of the updated <a href="https://docs.commercetools.com/apis/ctp:api:type:FieldDefinition" rel="nofollow">FieldDefinition</a>.</p>
     * @param fieldName value to be set
     * @return Builder
     */

    public ChangeEnumValueLabelChangeBuilder fieldName(final String fieldName) {
        this.fieldName = fieldName;
        return this;
    }

    /**
     *  <p>Key of the updated values.</p>
     * @param valueKey value to be set
     * @return Builder
     */

    public ChangeEnumValueLabelChangeBuilder valueKey(final String valueKey) {
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
     *  <p>Name of the updated <a href="https://docs.commercetools.com/apis/ctp:api:type:FieldDefinition" rel="nofollow">FieldDefinition</a>.</p>
     * @return fieldName
     */

    public String getFieldName() {
        return this.fieldName;
    }

    /**
     *  <p>Key of the updated values.</p>
     * @return valueKey
     */

    public String getValueKey() {
        return this.valueKey;
    }

    /**
     * builds ChangeEnumValueLabelChange with checking for non-null required values
     * @return ChangeEnumValueLabelChange
     */
    public ChangeEnumValueLabelChange build() {
        Objects.requireNonNull(change, ChangeEnumValueLabelChange.class + ": change is missing");
        Objects.requireNonNull(previousValue, ChangeEnumValueLabelChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, ChangeEnumValueLabelChange.class + ": nextValue is missing");
        Objects.requireNonNull(fieldName, ChangeEnumValueLabelChange.class + ": fieldName is missing");
        Objects.requireNonNull(valueKey, ChangeEnumValueLabelChange.class + ": valueKey is missing");
        return new ChangeEnumValueLabelChangeImpl(change, previousValue, nextValue, fieldName, valueKey);
    }

    /**
     * builds ChangeEnumValueLabelChange without checking for non-null required values
     * @return ChangeEnumValueLabelChange
     */
    public ChangeEnumValueLabelChange buildUnchecked() {
        return new ChangeEnumValueLabelChangeImpl(change, previousValue, nextValue, fieldName, valueKey);
    }

    /**
     * factory method for an instance of ChangeEnumValueLabelChangeBuilder
     * @return builder
     */
    public static ChangeEnumValueLabelChangeBuilder of() {
        return new ChangeEnumValueLabelChangeBuilder();
    }

    /**
     * create builder for ChangeEnumValueLabelChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ChangeEnumValueLabelChangeBuilder of(final ChangeEnumValueLabelChange template) {
        ChangeEnumValueLabelChangeBuilder builder = new ChangeEnumValueLabelChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        builder.fieldName = template.getFieldName();
        builder.valueKey = template.getValueKey();
        return builder;
    }

}
