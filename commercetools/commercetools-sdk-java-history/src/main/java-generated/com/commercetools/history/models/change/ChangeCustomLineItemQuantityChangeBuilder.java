
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
 *             .previousValue(1)
 *             .nextValue(1)
 *             .customLineItem(customLineItemBuilder -> customLineItemBuilder)
 *             .customLineItemId("{customLineItemId}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ChangeCustomLineItemQuantityChangeBuilder implements Builder<ChangeCustomLineItemQuantityChange> {

    private String change;

    private Integer previousValue;

    private Integer nextValue;

    private com.commercetools.history.models.common.LocalizedString customLineItem;

    private String customLineItemId;

    /**
     * set the value to the change
     * @param change value to be set
     * @return Builder
     */

    public ChangeCustomLineItemQuantityChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     * @return Builder
     */

    public ChangeCustomLineItemQuantityChangeBuilder previousValue(final Integer previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     * @return Builder
     */

    public ChangeCustomLineItemQuantityChangeBuilder nextValue(final Integer nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    /**
     *  <p>Name of the CustomLineItem.</p>
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
     *  <p>Name of the CustomLineItem.</p>
     * @param builder function to build the customLineItem value
     * @return Builder
     */

    public ChangeCustomLineItemQuantityChangeBuilder withCustomLineItem(
            Function<com.commercetools.history.models.common.LocalizedStringBuilder, com.commercetools.history.models.common.LocalizedString> builder) {
        this.customLineItem = builder.apply(com.commercetools.history.models.common.LocalizedStringBuilder.of());
        return this;
    }

    /**
     *  <p>Name of the CustomLineItem.</p>
     * @param customLineItem value to be set
     * @return Builder
     */

    public ChangeCustomLineItemQuantityChangeBuilder customLineItem(
            final com.commercetools.history.models.common.LocalizedString customLineItem) {
        this.customLineItem = customLineItem;
        return this;
    }

    /**
     *  <p><code>id</code> of the updated <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomLineItem" rel="nofollow">CustomLineItem</a>.</p>
     * @param customLineItemId value to be set
     * @return Builder
     */

    public ChangeCustomLineItemQuantityChangeBuilder customLineItemId(final String customLineItemId) {
        this.customLineItemId = customLineItemId;
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

    public Integer getPreviousValue() {
        return this.previousValue;
    }

    /**
     *  <p>Value after the change.</p>
     * @return nextValue
     */

    public Integer getNextValue() {
        return this.nextValue;
    }

    /**
     *  <p>Name of the CustomLineItem.</p>
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
     * builds ChangeCustomLineItemQuantityChange with checking for non-null required values
     * @return ChangeCustomLineItemQuantityChange
     */
    public ChangeCustomLineItemQuantityChange build() {
        Objects.requireNonNull(change, ChangeCustomLineItemQuantityChange.class + ": change is missing");
        Objects.requireNonNull(previousValue, ChangeCustomLineItemQuantityChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, ChangeCustomLineItemQuantityChange.class + ": nextValue is missing");
        Objects.requireNonNull(customLineItem,
            ChangeCustomLineItemQuantityChange.class + ": customLineItem is missing");
        Objects.requireNonNull(customLineItemId,
            ChangeCustomLineItemQuantityChange.class + ": customLineItemId is missing");
        return new ChangeCustomLineItemQuantityChangeImpl(change, previousValue, nextValue, customLineItem,
            customLineItemId);
    }

    /**
     * builds ChangeCustomLineItemQuantityChange without checking for non-null required values
     * @return ChangeCustomLineItemQuantityChange
     */
    public ChangeCustomLineItemQuantityChange buildUnchecked() {
        return new ChangeCustomLineItemQuantityChangeImpl(change, previousValue, nextValue, customLineItem,
            customLineItemId);
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
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        builder.customLineItem = template.getCustomLineItem();
        builder.customLineItemId = template.getCustomLineItemId();
        return builder;
    }

}
