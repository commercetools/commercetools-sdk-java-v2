
package com.commercetools.api.models.message;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * BusinessUnitAddressCustomTypeRemovedMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     BusinessUnitAddressCustomTypeRemovedMessagePayload businessUnitAddressCustomTypeRemovedMessagePayload = BusinessUnitAddressCustomTypeRemovedMessagePayload.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class BusinessUnitAddressCustomTypeRemovedMessagePayloadBuilder
        implements Builder<BusinessUnitAddressCustomTypeRemovedMessagePayload> {

    @Nullable
    private String oldTypeId;

    /**
     *  <p><code>id</code> of the Custom Type that was removed. Absent if there was no previous Custom Type present.</p>
     * @param oldTypeId value to be set
     * @return Builder
     */

    public BusinessUnitAddressCustomTypeRemovedMessagePayloadBuilder oldTypeId(@Nullable final String oldTypeId) {
        this.oldTypeId = oldTypeId;
        return this;
    }

    /**
     *  <p><code>id</code> of the Custom Type that was removed. Absent if there was no previous Custom Type present.</p>
     * @return oldTypeId
     */

    @Nullable
    public String getOldTypeId() {
        return this.oldTypeId;
    }

    /**
     * builds BusinessUnitAddressCustomTypeRemovedMessagePayload with checking for non-null required values
     * @return BusinessUnitAddressCustomTypeRemovedMessagePayload
     */
    public BusinessUnitAddressCustomTypeRemovedMessagePayload build() {
        return new BusinessUnitAddressCustomTypeRemovedMessagePayloadImpl(oldTypeId);
    }

    /**
     * builds BusinessUnitAddressCustomTypeRemovedMessagePayload without checking for non-null required values
     * @return BusinessUnitAddressCustomTypeRemovedMessagePayload
     */
    public BusinessUnitAddressCustomTypeRemovedMessagePayload buildUnchecked() {
        return new BusinessUnitAddressCustomTypeRemovedMessagePayloadImpl(oldTypeId);
    }

    /**
     * factory method for an instance of BusinessUnitAddressCustomTypeRemovedMessagePayloadBuilder
     * @return builder
     */
    public static BusinessUnitAddressCustomTypeRemovedMessagePayloadBuilder of() {
        return new BusinessUnitAddressCustomTypeRemovedMessagePayloadBuilder();
    }

    /**
     * create builder for BusinessUnitAddressCustomTypeRemovedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static BusinessUnitAddressCustomTypeRemovedMessagePayloadBuilder of(
            final BusinessUnitAddressCustomTypeRemovedMessagePayload template) {
        BusinessUnitAddressCustomTypeRemovedMessagePayloadBuilder builder = new BusinessUnitAddressCustomTypeRemovedMessagePayloadBuilder();
        builder.oldTypeId = template.getOldTypeId();
        return builder;
    }

}
