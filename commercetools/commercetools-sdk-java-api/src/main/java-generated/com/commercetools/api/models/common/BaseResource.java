
package com.commercetools.api.models.common;

import java.time.*;
import java.time.ZonedDateTime;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * BaseResource
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     BaseResource baseResource = BaseResource.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface BaseResource {

    /**
     *
     * @return id
     */
    @NotNull
    @JsonProperty("id")
    public String getId();

    /**
     *
     * @return version
     */
    @NotNull
    @JsonProperty("version")
    public Long getVersion();

    /**
     *
     * @return createdAt
     */
    @NotNull
    @JsonProperty("createdAt")
    public ZonedDateTime getCreatedAt();

    /**
     *
     * @return lastModifiedAt
     */
    @NotNull
    @JsonProperty("lastModifiedAt")
    public ZonedDateTime getLastModifiedAt();

    /**
     * set id
     * @param id value to be set
     */

    public void setId(final String id);

    /**
     * set version
     * @param version value to be set
     */

    public void setVersion(final Long version);

    /**
     * set createdAt
     * @param createdAt value to be set
     */

    public void setCreatedAt(final ZonedDateTime createdAt);

    /**
     * set lastModifiedAt
     * @param lastModifiedAt value to be set
     */

    public void setLastModifiedAt(final ZonedDateTime lastModifiedAt);

    /**
     * factory method to create a deep copy of BaseResource
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static BaseResource deepCopy(@Nullable final BaseResource template) {
        if (template == null) {
            return null;
        }
        if (template instanceof com.commercetools.api.models.custom_object.CustomObject) {
            return com.commercetools.api.models.custom_object.CustomObject
                    .deepCopy((com.commercetools.api.models.custom_object.CustomObject) template);
        }
        if (template instanceof com.commercetools.api.models.customer_group.CustomerGroup) {
            return com.commercetools.api.models.customer_group.CustomerGroup
                    .deepCopy((com.commercetools.api.models.customer_group.CustomerGroup) template);
        }
        if (template instanceof com.commercetools.api.models.customer.Customer) {
            return com.commercetools.api.models.customer.Customer
                    .deepCopy((com.commercetools.api.models.customer.Customer) template);
        }
        if (template instanceof com.commercetools.api.models.discount_code.DiscountCode) {
            return com.commercetools.api.models.discount_code.DiscountCode
                    .deepCopy((com.commercetools.api.models.discount_code.DiscountCode) template);
        }
        if (template instanceof com.commercetools.api.models.extension.Extension) {
            return com.commercetools.api.models.extension.Extension
                    .deepCopy((com.commercetools.api.models.extension.Extension) template);
        }
        if (template instanceof com.commercetools.api.models.inventory.InventoryEntry) {
            return com.commercetools.api.models.inventory.InventoryEntry
                    .deepCopy((com.commercetools.api.models.inventory.InventoryEntry) template);
        }
        if (template instanceof com.commercetools.api.models.message.Message) {
            return com.commercetools.api.models.message.Message
                    .deepCopy((com.commercetools.api.models.message.Message) template);
        }
        if (template instanceof com.commercetools.api.models.order_edit.OrderEdit) {
            return com.commercetools.api.models.order_edit.OrderEdit
                    .deepCopy((com.commercetools.api.models.order_edit.OrderEdit) template);
        }
        if (template instanceof com.commercetools.api.models.order.Order) {
            return com.commercetools.api.models.order.Order
                    .deepCopy((com.commercetools.api.models.order.Order) template);
        }
        if (template instanceof com.commercetools.api.models.payment.Payment) {
            return com.commercetools.api.models.payment.Payment
                    .deepCopy((com.commercetools.api.models.payment.Payment) template);
        }
        if (template instanceof com.commercetools.api.models.product_discount.ProductDiscount) {
            return com.commercetools.api.models.product_discount.ProductDiscount
                    .deepCopy((com.commercetools.api.models.product_discount.ProductDiscount) template);
        }
        if (template instanceof com.commercetools.api.models.product_selection.ProductSelection) {
            return com.commercetools.api.models.product_selection.ProductSelection
                    .deepCopy((com.commercetools.api.models.product_selection.ProductSelection) template);
        }
        if (template instanceof com.commercetools.api.models.product_type.ProductType) {
            return com.commercetools.api.models.product_type.ProductType
                    .deepCopy((com.commercetools.api.models.product_type.ProductType) template);
        }
        if (template instanceof com.commercetools.api.models.product.Product) {
            return com.commercetools.api.models.product.Product
                    .deepCopy((com.commercetools.api.models.product.Product) template);
        }
        if (template instanceof com.commercetools.api.models.product.ProductProjection) {
            return com.commercetools.api.models.product.ProductProjection
                    .deepCopy((com.commercetools.api.models.product.ProductProjection) template);
        }
        if (template instanceof com.commercetools.api.models.quote_request.QuoteRequest) {
            return com.commercetools.api.models.quote_request.QuoteRequest
                    .deepCopy((com.commercetools.api.models.quote_request.QuoteRequest) template);
        }
        if (template instanceof com.commercetools.api.models.quote.Quote) {
            return com.commercetools.api.models.quote.Quote
                    .deepCopy((com.commercetools.api.models.quote.Quote) template);
        }
        if (template instanceof com.commercetools.api.models.review.Review) {
            return com.commercetools.api.models.review.Review
                    .deepCopy((com.commercetools.api.models.review.Review) template);
        }
        if (template instanceof com.commercetools.api.models.shipping_method.ShippingMethod) {
            return com.commercetools.api.models.shipping_method.ShippingMethod
                    .deepCopy((com.commercetools.api.models.shipping_method.ShippingMethod) template);
        }
        if (template instanceof com.commercetools.api.models.shopping_list.ShoppingList) {
            return com.commercetools.api.models.shopping_list.ShoppingList
                    .deepCopy((com.commercetools.api.models.shopping_list.ShoppingList) template);
        }
        if (template instanceof com.commercetools.api.models.staged_quote.StagedQuote) {
            return com.commercetools.api.models.staged_quote.StagedQuote
                    .deepCopy((com.commercetools.api.models.staged_quote.StagedQuote) template);
        }
        if (template instanceof com.commercetools.api.models.standalone_price.StandalonePrice) {
            return com.commercetools.api.models.standalone_price.StandalonePrice
                    .deepCopy((com.commercetools.api.models.standalone_price.StandalonePrice) template);
        }
        if (template instanceof com.commercetools.api.models.state.State) {
            return com.commercetools.api.models.state.State
                    .deepCopy((com.commercetools.api.models.state.State) template);
        }
        if (template instanceof com.commercetools.api.models.store.Store) {
            return com.commercetools.api.models.store.Store
                    .deepCopy((com.commercetools.api.models.store.Store) template);
        }
        if (template instanceof com.commercetools.api.models.subscription.Subscription) {
            return com.commercetools.api.models.subscription.Subscription
                    .deepCopy((com.commercetools.api.models.subscription.Subscription) template);
        }
        if (template instanceof com.commercetools.api.models.tax_category.TaxCategory) {
            return com.commercetools.api.models.tax_category.TaxCategory
                    .deepCopy((com.commercetools.api.models.tax_category.TaxCategory) template);
        }
        if (template instanceof com.commercetools.api.models.type.Type) {
            return com.commercetools.api.models.type.Type.deepCopy((com.commercetools.api.models.type.Type) template);
        }
        if (template instanceof com.commercetools.api.models.zone.Zone) {
            return com.commercetools.api.models.zone.Zone.deepCopy((com.commercetools.api.models.zone.Zone) template);
        }
        if (template instanceof com.commercetools.api.models.attribute_group.AttributeGroup) {
            return com.commercetools.api.models.attribute_group.AttributeGroup
                    .deepCopy((com.commercetools.api.models.attribute_group.AttributeGroup) template);
        }
        if (template instanceof com.commercetools.api.models.category.Category) {
            return com.commercetools.api.models.category.Category
                    .deepCopy((com.commercetools.api.models.category.Category) template);
        }
        if (template instanceof com.commercetools.api.models.cart_discount.CartDiscount) {
            return com.commercetools.api.models.cart_discount.CartDiscount
                    .deepCopy((com.commercetools.api.models.cart_discount.CartDiscount) template);
        }
        if (template instanceof com.commercetools.api.models.channel.Channel) {
            return com.commercetools.api.models.channel.Channel
                    .deepCopy((com.commercetools.api.models.channel.Channel) template);
        }
        if (template instanceof com.commercetools.api.models.business_unit.BusinessUnit) {
            return com.commercetools.api.models.business_unit.BusinessUnit
                    .deepCopy((com.commercetools.api.models.business_unit.BusinessUnit) template);
        }
        if (template instanceof com.commercetools.api.models.cart.Cart) {
            return com.commercetools.api.models.cart.Cart.deepCopy((com.commercetools.api.models.cart.Cart) template);
        }
        BaseResourceImpl instance = new BaseResourceImpl();
        instance.setId(template.getId());
        instance.setVersion(template.getVersion());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setLastModifiedAt(template.getLastModifiedAt());
        return instance;
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withBaseResource(Function<BaseResource, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<BaseResource> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<BaseResource>() {
            @Override
            public String toString() {
                return "TypeReference<BaseResource>";
            }
        };
    }
}
