
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
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class RemoveCustomLineItemChangeBuilder implements Builder<RemoveCustomLineItemChange> {

    private String change;

    private com.commercetools.history.models.common.CustomLineItem nextValue;

    private com.commercetools.history.models.common.CustomLineItem previousValue;

    /**
     *  <p>Update action for adding and removing custom line items</p>
     * @param change value to be set
     * @return Builder
     */

    public RemoveCustomLineItemChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     *
     * @param builder function to build the nextValue value
     * @return Builder
     */

    public RemoveCustomLineItemChangeBuilder nextValue(
            Function<com.commercetools.history.models.common.CustomLineItemBuilder, com.commercetools.history.models.common.CustomLineItemBuilder> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.CustomLineItemBuilder.of()).build();
        return this;
    }

    /**
     *
     * @param nextValue value to be set
     * @return Builder
     */

    public RemoveCustomLineItemChangeBuilder nextValue(
            final com.commercetools.history.models.common.CustomLineItem nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    /**
     *
     * @param builder function to build the previousValue value
     * @return Builder
     */

    public RemoveCustomLineItemChangeBuilder previousValue(
            Function<com.commercetools.history.models.common.CustomLineItemBuilder, com.commercetools.history.models.common.CustomLineItemBuilder> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.CustomLineItemBuilder.of()).build();
        return this;
    }

    /**
     *
     * @param previousValue value to be set
     * @return Builder
     */

    public RemoveCustomLineItemChangeBuilder previousValue(
            final com.commercetools.history.models.common.CustomLineItem previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    public String getChange() {
        return this.change;
    }

    public com.commercetools.history.models.common.CustomLineItem getNextValue() {
        return this.nextValue;
    }

    public com.commercetools.history.models.common.CustomLineItem getPreviousValue() {
        return this.previousValue;
    }

    /**
     * builds RemoveCustomLineItemChange with checking for non-null required values
     * @return RemoveCustomLineItemChange
     */
    public RemoveCustomLineItemChange build() {
        Objects.requireNonNull(change, RemoveCustomLineItemChange.class + ": change is missing");
        Objects.requireNonNull(nextValue, RemoveCustomLineItemChange.class + ": nextValue is missing");
        Objects.requireNonNull(previousValue, RemoveCustomLineItemChange.class + ": previousValue is missing");
        return new RemoveCustomLineItemChangeImpl(change, nextValue, previousValue);
    }

    /**
     * builds RemoveCustomLineItemChange without checking for non-null required values
     * @return RemoveCustomLineItemChange
     */
    public RemoveCustomLineItemChange buildUnchecked() {
        return new RemoveCustomLineItemChangeImpl(change, nextValue, previousValue);
    }

    public static RemoveCustomLineItemChangeBuilder of() {
        return new RemoveCustomLineItemChangeBuilder();
    }

    public static RemoveCustomLineItemChangeBuilder of(final RemoveCustomLineItemChange template) {
        RemoveCustomLineItemChangeBuilder builder = new RemoveCustomLineItemChangeBuilder();
        builder.change = template.getChange();
        builder.nextValue = template.getNextValue();
        builder.previousValue = template.getPreviousValue();
        return builder;
    }

}
