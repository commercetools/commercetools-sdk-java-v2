
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ChangeLabelChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ChangeLabelChange changeLabelChange = ChangeLabelChange.builder()
 *             .change("{change}")
 *             .fieldName("{fieldName}")
 *             .attributeName("{attributeName}")
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ChangeLabelChangeBuilder implements Builder<ChangeLabelChange> {

    private String change;

    private String fieldName;

    private String attributeName;

    private com.commercetools.history.models.common.LocalizedString nextValue;

    private com.commercetools.history.models.common.LocalizedString previousValue;

    /**
     *  <p>Update action for <code>changeLabel</code> on product types and types</p>
     * @param change
     * @return Builder
     */

    public ChangeLabelChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     *  <p>The name of the field definition to update (types).</p>
     * @param fieldName
     * @return Builder
     */

    public ChangeLabelChangeBuilder fieldName(final String fieldName) {
        this.fieldName = fieldName;
        return this;
    }

    /**
     *  <p>The name of the attribute definition to update (product-type).</p>
     * @param attributeName
     * @return Builder
     */

    public ChangeLabelChangeBuilder attributeName(final String attributeName) {
        this.attributeName = attributeName;
        return this;
    }

    /**
     *
     * @return Builder
     */

    public ChangeLabelChangeBuilder nextValue(
            Function<com.commercetools.history.models.common.LocalizedStringBuilder, com.commercetools.history.models.common.LocalizedStringBuilder> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *
     * @param nextValue
     * @return Builder
     */

    public ChangeLabelChangeBuilder nextValue(final com.commercetools.history.models.common.LocalizedString nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    /**
     *
     * @return Builder
     */

    public ChangeLabelChangeBuilder previousValue(
            Function<com.commercetools.history.models.common.LocalizedStringBuilder, com.commercetools.history.models.common.LocalizedStringBuilder> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *
     * @param previousValue
     * @return Builder
     */

    public ChangeLabelChangeBuilder previousValue(
            final com.commercetools.history.models.common.LocalizedString previousValue) {
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

    public com.commercetools.history.models.common.LocalizedString getNextValue() {
        return this.nextValue;
    }

    public com.commercetools.history.models.common.LocalizedString getPreviousValue() {
        return this.previousValue;
    }

    public ChangeLabelChange build() {
        Objects.requireNonNull(change, ChangeLabelChange.class + ": change is missing");
        Objects.requireNonNull(fieldName, ChangeLabelChange.class + ": fieldName is missing");
        Objects.requireNonNull(attributeName, ChangeLabelChange.class + ": attributeName is missing");
        Objects.requireNonNull(nextValue, ChangeLabelChange.class + ": nextValue is missing");
        Objects.requireNonNull(previousValue, ChangeLabelChange.class + ": previousValue is missing");
        return new ChangeLabelChangeImpl(change, fieldName, attributeName, nextValue, previousValue);
    }

    /**
     * builds ChangeLabelChange without checking for non null required values
     */
    public ChangeLabelChange buildUnchecked() {
        return new ChangeLabelChangeImpl(change, fieldName, attributeName, nextValue, previousValue);
    }

    public static ChangeLabelChangeBuilder of() {
        return new ChangeLabelChangeBuilder();
    }

    public static ChangeLabelChangeBuilder of(final ChangeLabelChange template) {
        ChangeLabelChangeBuilder builder = new ChangeLabelChangeBuilder();
        builder.change = template.getChange();
        builder.fieldName = template.getFieldName();
        builder.attributeName = template.getAttributeName();
        builder.nextValue = template.getNextValue();
        builder.previousValue = template.getPreviousValue();
        return builder;
    }

}
