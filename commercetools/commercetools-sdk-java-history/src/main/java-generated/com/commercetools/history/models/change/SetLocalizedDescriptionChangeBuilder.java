
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetLocalizedDescriptionChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetLocalizedDescriptionChange setLocalizedDescriptionChange = SetLocalizedDescriptionChange.builder()
 *             .change("{change}")
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SetLocalizedDescriptionChangeBuilder implements Builder<SetLocalizedDescriptionChange> {

    private String change;

    private com.commercetools.history.models.common.LocalizedString previousValue;

    private com.commercetools.history.models.common.LocalizedString nextValue;

    /**
     *  <p>Shape of the action for <code>setDescription</code></p>
     * @param change value to be set
     * @return Builder
     */

    public SetLocalizedDescriptionChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     * set the value to the previousValue using the builder function
     * @param builder function to build the previousValue value
     * @return Builder
     */

    public SetLocalizedDescriptionChangeBuilder previousValue(
            Function<com.commercetools.history.models.common.LocalizedStringBuilder, com.commercetools.history.models.common.LocalizedStringBuilder> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     * set the value to the previousValue
     * @param previousValue value to be set
     * @return Builder
     */

    public SetLocalizedDescriptionChangeBuilder previousValue(
            final com.commercetools.history.models.common.LocalizedString previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     * set the value to the nextValue using the builder function
     * @param builder function to build the nextValue value
     * @return Builder
     */

    public SetLocalizedDescriptionChangeBuilder nextValue(
            Function<com.commercetools.history.models.common.LocalizedStringBuilder, com.commercetools.history.models.common.LocalizedStringBuilder> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     * set the value to the nextValue
     * @param nextValue value to be set
     * @return Builder
     */

    public SetLocalizedDescriptionChangeBuilder nextValue(
            final com.commercetools.history.models.common.LocalizedString nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    /**
     *  <p>Shape of the action for <code>setDescription</code></p>
     * @return change
     */

    public String getChange() {
        return this.change;
    }

    /**
     * value of previousValue}
     * @return previousValue
     */

    public com.commercetools.history.models.common.LocalizedString getPreviousValue() {
        return this.previousValue;
    }

    /**
     * value of nextValue}
     * @return nextValue
     */

    public com.commercetools.history.models.common.LocalizedString getNextValue() {
        return this.nextValue;
    }

    /**
     * builds SetLocalizedDescriptionChange with checking for non-null required values
     * @return SetLocalizedDescriptionChange
     */
    public SetLocalizedDescriptionChange build() {
        Objects.requireNonNull(change, SetLocalizedDescriptionChange.class + ": change is missing");
        Objects.requireNonNull(previousValue, SetLocalizedDescriptionChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, SetLocalizedDescriptionChange.class + ": nextValue is missing");
        return new SetLocalizedDescriptionChangeImpl(change, previousValue, nextValue);
    }

    /**
     * builds SetLocalizedDescriptionChange without checking for non-null required values
     * @return SetLocalizedDescriptionChange
     */
    public SetLocalizedDescriptionChange buildUnchecked() {
        return new SetLocalizedDescriptionChangeImpl(change, previousValue, nextValue);
    }

    /**
     * factory method for an instance of SetLocalizedDescriptionChangeBuilder
     * @return builder
     */
    public static SetLocalizedDescriptionChangeBuilder of() {
        return new SetLocalizedDescriptionChangeBuilder();
    }

    /**
     * create builder for SetLocalizedDescriptionChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetLocalizedDescriptionChangeBuilder of(final SetLocalizedDescriptionChange template) {
        SetLocalizedDescriptionChangeBuilder builder = new SetLocalizedDescriptionChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
