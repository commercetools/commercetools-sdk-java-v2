package com.commercetools.api.models.error;

import com.commercetools.api.models.error.ErrorObject;
import java.time.ZonedDateTime;
import com.commercetools.api.models.error.DiscountCodeNonApplicableError;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * DiscountCodeNonApplicableErrorBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     DiscountCodeNonApplicableError discountCodeNonApplicableError = DiscountCodeNonApplicableError.builder()
 *             .message("{message}")
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class DiscountCodeNonApplicableErrorBuilder implements Builder<DiscountCodeNonApplicableError> {

    
    
    private String message;
    
    
    
    private Map<String, java.lang.Object> values = new HashMap<>();
    
    
    @Nullable
    private String discountCode;
    
    
    @Nullable
    private String reason;
    
    
    @Nullable
    private String discountCodeId;
    
    
    @Nullable
    private java.time.ZonedDateTime validFrom;
    
    
    @Nullable
    private java.time.ZonedDateTime validUntil;
    
    
    @Nullable
    private java.time.ZonedDateTime validityCheckTime;

    
    /**
     *  <p><code>"The discountCode $discountCodeId cannot be applied to the cart."</code></p>
     * @param message value to be set
     * @return Builder
     */
    
    public DiscountCodeNonApplicableErrorBuilder message( final String message) {
        this.message = message;
        return this;
    }
    
    
    
    /**
     *  <p>Error-specific additional fields.</p>
     * @param values properties to be set
     * @return Builder
     */
    
    public DiscountCodeNonApplicableErrorBuilder values( final Map<String, java.lang.Object> values){
        this.values = values;
        return this;
    }
    
    /**
     *  <p>Error-specific additional fields.</p>
     * @param key property name
     * @param value property value
     * @return Builder
     */
    
    public DiscountCodeNonApplicableErrorBuilder addValue(final String key, final java.lang.Object value) {
        if (this.values == null) {
            values = new HashMap<>();
        }
        values.put(key, value);
        return this;
    }
    
    
    
    /**
     *  <p>Discount Code passed to the Cart.</p>
     * @param discountCode value to be set
     * @return Builder
     */
    
    public DiscountCodeNonApplicableErrorBuilder discountCode(@Nullable final String discountCode) {
        this.discountCode = discountCode;
        return this;
    }
    
    
    
    
    /**
     *  <p><code>"DoesNotExist"</code> or <code>"TimeRangeNonApplicable"</code></p>
     * @param reason value to be set
     * @return Builder
     */
    
    public DiscountCodeNonApplicableErrorBuilder reason(@Nullable final String reason) {
        this.reason = reason;
        return this;
    }
    
    
    
    
    /**
     *  <p>Unique identifier of the Discount Code.</p>
     * @param discountCodeId value to be set
     * @return Builder
     */
    
    public DiscountCodeNonApplicableErrorBuilder discountCodeId(@Nullable final String discountCodeId) {
        this.discountCodeId = discountCodeId;
        return this;
    }
    
    
    
    
    /**
     *  <p>Date and time (UTC) from which the Discount Code is valid.</p>
     * @param validFrom value to be set
     * @return Builder
     */
    
    public DiscountCodeNonApplicableErrorBuilder validFrom(@Nullable final java.time.ZonedDateTime validFrom) {
        this.validFrom = validFrom;
        return this;
    }
    
    
    
    
    /**
     *  <p>Date and time (UTC) until which the Discount Code is valid.</p>
     * @param validUntil value to be set
     * @return Builder
     */
    
    public DiscountCodeNonApplicableErrorBuilder validUntil(@Nullable final java.time.ZonedDateTime validUntil) {
        this.validUntil = validUntil;
        return this;
    }
    
    
    
    
    /**
     *  <p>Date and time (UTC) the Discount Code validity check was last performed.</p>
     * @param validityCheckTime value to be set
     * @return Builder
     */
    
    public DiscountCodeNonApplicableErrorBuilder validityCheckTime(@Nullable final java.time.ZonedDateTime validityCheckTime) {
        this.validityCheckTime = validityCheckTime;
        return this;
    }
    
    

    /**
     *  <p><code>"The discountCode $discountCodeId cannot be applied to the cart."</code></p>
     * @return message
     */
    
    
    public String getMessage(){
        return this.message;
    }
    
    /**
     *  <p>Error-specific additional fields.</p>
     * @return pattern properties
     */
    
    
    public Map<String, java.lang.Object> getValues(){
        return this.values;
    }
    
    /**
     *  <p>Discount Code passed to the Cart.</p>
     * @return discountCode
     */
    
    @Nullable
    public String getDiscountCode(){
        return this.discountCode;
    }
    
    /**
     *  <p><code>"DoesNotExist"</code> or <code>"TimeRangeNonApplicable"</code></p>
     * @return reason
     */
    
    @Nullable
    public String getReason(){
        return this.reason;
    }
    
    /**
     *  <p>Unique identifier of the Discount Code.</p>
     * @return discountCodeId
     */
    
    @Nullable
    public String getDiscountCodeId(){
        return this.discountCodeId;
    }
    
    /**
     *  <p>Date and time (UTC) from which the Discount Code is valid.</p>
     * @return validFrom
     */
    
    @Nullable
    public java.time.ZonedDateTime getValidFrom(){
        return this.validFrom;
    }
    
    /**
     *  <p>Date and time (UTC) until which the Discount Code is valid.</p>
     * @return validUntil
     */
    
    @Nullable
    public java.time.ZonedDateTime getValidUntil(){
        return this.validUntil;
    }
    
    /**
     *  <p>Date and time (UTC) the Discount Code validity check was last performed.</p>
     * @return validityCheckTime
     */
    
    @Nullable
    public java.time.ZonedDateTime getValidityCheckTime(){
        return this.validityCheckTime;
    }

    /**
     * builds DiscountCodeNonApplicableError with checking for non-null required values
     * @return DiscountCodeNonApplicableError
     */
    public DiscountCodeNonApplicableError build() {
        Objects.requireNonNull(message, DiscountCodeNonApplicableError.class + ": message is missing");
        return new DiscountCodeNonApplicableErrorImpl(message, values, discountCode, reason, discountCodeId, validFrom, validUntil, validityCheckTime);
    }
    
    /**
     * builds DiscountCodeNonApplicableError without checking for non-null required values
     * @return DiscountCodeNonApplicableError
     */
    public DiscountCodeNonApplicableError buildUnchecked() {
        return new DiscountCodeNonApplicableErrorImpl(message, values, discountCode, reason, discountCodeId, validFrom, validUntil, validityCheckTime);
    }

    /**
     * factory method for an instance of DiscountCodeNonApplicableErrorBuilder
     * @return builder 
     */
    public static DiscountCodeNonApplicableErrorBuilder of() {
        return new DiscountCodeNonApplicableErrorBuilder();
    }

    /**
     * create builder for DiscountCodeNonApplicableError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static DiscountCodeNonApplicableErrorBuilder of(final DiscountCodeNonApplicableError template) {
        DiscountCodeNonApplicableErrorBuilder builder = new DiscountCodeNonApplicableErrorBuilder();
        builder.message = template.getMessage();
        builder.values = template.values();
        builder.discountCode = template.getDiscountCode();
        builder.reason = template.getReason();
        builder.discountCodeId = template.getDiscountCodeId();
        builder.validFrom = template.getValidFrom();
        builder.validUntil = template.getValidUntil();
        builder.validityCheckTime = template.getValidityCheckTime();
        return builder;
    }

}
