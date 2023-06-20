
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * AddTextLineItemChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AddTextLineItemChange addTextLineItemChange = AddTextLineItemChange.builder()
 *             .change("{change}")
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class AddTextLineItemChangeBuilder implements Builder<AddTextLineItemChange> {

    private String change;

    private com.commercetools.history.models.common.TextLineItem nextValue;

    /**
     * set the value to the change
     * @param change value to be set
     * @return Builder
     */

    public AddTextLineItemChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param builder function to build the nextValue value
     * @return Builder
     */

    public AddTextLineItemChangeBuilder nextValue(
            Function<com.commercetools.history.models.common.TextLineItemBuilder, com.commercetools.history.models.common.TextLineItemBuilder> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.TextLineItemBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param builder function to build the nextValue value
     * @return Builder
     */

    public AddTextLineItemChangeBuilder withNextValue(
            Function<com.commercetools.history.models.common.TextLineItemBuilder, com.commercetools.history.models.common.TextLineItem> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.TextLineItemBuilder.of());
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     * @return Builder
     */

    public AddTextLineItemChangeBuilder nextValue(
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
     *  <p>Value after the change.</p>
     * @return nextValue
     */

    public com.commercetools.history.models.common.TextLineItem getNextValue() {
        return this.nextValue;
    }

    /**
     * builds AddTextLineItemChange with checking for non-null required values
     * @return AddTextLineItemChange
     */
    public AddTextLineItemChange build() {
        Objects.requireNonNull(change, AddTextLineItemChange.class + ": change is missing");
        Objects.requireNonNull(nextValue, AddTextLineItemChange.class + ": nextValue is missing");
        return new AddTextLineItemChangeImpl(change, nextValue);
    }

    /**
     * builds AddTextLineItemChange without checking for non-null required values
     * @return AddTextLineItemChange
     */
    public AddTextLineItemChange buildUnchecked() {
        return new AddTextLineItemChangeImpl(change, nextValue);
    }

    /**
     * factory method for an instance of AddTextLineItemChangeBuilder
     * @return builder
     */
    public static AddTextLineItemChangeBuilder of() {
        return new AddTextLineItemChangeBuilder();
    }

    /**
     * create builder for AddTextLineItemChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AddTextLineItemChangeBuilder of(final AddTextLineItemChange template) {
        AddTextLineItemChangeBuilder builder = new AddTextLineItemChangeBuilder();
        builder.change = template.getChange();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
