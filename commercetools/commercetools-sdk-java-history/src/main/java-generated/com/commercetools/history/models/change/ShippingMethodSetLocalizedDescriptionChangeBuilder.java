
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ShippingMethodSetLocalizedDescriptionChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ShippingMethodSetLocalizedDescriptionChange shippingMethodSetLocalizedDescriptionChange = ShippingMethodSetLocalizedDescriptionChange.builder()
 *             .change("{change}")
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ShippingMethodSetLocalizedDescriptionChangeBuilder
        implements Builder<ShippingMethodSetLocalizedDescriptionChange> {

    private String change;

    private com.commercetools.history.models.common.LocalizedString previousValue;

    private com.commercetools.history.models.common.LocalizedString nextValue;

    /**
     * set the value to the change
     * @param change value to be set
     * @return Builder
     */

    public ShippingMethodSetLocalizedDescriptionChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param builder function to build the previousValue value
     * @return Builder
     */

    public ShippingMethodSetLocalizedDescriptionChangeBuilder previousValue(
            Function<com.commercetools.history.models.common.LocalizedStringBuilder, com.commercetools.history.models.common.LocalizedStringBuilder> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param builder function to build the previousValue value
     * @return Builder
     */

    public ShippingMethodSetLocalizedDescriptionChangeBuilder withPreviousValue(
            Function<com.commercetools.history.models.common.LocalizedStringBuilder, com.commercetools.history.models.common.LocalizedString> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.LocalizedStringBuilder.of());
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     * @return Builder
     */

    public ShippingMethodSetLocalizedDescriptionChangeBuilder previousValue(
            final com.commercetools.history.models.common.LocalizedString previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param builder function to build the nextValue value
     * @return Builder
     */

    public ShippingMethodSetLocalizedDescriptionChangeBuilder nextValue(
            Function<com.commercetools.history.models.common.LocalizedStringBuilder, com.commercetools.history.models.common.LocalizedStringBuilder> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param builder function to build the nextValue value
     * @return Builder
     */

    public ShippingMethodSetLocalizedDescriptionChangeBuilder withNextValue(
            Function<com.commercetools.history.models.common.LocalizedStringBuilder, com.commercetools.history.models.common.LocalizedString> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.LocalizedStringBuilder.of());
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     * @return Builder
     */

    public ShippingMethodSetLocalizedDescriptionChangeBuilder nextValue(
            final com.commercetools.history.models.common.LocalizedString nextValue) {
        this.nextValue = nextValue;
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

    public com.commercetools.history.models.common.LocalizedString getPreviousValue() {
        return this.previousValue;
    }

    /**
     *  <p>Value after the change.</p>
     * @return nextValue
     */

    public com.commercetools.history.models.common.LocalizedString getNextValue() {
        return this.nextValue;
    }

    /**
     * builds ShippingMethodSetLocalizedDescriptionChange with checking for non-null required values
     * @return ShippingMethodSetLocalizedDescriptionChange
     */
    public ShippingMethodSetLocalizedDescriptionChange build() {
        Objects.requireNonNull(change, ShippingMethodSetLocalizedDescriptionChange.class + ": change is missing");
        Objects.requireNonNull(previousValue,
            ShippingMethodSetLocalizedDescriptionChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, ShippingMethodSetLocalizedDescriptionChange.class + ": nextValue is missing");
        return new ShippingMethodSetLocalizedDescriptionChangeImpl(change, previousValue, nextValue);
    }

    /**
     * builds ShippingMethodSetLocalizedDescriptionChange without checking for non-null required values
     * @return ShippingMethodSetLocalizedDescriptionChange
     */
    public ShippingMethodSetLocalizedDescriptionChange buildUnchecked() {
        return new ShippingMethodSetLocalizedDescriptionChangeImpl(change, previousValue, nextValue);
    }

    /**
     * factory method for an instance of ShippingMethodSetLocalizedDescriptionChangeBuilder
     * @return builder
     */
    public static ShippingMethodSetLocalizedDescriptionChangeBuilder of() {
        return new ShippingMethodSetLocalizedDescriptionChangeBuilder();
    }

    /**
     * create builder for ShippingMethodSetLocalizedDescriptionChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ShippingMethodSetLocalizedDescriptionChangeBuilder of(
            final ShippingMethodSetLocalizedDescriptionChange template) {
        ShippingMethodSetLocalizedDescriptionChangeBuilder builder = new ShippingMethodSetLocalizedDescriptionChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
