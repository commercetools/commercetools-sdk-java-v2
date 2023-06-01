package com.commercetools.api.models.message;

import com.commercetools.api.models.discount_code.DiscountCodeReference;
import com.commercetools.api.models.message.OrderMessagePayload;
import com.commercetools.api.models.message.OrderDiscountCodeRemovedMessagePayload;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * OrderDiscountCodeRemovedMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderDiscountCodeRemovedMessagePayload orderDiscountCodeRemovedMessagePayload = OrderDiscountCodeRemovedMessagePayload.builder()
 *             .discountCode(discountCodeBuilder -> discountCodeBuilder)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class OrderDiscountCodeRemovedMessagePayloadBuilder implements Builder<OrderDiscountCodeRemovedMessagePayload> {

    
    
    private com.commercetools.api.models.discount_code.DiscountCodeReference discountCode;

    
    /**
     *  <p>DiscountCode that was removed.</p>
     * @param builder function to build the discountCode value
     * @return Builder
     */
    
    public OrderDiscountCodeRemovedMessagePayloadBuilder discountCode(Function<com.commercetools.api.models.discount_code.DiscountCodeReferenceBuilder, com.commercetools.api.models.discount_code.DiscountCodeReferenceBuilder> builder) {
        this.discountCode = builder.apply(com.commercetools.api.models.discount_code.DiscountCodeReferenceBuilder.of()).build();
        return this;
    }
    
    /**
     *  <p>DiscountCode that was removed.</p>
     * @param builder function to build the discountCode value
     * @return Builder
     */
    
    public OrderDiscountCodeRemovedMessagePayloadBuilder withDiscountCode(Function<com.commercetools.api.models.discount_code.DiscountCodeReferenceBuilder, com.commercetools.api.models.discount_code.DiscountCodeReference> builder) {
        this.discountCode = builder.apply(com.commercetools.api.models.discount_code.DiscountCodeReferenceBuilder.of());
        return this;
    }
                    
    /**
     *  <p>DiscountCode that was removed.</p>
     * @param discountCode value to be set
     * @return Builder
     */
    
    public OrderDiscountCodeRemovedMessagePayloadBuilder discountCode( final com.commercetools.api.models.discount_code.DiscountCodeReference discountCode) {
        this.discountCode = discountCode;
        return this;
    }
    
    

    /**
     *  <p>DiscountCode that was removed.</p>
     * @return discountCode
     */
    
    
    public com.commercetools.api.models.discount_code.DiscountCodeReference getDiscountCode(){
        return this.discountCode;
    }

    /**
     * builds OrderDiscountCodeRemovedMessagePayload with checking for non-null required values
     * @return OrderDiscountCodeRemovedMessagePayload
     */
    public OrderDiscountCodeRemovedMessagePayload build() {
        Objects.requireNonNull(discountCode, OrderDiscountCodeRemovedMessagePayload.class + ": discountCode is missing");
        return new OrderDiscountCodeRemovedMessagePayloadImpl(discountCode);
    }
    
    /**
     * builds OrderDiscountCodeRemovedMessagePayload without checking for non-null required values
     * @return OrderDiscountCodeRemovedMessagePayload
     */
    public OrderDiscountCodeRemovedMessagePayload buildUnchecked() {
        return new OrderDiscountCodeRemovedMessagePayloadImpl(discountCode);
    }

    /**
     * factory method for an instance of OrderDiscountCodeRemovedMessagePayloadBuilder
     * @return builder 
     */
    public static OrderDiscountCodeRemovedMessagePayloadBuilder of() {
        return new OrderDiscountCodeRemovedMessagePayloadBuilder();
    }

    /**
     * create builder for OrderDiscountCodeRemovedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderDiscountCodeRemovedMessagePayloadBuilder of(final OrderDiscountCodeRemovedMessagePayload template) {
        OrderDiscountCodeRemovedMessagePayloadBuilder builder = new OrderDiscountCodeRemovedMessagePayloadBuilder();
        builder.discountCode = template.getDiscountCode();
        return builder;
    }

}
