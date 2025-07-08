
package com.commercetools.api.models.cart;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CartSetLineItemRecurrenceInfoActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartSetLineItemRecurrenceInfoAction cartSetLineItemRecurrenceInfoAction = CartSetLineItemRecurrenceInfoAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CartSetLineItemRecurrenceInfoActionBuilder implements Builder<CartSetLineItemRecurrenceInfoAction> {

    @Nullable
    private String lineItemId;

    @Nullable
    private String lineItemKey;

    @Nullable
    private com.commercetools.api.models.recurring_order.LineItemRecurrenceInfoDraft recurrenceInfo;

    /**
     *  <p><code>id</code> of the LineItem to update. Either <code>lineItemId</code> or <code>lineItemKey</code> is required.</p>
     * @param lineItemId value to be set
     * @return Builder
     */

    public CartSetLineItemRecurrenceInfoActionBuilder lineItemId(@Nullable final String lineItemId) {
        this.lineItemId = lineItemId;
        return this;
    }

    /**
     *  <p><code>key</code> of the LineItem to update. Either <code>lineItemId</code> or <code>lineItemKey</code> is required.</p>
     * @param lineItemKey value to be set
     * @return Builder
     */

    public CartSetLineItemRecurrenceInfoActionBuilder lineItemKey(@Nullable final String lineItemKey) {
        this.lineItemKey = lineItemKey;
        return this;
    }

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @param builder function to build the recurrenceInfo value
     * @return Builder
     */

    public CartSetLineItemRecurrenceInfoActionBuilder recurrenceInfo(
            Function<com.commercetools.api.models.recurring_order.LineItemRecurrenceInfoDraftBuilder, com.commercetools.api.models.recurring_order.LineItemRecurrenceInfoDraftBuilder> builder) {
        this.recurrenceInfo = builder
                .apply(com.commercetools.api.models.recurring_order.LineItemRecurrenceInfoDraftBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @param builder function to build the recurrenceInfo value
     * @return Builder
     */

    public CartSetLineItemRecurrenceInfoActionBuilder withRecurrenceInfo(
            Function<com.commercetools.api.models.recurring_order.LineItemRecurrenceInfoDraftBuilder, com.commercetools.api.models.recurring_order.LineItemRecurrenceInfoDraft> builder) {
        this.recurrenceInfo = builder
                .apply(com.commercetools.api.models.recurring_order.LineItemRecurrenceInfoDraftBuilder.of());
        return this;
    }

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @param recurrenceInfo value to be set
     * @return Builder
     */

    public CartSetLineItemRecurrenceInfoActionBuilder recurrenceInfo(
            @Nullable final com.commercetools.api.models.recurring_order.LineItemRecurrenceInfoDraft recurrenceInfo) {
        this.recurrenceInfo = recurrenceInfo;
        return this;
    }

    /**
     *  <p><code>id</code> of the LineItem to update. Either <code>lineItemId</code> or <code>lineItemKey</code> is required.</p>
     * @return lineItemId
     */

    @Nullable
    public String getLineItemId() {
        return this.lineItemId;
    }

    /**
     *  <p><code>key</code> of the LineItem to update. Either <code>lineItemId</code> or <code>lineItemKey</code> is required.</p>
     * @return lineItemKey
     */

    @Nullable
    public String getLineItemKey() {
        return this.lineItemKey;
    }

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @return recurrenceInfo
     */

    @Nullable
    public com.commercetools.api.models.recurring_order.LineItemRecurrenceInfoDraft getRecurrenceInfo() {
        return this.recurrenceInfo;
    }

    /**
     * builds CartSetLineItemRecurrenceInfoAction with checking for non-null required values
     * @return CartSetLineItemRecurrenceInfoAction
     */
    public CartSetLineItemRecurrenceInfoAction build() {
        return new CartSetLineItemRecurrenceInfoActionImpl(lineItemId, lineItemKey, recurrenceInfo);
    }

    /**
     * builds CartSetLineItemRecurrenceInfoAction without checking for non-null required values
     * @return CartSetLineItemRecurrenceInfoAction
     */
    public CartSetLineItemRecurrenceInfoAction buildUnchecked() {
        return new CartSetLineItemRecurrenceInfoActionImpl(lineItemId, lineItemKey, recurrenceInfo);
    }

    /**
     * factory method for an instance of CartSetLineItemRecurrenceInfoActionBuilder
     * @return builder
     */
    public static CartSetLineItemRecurrenceInfoActionBuilder of() {
        return new CartSetLineItemRecurrenceInfoActionBuilder();
    }

    /**
     * create builder for CartSetLineItemRecurrenceInfoAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CartSetLineItemRecurrenceInfoActionBuilder of(final CartSetLineItemRecurrenceInfoAction template) {
        CartSetLineItemRecurrenceInfoActionBuilder builder = new CartSetLineItemRecurrenceInfoActionBuilder();
        builder.lineItemId = template.getLineItemId();
        builder.lineItemKey = template.getLineItemKey();
        builder.recurrenceInfo = template.getRecurrenceInfo();
        return builder;
    }

}
