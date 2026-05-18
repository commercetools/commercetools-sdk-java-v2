
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetBillingAddressCustomTypeChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetBillingAddressCustomTypeChange setBillingAddressCustomTypeChange = SetBillingAddressCustomTypeChange.builder()
 *             .change("{change}")
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SetBillingAddressCustomTypeChangeBuilder implements Builder<SetBillingAddressCustomTypeChange> {

    private String change;

    private com.commercetools.history.models.common.CustomFields previousValue;

    private com.commercetools.history.models.common.CustomFields nextValue;

    /**
     * set the value to the change
     * @param change value to be set
     * @return Builder
     */

    public SetBillingAddressCustomTypeChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param builder function to build the previousValue value
     * @return Builder
     */

    public SetBillingAddressCustomTypeChangeBuilder previousValue(
            Function<com.commercetools.history.models.common.CustomFieldsBuilder, com.commercetools.history.models.common.CustomFieldsBuilder> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.CustomFieldsBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param builder function to build the previousValue value
     * @return Builder
     */

    public SetBillingAddressCustomTypeChangeBuilder withPreviousValue(
            Function<com.commercetools.history.models.common.CustomFieldsBuilder, com.commercetools.history.models.common.CustomFields> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.CustomFieldsBuilder.of());
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     * @return Builder
     */

    public SetBillingAddressCustomTypeChangeBuilder previousValue(
            final com.commercetools.history.models.common.CustomFields previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param builder function to build the nextValue value
     * @return Builder
     */

    public SetBillingAddressCustomTypeChangeBuilder nextValue(
            Function<com.commercetools.history.models.common.CustomFieldsBuilder, com.commercetools.history.models.common.CustomFieldsBuilder> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.CustomFieldsBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param builder function to build the nextValue value
     * @return Builder
     */

    public SetBillingAddressCustomTypeChangeBuilder withNextValue(
            Function<com.commercetools.history.models.common.CustomFieldsBuilder, com.commercetools.history.models.common.CustomFields> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.CustomFieldsBuilder.of());
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     * @return Builder
     */

    public SetBillingAddressCustomTypeChangeBuilder nextValue(
            final com.commercetools.history.models.common.CustomFields nextValue) {
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

    public com.commercetools.history.models.common.CustomFields getPreviousValue() {
        return this.previousValue;
    }

    /**
     *  <p>Value after the change.</p>
     * @return nextValue
     */

    public com.commercetools.history.models.common.CustomFields getNextValue() {
        return this.nextValue;
    }

    /**
     * builds SetBillingAddressCustomTypeChange with checking for non-null required values
     * @return SetBillingAddressCustomTypeChange
     */
    public SetBillingAddressCustomTypeChange build() {
        Objects.requireNonNull(change, SetBillingAddressCustomTypeChange.class + ": change is missing");
        Objects.requireNonNull(previousValue, SetBillingAddressCustomTypeChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, SetBillingAddressCustomTypeChange.class + ": nextValue is missing");
        return new SetBillingAddressCustomTypeChangeImpl(change, previousValue, nextValue);
    }

    /**
     * builds SetBillingAddressCustomTypeChange without checking for non-null required values
     * @return SetBillingAddressCustomTypeChange
     */
    public SetBillingAddressCustomTypeChange buildUnchecked() {
        return new SetBillingAddressCustomTypeChangeImpl(change, previousValue, nextValue);
    }

    /**
     * factory method for an instance of SetBillingAddressCustomTypeChangeBuilder
     * @return builder
     */
    public static SetBillingAddressCustomTypeChangeBuilder of() {
        return new SetBillingAddressCustomTypeChangeBuilder();
    }

    /**
     * create builder for SetBillingAddressCustomTypeChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetBillingAddressCustomTypeChangeBuilder of(final SetBillingAddressCustomTypeChange template) {
        SetBillingAddressCustomTypeChangeBuilder builder = new SetBillingAddressCustomTypeChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
