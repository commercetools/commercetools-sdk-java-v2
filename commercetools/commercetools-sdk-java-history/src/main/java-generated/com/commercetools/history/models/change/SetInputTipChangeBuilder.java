
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetInputTipChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetInputTipChange setInputTipChange = SetInputTipChange.builder()
 *             .change("{change}")
 *             .attributeName("{attributeName}")
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SetInputTipChangeBuilder implements Builder<SetInputTipChange> {

    private String change;

    private String attributeName;

    private com.commercetools.history.models.common.LocalizedString nextValue;

    private com.commercetools.history.models.common.LocalizedString previousValue;

    /**
     *  <p>Update action for <code>setInputTip</code> on product types</p>
     * @param change value to be set
     * @return Builder
     */

    public SetInputTipChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     *  <p>The name of the updated attribute.</p>
     * @param attributeName value to be set
     * @return Builder
     */

    public SetInputTipChangeBuilder attributeName(final String attributeName) {
        this.attributeName = attributeName;
        return this;
    }

    /**
     * set the value to the nextValue using the builder function
     * @param builder function to build the nextValue value
     * @return Builder
     */

    public SetInputTipChangeBuilder nextValue(
            Function<com.commercetools.history.models.common.LocalizedStringBuilder, com.commercetools.history.models.common.LocalizedStringBuilder> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     * set the value to the nextValue
     * @param nextValue value to be set
     * @return Builder
     */

    public SetInputTipChangeBuilder nextValue(final com.commercetools.history.models.common.LocalizedString nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    /**
     * set the value to the previousValue using the builder function
     * @param builder function to build the previousValue value
     * @return Builder
     */

    public SetInputTipChangeBuilder previousValue(
            Function<com.commercetools.history.models.common.LocalizedStringBuilder, com.commercetools.history.models.common.LocalizedStringBuilder> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     * set the value to the previousValue
     * @param previousValue value to be set
     * @return Builder
     */

    public SetInputTipChangeBuilder previousValue(
            final com.commercetools.history.models.common.LocalizedString previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     *  <p>Update action for <code>setInputTip</code> on product types</p>
     * @return change
     */

    public String getChange() {
        return this.change;
    }

    /**
     *  <p>The name of the updated attribute.</p>
     * @return attributeName
     */

    public String getAttributeName() {
        return this.attributeName;
    }

    /**
     * value of nextValue}
     * @return nextValue
     */

    public com.commercetools.history.models.common.LocalizedString getNextValue() {
        return this.nextValue;
    }

    /**
     * value of previousValue}
     * @return previousValue
     */

    public com.commercetools.history.models.common.LocalizedString getPreviousValue() {
        return this.previousValue;
    }

    /**
     * builds SetInputTipChange with checking for non-null required values
     * @return SetInputTipChange
     */
    public SetInputTipChange build() {
        Objects.requireNonNull(change, SetInputTipChange.class + ": change is missing");
        Objects.requireNonNull(attributeName, SetInputTipChange.class + ": attributeName is missing");
        Objects.requireNonNull(nextValue, SetInputTipChange.class + ": nextValue is missing");
        Objects.requireNonNull(previousValue, SetInputTipChange.class + ": previousValue is missing");
        return new SetInputTipChangeImpl(change, attributeName, nextValue, previousValue);
    }

    /**
     * builds SetInputTipChange without checking for non-null required values
     * @return SetInputTipChange
     */
    public SetInputTipChange buildUnchecked() {
        return new SetInputTipChangeImpl(change, attributeName, nextValue, previousValue);
    }

    /**
     * factory method for an instance of SetInputTipChangeBuilder
     * @return builder
     */
    public static SetInputTipChangeBuilder of() {
        return new SetInputTipChangeBuilder();
    }

    /**
     * create builder for SetInputTipChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetInputTipChangeBuilder of(final SetInputTipChange template) {
        SetInputTipChangeBuilder builder = new SetInputTipChangeBuilder();
        builder.change = template.getChange();
        builder.attributeName = template.getAttributeName();
        builder.nextValue = template.getNextValue();
        builder.previousValue = template.getPreviousValue();
        return builder;
    }

}
