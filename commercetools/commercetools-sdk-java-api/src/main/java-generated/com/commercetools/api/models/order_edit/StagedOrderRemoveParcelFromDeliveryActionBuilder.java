
package com.commercetools.api.models.order_edit;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * StagedOrderRemoveParcelFromDeliveryActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StagedOrderRemoveParcelFromDeliveryAction stagedOrderRemoveParcelFromDeliveryAction = StagedOrderRemoveParcelFromDeliveryAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StagedOrderRemoveParcelFromDeliveryActionBuilder
        implements Builder<StagedOrderRemoveParcelFromDeliveryAction> {

    @Nullable
    private String parcelId;

    @Nullable
    private String parcelKey;

    /**
     *  <p><code>id</code> of an existing Parcel.</p>
     *  <p>Either <code>parcelId</code> or <code>parcelKey</code> must be provided.</p>
     * @param parcelId value to be set
     * @return Builder
     */

    public StagedOrderRemoveParcelFromDeliveryActionBuilder parcelId(@Nullable final String parcelId) {
        this.parcelId = parcelId;
        return this;
    }

    /**
     *  <p><code>key</code> of an existing Parcel.</p>
     *  <p>Either <code>parcelId</code> or <code>parcelKey</code> must be provided.</p>
     * @param parcelKey value to be set
     * @return Builder
     */

    public StagedOrderRemoveParcelFromDeliveryActionBuilder parcelKey(@Nullable final String parcelKey) {
        this.parcelKey = parcelKey;
        return this;
    }

    /**
     *  <p><code>id</code> of an existing Parcel.</p>
     *  <p>Either <code>parcelId</code> or <code>parcelKey</code> must be provided.</p>
     * @return parcelId
     */

    @Nullable
    public String getParcelId() {
        return this.parcelId;
    }

    /**
     *  <p><code>key</code> of an existing Parcel.</p>
     *  <p>Either <code>parcelId</code> or <code>parcelKey</code> must be provided.</p>
     * @return parcelKey
     */

    @Nullable
    public String getParcelKey() {
        return this.parcelKey;
    }

    /**
     * builds StagedOrderRemoveParcelFromDeliveryAction with checking for non-null required values
     * @return StagedOrderRemoveParcelFromDeliveryAction
     */
    public StagedOrderRemoveParcelFromDeliveryAction build() {
        return new StagedOrderRemoveParcelFromDeliveryActionImpl(parcelId, parcelKey);
    }

    /**
     * builds StagedOrderRemoveParcelFromDeliveryAction without checking for non-null required values
     * @return StagedOrderRemoveParcelFromDeliveryAction
     */
    public StagedOrderRemoveParcelFromDeliveryAction buildUnchecked() {
        return new StagedOrderRemoveParcelFromDeliveryActionImpl(parcelId, parcelKey);
    }

    /**
     * factory method for an instance of StagedOrderRemoveParcelFromDeliveryActionBuilder
     * @return builder
     */
    public static StagedOrderRemoveParcelFromDeliveryActionBuilder of() {
        return new StagedOrderRemoveParcelFromDeliveryActionBuilder();
    }

    /**
     * create builder for StagedOrderRemoveParcelFromDeliveryAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StagedOrderRemoveParcelFromDeliveryActionBuilder of(
            final StagedOrderRemoveParcelFromDeliveryAction template) {
        StagedOrderRemoveParcelFromDeliveryActionBuilder builder = new StagedOrderRemoveParcelFromDeliveryActionBuilder();
        builder.parcelId = template.getParcelId();
        builder.parcelKey = template.getParcelKey();
        return builder;
    }

}
