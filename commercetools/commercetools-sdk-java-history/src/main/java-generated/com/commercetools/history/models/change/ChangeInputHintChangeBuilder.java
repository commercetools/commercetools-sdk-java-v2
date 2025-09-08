
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
 *             .previousValue(TextInputHint.SINGLE_LINE)
 *             .nextValue(TextInputHint.SINGLE_LINE)
 *             .fieldName("{fieldName}")
 *             .attributeName("{attributeName}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ChangeInputHintChangeBuilder implements Builder<ChangeInputHintChange> {

    private String change;

    private com.commercetools.history.models.common.TextInputHint previousValue;

    private com.commercetools.history.models.common.TextInputHint nextValue;

    private String fieldName;

    private String attributeName;

    /**
     * set the value to the change
     * @param change value to be set
     * @return Builder
     */

    public ChangeInputHintChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     * @return Builder
     */

    public ChangeInputHintChangeBuilder previousValue(
            final com.commercetools.history.models.common.TextInputHint previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     * @return Builder
     */

    public ChangeInputHintChangeBuilder nextValue(
            final com.commercetools.history.models.common.TextInputHint nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    /**
     *  <p>Name of the updated <a href="https://docs.commercetools.com/apis/ctp:api:type:FieldDefinition" rel="nofollow">FieldDefinition</a>; only present on changes to Types.</p>
     * @param fieldName value to be set
     * @return Builder
     */

    public ChangeInputHintChangeBuilder fieldName(final String fieldName) {
        this.fieldName = fieldName;
        return this;
    }

    /**
     *  <p>Name of the updated <a href="https://docs.commercetools.com/apis/ctp:api:type:AttributeDefinition" rel="nofollow">AttributeDefinition</a>; only present on changes to Product Types.</p>
     * @param attributeName value to be set
     * @return Builder
     */

    public ChangeInputHintChangeBuilder attributeName(final String attributeName) {
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

    public com.commercetools.history.models.common.TextInputHint getPreviousValue() {
        return this.previousValue;
    }

    /**
     *  <p>Value after the change.</p>
     * @return nextValue
     */

    public com.commercetools.history.models.common.TextInputHint getNextValue() {
        return this.nextValue;
    }

    /**
     *  <p>Name of the updated <a href="https://docs.commercetools.com/apis/ctp:api:type:FieldDefinition" rel="nofollow">FieldDefinition</a>; only present on changes to Types.</p>
     * @return fieldName
     */

    public String getFieldName() {
        return this.fieldName;
    }

    /**
     *  <p>Name of the updated <a href="https://docs.commercetools.com/apis/ctp:api:type:AttributeDefinition" rel="nofollow">AttributeDefinition</a>; only present on changes to Product Types.</p>
     * @return attributeName
     */

    public String getAttributeName() {
        return this.attributeName;
    }

    /**
     * builds ChangeInputHintChange with checking for non-null required values
     * @return ChangeInputHintChange
     */
    public ChangeInputHintChange build() {
        Objects.requireNonNull(change, ChangeInputHintChange.class + ": change is missing");
        Objects.requireNonNull(previousValue, ChangeInputHintChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, ChangeInputHintChange.class + ": nextValue is missing");
        Objects.requireNonNull(fieldName, ChangeInputHintChange.class + ": fieldName is missing");
        Objects.requireNonNull(attributeName, ChangeInputHintChange.class + ": attributeName is missing");
        return new ChangeInputHintChangeImpl(change, previousValue, nextValue, fieldName, attributeName);
    }

    /**
     * builds ChangeInputHintChange without checking for non-null required values
     * @return ChangeInputHintChange
     */
    public ChangeInputHintChange buildUnchecked() {
        return new ChangeInputHintChangeImpl(change, previousValue, nextValue, fieldName, attributeName);
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
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        builder.fieldName = template.getFieldName();
        builder.attributeName = template.getAttributeName();
        return builder;
    }

}
