package com.commercetools.api.models.quote_request;

import com.commercetools.api.models.cart.CartResourceIdentifier;
import com.commercetools.api.models.state.StateReference;
import com.commercetools.api.models.type.CustomFieldsDraft;
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
 * QuoteRequestDraft
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class QuoteRequestDraftImpl implements QuoteRequestDraft, ModelBase {

    
    private com.commercetools.api.models.cart.CartResourceIdentifier cart;
    
    
    private Long cartVersion;
    
    
    private String key;
    
    
    private String comment;
    
    
    private com.commercetools.api.models.type.CustomFieldsDraft custom;
    
    
    private com.commercetools.api.models.state.StateReference state;
    
    
    private String purchaseOrderNumber;

    /**
     * create instance with all properties
     */
    @JsonCreator
    QuoteRequestDraftImpl(@JsonProperty("cart") final com.commercetools.api.models.cart.CartResourceIdentifier cart, @JsonProperty("cartVersion") final Long cartVersion, @JsonProperty("key") final String key, @JsonProperty("comment") final String comment, @JsonProperty("custom") final com.commercetools.api.models.type.CustomFieldsDraft custom, @JsonProperty("state") final com.commercetools.api.models.state.StateReference state, @JsonProperty("purchaseOrderNumber") final String purchaseOrderNumber) {
        this.cart = cart;
        this.cartVersion = cartVersion;
        this.key = key;
        this.comment = comment;
        this.custom = custom;
        this.state = state;
        this.purchaseOrderNumber = purchaseOrderNumber;
    }
    /**
     * create empty instance
     */
    public QuoteRequestDraftImpl() {
    }

    /**
     *  <p>Cart for which a Quote is requested. Anonymous Carts, Carts with Discount Codes, or Carts with a <code>Multiple</code> ShippingMode are not supported.</p>
     */
    
    public com.commercetools.api.models.cart.CartResourceIdentifier getCart(){
        return this.cart;
    }
    
    /**
     *  <p>Current version of the referenced Cart.</p>
     */
    
    public Long getCartVersion(){
        return this.cartVersion;
    }
    
    /**
     *  <p>User-defined unique identifier for the QuoteRequest.</p>
     */
    
    public String getKey(){
        return this.key;
    }
    
    /**
     *  <p>Message from the Buyer included in the Quote Request.</p>
     */
    
    public String getComment(){
        return this.comment;
    }
    
    /**
     *  <p>Custom Fields to be added to the Quote Request.</p>
     */
    
    public com.commercetools.api.models.type.CustomFieldsDraft getCustom(){
        return this.custom;
    }
    
    /**
     *  <p>State of the Quote Request. This reference can point to a State in a custom workflow.</p>
     */
    
    public com.commercetools.api.models.state.StateReference getState(){
        return this.state;
    }
    
    /**
     *  <p>Identifier for a purchase order, usually in a B2B context. The Purchase Order Number is typically entered by the Buyer.</p>
     */
    
    public String getPurchaseOrderNumber(){
        return this.purchaseOrderNumber;
    }

    
    public void setCart(final com.commercetools.api.models.cart.CartResourceIdentifier cart){
        this.cart = cart;
    }
    
    
    public void setCartVersion(final Long cartVersion){
        this.cartVersion = cartVersion;
    }
    
    
    public void setKey(final String key){
        this.key = key;
    }
    
    
    public void setComment(final String comment){
        this.comment = comment;
    }
    
    
    public void setCustom(final com.commercetools.api.models.type.CustomFieldsDraft custom){
        this.custom = custom;
    }
    
    
    public void setState(final com.commercetools.api.models.state.StateReference state){
        this.state = state;
    }
    
    
    public void setPurchaseOrderNumber(final String purchaseOrderNumber){
        this.purchaseOrderNumber = purchaseOrderNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        QuoteRequestDraftImpl that = (QuoteRequestDraftImpl) o;
    
        return new EqualsBuilder()
                .append(cart, that.cart)
                .append(cartVersion, that.cartVersion)
                .append(key, that.key)
                .append(comment, that.comment)
                .append(custom, that.custom)
                .append(state, that.state)
                .append(purchaseOrderNumber, that.purchaseOrderNumber)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(cart)
            .append(cartVersion)
            .append(key)
            .append(comment)
            .append(custom)
            .append(state)
            .append(purchaseOrderNumber)
            .toHashCode();
    }

}
