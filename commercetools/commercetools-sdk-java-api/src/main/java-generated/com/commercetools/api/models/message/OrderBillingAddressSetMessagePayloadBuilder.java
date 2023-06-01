package com.commercetools.api.models.message;

import com.commercetools.api.models.common.Address;
import com.commercetools.api.models.message.OrderMessagePayload;
import com.commercetools.api.models.message.OrderBillingAddressSetMessagePayload;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * OrderBillingAddressSetMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderBillingAddressSetMessagePayload orderBillingAddressSetMessagePayload = OrderBillingAddressSetMessagePayload.builder()
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class OrderBillingAddressSetMessagePayloadBuilder implements Builder<OrderBillingAddressSetMessagePayload> {

    
    @Nullable
    private com.commercetools.api.models.common.Address address;
    
    
    @Nullable
    private com.commercetools.api.models.common.Address oldAddress;

    
    /**
     *  <p>Billing address on the Order after the Set Billing Address update action.</p>
     * @param builder function to build the address value
     * @return Builder
     */
    
    public OrderBillingAddressSetMessagePayloadBuilder address(Function<com.commercetools.api.models.common.AddressBuilder, com.commercetools.api.models.common.AddressBuilder> builder) {
        this.address = builder.apply(com.commercetools.api.models.common.AddressBuilder.of()).build();
        return this;
    }
    
    /**
     *  <p>Billing address on the Order after the Set Billing Address update action.</p>
     * @param builder function to build the address value
     * @return Builder
     */
    
    public OrderBillingAddressSetMessagePayloadBuilder withAddress(Function<com.commercetools.api.models.common.AddressBuilder, com.commercetools.api.models.common.Address> builder) {
        this.address = builder.apply(com.commercetools.api.models.common.AddressBuilder.of());
        return this;
    }
                    
    /**
     *  <p>Billing address on the Order after the Set Billing Address update action.</p>
     * @param address value to be set
     * @return Builder
     */
    
    public OrderBillingAddressSetMessagePayloadBuilder address(@Nullable final com.commercetools.api.models.common.Address address) {
        this.address = address;
        return this;
    }
    
    
    
    
    /**
     *  <p>Billing address on the Order before the Set Billing Address update action.</p>
     * @param builder function to build the oldAddress value
     * @return Builder
     */
    
    public OrderBillingAddressSetMessagePayloadBuilder oldAddress(Function<com.commercetools.api.models.common.AddressBuilder, com.commercetools.api.models.common.AddressBuilder> builder) {
        this.oldAddress = builder.apply(com.commercetools.api.models.common.AddressBuilder.of()).build();
        return this;
    }
    
    /**
     *  <p>Billing address on the Order before the Set Billing Address update action.</p>
     * @param builder function to build the oldAddress value
     * @return Builder
     */
    
    public OrderBillingAddressSetMessagePayloadBuilder withOldAddress(Function<com.commercetools.api.models.common.AddressBuilder, com.commercetools.api.models.common.Address> builder) {
        this.oldAddress = builder.apply(com.commercetools.api.models.common.AddressBuilder.of());
        return this;
    }
                    
    /**
     *  <p>Billing address on the Order before the Set Billing Address update action.</p>
     * @param oldAddress value to be set
     * @return Builder
     */
    
    public OrderBillingAddressSetMessagePayloadBuilder oldAddress(@Nullable final com.commercetools.api.models.common.Address oldAddress) {
        this.oldAddress = oldAddress;
        return this;
    }
    
    

    /**
     *  <p>Billing address on the Order after the Set Billing Address update action.</p>
     * @return address
     */
    
    @Nullable
    public com.commercetools.api.models.common.Address getAddress(){
        return this.address;
    }
    
    /**
     *  <p>Billing address on the Order before the Set Billing Address update action.</p>
     * @return oldAddress
     */
    
    @Nullable
    public com.commercetools.api.models.common.Address getOldAddress(){
        return this.oldAddress;
    }

    /**
     * builds OrderBillingAddressSetMessagePayload with checking for non-null required values
     * @return OrderBillingAddressSetMessagePayload
     */
    public OrderBillingAddressSetMessagePayload build() {
        return new OrderBillingAddressSetMessagePayloadImpl(address, oldAddress);
    }
    
    /**
     * builds OrderBillingAddressSetMessagePayload without checking for non-null required values
     * @return OrderBillingAddressSetMessagePayload
     */
    public OrderBillingAddressSetMessagePayload buildUnchecked() {
        return new OrderBillingAddressSetMessagePayloadImpl(address, oldAddress);
    }

    /**
     * factory method for an instance of OrderBillingAddressSetMessagePayloadBuilder
     * @return builder 
     */
    public static OrderBillingAddressSetMessagePayloadBuilder of() {
        return new OrderBillingAddressSetMessagePayloadBuilder();
    }

    /**
     * create builder for OrderBillingAddressSetMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderBillingAddressSetMessagePayloadBuilder of(final OrderBillingAddressSetMessagePayload template) {
        OrderBillingAddressSetMessagePayloadBuilder builder = new OrderBillingAddressSetMessagePayloadBuilder();
        builder.address = template.getAddress();
        builder.oldAddress = template.getOldAddress();
        return builder;
    }

}
