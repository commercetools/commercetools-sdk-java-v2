
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ChangeCustomLineItemPriceRoundingModeChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ChangeCustomLineItemPriceRoundingModeChange changeCustomLineItemPriceRoundingModeChange = ChangeCustomLineItemPriceRoundingModeChange.builder()
 *             .change("{change}")
 *             .customLineItem(customLineItemBuilder -> customLineItemBuilder)
 *             .customLineItemId("{customLineItemId}")
 *             .previousValue(RoundingMode.HALF_EVEN)
 *             .nextValue(RoundingMode.HALF_EVEN)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ChangeCustomLineItemPriceRoundingModeChangeBuilder
        implements Builder<ChangeCustomLineItemPriceRoundingModeChange> {

    private String change;

    private com.commercetools.history.models.common.LocalizedString customLineItem;

    private String customLineItemId;

    private com.commercetools.history.models.common.RoundingMode previousValue;

    private com.commercetools.history.models.common.RoundingMode nextValue;

    /**
     * set the value to the change
     * @param change value to be set
     * @return Builder
     */

    public ChangeCustomLineItemPriceRoundingModeChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     *  <p>Name of the updated <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomLineItem" rel="nofollow">CustomLineItem</a>.</p>
     * @param builder function to build the customLineItem value
     * @return Builder
     */

    public ChangeCustomLineItemPriceRoundingModeChangeBuilder customLineItem(
            Function<com.commercetools.history.models.common.LocalizedStringBuilder, com.commercetools.history.models.common.LocalizedStringBuilder> builder) {
        this.customLineItem = builder.apply(com.commercetools.history.models.common.LocalizedStringBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Name of the updated <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomLineItem" rel="nofollow">CustomLineItem</a>.</p>
     * @param builder function to build the customLineItem value
     * @return Builder
     */

    public ChangeCustomLineItemPriceRoundingModeChangeBuilder withCustomLineItem(
            Function<com.commercetools.history.models.common.LocalizedStringBuilder, com.commercetools.history.models.common.LocalizedString> builder) {
        this.customLineItem = builder.apply(com.commercetools.history.models.common.LocalizedStringBuilder.of());
        return this;
    }

    /**
     *  <p>Name of the updated <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomLineItem" rel="nofollow">CustomLineItem</a>.</p>
     * @param customLineItem value to be set
     * @return Builder
     */

    public ChangeCustomLineItemPriceRoundingModeChangeBuilder customLineItem(
            final com.commercetools.history.models.common.LocalizedString customLineItem) {
        this.customLineItem = customLineItem;
        return this;
    }

    /**
     *  <p><code>id</code> of the updated <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomLineItem" rel="nofollow">CustomLineItem</a>.</p>
     * @param customLineItemId value to be set
     * @return Builder
     */

    public ChangeCustomLineItemPriceRoundingModeChangeBuilder customLineItemId(final String customLineItemId) {
        this.customLineItemId = customLineItemId;
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     * @return Builder
     */

    public ChangeCustomLineItemPriceRoundingModeChangeBuilder previousValue(
            final com.commercetools.history.models.common.RoundingMode previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     * @return Builder
     */

    public ChangeCustomLineItemPriceRoundingModeChangeBuilder nextValue(
            final com.commercetools.history.models.common.RoundingMode nextValue) {
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
     *  <p>Name of the updated <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomLineItem" rel="nofollow">CustomLineItem</a>.</p>
     * @return customLineItem
     */

    public com.commercetools.history.models.common.LocalizedString getCustomLineItem() {
        return this.customLineItem;
    }

    /**
     *  <p><code>id</code> of the updated <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomLineItem" rel="nofollow">CustomLineItem</a>.</p>
     * @return customLineItemId
     */

    public String getCustomLineItemId() {
        return this.customLineItemId;
    }

    /**
     *  <p>Value before the change.</p>
     * @return previousValue
     */

    public com.commercetools.history.models.common.RoundingMode getPreviousValue() {
        return this.previousValue;
    }

    /**
     *  <p>Value after the change.</p>
     * @return nextValue
     */

    public com.commercetools.history.models.common.RoundingMode getNextValue() {
        return this.nextValue;
    }

    /**
     * builds ChangeCustomLineItemPriceRoundingModeChange with checking for non-null required values
     * @return ChangeCustomLineItemPriceRoundingModeChange
     */
    public ChangeCustomLineItemPriceRoundingModeChange build() {
        Objects.requireNonNull(change, ChangeCustomLineItemPriceRoundingModeChange.class + ": change is missing");
        Objects.requireNonNull(customLineItem,
            ChangeCustomLineItemPriceRoundingModeChange.class + ": customLineItem is missing");
        Objects.requireNonNull(customLineItemId,
            ChangeCustomLineItemPriceRoundingModeChange.class + ": customLineItemId is missing");
        Objects.requireNonNull(previousValue,
            ChangeCustomLineItemPriceRoundingModeChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, ChangeCustomLineItemPriceRoundingModeChange.class + ": nextValue is missing");
        return new ChangeCustomLineItemPriceRoundingModeChangeImpl(change, customLineItem, customLineItemId,
            previousValue, nextValue);
    }

    /**
     * builds ChangeCustomLineItemPriceRoundingModeChange without checking for non-null required values
     * @return ChangeCustomLineItemPriceRoundingModeChange
     */
    public ChangeCustomLineItemPriceRoundingModeChange buildUnchecked() {
        return new ChangeCustomLineItemPriceRoundingModeChangeImpl(change, customLineItem, customLineItemId,
            previousValue, nextValue);
    }

    /**
     * factory method for an instance of ChangeCustomLineItemPriceRoundingModeChangeBuilder
     * @return builder
     */
    public static ChangeCustomLineItemPriceRoundingModeChangeBuilder of() {
        return new ChangeCustomLineItemPriceRoundingModeChangeBuilder();
    }

    /**
     * create builder for ChangeCustomLineItemPriceRoundingModeChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ChangeCustomLineItemPriceRoundingModeChangeBuilder of(
            final ChangeCustomLineItemPriceRoundingModeChange template) {
        ChangeCustomLineItemPriceRoundingModeChangeBuilder builder = new ChangeCustomLineItemPriceRoundingModeChangeBuilder();
        builder.change = template.getChange();
        builder.customLineItem = template.getCustomLineItem();
        builder.customLineItemId = template.getCustomLineItemId();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
