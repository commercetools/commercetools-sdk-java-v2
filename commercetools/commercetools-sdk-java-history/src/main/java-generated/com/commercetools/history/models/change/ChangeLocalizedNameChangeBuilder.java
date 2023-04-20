
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ChangeLocalizedNameChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ChangeLocalizedNameChange changeLocalizedNameChange = ChangeLocalizedNameChange.builder()
 *             .change("{change}")
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ChangeLocalizedNameChangeBuilder implements Builder<ChangeLocalizedNameChange> {

    private String change;

    private com.commercetools.history.models.common.LocalizedString previousValue;

    private com.commercetools.history.models.common.LocalizedString nextValue;

    /**
     *  <p>Shape of the action for <code>changeName</code></p>
     * @param change value to be set
     * @return Builder
     */

    public ChangeLocalizedNameChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     * set the value to the previousValue using the builder function
     * @param builder function to build the previousValue value
     * @return Builder
     */

    public ChangeLocalizedNameChangeBuilder previousValue(
            Function<com.commercetools.history.models.common.LocalizedStringBuilder, com.commercetools.history.models.common.LocalizedStringBuilder> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     * set the value to the previousValue using the builder function
     * @param builder function to build the previousValue value
     * @return Builder
     */

    public ChangeLocalizedNameChangeBuilder withPreviousValue(
            Function<com.commercetools.history.models.common.LocalizedStringBuilder, com.commercetools.history.models.common.LocalizedString> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.LocalizedStringBuilder.of());
        return this;
    }

    /**
     * set the value to the previousValue
     * @param previousValue value to be set
     * @return Builder
     */

    public ChangeLocalizedNameChangeBuilder previousValue(
            final com.commercetools.history.models.common.LocalizedString previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     * set the value to the nextValue using the builder function
     * @param builder function to build the nextValue value
     * @return Builder
     */

    public ChangeLocalizedNameChangeBuilder nextValue(
            Function<com.commercetools.history.models.common.LocalizedStringBuilder, com.commercetools.history.models.common.LocalizedStringBuilder> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     * set the value to the nextValue using the builder function
     * @param builder function to build the nextValue value
     * @return Builder
     */

    public ChangeLocalizedNameChangeBuilder withNextValue(
            Function<com.commercetools.history.models.common.LocalizedStringBuilder, com.commercetools.history.models.common.LocalizedString> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.LocalizedStringBuilder.of());
        return this;
    }

    /**
     * set the value to the nextValue
     * @param nextValue value to be set
     * @return Builder
     */

    public ChangeLocalizedNameChangeBuilder nextValue(
            final com.commercetools.history.models.common.LocalizedString nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    /**
     *  <p>Shape of the action for <code>changeName</code></p>
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
     * builds ChangeLocalizedNameChange with checking for non-null required values
     * @return ChangeLocalizedNameChange
     */
    public ChangeLocalizedNameChange build() {
        Objects.requireNonNull(change, ChangeLocalizedNameChange.class + ": change is missing");
        Objects.requireNonNull(previousValue, ChangeLocalizedNameChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, ChangeLocalizedNameChange.class + ": nextValue is missing");
        return new ChangeLocalizedNameChangeImpl(change, previousValue, nextValue);
    }

    /**
     * builds ChangeLocalizedNameChange without checking for non-null required values
     * @return ChangeLocalizedNameChange
     */
    public ChangeLocalizedNameChange buildUnchecked() {
        return new ChangeLocalizedNameChangeImpl(change, previousValue, nextValue);
    }

    /**
     * factory method for an instance of ChangeLocalizedNameChangeBuilder
     * @return builder
     */
    public static ChangeLocalizedNameChangeBuilder of() {
        return new ChangeLocalizedNameChangeBuilder();
    }

    /**
     * create builder for ChangeLocalizedNameChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ChangeLocalizedNameChangeBuilder of(final ChangeLocalizedNameChange template) {
        ChangeLocalizedNameChangeBuilder builder = new ChangeLocalizedNameChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
