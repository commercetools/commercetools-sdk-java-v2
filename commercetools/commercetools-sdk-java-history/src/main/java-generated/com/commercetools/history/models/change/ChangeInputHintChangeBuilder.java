
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
     */

    public ChangeInputHintChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     *  <p>The name of the field definition updated.</p>
     */

    public ChangeInputHintChangeBuilder fieldName(final String fieldName) {
        this.fieldName = fieldName;
        return this;
    }

    /**
     *  <p>The name of the attribute updated.</p>
     */

    public ChangeInputHintChangeBuilder attributeName(final String attributeName) {
        this.attributeName = attributeName;
        return this;
    }

    /**
     *
     */

    public ChangeInputHintChangeBuilder nextValue(
            final com.commercetools.history.models.common.TextInputHint nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    /**
     *
     */

    public ChangeInputHintChangeBuilder previousValue(
            final com.commercetools.history.models.common.TextInputHint previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    public String getChange() {
        return this.change;
    }

    public String getFieldName() {
        return this.fieldName;
    }

    public String getAttributeName() {
        return this.attributeName;
    }

    public com.commercetools.history.models.common.TextInputHint getNextValue() {
        return this.nextValue;
    }

    public com.commercetools.history.models.common.TextInputHint getPreviousValue() {
        return this.previousValue;
    }

    public ChangeInputHintChange build() {
        Objects.requireNonNull(change, ChangeInputHintChange.class + ": change is missing");
        Objects.requireNonNull(fieldName, ChangeInputHintChange.class + ": fieldName is missing");
        Objects.requireNonNull(attributeName, ChangeInputHintChange.class + ": attributeName is missing");
        Objects.requireNonNull(nextValue, ChangeInputHintChange.class + ": nextValue is missing");
        Objects.requireNonNull(previousValue, ChangeInputHintChange.class + ": previousValue is missing");
        return new ChangeInputHintChangeImpl(change, fieldName, attributeName, nextValue, previousValue);
    }

    /**
     * builds ChangeInputHintChange without checking for non null required values
     */
    public ChangeInputHintChange buildUnchecked() {
        return new ChangeInputHintChangeImpl(change, fieldName, attributeName, nextValue, previousValue);
    }

    public static ChangeInputHintChangeBuilder of() {
        return new ChangeInputHintChangeBuilder();
    }

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
