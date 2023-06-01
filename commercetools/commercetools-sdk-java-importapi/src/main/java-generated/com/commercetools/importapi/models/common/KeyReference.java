package com.commercetools.importapi.models.common;

import com.commercetools.importapi.models.common.CartDiscountKeyReference;
import com.commercetools.importapi.models.common.CartKeyReference;
import com.commercetools.importapi.models.common.CategoryKeyReference;
import com.commercetools.importapi.models.common.ChannelKeyReference;
import com.commercetools.importapi.models.common.CustomObjectKeyReference;
import com.commercetools.importapi.models.common.CustomerGroupKeyReference;
import com.commercetools.importapi.models.common.CustomerKeyReference;
import com.commercetools.importapi.models.common.DiscountCodeKeyReference;
import com.commercetools.importapi.models.common.OrderKeyReference;
import com.commercetools.importapi.models.common.PaymentKeyReference;
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
import javax.annotation.Nullable;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.io.IOException;

/**
 *  <p>References a resource by key.</p>
 *
 * <hr>
 * Example to create a subtype instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     KeyReference keyReference = KeyReference.cartDiscountBuilder()
 *             key("{key}")
 *             .build()
 * </code></pre>
 * </div> 
 */
@JsonSubTypes({
   @JsonSubTypes.Type(value = com.commercetools.importapi.models.common.CartDiscountKeyReferenceImpl.class, name = CartDiscountKeyReference.CART_DISCOUNT),
   @JsonSubTypes.Type(value = com.commercetools.importapi.models.common.CartKeyReferenceImpl.class, name = CartKeyReference.CART),
   @JsonSubTypes.Type(value = com.commercetools.importapi.models.common.CategoryKeyReferenceImpl.class, name = CategoryKeyReference.CATEGORY),
   @JsonSubTypes.Type(value = com.commercetools.importapi.models.common.ChannelKeyReferenceImpl.class, name = ChannelKeyReference.CHANNEL),
   @JsonSubTypes.Type(value = com.commercetools.importapi.models.common.CustomObjectKeyReferenceImpl.class, name = CustomObjectKeyReference.KEY_VALUE_DOCUMENT),
   @JsonSubTypes.Type(value = com.commercetools.importapi.models.common.CustomerGroupKeyReferenceImpl.class, name = CustomerGroupKeyReference.CUSTOMER_GROUP),
   @JsonSubTypes.Type(value = com.commercetools.importapi.models.common.CustomerKeyReferenceImpl.class, name = CustomerKeyReference.CUSTOMER),
   @JsonSubTypes.Type(value = com.commercetools.importapi.models.common.DiscountCodeKeyReferenceImpl.class, name = DiscountCodeKeyReference.DISCOUNT_CODE),
   @JsonSubTypes.Type(value = com.commercetools.importapi.models.common.OrderKeyReferenceImpl.class, name = OrderKeyReference.ORDER),
   @JsonSubTypes.Type(value = com.commercetools.importapi.models.common.PaymentKeyReferenceImpl.class, name = PaymentKeyReference.PAYMENT),
   @JsonSubTypes.Type(value = com.commercetools.importapi.models.common.PriceKeyReferenceImpl.class, name = PriceKeyReference.PRICE),
   @JsonSubTypes.Type(value = com.commercetools.importapi.models.common.ProductDiscountKeyReferenceImpl.class, name = ProductDiscountKeyReference.PRODUCT_DISCOUNT),
   @JsonSubTypes.Type(value = com.commercetools.importapi.models.common.ProductKeyReferenceImpl.class, name = ProductKeyReference.PRODUCT),
   @JsonSubTypes.Type(value = com.commercetools.importapi.models.common.ProductTypeKeyReferenceImpl.class, name = ProductTypeKeyReference.PRODUCT_TYPE),
   @JsonSubTypes.Type(value = com.commercetools.importapi.models.common.ProductVariantKeyReferenceImpl.class, name = ProductVariantKeyReference.PRODUCT_VARIANT),
   @JsonSubTypes.Type(value = com.commercetools.importapi.models.common.ShippingMethodKeyReferenceImpl.class, name = ShippingMethodKeyReference.SHIPPING_METHOD),
   @JsonSubTypes.Type(value = com.commercetools.importapi.models.common.StateKeyReferenceImpl.class, name = StateKeyReference.STATE),
   @JsonSubTypes.Type(value = com.commercetools.importapi.models.common.StoreKeyReferenceImpl.class, name = StoreKeyReference.STORE),
   @JsonSubTypes.Type(value = com.commercetools.importapi.models.common.TaxCategoryKeyReferenceImpl.class, name = TaxCategoryKeyReference.TAX_CATEGORY),
   @JsonSubTypes.Type(value = com.commercetools.importapi.models.common.TypeKeyReferenceImpl.class, name = TypeKeyReference.TYPE)
})
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.EXISTING_PROPERTY,
    property = "typeId",
    defaultImpl = KeyReferenceImpl.class,
    visible = true
)
@JsonDeserialize(as = KeyReferenceImpl.class)
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public interface KeyReference  {


    /**
     *
     * @return key
     */
    @NotNull
    @JsonProperty("key")
    public String getKey();
    /**
     *  <p>The type of the referenced resource.</p>
     * @return typeId
     */
    @NotNull
    @JsonProperty("typeId")
    public ReferenceType getTypeId();

    /**
     * set key
     * @param key value to be set
     */
    
    public void setKey(final String key);
    



    /**
     * factory method to create a deep copy of KeyReference
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static KeyReference deepCopy(@Nullable final KeyReference template) {
        if (template == null) {
            return null;
        }
        if (template instanceof com.commercetools.importapi.models.common.CartDiscountKeyReference) {
            return com.commercetools.importapi.models.common.CartDiscountKeyReference.deepCopy((com.commercetools.importapi.models.common.CartDiscountKeyReference)template);
        }
        if (template instanceof com.commercetools.importapi.models.common.CartKeyReference) {
            return com.commercetools.importapi.models.common.CartKeyReference.deepCopy((com.commercetools.importapi.models.common.CartKeyReference)template);
        }
        if (template instanceof com.commercetools.importapi.models.common.CategoryKeyReference) {
            return com.commercetools.importapi.models.common.CategoryKeyReference.deepCopy((com.commercetools.importapi.models.common.CategoryKeyReference)template);
        }
        if (template instanceof com.commercetools.importapi.models.common.ChannelKeyReference) {
            return com.commercetools.importapi.models.common.ChannelKeyReference.deepCopy((com.commercetools.importapi.models.common.ChannelKeyReference)template);
        }
        if (template instanceof com.commercetools.importapi.models.common.CustomObjectKeyReference) {
            return com.commercetools.importapi.models.common.CustomObjectKeyReference.deepCopy((com.commercetools.importapi.models.common.CustomObjectKeyReference)template);
        }
        if (template instanceof com.commercetools.importapi.models.common.CustomerGroupKeyReference) {
            return com.commercetools.importapi.models.common.CustomerGroupKeyReference.deepCopy((com.commercetools.importapi.models.common.CustomerGroupKeyReference)template);
        }
        if (template instanceof com.commercetools.importapi.models.common.CustomerKeyReference) {
            return com.commercetools.importapi.models.common.CustomerKeyReference.deepCopy((com.commercetools.importapi.models.common.CustomerKeyReference)template);
        }
        if (template instanceof com.commercetools.importapi.models.common.DiscountCodeKeyReference) {
            return com.commercetools.importapi.models.common.DiscountCodeKeyReference.deepCopy((com.commercetools.importapi.models.common.DiscountCodeKeyReference)template);
        }
        if (template instanceof com.commercetools.importapi.models.common.OrderKeyReference) {
            return com.commercetools.importapi.models.common.OrderKeyReference.deepCopy((com.commercetools.importapi.models.common.OrderKeyReference)template);
        }
        if (template instanceof com.commercetools.importapi.models.common.PaymentKeyReference) {
            return com.commercetools.importapi.models.common.PaymentKeyReference.deepCopy((com.commercetools.importapi.models.common.PaymentKeyReference)template);
        }
        if (template instanceof com.commercetools.importapi.models.common.PriceKeyReference) {
            return com.commercetools.importapi.models.common.PriceKeyReference.deepCopy((com.commercetools.importapi.models.common.PriceKeyReference)template);
        }
        if (template instanceof com.commercetools.importapi.models.common.ProductDiscountKeyReference) {
            return com.commercetools.importapi.models.common.ProductDiscountKeyReference.deepCopy((com.commercetools.importapi.models.common.ProductDiscountKeyReference)template);
        }
        if (template instanceof com.commercetools.importapi.models.common.ProductKeyReference) {
            return com.commercetools.importapi.models.common.ProductKeyReference.deepCopy((com.commercetools.importapi.models.common.ProductKeyReference)template);
        }
        if (template instanceof com.commercetools.importapi.models.common.ProductTypeKeyReference) {
            return com.commercetools.importapi.models.common.ProductTypeKeyReference.deepCopy((com.commercetools.importapi.models.common.ProductTypeKeyReference)template);
        }
        if (template instanceof com.commercetools.importapi.models.common.ProductVariantKeyReference) {
            return com.commercetools.importapi.models.common.ProductVariantKeyReference.deepCopy((com.commercetools.importapi.models.common.ProductVariantKeyReference)template);
        }
        if (template instanceof com.commercetools.importapi.models.common.ShippingMethodKeyReference) {
            return com.commercetools.importapi.models.common.ShippingMethodKeyReference.deepCopy((com.commercetools.importapi.models.common.ShippingMethodKeyReference)template);
        }
        if (template instanceof com.commercetools.importapi.models.common.StateKeyReference) {
            return com.commercetools.importapi.models.common.StateKeyReference.deepCopy((com.commercetools.importapi.models.common.StateKeyReference)template);
        }
        if (template instanceof com.commercetools.importapi.models.common.StoreKeyReference) {
            return com.commercetools.importapi.models.common.StoreKeyReference.deepCopy((com.commercetools.importapi.models.common.StoreKeyReference)template);
        }
        if (template instanceof com.commercetools.importapi.models.common.TaxCategoryKeyReference) {
            return com.commercetools.importapi.models.common.TaxCategoryKeyReference.deepCopy((com.commercetools.importapi.models.common.TaxCategoryKeyReference)template);
        }
        if (template instanceof com.commercetools.importapi.models.common.TypeKeyReference) {
            return com.commercetools.importapi.models.common.TypeKeyReference.deepCopy((com.commercetools.importapi.models.common.TypeKeyReference)template);
        }
        KeyReferenceImpl instance = new KeyReferenceImpl();
        instance.setKey(template.getKey());
        return instance;
    }


    /**
     * builder for cartDiscount subtype
     * @return builder
     */
    public static com.commercetools.importapi.models.common.CartDiscountKeyReferenceBuilder cartDiscountBuilder() {
       return com.commercetools.importapi.models.common.CartDiscountKeyReferenceBuilder.of();
    }
    /**
     * builder for cart subtype
     * @return builder
     */
    public static com.commercetools.importapi.models.common.CartKeyReferenceBuilder cartBuilder() {
       return com.commercetools.importapi.models.common.CartKeyReferenceBuilder.of();
    }
    /**
     * builder for category subtype
     * @return builder
     */
    public static com.commercetools.importapi.models.common.CategoryKeyReferenceBuilder categoryBuilder() {
       return com.commercetools.importapi.models.common.CategoryKeyReferenceBuilder.of();
    }
    /**
     * builder for channel subtype
     * @return builder
     */
    public static com.commercetools.importapi.models.common.ChannelKeyReferenceBuilder channelBuilder() {
       return com.commercetools.importapi.models.common.ChannelKeyReferenceBuilder.of();
    }
    /**
     * builder for keyValueDocument subtype
     * @return builder
     */
    public static com.commercetools.importapi.models.common.CustomObjectKeyReferenceBuilder keyValueDocumentBuilder() {
       return com.commercetools.importapi.models.common.CustomObjectKeyReferenceBuilder.of();
    }
    /**
     * builder for customerGroup subtype
     * @return builder
     */
    public static com.commercetools.importapi.models.common.CustomerGroupKeyReferenceBuilder customerGroupBuilder() {
       return com.commercetools.importapi.models.common.CustomerGroupKeyReferenceBuilder.of();
    }
    /**
     * builder for customer subtype
     * @return builder
     */
    public static com.commercetools.importapi.models.common.CustomerKeyReferenceBuilder customerBuilder() {
       return com.commercetools.importapi.models.common.CustomerKeyReferenceBuilder.of();
    }
    /**
     * builder for discountCode subtype
     * @return builder
     */
    public static com.commercetools.importapi.models.common.DiscountCodeKeyReferenceBuilder discountCodeBuilder() {
       return com.commercetools.importapi.models.common.DiscountCodeKeyReferenceBuilder.of();
    }
    /**
     * builder for order subtype
     * @return builder
     */
    public static com.commercetools.importapi.models.common.OrderKeyReferenceBuilder orderBuilder() {
       return com.commercetools.importapi.models.common.OrderKeyReferenceBuilder.of();
    }
    /**
     * builder for payment subtype
     * @return builder
     */
    public static com.commercetools.importapi.models.common.PaymentKeyReferenceBuilder paymentBuilder() {
       return com.commercetools.importapi.models.common.PaymentKeyReferenceBuilder.of();
    }
    /**
     * builder for price subtype
     * @return builder
     */
    public static com.commercetools.importapi.models.common.PriceKeyReferenceBuilder priceBuilder() {
       return com.commercetools.importapi.models.common.PriceKeyReferenceBuilder.of();
    }
    /**
     * builder for productDiscount subtype
     * @return builder
     */
    public static com.commercetools.importapi.models.common.ProductDiscountKeyReferenceBuilder productDiscountBuilder() {
       return com.commercetools.importapi.models.common.ProductDiscountKeyReferenceBuilder.of();
    }
    /**
     * builder for product subtype
     * @return builder
     */
    public static com.commercetools.importapi.models.common.ProductKeyReferenceBuilder productBuilder() {
       return com.commercetools.importapi.models.common.ProductKeyReferenceBuilder.of();
    }
    /**
     * builder for productType subtype
     * @return builder
     */
    public static com.commercetools.importapi.models.common.ProductTypeKeyReferenceBuilder productTypeBuilder() {
       return com.commercetools.importapi.models.common.ProductTypeKeyReferenceBuilder.of();
    }
    /**
     * builder for productVariant subtype
     * @return builder
     */
    public static com.commercetools.importapi.models.common.ProductVariantKeyReferenceBuilder productVariantBuilder() {
       return com.commercetools.importapi.models.common.ProductVariantKeyReferenceBuilder.of();
    }
    /**
     * builder for shippingMethod subtype
     * @return builder
     */
    public static com.commercetools.importapi.models.common.ShippingMethodKeyReferenceBuilder shippingMethodBuilder() {
       return com.commercetools.importapi.models.common.ShippingMethodKeyReferenceBuilder.of();
    }
    /**
     * builder for state subtype
     * @return builder
     */
    public static com.commercetools.importapi.models.common.StateKeyReferenceBuilder stateBuilder() {
       return com.commercetools.importapi.models.common.StateKeyReferenceBuilder.of();
    }
    /**
     * builder for store subtype
     * @return builder
     */
    public static com.commercetools.importapi.models.common.StoreKeyReferenceBuilder storeBuilder() {
       return com.commercetools.importapi.models.common.StoreKeyReferenceBuilder.of();
    }
    /**
     * builder for taxCategory subtype
     * @return builder
     */
    public static com.commercetools.importapi.models.common.TaxCategoryKeyReferenceBuilder taxCategoryBuilder() {
       return com.commercetools.importapi.models.common.TaxCategoryKeyReferenceBuilder.of();
    }
    /**
     * builder for type subtype
     * @return builder
     */
    public static com.commercetools.importapi.models.common.TypeKeyReferenceBuilder typeBuilder() {
       return com.commercetools.importapi.models.common.TypeKeyReferenceBuilder.of();
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withKeyReference(Function<KeyReference, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<KeyReference> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<KeyReference>() {
            @Override
            public String toString() {
                return "TypeReference<KeyReference>";
            }
        };
    }
}
