
package com.commercetools.importapi.models.common;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 *  <p>References a resource by key.</p>
 *
 * <hr>
 * Example to create a subtype instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     KeyReference keyReference = KeyReference.associateRoleBuilder()
 *             key("{key}")
 *             .build()
 * </code></pre>
 * </div>
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "typeId", defaultImpl = KeyReferenceImpl.class, visible = true)
@JsonDeserialize(as = KeyReferenceImpl.class)
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface KeyReference {

    /**
     *  <p>User-defined unique identifier of the referenced resource. If the referenced resource does not exist, the <code>state</code> of the ImportOperation will be set to <code>unresolved</code> until the referenced resource is created.</p>
     * @return key
     */
    @NotNull
    @JsonProperty("key")
    public String getKey();

    /**
     *  <p>Type of referenced resource.</p>
     * @return typeId
     */
    @NotNull
    @JsonProperty("typeId")
    public ReferenceType getTypeId();

    /**
     *  <p>User-defined unique identifier of the referenced resource. If the referenced resource does not exist, the <code>state</code> of the ImportOperation will be set to <code>unresolved</code> until the referenced resource is created.</p>
     * @param key value to be set
     */

    public void setKey(final String key);

    public KeyReference copyDeep();

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

        if (!(template instanceof KeyReferenceImpl)) {
            return template.copyDeep();
        }
        KeyReferenceImpl instance = new KeyReferenceImpl();
        instance.setKey(template.getKey());
        return instance;
    }

    /**
     * builder for associateRole subtype
     * @return builder
     */
    public static com.commercetools.importapi.models.common.AssociateRoleKeyReferenceBuilder associateRoleBuilder() {
        return com.commercetools.importapi.models.common.AssociateRoleKeyReferenceBuilder.of();
    }

    /**
     * builder for businessUnit subtype
     * @return builder
     */
    public static com.commercetools.importapi.models.common.BusinessUnitKeyReferenceBuilder businessUnitBuilder() {
        return com.commercetools.importapi.models.common.BusinessUnitKeyReferenceBuilder.of();
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
