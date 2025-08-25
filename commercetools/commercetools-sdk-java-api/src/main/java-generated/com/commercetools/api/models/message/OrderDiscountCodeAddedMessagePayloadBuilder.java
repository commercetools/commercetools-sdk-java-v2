
package com.commercetools.api.models.message;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * OrderDiscountCodeAddedMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderDiscountCodeAddedMessagePayload orderDiscountCodeAddedMessagePayload = OrderDiscountCodeAddedMessagePayload.builder()
 *             .discountCode(discountCodeBuilder -> discountCodeBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class OrderDiscountCodeAddedMessagePayloadBuilder implements Builder<OrderDiscountCodeAddedMessagePayload> {

    private com.commercetools.api.models.discount_code.DiscountCodeReference discountCode;

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:DiscountCode" rel="nofollow">DiscountCode</a> that was added.</p>
     * @param builder function to build the discountCode value
     * @return Builder
     */

    public OrderDiscountCodeAddedMessagePayloadBuilder discountCode(
            Function<com.commercetools.api.models.discount_code.DiscountCodeReferenceBuilder, com.commercetools.api.models.discount_code.DiscountCodeReferenceBuilder> builder) {
        this.discountCode = builder.apply(com.commercetools.api.models.discount_code.DiscountCodeReferenceBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:DiscountCode" rel="nofollow">DiscountCode</a> that was added.</p>
     * @param builder function to build the discountCode value
     * @return Builder
     */

    public OrderDiscountCodeAddedMessagePayloadBuilder withDiscountCode(
            Function<com.commercetools.api.models.discount_code.DiscountCodeReferenceBuilder, com.commercetools.api.models.discount_code.DiscountCodeReference> builder) {
        this.discountCode = builder.apply(com.commercetools.api.models.discount_code.DiscountCodeReferenceBuilder.of());
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:DiscountCode" rel="nofollow">DiscountCode</a> that was added.</p>
     * @param discountCode value to be set
     * @return Builder
     */

    public OrderDiscountCodeAddedMessagePayloadBuilder discountCode(
            final com.commercetools.api.models.discount_code.DiscountCodeReference discountCode) {
        this.discountCode = discountCode;
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:DiscountCode" rel="nofollow">DiscountCode</a> that was added.</p>
     * @return discountCode
     */

    public com.commercetools.api.models.discount_code.DiscountCodeReference getDiscountCode() {
        return this.discountCode;
    }

    /**
     * builds OrderDiscountCodeAddedMessagePayload with checking for non-null required values
     * @return OrderDiscountCodeAddedMessagePayload
     */
    public OrderDiscountCodeAddedMessagePayload build() {
        Objects.requireNonNull(discountCode, OrderDiscountCodeAddedMessagePayload.class + ": discountCode is missing");
        return new OrderDiscountCodeAddedMessagePayloadImpl(discountCode);
    }

    /**
     * builds OrderDiscountCodeAddedMessagePayload without checking for non-null required values
     * @return OrderDiscountCodeAddedMessagePayload
     */
    public OrderDiscountCodeAddedMessagePayload buildUnchecked() {
        return new OrderDiscountCodeAddedMessagePayloadImpl(discountCode);
    }

    /**
     * factory method for an instance of OrderDiscountCodeAddedMessagePayloadBuilder
     * @return builder
     */
    public static OrderDiscountCodeAddedMessagePayloadBuilder of() {
        return new OrderDiscountCodeAddedMessagePayloadBuilder();
    }

    /**
     * create builder for OrderDiscountCodeAddedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderDiscountCodeAddedMessagePayloadBuilder of(final OrderDiscountCodeAddedMessagePayload template) {
        OrderDiscountCodeAddedMessagePayloadBuilder builder = new OrderDiscountCodeAddedMessagePayloadBuilder();
        builder.discountCode = template.getDiscountCode();
        return builder;
    }

}
