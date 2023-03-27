
package com.commercetools.api.models.order_edit;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * OrderEditSetKeyActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderEditSetKeyAction orderEditSetKeyAction = OrderEditSetKeyAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class OrderEditSetKeyActionBuilder implements Builder<OrderEditSetKeyAction> {

    @Nullable
    private String key;

    /**
     *  <p>If <code>key</code> is absent or <code>null</code>, this field will be removed if it exists.</p>
     * @param key value to be set
     * @return Builder
     */

    public OrderEditSetKeyActionBuilder key(@Nullable final String key) {
        this.key = key;
        return this;
    }

    /**
     *  <p>If <code>key</code> is absent or <code>null</code>, this field will be removed if it exists.</p>
     * @return key
     */

    @Nullable
    public String getKey() {
        return this.key;
    }

    /**
     * builds OrderEditSetKeyAction with checking for non-null required values
     * @return OrderEditSetKeyAction
     */
    public OrderEditSetKeyAction build() {
        return new OrderEditSetKeyActionImpl(key);
    }

    /**
     * builds OrderEditSetKeyAction without checking for non-null required values
     * @return OrderEditSetKeyAction
     */
    public OrderEditSetKeyAction buildUnchecked() {
        return new OrderEditSetKeyActionImpl(key);
    }

    /**
     * factory method for an instance of OrderEditSetKeyActionBuilder
     * @return builder
     */
    public static OrderEditSetKeyActionBuilder of() {
        return new OrderEditSetKeyActionBuilder();
    }

    /**
     * create builder for OrderEditSetKeyAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderEditSetKeyActionBuilder of(final OrderEditSetKeyAction template) {
        OrderEditSetKeyActionBuilder builder = new OrderEditSetKeyActionBuilder();
        builder.key = template.getKey();
        return builder;
    }

}
