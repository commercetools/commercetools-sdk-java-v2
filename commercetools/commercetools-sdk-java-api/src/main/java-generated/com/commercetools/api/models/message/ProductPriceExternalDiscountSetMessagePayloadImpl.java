package com.commercetools.api.models.message;

import com.commercetools.api.models.common.DiscountedPrice;
import com.commercetools.api.models.message.MessagePayload;
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
 *  <p>Generated after a successful Set Discounted Embedded Price update action.</p>
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class ProductPriceExternalDiscountSetMessagePayloadImpl implements ProductPriceExternalDiscountSetMessagePayload, ModelBase {

    
    private String type;
    
    
    private Integer variantId;
    
    
    private String variantKey;
    
    
    private String sku;
    
    
    private String priceId;
    
    
    private com.commercetools.api.models.common.DiscountedPrice discounted;
    
    
    private Boolean staged;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ProductPriceExternalDiscountSetMessagePayloadImpl(@JsonProperty("variantId") final Integer variantId, @JsonProperty("variantKey") final String variantKey, @JsonProperty("sku") final String sku, @JsonProperty("priceId") final String priceId, @JsonProperty("discounted") final com.commercetools.api.models.common.DiscountedPrice discounted, @JsonProperty("staged") final Boolean staged) {
        this.variantId = variantId;
        this.variantKey = variantKey;
        this.sku = sku;
        this.priceId = priceId;
        this.discounted = discounted;
        this.staged = staged;
        this.type =  PRODUCT_PRICE_EXTERNAL_DISCOUNT_SET;
    }
    /**
     * create empty instance
     */
    public ProductPriceExternalDiscountSetMessagePayloadImpl() {
        this.type =  PRODUCT_PRICE_EXTERNAL_DISCOUNT_SET;
    }

    /**
     *
     */
    
    public String getType(){
        return this.type;
    }
    
    /**
     *  <p>Unique identifier of the Product Variant for which the Discount was set.</p>
     */
    
    public Integer getVariantId(){
        return this.variantId;
    }
    
    /**
     *  <p>Key of the Product Variant for which the Discount was set.</p>
     */
    
    public String getVariantKey(){
        return this.variantKey;
    }
    
    /**
     *  <p>SKU of the Product Variant for which Discount was set.</p>
     */
    
    public String getSku(){
        return this.sku;
    }
    
    /**
     *  <p>Unique identifier of the Price.</p>
     */
    
    public String getPriceId(){
        return this.priceId;
    }
    
    /**
     *  <p>Discounted Price for the Product Variant for which Discount was set.</p>
     */
    
    public com.commercetools.api.models.common.DiscountedPrice getDiscounted(){
        return this.discounted;
    }
    
    /**
     *  <p>Whether the update was only applied to the staged Product Projection.</p>
     */
    
    public Boolean getStaged(){
        return this.staged;
    }

    
    public void setVariantId(final Integer variantId){
        this.variantId = variantId;
    }
    
    
    public void setVariantKey(final String variantKey){
        this.variantKey = variantKey;
    }
    
    
    public void setSku(final String sku){
        this.sku = sku;
    }
    
    
    public void setPriceId(final String priceId){
        this.priceId = priceId;
    }
    
    
    public void setDiscounted(final com.commercetools.api.models.common.DiscountedPrice discounted){
        this.discounted = discounted;
    }
    
    
    public void setStaged(final Boolean staged){
        this.staged = staged;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        ProductPriceExternalDiscountSetMessagePayloadImpl that = (ProductPriceExternalDiscountSetMessagePayloadImpl) o;
    
        return new EqualsBuilder()
                .append(type, that.type)
                .append(variantId, that.variantId)
                .append(variantKey, that.variantKey)
                .append(sku, that.sku)
                .append(priceId, that.priceId)
                .append(discounted, that.discounted)
                .append(staged, that.staged)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(type)
            .append(variantId)
            .append(variantKey)
            .append(sku)
            .append(priceId)
            .append(discounted)
            .append(staged)
            .toHashCode();
    }

}
