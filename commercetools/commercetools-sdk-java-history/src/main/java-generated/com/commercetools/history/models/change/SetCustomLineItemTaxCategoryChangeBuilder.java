
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
     * @param change
     * @return Builder
     */

    public SetCustomLineItemTaxCategoryChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     *
     * @return Builder
     */

    public SetCustomLineItemTaxCategoryChangeBuilder customLineItem(
            Function<com.commercetools.history.models.common.LocalizedStringBuilder, com.commercetools.history.models.common.LocalizedStringBuilder> builder) {
        this.customLineItem = builder.apply(com.commercetools.history.models.common.LocalizedStringBuilder.of())
                .build();
        return this;
    }

    /**
     *
     * @param customLineItem
     * @return Builder
     */

    public SetCustomLineItemTaxCategoryChangeBuilder customLineItem(
            final com.commercetools.history.models.common.LocalizedString customLineItem) {
        this.customLineItem = customLineItem;
        return this;
    }

    /**
     *
     * @param customLineItemId
     * @return Builder
     */

    public SetCustomLineItemTaxCategoryChangeBuilder customLineItemId(final String customLineItemId) {
        this.customLineItemId = customLineItemId;
        return this;
    }

    /**
     *
     * @return Builder
     */

    public SetCustomLineItemTaxCategoryChangeBuilder nextValue(
            Function<com.commercetools.history.models.common.ReferenceBuilder, com.commercetools.history.models.common.ReferenceBuilder> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.ReferenceBuilder.of()).build();
        return this;
    }

    /**
     *
     * @param nextValue
     * @return Builder
     */

    public SetCustomLineItemTaxCategoryChangeBuilder nextValue(
            final com.commercetools.history.models.common.Reference nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    /**
     *
     * @return Builder
     */

    public SetCustomLineItemTaxCategoryChangeBuilder previousValue(
            Function<com.commercetools.history.models.common.ReferenceBuilder, com.commercetools.history.models.common.ReferenceBuilder> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.ReferenceBuilder.of()).build();
        return this;
    }

    /**
     *
     * @param previousValue
     * @return Builder
     */

    public SetCustomLineItemTaxCategoryChangeBuilder previousValue(
            final com.commercetools.history.models.common.Reference previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    public String getChange() {
        return this.change;
    }

    public com.commercetools.history.models.common.LocalizedString getCustomLineItem() {
        return this.customLineItem;
    }

    public String getCustomLineItemId() {
        return this.customLineItemId;
    }

    public com.commercetools.history.models.common.Reference getNextValue() {
        return this.nextValue;
    }

    public com.commercetools.history.models.common.Reference getPreviousValue() {
        return this.previousValue;
    }

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
     * builds SetCustomLineItemTaxCategoryChange without checking for non null required values
     */
    public SetCustomLineItemTaxCategoryChange buildUnchecked() {
        return new SetCustomLineItemTaxCategoryChangeImpl(change, customLineItem, customLineItemId, nextValue,
            previousValue);
    }

    public static SetCustomLineItemTaxCategoryChangeBuilder of() {
        return new SetCustomLineItemTaxCategoryChangeBuilder();
    }

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
