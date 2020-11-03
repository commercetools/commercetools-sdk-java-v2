package com.commercetools.importapi.models.common;

import com.commercetools.importapi.models.common.CartDiscountKeyReference;
import com.commercetools.importapi.models.common.CategoryKeyReference;
import com.commercetools.importapi.models.common.ChannelKeyReference;
import com.commercetools.importapi.models.common.CustomerGroupKeyReference;
import com.commercetools.importapi.models.common.CustomerKeyReference;
import com.commercetools.importapi.models.common.PriceKeyReference;
import com.commercetools.importapi.models.common.ProductDiscountKeyReference;
import com.commercetools.importapi.models.common.ProductKeyReference;
import com.commercetools.importapi.models.common.ProductTypeKeyReference;
import com.commercetools.importapi.models.common.ProductVariantKeyReference;
import com.commercetools.importapi.models.common.ReferenceType;
import com.commercetools.importapi.models.common.ShippingMethodKeyReference;
import com.commercetools.importapi.models.common.StateKeyReference;
import com.commercetools.importapi.models.common.StoreKeyReference;
import com.commercetools.importapi.models.common.TaxCategoryKeyReference;
import com.commercetools.importapi.models.common.TypeKeyReference;


import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.function.Function;
import java.io.IOException;

/**
*  <p>References a resource by its key.</p>
*/
@JsonSubTypes({
   @JsonSubTypes.Type(value = com.commercetools.importapi.models.common.CartDiscountKeyReferenceImpl.class, name = "cart-discount"),
   @JsonSubTypes.Type(value = com.commercetools.importapi.models.common.CategoryKeyReferenceImpl.class, name = "category"),
   @JsonSubTypes.Type(value = com.commercetools.importapi.models.common.ChannelKeyReferenceImpl.class, name = "channel"),
   @JsonSubTypes.Type(value = com.commercetools.importapi.models.common.CustomerKeyReferenceImpl.class, name = "customer"),
   @JsonSubTypes.Type(value = com.commercetools.importapi.models.common.CustomerGroupKeyReferenceImpl.class, name = "customer-group"),
   @JsonSubTypes.Type(value = com.commercetools.importapi.models.common.PriceKeyReferenceImpl.class, name = "price"),
   @JsonSubTypes.Type(value = com.commercetools.importapi.models.common.ProductKeyReferenceImpl.class, name = "product"),
   @JsonSubTypes.Type(value = com.commercetools.importapi.models.common.ProductDiscountKeyReferenceImpl.class, name = "product-discount"),
   @JsonSubTypes.Type(value = com.commercetools.importapi.models.common.ProductTypeKeyReferenceImpl.class, name = "product-type"),
   @JsonSubTypes.Type(value = com.commercetools.importapi.models.common.ProductVariantKeyReferenceImpl.class, name = "product-variant"),
   @JsonSubTypes.Type(value = com.commercetools.importapi.models.common.ShippingMethodKeyReferenceImpl.class, name = "shipping-method"),
   @JsonSubTypes.Type(value = com.commercetools.importapi.models.common.StateKeyReferenceImpl.class, name = "state"),
   @JsonSubTypes.Type(value = com.commercetools.importapi.models.common.StoreKeyReferenceImpl.class, name = "store"),
   @JsonSubTypes.Type(value = com.commercetools.importapi.models.common.TaxCategoryKeyReferenceImpl.class, name = "tax-category"),
   @JsonSubTypes.Type(value = com.commercetools.importapi.models.common.TypeKeyReferenceImpl.class, name = "type")
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



    default <T> T withKeyReference(Function<KeyReference, T> helper) {
        return helper.apply(this);
    }
}
