package com.commercetools.api.models.common;

import com.commercetools.api.models.associate_role.AssociateRole;
import com.commercetools.api.models.attribute_group.AttributeGroup;
import com.commercetools.api.models.business_unit.BusinessUnit;
import com.commercetools.api.models.cart.Cart;
import com.commercetools.api.models.cart_discount.CartDiscount;
import com.commercetools.api.models.category.Category;
import com.commercetools.api.models.channel.Channel;
import com.commercetools.api.models.custom_object.CustomObject;
import com.commercetools.api.models.customer.Customer;
import com.commercetools.api.models.customer_group.CustomerGroup;
import com.commercetools.api.models.discount_code.DiscountCode;
import com.commercetools.api.models.extension.Extension;
import com.commercetools.api.models.inventory.InventoryEntry;
import com.commercetools.api.models.message.Message;
import com.commercetools.api.models.order.Order;
import com.commercetools.api.models.order_edit.OrderEdit;
import com.commercetools.api.models.payment.Payment;
import com.commercetools.api.models.product.Product;
import com.commercetools.api.models.product.ProductProjection;
import com.commercetools.api.models.product_discount.ProductDiscount;
import com.commercetools.api.models.product_selection.ProductSelection;
import com.commercetools.api.models.product_type.ProductType;
import com.commercetools.api.models.quote.Quote;
import com.commercetools.api.models.quote_request.QuoteRequest;
import com.commercetools.api.models.review.Review;
import com.commercetools.api.models.shipping_method.ShippingMethod;
import com.commercetools.api.models.shopping_list.ShoppingList;
import com.commercetools.api.models.staged_quote.StagedQuote;
import com.commercetools.api.models.standalone_price.StandalonePrice;
import com.commercetools.api.models.state.State;
import com.commercetools.api.models.store.Store;
import com.commercetools.api.models.subscription.Subscription;
import com.commercetools.api.models.tax_category.TaxCategory;
import com.commercetools.api.models.type.Type;
import com.commercetools.api.models.zone.Zone;
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
 * BaseResource
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class BaseResourceImpl implements BaseResource, ModelBase {

    
    private String id;
    
    
    private Long version;
    
    
    private java.time.ZonedDateTime createdAt;
    
    
    private java.time.ZonedDateTime lastModifiedAt;

    /**
     * create instance with all properties
     */
    @JsonCreator
    BaseResourceImpl(@JsonProperty("id") final String id, @JsonProperty("version") final Long version, @JsonProperty("createdAt") final java.time.ZonedDateTime createdAt, @JsonProperty("lastModifiedAt") final java.time.ZonedDateTime lastModifiedAt) {
        this.id = id;
        this.version = version;
        this.createdAt = createdAt;
        this.lastModifiedAt = lastModifiedAt;
    }
    /**
     * create empty instance
     */
    public BaseResourceImpl() {
    }

    /**
     *
     */
    
    public String getId(){
        return this.id;
    }
    
    /**
     *
     */
    
    public Long getVersion(){
        return this.version;
    }
    
    /**
     *
     */
    
    public java.time.ZonedDateTime getCreatedAt(){
        return this.createdAt;
    }
    
    /**
     *
     */
    
    public java.time.ZonedDateTime getLastModifiedAt(){
        return this.lastModifiedAt;
    }

    
    public void setId(final String id){
        this.id = id;
    }
    
    
    public void setVersion(final Long version){
        this.version = version;
    }
    
    
    public void setCreatedAt(final java.time.ZonedDateTime createdAt){
        this.createdAt = createdAt;
    }
    
    
    public void setLastModifiedAt(final java.time.ZonedDateTime lastModifiedAt){
        this.lastModifiedAt = lastModifiedAt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        BaseResourceImpl that = (BaseResourceImpl) o;
    
        return new EqualsBuilder()
                .append(id, that.id)
                .append(version, that.version)
                .append(createdAt, that.createdAt)
                .append(lastModifiedAt, that.lastModifiedAt)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(id)
            .append(version)
            .append(createdAt)
            .append(lastModifiedAt)
            .toHashCode();
    }

}
