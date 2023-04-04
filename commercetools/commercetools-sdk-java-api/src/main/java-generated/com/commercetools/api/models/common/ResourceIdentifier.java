
package com.commercetools.api.models.common;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.attribute_group.AttributeGroupResourceIdentifier;
import com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifier;
import com.commercetools.api.models.cart.CartResourceIdentifier;
import com.commercetools.api.models.cart_discount.CartDiscountResourceIdentifier;
import com.commercetools.api.models.category.CategoryResourceIdentifier;
import com.commercetools.api.models.channel.ChannelResourceIdentifier;
import com.commercetools.api.models.customer.CustomerResourceIdentifier;
import com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifier;
import com.commercetools.api.models.discount_code.DiscountCodeResourceIdentifier;
import com.commercetools.api.models.inventory.InventoryEntryResourceIdentifier;
import com.commercetools.api.models.order.OrderResourceIdentifier;
import com.commercetools.api.models.order_edit.OrderEditResourceIdentifier;
import com.commercetools.api.models.payment.PaymentResourceIdentifier;
import com.commercetools.api.models.product.ProductResourceIdentifier;
import com.commercetools.api.models.product_discount.ProductDiscountResourceIdentifier;
import com.commercetools.api.models.product_selection.ProductSelectionResourceIdentifier;
import com.commercetools.api.models.product_type.ProductTypeResourceIdentifier;
import com.commercetools.api.models.quote.QuoteResourceIdentifier;
import com.commercetools.api.models.quote_request.QuoteRequestResourceIdentifier;
import com.commercetools.api.models.review.ReviewResourceIdentifier;
import com.commercetools.api.models.shipping_method.ShippingMethodResourceIdentifier;
import com.commercetools.api.models.shopping_list.ShoppingListResourceIdentifier;
import com.commercetools.api.models.staged_quote.StagedQuoteResourceIdentifier;
import com.commercetools.api.models.standalone_price.StandalonePriceResourceIdentifier;
import com.commercetools.api.models.state.StateResourceIdentifier;
import com.commercetools.api.models.store.StoreResourceIdentifier;
import com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifier;
import com.commercetools.api.models.type.TypeResourceIdentifier;
import com.commercetools.api.models.zone.ZoneResourceIdentifier;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Draft type to create a Reference or a KeyReference to a resource. Provide either the <code>id</code> or (wherever supported) the <code>key</code> of the resource to reference, but depending on the API endpoint the response returns either a Reference or a KeyReference. For example, the field <code>parent</code> of a CategoryDraft takes a ResourceIdentifier for its value while the value of the corresponding field of a Category is a Reference.</p>
 *  <p>Each resource type has its corresponding ResourceIdentifier, like ChannelResourceIdentifier.</p>
 *
 * <hr>
 * Example to create a subtype instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ResourceIdentifier resourceIdentifier = ResourceIdentifier.attributeGroupBuilder()
 *             .build()
 * </code></pre>
 * </div>
 */
