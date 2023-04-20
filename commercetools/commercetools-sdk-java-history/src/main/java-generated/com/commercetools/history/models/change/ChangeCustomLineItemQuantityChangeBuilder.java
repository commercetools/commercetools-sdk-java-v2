
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ChangeCustomLineItemQuantityChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ChangeCustomLineItemQuantityChange changeCustomLineItemQuantityChange = ChangeCustomLineItemQuantityChange.builder()
 *             .change("{change}")
 *             .customLineItem(customLineItemBuilder -> customLineItemBuilder)
 *             .customLineItemId("{customLineItemId}")
 *             .nextValue(1)
 *             .previousValue(1)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ChangeCustomLineItemQuantityChangeBuilder implements Builder<ChangeCustomLineItemQuantityChange> {

    private String change;

    private com.commercetools.history.models.common.LocalizedString customLineItem;

    private String customLineItemId;

    private Integer nextValue;

    private Integer previousValue;

    /**
     *  <p>Update action for <code>changeCustomLineItemQuantity</code></p>
     * @param change value to be set
     * @return Builder
     */

    public ChangeCustomLineItemQuantityChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     * set the value to the customLineItem using the builder function
     * @param builder function to build the customLineItem value
     * @return Builder
     */

    public ChangeCustomLineItemQuantityChangeBuilder customLineItem(
            Function<com.commercetools.history.models.common.LocalizedStringBuilder, com.commercetools.history.models.common.LocalizedStringBuilder> builder) {
        this.customLineItem = builder.apply(com.commercetools.history.models.common.LocalizedStringBuilder.of())
                .build();
        return this;
    }

    /**
     * set the value to the customLineItem using the builder function
     * @param builder function to build the customLineItem value
     * @return Builder
     */

    public ChangeCustomLineItemQuantityChangeBuilder withCustomLineItem(
            Function<com.commercetools.history.models.common.LocalizedStringBuilder, com.commercetools.history.models.common.LocalizedString> builder) {
        this.customLineItem = builder.apply(com.commercetools.history.models.common.LocalizedStringBuilder.of());
        return this;
    }

    /**
     * set the value to the customLineItem
     * @param customLineItem value to be set
     * @return Builder
     */

    public ChangeCustomLineItemQuantityChangeBuilder customLineItem(
            final com.commercetools.history.models.common.LocalizedString customLineItem) {
        this.customLineItem = customLineItem;
        return this;
    }

    /**
     * set the value to the customLineItemId
     * @param customLineItemId value to be set
     * @return Builder
     */

    public ChangeCustomLineItemQuantityChangeBuilder customLineItemId(final String customLineItemId) {
        this.customLineItemId = customLineItemId;
        return this;
    }

    /**
     * set the value to the nextValue
     * @param nextValue value to be set
     * @return Builder
     */

    public ChangeCustomLineItemQuantityChangeBuilder nextValue(final Integer nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    /**
     * set the value to the previousValue
     * @param previousValue value to be set
     * @return Builder
     */

    public ChangeCustomLineItemQuantityChangeBuilder previousValue(final Integer previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     *  <p>Update action for <code>changeCustomLineItemQuantity</code></p>
     * @return change
     */

    public String getChange() {
        return this.change;
    }

    /**
     * value of customLineItem}
     * @return customLineItem
     */

    public com.commercetools.history.models.common.LocalizedString getCustomLineItem() {
        return this.customLineItem;
    }

    /**
     * value of customLineItemId}
     * @return customLineItemId
     */

    public String getCustomLineItemId() {
        return this.customLineItemId;
    }

    /**
     * value of nextValue}
     * @return nextValue
     */

    public Integer getNextValue() {
        return this.nextValue;
    }

    /**
     * value of previousValue}
     * @return previousValue
     */

    public Integer getPreviousValue() {
        return this.previousValue;
    }

    /**
     * builds ChangeCustomLineItemQuantityChange with checking for non-null required values
     * @return ChangeCustomLineItemQuantityChange
     */
    public ChangeCustomLineItemQuantityChange build() {
        Objects.requireNonNull(change, ChangeCustomLineItemQuantityChange.class + ": change is missing");
        Objects.requireNonNull(customLineItem,
            ChangeCustomLineItemQuantityChange.class + ": customLineItem is missing");
        Objects.requireNonNull(customLineItemId,
            ChangeCustomLineItemQuantityChange.class + ": customLineItemId is missing");
        Objects.requireNonNull(nextValue, ChangeCustomLineItemQuantityChange.class + ": nextValue is missing");
        Objects.requireNonNull(previousValue, ChangeCustomLineItemQuantityChange.class + ": previousValue is missing");
        return new ChangeCustomLineItemQuantityChangeImpl(change, customLineItem, customLineItemId, nextValue,
            previousValue);
    }

    /**
     * builds ChangeCustomLineItemQuantityChange without checking for non-null required values
     * @return ChangeCustomLineItemQuantityChange
     */
    public ChangeCustomLineItemQuantityChange buildUnchecked() {
        return new ChangeCustomLineItemQuantityChangeImpl(change, customLineItem, customLineItemId, nextValue,
            previousValue);
    }

    /**
     * factory method for an instance of ChangeCustomLineItemQuantityChangeBuilder
     * @return builder
     */
    public static ChangeCustomLineItemQuantityChangeBuilder of() {
        return new ChangeCustomLineItemQuantityChangeBuilder();
    }

    /**
     * create builder for ChangeCustomLineItemQuantityChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ChangeCustomLineItemQuantityChangeBuilder of(final ChangeCustomLineItemQuantityChange template) {
        ChangeCustomLineItemQuantityChangeBuilder builder = new ChangeCustomLineItemQuantityChangeBuilder();
        builder.change = template.getChange();
        builder.customLineItem = template.getCustomLineItem();
        builder.customLineItemId = template.getCustomLineItemId();
        builder.nextValue = template.getNextValue();
        builder.previousValue = template.getPreviousValue();
        return builder;
    }

}
