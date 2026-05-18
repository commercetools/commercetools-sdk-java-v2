
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetReturnItemCustomLineItemCustomTypeChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetReturnItemCustomLineItemCustomTypeChange setReturnItemCustomLineItemCustomTypeChange = SetReturnItemCustomLineItemCustomTypeChange.builder()
 *             .change("{change}")
 *             .customLineItem(customLineItemBuilder -> customLineItemBuilder)
 *             .customLineItemId("{customLineItemId}")
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SetReturnItemCustomLineItemCustomTypeChangeBuilder
        implements Builder<SetReturnItemCustomLineItemCustomTypeChange> {

    private String change;

    private com.commercetools.history.models.common.LocalizedString customLineItem;

    private String customLineItemId;

    private com.commercetools.history.models.common.CustomFields previousValue;

    private com.commercetools.history.models.common.CustomFields nextValue;

    /**
     * set the value to the change
     * @param change value to be set
     * @return Builder
     */

    public SetReturnItemCustomLineItemCustomTypeChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     *  <p>Name of the updated <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomLineItem" rel="nofollow">CustomLineItem</a>.</p>
     * @param builder function to build the customLineItem value
     * @return Builder
     */

    public SetReturnItemCustomLineItemCustomTypeChangeBuilder customLineItem(
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

    public SetReturnItemCustomLineItemCustomTypeChangeBuilder withCustomLineItem(
            Function<com.commercetools.history.models.common.LocalizedStringBuilder, com.commercetools.history.models.common.LocalizedString> builder) {
        this.customLineItem = builder.apply(com.commercetools.history.models.common.LocalizedStringBuilder.of());
        return this;
    }

    /**
     *  <p>Name of the updated <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomLineItem" rel="nofollow">CustomLineItem</a>.</p>
     * @param customLineItem value to be set
     * @return Builder
     */

    public SetReturnItemCustomLineItemCustomTypeChangeBuilder customLineItem(
            final com.commercetools.history.models.common.LocalizedString customLineItem) {
        this.customLineItem = customLineItem;
        return this;
    }

    /**
     *  <p><code>id</code> of the updated <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomLineItem" rel="nofollow">CustomLineItem</a>.</p>
     * @param customLineItemId value to be set
     * @return Builder
     */

    public SetReturnItemCustomLineItemCustomTypeChangeBuilder customLineItemId(final String customLineItemId) {
        this.customLineItemId = customLineItemId;
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param builder function to build the previousValue value
     * @return Builder
     */

    public SetReturnItemCustomLineItemCustomTypeChangeBuilder previousValue(
            Function<com.commercetools.history.models.common.CustomFieldsBuilder, com.commercetools.history.models.common.CustomFieldsBuilder> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.CustomFieldsBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param builder function to build the previousValue value
     * @return Builder
     */

    public SetReturnItemCustomLineItemCustomTypeChangeBuilder withPreviousValue(
            Function<com.commercetools.history.models.common.CustomFieldsBuilder, com.commercetools.history.models.common.CustomFields> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.CustomFieldsBuilder.of());
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     * @return Builder
     */

    public SetReturnItemCustomLineItemCustomTypeChangeBuilder previousValue(
            final com.commercetools.history.models.common.CustomFields previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param builder function to build the nextValue value
     * @return Builder
     */

    public SetReturnItemCustomLineItemCustomTypeChangeBuilder nextValue(
            Function<com.commercetools.history.models.common.CustomFieldsBuilder, com.commercetools.history.models.common.CustomFieldsBuilder> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.CustomFieldsBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param builder function to build the nextValue value
     * @return Builder
     */

    public SetReturnItemCustomLineItemCustomTypeChangeBuilder withNextValue(
            Function<com.commercetools.history.models.common.CustomFieldsBuilder, com.commercetools.history.models.common.CustomFields> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.CustomFieldsBuilder.of());
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     * @return Builder
     */

    public SetReturnItemCustomLineItemCustomTypeChangeBuilder nextValue(
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
     * builds SetReturnItemCustomLineItemCustomTypeChange with checking for non-null required values
     * @return SetReturnItemCustomLineItemCustomTypeChange
     */
    public SetReturnItemCustomLineItemCustomTypeChange build() {
        Objects.requireNonNull(change, SetReturnItemCustomLineItemCustomTypeChange.class + ": change is missing");
        Objects.requireNonNull(customLineItem,
            SetReturnItemCustomLineItemCustomTypeChange.class + ": customLineItem is missing");
        Objects.requireNonNull(customLineItemId,
            SetReturnItemCustomLineItemCustomTypeChange.class + ": customLineItemId is missing");
        Objects.requireNonNull(previousValue,
            SetReturnItemCustomLineItemCustomTypeChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, SetReturnItemCustomLineItemCustomTypeChange.class + ": nextValue is missing");
        return new SetReturnItemCustomLineItemCustomTypeChangeImpl(change, customLineItem, customLineItemId,
            previousValue, nextValue);
    }

    /**
     * builds SetReturnItemCustomLineItemCustomTypeChange without checking for non-null required values
     * @return SetReturnItemCustomLineItemCustomTypeChange
     */
    public SetReturnItemCustomLineItemCustomTypeChange buildUnchecked() {
        return new SetReturnItemCustomLineItemCustomTypeChangeImpl(change, customLineItem, customLineItemId,
            previousValue, nextValue);
    }

    /**
     * factory method for an instance of SetReturnItemCustomLineItemCustomTypeChangeBuilder
     * @return builder
     */
    public static SetReturnItemCustomLineItemCustomTypeChangeBuilder of() {
        return new SetReturnItemCustomLineItemCustomTypeChangeBuilder();
    }

    /**
     * create builder for SetReturnItemCustomLineItemCustomTypeChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetReturnItemCustomLineItemCustomTypeChangeBuilder of(
            final SetReturnItemCustomLineItemCustomTypeChange template) {
        SetReturnItemCustomLineItemCustomTypeChangeBuilder builder = new SetReturnItemCustomLineItemCustomTypeChangeBuilder();
        builder.change = template.getChange();
        builder.customLineItem = template.getCustomLineItem();
        builder.customLineItemId = template.getCustomLineItemId();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