@JsonSubTypes({
        @JsonSubTypes.Type(value = com.commercetools.api.models.attribute_group.AttributeGroupResourceIdentifierImpl.class, name = AttributeGroupResourceIdentifier.ATTRIBUTE_GROUP),
        @JsonSubTypes.Type(value = com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifierImpl.class, name = BusinessUnitResourceIdentifier.BUSINESS_UNIT),
        @JsonSubTypes.Type(value = com.commercetools.api.models.cart_discount.CartDiscountResourceIdentifierImpl.class, name = CartDiscountResourceIdentifier.CART_DISCOUNT),
        @JsonSubTypes.Type(value = com.commercetools.api.models.cart.CartResourceIdentifierImpl.class, name = CartResourceIdentifier.CART),
        @JsonSubTypes.Type(value = com.commercetools.api.models.category.CategoryResourceIdentifierImpl.class, name = CategoryResourceIdentifier.CATEGORY),
        @JsonSubTypes.Type(value = com.commercetools.api.models.channel.ChannelResourceIdentifierImpl.class, name = ChannelResourceIdentifier.CHANNEL),
        @JsonSubTypes.Type(value = com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifierImpl.class, name = CustomerGroupResourceIdentifier.CUSTOMER_GROUP),
        @JsonSubTypes.Type(value = com.commercetools.api.models.customer.CustomerResourceIdentifierImpl.class, name = CustomerResourceIdentifier.CUSTOMER),
        @JsonSubTypes.Type(value = com.commercetools.api.models.discount_code.DiscountCodeResourceIdentifierImpl.class, name = DiscountCodeResourceIdentifier.DISCOUNT_CODE),
        @JsonSubTypes.Type(value = com.commercetools.api.models.inventory.InventoryEntryResourceIdentifierImpl.class, name = InventoryEntryResourceIdentifier.INVENTORY_ENTRY),
        @JsonSubTypes.Type(value = com.commercetools.api.models.order_edit.OrderEditResourceIdentifierImpl.class, name = OrderEditResourceIdentifier.ORDER_EDIT),
        @JsonSubTypes.Type(value = com.commercetools.api.models.order.OrderResourceIdentifierImpl.class, name = OrderResourceIdentifier.ORDER),
        @JsonSubTypes.Type(value = com.commercetools.api.models.payment.PaymentResourceIdentifierImpl.class, name = PaymentResourceIdentifier.PAYMENT),
        @JsonSubTypes.Type(value = com.commercetools.api.models.product_discount.ProductDiscountResourceIdentifierImpl.class, name = ProductDiscountResourceIdentifier.PRODUCT_DISCOUNT),
        @JsonSubTypes.Type(value = com.commercetools.api.models.product.ProductResourceIdentifierImpl.class, name = ProductResourceIdentifier.PRODUCT),
        @JsonSubTypes.Type(value = com.commercetools.api.models.product_selection.ProductSelectionResourceIdentifierImpl.class, name = ProductSelectionResourceIdentifier.PRODUCT_SELECTION),
        @JsonSubTypes.Type(value = com.commercetools.api.models.product_type.ProductTypeResourceIdentifierImpl.class, name = ProductTypeResourceIdentifier.PRODUCT_TYPE),
        @JsonSubTypes.Type(value = com.commercetools.api.models.quote_request.QuoteRequestResourceIdentifierImpl.class, name = QuoteRequestResourceIdentifier.QUOTE_REQUEST),
        @JsonSubTypes.Type(value = com.commercetools.api.models.quote.QuoteResourceIdentifierImpl.class, name = QuoteResourceIdentifier.QUOTE),
        @JsonSubTypes.Type(value = com.commercetools.api.models.review.ReviewResourceIdentifierImpl.class, name = ReviewResourceIdentifier.REVIEW),
        @JsonSubTypes.Type(value = com.commercetools.api.models.shipping_method.ShippingMethodResourceIdentifierImpl.class, name = ShippingMethodResourceIdentifier.SHIPPING_METHOD),
        @JsonSubTypes.Type(value = com.commercetools.api.models.shopping_list.ShoppingListResourceIdentifierImpl.class, name = ShoppingListResourceIdentifier.SHOPPING_LIST),
        @JsonSubTypes.Type(value = com.commercetools.api.models.staged_quote.StagedQuoteResourceIdentifierImpl.class, name = StagedQuoteResourceIdentifier.STAGED_QUOTE),
        @JsonSubTypes.Type(value = com.commercetools.api.models.standalone_price.StandalonePriceResourceIdentifierImpl.class, name = StandalonePriceResourceIdentifier.STANDALONE_PRICE),
        @JsonSubTypes.Type(value = com.commercetools.api.models.state.StateResourceIdentifierImpl.class, name = StateResourceIdentifier.STATE),
        @JsonSubTypes.Type(value = com.commercetools.api.models.store.StoreResourceIdentifierImpl.class, name = StoreResourceIdentifier.STORE),
        @JsonSubTypes.Type(value = com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifierImpl.class, name = TaxCategoryResourceIdentifier.TAX_CATEGORY),
        @JsonSubTypes.Type(value = com.commercetools.api.models.type.TypeResourceIdentifierImpl.class, name = TypeResourceIdentifier.TYPE),
        @JsonSubTypes.Type(value = com.commercetools.api.models.zone.ZoneResourceIdentifierImpl.class, name = ZoneResourceIdentifier.ZONE) })
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "typeId", defaultImpl = ResourceIdentifierImpl.class, visible = true)
@JsonDeserialize(as = ResourceIdentifierImpl.class)
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface ResourceIdentifier extends com.commercetools.api.models.WithKey {

    /**
     *  <p>Type of referenced resource. If given, it must match the expected ReferenceTypeId of the referenced resource.</p>
     * @return typeId
     */

    @JsonProperty("typeId")
    public ReferenceTypeId getTypeId();

    /**
     *  <p>Unique identifier of the referenced resource. Required if <code>key</code> is absent.</p>
     * @return id
     */

    @JsonProperty("id")
    public String getId();

    /**
     *  <p>User-defined unique identifier of the referenced resource. Required if <code>id</code> is absent.</p>
     * @return key
     */

    @JsonProperty("key")
    public String getKey();

    /**
     *  <p>Unique identifier of the referenced resource. Required if <code>key</code> is absent.</p>
     * @param id value to be set
     */

    public void setId(final String id);

    /**
     *  <p>User-defined unique identifier of the referenced resource. Required if <code>id</code> is absent.</p>
     * @param key value to be set
     */

    public void setKey(final String key);

    /**
     * factory method to create a deep copy of ResourceIdentifier
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ResourceIdentifier deepCopy(@Nullable final ResourceIdentifier template) {
        if (template == null) {
            return null;
        }
        if (template instanceof com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifier) {
            return com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifier
                    .deepCopy((com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifier) template);
        }
        if (template instanceof com.commercetools.api.models.customer.CustomerResourceIdentifier) {
            return com.commercetools.api.models.customer.CustomerResourceIdentifier
                    .deepCopy((com.commercetools.api.models.customer.CustomerResourceIdentifier) template);
        }
        if (template instanceof com.commercetools.api.models.discount_code.DiscountCodeResourceIdentifier) {
            return com.commercetools.api.models.discount_code.DiscountCodeResourceIdentifier
                    .deepCopy((com.commercetools.api.models.discount_code.DiscountCodeResourceIdentifier) template);
        }
        if (template instanceof com.commercetools.api.models.inventory.InventoryEntryResourceIdentifier) {
            return com.commercetools.api.models.inventory.InventoryEntryResourceIdentifier
                    .deepCopy((com.commercetools.api.models.inventory.InventoryEntryResourceIdentifier) template);
        }
        if (template instanceof com.commercetools.api.models.order_edit.OrderEditResourceIdentifier) {
            return com.commercetools.api.models.order_edit.OrderEditResourceIdentifier
                    .deepCopy((com.commercetools.api.models.order_edit.OrderEditResourceIdentifier) template);
        }
        if (template instanceof com.commercetools.api.models.order.OrderResourceIdentifier) {
            return com.commercetools.api.models.order.OrderResourceIdentifier
                    .deepCopy((com.commercetools.api.models.order.OrderResourceIdentifier) template);
        }
        if (template instanceof com.commercetools.api.models.payment.PaymentResourceIdentifier) {
            return com.commercetools.api.models.payment.PaymentResourceIdentifier
                    .deepCopy((com.commercetools.api.models.payment.PaymentResourceIdentifier) template);
        }
        if (template instanceof com.commercetools.api.models.product_discount.ProductDiscountResourceIdentifier) {
            return com.commercetools.api.models.product_discount.ProductDiscountResourceIdentifier.deepCopy(
                (com.commercetools.api.models.product_discount.ProductDiscountResourceIdentifier) template);
        }
        if (template instanceof com.commercetools.api.models.product_selection.ProductSelectionResourceIdentifier) {
            return com.commercetools.api.models.product_selection.ProductSelectionResourceIdentifier.deepCopy(
                (com.commercetools.api.models.product_selection.ProductSelectionResourceIdentifier) template);
        }
        if (template instanceof com.commercetools.api.models.product_type.ProductTypeResourceIdentifier) {
            return com.commercetools.api.models.product_type.ProductTypeResourceIdentifier
                    .deepCopy((com.commercetools.api.models.product_type.ProductTypeResourceIdentifier) template);
        }
        if (template instanceof com.commercetools.api.models.product.ProductResourceIdentifier) {
            return com.commercetools.api.models.product.ProductResourceIdentifier
                    .deepCopy((com.commercetools.api.models.product.ProductResourceIdentifier) template);
        }
        if (template instanceof com.commercetools.api.models.quote_request.QuoteRequestResourceIdentifier) {
            return com.commercetools.api.models.quote_request.QuoteRequestResourceIdentifier
                    .deepCopy((com.commercetools.api.models.quote_request.QuoteRequestResourceIdentifier) template);
        }
        if (template instanceof com.commercetools.api.models.quote.QuoteResourceIdentifier) {
            return com.commercetools.api.models.quote.QuoteResourceIdentifier
                    .deepCopy((com.commercetools.api.models.quote.QuoteResourceIdentifier) template);
        }
        if (template instanceof com.commercetools.api.models.review.ReviewResourceIdentifier) {
            return com.commercetools.api.models.review.ReviewResourceIdentifier
                    .deepCopy((com.commercetools.api.models.review.ReviewResourceIdentifier) template);
        }
        if (template instanceof com.commercetools.api.models.shipping_method.ShippingMethodResourceIdentifier) {
            return com.commercetools.api.models.shipping_method.ShippingMethodResourceIdentifier
                    .deepCopy((com.commercetools.api.models.shipping_method.ShippingMethodResourceIdentifier) template);
        }
        if (template instanceof com.commercetools.api.models.shopping_list.ShoppingListResourceIdentifier) {
            return com.commercetools.api.models.shopping_list.ShoppingListResourceIdentifier
                    .deepCopy((com.commercetools.api.models.shopping_list.ShoppingListResourceIdentifier) template);
        }
        if (template instanceof com.commercetools.api.models.staged_quote.StagedQuoteResourceIdentifier) {
            return com.commercetools.api.models.staged_quote.StagedQuoteResourceIdentifier
                    .deepCopy((com.commercetools.api.models.staged_quote.StagedQuoteResourceIdentifier) template);
        }
        if (template instanceof com.commercetools.api.models.standalone_price.StandalonePriceResourceIdentifier) {
            return com.commercetools.api.models.standalone_price.StandalonePriceResourceIdentifier.deepCopy(
                (com.commercetools.api.models.standalone_price.StandalonePriceResourceIdentifier) template);
        }
        if (template instanceof com.commercetools.api.models.state.StateResourceIdentifier) {
            return com.commercetools.api.models.state.StateResourceIdentifier
                    .deepCopy((com.commercetools.api.models.state.StateResourceIdentifier) template);
        }
        if (template instanceof com.commercetools.api.models.store.StoreResourceIdentifier) {
            return com.commercetools.api.models.store.StoreResourceIdentifier
                    .deepCopy((com.commercetools.api.models.store.StoreResourceIdentifier) template);
        }
        if (template instanceof com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifier) {
            return com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifier
                    .deepCopy((com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifier) template);
        }
        if (template instanceof com.commercetools.api.models.type.TypeResourceIdentifier) {
            return com.commercetools.api.models.type.TypeResourceIdentifier
                    .deepCopy((com.commercetools.api.models.type.TypeResourceIdentifier) template);
        }
        if (template instanceof com.commercetools.api.models.zone.ZoneResourceIdentifier) {
            return com.commercetools.api.models.zone.ZoneResourceIdentifier
                    .deepCopy((com.commercetools.api.models.zone.ZoneResourceIdentifier) template);
        }
        if (template instanceof com.commercetools.api.models.cart_discount.CartDiscountResourceIdentifier) {
            return com.commercetools.api.models.cart_discount.CartDiscountResourceIdentifier
                    .deepCopy((com.commercetools.api.models.cart_discount.CartDiscountResourceIdentifier) template);
        }
        if (template instanceof com.commercetools.api.models.attribute_group.AttributeGroupResourceIdentifier) {
            return com.commercetools.api.models.attribute_group.AttributeGroupResourceIdentifier
                    .deepCopy((com.commercetools.api.models.attribute_group.AttributeGroupResourceIdentifier) template);
        }
        if (template instanceof com.commercetools.api.models.category.CategoryResourceIdentifier) {
            return com.commercetools.api.models.category.CategoryResourceIdentifier
                    .deepCopy((com.commercetools.api.models.category.CategoryResourceIdentifier) template);
        }
        if (template instanceof com.commercetools.api.models.cart.CartResourceIdentifier) {
            return com.commercetools.api.models.cart.CartResourceIdentifier
                    .deepCopy((com.commercetools.api.models.cart.CartResourceIdentifier) template);
        }
        if (template instanceof com.commercetools.api.models.channel.ChannelResourceIdentifier) {
            return com.commercetools.api.models.channel.ChannelResourceIdentifier
                    .deepCopy((com.commercetools.api.models.channel.ChannelResourceIdentifier) template);
        }
        if (template instanceof com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifier) {
            return com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifier
                    .deepCopy((com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifier) template);
        }
        ResourceIdentifierImpl instance = new ResourceIdentifierImpl();
        instance.setId(template.getId());
        instance.setKey(template.getKey());
        return instance;
    }

    /**
     * builder for attributeGroup subtype
     * @return builder
     */
    public static com.commercetools.api.models.attribute_group.AttributeGroupResourceIdentifierBuilder attributeGroupBuilder() {
        return com.commercetools.api.models.attribute_group.AttributeGroupResourceIdentifierBuilder.of();
    }

    /**
     * builder for businessUnit subtype
     * @return builder
     */
    public static com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifierBuilder businessUnitBuilder() {
        return com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifierBuilder.of();
    }

    /**
     * builder for cartDiscount subtype
     * @return builder
     */
    public static com.commercetools.api.models.cart_discount.CartDiscountResourceIdentifierBuilder cartDiscountBuilder() {
        return com.commercetools.api.models.cart_discount.CartDiscountResourceIdentifierBuilder.of();
    }

    /**
     * builder for cart subtype
     * @return builder
     */
    public static com.commercetools.api.models.cart.CartResourceIdentifierBuilder cartBuilder() {
        return com.commercetools.api.models.cart.CartResourceIdentifierBuilder.of();
    }

    /**
     * builder for category subtype
     * @return builder
     */
    public static com.commercetools.api.models.category.CategoryResourceIdentifierBuilder categoryBuilder() {
        return com.commercetools.api.models.category.CategoryResourceIdentifierBuilder.of();
    }

    /**
     * builder for channel subtype
     * @return builder
     */
    public static com.commercetools.api.models.channel.ChannelResourceIdentifierBuilder channelBuilder() {
        return com.commercetools.api.models.channel.ChannelResourceIdentifierBuilder.of();
    }

    /**
     * builder for customerGroup subtype
     * @return builder
     */
    public static com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifierBuilder customerGroupBuilder() {
        return com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifierBuilder.of();
    }

    /**
     * builder for customer subtype
     * @return builder
     */
    public static com.commercetools.api.models.customer.CustomerResourceIdentifierBuilder customerBuilder() {
        return com.commercetools.api.models.customer.CustomerResourceIdentifierBuilder.of();
    }

    /**
     * builder for discountCode subtype
     * @return builder
     */
    public static com.commercetools.api.models.discount_code.DiscountCodeResourceIdentifierBuilder discountCodeBuilder() {
        return com.commercetools.api.models.discount_code.DiscountCodeResourceIdentifierBuilder.of();
    }

    /**
     * builder for inventoryEntry subtype
     * @return builder
     */
    public static com.commercetools.api.models.inventory.InventoryEntryResourceIdentifierBuilder inventoryEntryBuilder() {
        return com.commercetools.api.models.inventory.InventoryEntryResourceIdentifierBuilder.of();
    }

    /**
     * builder for orderEdit subtype
     * @return builder
     */
    public static com.commercetools.api.models.order_edit.OrderEditResourceIdentifierBuilder orderEditBuilder() {
        return com.commercetools.api.models.order_edit.OrderEditResourceIdentifierBuilder.of();
    }

    /**
     * builder for order subtype
     * @return builder
     */
    public static com.commercetools.api.models.order.OrderResourceIdentifierBuilder orderBuilder() {
        return com.commercetools.api.models.order.OrderResourceIdentifierBuilder.of();
    }

    /**
     * builder for payment subtype
     * @return builder
     */
    public static com.commercetools.api.models.payment.PaymentResourceIdentifierBuilder paymentBuilder() {
        return com.commercetools.api.models.payment.PaymentResourceIdentifierBuilder.of();
    }

    /**
     * builder for productDiscount subtype
     * @return builder
     */
    public static com.commercetools.api.models.product_discount.ProductDiscountResourceIdentifierBuilder productDiscountBuilder() {
        return com.commercetools.api.models.product_discount.ProductDiscountResourceIdentifierBuilder.of();
    }

    /**
     * builder for product subtype
     * @return builder
     */
    public static com.commercetools.api.models.product.ProductResourceIdentifierBuilder productBuilder() {
        return com.commercetools.api.models.product.ProductResourceIdentifierBuilder.of();
    }

    /**
     * builder for productSelection subtype
     * @return builder
     */
    public static com.commercetools.api.models.product_selection.ProductSelectionResourceIdentifierBuilder productSelectionBuilder() {
        return com.commercetools.api.models.product_selection.ProductSelectionResourceIdentifierBuilder.of();
    }

    /**
     * builder for productType subtype
     * @return builder
     */
    public static com.commercetools.api.models.product_type.ProductTypeResourceIdentifierBuilder productTypeBuilder() {
        return com.commercetools.api.models.product_type.ProductTypeResourceIdentifierBuilder.of();
    }

    /**
     * builder for quoteRequest subtype
     * @return builder
     */
    public static com.commercetools.api.models.quote_request.QuoteRequestResourceIdentifierBuilder quoteRequestBuilder() {
        return com.commercetools.api.models.quote_request.QuoteRequestResourceIdentifierBuilder.of();
    }

    /**
     * builder for quote subtype
     * @return builder
     */
    public static com.commercetools.api.models.quote.QuoteResourceIdentifierBuilder quoteBuilder() {
        return com.commercetools.api.models.quote.QuoteResourceIdentifierBuilder.of();
    }

    /**
     * builder for review subtype
     * @return builder
     */
    public static com.commercetools.api.models.review.ReviewResourceIdentifierBuilder reviewBuilder() {
        return com.commercetools.api.models.review.ReviewResourceIdentifierBuilder.of();
    }

    /**
     * builder for shippingMethod subtype
     * @return builder
     */
    public static com.commercetools.api.models.shipping_method.ShippingMethodResourceIdentifierBuilder shippingMethodBuilder() {
        return com.commercetools.api.models.shipping_method.ShippingMethodResourceIdentifierBuilder.of();
    }

    /**
     * builder for shoppingList subtype
     * @return builder
     */
    public static com.commercetools.api.models.shopping_list.ShoppingListResourceIdentifierBuilder shoppingListBuilder() {
        return com.commercetools.api.models.shopping_list.ShoppingListResourceIdentifierBuilder.of();
    }

    /**
     * builder for stagedQuote subtype
     * @return builder
     */
    public static com.commercetools.api.models.staged_quote.StagedQuoteResourceIdentifierBuilder stagedQuoteBuilder() {
        return com.commercetools.api.models.staged_quote.StagedQuoteResourceIdentifierBuilder.of();
    }

    /**
     * builder for standalonePrice subtype
     * @return builder
     */
    public static com.commercetools.api.models.standalone_price.StandalonePriceResourceIdentifierBuilder standalonePriceBuilder() {
        return com.commercetools.api.models.standalone_price.StandalonePriceResourceIdentifierBuilder.of();
    }

    /**
     * builder for state subtype
     * @return builder
     */
    public static com.commercetools.api.models.state.StateResourceIdentifierBuilder stateBuilder() {
        return com.commercetools.api.models.state.StateResourceIdentifierBuilder.of();
    }

    /**
     * builder for store subtype
     * @return builder
     */
    public static com.commercetools.api.models.store.StoreResourceIdentifierBuilder storeBuilder() {
        return com.commercetools.api.models.store.StoreResourceIdentifierBuilder.of();
    }

    /**
     * builder for taxCategory subtype
     * @return builder
     */
    public static com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifierBuilder taxCategoryBuilder() {
        return com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifierBuilder.of();
    }

    /**
     * builder for type subtype
     * @return builder
     */
    public static com.commercetools.api.models.type.TypeResourceIdentifierBuilder typeBuilder() {
        return com.commercetools.api.models.type.TypeResourceIdentifierBuilder.of();
    }

    /**
     * builder for zone subtype
     * @return builder
     */
    public static com.commercetools.api.models.zone.ZoneResourceIdentifierBuilder zoneBuilder() {
        return com.commercetools.api.models.zone.ZoneResourceIdentifierBuilder.of();
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withResourceIdentifier(Function<ResourceIdentifier, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ResourceIdentifier> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ResourceIdentifier>() {
            @Override
            public String toString() {
                return "TypeReference<ResourceIdentifier>";
            }
        };
    }
}
