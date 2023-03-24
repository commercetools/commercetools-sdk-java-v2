
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetMethodInfoNameChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetMethodInfoNameChange setMethodInfoNameChange = SetMethodInfoNameChange.builder()
 *             .change("{change}")
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SetMethodInfoNameChangeBuilder implements Builder<SetMethodInfoNameChange> {

    private String change;

    private com.commercetools.history.models.common.LocalizedString previousValue;

    private com.commercetools.history.models.common.LocalizedString nextValue;

    /**
     *  <p>Shape of the action for <code>setMethodInfoName</code></p>
     * @param change value to be set
     * @return Builder
     */

    public SetMethodInfoNameChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     *
     * @param builder function to build the previousValue value
     * @return Builder
     */

    public SetMethodInfoNameChangeBuilder previousValue(
            Function<com.commercetools.history.models.common.LocalizedStringBuilder, com.commercetools.history.models.common.LocalizedStringBuilder> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *
     * @param previousValue value to be set
     * @return Builder
     */

    public SetMethodInfoNameChangeBuilder previousValue(
            final com.commercetools.history.models.common.LocalizedString previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     *
     * @param builder function to build the nextValue value
     * @return Builder
     */

    public SetMethodInfoNameChangeBuilder nextValue(
            Function<com.commercetools.history.models.common.LocalizedStringBuilder, com.commercetools.history.models.common.LocalizedStringBuilder> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *
     * @param nextValue value to be set
     * @return Builder
     */

    public SetMethodInfoNameChangeBuilder nextValue(
            final com.commercetools.history.models.common.LocalizedString nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    public String getChange() {
        return this.change;
    }

    public com.commercetools.history.models.common.LocalizedString getPreviousValue() {
        return this.previousValue;
    }

    public com.commercetools.history.models.common.LocalizedString getNextValue() {
        return this.nextValue;
    }

    /**
     * builds SetMethodInfoNameChange with checking for non-null required values
     * @return SetMethodInfoNameChange
     */
    public SetMethodInfoNameChange build() {
        Objects.requireNonNull(change, SetMethodInfoNameChange.class + ": change is missing");
        Objects.requireNonNull(previousValue, SetMethodInfoNameChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, SetMethodInfoNameChange.class + ": nextValue is missing");
        return new SetMethodInfoNameChangeImpl(change, previousValue, nextValue);
    }

    /**
     * builds SetMethodInfoNameChange without checking for non-null required values
     * @return SetMethodInfoNameChange
     */
    public SetMethodInfoNameChange buildUnchecked() {
        return new SetMethodInfoNameChangeImpl(change, previousValue, nextValue);
    }

    public static SetMethodInfoNameChangeBuilder of() {
        return new SetMethodInfoNameChangeBuilder();
    }

    public static SetMethodInfoNameChangeBuilder of(final SetMethodInfoNameChange template) {
        SetMethodInfoNameChangeBuilder builder = new SetMethodInfoNameChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
