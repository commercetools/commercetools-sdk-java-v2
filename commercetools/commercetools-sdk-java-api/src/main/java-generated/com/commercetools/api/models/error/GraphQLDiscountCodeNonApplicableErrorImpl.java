package com.commercetools.api.models.error;

import com.commercetools.api.models.error.GraphQLErrorObject;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.ModelBase;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 *  <p>Returned when the Cart contains a Discount Code with a DiscountCodeState other than <code>MatchesCart</code>.</p>
 *  <p>The error is returned as a failed response to:</p>
 *  <ul>
 *   <li>Create Order from Cart and Create Order in Store from Cart requests on Orders.</li>
 *   <li>Create Order from Cart and Create Order in Store from Cart requests on My Orders.</li>
 *  </ul>
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class GraphQLDiscountCodeNonApplicableErrorImpl implements GraphQLDiscountCodeNonApplicableError, ModelBase {

    
    private String code;
    
    
    private Map<String, java.lang.Object> values;
    
    
    private String discountCode;
    
    
    private String reason;
    
    
    private String discountCodeId;
    
    
    private java.time.ZonedDateTime validFrom;
    
    
    private java.time.ZonedDateTime validUntil;
    
    
    private java.time.ZonedDateTime validityCheckTime;

    /**
     * create instance with all properties
     */
    @JsonCreator
    GraphQLDiscountCodeNonApplicableErrorImpl(@JsonProperty("values") final Map<String, java.lang.Object> values, @JsonProperty("discountCode") final String discountCode, @JsonProperty("reason") final String reason, @JsonProperty("discountCodeId") final String discountCodeId, @JsonProperty("validFrom") final java.time.ZonedDateTime validFrom, @JsonProperty("validUntil") final java.time.ZonedDateTime validUntil, @JsonProperty("validityCheckTime") final java.time.ZonedDateTime validityCheckTime) {
        this.values = values;
        this.discountCode = discountCode;
        this.reason = reason;
        this.discountCodeId = discountCodeId;
        this.validFrom = validFrom;
        this.validUntil = validUntil;
        this.validityCheckTime = validityCheckTime;
        this.code =  DISCOUNT_CODE_NON_APPLICABLE;
    }
    /**
     * create empty instance
     */
    public GraphQLDiscountCodeNonApplicableErrorImpl() {
        this.code =  DISCOUNT_CODE_NON_APPLICABLE;
    }

    /**
     *
     */
    
    public String getCode(){
        return this.code;
    }
    
    /**
     *  <p>Error-specific additional fields.</p>
     */
    
    public Map<String,java.lang.Object> values() {
        return values;
    }
    
    /**
     *  <p>Discount Code passed to the Cart.</p>
     */
    
    public String getDiscountCode(){
        return this.discountCode;
    }
    
    /**
     *  <p><code>"DoesNotExist"</code> or <code>"TimeRangeNonApplicable"</code></p>
     */
    
    public String getReason(){
        return this.reason;
    }
    
    /**
     *  <p>Unique identifier of the Discount Code.</p>
     */
    
    public String getDiscountCodeId(){
        return this.discountCodeId;
    }
    
    /**
     *  <p>Date and time (UTC) from which the Discount Code is valid.</p>
     */
    
    public java.time.ZonedDateTime getValidFrom(){
        return this.validFrom;
    }
    
    /**
     *  <p>Date and time (UTC) until which the Discount Code is valid.</p>
     */
    
    public java.time.ZonedDateTime getValidUntil(){
        return this.validUntil;
    }
    
    /**
     *  <p>Date and time (UTC) the Discount Code validity check was last performed.</p>
     */
    
    public java.time.ZonedDateTime getValidityCheckTime(){
        return this.validityCheckTime;
    }

    
    public void setValue(String key, java.lang.Object value) {
        if (values == null) {
            values = new HashMap<>();
        }
        values.put(key, value);
    }
    
    
    public void setDiscountCode(final String discountCode){
        this.discountCode = discountCode;
    }
    
    
    public void setReason(final String reason){
        this.reason = reason;
    }
    
    
    public void setDiscountCodeId(final String discountCodeId){
        this.discountCodeId = discountCodeId;
    }
    
    
    public void setValidFrom(final java.time.ZonedDateTime validFrom){
        this.validFrom = validFrom;
    }
    
    
    public void setValidUntil(final java.time.ZonedDateTime validUntil){
        this.validUntil = validUntil;
    }
    
    
    public void setValidityCheckTime(final java.time.ZonedDateTime validityCheckTime){
        this.validityCheckTime = validityCheckTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        GraphQLDiscountCodeNonApplicableErrorImpl that = (GraphQLDiscountCodeNonApplicableErrorImpl) o;
    
        return new EqualsBuilder()
                .append(code, that.code)
                .append(values, that.values)
                .append(discountCode, that.discountCode)
                .append(reason, that.reason)
                .append(discountCodeId, that.discountCodeId)
                .append(validFrom, that.validFrom)
                .append(validUntil, that.validUntil)
                .append(validityCheckTime, that.validityCheckTime)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(code)
            .append(values)
            .append(discountCode)
            .append(reason)
            .append(discountCodeId)
            .append(validFrom)
            .append(validUntil)
            .append(validityCheckTime)
            .toHashCode();
    }

}
