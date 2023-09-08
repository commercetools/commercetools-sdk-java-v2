
package com.commercetools.api.models.message;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * BusinessUnitCustomTypeRemovedMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     BusinessUnitCustomTypeRemovedMessagePayload businessUnitCustomTypeRemovedMessagePayload = BusinessUnitCustomTypeRemovedMessagePayload.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class BusinessUnitCustomTypeRemovedMessagePayloadBuilder
        implements Builder<BusinessUnitCustomTypeRemovedMessagePayload> {

    @Nullable
    private String oldTypeId;

    /**
     *  <p><code>id</code> of the Custom Type that was removed. Absent if there was no previous Custom Type present.</p>
     * @param oldTypeId value to be set
     * @return Builder
     */

    public BusinessUnitCustomTypeRemovedMessagePayloadBuilder oldTypeId(@Nullable final String oldTypeId) {
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
     * builds BusinessUnitCustomTypeRemovedMessagePayload with checking for non-null required values
     * @return BusinessUnitCustomTypeRemovedMessagePayload
     */
    public BusinessUnitCustomTypeRemovedMessagePayload build() {
        return new BusinessUnitCustomTypeRemovedMessagePayloadImpl(oldTypeId);
    }

    /**
     * builds BusinessUnitCustomTypeRemovedMessagePayload without checking for non-null required values
     * @return BusinessUnitCustomTypeRemovedMessagePayload
     */
    public BusinessUnitCustomTypeRemovedMessagePayload buildUnchecked() {
        return new BusinessUnitCustomTypeRemovedMessagePayloadImpl(oldTypeId);
    }

    /**
     * factory method for an instance of BusinessUnitCustomTypeRemovedMessagePayloadBuilder
     * @return builder
     */
    public static BusinessUnitCustomTypeRemovedMessagePayloadBuilder of() {
        return new BusinessUnitCustomTypeRemovedMessagePayloadBuilder();
    }

    /**
     * create builder for BusinessUnitCustomTypeRemovedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static BusinessUnitCustomTypeRemovedMessagePayloadBuilder of(
            final BusinessUnitCustomTypeRemovedMessagePayload template) {
        BusinessUnitCustomTypeRemovedMessagePayloadBuilder builder = new BusinessUnitCustomTypeRemovedMessagePayloadBuilder();
        builder.oldTypeId = template.getOldTypeId();
        return builder;
    }

}
