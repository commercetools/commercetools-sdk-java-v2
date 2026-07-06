
package com.commercetools.api.models.message;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CustomerAddressCustomTypeRemovedMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomerAddressCustomTypeRemovedMessagePayload customerAddressCustomTypeRemovedMessagePayload = CustomerAddressCustomTypeRemovedMessagePayload.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CustomerAddressCustomTypeRemovedMessagePayloadBuilder
        implements Builder<CustomerAddressCustomTypeRemovedMessagePayload> {

    @Nullable
    private String previousTypeId;

    @Nullable
    private String addressId;

    /**
     *  <p><code>id</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Type" rel="nofollow">Custom Type</a> that was removed. Absent if there was no previous Custom Type present.</p>
     * @param previousTypeId value to be set
     * @return Builder
     */

    public CustomerAddressCustomTypeRemovedMessagePayloadBuilder previousTypeId(@Nullable final String previousTypeId) {
        this.previousTypeId = previousTypeId;
        return this;
    }

    /**
     *  <p><code>id</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Address" rel="nofollow">Address</a> from which the Custom Type was removed.</p>
     * @param addressId value to be set
     * @return Builder
     */

    public CustomerAddressCustomTypeRemovedMessagePayloadBuilder addressId(@Nullable final String addressId) {
        this.addressId = addressId;
        return this;
    }

    /**
     *  <p><code>id</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Type" rel="nofollow">Custom Type</a> that was removed. Absent if there was no previous Custom Type present.</p>
     * @return previousTypeId
     */

    @Nullable
    public String getPreviousTypeId() {
        return this.previousTypeId;
    }

    /**
     *  <p><code>id</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Address" rel="nofollow">Address</a> from which the Custom Type was removed.</p>
     * @return addressId
     */

    @Nullable
    public String getAddressId() {
        return this.addressId;
    }

    /**
     * builds CustomerAddressCustomTypeRemovedMessagePayload with checking for non-null required values
     * @return CustomerAddressCustomTypeRemovedMessagePayload
     */
    public CustomerAddressCustomTypeRemovedMessagePayload build() {
        return new CustomerAddressCustomTypeRemovedMessagePayloadImpl(previousTypeId, addressId);
    }

    /**
     * builds CustomerAddressCustomTypeRemovedMessagePayload without checking for non-null required values
     * @return CustomerAddressCustomTypeRemovedMessagePayload
     */
    public CustomerAddressCustomTypeRemovedMessagePayload buildUnchecked() {
        return new CustomerAddressCustomTypeRemovedMessagePayloadImpl(previousTypeId, addressId);
    }

    /**
     * factory method for an instance of CustomerAddressCustomTypeRemovedMessagePayloadBuilder
     * @return builder
     */
    public static CustomerAddressCustomTypeRemovedMessagePayloadBuilder of() {
        return new CustomerAddressCustomTypeRemovedMessagePayloadBuilder();
    }

    /**
     * create builder for CustomerAddressCustomTypeRemovedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CustomerAddressCustomTypeRemovedMessagePayloadBuilder of(
            final CustomerAddressCustomTypeRemovedMessagePayload template) {
        CustomerAddressCustomTypeRemovedMessagePayloadBuilder builder = new CustomerAddressCustomTypeRemovedMessagePayloadBuilder();
        builder.previousTypeId = template.getPreviousTypeId();
        builder.addressId = template.getAddressId();
        return builder;
    }

}
