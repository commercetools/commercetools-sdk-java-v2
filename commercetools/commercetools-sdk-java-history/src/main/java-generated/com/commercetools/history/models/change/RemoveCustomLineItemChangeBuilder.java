
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * RemoveCustomLineItemChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     RemoveCustomLineItemChange removeCustomLineItemChange = RemoveCustomLineItemChange.builder()
 *             .change("{change}")
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class RemoveCustomLineItemChangeBuilder implements Builder<RemoveCustomLineItemChange> {

    private String change;

    private com.commercetools.history.models.common.CustomLineItem previousValue;

    private com.commercetools.history.models.common.CustomLineItem nextValue;

    /**
     * set the value to the change
     * @param change value to be set
     * @return Builder
     */

    public RemoveCustomLineItemChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param builder function to build the previousValue value
     * @return Builder
     */

    public RemoveCustomLineItemChangeBuilder previousValue(
            Function<com.commercetools.history.models.common.CustomLineItemBuilder, com.commercetools.history.models.common.CustomLineItemBuilder> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.CustomLineItemBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param builder function to build the previousValue value
     * @return Builder
     */

    public RemoveCustomLineItemChangeBuilder withPreviousValue(
            Function<com.commercetools.history.models.common.CustomLineItemBuilder, com.commercetools.history.models.common.CustomLineItem> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.CustomLineItemBuilder.of());
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     * @return Builder
     */

    public RemoveCustomLineItemChangeBuilder previousValue(
            final com.commercetools.history.models.common.CustomLineItem previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param builder function to build the nextValue value
     * @return Builder
     */

    public RemoveCustomLineItemChangeBuilder nextValue(
            Function<com.commercetools.history.models.common.CustomLineItemBuilder, com.commercetools.history.models.common.CustomLineItemBuilder> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.CustomLineItemBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param builder function to build the nextValue value
     * @return Builder
     */

    public RemoveCustomLineItemChangeBuilder withNextValue(
            Function<com.commercetools.history.models.common.CustomLineItemBuilder, com.commercetools.history.models.common.CustomLineItem> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.CustomLineItemBuilder.of());
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     * @return Builder
     */

    public RemoveCustomLineItemChangeBuilder nextValue(
            final com.commercetools.history.models.common.CustomLineItem nextValue) {
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

    public com.commercetools.history.models.common.CustomLineItem getPreviousValue() {
        return this.previousValue;
    }

    /**
     *  <p>Value after the change.</p>
     * @return nextValue
     */

    public com.commercetools.history.models.common.CustomLineItem getNextValue() {
        return this.nextValue;
    }

    /**
     * builds RemoveCustomLineItemChange with checking for non-null required values
     * @return RemoveCustomLineItemChange
     */
    public RemoveCustomLineItemChange build() {
        Objects.requireNonNull(change, RemoveCustomLineItemChange.class + ": change is missing");
        Objects.requireNonNull(previousValue, RemoveCustomLineItemChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, RemoveCustomLineItemChange.class + ": nextValue is missing");
        return new RemoveCustomLineItemChangeImpl(change, previousValue, nextValue);
    }

    /**
     * builds RemoveCustomLineItemChange without checking for non-null required values
     * @return RemoveCustomLineItemChange
     */
    public RemoveCustomLineItemChange buildUnchecked() {
        return new RemoveCustomLineItemChangeImpl(change, previousValue, nextValue);
    }

    /**
     * factory method for an instance of RemoveCustomLineItemChangeBuilder
     * @return builder
     */
    public static RemoveCustomLineItemChangeBuilder of() {
        return new RemoveCustomLineItemChangeBuilder();
    }

    /**
     * create builder for RemoveCustomLineItemChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static RemoveCustomLineItemChangeBuilder of(final RemoveCustomLineItemChange template) {
        RemoveCustomLineItemChangeBuilder builder = new RemoveCustomLineItemChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
