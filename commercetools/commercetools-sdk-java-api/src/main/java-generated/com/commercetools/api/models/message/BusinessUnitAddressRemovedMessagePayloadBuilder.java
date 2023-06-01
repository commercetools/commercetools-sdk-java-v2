package com.commercetools.api.models.message;

import com.commercetools.api.models.common.Address;
import com.commercetools.api.models.message.MessagePayload;
import com.commercetools.api.models.message.BusinessUnitAddressRemovedMessagePayload;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * BusinessUnitAddressRemovedMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     BusinessUnitAddressRemovedMessagePayload businessUnitAddressRemovedMessagePayload = BusinessUnitAddressRemovedMessagePayload.builder()
 *             .address(addressBuilder -> addressBuilder)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class BusinessUnitAddressRemovedMessagePayloadBuilder implements Builder<BusinessUnitAddressRemovedMessagePayload> {

    
    
    private com.commercetools.api.models.common.Address address;

    
    /**
     *  <p>The address that was removed from the Business Unit.</p>
     * @param builder function to build the address value
     * @return Builder
     */
    
    public BusinessUnitAddressRemovedMessagePayloadBuilder address(Function<com.commercetools.api.models.common.AddressBuilder, com.commercetools.api.models.common.AddressBuilder> builder) {
        this.address = builder.apply(com.commercetools.api.models.common.AddressBuilder.of()).build();
        return this;
    }
    
    /**
     *  <p>The address that was removed from the Business Unit.</p>
     * @param builder function to build the address value
     * @return Builder
     */
    
    public BusinessUnitAddressRemovedMessagePayloadBuilder withAddress(Function<com.commercetools.api.models.common.AddressBuilder, com.commercetools.api.models.common.Address> builder) {
        this.address = builder.apply(com.commercetools.api.models.common.AddressBuilder.of());
        return this;
    }
                    
    /**
     *  <p>The address that was removed from the Business Unit.</p>
     * @param address value to be set
     * @return Builder
     */
    
    public BusinessUnitAddressRemovedMessagePayloadBuilder address( final com.commercetools.api.models.common.Address address) {
        this.address = address;
        return this;
    }
    
    

    /**
     *  <p>The address that was removed from the Business Unit.</p>
     * @return address
     */
    
    
    public com.commercetools.api.models.common.Address getAddress(){
        return this.address;
    }

    /**
     * builds BusinessUnitAddressRemovedMessagePayload with checking for non-null required values
     * @return BusinessUnitAddressRemovedMessagePayload
     */
    public BusinessUnitAddressRemovedMessagePayload build() {
        Objects.requireNonNull(address, BusinessUnitAddressRemovedMessagePayload.class + ": address is missing");
        return new BusinessUnitAddressRemovedMessagePayloadImpl(address);
    }
    
    /**
     * builds BusinessUnitAddressRemovedMessagePayload without checking for non-null required values
     * @return BusinessUnitAddressRemovedMessagePayload
     */
    public BusinessUnitAddressRemovedMessagePayload buildUnchecked() {
        return new BusinessUnitAddressRemovedMessagePayloadImpl(address);
    }

    /**
     * factory method for an instance of BusinessUnitAddressRemovedMessagePayloadBuilder
     * @return builder 
     */
    public static BusinessUnitAddressRemovedMessagePayloadBuilder of() {
        return new BusinessUnitAddressRemovedMessagePayloadBuilder();
    }

    /**
     * create builder for BusinessUnitAddressRemovedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static BusinessUnitAddressRemovedMessagePayloadBuilder of(final BusinessUnitAddressRemovedMessagePayload template) {
        BusinessUnitAddressRemovedMessagePayloadBuilder builder = new BusinessUnitAddressRemovedMessagePayloadBuilder();
        builder.address = template.getAddress();
        return builder;
    }

}
