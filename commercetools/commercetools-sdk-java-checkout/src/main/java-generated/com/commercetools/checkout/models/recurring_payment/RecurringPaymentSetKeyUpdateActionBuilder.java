
package com.commercetools.checkout.models.recurring_payment;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * RecurringPaymentSetKeyUpdateActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     RecurringPaymentSetKeyUpdateAction recurringPaymentSetKeyUpdateAction = RecurringPaymentSetKeyUpdateAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class RecurringPaymentSetKeyUpdateActionBuilder implements Builder<RecurringPaymentSetKeyUpdateAction> {

    @Nullable
    private String key;

    /**
     *  <p>Key to set. If omitted, any existing value is removed.</p>
     * @param key value to be set
     * @return Builder
     */

    public RecurringPaymentSetKeyUpdateActionBuilder key(@Nullable final String key) {
        this.key = key;
        return this;
    }

    /**
     *  <p>Key to set. If omitted, any existing value is removed.</p>
     * @return key
     */

    @Nullable
    public String getKey() {
        return this.key;
    }

    /**
     * builds RecurringPaymentSetKeyUpdateAction with checking for non-null required values
     * @return RecurringPaymentSetKeyUpdateAction
     */
    public RecurringPaymentSetKeyUpdateAction build() {
        return new RecurringPaymentSetKeyUpdateActionImpl(key);
    }

    /**
     * builds RecurringPaymentSetKeyUpdateAction without checking for non-null required values
     * @return RecurringPaymentSetKeyUpdateAction
     */
    public RecurringPaymentSetKeyUpdateAction buildUnchecked() {
        return new RecurringPaymentSetKeyUpdateActionImpl(key);
    }

    /**
     * factory method for an instance of RecurringPaymentSetKeyUpdateActionBuilder
     * @return builder
     */
    public static RecurringPaymentSetKeyUpdateActionBuilder of() {
        return new RecurringPaymentSetKeyUpdateActionBuilder();
    }

    /**
     * create builder for RecurringPaymentSetKeyUpdateAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static RecurringPaymentSetKeyUpdateActionBuilder of(final RecurringPaymentSetKeyUpdateAction template) {
        RecurringPaymentSetKeyUpdateActionBuilder builder = new RecurringPaymentSetKeyUpdateActionBuilder();
        builder.key = template.getKey();
        return builder;
    }

}
