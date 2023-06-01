package com.commercetools.api.models.common;

import com.commercetools.api.models.associate_role.AssociateRoleResourceIdentifier;
import com.commercetools.api.models.attribute_group.AttributeGroupResourceIdentifier;
import com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifier;
import com.commercetools.api.models.cart.CartResourceIdentifier;
import com.commercetools.api.models.cart_discount.CartDiscountResourceIdentifier;
import com.commercetools.api.models.category.CategoryResourceIdentifier;
import com.commercetools.api.models.channel.ChannelResourceIdentifier;
import com.commercetools.api.models.common.ReferenceTypeId;
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
import com.commercetools.api.models.common.ResourceIdentifier;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ResourceIdentifierBuilder
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class ResourceIdentifierBuilder {

    public com.commercetools.api.models.associate_role.AssociateRoleResourceIdentifierBuilder associateRoleBuilder() {
       return com.commercetools.api.models.associate_role.AssociateRoleResourceIdentifierBuilder.of();
    }
    public com.commercetools.api.models.attribute_group.AttributeGroupResourceIdentifierBuilder attributeGroupBuilder() {
       return com.commercetools.api.models.attribute_group.AttributeGroupResourceIdentifierBuilder.of();
    }
    public com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifierBuilder businessUnitBuilder() {
       return com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifierBuilder.of();
    }
    public com.commercetools.api.models.cart_discount.CartDiscountResourceIdentifierBuilder cartDiscountBuilder() {
       return com.commercetools.api.models.cart_discount.CartDiscountResourceIdentifierBuilder.of();
    }
    public com.commercetools.api.models.cart.CartResourceIdentifierBuilder cartBuilder() {
       return com.commercetools.api.models.cart.CartResourceIdentifierBuilder.of();
    }
    public com.commercetools.api.models.category.CategoryResourceIdentifierBuilder categoryBuilder() {
       return com.commercetools.api.models.category.CategoryResourceIdentifierBuilder.of();
    }
    public com.commercetools.api.models.channel.ChannelResourceIdentifierBuilder channelBuilder() {
       return com.commercetools.api.models.channel.ChannelResourceIdentifierBuilder.of();
    }
    public com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifierBuilder customerGroupBuilder() {
       return com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifierBuilder.of();
    }
    public com.commercetools.api.models.customer.CustomerResourceIdentifierBuilder customerBuilder() {
       return com.commercetools.api.models.customer.CustomerResourceIdentifierBuilder.of();
    }
    public com.commercetools.api.models.discount_code.DiscountCodeResourceIdentifierBuilder discountCodeBuilder() {
       return com.commercetools.api.models.discount_code.DiscountCodeResourceIdentifierBuilder.of();
    }
    public com.commercetools.api.models.inventory.InventoryEntryResourceIdentifierBuilder inventoryEntryBuilder() {
       return com.commercetools.api.models.inventory.InventoryEntryResourceIdentifierBuilder.of();
    }
    public com.commercetools.api.models.order_edit.OrderEditResourceIdentifierBuilder orderEditBuilder() {
       return com.commercetools.api.models.order_edit.OrderEditResourceIdentifierBuilder.of();
    }
    public com.commercetools.api.models.order.OrderResourceIdentifierBuilder orderBuilder() {
       return com.commercetools.api.models.order.OrderResourceIdentifierBuilder.of();
    }
    public com.commercetools.api.models.payment.PaymentResourceIdentifierBuilder paymentBuilder() {
       return com.commercetools.api.models.payment.PaymentResourceIdentifierBuilder.of();
    }
    public com.commercetools.api.models.product_discount.ProductDiscountResourceIdentifierBuilder productDiscountBuilder() {
       return com.commercetools.api.models.product_discount.ProductDiscountResourceIdentifierBuilder.of();
    }
    public com.commercetools.api.models.product.ProductResourceIdentifierBuilder productBuilder() {
       return com.commercetools.api.models.product.ProductResourceIdentifierBuilder.of();
    }
    public com.commercetools.api.models.product_selection.ProductSelectionResourceIdentifierBuilder productSelectionBuilder() {
       return com.commercetools.api.models.product_selection.ProductSelectionResourceIdentifierBuilder.of();
    }
    public com.commercetools.api.models.product_type.ProductTypeResourceIdentifierBuilder productTypeBuilder() {
       return com.commercetools.api.models.product_type.ProductTypeResourceIdentifierBuilder.of();
    }
    public com.commercetools.api.models.quote_request.QuoteRequestResourceIdentifierBuilder quoteRequestBuilder() {
       return com.commercetools.api.models.quote_request.QuoteRequestResourceIdentifierBuilder.of();
    }
    public com.commercetools.api.models.quote.QuoteResourceIdentifierBuilder quoteBuilder() {
       return com.commercetools.api.models.quote.QuoteResourceIdentifierBuilder.of();
    }
    public com.commercetools.api.models.review.ReviewResourceIdentifierBuilder reviewBuilder() {
       return com.commercetools.api.models.review.ReviewResourceIdentifierBuilder.of();
    }
    public com.commercetools.api.models.shipping_method.ShippingMethodResourceIdentifierBuilder shippingMethodBuilder() {
       return com.commercetools.api.models.shipping_method.ShippingMethodResourceIdentifierBuilder.of();
    }
    public com.commercetools.api.models.shopping_list.ShoppingListResourceIdentifierBuilder shoppingListBuilder() {
       return com.commercetools.api.models.shopping_list.ShoppingListResourceIdentifierBuilder.of();
    }
    public com.commercetools.api.models.staged_quote.StagedQuoteResourceIdentifierBuilder stagedQuoteBuilder() {
       return com.commercetools.api.models.staged_quote.StagedQuoteResourceIdentifierBuilder.of();
    }
    public com.commercetools.api.models.standalone_price.StandalonePriceResourceIdentifierBuilder standalonePriceBuilder() {
       return com.commercetools.api.models.standalone_price.StandalonePriceResourceIdentifierBuilder.of();
    }
    public com.commercetools.api.models.state.StateResourceIdentifierBuilder stateBuilder() {
       return com.commercetools.api.models.state.StateResourceIdentifierBuilder.of();
    }
    public com.commercetools.api.models.store.StoreResourceIdentifierBuilder storeBuilder() {
       return com.commercetools.api.models.store.StoreResourceIdentifierBuilder.of();
    }
    public com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifierBuilder taxCategoryBuilder() {
       return com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifierBuilder.of();
    }
    public com.commercetools.api.models.type.TypeResourceIdentifierBuilder typeBuilder() {
       return com.commercetools.api.models.type.TypeResourceIdentifierBuilder.of();
    }
    public com.commercetools.api.models.zone.ZoneResourceIdentifierBuilder zoneBuilder() {
       return com.commercetools.api.models.zone.ZoneResourceIdentifierBuilder.of();
    }

    /**
     * factory method for an instance of ResourceIdentifierBuilder
     * @return builder 
     */
    public static ResourceIdentifierBuilder of() {
        return new ResourceIdentifierBuilder();
    }

}
