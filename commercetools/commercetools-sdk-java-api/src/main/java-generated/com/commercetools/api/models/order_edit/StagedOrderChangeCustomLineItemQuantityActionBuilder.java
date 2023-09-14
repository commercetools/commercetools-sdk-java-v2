
package com.commercetools.api.models.order_edit;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * StagedOrderChangeCustomLineItemQuantityActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StagedOrderChangeCustomLineItemQuantityAction stagedOrderChangeCustomLineItemQuantityAction = StagedOrderChangeCustomLineItemQuantityAction.builder()
 *             .quantity(0.3)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StagedOrderChangeCustomLineItemQuantityActionBuilder
        implements Builder<StagedOrderChangeCustomLineItemQuantityAction> {

    @Nullable
    private String customLineItemId;

    @Nullable
    private String customLineItemKey;

    private Long quantity;

    /**
     *  <p><code>id</code> of the CustomLineItem to update. Either <code>customLineItemId</code> or <code>customLineItemKey</code> is required.</p>
     * @param customLineItemId value to be set
     * @return Builder
     */

    public StagedOrderChangeCustomLineItemQuantityActionBuilder customLineItemId(
            @Nullable final String customLineItemId) {
        this.customLineItemId = customLineItemId;
        return this;
    }

    /**
     *  <p><code>key</code> of the CustomLineItem to update. Either <code>customLineItemId</code> or <code>customLineItemKey</code> is required.</p>
     * @param customLineItemKey value to be set
     * @return Builder
     */

    public StagedOrderChangeCustomLineItemQuantityActionBuilder customLineItemKey(
            @Nullable final String customLineItemKey) {
        this.customLineItemKey = customLineItemKey;
        return this;
    }

    /**
     *  <p>New value to set. If <code>0</code>, the Custom Line Item is removed from the Order.</p>
     * @param quantity value to be set
     * @return Builder
     */

    public StagedOrderChangeCustomLineItemQuantityActionBuilder quantity(final Long quantity) {
        this.quantity = quantity;
        return this;
    }

    /**
     *  <p><code>id</code> of the CustomLineItem to update. Either <code>customLineItemId</code> or <code>customLineItemKey</code> is required.</p>
     * @return customLineItemId
     */

    @Nullable
    public String getCustomLineItemId() {
        return this.customLineItemId;
    }

    /**
     *  <p><code>key</code> of the CustomLineItem to update. Either <code>customLineItemId</code> or <code>customLineItemKey</code> is required.</p>
     * @return customLineItemKey
     */

    @Nullable
    public String getCustomLineItemKey() {
        return this.customLineItemKey;
    }

    /**
     *  <p>New value to set. If <code>0</code>, the Custom Line Item is removed from the Order.</p>
     * @return quantity
     */

    public Long getQuantity() {
        return this.quantity;
    }

    /**
     * builds StagedOrderChangeCustomLineItemQuantityAction with checking for non-null required values
     * @return StagedOrderChangeCustomLineItemQuantityAction
     */
    public StagedOrderChangeCustomLineItemQuantityAction build() {
        Objects.requireNonNull(quantity, StagedOrderChangeCustomLineItemQuantityAction.class + ": quantity is missing");
        return new StagedOrderChangeCustomLineItemQuantityActionImpl(customLineItemId, customLineItemKey, quantity);
    }

    /**
     * builds StagedOrderChangeCustomLineItemQuantityAction without checking for non-null required values
     * @return StagedOrderChangeCustomLineItemQuantityAction
     */
    public StagedOrderChangeCustomLineItemQuantityAction buildUnchecked() {
        return new StagedOrderChangeCustomLineItemQuantityActionImpl(customLineItemId, customLineItemKey, quantity);
    }

    /**
     * factory method for an instance of StagedOrderChangeCustomLineItemQuantityActionBuilder
     * @return builder
     */
    public static StagedOrderChangeCustomLineItemQuantityActionBuilder of() {
        return new StagedOrderChangeCustomLineItemQuantityActionBuilder();
    }

    /**
     * create builder for StagedOrderChangeCustomLineItemQuantityAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StagedOrderChangeCustomLineItemQuantityActionBuilder of(
            final StagedOrderChangeCustomLineItemQuantityAction template) {
        StagedOrderChangeCustomLineItemQuantityActionBuilder builder = new StagedOrderChangeCustomLineItemQuantityActionBuilder();
        builder.customLineItemId = template.getCustomLineItemId();
        builder.customLineItemKey = template.getCustomLineItemKey();
        builder.quantity = template.getQuantity();
        return builder;
    }

}
