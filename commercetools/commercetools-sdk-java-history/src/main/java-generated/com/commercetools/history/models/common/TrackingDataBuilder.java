package com.commercetools.history.models.common;


import com.commercetools.history.models.common.TrackingData;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * TrackingDataBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     TrackingData trackingData = TrackingData.builder()
 *             .trackingId("{trackingId}")
 *             .carrier("{carrier}")
 *             .provider("{provider}")
 *             .providerTransaction("{providerTransaction}")
 *             .isReturn(true)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class TrackingDataBuilder implements Builder<TrackingData> {

    
    
    private String trackingId;
    
    
    
    private String carrier;
    
    
    
    private String provider;
    
    
    
    private String providerTransaction;
    
    
    
    private Boolean isReturn;

    
    /**
     *  <p>The ID to track one parcel.</p>
     * @param trackingId value to be set
     * @return Builder
     */
    
    public TrackingDataBuilder trackingId( final String trackingId) {
        this.trackingId = trackingId;
        return this;
    }
    
    
    
    
    /**
     *  <p>The carrier that delivers the parcel.</p>
     * @param carrier value to be set
     * @return Builder
     */
    
    public TrackingDataBuilder carrier( final String carrier) {
        this.carrier = carrier;
        return this;
    }
    
    
    
    
    /**
     * set the value to the provider
     * @param provider value to be set
     * @return Builder
     */
    
    public TrackingDataBuilder provider( final String provider) {
        this.provider = provider;
        return this;
    }
    
    
    
    
    /**
     * set the value to the providerTransaction
     * @param providerTransaction value to be set
     * @return Builder
     */
    
    public TrackingDataBuilder providerTransaction( final String providerTransaction) {
        this.providerTransaction = providerTransaction;
        return this;
    }
    
    
    
    
    /**
     *  <p>Flag to distinguish if the parcel is on the way to the customer (false) or on the way back (true).</p>
     * @param isReturn value to be set
     * @return Builder
     */
    
    public TrackingDataBuilder isReturn( final Boolean isReturn) {
        this.isReturn = isReturn;
        return this;
    }
    
    

    /**
     *  <p>The ID to track one parcel.</p>
     * @return trackingId
     */
    
    
    public String getTrackingId(){
        return this.trackingId;
    }
    
    /**
     *  <p>The carrier that delivers the parcel.</p>
     * @return carrier
     */
    
    
    public String getCarrier(){
        return this.carrier;
    }
    
    /**
     * value of provider}
     * @return provider
     */
    
    
    public String getProvider(){
        return this.provider;
    }
    
    /**
     * value of providerTransaction}
     * @return providerTransaction
     */
    
    
    public String getProviderTransaction(){
        return this.providerTransaction;
    }
    
    /**
     *  <p>Flag to distinguish if the parcel is on the way to the customer (false) or on the way back (true).</p>
     * @return isReturn
     */
    
    
    public Boolean getIsReturn(){
        return this.isReturn;
    }

    /**
     * builds TrackingData with checking for non-null required values
     * @return TrackingData
     */
    public TrackingData build() {
        Objects.requireNonNull(trackingId, TrackingData.class + ": trackingId is missing");
        Objects.requireNonNull(carrier, TrackingData.class + ": carrier is missing");
        Objects.requireNonNull(provider, TrackingData.class + ": provider is missing");
        Objects.requireNonNull(providerTransaction, TrackingData.class + ": providerTransaction is missing");
        Objects.requireNonNull(isReturn, TrackingData.class + ": isReturn is missing");
        return new TrackingDataImpl(trackingId, carrier, provider, providerTransaction, isReturn);
    }
    
    /**
     * builds TrackingData without checking for non-null required values
     * @return TrackingData
     */
    public TrackingData buildUnchecked() {
        return new TrackingDataImpl(trackingId, carrier, provider, providerTransaction, isReturn);
    }

    /**
     * factory method for an instance of TrackingDataBuilder
     * @return builder 
     */
    public static TrackingDataBuilder of() {
        return new TrackingDataBuilder();
    }

    /**
     * create builder for TrackingData instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static TrackingDataBuilder of(final TrackingData template) {
        TrackingDataBuilder builder = new TrackingDataBuilder();
        builder.trackingId = template.getTrackingId();
        builder.carrier = template.getCarrier();
        builder.provider = template.getProvider();
        builder.providerTransaction = template.getProviderTransaction();
        builder.isReturn = template.getIsReturn();
        return builder;
    }

}
