
package com.commercetools.importapi.models.common;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
*  <p>References a resource by its key.</p>
*/
@JsonSubTypes({
        @JsonSubTypes.Type(value = com.commercetools.importapi.models.common.CartDiscountKeyReferenceImpl.class, name = CartDiscountKeyReference.CART_DISCOUNT),
        @JsonSubTypes.Type(value = com.commercetools.importapi.models.common.CategoryKeyReferenceImpl.class, name = CategoryKeyReference.CATEGORY),
        @JsonSubTypes.Type(value = com.commercetools.importapi.models.common.ChannelKeyReferenceImpl.class, name = ChannelKeyReference.CHANNEL),
        @JsonSubTypes.Type(value = com.commercetools.importapi.models.common.CustomerGroupKeyReferenceImpl.class, name = CustomerGroupKeyReference.CUSTOMER_GROUP),
        @JsonSubTypes.Type(value = com.commercetools.importapi.models.common.CustomerKeyReferenceImpl.class, name = CustomerKeyReference.CUSTOMER),
        @JsonSubTypes.Type(value = com.commercetools.importapi.models.common.PriceKeyReferenceImpl.class, name = PriceKeyReference.PRICE),
        @JsonSubTypes.Type(value = com.commercetools.importapi.models.common.ProductDiscountKeyReferenceImpl.class, name = ProductDiscountKeyReference.PRODUCT_DISCOUNT),
        @JsonSubTypes.Type(value = com.commercetools.importapi.models.common.ProductKeyReferenceImpl.class, name = ProductKeyReference.PRODUCT),
        @JsonSubTypes.Type(value = com.commercetools.importapi.models.common.ProductTypeKeyReferenceImpl.class, name = ProductTypeKeyReference.PRODUCT_TYPE),
        @JsonSubTypes.Type(value = com.commercetools.importapi.models.common.ProductVariantKeyReferenceImpl.class, name = ProductVariantKeyReference.PRODUCT_VARIANT),
        @JsonSubTypes.Type(value = com.commercetools.importapi.models.common.ShippingMethodKeyReferenceImpl.class, name = ShippingMethodKeyReference.SHIPPING_METHOD),
        @JsonSubTypes.Type(value = com.commercetools.importapi.models.common.StateKeyReferenceImpl.class, name = StateKeyReference.STATE),
        @JsonSubTypes.Type(value = com.commercetools.importapi.models.common.StoreKeyReferenceImpl.class, name = StoreKeyReference.STORE),
        @JsonSubTypes.Type(value = com.commercetools.importapi.models.common.TaxCategoryKeyReferenceImpl.class, name = TaxCategoryKeyReference.TAX_CATEGORY),
        @JsonSubTypes.Type(value = com.commercetools.importapi.models.common.TypeKeyReferenceImpl.class, name = TypeKeyReference.TYPE) })
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "typeId", defaultImpl = KeyReferenceImpl.class, visible = true)
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public interface KeyReference {

    @NotNull
    @JsonProperty("key")
    public String getKey();

    /**
    *  <p>The type of the referenced resource.</p>
    */
    @NotNull
    @JsonProperty("typeId")
    public ReferenceType getTypeId();

    public void setKey(final String key);

    default <T> T withKeyReference(Function<KeyReference, T> helper) {
        return helper.apply(this);
    }
}
