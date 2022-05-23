
package com.commercetools.api.models.message;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 Example to create an instance using the builder pattern
 <div class=code-example>
 <pre><code class='java'>
   OrderDiscountCodeRemovedMessagePayload orderDiscountCodeRemovedMessagePayload = OrderDiscountCodeRemovedMessagePayload.builder()
           .discountCode(discountCodeBuilder -> discountCodeBuilder)
           .build()
 </code></pre>
 </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class OrderDiscountCodeRemovedMessagePayloadBuilder implements Builder<OrderDiscountCodeRemovedMessagePayload> {

    private com.commercetools.api.models.discount_code.DiscountCodeReference discountCode;

    /**
     *  <p>Reference to a DiscountCode.</p>
     */

    public OrderDiscountCodeRemovedMessagePayloadBuilder discountCode(
            Function<com.commercetools.api.models.discount_code.DiscountCodeReferenceBuilder, com.commercetools.api.models.discount_code.DiscountCodeReferenceBuilder> builder) {
        this.discountCode = builder.apply(com.commercetools.api.models.discount_code.DiscountCodeReferenceBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Reference to a DiscountCode.</p>
     */

    public OrderDiscountCodeRemovedMessagePayloadBuilder discountCode(
            final com.commercetools.api.models.discount_code.DiscountCodeReference discountCode) {
        this.discountCode = discountCode;
        return this;
    }

    public com.commercetools.api.models.discount_code.DiscountCodeReference getDiscountCode() {
        return this.discountCode;
    }

    public OrderDiscountCodeRemovedMessagePayload build() {
        Objects.requireNonNull(discountCode,
            OrderDiscountCodeRemovedMessagePayload.class + ": discountCode is missing");
        return new OrderDiscountCodeRemovedMessagePayloadImpl(discountCode);
    }

    /**
     * builds OrderDiscountCodeRemovedMessagePayload without checking for non null required values
     */
    public OrderDiscountCodeRemovedMessagePayload buildUnchecked() {
        return new OrderDiscountCodeRemovedMessagePayloadImpl(discountCode);
    }

    public static OrderDiscountCodeRemovedMessagePayloadBuilder of() {
        return new OrderDiscountCodeRemovedMessagePayloadBuilder();
    }

    public static OrderDiscountCodeRemovedMessagePayloadBuilder of(
            final OrderDiscountCodeRemovedMessagePayload template) {
        OrderDiscountCodeRemovedMessagePayloadBuilder builder = new OrderDiscountCodeRemovedMessagePayloadBuilder();
        builder.discountCode = template.getDiscountCode();
        return builder;
    }

}
