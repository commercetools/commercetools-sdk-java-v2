
package com.commercetools.history.models.change;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ChangeInputHintChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ChangeInputHintChange changeInputHintChange = ChangeInputHintChange.builder()
 *             .change("{change}")
 *             .fieldName("{fieldName}")
 *             .attributeName("{attributeName}")
 *             .nextValue(TextInputHint.SINGLE_LINE)
 *             .previousValue(TextInputHint.SINGLE_LINE)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ChangeInputHintChangeBuilder implements Builder<ChangeInputHintChange> {

    private String change;

    private String fieldName;

    private String attributeName;

    private com.commercetools.history.models.common.TextInputHint nextValue;

    private com.commercetools.history.models.common.TextInputHint previousValue;

    /**
     *  <p>Update action for <code>changeInputHint</code> on product types and types</p>
     * @param change value to be set
     * @return Builder
     */

    public ChangeInputHintChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     *  <p>The name of the field definition updated.</p>
     * @param fieldName value to be set
     * @return Builder
     */

    public ChangeInputHintChangeBuilder fieldName(final String fieldName) {
        this.fieldName = fieldName;
        return this;
    }

    /**
     *  <p>The name of the attribute updated.</p>
     * @param attributeName value to be set
     * @return Builder
     */

    public ChangeInputHintChangeBuilder attributeName(final String attributeName) {
        this.attributeName = attributeName;
        return this;
    }

    /**
     * set the value to the nextValue
     * @param nextValue value to be set
     * @return Builder
     */

    public ChangeInputHintChangeBuilder nextValue(
            final com.commercetools.history.models.common.TextInputHint nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    /**
     * set the value to the previousValue
     * @param previousValue value to be set
     * @return Builder
     */

    public ChangeInputHintChangeBuilder previousValue(
            final com.commercetools.history.models.common.TextInputHint previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     *  <p>Update action for <code>changeInputHint</code> on product types and types</p>
     * @return change
     */

    public String getChange() {
        return this.change;
    }

    /**
     *  <p>The name of the field definition updated.</p>
     * @return fieldName
     */

    public String getFieldName() {
        return this.fieldName;
    }

    /**
     *  <p>The name of the attribute updated.</p>
     * @return attributeName
     */

    public String getAttributeName() {
        return this.attributeName;
    }

    /**
     * value of nextValue}
     * @return nextValue
     */

    public com.commercetools.history.models.common.TextInputHint getNextValue() {
        return this.nextValue;
    }

    /**
     * value of previousValue}
     * @return previousValue
     */

    public com.commercetools.history.models.common.TextInputHint getPreviousValue() {
        return this.previousValue;
    }

    /**
     * builds ChangeInputHintChange with checking for non-null required values
     * @return ChangeInputHintChange
     */
    public ChangeInputHintChange build() {
        Objects.requireNonNull(change, ChangeInputHintChange.class + ": change is missing");
        Objects.requireNonNull(fieldName, ChangeInputHintChange.class + ": fieldName is missing");
        Objects.requireNonNull(attributeName, ChangeInputHintChange.class + ": attributeName is missing");
        Objects.requireNonNull(nextValue, ChangeInputHintChange.class + ": nextValue is missing");
        Objects.requireNonNull(previousValue, ChangeInputHintChange.class + ": previousValue is missing");
        return new ChangeInputHintChangeImpl(change, fieldName, attributeName, nextValue, previousValue);
    }

    /**
     * builds ChangeInputHintChange without checking for non-null required values
     * @return ChangeInputHintChange
     */
    public ChangeInputHintChange buildUnchecked() {
        return new ChangeInputHintChangeImpl(change, fieldName, attributeName, nextValue, previousValue);
    }

    /**
     * factory method for an instance of ChangeInputHintChangeBuilder
     * @return builder
     */
    public static ChangeInputHintChangeBuilder of() {
        return new ChangeInputHintChangeBuilder();
    }

    /**
     * create builder for ChangeInputHintChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ChangeInputHintChangeBuilder of(final ChangeInputHintChange template) {
        ChangeInputHintChangeBuilder builder = new ChangeInputHintChangeBuilder();
        builder.change = template.getChange();
        builder.fieldName = template.getFieldName();
        builder.attributeName = template.getAttributeName();
        builder.nextValue = template.getNextValue();
        builder.previousValue = template.getPreviousValue();
        return builder;
    }

}
