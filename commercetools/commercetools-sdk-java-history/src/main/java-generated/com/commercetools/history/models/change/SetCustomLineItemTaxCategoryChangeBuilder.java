
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetCustomLineItemTaxCategoryChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetCustomLineItemTaxCategoryChange setCustomLineItemTaxCategoryChange = SetCustomLineItemTaxCategoryChange.builder()
 *             .change("{change}")
 *             .customLineItem(customLineItemBuilder -> customLineItemBuilder)
 *             .customLineItemId("{customLineItemId}")
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SetCustomLineItemTaxCategoryChangeBuilder implements Builder<SetCustomLineItemTaxCategoryChange> {

    private String change;

    private com.commercetools.history.models.common.LocalizedString customLineItem;

    private String customLineItemId;

    private com.commercetools.history.models.common.Reference nextValue;

    private com.commercetools.history.models.common.Reference previousValue;

    /**
     *  <p>Update action for <code>setCustomLineItemTaxCategory</code></p>
     * @param change value to be set
     * @return Builder
     */

    public SetCustomLineItemTaxCategoryChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     * set the value to the customLineItem using the builder function
     * @param builder function to build the customLineItem value
     * @return Builder
     */

    public SetCustomLineItemTaxCategoryChangeBuilder customLineItem(
            Function<com.commercetools.history.models.common.LocalizedStringBuilder, com.commercetools.history.models.common.LocalizedStringBuilder> builder) {
        this.customLineItem = builder.apply(com.commercetools.history.models.common.LocalizedStringBuilder.of())
                .build();
        return this;
    }

    /**
     * set the value to the customLineItem
     * @param customLineItem value to be set
     * @return Builder
     */

    public SetCustomLineItemTaxCategoryChangeBuilder customLineItem(
            final com.commercetools.history.models.common.LocalizedString customLineItem) {
        this.customLineItem = customLineItem;
        return this;
    }

    /**
     * set the value to the customLineItemId
     * @param customLineItemId value to be set
     * @return Builder
     */

    public SetCustomLineItemTaxCategoryChangeBuilder customLineItemId(final String customLineItemId) {
        this.customLineItemId = customLineItemId;
        return this;
    }

    /**
     * set the value to the nextValue using the builder function
     * @param builder function to build the nextValue value
     * @return Builder
     */

    public SetCustomLineItemTaxCategoryChangeBuilder nextValue(
            Function<com.commercetools.history.models.common.ReferenceBuilder, com.commercetools.history.models.common.ReferenceBuilder> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.ReferenceBuilder.of()).build();
        return this;
    }

    /**
     * set the value to the nextValue
     * @param nextValue value to be set
     * @return Builder
     */

    public SetCustomLineItemTaxCategoryChangeBuilder nextValue(
            final com.commercetools.history.models.common.Reference nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    /**
     * set the value to the previousValue using the builder function
     * @param builder function to build the previousValue value
     * @return Builder
     */

    public SetCustomLineItemTaxCategoryChangeBuilder previousValue(
            Function<com.commercetools.history.models.common.ReferenceBuilder, com.commercetools.history.models.common.ReferenceBuilder> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.ReferenceBuilder.of()).build();
        return this;
    }

    /**
     * set the value to the previousValue
     * @param previousValue value to be set
     * @return Builder
     */

    public SetCustomLineItemTaxCategoryChangeBuilder previousValue(
            final com.commercetools.history.models.common.Reference previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     *  <p>Update action for <code>setCustomLineItemTaxCategory</code></p>
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

    public com.commercetools.history.models.common.Reference getNextValue() {
        return this.nextValue;
    }

    /**
     * value of previousValue}
     * @return previousValue
     */

    public com.commercetools.history.models.common.Reference getPreviousValue() {
        return this.previousValue;
    }

    /**
     * builds SetCustomLineItemTaxCategoryChange with checking for non-null required values
     * @return SetCustomLineItemTaxCategoryChange
     */
    public SetCustomLineItemTaxCategoryChange build() {
        Objects.requireNonNull(change, SetCustomLineItemTaxCategoryChange.class + ": change is missing");
        Objects.requireNonNull(customLineItem,
            SetCustomLineItemTaxCategoryChange.class + ": customLineItem is missing");
        Objects.requireNonNull(customLineItemId,
            SetCustomLineItemTaxCategoryChange.class + ": customLineItemId is missing");
        Objects.requireNonNull(nextValue, SetCustomLineItemTaxCategoryChange.class + ": nextValue is missing");
        Objects.requireNonNull(previousValue, SetCustomLineItemTaxCategoryChange.class + ": previousValue is missing");
        return new SetCustomLineItemTaxCategoryChangeImpl(change, customLineItem, customLineItemId, nextValue,
            previousValue);
    }

    /**
     * builds SetCustomLineItemTaxCategoryChange without checking for non-null required values
     * @return SetCustomLineItemTaxCategoryChange
     */
    public SetCustomLineItemTaxCategoryChange buildUnchecked() {
        return new SetCustomLineItemTaxCategoryChangeImpl(change, customLineItem, customLineItemId, nextValue,
            previousValue);
    }

    /**
     * factory method for an instance of SetCustomLineItemTaxCategoryChangeBuilder
     * @return builder
     */
    public static SetCustomLineItemTaxCategoryChangeBuilder of() {
        return new SetCustomLineItemTaxCategoryChangeBuilder();
    }

    /**
     * create builder for SetCustomLineItemTaxCategoryChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetCustomLineItemTaxCategoryChangeBuilder of(final SetCustomLineItemTaxCategoryChange template) {
        SetCustomLineItemTaxCategoryChangeBuilder builder = new SetCustomLineItemTaxCategoryChangeBuilder();
        builder.change = template.getChange();
        builder.customLineItem = template.getCustomLineItem();
        builder.customLineItemId = template.getCustomLineItemId();
        builder.nextValue = template.getNextValue();
        builder.previousValue = template.getPreviousValue();
        return builder;
    }

}
