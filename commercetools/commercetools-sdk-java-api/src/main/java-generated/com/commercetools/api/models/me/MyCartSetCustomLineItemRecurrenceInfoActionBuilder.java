
package com.commercetools.api.models.me;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * MyCartSetCustomLineItemRecurrenceInfoActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MyCartSetCustomLineItemRecurrenceInfoAction myCartSetCustomLineItemRecurrenceInfoAction = MyCartSetCustomLineItemRecurrenceInfoAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class MyCartSetCustomLineItemRecurrenceInfoActionBuilder
        implements Builder<MyCartSetCustomLineItemRecurrenceInfoAction> {

    @Nullable
    private String customLineItemId;

    @Nullable
    private String customLineItemKey;

    @Nullable
    private com.commercetools.api.models.recurring_order.CustomLineItemRecurrenceInfoDraft recurrenceInfo;

    /**
     *  <p><code>id</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomLineItem" rel="nofollow">CustomLineItem</a> to update. Either <code>customLineItemId</code> or <code>customLineItemKey</code> is required.</p>
     * @param customLineItemId value to be set
     * @return Builder
     */

    public MyCartSetCustomLineItemRecurrenceInfoActionBuilder customLineItemId(
            @Nullable final String customLineItemId) {
        this.customLineItemId = customLineItemId;
        return this;
    }

    /**
     *  <p><code>key</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomLineItem" rel="nofollow">CustomLineItem</a> to update. Either <code>customLineItemId</code> or <code>customLineItemKey</code> is required.</p>
     * @param customLineItemKey value to be set
     * @return Builder
     */

    public MyCartSetCustomLineItemRecurrenceInfoActionBuilder customLineItemKey(
            @Nullable final String customLineItemKey) {
        this.customLineItemKey = customLineItemKey;
        return this;
    }

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @param builder function to build the recurrenceInfo value
     * @return Builder
     */

    public MyCartSetCustomLineItemRecurrenceInfoActionBuilder recurrenceInfo(
            Function<com.commercetools.api.models.recurring_order.CustomLineItemRecurrenceInfoDraftBuilder, com.commercetools.api.models.recurring_order.CustomLineItemRecurrenceInfoDraftBuilder> builder) {
        this.recurrenceInfo = builder
                .apply(com.commercetools.api.models.recurring_order.CustomLineItemRecurrenceInfoDraftBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @param builder function to build the recurrenceInfo value
     * @return Builder
     */

    public MyCartSetCustomLineItemRecurrenceInfoActionBuilder withRecurrenceInfo(
            Function<com.commercetools.api.models.recurring_order.CustomLineItemRecurrenceInfoDraftBuilder, com.commercetools.api.models.recurring_order.CustomLineItemRecurrenceInfoDraft> builder) {
        this.recurrenceInfo = builder
                .apply(com.commercetools.api.models.recurring_order.CustomLineItemRecurrenceInfoDraftBuilder.of());
        return this;
    }

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @param recurrenceInfo value to be set
     * @return Builder
     */

    public MyCartSetCustomLineItemRecurrenceInfoActionBuilder recurrenceInfo(
            @Nullable final com.commercetools.api.models.recurring_order.CustomLineItemRecurrenceInfoDraft recurrenceInfo) {
        this.recurrenceInfo = recurrenceInfo;
        return this;
    }

    /**
     *  <p><code>id</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomLineItem" rel="nofollow">CustomLineItem</a> to update. Either <code>customLineItemId</code> or <code>customLineItemKey</code> is required.</p>
     * @return customLineItemId
     */

    @Nullable
    public String getCustomLineItemId() {
        return this.customLineItemId;
    }

    /**
     *  <p><code>key</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomLineItem" rel="nofollow">CustomLineItem</a> to update. Either <code>customLineItemId</code> or <code>customLineItemKey</code> is required.</p>
     * @return customLineItemKey
     */

    @Nullable
    public String getCustomLineItemKey() {
        return this.customLineItemKey;
    }

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @return recurrenceInfo
     */

    @Nullable
    public com.commercetools.api.models.recurring_order.CustomLineItemRecurrenceInfoDraft getRecurrenceInfo() {
        return this.recurrenceInfo;
    }

    /**
     * builds MyCartSetCustomLineItemRecurrenceInfoAction with checking for non-null required values
     * @return MyCartSetCustomLineItemRecurrenceInfoAction
     */
    public MyCartSetCustomLineItemRecurrenceInfoAction build() {
        return new MyCartSetCustomLineItemRecurrenceInfoActionImpl(customLineItemId, customLineItemKey, recurrenceInfo);
    }

    /**
     * builds MyCartSetCustomLineItemRecurrenceInfoAction without checking for non-null required values
     * @return MyCartSetCustomLineItemRecurrenceInfoAction
     */
    public MyCartSetCustomLineItemRecurrenceInfoAction buildUnchecked() {
        return new MyCartSetCustomLineItemRecurrenceInfoActionImpl(customLineItemId, customLineItemKey, recurrenceInfo);
    }

    /**
     * factory method for an instance of MyCartSetCustomLineItemRecurrenceInfoActionBuilder
     * @return builder
     */
    public static MyCartSetCustomLineItemRecurrenceInfoActionBuilder of() {
        return new MyCartSetCustomLineItemRecurrenceInfoActionBuilder();
    }

    /**
     * create builder for MyCartSetCustomLineItemRecurrenceInfoAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static MyCartSetCustomLineItemRecurrenceInfoActionBuilder of(
            final MyCartSetCustomLineItemRecurrenceInfoAction template) {
        MyCartSetCustomLineItemRecurrenceInfoActionBuilder builder = new MyCartSetCustomLineItemRecurrenceInfoActionBuilder();
        builder.customLineItemId = template.getCustomLineItemId();
        builder.customLineItemKey = template.getCustomLineItemKey();
        builder.recurrenceInfo = template.getRecurrenceInfo();
        return builder;
    }

}
