
package com.commercetools.api.models.me;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * MyCartSetLineItemShippingDetailsActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MyCartSetLineItemShippingDetailsAction myCartSetLineItemShippingDetailsAction = MyCartSetLineItemShippingDetailsAction.builder()
 *             .lineItemId("{lineItemId}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class MyCartSetLineItemShippingDetailsActionBuilder implements Builder<MyCartSetLineItemShippingDetailsAction> {

    private String lineItemId;

    @Nullable
    private com.commercetools.api.models.cart.ItemShippingDetailsDraft shippingDetails;

    /**
     *  <p><code>id</code> of the LineItem to update.</p>
     * @param lineItemId value to be set
     * @return Builder
     */

    public MyCartSetLineItemShippingDetailsActionBuilder lineItemId(final String lineItemId) {
        this.lineItemId = lineItemId;
        return this;
    }

    /**
     *  <p>Value to set. If empty, the existing value is removed.</p>
     * @param builder function to build the shippingDetails value
     * @return Builder
     */

    public MyCartSetLineItemShippingDetailsActionBuilder shippingDetails(
            Function<com.commercetools.api.models.cart.ItemShippingDetailsDraftBuilder, com.commercetools.api.models.cart.ItemShippingDetailsDraftBuilder> builder) {
        this.shippingDetails = builder.apply(com.commercetools.api.models.cart.ItemShippingDetailsDraftBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Value to set. If empty, the existing value is removed.</p>
     * @param shippingDetails value to be set
     * @return Builder
     */

    public MyCartSetLineItemShippingDetailsActionBuilder shippingDetails(
            @Nullable final com.commercetools.api.models.cart.ItemShippingDetailsDraft shippingDetails) {
        this.shippingDetails = shippingDetails;
        return this;
    }

    /**
     *  <p><code>id</code> of the LineItem to update.</p>
     * @return lineItemId
     */

    public String getLineItemId() {
        return this.lineItemId;
    }

    /**
     *  <p>Value to set. If empty, the existing value is removed.</p>
     * @return shippingDetails
     */

    @Nullable
    public com.commercetools.api.models.cart.ItemShippingDetailsDraft getShippingDetails() {
        return this.shippingDetails;
    }

    /**
     * builds MyCartSetLineItemShippingDetailsAction with checking for non-null required values
     * @return MyCartSetLineItemShippingDetailsAction
     */
    public MyCartSetLineItemShippingDetailsAction build() {
        Objects.requireNonNull(lineItemId, MyCartSetLineItemShippingDetailsAction.class + ": lineItemId is missing");
        return new MyCartSetLineItemShippingDetailsActionImpl(lineItemId, shippingDetails);
    }

    /**
     * builds MyCartSetLineItemShippingDetailsAction without checking for non-null required values
     * @return MyCartSetLineItemShippingDetailsAction
     */
    public MyCartSetLineItemShippingDetailsAction buildUnchecked() {
        return new MyCartSetLineItemShippingDetailsActionImpl(lineItemId, shippingDetails);
    }

    /**
     * factory method for an instance of MyCartSetLineItemShippingDetailsActionBuilder
     * @return builder
     */
    public static MyCartSetLineItemShippingDetailsActionBuilder of() {
        return new MyCartSetLineItemShippingDetailsActionBuilder();
    }

    /**
     * create builder for MyCartSetLineItemShippingDetailsAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static MyCartSetLineItemShippingDetailsActionBuilder of(
            final MyCartSetLineItemShippingDetailsAction template) {
        MyCartSetLineItemShippingDetailsActionBuilder builder = new MyCartSetLineItemShippingDetailsActionBuilder();
        builder.lineItemId = template.getLineItemId();
        builder.shippingDetails = template.getShippingDetails();
        return builder;
    }

}
