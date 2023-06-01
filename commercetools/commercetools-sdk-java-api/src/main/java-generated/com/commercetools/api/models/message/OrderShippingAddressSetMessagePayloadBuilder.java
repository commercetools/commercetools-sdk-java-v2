package com.commercetools.api.models.message;

import com.commercetools.api.models.common.Address;
import com.commercetools.api.models.message.OrderMessagePayload;
import com.commercetools.api.models.message.OrderShippingAddressSetMessagePayload;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * OrderShippingAddressSetMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderShippingAddressSetMessagePayload orderShippingAddressSetMessagePayload = OrderShippingAddressSetMessagePayload.builder()
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class OrderShippingAddressSetMessagePayloadBuilder implements Builder<OrderShippingAddressSetMessagePayload> {

    
    @Nullable
    private com.commercetools.api.models.common.Address address;
    
    
    @Nullable
    private com.commercetools.api.models.common.Address oldAddress;

    
    /**
     *  <p>Shipping address on the Order after the Set Shipping Address update action.</p>
     * @param builder function to build the address value
     * @return Builder
     */
    
    public OrderShippingAddressSetMessagePayloadBuilder address(Function<com.commercetools.api.models.common.AddressBuilder, com.commercetools.api.models.common.AddressBuilder> builder) {
        this.address = builder.apply(com.commercetools.api.models.common.AddressBuilder.of()).build();
        return this;
    }
    
    /**
     *  <p>Shipping address on the Order after the Set Shipping Address update action.</p>
     * @param builder function to build the address value
     * @return Builder
     */
    
    public OrderShippingAddressSetMessagePayloadBuilder withAddress(Function<com.commercetools.api.models.common.AddressBuilder, com.commercetools.api.models.common.Address> builder) {
        this.address = builder.apply(com.commercetools.api.models.common.AddressBuilder.of());
        return this;
    }
                    
    /**
     *  <p>Shipping address on the Order after the Set Shipping Address update action.</p>
     * @param address value to be set
     * @return Builder
     */
    
    public OrderShippingAddressSetMessagePayloadBuilder address(@Nullable final com.commercetools.api.models.common.Address address) {
        this.address = address;
        return this;
    }
    
    
    
    
    /**
     *  <p>Shipping address on the Order before the Set Shipping Address update action.</p>
     * @param builder function to build the oldAddress value
     * @return Builder
     */
    
    public OrderShippingAddressSetMessagePayloadBuilder oldAddress(Function<com.commercetools.api.models.common.AddressBuilder, com.commercetools.api.models.common.AddressBuilder> builder) {
        this.oldAddress = builder.apply(com.commercetools.api.models.common.AddressBuilder.of()).build();
        return this;
    }
    
    /**
     *  <p>Shipping address on the Order before the Set Shipping Address update action.</p>
     * @param builder function to build the oldAddress value
     * @return Builder
     */
    
    public OrderShippingAddressSetMessagePayloadBuilder withOldAddress(Function<com.commercetools.api.models.common.AddressBuilder, com.commercetools.api.models.common.Address> builder) {
        this.oldAddress = builder.apply(com.commercetools.api.models.common.AddressBuilder.of());
        return this;
    }
                    
    /**
     *  <p>Shipping address on the Order before the Set Shipping Address update action.</p>
     * @param oldAddress value to be set
     * @return Builder
     */
    
    public OrderShippingAddressSetMessagePayloadBuilder oldAddress(@Nullable final com.commercetools.api.models.common.Address oldAddress) {
        this.oldAddress = oldAddress;
        return this;
    }
    
    

    /**
     *  <p>Shipping address on the Order after the Set Shipping Address update action.</p>
     * @return address
     */
    
    @Nullable
    public com.commercetools.api.models.common.Address getAddress(){
        return this.address;
    }
    
    /**
     *  <p>Shipping address on the Order before the Set Shipping Address update action.</p>
     * @return oldAddress
     */
    
    @Nullable
    public com.commercetools.api.models.common.Address getOldAddress(){
        return this.oldAddress;
    }

    /**
     * builds OrderShippingAddressSetMessagePayload with checking for non-null required values
     * @return OrderShippingAddressSetMessagePayload
     */
    public OrderShippingAddressSetMessagePayload build() {
        return new OrderShippingAddressSetMessagePayloadImpl(address, oldAddress);
    }
    
    /**
     * builds OrderShippingAddressSetMessagePayload without checking for non-null required values
     * @return OrderShippingAddressSetMessagePayload
     */
    public OrderShippingAddressSetMessagePayload buildUnchecked() {
        return new OrderShippingAddressSetMessagePayloadImpl(address, oldAddress);
    }

    /**
     * factory method for an instance of OrderShippingAddressSetMessagePayloadBuilder
     * @return builder 
     */
    public static OrderShippingAddressSetMessagePayloadBuilder of() {
        return new OrderShippingAddressSetMessagePayloadBuilder();
    }

    /**
     * create builder for OrderShippingAddressSetMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderShippingAddressSetMessagePayloadBuilder of(final OrderShippingAddressSetMessagePayload template) {
        OrderShippingAddressSetMessagePayloadBuilder builder = new OrderShippingAddressSetMessagePayloadBuilder();
        builder.address = template.getAddress();
        builder.oldAddress = template.getOldAddress();
        return builder;
    }

}
