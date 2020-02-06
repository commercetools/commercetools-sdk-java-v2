package com.commercetools.importer.models.common;

import com.commercetools.importer.models.common.CartDiscountKeyReference;
import com.commercetools.importer.models.common.CategoryKeyReference;
import com.commercetools.importer.models.common.ChannelKeyReference;
import com.commercetools.importer.models.common.CustomerGroupKeyReference;
import com.commercetools.importer.models.common.CustomerKeyReference;
import com.commercetools.importer.models.common.PriceKeyReference;
import com.commercetools.importer.models.common.ProductKeyReference;
import com.commercetools.importer.models.common.ProductTypeKeyReference;
import com.commercetools.importer.models.common.ProductVariantKeyReference;
import com.commercetools.importer.models.common.ReferenceType;
import com.commercetools.importer.models.common.ShippingMethodKeyReference;
import com.commercetools.importer.models.common.StateKeyReference;
import com.commercetools.importer.models.common.TaxCategoryKeyReference;
import com.commercetools.importer.models.common.TypeKeyReference;


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
*  <p>References a resource by its key.</p>
*/
@JsonSubTypes({
   @JsonSubTypes.Type(value = com.commercetools.importer.models.common.CartDiscountKeyReferenceImpl.class, name = "cart-discount"),
   @JsonSubTypes.Type(value = com.commercetools.importer.models.common.CategoryKeyReferenceImpl.class, name = "category"),
   @JsonSubTypes.Type(value = com.commercetools.importer.models.common.ChannelKeyReferenceImpl.class, name = "channel"),
   @JsonSubTypes.Type(value = com.commercetools.importer.models.common.CustomerKeyReferenceImpl.class, name = "customer"),
   @JsonSubTypes.Type(value = com.commercetools.importer.models.common.CustomerGroupKeyReferenceImpl.class, name = "customer-group"),
   @JsonSubTypes.Type(value = com.commercetools.importer.models.common.PriceKeyReferenceImpl.class, name = "price"),
   @JsonSubTypes.Type(value = com.commercetools.importer.models.common.ProductKeyReferenceImpl.class, name = "product"),
   @JsonSubTypes.Type(value = com.commercetools.importer.models.common.ProductTypeKeyReferenceImpl.class, name = "product-type"),
   @JsonSubTypes.Type(value = com.commercetools.importer.models.common.ProductVariantKeyReferenceImpl.class, name = "product-variant"),
   @JsonSubTypes.Type(value = com.commercetools.importer.models.common.ShippingMethodKeyReferenceImpl.class, name = "shipping-method"),
   @JsonSubTypes.Type(value = com.commercetools.importer.models.common.StateKeyReferenceImpl.class, name = "state"),
   @JsonSubTypes.Type(value = com.commercetools.importer.models.common.TaxCategoryKeyReferenceImpl.class, name = "tax-category"),
   @JsonSubTypes.Type(value = com.commercetools.importer.models.common.TypeKeyReferenceImpl.class, name = "type")
})
@JsonTypeInfo(
   use = JsonTypeInfo.Id.NAME,
   include = JsonTypeInfo.As.PROPERTY,
   property = "typeId",
   defaultImpl = KeyReferenceImpl.class
)
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public interface KeyReference  {

   
   @NotNull
   @JsonProperty("key")
   public String getKey();

   public void setKey(final String key);
   


}