
package com.commercetools.api.models.message;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * OrderDiscountCodeStateSetMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderDiscountCodeStateSetMessagePayload orderDiscountCodeStateSetMessagePayload = OrderDiscountCodeStateSetMessagePayload.builder()
 *             .discountCode(discountCodeBuilder -> discountCodeBuilder)
 *             .state(DiscountCodeState.NOT_ACTIVE)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class OrderDiscountCodeStateSetMessagePayloadBuilder
        implements Builder<OrderDiscountCodeStateSetMessagePayload> {

    private com.commercetools.api.models.discount_code.DiscountCodeReference discountCode;

    private com.commercetools.api.models.cart.DiscountCodeState state;

    @Nullable
    private com.commercetools.api.models.cart.DiscountCodeState oldState;

    /**
     *  <p>DiscountCode that changed due to the recalculation.</p>
     * @param builder function to build the discountCode value
     * @return Builder
     */

    public OrderDiscountCodeStateSetMessagePayloadBuilder discountCode(
            Function<com.commercetools.api.models.discount_code.DiscountCodeReferenceBuilder, com.commercetools.api.models.discount_code.DiscountCodeReferenceBuilder> builder) {
        this.discountCode = builder.apply(com.commercetools.api.models.discount_code.DiscountCodeReferenceBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>DiscountCode that changed due to the recalculation.</p>
     * @param discountCode value to be set
     * @return Builder
     */

    public OrderDiscountCodeStateSetMessagePayloadBuilder discountCode(
            final com.commercetools.api.models.discount_code.DiscountCodeReference discountCode) {
        this.discountCode = discountCode;
        return this;
    }

    /**
     *  <p>DiscountCodeState after the recalculation.</p>
     * @param state value to be set
     * @return Builder
     */

    public OrderDiscountCodeStateSetMessagePayloadBuilder state(
            final com.commercetools.api.models.cart.DiscountCodeState state) {
        this.state = state;
        return this;
    }

    /**
     *  <p>DiscountCodeState before the recalculation.</p>
     * @param oldState value to be set
     * @return Builder
     */

    public OrderDiscountCodeStateSetMessagePayloadBuilder oldState(
            @Nullable final com.commercetools.api.models.cart.DiscountCodeState oldState) {
        this.oldState = oldState;
        return this;
    }

    /**
     *  <p>DiscountCode that changed due to the recalculation.</p>
     * @return discountCode
     */

    public com.commercetools.api.models.discount_code.DiscountCodeReference getDiscountCode() {
        return this.discountCode;
    }

    /**
     *  <p>DiscountCodeState after the recalculation.</p>
     * @return state
     */

    public com.commercetools.api.models.cart.DiscountCodeState getState() {
        return this.state;
    }

    /**
     *  <p>DiscountCodeState before the recalculation.</p>
     * @return oldState
     */

    @Nullable
    public com.commercetools.api.models.cart.DiscountCodeState getOldState() {
        return this.oldState;
    }

    /**
     * builds OrderDiscountCodeStateSetMessagePayload with checking for non-null required values
     * @return OrderDiscountCodeStateSetMessagePayload
     */
    public OrderDiscountCodeStateSetMessagePayload build() {
        Objects.requireNonNull(discountCode,
            OrderDiscountCodeStateSetMessagePayload.class + ": discountCode is missing");
        Objects.requireNonNull(state, OrderDiscountCodeStateSetMessagePayload.class + ": state is missing");
        return new OrderDiscountCodeStateSetMessagePayloadImpl(discountCode, state, oldState);
    }

    /**
     * builds OrderDiscountCodeStateSetMessagePayload without checking for non-null required values
     * @return OrderDiscountCodeStateSetMessagePayload
     */
    public OrderDiscountCodeStateSetMessagePayload buildUnchecked() {
        return new OrderDiscountCodeStateSetMessagePayloadImpl(discountCode, state, oldState);
    }

    /**
     * factory method for an instance of OrderDiscountCodeStateSetMessagePayloadBuilder
     * @return builder
     */
    public static OrderDiscountCodeStateSetMessagePayloadBuilder of() {
        return new OrderDiscountCodeStateSetMessagePayloadBuilder();
    }

    /**
     * create builder for OrderDiscountCodeStateSetMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderDiscountCodeStateSetMessagePayloadBuilder of(
            final OrderDiscountCodeStateSetMessagePayload template) {
        OrderDiscountCodeStateSetMessagePayloadBuilder builder = new OrderDiscountCodeStateSetMessagePayloadBuilder();
        builder.discountCode = template.getDiscountCode();
        builder.state = template.getState();
        builder.oldState = template.getOldState();
        return builder;
    }

}
