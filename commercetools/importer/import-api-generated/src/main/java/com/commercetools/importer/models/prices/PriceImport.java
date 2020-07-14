package com.commercetools.importer.models.prices;

import com.commercetools.importer.models.common.ChannelKeyReference;
import com.commercetools.importer.models.common.CustomerGroupKeyReference;
import com.commercetools.importer.models.common.DiscountedPrice;
import com.commercetools.importer.models.common.ImportResource;
import com.commercetools.importer.models.common.Money;
import com.commercetools.importer.models.common.ProductKeyReference;
import com.commercetools.importer.models.common.ProductVariantKeyReference;
import java.time.ZonedDateTime;
import com.commercetools.importer.models.prices.PriceImportImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import java.io.IOException;

/**
*  <p>Imports a product variant's prices.</p>
*/
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = PriceImportImpl.class)
public interface PriceImport extends ImportResource {

   /**
   *  <p>Maps to <code>Price.value</code>.</p>
   *  <p>The Import API <strong>only</strong> supports <code>centPrecision</code> prices.</p>
   */
   @NotNull
   @Valid
   @JsonProperty("value")
   public Money getValue();
   /**
   *  <p>Maps to <code>Price.county</code>.</p>
   */
   
   @JsonProperty("country")
   public String getCountry();
   /**
   *  <p>Maps to <code>Price.validFrom</code>.</p>
   */
   
   @JsonProperty("validFrom")
   public ZonedDateTime getValidFrom();
   /**
   *  <p>Maps to <code>Price.validUntil</code>.</p>
   */
   
   @JsonProperty("validUntil")
   public ZonedDateTime getValidUntil();
   /**
   *  <p>References a customer group by its key.</p>
   *  <p>The customer group referenced
   *  must already exist in the commercetools project, or the
   *  import operation state is set to <code>Unresolved</code>.</p>
   */
   @Valid
   @JsonProperty("customerGroup")
   public CustomerGroupKeyReference getCustomerGroup();
   /**
   *  <p>References a channel by its key.</p>
   *  <p>The channel referenced
   *  must already exist in the commercetools project, or the
   *  import operation state is set to <code>Unresolved</code>.</p>
   */
   @Valid
   @JsonProperty("channel")
   public ChannelKeyReference getChannel();
   /**
   *  <p>Sets a discounted price from an external service.</p>
   */
   @Valid
   @JsonProperty("discounted")
   public DiscountedPrice getDiscounted();
   /**
   *  <p>The product variant in which this price is contained.</p>
   *  <p>The product variant referenced
   *  must already exist in the commercetools project, or the
   *  import operation state is set to <code>Unresolved</code>.</p>
   */
   @NotNull
   @Valid
   @JsonProperty("productVariant")
   public ProductVariantKeyReference getProductVariant();
   /**
   *  <p>The product in which this product variant containong the price is contained. Maps to <code>ProductVariant.product</code>.</p>
   *  <p>The product referenced
   *  must already exist in the commercetools project, or the
   *  import operation state is set to <code>Unresolved</code>.</p>
   */
   @NotNull
   @Valid
   @JsonProperty("product")
   public ProductKeyReference getProduct();

   public void setValue(final Money value);
   
   public void setCountry(final String country);
   
   public void setValidFrom(final ZonedDateTime validFrom);
   
   public void setValidUntil(final ZonedDateTime validUntil);
   
   public void setCustomerGroup(final CustomerGroupKeyReference customerGroup);
   
   public void setChannel(final ChannelKeyReference channel);
   
   public void setDiscounted(final DiscountedPrice discounted);
   
   public void setProductVariant(final ProductVariantKeyReference productVariant);
   
   public void setProduct(final ProductKeyReference product);
   
   public static PriceImportImpl of(){
      return new PriceImportImpl();
   }
   

   public static PriceImportImpl of(final PriceImport template) {
      PriceImportImpl instance = new PriceImportImpl();
      instance.setKey(template.getKey());
      instance.setValue(template.getValue());
      instance.setCountry(template.getCountry());
      instance.setValidFrom(template.getValidFrom());
      instance.setValidUntil(template.getValidUntil());
      instance.setCustomerGroup(template.getCustomerGroup());
      instance.setChannel(template.getChannel());
      instance.setDiscounted(template.getDiscounted());
      instance.setProductVariant(template.getProductVariant());
      instance.setProduct(template.getProduct());
      return instance;
   }

}