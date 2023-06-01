package com.commercetools.api.models.common;

import com.commercetools.api.models.associate_role.AssociateRoleReference;
import com.commercetools.api.models.attribute_group.AttributeGroupReference;
import com.commercetools.api.models.business_unit.BusinessUnitReference;
import com.commercetools.api.models.cart.CartReference;
import com.commercetools.api.models.cart.DirectDiscountReference;
import com.commercetools.api.models.cart_discount.CartDiscountReference;
import com.commercetools.api.models.category.CategoryReference;
import com.commercetools.api.models.channel.ChannelReference;
import com.commercetools.api.models.common.ReferenceTypeId;
import com.commercetools.api.models.custom_object.CustomObjectReference;
import com.commercetools.api.models.customer.CustomerReference;
import com.commercetools.api.models.customer_group.CustomerGroupReference;
import com.commercetools.api.models.discount_code.DiscountCodeReference;
import com.commercetools.api.models.inventory.InventoryEntryReference;
import com.commercetools.api.models.order.OrderReference;
import com.commercetools.api.models.order_edit.OrderEditReference;
import com.commercetools.api.models.payment.PaymentReference;
import com.commercetools.api.models.product.ProductReference;
import com.commercetools.api.models.product_discount.ProductDiscountReference;
import com.commercetools.api.models.product_selection.ProductSelectionReference;
import com.commercetools.api.models.product_type.ProductTypeReference;
import com.commercetools.api.models.quote.QuoteReference;
import com.commercetools.api.models.quote_request.QuoteRequestReference;
import com.commercetools.api.models.review.ReviewReference;
import com.commercetools.api.models.shipping_method.ShippingMethodReference;
import com.commercetools.api.models.shopping_list.ShoppingListReference;
import com.commercetools.api.models.staged_quote.StagedQuoteReference;
import com.commercetools.api.models.standalone_price.StandalonePriceReference;
import com.commercetools.api.models.state.StateReference;
import com.commercetools.api.models.store.StoreReference;
import com.commercetools.api.models.tax_category.TaxCategoryReference;
import com.commercetools.api.models.type.TypeReference;
import com.commercetools.api.models.zone.ZoneReference;
import com.commercetools.api.models.common.Reference;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ReferenceBuilder
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class ReferenceBuilder {

    public com.commercetools.api.models.associate_role.AssociateRoleReferenceBuilder associateRoleBuilder() {
       return com.commercetools.api.models.associate_role.AssociateRoleReferenceBuilder.of();
    }
    public com.commercetools.api.models.attribute_group.AttributeGroupReferenceBuilder attributeGroupBuilder() {
       return com.commercetools.api.models.attribute_group.AttributeGroupReferenceBuilder.of();
    }
    public com.commercetools.api.models.business_unit.BusinessUnitReferenceBuilder businessUnitBuilder() {
       return com.commercetools.api.models.business_unit.BusinessUnitReferenceBuilder.of();
    }
    public com.commercetools.api.models.cart_discount.CartDiscountReferenceBuilder cartDiscountBuilder() {
       return com.commercetools.api.models.cart_discount.CartDiscountReferenceBuilder.of();
    }
    public com.commercetools.api.models.cart.CartReferenceBuilder cartBuilder() {
       return com.commercetools.api.models.cart.CartReferenceBuilder.of();
    }
    public com.commercetools.api.models.category.CategoryReferenceBuilder categoryBuilder() {
       return com.commercetools.api.models.category.CategoryReferenceBuilder.of();
    }
    public com.commercetools.api.models.channel.ChannelReferenceBuilder channelBuilder() {
       return com.commercetools.api.models.channel.ChannelReferenceBuilder.of();
    }
    public com.commercetools.api.models.custom_object.CustomObjectReferenceBuilder keyValueDocumentBuilder() {
       return com.commercetools.api.models.custom_object.CustomObjectReferenceBuilder.of();
    }
    public com.commercetools.api.models.customer_group.CustomerGroupReferenceBuilder customerGroupBuilder() {
       return com.commercetools.api.models.customer_group.CustomerGroupReferenceBuilder.of();
    }
    public com.commercetools.api.models.customer.CustomerReferenceBuilder customerBuilder() {
       return com.commercetools.api.models.customer.CustomerReferenceBuilder.of();
    }
    public com.commercetools.api.models.cart.DirectDiscountReferenceBuilder directDiscountBuilder() {
       return com.commercetools.api.models.cart.DirectDiscountReferenceBuilder.of();
    }
    public com.commercetools.api.models.discount_code.DiscountCodeReferenceBuilder discountCodeBuilder() {
       return com.commercetools.api.models.discount_code.DiscountCodeReferenceBuilder.of();
    }
    public com.commercetools.api.models.inventory.InventoryEntryReferenceBuilder inventoryEntryBuilder() {
       return com.commercetools.api.models.inventory.InventoryEntryReferenceBuilder.of();
    }
    public com.commercetools.api.models.order_edit.OrderEditReferenceBuilder orderEditBuilder() {
       return com.commercetools.api.models.order_edit.OrderEditReferenceBuilder.of();
    }
    public com.commercetools.api.models.order.OrderReferenceBuilder orderBuilder() {
       return com.commercetools.api.models.order.OrderReferenceBuilder.of();
    }
    public com.commercetools.api.models.payment.PaymentReferenceBuilder paymentBuilder() {
       return com.commercetools.api.models.payment.PaymentReferenceBuilder.of();
    }
    public com.commercetools.api.models.product_discount.ProductDiscountReferenceBuilder productDiscountBuilder() {
       return com.commercetools.api.models.product_discount.ProductDiscountReferenceBuilder.of();
    }
    public com.commercetools.api.models.product.ProductReferenceBuilder productBuilder() {
       return com.commercetools.api.models.product.ProductReferenceBuilder.of();
    }
    public com.commercetools.api.models.product_selection.ProductSelectionReferenceBuilder productSelectionBuilder() {
       return com.commercetools.api.models.product_selection.ProductSelectionReferenceBuilder.of();
    }
    public com.commercetools.api.models.product_type.ProductTypeReferenceBuilder productTypeBuilder() {
       return com.commercetools.api.models.product_type.ProductTypeReferenceBuilder.of();
    }
    public com.commercetools.api.models.quote.QuoteReferenceBuilder quoteBuilder() {
       return com.commercetools.api.models.quote.QuoteReferenceBuilder.of();
    }
    public com.commercetools.api.models.quote_request.QuoteRequestReferenceBuilder quoteRequestBuilder() {
       return com.commercetools.api.models.quote_request.QuoteRequestReferenceBuilder.of();
    }
    public com.commercetools.api.models.review.ReviewReferenceBuilder reviewBuilder() {
       return com.commercetools.api.models.review.ReviewReferenceBuilder.of();
    }
    public com.commercetools.api.models.shipping_method.ShippingMethodReferenceBuilder shippingMethodBuilder() {
       return com.commercetools.api.models.shipping_method.ShippingMethodReferenceBuilder.of();
    }
    public com.commercetools.api.models.shopping_list.ShoppingListReferenceBuilder shoppingListBuilder() {
       return com.commercetools.api.models.shopping_list.ShoppingListReferenceBuilder.of();
    }
    public com.commercetools.api.models.staged_quote.StagedQuoteReferenceBuilder stagedQuoteBuilder() {
       return com.commercetools.api.models.staged_quote.StagedQuoteReferenceBuilder.of();
    }
    public com.commercetools.api.models.standalone_price.StandalonePriceReferenceBuilder standalonePriceBuilder() {
       return com.commercetools.api.models.standalone_price.StandalonePriceReferenceBuilder.of();
    }
    public com.commercetools.api.models.state.StateReferenceBuilder stateBuilder() {
       return com.commercetools.api.models.state.StateReferenceBuilder.of();
    }
    public com.commercetools.api.models.store.StoreReferenceBuilder storeBuilder() {
       return com.commercetools.api.models.store.StoreReferenceBuilder.of();
    }
    public com.commercetools.api.models.tax_category.TaxCategoryReferenceBuilder taxCategoryBuilder() {
       return com.commercetools.api.models.tax_category.TaxCategoryReferenceBuilder.of();
    }
    public com.commercetools.api.models.type.TypeReferenceBuilder typeBuilder() {
       return com.commercetools.api.models.type.TypeReferenceBuilder.of();
    }
    public com.commercetools.api.models.zone.ZoneReferenceBuilder zoneBuilder() {
       return com.commercetools.api.models.zone.ZoneReferenceBuilder.of();
    }

    /**
     * factory method for an instance of ReferenceBuilder
     * @return builder 
     */
    public static ReferenceBuilder of() {
        return new ReferenceBuilder();
    }

}
