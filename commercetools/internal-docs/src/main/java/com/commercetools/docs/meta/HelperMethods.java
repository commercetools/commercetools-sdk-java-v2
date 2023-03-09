
package com.commercetools.docs.meta;

import java.util.Collection;
import java.util.Locale;

import javax.money.MonetaryAmount;

import com.commercetools.api.models.Identifiable;
import com.commercetools.api.models.Referencable;
import com.commercetools.api.models.cart.TaxedItemPrice;
import com.commercetools.api.models.common.*;
import com.commercetools.api.models.product.ByIdVariantIdentifier;
import com.commercetools.api.models.tax_category.TaxRate;
import com.fasterxml.jackson.databind.JsonNode;

/**
 * <h2 id=using>Helper Methods</h2>
 *
 * <p>These helper methods simplify the use of our SDK.</p>
 *
 *
 *
 * <h3>Business Units</h3>
 *
 * <p>{@link com.commercetools.api.models.business_unit.BusinessUnitSetCustomFieldAction#ofUnset(String)}</p>
 * {@include.example example.HelperMethodsTest#businessUnitSetCustomFieldUnset()}
 * <p>{@link com.commercetools.api.models.business_unit.BusinessUnitSetAddressCustomFieldAction#ofUnset(String)}</p>
 * {@include.example example.HelperMethodsTest#businessUnitSetAddressCustomFieldUnset()}
 *
 * <h3>Carts</h3>
 *
 * To be added
 * <p>{com.commercetools.api.models.cart.InventoryMode##defaultValue()}</p>
 * {@include.example example.HelperMethodsTest#cartInventoryModeDefaultValue()}
 * <p>{@link com.commercetools.api.models.cart.Cart#toResourceIdentifier()}</p>
 * {@include.example example.HelperMethodsTest#cartToResourceIdentifier()}
 * <p>{@link com.commercetools.api.models.cart.Cart#toReference()}</p>
 * {@include.example example.HelperMethodsTest#cartToReference()}
 * <p>{@link com.commercetools.api.models.cart.CartSetLineItemCustomFieldAction#ofUnset(String, String)}</p>
 * {@include.example example.HelperMethodsTest#cartSetLineItemCustomFieldUnset()}
 * <p>{@link com.commercetools.api.models.cart.CartSetCustomFieldAction#ofUnset(String)}</p>
 * {@include.example example.HelperMethodsTest#cartSetCustomFieldUnset()}
 * <p>{@link com.commercetools.api.models.cart.CartSetBillingAddressCustomFieldAction#ofUnset(String)}</p>
 * {@include.example example.HelperMethodsTest#cartSetBillingAddressCustomFieldAUnset()}
 * <p>{@link com.commercetools.api.models.cart.CartSetCustomLineItemCustomFieldAction#ofUnset(String, String)}</p>
 * {@include.example example.HelperMethodsTest#cartSetCustomLineItemCustomFieldUnset()}
 * <p>{@link com.commercetools.api.models.cart.CartSetDeleteDaysAfterLastModificationAction#ofUnset()}</p>
 * {@include.example example.HelperMethodsTest#cartSetDeleteDaysAfterLastModificationUnset()}
 * <p>{@link com.commercetools.api.models.cart.CartSetDeliveryAddressCustomFieldAction#ofUnset(String, String)}</p>
 * {@include.example example.HelperMethodsTest#cartSetDeliveryAddressCustomFieldUnset()}
 * <p>{@link com.commercetools.api.models.cart.CartSetItemShippingAddressCustomFieldAction#ofUnset(String, String)}</p>
 * {@include.example example.HelperMethodsTest#cartSetItemShippingAddressCustomFieldUnset()}
 * <p>{@link com.commercetools.api.models.cart.CartSetShippingAddressCustomFieldAction#ofUnset(String)}</p>
 * {@include.example example.HelperMethodsTest#cartSetShippingAddressCustomFieldUnset()}
 * <p>{@link com.commercetools.api.models.cart.CartSetShippingRateInputAction#ofUnset()}</p>
 * {@include.example example.HelperMethodsTest#cartSetShippingRateInputUnset()}
 * <p>{@link com.commercetools.api.models.cart.CartSetKeyAction#ofUnset()}</p>
 * {@include.example example.HelperMethodsTest#cartSetKeyUnset()}
 *
 * <h3>Cart Discounts</h3>
 *
 * <p>{@link com.commercetools.api.models.cart_discount.CartDiscount#toResourceIdentifier()}</p>
 * {@include.example example.HelperMethodsTest#cartDiscountToResourceIdentifier()}
 * <p>{@link com.commercetools.api.models.cart_discount.CartDiscount#toReference()}</p>
 * {@include.example example.HelperMethodsTest#cartDiscountToReference()}
 * <p>{@link com.commercetools.api.models.cart_discount.CartDiscountSetCustomFieldAction#ofUnset(String)}</p>
 * {@include.example example.HelperMethodsTest#cartDiscountSetCustomFieldUnset()}
 * <p>{@link com.commercetools.api.models.cart_discount.CartDiscountSetKeyAction#ofUnset()}</p>
 * {@include.example example.HelperMethodsTest#cartDiscountSetKeyUnset()}
 *
 * <h3>Categories</h3>
 *
 * <p>{@link com.commercetools.api.models.category.Category#toResourceIdentifier()}</p>
 * {@include.example example.HelperMethodsTest#categoryToResourceIdentifier()}
 * <p>{@link com.commercetools.api.models.category.Category#toReference()}</p>
 * {@include.example example.HelperMethodsTest#categoryToReference()}
 * <p>{@link com.commercetools.api.models.category.CategorySetKeyAction#ofUnset()}</p>
 * {@include.example example.HelperMethodsTest#categorySetKeyUnset()}
 * <p>{@link com.commercetools.api.models.category.CategorySetCustomFieldAction#ofUnset(String)}</p>
 * {@include.example example.HelperMethodsTest#categorySetCustomFieldUnset()}
 * <p>{@link com.commercetools.api.models.category.CategoryTree#findById(String)}</p>
 * {@include.example example.HelperMethodsTest#categoryTreeFindById()}
 * <p>{@link com.commercetools.api.models.category.CategoryTree#findBySlug(Locale, String)}</p>
 * {@include.example example.HelperMethodsTest#categoryTreeFindBySlug()}
 * <p>{@link com.commercetools.api.models.category.CategoryTree#findByKey(String)}</p>
 * {@include.example example.HelperMethodsTest#categoryTreeFindByKey()}
 * <p>{@link com.commercetools.api.models.category.CategoryTree#findByExternalId(String)}</p>
 * {@include.example example.HelperMethodsTest#categoryTreeFindByExternalId()}
 * <p>{@link com.commercetools.api.models.category.CategoryTree#getRoots()}</p>
 * {@include.example example.HelperMethodsTest#categoryTreeGetRoots()}
 * <p>{@link com.commercetools.api.models.category.CategoryTree#getAllAsFlatList()}</p>
 * {@include.example example.HelperMethodsTest#categoryTreeGetAllAsFlatList()}
 * <p>{@link com.commercetools.api.models.category.CategoryTree#findChildren(Identifiable)}</p>
 * {@include.example example.HelperMethodsTest#categoryTreeFindChildren()}
 * <p>{@link com.commercetools.api.models.category.CategoryTree#findSiblings(Collection)}</p>
 * {@include.example example.HelperMethodsTest#categoryTreeFindSiblings()}
 * <p>{@link com.commercetools.api.models.category.CategoryTree#getSubtreeRoots()}</p>
 * {@include.example example.HelperMethodsTest#categoryTreeGetSubtreeRoots()}
 * <p>{@link com.commercetools.api.models.category.CategoryTree#getSubtree(Collection)}</p>
 * {@include.example example.HelperMethodsTest#categoryTreeGetSubtree()}
 * <p>{@link com.commercetools.api.models.category.CategoryTree#getRootAncestor(Identifiable)}</p>
 * {@include.example example.HelperMethodsTest#categoryTreeGetRootAncestor()}
 *
 * <h3>Channels</h3>
 *
 * <p>{@link com.commercetools.api.models.channel.Channel#toResourceIdentifier()}</p>
 * {@include.example example.HelperMethodsTest#channelToResourceIdentifier()}
 * <p>{@link com.commercetools.api.models.channel.Channel#toReference()}</p>
 * {@include.example example.HelperMethodsTest#channelToReference()}
 * <p>{@link com.commercetools.api.models.channel.ChannelSetGeoLocationAction}</p>
 * {@include.example example.HelperMethodsTest#channelSetGeoLocationUnset()}
 * <p>{@link com.commercetools.api.models.channel.ChannelSetAddressCustomFieldAction}</p>
 * {@include.example example.HelperMethodsTest#channelSetAddressCustomFieldUnset()}
 * <p>{@link com.commercetools.api.models.channel.ChannelSetCustomFieldAction}</p>
 * {@include.example example.HelperMethodsTest#channelSetCustomFieldUnset()}
 *
 * <h3>Common</h3>
 * <h4>BaseAddress</h4>
 * <p>{@link com.commercetools.api.models.common.BaseAddress#toDraft())}</p>
 * {@include.example example.HelperMethodsTest#toAddressDraft()}
 * <p>{@link com.commercetools.api.models.common.BaseAddress#toDraftBuilder()}</p>
 * {@include.example example.HelperMethodsTest#toAddressDraftBuilder()}
 * <p>{@link com.commercetools.api.models.common.BaseAddress#equalsIgnoreId(BaseAddress)} ())}</p>
 * {@include.example example.HelperMethodsTest#equalsIgnoreId()}
 *
 * <h4>CentPrecisionMoney</h4>
 * <p>{@link com.commercetools.api.models.common.CentPrecisionMoney#toDraft())}</p>
 * {@include.example example.HelperMethodsTest#toCentPrecisionMoneyDraft()}
 *
 * <h4>HighPrecisionMoney</h4>
 * <p>{@link com.commercetools.api.models.common.HighPrecisionMoney#toDraft()}</p>
 * {@include.example example.HelperMethodsTest#toHighPrecisionMoneyDraft()}
 * <p>{@link com.commercetools.api.models.common.HighPrecisionMoney#createMoneyOperator()}</p>
 * {@include.example example.HelperMethodsTest#createMoneyOperator()}
 * <p>{@link com.commercetools.api.models.common.HighPrecisionMoneyDraft#createMoneyOperator()}</p>
 * {@include.example example.HelperMethodsTest#createMoneyOperatorFromDraft()}
 *
 * <h4>TypedMoney</h4>
 * <p>{@link com.commercetools.api.models.common.TypedMoney#createMoneyOperator()}</p>
 * {@include.example example.HelperMethodsTest#createMoneyOperatorTypedMoney()}
 * <p>{@link com.commercetools.api.models.common.TypedMoneyDraft#createMoneyOperator()}</p>
 * {@include.example example.HelperMethodsTest#createMoneyOperatorFromTypedMoneyDraft()}
 *
 * <h4>MoneyUtil</h4>
 * <p>{@link com.commercetools.api.models.common.MoneyUtil#toMonetaryAmount(Money)}</p>
 * {@include.example example.HelperMethodsTest#moneyToMonetaryAmount()}
 * <p>{@link com.commercetools.api.models.common.MoneyUtil#toMonetaryAmount(TypedMoneyDraft)}</p>
 * {@include.example example.HelperMethodsTest#typedMoneyDraftToMonetaryAmount()}
 * <p>{@link com.commercetools.api.models.common.MoneyUtil#toMonetaryAmount(CentPrecisionMoneyDraft)}</p>
 * {@include.example example.HelperMethodsTest#centPrecisionMoneyDraftToMonetaryAmount()}
 * <p>{@link com.commercetools.api.models.common.MoneyUtil#toMonetaryAmount(HighPrecisionMoneyDraft)}</p>
 * {@include.example example.HelperMethodsTest#highPrecisionMoneyDraftToMonetaryAmount()}
 * <p>{@link com.commercetools.api.models.common.MoneyUtil#toMonetaryAmount(TypedMoney)}</p>
 * {@include.example example.HelperMethodsTest#typedMoneyToMonetaryAmount()}
 * <p>{@link com.commercetools.api.models.common.MoneyUtil#toMonetaryAmount(CentPrecisionMoney)}</p>
 * {@include.example example.HelperMethodsTest#centPrecisionMoneyToMonetaryAmount()}
 * <p>{@link com.commercetools.api.models.common.MoneyUtil#toMonetaryAmount(HighPrecisionMoney)}</p>
 * {@include.example example.HelperMethodsTest#highPrecisionMoneyToMonetaryAmount()}
 * <p>{@link com.commercetools.api.models.common.MoneyUtil#zeroAmount(String)}</p>
 * {@include.example example.HelperMethodsTest#zeroAmountString()}
 * <p>{@link com.commercetools.api.models.common.MoneyUtil#of(MonetaryAmount)}</p>
 * {@include.example example.HelperMethodsTest#ofMonetaryAmount()}
 * <p>{@link com.commercetools.api.models.common.MoneyUtil#of(MonetaryAmount, int)} </p>
 * {@include.example example.HelperMethodsTest#ofMonetaryAmountAndInt()}
 * <p>{@link com.commercetools.api.models.common.MoneyUtil#draftOf(MonetaryAmount)} </p>
 * {@include.example example.HelperMethodsTest#draftOfMonetaryAmount()}
 * <p>{@link com.commercetools.api.models.common.MoneyUtil#draftOf(MonetaryAmount, int)} </p>
 * {@include.example example.HelperMethodsTest#draftOfMonetaryAmountAndInt()}
 * <p>{@link com.commercetools.api.models.common.MoneyUtil#amountToCents(MonetaryAmount)}</p>
 * {@include.example example.HelperMethodsTest#amountToCents()}
 * <p>{@link com.commercetools.api.models.common.MoneyUtil#amountToPreciseAmount(MonetaryAmount, int)}</p>
 * {@include.example example.HelperMethodsTest#amountToPreciseAmount()}
 * <p>{@link com.commercetools.api.models.common.MoneyUtil#calculateAppliedTaxes(TaxedItemPrice)}</p>
 * {@include.example example.HelperMethodsTest#calculatesAppliedTaxes()}
 * <p>{@link com.commercetools.api.models.common.MoneyUtil#calculateGrossPrice(MonetaryAmount, TaxRate)}</p>
 * {@include.example example.HelperMethodsTest#calculateGrossPrice()}
 * <p>{@link com.commercetools.api.models.common.MoneyUtil#calculateNetPrice(MonetaryAmount, TaxRate)} MonetaryAmount calculateNetPrice(final MonetaryAmount amount, final TaxRate taxRate)</p>
 * {@include.example example.HelperMethodsTest#calculateNetPrice()}
 * <p>{@link com.commercetools.api.models.common.MoneyUtil#convertNetToGrossPrice(MonetaryAmount, double)} MonetaryAmount convertNetToGrossPrice(final MonetaryAmount netAmount, final double taxRate)</p>
 * {@include.example example.HelperMethodsTest#convertNetToGross()}
 * <p>{@link com.commercetools.api.models.common.MoneyUtil#convertGrossToNetPrice(MonetaryAmount, double)} MonetaryAmount convertGrossToNetPrice(final MonetaryAmount grossAmount, final double taxRate)</p>
 * {@include.example example.HelperMethodsTest#convertGrossToNetPrice()}
 *
 * <h3>Customers</h3>
 *
 * <p>{@link com.commercetools.api.models.customer.Customer#toResourceIdentifier()}</p>
 * {@include.example example.HelperMethodsTest#customerToResourceIdentifier()}
 * <p>{@link com.commercetools.api.models.customer.Customer#toReference()}</p>
 * {@include.example example.HelperMethodsTest#customerToReference()}
 * <p>{@link com.commercetools.api.models.customer.CustomerDraft#builder()}</p>
 * {@include.example example.HelperMethodsTest#customerDraftBuilderFromCustomer()}
 * <p>{@link com.commercetools.api.models.customer.CustomerSetAddressCustomFieldAction#ofUnset(String)}</p>
 * {@include.example example.HelperMethodsTest#customerSetAddressCustomFieldUnset()}
 * <p>{@link com.commercetools.api.models.customer.CustomerSetCustomFieldAction#ofUnset(String)}</p>
 * {@include.example example.HelperMethodsTest#customerSetCustomFieldUnset()}
 * <p>{@link com.commercetools.api.models.customer.CustomerSetKeyAction#ofUnset()}</p>
 * {@include.example example.HelperMethodsTest#customerSetKeyUnset()}
 *
 * <h3>Customer Groups</h3>
 *
 * <p>{@link com.commercetools.api.models.customer_group.CustomerGroup#toResourceIdentifier()}</p>
 * {@include.example example.HelperMethodsTest#customerGroupToResourceIdentifier()}
 * <p>{@link com.commercetools.api.models.customer_group.CustomerGroup#toReference()}</p>
 * {@include.example example.HelperMethodsTest#customerGroupToReference()}
 * <p>{@link com.commercetools.api.models.customer_group.CustomerGroupSetCustomFieldAction#ofUnset(String)}</p>
 * {@include.example example.HelperMethodsTest#customerGroupSetCustomFieldUnset()}
 * <p>{@link com.commercetools.api.models.customer_group.CustomerGroupSetKeyAction#ofUnset()}</p>
 * {@include.example example.HelperMethodsTest#customerGroupSetKeyUnset()}
 *
 * <h3>Discount Codes</h3>
 *
 * <p>{@link com.commercetools.api.models.discount_code.DiscountCode#toResourceIdentifier()}</p>
 * {@include.example example.HelperMethodsTest#discountCodeResourceIdentifier()}
 * <p>{@link com.commercetools.api.models.discount_code.DiscountCode#toReference()}</p>
 * {@include.example example.HelperMethodsTest#discountCodeToReference()}
 * <p>{@link com.commercetools.api.models.discount_code.DiscountCodeSetCustomFieldAction}</p>
 * {@include.example example.HelperMethodsTest#discountCodeSetCustomFieldUnset()}
 *
 * <h3>Extension</h3>
 *
 * <p>{@link com.commercetools.api.models.extension.ExtensionSetKeyAction#ofUnset()}</p>
 * {@include.example example.HelperMethodsTest#extensionSetKeyUnset()}
 *
 * <h3>Inventory</h3>
 *
 * <p>{@link com.commercetools.api.models.inventory.InventoryEntry#toResourceIdentifier()}</p>
 * {@include.example example.HelperMethodsTest#inventoryResourceIdentifier()}
 * <p>{@link com.commercetools.api.models.inventory.InventoryEntry#toReference()}</p>
 * {@include.example example.HelperMethodsTest#inventoryToReference()}
 * <p>{@link com.commercetools.api.models.inventory.InventoryEntrySetCustomFieldAction#ofUnset(String)}</p>
 * {@include.example example.HelperMethodsTest#inventorySetCustomFieldUnset()}
 * <p>{@link com.commercetools.api.models.inventory.InventoryEntrySetKeyAction#ofUnset()}</p>
 * {@include.example example.HelperMethodsTest#inventorySetKeyUnset()}
 *
 * <h3>Order Edits</h3>
 *
 * <p>{@link com.commercetools.api.models.order_edit.OrderEdit#toResourceIdentifier()}</p>
 * {@include.example example.HelperMethodsTest#orderEditResourceIdentifier()}
 * <p>{@link com.commercetools.api.models.order_edit.OrderEdit#toReference()}</p>
 * {@include.example example.HelperMethodsTest#orderEditToReference()}
 * <p>{@link com.commercetools.api.models.order_edit.OrderEditSetKeyAction#ofUnset()}</p>
 * {@include.example example.HelperMethodsTest#orderEditSetKeyUnset()}
 * <p>{@link com.commercetools.api.models.order_edit.OrderEditSetCustomFieldAction#ofUnset(String)}</p>
 * {@include.example example.HelperMethodsTest#orderEditSetCustomFieldUnset()}
 * <p>{@link com.commercetools.api.models.order_edit.StagedOrderSetShippingRateInputAction#ofUnset()}</p>
 * {@include.example example.HelperMethodsTest#orderEditStagedOrderSetShippingRateInputUnset()}
 * <p>{@link com.commercetools.api.models.order_edit.StagedOrderSetDeliveryAddressAction#ofUnset()}</p>
 * {@include.example example.HelperMethodsTest#orderEditStagedOrderSetDeliveryAddressInputUnset()}
 * <p>{@link com.commercetools.api.models.order_edit.StagedOrderSetLineItemCustomFieldAction#ofUnset(String, String)}</p>
 * {@include.example example.HelperMethodsTest#orderEditStagedOrderSetLineItemCustomFieldUnset()}
 * <p>{@link com.commercetools.api.models.order_edit.StagedOrderSetCustomLineItemCustomFieldAction#ofUnset(String, String)}</p>
 * {@include.example example.HelperMethodsTest#orderEditStagedOrderSetCustomLineItemCustomFieldUnset()}
 * <p>{@link com.commercetools.api.models.order_edit.StagedOrderSetDeliveryAddressCustomFieldAction#ofUnset(String, String)}</p>
 * {@include.example example.HelperMethodsTest#orderEditStagedOrderSetDeliveryAddressCustomFieldUnset()}
 * <p>{@link com.commercetools.api.models.order_edit.StagedOrderSetItemShippingAddressCustomFieldAction#ofUnset(String, String)}</p>
 * {@include.example example.HelperMethodsTest#orderEditStagedOrderSetItemShippingAddressCustomFieldUnset()}
 * <p>{@link com.commercetools.api.models.order_edit.StagedOrderSetShippingAddressCustomFieldAction#ofUnset(String)}</p>
 * {@include.example example.HelperMethodsTest#orderEditStagedOrderSetShippingAddressCustomFieldUnset()}
 * <p>{@link com.commercetools.api.models.order_edit.StagedOrderSetDeliveryCustomFieldAction#ofUnset(String, String)}</p>
 * {@include.example example.HelperMethodsTest#orderEditStagedOrderSetDeliveryCustomFieldUnset()}
 * <p>{@link com.commercetools.api.models.order_edit.StagedOrderSetParcelCustomFieldAction#ofUnset(String, String)}</p>
 * {@include.example example.HelperMethodsTest#orderEditStagedOrderSetParcelCustomFieldUnset()}
 * <p>{@link com.commercetools.api.models.order_edit.StagedOrderSetReturnItemCustomFieldAction#ofUnset(String, String)}</p>
 * {@include.example example.HelperMethodsTest#orderEditStagedOrderSetReturnItemCustomFieldUnset()}
 * <p>{@link com.commercetools.api.models.order_edit.StagedOrderSetCustomFieldAction#ofUnset(String)}</p>
 * {@include.example example.HelperMethodsTest#orderEditStagedOrderSetCustomFieldUnset()}
 *
 * <h3>Orders</h3>
 *
 * <p>{@link com.commercetools.api.models.order.Order#toResourceIdentifier()}</p>
 * {@include.example example.HelperMethodsTest#orderResourceIdentifier()}
 * <p>{@link com.commercetools.api.models.order.Order#toReference()}</p>
 * {@include.example example.HelperMethodsTest#orderToReference()}
 * <p>{@link com.commercetools.api.models.order.Order#calculateSubTotalPrice()}</p>
 * {@include.example example.HelperMethodsTest#calculateSubTotalPrice()}
 * <p>{@link com.commercetools.api.models.order.Parcel#toDraft()}</p>
 * {@include.example example.HelperMethodsTest#toParcelDraft()}
 * <p>{@link com.commercetools.api.models.order.Parcel#toDraftBuilder()}
 * {@include.example example.HelperMethodsTest#toParcelDraftBuilder()}
 * <p>{@link com.commercetools.api.models.order.Delivery#toDraft()}</p>
 * {@include.example example.HelperMethodsTest#toDeliveryDraft()}
 * <p>{@link com.commercetools.api.models.order.Delivery#toDraftBuilder()}
 * {@include.example example.HelperMethodsTest#toDeliveryDraftBuilder()}
 * <p>{@link com.commercetools.api.models.order.OrderSetDeliveryAddressAction#ofUnset(String)}</p>
 * {@include.example example.HelperMethodsTest#orderSetDeliveryAddressUnset()}
 * <p>{@link com.commercetools.api.models.order.OrderSetLineItemCustomFieldAction#ofUnset(String, String)}</p>
 * {@include.example example.HelperMethodsTest#orderSetLineItemCustomFieldUnset()}
 * <p>{@link com.commercetools.api.models.order.OrderSetCustomFieldAction#ofUnset(String)}</p>
 * {@include.example example.HelperMethodsTest#orderSetCustomFieldUnset()}
 * <p>{@link com.commercetools.api.models.order.OrderSetBillingAddressCustomFieldAction#ofUnset(String)}</p>
 * {@include.example example.HelperMethodsTest#orderSetBillingAddressCustomFieldUnset()}
 * <p>{@link com.commercetools.api.models.order.OrderSetCustomLineItemCustomFieldAction#ofUnset(String, String)}</p>
 * {@include.example example.HelperMethodsTest#orderSetCustomLineItemCustomFieldUnset()}
 * <p>{@link com.commercetools.api.models.order.OrderSetDeliveryAddressCustomFieldAction#ofUnset(String, String)}</p>
 * {@include.example example.HelperMethodsTest#orderSetDeliveryAddressCustomFieldUnset()}
 * <p>{@link com.commercetools.api.models.order.OrderSetItemShippingAddressCustomFieldAction#ofUnset(String, String)}</p>
 * {@include.example example.HelperMethodsTest#orderSetItemShippingAddressCustomFieldUnset()}
 * <p>{@link com.commercetools.api.models.order.OrderSetShippingAddressCustomFieldAction#ofUnset(String)}</p>
 * {@include.example example.HelperMethodsTest#orderSetShippingAddressCustomFieldUnset()}
 * <p>{@link com.commercetools.api.models.order.OrderSetParcelCustomFieldAction#ofUnset(String, String)}</p>
 * {@include.example example.HelperMethodsTest#orderSetParcelCustomFieldUnset()}
 * <p>{@link com.commercetools.api.models.order.OrderSetReturnItemCustomFieldAction#ofUnset(String, String)}</p>
 * {@include.example example.HelperMethodsTest#orderSetReturnItemCustomFieldUnset()}
 *
 * <p>{@link com.commercetools.api.client.ByProjectKeyOrdersGet#byCustomerId(String)}</p>
 * {@include.example example.HelperMethodsTest#getOrderByCustomerId()}
 * <p>{@link com.commercetools.api.client.ByProjectKeyOrdersGet#byCustomerEmail(String)}
 *
 * <h3>Payments</h3>
 *
 * <p>{@link com.commercetools.api.models.payment.Payment#toResourceIdentifier()}</p>
 * {@include.example example.HelperMethodsTest#paymentResourceIdentifier()}
 * <p>{@link com.commercetools.api.models.payment.Payment#toReference()}</p>
 * {@include.example example.HelperMethodsTest#paymentToReference()}
 * <p>{@link com.commercetools.api.models.payment.PaymentSetTransactionCustomFieldAction#ofUnset(String, String)}</p>
 * {@include.example example.HelperMethodsTest#paymentSetTransactionCustomFieldUnset()}
 * <p>{@link com.commercetools.api.models.payment.PaymentSetCustomFieldAction#ofUnset(String)}</p>
 * {@include.example example.HelperMethodsTest#paymentSetCustomFieldUnset()}
 *
 * <h3>Products</h3>
 *
 * <p>{@link com.commercetools.api.models.product.Product#toResourceIdentifier()}</p>
 * {@include.example example.HelperMethodsTest#productResourceIdentifier()}
 * <p>{@link com.commercetools.api.models.product.Product#toReference()}</p>
 * {@include.example example.HelperMethodsTest#productToReference()}
 * <p>{@link com.commercetools.api.models.product.ProductDataLike#findVariantBySku(String)}</p>
 * {@include.example example.HelperMethodsTest#productFindVariantBySku()}
 * <p>{@link com.commercetools.api.models.product.ProductDataLike#getVariantOrMaster(long)}</p>
 * {@include.example example.HelperMethodsTest#productGetVariantOrMaster()}
 * <p>{@link com.commercetools.api.models.product.ProductDataLike#getVariant(long)}</p>
 * {@include.example example.HelperMethodsTest#productGetVariant()}
 * <p>{@link com.commercetools.api.models.product.ByIdVariantIdentifier#of(Referencable, Long)}</p>
 * {@include.example example.HelperMethodsTest#productByIdVariantIdentifierOfWithReferencable()}
 * <p>{@link com.commercetools.api.models.product.ByIdVariantIdentifier#of(String, Long)}</p>
 * {@include.example example.HelperMethodsTest#productByIdVariantIdentifierOf()}
 * <p>{@link com.commercetools.api.models.product.BySkuVariantIdentifier#of(String)}</p>
 * {@include.example example.HelperMethodsTest#productBySkuVariantIdentifierOf()}
 * <p>{@link com.commercetools.api.models.product.ProductProjection#findVariant(ByIdVariantIdentifier)}</p>
 * {@include.example example.HelperMethodsTest#productProjectionFindVariant()}
 * <p>{@link com.commercetools.api.models.product.ProductProjection#findMatchingVariants()}</p>
 * {@include.example example.HelperMethodsTest#productProjectionFindMatchingVariants()}
 * <p>{@link com.commercetools.api.models.product.ProductProjection#findFirstMatchingVariant()}</p>
 * {@include.example example.HelperMethodsTest#productProjectionFindFirstMatchingVariants()}
 *
 * <p>{@link com.commercetools.api.models.product.ProductSetKeyAction#ofUnset()} ofUnset()</p>
 * {@include.example example.HelperMethodsTest#productSetKeyUnset()}
 * <p>{@link com.commercetools.api.models.product.ProductSetImageLabelAction#ofUnset(Long, String, Boolean)}</p>
 * {@include.example example.HelperMethodsTest#productToReference()}
 * <p>{@link com.commercetools.api.models.product.ProductSetImageLabelAction#ofUnsetStaged(Long, String)}</p>
 * {@include.example example.HelperMethodsTest#productToReference()}
 * <p>{@link com.commercetools.api.models.product.ProductSetProductPriceCustomFieldAction#ofUnset(String, String)} ofUnset(final String name, final String priceId)</p>
 * {@include.example example.HelperMethodsTest#productToReference()}
 * <p>{@link com.commercetools.api.models.product.ProductSetProductPriceCustomFieldAction#ofUnsetStaged(String, String, Boolean)} ofUnsetStaged(final String name, final String priceId, final Boolean staged)</p>
 * {@include.example example.HelperMethodsTest#productToReference()}
 * <p>{@link com.commercetools.api.models.product.ProductSetTaxCategoryAction#ofUnset()} ofUnset()</p>
 * {@include.example example.HelperMethodsTest#productToReference()}
 * <p>{@link com.commercetools.api.models.product.ProductSetAttributeAction#ofVariantId(Long, String, JsonNode, Boolean)} ofVariantId(final Long variantId, final String name, final com.fasterxml.jackson.databind.JsonNode value, final Boolean staged)</p>
 * {@include.example example.HelperMethodsTest#productToReference()}
 * <p>{@link com.commercetools.api.models.product.ProductSetAttributeAction#ofSku(String, String, JsonNode, Boolean)} ofSku(final String sku, final String name, final com.fasterxml.jackson.databind.JsonNode value, final Boolean staged)</p>
 * {@include.example example.HelperMethodsTest#productToReference()}
 * <p>{@link com.commercetools.api.models.product.ProductSetAttributeAction#ofUnsetAttribute(Long, String)} ofUnsetAttribute(final Long variantId, final String name)</p>
 * {@include.example example.HelperMethodsTest#productToReference()}
 * <p>{@link com.commercetools.api.models.product.ProductSetAttributeAction#ofUnsetAttribute(Long, String, Boolean)} ofUnsetAttribute(final Long variantId, final String name, final Boolean staged)</p>
 * {@include.example example.HelperMethodsTest#productToReference()}
 * <p>{@link com.commercetools.api.models.product.ProductSetAttributeAction#ofUnsetAttributeForVariantId(Long, String)} ofUnsetAttributeForVariantId(final Long variantId, final String name)</p>
 * {@include.example example.HelperMethodsTest#productToReference()}
 * <p>{@link com.commercetools.api.models.product.ProductSetAttributeAction#ofUnsetAttributeForSku(String, String)} ofUnsetAttributeForSku(final String sku, final String name)</p>
 * {@include.example example.HelperMethodsTest#productToReference()}
 * <p>{@link com.commercetools.api.models.product.ProductSetAttributeAction#ofUnsetAttributeForSku(String, String, Boolean)} ofUnsetAttributeForSku(final String sku, final String name, final Boolean staged)</p>
 * {@include.example example.HelperMethodsTest#productToReference()}
 * <p>{@link com.commercetools.api.models.product.ProductSetAttributeInAllVariantsAction#ofUnsetAttribute(String)} ofUnsetAttribute(final String name)</p>
 * {@include.example example.HelperMethodsTest#productToReference()}
 * <p>{@link com.commercetools.api.models.product.ProductSetAttributeInAllVariantsAction#ofUnsetAttribute(String, Boolean)} ofUnsetAttribute(final String name, final Boolean staged)</p>
 * {@include.example example.HelperMethodsTest#productToReference()}
 *
 * <h3>Product Discounts</h3>
 *
 * <p>{@link com.commercetools.api.models.product_discount.ProductDiscountSetKeyAction#ofUnset()} ofUnset()</p>
 *
 * <h3>Product Types</h3>
 *
 * <p>{@link com.commercetools.api.models.product_type.AttributeDefinitionContainer#getAttribute(String)} AttributeDefinition getAttribute(final String attributeName)</p>
 * <p>{@link com.commercetools.api.models.product_type.AttributeDefinitionContainer#findAttribute(String)} Optional<AttributeDefinition> findAttribute(final String attributeName)</p>
 * <p>{@link com.commercetools.api.models.product_type.ProductTypeSetKeyAction#ofUnset()} ofUnset()</p>
 *
 * <h3>Projects</h3>
 *
 * <p>{@link com.commercetools.api.models.project.ProjectSetShippingRateInputTypeAction#ofUnset()} ofUnset()</p>
 *
 * <h3>Quotes</h3>
 *
 * <p>{@link com.commercetools.api.models.quote.QuoteSetCustomFieldAction#ofUnset(String)}</p>
 *
 * <h3>Quotes Requests</h3>
 *
 * <p>{@link com.commercetools.api.models.quote_request.QuoteRequestSetCustomFieldAction#ofUnset(String)}</p>
 *
 * <h3>Reviews</h3>
 *
 * <p>{@link com.commercetools.api.models.review.ReviewSetCustomFieldAction#ofUnset(String)}</p>
 * <p>{@link com.commercetools.api.models.review.ReviewSetCustomerAction#ofUnset()} ofUnset()</p>
 * <p>{@link com.commercetools.api.models.review.ReviewSetKeyAction#ofUnset()} ofUnset()</p>
 *
 * <h3>Shipping Methods</h3>
 *
 * <p>{@link com.commercetools.api.models.shipping_method.ShippingMethodSetCustomFieldAction#ofUnset(String)}</p>
 * <p>{@link com.commercetools.api.models.shipping_method.ShippingMethodSetKeyAction#ofUnset()} ofUnset()</p>
 *
 * <h3>Shopping Lists</h3>
 *
 * <p>{@link com.commercetools.api.models.shopping_list.ShoppingListSetCustomerAction#ofUnset()} ofUnset()</p>
 * <p>{@link com.commercetools.api.models.shopping_list.ShoppingListSetCustomFieldAction#ofUnset(String)}</p>
 * <p>{@link com.commercetools.api.models.shopping_list.ShoppingListSetDeleteDaysAfterLastModificationAction#ofUnset()} ofUnset()</p>
 * <p>{@link com.commercetools.api.models.shopping_list.ShoppingListSetLineItemCustomFieldAction#ofUnset(String, String)} ofUnset(final String name, final String lineItemId)</p>
 * <p>{@link com.commercetools.api.models.shopping_list.ShoppingListSetKeyAction#ofUnset()} ofUnset()</p>
 * <p>{@link com.commercetools.api.models.shopping_list.ShoppingListSetTextLineItemCustomFieldAction#ofUnset(String, String)} ofUnset(final String name, final String textLineItemId)</p>
 * <p>{@link com.commercetools.api.models.shopping_list.ShoppingListSetSlugAction#ofUnset()} ofUnset()</p>
 *
 * <h3>Staged Quotes</h3>
 *
 * <p>{@link com.commercetools.api.models.staged_quote.StagedQuoteSetCustomFieldAction#ofUnset(String)}</p>
 *
 * <h3>Standalone Prices</h3>
 *
 * <p>{@link com.commercetools.api.models.standalone_price.StandalonePriceSetCustomFieldAction#ofUnset(String)}</p>
 *
 * <h3>Stores</h3>
 *
 * <p>{@link com.commercetools.api.models.store.StoreSetCustomFieldAction#ofUnset(String)}</p>
 *
 * <h3>Subscriptions</h3>
 *
 * <p>{@link com.commercetools.api.models.subscription.SubscriptionSetMessagesAction#ofUnset()} ofUnset()</p>
 * <p>{@link com.commercetools.api.models.subscription.SubscriptionSetChangesAction#ofUnset()} ofUnset()</p>
 *
 * <h3>Types</h3>
 *
 * <p>{@link com.commercetools.api.models.type.Type#getFieldDefinitionByName(String)} FieldDefinition getFieldDefinitionByName(final String name)</p>
 *
 * <h3>Zones</h3>
 *
 * <p>{@link com.commercetools.api.models.zone.Zone#contains(String)} boolean contains(final String countryCode)</p>
 *
 * <h3>ResourcePagedQueryResponse</h3>
 *
 * <p>{@link com.commercetools.api.models.ResourcePagedQueryResponse#head()} Optional<T> head()</p>
 * <p>{@link com.commercetools.api.models.ResourcePagedQueryResponse#getPageIndex()} Long getPageIndex()</p>
 * <p>{@link com.commercetools.api.models.ResourcePagedQueryResponse#getTotalPages()} Long getTotalPages()</p>
 * <p>{@link com.commercetools.api.models.ResourcePagedQueryResponse#isFirst()} boolean isFirst()</p>
 * <p>{@link com.commercetools.api.models.ResourcePagedQueryResponse#isLast()} boolean isLast()</p>
 *
 *
 *
 */
public class HelperMethods {
}
