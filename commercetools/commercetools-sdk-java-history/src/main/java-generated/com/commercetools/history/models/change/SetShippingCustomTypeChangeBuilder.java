
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetShippingCustomTypeChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetShippingCustomTypeChange setShippingCustomTypeChange = SetShippingCustomTypeChange.builder()
 *             .change("{change}")
 *             .shippingKey("{shippingKey}")
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SetShippingCustomTypeChangeBuilder implements Builder<SetShippingCustomTypeChange> {

    private String change;

    private String shippingKey;

    private com.commercetools.history.models.common.CustomFields previousValue;

    private com.commercetools.history.models.common.CustomFields nextValue;

    /**
     * set the value to the change
     * @param change value to be set
     * @return Builder
     */

    public SetShippingCustomTypeChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     *  <p><code>shippingKey</code> of the updated <a href="https://docs.commercetools.com/apis/ctp:api:type:Shipping" rel="nofollow">Shipping</a>.</p>
     * @param shippingKey value to be set
     * @return Builder
     */

    public SetShippingCustomTypeChangeBuilder shippingKey(final String shippingKey) {
        this.shippingKey = shippingKey;
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param builder function to build the previousValue value
     * @return Builder
     */

    public SetShippingCustomTypeChangeBuilder previousValue(
            Function<com.commercetools.history.models.common.CustomFieldsBuilder, com.commercetools.history.models.common.CustomFieldsBuilder> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.CustomFieldsBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param builder function to build the previousValue value
     * @return Builder
     */

    public SetShippingCustomTypeChangeBuilder withPreviousValue(
            Function<com.commercetools.history.models.common.CustomFieldsBuilder, com.commercetools.history.models.common.CustomFields> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.CustomFieldsBuilder.of());
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     * @return Builder
     */

    public SetShippingCustomTypeChangeBuilder previousValue(
            final com.commercetools.history.models.common.CustomFields previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param builder function to build the nextValue value
     * @return Builder
     */

    public SetShippingCustomTypeChangeBuilder nextValue(
            Function<com.commercetools.history.models.common.CustomFieldsBuilder, com.commercetools.history.models.common.CustomFieldsBuilder> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.CustomFieldsBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param builder function to build the nextValue value
     * @return Builder
     */

    public SetShippingCustomTypeChangeBuilder withNextValue(
            Function<com.commercetools.history.models.common.CustomFieldsBuilder, com.commercetools.history.models.common.CustomFields> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.CustomFieldsBuilder.of());
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     * @return Builder
     */

    public SetShippingCustomTypeChangeBuilder nextValue(
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
     *  <p><code>shippingKey</code> of the updated <a href="https://docs.commercetools.com/apis/ctp:api:type:Shipping" rel="nofollow">Shipping</a>.</p>
     * @return shippingKey
     */

    public String getShippingKey() {
        return this.shippingKey;
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
     * builds SetShippingCustomTypeChange with checking for non-null required values
     * @return SetShippingCustomTypeChange
     */
    public SetShippingCustomTypeChange build() {
        Objects.requireNonNull(change, SetShippingCustomTypeChange.class + ": change is missing");
        Objects.requireNonNull(shippingKey, SetShippingCustomTypeChange.class + ": shippingKey is missing");
        Objects.requireNonNull(previousValue, SetShippingCustomTypeChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, SetShippingCustomTypeChange.class + ": nextValue is missing");
        return new SetShippingCustomTypeChangeImpl(change, shippingKey, previousValue, nextValue);
    }

    /**
     * builds SetShippingCustomTypeChange without checking for non-null required values
     * @return SetShippingCustomTypeChange
     */
    public SetShippingCustomTypeChange buildUnchecked() {
        return new SetShippingCustomTypeChangeImpl(change, shippingKey, previousValue, nextValue);
    }

    /**
     * factory method for an instance of SetShippingCustomTypeChangeBuilder
     * @return builder
     */
    public static SetShippingCustomTypeChangeBuilder of() {
        return new SetShippingCustomTypeChangeBuilder();
    }

    /**
     * create builder for SetShippingCustomTypeChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetShippingCustomTypeChangeBuilder of(final SetShippingCustomTypeChange template) {
        SetShippingCustomTypeChangeBuilder builder = new SetShippingCustomTypeChangeBuilder();
        builder.change = template.getChange();
        builder.shippingKey = template.getShippingKey();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
