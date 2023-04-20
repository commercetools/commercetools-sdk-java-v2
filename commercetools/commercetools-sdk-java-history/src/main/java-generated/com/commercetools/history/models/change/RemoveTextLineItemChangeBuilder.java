
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * RemoveTextLineItemChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     RemoveTextLineItemChange removeTextLineItemChange = RemoveTextLineItemChange.builder()
 *             .change("{change}")
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class RemoveTextLineItemChangeBuilder implements Builder<RemoveTextLineItemChange> {

    private String change;

    private com.commercetools.history.models.common.TextLineItem previousValue;

    private com.commercetools.history.models.common.TextLineItem nextValue;

    /**
     * set the value to the change
     * @param change value to be set
     * @return Builder
     */

    public RemoveTextLineItemChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     * set the value to the previousValue using the builder function
     * @param builder function to build the previousValue value
     * @return Builder
     */

    public RemoveTextLineItemChangeBuilder previousValue(
            Function<com.commercetools.history.models.common.TextLineItemBuilder, com.commercetools.history.models.common.TextLineItemBuilder> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.TextLineItemBuilder.of()).build();
        return this;
    }

    /**
     * set the value to the previousValue using the builder function
     * @param builder function to build the previousValue value
     * @return Builder
     */

    public RemoveTextLineItemChangeBuilder withPreviousValue(
            Function<com.commercetools.history.models.common.TextLineItemBuilder, com.commercetools.history.models.common.TextLineItem> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.TextLineItemBuilder.of());
        return this;
    }

    /**
     * set the value to the previousValue
     * @param previousValue value to be set
     * @return Builder
     */

    public RemoveTextLineItemChangeBuilder previousValue(
            final com.commercetools.history.models.common.TextLineItem previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     * set the value to the nextValue using the builder function
     * @param builder function to build the nextValue value
     * @return Builder
     */

    public RemoveTextLineItemChangeBuilder nextValue(
            Function<com.commercetools.history.models.common.TextLineItemBuilder, com.commercetools.history.models.common.TextLineItemBuilder> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.TextLineItemBuilder.of()).build();
        return this;
    }

    /**
     * set the value to the nextValue using the builder function
     * @param builder function to build the nextValue value
     * @return Builder
     */

    public RemoveTextLineItemChangeBuilder withNextValue(
            Function<com.commercetools.history.models.common.TextLineItemBuilder, com.commercetools.history.models.common.TextLineItem> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.TextLineItemBuilder.of());
        return this;
    }

    /**
     * set the value to the nextValue
     * @param nextValue value to be set
     * @return Builder
     */

    public RemoveTextLineItemChangeBuilder nextValue(
            final com.commercetools.history.models.common.TextLineItem nextValue) {
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
     * value of previousValue}
     * @return previousValue
     */

    public com.commercetools.history.models.common.TextLineItem getPreviousValue() {
        return this.previousValue;
    }

    /**
     * value of nextValue}
     * @return nextValue
     */

    public com.commercetools.history.models.common.TextLineItem getNextValue() {
        return this.nextValue;
    }

    /**
     * builds RemoveTextLineItemChange with checking for non-null required values
     * @return RemoveTextLineItemChange
     */
    public RemoveTextLineItemChange build() {
        Objects.requireNonNull(change, RemoveTextLineItemChange.class + ": change is missing");
        Objects.requireNonNull(previousValue, RemoveTextLineItemChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, RemoveTextLineItemChange.class + ": nextValue is missing");
        return new RemoveTextLineItemChangeImpl(change, previousValue, nextValue);
    }

    /**
     * builds RemoveTextLineItemChange without checking for non-null required values
     * @return RemoveTextLineItemChange
     */
    public RemoveTextLineItemChange buildUnchecked() {
        return new RemoveTextLineItemChangeImpl(change, previousValue, nextValue);
    }

    /**
     * factory method for an instance of RemoveTextLineItemChangeBuilder
     * @return builder
     */
    public static RemoveTextLineItemChangeBuilder of() {
        return new RemoveTextLineItemChangeBuilder();
    }

    /**
     * create builder for RemoveTextLineItemChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static RemoveTextLineItemChangeBuilder of(final RemoveTextLineItemChange template) {
        RemoveTextLineItemChangeBuilder builder = new RemoveTextLineItemChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
