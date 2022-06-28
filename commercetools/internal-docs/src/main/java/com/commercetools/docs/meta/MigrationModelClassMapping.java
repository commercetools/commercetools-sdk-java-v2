
package com.commercetools.docs.meta;

/**
 *
 * <h2>Mapping of classes from SDK v1 to v2</h2>
 *
 * <table>
 * <tr><th>v1</td><th>v2</th></tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.apiclient.ApiClient}</td>
 *   <td>{@link com.commercetools.api.models.api_client.ApiClient}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.apiclient.ApiClientDraft}</td>
 *   <td>{@link com.commercetools.api.models.api_client.ApiClientDraft}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.cartdiscounts.CartDiscount}</td>
 *   <td>{@link com.commercetools.api.models.cart_discount.CartDiscount}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.cartdiscounts.CartDiscountDraft}</td>
 *   <td>{@link com.commercetools.api.models.cart_discount.CartDiscountDraft}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.cartdiscounts.CartDiscountTarget}</td>
 *   <td>{@link com.commercetools.api.models.cart_discount.CartDiscountTarget}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.cartdiscounts.CartDiscountValue}</td>
 *   <td>{@link com.commercetools.api.models.cart_discount.CartDiscountValue}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.cartdiscounts.DiscountedLineItemPortion}</td>
 *   <td>{@link com.commercetools.api.models.cart.DiscountedLineItemPortion}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.cartdiscounts.DiscountedLineItemPrice}</td>
 *   <td>removed</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.cartdiscounts.DiscountedLineItemPriceForQuantity}</td>
 *   <td>{@link com.commercetools.api.models.cart.DiscountedLineItemPriceForQuantity}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.cartdiscounts.commands.updateactions.ChangeCartPredicate}</td>
 *   <td>{@link com.commercetools.api.models.cart_discount.CartDiscountChangeCartPredicateAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.cartdiscounts.commands.updateactions.ChangeIsActive}</td>
 *   <td>{@link com.commercetools.api.models.cart_discount.CartDiscountChangeIsActiveAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.cartdiscounts.commands.updateactions.ChangeName}</td>
 *   <td>{@link com.commercetools.api.models.cart_discount.CartDiscountChangeNameAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.cartdiscounts.commands.updateactions.ChangeRequiresDiscountCode}</td>
 *   <td>{@link com.commercetools.api.models.cart_discount.CartDiscountChangeRequiresDiscountCodeAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.cartdiscounts.commands.updateactions.ChangeSortOrder}</td>
 *   <td>{@link com.commercetools.api.models.cart_discount.CartDiscountChangeSortOrderAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.cartdiscounts.commands.updateactions.ChangeStackingMode}</td>
 *   <td>{@link com.commercetools.api.models.cart_discount.CartDiscountChangeStackingModeAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.cartdiscounts.commands.updateactions.ChangeTarget}</td>
 *   <td>{@link com.commercetools.api.models.cart_discount.CartDiscountChangeTargetAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.cartdiscounts.commands.updateactions.ChangeValue}</td>
 *   <td>{@link com.commercetools.api.models.cart_discount.CartDiscountChangeValueAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.cartdiscounts.commands.updateactions.SetCustomField}</td>
 *   <td>{@link com.commercetools.api.models.cart_discount.CartDiscountSetCustomFieldAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.cartdiscounts.commands.updateactions.SetCustomType}</td>
 *   <td>{@link com.commercetools.api.models.cart_discount.CartDiscountSetCustomTypeAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.cartdiscounts.commands.updateactions.SetDescription}</td>
 *   <td>{@link com.commercetools.api.models.cart_discount.CartDiscountSetDescriptionAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.cartdiscounts.commands.updateactions.SetKey}</td>
 *   <td>{@link com.commercetools.api.models.cart_discount.CartDiscountSetKeyAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.cartdiscounts.commands.updateactions.SetValidFrom}</td>
 *   <td>{@link com.commercetools.api.models.cart_discount.CartDiscountSetValidFromAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.cartdiscounts.commands.updateactions.SetValidFromAndUntil}</td>
 *   <td>{@link com.commercetools.api.models.cart_discount.CartDiscountSetValidFromAndUntilAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.cartdiscounts.commands.updateactions.SetValidUntil}</td>
 *   <td>{@link com.commercetools.api.models.cart_discount.CartDiscountSetValidUntilAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.carts.Cart}</td>
 *   <td>{@link com.commercetools.api.models.cart.Cart}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.carts.CartDraft}</td>
 *   <td>{@link com.commercetools.api.models.cart.CartDraft}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.carts.CartLike}</td>
 *   <td>{@link com.commercetools.api.models.order.OrderLike}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.carts.CartShippingInfo}</td>
 *   <td>{@link com.commercetools.api.models.cart.ShippingInfo}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.carts.CartsConfiguration}</td>
 *   <td>{@link com.commercetools.api.models.project.CartsConfiguration}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.carts.ClassificationShippingRateInput}</td>
 *   <td>{@link com.commercetools.api.models.cart.ClassificationShippingRateInput}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.carts.ClassificationShippingRateInputDraft}</td>
 *   <td>{@link com.commercetools.api.models.cart.ClassificationShippingRateInputDraft}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.carts.CustomLineItem}</td>
 *   <td>{@link com.commercetools.api.models.cart.CustomLineItem}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.carts.CustomLineItemDraft}</td>
 *   <td>{@link com.commercetools.api.models.cart.CustomLineItemDraft}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.carts.ExternalLineItemTotalPrice}</td>
 *   <td>{@link com.commercetools.api.models.cart.ExternalLineItemTotalPrice}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.carts.ExternalTaxAmountDraft}</td>
 *   <td>{@link com.commercetools.api.models.cart.ExternalTaxAmountDraft}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.carts.ItemShippingDetails}</td>
 *   <td>{@link com.commercetools.api.models.cart.ItemShippingDetails}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.carts.ItemShippingDetailsDraft}</td>
 *   <td>{@link com.commercetools.api.models.cart.ItemShippingDetailsDraft}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.carts.ItemShippingTarget}</td>
 *   <td>{@link com.commercetools.api.models.cart.ItemShippingTarget}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.carts.ItemState}</td>
 *   <td>{@link com.commercetools.api.models.order.ItemState}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.carts.LineItem}</td>
 *   <td>{@link com.commercetools.api.models.cart.LineItem}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.carts.LineItemDraft}</td>
 *   <td>{@link com.commercetools.api.models.cart.LineItemDraft}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.carts.PaymentInfo}</td>
 *   <td>{@link com.commercetools.api.models.order.PaymentInfo}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.carts.ScoreShippingRateInput}</td>
 *   <td>{@link com.commercetools.api.models.cart.ScoreShippingRateInput}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.carts.ScoreShippingRateInputDraft}</td>
 *   <td>{@link com.commercetools.api.models.cart.ScoreShippingRateInputDraft}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.carts.ShippingRateInput}</td>
 *   <td>{@link com.commercetools.api.models.cart.ShippingRateInput}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.carts.ShippingRateInputDraft}</td>
 *   <td>{@link com.commercetools.api.models.cart.ShippingRateInputDraft}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.carts.ShoppingListsConfiguration}</td>
 *   <td>{@link com.commercetools.api.models.project.ShoppingListsConfiguration}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.carts.TaxPortion}</td>
 *   <td>{@link com.commercetools.api.models.cart.TaxPortion}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.carts.TaxedItemPrice}</td>
 *   <td>{@link com.commercetools.api.models.cart.TaxedItemPrice}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.carts.TaxedPrice}</td>
 *   <td>{@link com.commercetools.api.models.cart.TaxedPrice}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.carts.commands.updateactions.AddCustomLineItem}</td>
 *   <td>{@link com.commercetools.api.models.cart.CartAddCustomLineItemAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.carts.commands.updateactions.AddDiscountCode}</td>
 *   <td>{@link com.commercetools.api.models.cart.CartAddDiscountCodeAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.carts.commands.updateactions.AddItemShippingAddress}</td>
 *   <td>{@link com.commercetools.api.models.cart.CartAddItemShippingAddressAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.carts.commands.updateactions.AddLineItem}</td>
 *   <td>{@link com.commercetools.api.models.cart.CartAddLineItemAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.carts.commands.updateactions.AddPayment}</td>
 *   <td>{@link com.commercetools.api.models.cart.CartAddPaymentAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.carts.commands.updateactions.AddShoppingList}</td>
 *   <td>{@link com.commercetools.api.models.cart.CartAddShoppingListAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.carts.commands.updateactions.ApplyDeltaToCustomLineItemShippingDetailsTargets}</td>
 *   <td>{@link com.commercetools.api.models.cart.CartApplyDeltaToCustomLineItemShippingDetailsTargetsAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.carts.commands.updateactions.ApplyDeltaToLineItemShippingDetailsTargets}</td>
 *   <td>{@link com.commercetools.api.models.cart.CartApplyDeltaToLineItemShippingDetailsTargetsAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.carts.commands.updateactions.ChangeCustomLineItemMoney}</td>
 *   <td>{@link com.commercetools.api.models.cart.CartChangeCustomLineItemMoneyAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.carts.commands.updateactions.ChangeCustomLineItemQuantity}</td>
 *   <td>{@link com.commercetools.api.models.cart.CartChangeCustomLineItemQuantityAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.carts.commands.updateactions.ChangeLineItemQuantity}</td>
 *   <td>{@link com.commercetools.api.models.cart.CartChangeLineItemQuantityAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.carts.commands.updateactions.ChangeTaxCalculationMode}</td>
 *   <td>{@link com.commercetools.api.models.cart.CartChangeTaxCalculationModeAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.carts.commands.updateactions.ChangeTaxMode}</td>
 *   <td>{@link com.commercetools.api.models.cart.CartChangeTaxModeAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.carts.commands.updateactions.ChangeTaxRoundingMode}</td>
 *   <td>{@link com.commercetools.api.models.cart.CartChangeTaxRoundingModeAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.carts.commands.updateactions.Recalculate}</td>
 *   <td>{@link com.commercetools.api.models.cart.CartRecalculateAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.carts.commands.updateactions.RemoveCustomLineItem}</td>
 *   <td>{@link com.commercetools.api.models.cart.CartRemoveCustomLineItemAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.carts.commands.updateactions.RemoveDiscountCode}</td>
 *   <td>{@link com.commercetools.api.models.cart.CartRemoveDiscountCodeAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.carts.commands.updateactions.RemoveItemShippingAddress}</td>
 *   <td>{@link com.commercetools.api.models.cart.CartRemoveItemShippingAddressAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.carts.commands.updateactions.RemoveLineItem}</td>
 *   <td>{@link com.commercetools.api.models.cart.CartRemoveLineItemAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.carts.commands.updateactions.RemovePayment}</td>
 *   <td>{@link com.commercetools.api.models.cart.CartRemovePaymentAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.carts.commands.updateactions.SetAnonymousId}</td>
 *   <td>{@link com.commercetools.api.models.cart.CartSetAnonymousIdAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.carts.commands.updateactions.SetBillingAddress}</td>
 *   <td>{@link com.commercetools.api.models.cart.CartSetBillingAddressAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.carts.commands.updateactions.SetBillingAddressCustomField}</td>
 *   <td>{@link com.commercetools.api.models.cart.CartSetBillingAddressCustomFieldAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.carts.commands.updateactions.SetBillingAddressCustomType}</td>
 *   <td>{@link com.commercetools.api.models.cart.CartSetBillingAddressCustomTypeAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.carts.commands.updateactions.SetCartTotalTax}</td>
 *   <td>{@link com.commercetools.api.models.cart.CartSetCartTotalTaxAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.carts.commands.updateactions.SetCountry}</td>
 *   <td>{@link com.commercetools.api.models.cart.CartSetCountryAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.carts.commands.updateactions.SetCustomField}</td>
 *   <td>{@link com.commercetools.api.models.cart.CartSetCustomFieldAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.carts.commands.updateactions.SetCustomLineItemCustomField}</td>
 *   <td>{@link com.commercetools.api.models.cart.CartSetCustomLineItemCustomFieldAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.carts.commands.updateactions.SetCustomLineItemCustomType}</td>
 *   <td>{@link com.commercetools.api.models.cart.CartSetCustomLineItemCustomTypeAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.carts.commands.updateactions.SetCustomLineItemShippingDetails}</td>
 *   <td>{@link com.commercetools.api.models.cart.CartSetCustomLineItemShippingDetailsAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.carts.commands.updateactions.SetCustomLineItemTaxAmount}</td>
 *   <td>{@link com.commercetools.api.models.cart.CartSetCustomLineItemTaxAmountAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.carts.commands.updateactions.SetCustomLineItemTaxRate}</td>
 *   <td>{@link com.commercetools.api.models.cart.CartSetCustomLineItemTaxRateAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.carts.commands.updateactions.SetCustomShippingMethod}</td>
 *   <td>{@link com.commercetools.api.models.cart.CartSetCustomShippingMethodAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.carts.commands.updateactions.SetCustomType}</td>
 *   <td>{@link com.commercetools.api.models.cart.CartSetCustomTypeAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.carts.commands.updateactions.SetCustomerEmail}</td>
 *   <td>{@link com.commercetools.api.models.cart.CartSetCustomerEmailAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.carts.commands.updateactions.SetCustomerGroup}</td>
 *   <td>{@link com.commercetools.api.models.cart.CartSetCustomerGroupAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.carts.commands.updateactions.SetCustomerId}</td>
 *   <td>{@link com.commercetools.api.models.cart.CartSetCustomerIdAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.carts.commands.updateactions.SetDeleteDaysAfterLastModification}</td>
 *   <td>{@link com.commercetools.api.models.cart.CartSetDeleteDaysAfterLastModificationAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.carts.commands.updateactions.SetDeliveryAddressCustomField}</td>
 *   <td>{@link com.commercetools.api.models.cart.CartSetDeliveryAddressCustomFieldAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.carts.commands.updateactions.SetDeliveryAddressCustomType}</td>
 *   <td>{@link com.commercetools.api.models.cart.CartSetDeliveryAddressCustomTypeAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.carts.commands.updateactions.SetItemShippingAddressCustomField}</td>
 *   <td>{@link com.commercetools.api.models.cart.CartSetItemShippingAddressCustomFieldAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.carts.commands.updateactions.SetItemShippingAddressCustomType}</td>
 *   <td>{@link com.commercetools.api.models.cart.CartSetItemShippingAddressCustomTypeAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.carts.commands.updateactions.SetKey}</td>
 *   <td>{@link com.commercetools.api.models.cart.CartSetKeyAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.carts.commands.updateactions.SetLineItemCustomField}</td>
 *   <td>{@link com.commercetools.api.models.cart.CartSetLineItemCustomFieldAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.carts.commands.updateactions.SetLineItemCustomType}</td>
 *   <td>{@link com.commercetools.api.models.cart.CartSetLineItemCustomTypeAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.carts.commands.updateactions.SetLineItemDistributionChannel}</td>
 *   <td>{@link com.commercetools.api.models.cart.CartSetLineItemDistributionChannelAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.carts.commands.updateactions.SetLineItemPrice}</td>
 *   <td>{@link com.commercetools.api.models.cart.CartSetLineItemPriceAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.carts.commands.updateactions.SetLineItemShippingDetails}</td>
 *   <td>{@link com.commercetools.api.models.cart.CartSetLineItemShippingDetailsAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.carts.commands.updateactions.SetLineItemSupplyChannel}</td>
 *   <td>{@link com.commercetools.api.models.cart.CartSetLineItemSupplyChannelAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.carts.commands.updateactions.SetLineItemTaxAmount}</td>
 *   <td>{@link com.commercetools.api.models.cart.CartSetLineItemTaxAmountAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.carts.commands.updateactions.SetLineItemTaxRate}</td>
 *   <td>{@link com.commercetools.api.models.cart.CartSetLineItemTaxRateAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.carts.commands.updateactions.SetLineItemTotalPrice}</td>
 *   <td>{@link com.commercetools.api.models.cart.CartSetLineItemTotalPriceAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.carts.commands.updateactions.SetLocale}</td>
 *   <td>{@link com.commercetools.api.models.cart.CartSetLocaleAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.carts.commands.updateactions.SetShippingAddress}</td>
 *   <td>{@link com.commercetools.api.models.cart.CartSetShippingAddressAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.carts.commands.updateactions.SetShippingAddressCustomField}</td>
 *   <td>{@link com.commercetools.api.models.cart.CartSetShippingAddressCustomFieldAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.carts.commands.updateactions.SetShippingAddressCustomType}</td>
 *   <td>{@link com.commercetools.api.models.cart.CartSetShippingAddressCustomTypeAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.carts.commands.updateactions.SetShippingMethod}</td>
 *   <td>{@link com.commercetools.api.models.cart.CartSetShippingMethodAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.carts.commands.updateactions.SetShippingMethodTaxAmount}</td>
 *   <td>{@link com.commercetools.api.models.cart.CartSetShippingMethodTaxAmountAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.carts.commands.updateactions.SetShippingMethodTaxRate}</td>
 *   <td>{@link com.commercetools.api.models.cart.CartSetShippingMethodTaxRateAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.carts.commands.updateactions.SetShippingRateInput}</td>
 *   <td>{@link com.commercetools.api.models.cart.CartSetShippingRateInputAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.carts.commands.updateactions.UpdateItemShippingAddress}</td>
 *   <td>{@link com.commercetools.api.models.cart.CartUpdateItemShippingAddressAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.categories.Category}</td>
 *   <td>{@link com.commercetools.api.models.category.Category}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.categories.CategoryDraft}</td>
 *   <td>{@link com.commercetools.api.models.category.CategoryDraft}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.categories.CategoryTree}</td>
 *   <td>{@link com.commercetools.api.models.category.CategoryTree}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.categories.commands.updateactions.AddAsset}</td>
 *   <td>{@link com.commercetools.api.models.category.CategoryAddAssetAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.categories.commands.updateactions.ChangeAssetName}</td>
 *   <td>{@link com.commercetools.api.models.category.CategoryChangeAssetNameAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.categories.commands.updateactions.ChangeAssetOrder}</td>
 *   <td>{@link com.commercetools.api.models.category.CategoryChangeAssetOrderAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.categories.commands.updateactions.ChangeName}</td>
 *   <td>{@link com.commercetools.api.models.category.CategoryChangeNameAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.categories.commands.updateactions.ChangeOrderHint}</td>
 *   <td>{@link com.commercetools.api.models.category.CategoryChangeOrderHintAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.categories.commands.updateactions.ChangeParent}</td>
 *   <td>{@link com.commercetools.api.models.category.CategoryChangeParentAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.categories.commands.updateactions.ChangeSlug}</td>
 *   <td>{@link com.commercetools.api.models.category.CategoryChangeSlugAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.categories.commands.updateactions.RemoveAsset}</td>
 *   <td>{@link com.commercetools.api.models.category.CategoryRemoveAssetAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.categories.commands.updateactions.SetAssetCustomField}</td>
 *   <td>{@link com.commercetools.api.models.category.CategorySetAssetCustomFieldAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.categories.commands.updateactions.SetAssetCustomType}</td>
 *   <td>{@link com.commercetools.api.models.category.CategorySetAssetCustomTypeAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.categories.commands.updateactions.SetAssetDescription}</td>
 *   <td>{@link com.commercetools.api.models.category.CategorySetAssetDescriptionAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.categories.commands.updateactions.SetAssetKey}</td>
 *   <td>{@link com.commercetools.api.models.category.CategorySetAssetKeyAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.categories.commands.updateactions.SetAssetSources}</td>
 *   <td>{@link com.commercetools.api.models.category.CategorySetAssetSourcesAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.categories.commands.updateactions.SetAssetTags}</td>
 *   <td>{@link com.commercetools.api.models.category.CategorySetAssetTagsAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.categories.commands.updateactions.SetCustomField}</td>
 *   <td>{@link com.commercetools.api.models.category.CategorySetCustomFieldAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.categories.commands.updateactions.SetCustomType}</td>
 *   <td>{@link com.commercetools.api.models.category.CategorySetCustomTypeAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.categories.commands.updateactions.SetDescription}</td>
 *   <td>{@link com.commercetools.api.models.category.CategorySetDescriptionAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.categories.commands.updateactions.SetExternalId}</td>
 *   <td>{@link com.commercetools.api.models.category.CategorySetExternalIdAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.categories.commands.updateactions.SetKey}</td>
 *   <td>{@link com.commercetools.api.models.category.CategorySetKeyAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.categories.commands.updateactions.SetMetaDescription}</td>
 *   <td>{@link com.commercetools.api.models.category.CategorySetMetaDescriptionAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.categories.commands.updateactions.SetMetaKeywords}</td>
 *   <td>{@link com.commercetools.api.models.category.CategorySetMetaKeywordsAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.categories.commands.updateactions.SetMetaTitle}</td>
 *   <td>{@link com.commercetools.api.models.category.CategorySetMetaTitleAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.channels.Channel}</td>
 *   <td>{@link com.commercetools.api.models.channel.Channel}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.channels.ChannelDraft}</td>
 *   <td>{@link com.commercetools.api.models.channel.ChannelDraft}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.channels.commands.updateactions.AddRoles}</td>
 *   <td>{@link com.commercetools.api.models.channel.ChannelAddRolesAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.channels.commands.updateactions.ChangeDescription}</td>
 *   <td>{@link com.commercetools.api.models.channel.ChannelChangeDescriptionAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.channels.commands.updateactions.ChangeKey}</td>
 *   <td>{@link com.commercetools.api.models.channel.ChannelChangeKeyAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.channels.commands.updateactions.ChangeName}</td>
 *   <td>{@link com.commercetools.api.models.channel.ChannelChangeNameAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.channels.commands.updateactions.RemoveRoles}</td>
 *   <td>{@link com.commercetools.api.models.channel.ChannelRemoveRolesAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.channels.commands.updateactions.SetAddress}</td>
 *   <td>{@link com.commercetools.api.models.channel.ChannelSetAddressAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.channels.commands.updateactions.SetAddressCustomField}</td>
 *   <td>{@link com.commercetools.api.models.channel.ChannelSetAddressCustomFieldAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.channels.commands.updateactions.SetAddressCustomType}</td>
 *   <td>{@link com.commercetools.api.models.channel.ChannelSetAddressCustomTypeAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.channels.commands.updateactions.SetCustomField}</td>
 *   <td>{@link com.commercetools.api.models.channel.ChannelSetCustomFieldAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.channels.commands.updateactions.SetCustomType}</td>
 *   <td>{@link com.commercetools.api.models.channel.ChannelSetCustomTypeAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.channels.commands.updateactions.SetGeoLocation}</td>
 *   <td>{@link com.commercetools.api.models.channel.ChannelSetGeoLocationAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.channels.commands.updateactions.SetRoles}</td>
 *   <td>{@link com.commercetools.api.models.channel.ChannelSetRolesAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.customergroups.CustomerGroup}</td>
 *   <td>{@link com.commercetools.api.models.customer_group.CustomerGroup}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.customergroups.CustomerGroupDraft}</td>
 *   <td>{@link com.commercetools.api.models.customer_group.CustomerGroupDraft}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.customergroups.commands.updateactions.ChangeName}</td>
 *   <td>{@link com.commercetools.api.models.customer_group.CustomerGroupChangeNameAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.customergroups.commands.updateactions.SetCustomField}</td>
 *   <td>{@link com.commercetools.api.models.customer_group.CustomerGroupSetCustomFieldAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.customergroups.commands.updateactions.SetCustomType}</td>
 *   <td>{@link com.commercetools.api.models.customer_group.CustomerGroupSetCustomTypeAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.customergroups.commands.updateactions.SetKey}</td>
 *   <td>{@link com.commercetools.api.models.customer_group.CustomerGroupSetKeyAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.customers.Customer}</td>
 *   <td>{@link com.commercetools.api.models.customer.Customer}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.customers.CustomerDraft}</td>
 *   <td>{@link com.commercetools.api.models.customer.CustomerDraft}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.customers.CustomerSignInResult}</td>
 *   <td>{@link com.commercetools.api.models.customer.CustomerSignInResult}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.customers.CustomerToken}</td>
 *   <td>{@link com.commercetools.api.models.customer.CustomerToken}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.customers.commands.updateactions.AddAddress}</td>
 *   <td>{@link com.commercetools.api.models.customer.CustomerAddAddressAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.customers.commands.updateactions.AddBillingAddressId}</td>
 *   <td>{@link com.commercetools.api.models.customer.CustomerAddBillingAddressIdAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.customers.commands.updateactions.AddShippingAddressId}</td>
 *   <td>{@link com.commercetools.api.models.customer.CustomerAddShippingAddressIdAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.customers.commands.updateactions.AddStore}</td>
 *   <td>{@link com.commercetools.api.models.customer.CustomerAddStoreAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.customers.commands.updateactions.ChangeAddress}</td>
 *   <td>{@link com.commercetools.api.models.customer.CustomerChangeAddressAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.customers.commands.updateactions.ChangeEmail}</td>
 *   <td>{@link com.commercetools.api.models.customer.CustomerChangeEmailAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.customers.commands.updateactions.ChangeName}</td>
 *   <td>removed</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.customers.commands.updateactions.RemoveAddress}</td>
 *   <td>{@link com.commercetools.api.models.customer.CustomerRemoveAddressAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.customers.commands.updateactions.RemoveBillingAddressId}</td>
 *   <td>{@link com.commercetools.api.models.customer.CustomerRemoveBillingAddressIdAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.customers.commands.updateactions.RemoveShippingAddressId}</td>
 *   <td>{@link com.commercetools.api.models.customer.CustomerRemoveShippingAddressIdAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.customers.commands.updateactions.RemoveStore}</td>
 *   <td>{@link com.commercetools.api.models.customer.CustomerRemoveStoreAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.customers.commands.updateactions.SetAddressCustomField}</td>
 *   <td>{@link com.commercetools.api.models.customer.CustomerSetAddressCustomFieldAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.customers.commands.updateactions.SetAddressCustomType}</td>
 *   <td>{@link com.commercetools.api.models.customer.CustomerSetAddressCustomTypeAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.customers.commands.updateactions.SetAuthenticationMode}</td>
 *   <td>{@link com.commercetools.api.models.customer.CustomerSetAuthenticationModeAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.customers.commands.updateactions.SetCompanyName}</td>
 *   <td>{@link com.commercetools.api.models.customer.CustomerSetCompanyNameAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.customers.commands.updateactions.SetCustomField}</td>
 *   <td>{@link com.commercetools.api.models.customer.CustomerSetCustomFieldAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.customers.commands.updateactions.SetCustomType}</td>
 *   <td>{@link com.commercetools.api.models.customer.CustomerSetCustomTypeAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.customers.commands.updateactions.SetCustomerGroup}</td>
 *   <td>{@link com.commercetools.api.models.customer.CustomerSetCustomerGroupAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.customers.commands.updateactions.SetCustomerNumber}</td>
 *   <td>{@link com.commercetools.api.models.customer.CustomerSetCustomerNumberAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.customers.commands.updateactions.SetDateOfBirth}</td>
 *   <td>{@link com.commercetools.api.models.customer.CustomerSetDateOfBirthAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.customers.commands.updateactions.SetDefaultBillingAddress}</td>
 *   <td>{@link com.commercetools.api.models.customer.CustomerSetDefaultBillingAddressAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.customers.commands.updateactions.SetDefaultShippingAddress}</td>
 *   <td>{@link com.commercetools.api.models.customer.CustomerSetDefaultShippingAddressAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.customers.commands.updateactions.SetExternalId}</td>
 *   <td>{@link com.commercetools.api.models.customer.CustomerSetExternalIdAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.customers.commands.updateactions.SetFirstName}</td>
 *   <td>{@link com.commercetools.api.models.customer.CustomerSetFirstNameAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.customers.commands.updateactions.SetKey}</td>
 *   <td>{@link com.commercetools.api.models.customer.CustomerSetKeyAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.customers.commands.updateactions.SetLastName}</td>
 *   <td>{@link com.commercetools.api.models.customer.CustomerSetLastNameAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.customers.commands.updateactions.SetLocale}</td>
 *   <td>{@link com.commercetools.api.models.customer.CustomerSetLocaleAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.customers.commands.updateactions.SetMiddleName}</td>
 *   <td>{@link com.commercetools.api.models.customer.CustomerSetMiddleNameAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.customers.commands.updateactions.SetSalutation}</td>
 *   <td>{@link com.commercetools.api.models.customer.CustomerSetSalutationAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.customers.commands.updateactions.SetStores}</td>
 *   <td>{@link com.commercetools.api.models.customer.CustomerSetStoresAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.customers.commands.updateactions.SetTitle}</td>
 *   <td>{@link com.commercetools.api.models.customer.CustomerSetTitleAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.customers.commands.updateactions.SetVatId}</td>
 *   <td>{@link com.commercetools.api.models.customer.CustomerSetVatIdAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.customobjects.CustomObject}</td>
 *   <td>{@link com.commercetools.api.models.custom_object.CustomObject}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.discountcodes.DiscountCode}</td>
 *   <td>{@link com.commercetools.api.models.discount_code.DiscountCode}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.discountcodes.DiscountCodeDraft}</td>
 *   <td>{@link com.commercetools.api.models.discount_code.DiscountCodeDraft}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.discountcodes.DiscountCodeInfo}</td>
 *   <td>{@link com.commercetools.api.models.cart.DiscountCodeInfo}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.discountcodes.commands.updateactions.ChangeCartDiscounts}</td>
 *   <td>{@link com.commercetools.api.models.discount_code.DiscountCodeChangeCartDiscountsAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.discountcodes.commands.updateactions.ChangeGroups}</td>
 *   <td>{@link com.commercetools.api.models.discount_code.DiscountCodeChangeGroupsAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.discountcodes.commands.updateactions.SetCartPredicate}</td>
 *   <td>{@link com.commercetools.api.models.discount_code.DiscountCodeSetCartPredicateAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.discountcodes.commands.updateactions.SetCustomField}</td>
 *   <td>{@link com.commercetools.api.models.discount_code.DiscountCodeSetCustomFieldAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.discountcodes.commands.updateactions.SetCustomType}</td>
 *   <td>{@link com.commercetools.api.models.discount_code.DiscountCodeSetCustomTypeAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.discountcodes.commands.updateactions.SetDescription}</td>
 *   <td>{@link com.commercetools.api.models.discount_code.DiscountCodeSetDescriptionAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.discountcodes.commands.updateactions.SetMaxApplications}</td>
 *   <td>{@link com.commercetools.api.models.discount_code.DiscountCodeSetMaxApplicationsAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.discountcodes.commands.updateactions.SetMaxApplicationsPerCustomer}</td>
 *   <td>{@link com.commercetools.api.models.discount_code.DiscountCodeSetMaxApplicationsPerCustomerAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.discountcodes.commands.updateactions.SetName}</td>
 *   <td>{@link com.commercetools.api.models.discount_code.DiscountCodeSetNameAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.discountcodes.commands.updateactions.SetValidFrom}</td>
 *   <td>{@link com.commercetools.api.models.discount_code.DiscountCodeSetValidFromAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.discountcodes.commands.updateactions.SetValidFromAndUntil}</td>
 *   <td>{@link com.commercetools.api.models.discount_code.DiscountCodeSetValidFromAndUntilAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.discountcodes.commands.updateactions.SetValidUntil}</td>
 *   <td>{@link com.commercetools.api.models.discount_code.DiscountCodeSetValidUntilAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.extensions.AWSLambdaDestination}</td>
 *   <td>{@link com.commercetools.api.models.extension.AWSLambdaDestination}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.extensions.AuthorizationHeaderAuthentication}</td>
 *   <td>{@link com.commercetools.api.models.extension.AuthorizationHeaderAuthentication}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.extensions.AzureFunctionsAuthentication}</td>
 *   <td>{@link com.commercetools.api.models.extension.AzureFunctionsAuthentication}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.extensions.Destination}</td>
 *   <td>{@link com.commercetools.api.models.extension.ExtensionDestination}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.extensions.Extension}</td>
 *   <td>{@link com.commercetools.api.models.extension.Extension}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.extensions.ExtensionDraft}</td>
 *   <td>{@link com.commercetools.api.models.extension.ExtensionDraft}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.extensions.HttpDestination}</td>
 *   <td>{@link com.commercetools.api.models.extension.HttpDestination}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.extensions.HttpDestinationAuthentication}</td>
 *   <td>{@link com.commercetools.api.models.extension.HttpDestinationAuthentication}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.extensions.Trigger}</td>
 *   <td>{@link com.commercetools.api.models.extension.ExtensionTrigger}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.extensions.commands.updateactions.ChangeDestination}</td>
 *   <td>{@link com.commercetools.api.models.extension.ExtensionChangeDestinationAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.extensions.commands.updateactions.ChangeTriggers}</td>
 *   <td>{@link com.commercetools.api.models.extension.ExtensionChangeTriggersAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.extensions.commands.updateactions.SetKey}</td>
 *   <td>{@link com.commercetools.api.models.extension.ExtensionSetKeyAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.extensions.commands.updateactions.SetTimeoutInMs}</td>
 *   <td>{@link com.commercetools.api.models.extension.ExtensionSetTimeoutInMsAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.inventory.InventoryEntry}</td>
 *   <td>{@link com.commercetools.api.models.inventory.InventoryEntry}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.inventory.InventoryEntryDraft}</td>
 *   <td>{@link com.commercetools.api.models.inventory.InventoryEntryDraft}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.inventory.commands.updateactions.AddQuantity}</td>
 *   <td>{@link com.commercetools.api.models.inventory.InventoryEntryAddQuantityAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.inventory.commands.updateactions.ChangeQuantity}</td>
 *   <td>{@link com.commercetools.api.models.inventory.InventoryEntryChangeQuantityAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.inventory.commands.updateactions.RemoveQuantity}</td>
 *   <td>{@link com.commercetools.api.models.inventory.InventoryEntryRemoveQuantityAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.inventory.commands.updateactions.SetCustomField}</td>
 *   <td>{@link com.commercetools.api.models.inventory.InventoryEntrySetCustomFieldAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.inventory.commands.updateactions.SetCustomType}</td>
 *   <td>{@link com.commercetools.api.models.inventory.InventoryEntrySetCustomTypeAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.inventory.commands.updateactions.SetExpectedDelivery}</td>
 *   <td>{@link com.commercetools.api.models.inventory.InventoryEntrySetExpectedDeliveryAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.inventory.commands.updateactions.SetRestockableInDays}</td>
 *   <td>{@link com.commercetools.api.models.inventory.InventoryEntrySetRestockableInDaysAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.inventory.commands.updateactions.SetSupplyChannel}</td>
 *   <td>{@link com.commercetools.api.models.inventory.InventoryEntrySetSupplyChannelAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.messages.Message}</td>
 *   <td>{@link com.commercetools.api.models.message.Message}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.messages.UserProvidedIdentifiers}</td>
 *   <td>{@link com.commercetools.api.models.message.UserProvidedIdentifiers}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.models.Asset}</td>
 *   <td>{@link com.commercetools.api.models.common.Asset}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.models.AssetDimensions}</td>
 *   <td>{@link com.commercetools.api.models.common.AssetDimensions}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.models.AssetDraft}</td>
 *   <td>{@link com.commercetools.api.models.common.AssetDraft}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.models.AssetSource}</td>
 *   <td>{@link com.commercetools.api.models.common.AssetSource}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.models.ClientLogging}</td>
 *   <td>{@link com.commercetools.api.models.common.ClientLogging}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.models.ContainerAndKey}</td>
 *   <td>{@link com.commercetools.api.models.message.ContainerAndKey}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.models.CreatedBy}</td>
 *   <td>{@link com.commercetools.api.models.common.CreatedBy}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.models.LastModifiedBy}</td>
 *   <td>{@link com.commercetools.api.models.common.LastModifiedBy}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.models.WithClientLogging}</td>
 *   <td>{@link com.commercetools.api.models.common.ClientLogging}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.orderedits.OrderEdit}</td>
 *   <td>{@link com.commercetools.api.models.order_edit.OrderEdit}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.orderedits.OrderEditApplied}</td>
 *   <td>{@link com.commercetools.api.models.order_edit.OrderEditApplied}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.orderedits.OrderEditDraft}</td>
 *   <td>{@link com.commercetools.api.models.order_edit.OrderEditDraft}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.orderedits.OrderEditNotProcessed}</td>
 *   <td>{@link com.commercetools.api.models.order_edit.OrderEditNotProcessed}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.orderedits.OrderEditPreviewFailure}</td>
 *   <td>{@link com.commercetools.api.models.order_edit.OrderEditPreviewFailure}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.orderedits.OrderEditPreviewSuccess}</td>
 *   <td>{@link com.commercetools.api.models.order_edit.OrderEditPreviewSuccess}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.orderedits.OrderEditResult}</td>
 *   <td>{@link com.commercetools.api.models.order_edit.OrderEditResult}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.orderedits.OrderExcerpt}</td>
 *   <td>{@link com.commercetools.api.models.order_edit.OrderExcerpt}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.orderedits.commands.updateactions.AddStagedAction}</td>
 *   <td>{@link com.commercetools.api.models.order_edit.OrderEditAddStagedActionAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.orderedits.commands.updateactions.SetComment}</td>
 *   <td>{@link com.commercetools.api.models.order_edit.OrderEditSetCommentAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.orderedits.commands.updateactions.SetCustomField}</td>
 *   <td>{@link com.commercetools.api.models.order_edit.OrderEditSetCustomFieldAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.orderedits.commands.updateactions.SetCustomType}</td>
 *   <td>{@link com.commercetools.api.models.order_edit.OrderEditSetCustomTypeAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.orderedits.commands.updateactions.SetKey}</td>
 *   <td>{@link com.commercetools.api.models.order_edit.OrderEditSetKeyAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.orderedits.commands.updateactions.SetStagedActions}</td>
 *   <td>{@link com.commercetools.api.models.order_edit.OrderEditSetStagedActionsAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.orders.CustomLineItemImportDraft}</td>
 *   <td>{@link com.commercetools.api.models.cart.CustomLineItemImportDraft}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.orders.CustomLineItemReturnItem}</td>
 *   <td>{@link com.commercetools.api.models.order.CustomLineItemReturnItem}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.orders.CustomLineItemReturnItemDraft}</td>
 *   <td>{@link com.commercetools.api.models.order.CustomLineItemReturnItem}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.orders.Delivery}</td>
 *   <td>{@link com.commercetools.api.models.order.Delivery}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.orders.DeliveryItem}</td>
 *   <td>{@link com.commercetools.api.models.order.DeliveryItem}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.orders.LineItemImportDraft}</td>
 *   <td>{@link com.commercetools.api.models.order.LineItemImportDraft}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.orders.LineItemReturnItem}</td>
 *   <td>{@link com.commercetools.api.models.order.LineItemReturnItem}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.orders.LineItemReturnItemDraft}</td>
 *   <td>{@link com.commercetools.api.models.order.LineItemReturnItem}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.orders.Order}</td>
 *   <td>{@link com.commercetools.api.models.order.Order}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.orders.OrderFromCartDraft}</td>
 *   <td>{@link com.commercetools.api.models.order.OrderFromCartDraft}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.orders.OrderImportDraft}</td>
 *   <td>{@link com.commercetools.api.models.order.OrderImportDraft}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.orders.OrderShippingInfo}</td>
 *   <td>{@link com.commercetools.api.models.cart.ShippingInfo}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.orders.Parcel}</td>
 *   <td>{@link com.commercetools.api.models.order.Parcel}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.orders.ParcelDraft}</td>
 *   <td>{@link com.commercetools.api.models.order.ParcelDraft}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.orders.ParcelMeasurements}</td>
 *   <td>{@link com.commercetools.api.models.order.ParcelMeasurements}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.orders.ProductVariantImportDraft}</td>
 *   <td>{@link com.commercetools.api.models.order.ProductVariantImportDraft}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.orders.ReturnInfo}</td>
 *   <td>{@link com.commercetools.api.models.order.ReturnInfo}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.orders.ReturnInfoDraft}</td>
 *   <td>{@link com.commercetools.api.models.order.ReturnInfoDraft}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.orders.ReturnItem}</td>
 *   <td>{@link com.commercetools.api.models.order.ReturnItem}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.orders.ReturnItemDraft}</td>
 *   <td>{@link com.commercetools.api.models.order.ReturnItemDraft}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.orders.ShippingInfoImportDraft}</td>
 *   <td>{@link com.commercetools.api.models.order.ShippingInfoImportDraft}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.orders.SyncInfo}</td>
 *   <td>{@link com.commercetools.api.models.order.SyncInfo}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.orders.TrackingData}</td>
 *   <td>{@link com.commercetools.api.models.order.TrackingData}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.orders.commands.updateactions.AddDelivery}</td>
 *   <td>{@link com.commercetools.api.models.order.OrderAddDeliveryAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.orders.commands.updateactions.AddItemShippingAddress}</td>
 *   <td>{@link com.commercetools.api.models.order.OrderAddItemShippingAddressAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.orders.commands.updateactions.AddParcelToDelivery}</td>
 *   <td>{@link com.commercetools.api.models.order.OrderAddParcelToDeliveryAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.orders.commands.updateactions.AddPayment}</td>
 *   <td>{@link com.commercetools.api.models.order.OrderAddPaymentAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.orders.commands.updateactions.AddReturnInfo}</td>
 *   <td>{@link com.commercetools.api.models.order.OrderAddReturnInfoAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.orders.commands.updateactions.ChangeOrderState}</td>
 *   <td>{@link com.commercetools.api.models.order.OrderChangeOrderStateAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.orders.commands.updateactions.ChangePaymentState}</td>
 *   <td>{@link com.commercetools.api.models.order.OrderChangePaymentStateAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.orders.commands.updateactions.ChangeShipmentState}</td>
 *   <td>{@link com.commercetools.api.models.order.OrderChangeShipmentStateAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.orders.commands.updateactions.ImportCustomLineItemState}</td>
 *   <td>{@link com.commercetools.api.models.order.OrderImportCustomLineItemStateAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.orders.commands.updateactions.ImportLineItemState}</td>
 *   <td>{@link com.commercetools.api.models.order.OrderImportLineItemStateAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.orders.commands.updateactions.RemoveDelivery}</td>
 *   <td>{@link com.commercetools.api.models.order.OrderRemoveDeliveryAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.orders.commands.updateactions.RemoveItemShippingAddress}</td>
 *   <td>{@link com.commercetools.api.models.order.OrderRemoveItemShippingAddressAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.orders.commands.updateactions.RemoveParcelFromDelivery}</td>
 *   <td>{@link com.commercetools.api.models.order.OrderRemoveParcelFromDeliveryAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.orders.commands.updateactions.RemovePayment}</td>
 *   <td>{@link com.commercetools.api.models.order.OrderRemovePaymentAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.orders.commands.updateactions.SetBillingAddress}</td>
 *   <td>{@link com.commercetools.api.models.order.OrderSetBillingAddressAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.orders.commands.updateactions.SetCustomField}</td>
 *   <td>{@link com.commercetools.api.models.order.OrderSetCustomFieldAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.orders.commands.updateactions.SetCustomLineItemCustomField}</td>
 *   <td>{@link com.commercetools.api.models.order.OrderSetCustomLineItemCustomFieldAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.orders.commands.updateactions.SetCustomLineItemCustomType}</td>
 *   <td>{@link com.commercetools.api.models.order.OrderSetCustomLineItemCustomTypeAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.orders.commands.updateactions.SetCustomLineItemShippingDetails}</td>
 *   <td>{@link com.commercetools.api.models.order.OrderSetCustomLineItemShippingDetailsAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.orders.commands.updateactions.SetCustomType}</td>
 *   <td>{@link com.commercetools.api.models.order.OrderSetCustomTypeAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.orders.commands.updateactions.SetCustomerEmail}</td>
 *   <td>{@link com.commercetools.api.models.order.OrderSetCustomerEmailAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.orders.commands.updateactions.SetCustomerId}</td>
 *   <td>{@link com.commercetools.api.models.order.OrderSetCustomerIdAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.orders.commands.updateactions.SetDeliveryAddress}</td>
 *   <td>{@link com.commercetools.api.models.order.OrderSetDeliveryAddressAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.orders.commands.updateactions.SetDeliveryCustomField}</td>
 *   <td>{@link com.commercetools.api.models.order.OrderSetDeliveryCustomFieldAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.orders.commands.updateactions.SetDeliveryCustomType}</td>
 *   <td>{@link com.commercetools.api.models.order.OrderSetDeliveryCustomTypeAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.orders.commands.updateactions.SetDeliveryItems}</td>
 *   <td>{@link com.commercetools.api.models.order.OrderSetDeliveryItemsAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.orders.commands.updateactions.SetLineItemCustomField}</td>
 *   <td>{@link com.commercetools.api.models.order.OrderSetLineItemCustomFieldAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.orders.commands.updateactions.SetLineItemCustomType}</td>
 *   <td>{@link com.commercetools.api.models.order.OrderSetLineItemCustomTypeAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.orders.commands.updateactions.SetLineItemShippingDetails}</td>
 *   <td>{@link com.commercetools.api.models.order.OrderSetLineItemShippingDetailsAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.orders.commands.updateactions.SetLocale}</td>
 *   <td>{@link com.commercetools.api.models.order.OrderSetLocaleAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.orders.commands.updateactions.SetOrderNumber}</td>
 *   <td>{@link com.commercetools.api.models.order.OrderSetOrderNumberAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.orders.commands.updateactions.SetParcelCustomField}</td>
 *   <td>{@link com.commercetools.api.models.order.OrderSetParcelCustomFieldAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.orders.commands.updateactions.SetParcelCustomType}</td>
 *   <td>{@link com.commercetools.api.models.order.OrderSetParcelCustomTypeAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.orders.commands.updateactions.SetParcelItems}</td>
 *   <td>{@link com.commercetools.api.models.order.OrderSetParcelItemsAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.orders.commands.updateactions.SetParcelMeasurements}</td>
 *   <td>{@link com.commercetools.api.models.order.OrderSetParcelMeasurementsAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.orders.commands.updateactions.SetParcelTrackingData}</td>
 *   <td>{@link com.commercetools.api.models.order.OrderSetParcelTrackingDataAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.orders.commands.updateactions.SetReturnInfo}</td>
 *   <td>{@link com.commercetools.api.models.order.OrderSetReturnInfoAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.orders.commands.updateactions.SetReturnItemCustomField}</td>
 *   <td>{@link com.commercetools.api.models.order.OrderSetReturnItemCustomFieldAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.orders.commands.updateactions.SetReturnItemCustomType}</td>
 *   <td>{@link com.commercetools.api.models.order.OrderSetReturnItemCustomTypeAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.orders.commands.updateactions.SetReturnPaymentState}</td>
 *   <td>{@link com.commercetools.api.models.order.OrderSetReturnPaymentStateAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.orders.commands.updateactions.SetReturnShipmentState}</td>
 *   <td>{@link com.commercetools.api.models.order.OrderSetReturnShipmentStateAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.orders.commands.updateactions.SetShippingAddress}</td>
 *   <td>{@link com.commercetools.api.models.order.OrderSetShippingAddressAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.orders.commands.updateactions.SetStore}</td>
 *   <td>{@link com.commercetools.api.models.order.OrderSetStoreAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.orders.commands.updateactions.TransitionCustomLineItemState}</td>
 *   <td>{@link com.commercetools.api.models.order.OrderTransitionCustomLineItemStateAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.orders.commands.updateactions.TransitionLineItemState}</td>
 *   <td>{@link com.commercetools.api.models.order.OrderTransitionLineItemStateAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.orders.commands.updateactions.TransitionState}</td>
 *   <td>{@link com.commercetools.api.models.order.OrderTransitionStateAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.orders.commands.updateactions.UpdateItemShippingAddress}</td>
 *   <td>{@link com.commercetools.api.models.order.OrderUpdateItemShippingAddressAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.orders.commands.updateactions.UpdateSyncInfo}</td>
 *   <td>{@link com.commercetools.api.models.order.OrderUpdateSyncInfoAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.orders.messages.OrderMessage}</td>
 *   <td>{@link com.commercetools.api.models.message.OrderMessage}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.payments.Payment}</td>
 *   <td>{@link com.commercetools.api.models.payment.Payment}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.payments.PaymentDraft}</td>
 *   <td>{@link com.commercetools.api.models.payment.PaymentDraft}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.payments.PaymentMethodInfo}</td>
 *   <td>{@link com.commercetools.api.models.payment.PaymentMethodInfo}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.payments.PaymentStatus}</td>
 *   <td>{@link com.commercetools.api.models.payment.PaymentStatus}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.payments.Transaction}</td>
 *   <td>{@link com.commercetools.api.models.payment.Transaction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.payments.TransactionDraft}</td>
 *   <td>{@link com.commercetools.api.models.payment.TransactionDraft}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.payments.commands.updateactions.AddInterfaceInteraction}</td>
 *   <td>{@link com.commercetools.api.models.payment.PaymentAddInterfaceInteractionAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.payments.commands.updateactions.AddTransaction}</td>
 *   <td>{@link com.commercetools.api.models.payment.PaymentAddTransactionAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.payments.commands.updateactions.ChangeAmountPlanned}</td>
 *   <td>{@link com.commercetools.api.models.payment.PaymentChangeAmountPlannedAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.payments.commands.updateactions.ChangeTransactionInteractionId}</td>
 *   <td>{@link com.commercetools.api.models.payment.PaymentChangeTransactionInteractionIdAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.payments.commands.updateactions.ChangeTransactionState}</td>
 *   <td>{@link com.commercetools.api.models.payment.PaymentChangeTransactionStateAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.payments.commands.updateactions.ChangeTransactionTimestamp}</td>
 *   <td>{@link com.commercetools.api.models.payment.PaymentChangeTransactionTimestampAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.payments.commands.updateactions.SetAmountPaid}</td>
 *   <td>removed</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.payments.commands.updateactions.SetAmountRefunded}</td>
 *   <td>removed</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.payments.commands.updateactions.SetAnonymousId}</td>
 *   <td>{@link com.commercetools.api.models.payment.PaymentSetAnonymousIdAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.payments.commands.updateactions.SetAuthorization}</td>
 *   <td>removed</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.payments.commands.updateactions.SetCustomField}</td>
 *   <td>{@link com.commercetools.api.models.payment.PaymentSetCustomFieldAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.payments.commands.updateactions.SetCustomType}</td>
 *   <td>{@link com.commercetools.api.models.payment.PaymentSetCustomTypeAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.payments.commands.updateactions.SetCustomer}</td>
 *   <td>{@link com.commercetools.api.models.payment.PaymentSetCustomerAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.payments.commands.updateactions.SetExternalId}</td>
 *   <td>removed</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.payments.commands.updateactions.SetInterfaceId}</td>
 *   <td>{@link com.commercetools.api.models.payment.PaymentSetInterfaceIdAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.payments.commands.updateactions.SetKey}</td>
 *   <td>{@link com.commercetools.api.models.payment.PaymentSetKeyAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.payments.commands.updateactions.SetMethodInfoInterface}</td>
 *   <td>{@link com.commercetools.api.models.payment.PaymentSetMethodInfoInterfaceAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.payments.commands.updateactions.SetMethodInfoMethod}</td>
 *   <td>{@link com.commercetools.api.models.payment.PaymentSetMethodInfoMethodAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.payments.commands.updateactions.SetMethodInfoName}</td>
 *   <td>{@link com.commercetools.api.models.payment.PaymentSetMethodInfoNameAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.payments.commands.updateactions.SetStatusInterfaceCode}</td>
 *   <td>{@link com.commercetools.api.models.payment.PaymentSetStatusInterfaceCodeAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.payments.commands.updateactions.SetStatusInterfaceText}</td>
 *   <td>{@link com.commercetools.api.models.payment.PaymentSetStatusInterfaceTextAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.payments.commands.updateactions.SetTransactionCustomField}</td>
 *   <td>{@link com.commercetools.api.models.payment.PaymentSetTransactionCustomFieldAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.payments.commands.updateactions.SetTransactionCustomType}</td>
 *   <td>{@link com.commercetools.api.models.payment.PaymentSetTransactionCustomTypeAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.payments.commands.updateactions.TransitionState}</td>
 *   <td>{@link com.commercetools.api.models.payment.PaymentTransitionStateAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.productdiscounts.DiscountedPrice}</td>
 *   <td>{@link com.commercetools.api.models.common.DiscountedPrice}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.productdiscounts.ProductDiscount}</td>
 *   <td>{@link com.commercetools.api.models.product_discount.ProductDiscount}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.productdiscounts.ProductDiscountDraft}</td>
 *   <td>{@link com.commercetools.api.models.product_discount.ProductDiscountDraft}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.productdiscounts.ProductDiscountValue}</td>
 *   <td>{@link com.commercetools.api.models.product_discount.ProductDiscountValue}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.productdiscounts.commands.updateactions.ChangeIsActive}</td>
 *   <td>{@link com.commercetools.api.models.product_discount.ProductDiscountChangeIsActiveAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.productdiscounts.commands.updateactions.ChangeName}</td>
 *   <td>{@link com.commercetools.api.models.product_discount.ProductDiscountChangeNameAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.productdiscounts.commands.updateactions.ChangePredicate}</td>
 *   <td>{@link com.commercetools.api.models.product_discount.ProductDiscountChangePredicateAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.productdiscounts.commands.updateactions.ChangeSortOrder}</td>
 *   <td>{@link com.commercetools.api.models.product_discount.ProductDiscountChangeSortOrderAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.productdiscounts.commands.updateactions.ChangeValue}</td>
 *   <td>{@link com.commercetools.api.models.product_discount.ProductDiscountChangeValueAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.productdiscounts.commands.updateactions.SetDescription}</td>
 *   <td>{@link com.commercetools.api.models.product_discount.ProductDiscountSetDescriptionAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.productdiscounts.commands.updateactions.SetKey}</td>
 *   <td>{@link com.commercetools.api.models.product_discount.ProductDiscountSetKeyAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.productdiscounts.commands.updateactions.SetValidFrom}</td>
 *   <td>{@link com.commercetools.api.models.product_discount.ProductDiscountSetValidFromAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.productdiscounts.commands.updateactions.SetValidFromAndUntil}</td>
 *   <td>{@link com.commercetools.api.models.product_discount.ProductDiscountSetValidFromAndUntilAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.productdiscounts.commands.updateactions.SetValidUntil}</td>
 *   <td>{@link com.commercetools.api.models.product_discount.ProductDiscountSetValidUntilAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.products.Image}</td>
 *   <td>{@link com.commercetools.api.models.common.Image}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.products.Price}</td>
 *   <td>{@link com.commercetools.api.models.common.Price}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.products.PriceDraft}</td>
 *   <td>{@link com.commercetools.api.models.common.PriceDraft}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.products.PriceTier}</td>
 *   <td>{@link com.commercetools.api.models.common.PriceTier}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.products.Product}</td>
 *   <td>{@link com.commercetools.api.models.product.Product}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.products.ProductCatalogData}</td>
 *   <td>{@link com.commercetools.api.models.product.ProductCatalogData}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.products.ProductData}</td>
 *   <td>{@link com.commercetools.api.models.product.ProductData}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.products.ProductDataLike}</td>
 *   <td>{@link com.commercetools.api.models.product.ProductDataLike}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.products.ProductDraft}</td>
 *   <td>{@link com.commercetools.api.models.product.ProductDraft}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.products.ProductProjection}</td>
 *   <td>{@link com.commercetools.api.models.product.ProductProjection}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.products.ProductVariant}</td>
 *   <td>{@link com.commercetools.api.models.product.ProductVariant}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.products.ProductVariantAvailability}</td>
 *   <td>{@link com.commercetools.api.models.product.ProductVariantAvailability}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.products.ProductVariantDraft}</td>
 *   <td>{@link com.commercetools.api.models.product.ProductVariantDraft}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.products.ScopedPrice}</td>
 *   <td>{@link com.commercetools.api.models.common.ScopedPrice}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.products.Suggestion}</td>
 *   <td>{@link com.commercetools.api.models.product.Suggestion}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.products.SuggestionResult}</td>
 *   <td>{@link com.commercetools.api.models.product.SuggestionResult}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.products.attributes.Attribute}</td>
 *   <td>{@link com.commercetools.api.models.product.Attribute}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.products.attributes.AttributeDefinition}</td>
 *   <td>{@link com.commercetools.api.models.product_type.AttributeDefinition}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.products.attributes.AttributeDefinitionDraft}</td>
 *   <td>{@link com.commercetools.api.models.product_type.AttributeDefinitionDraft}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.products.attributes.AttributeDraft}</td>
 *   <td>{@link com.commercetools.api.models.product.Attribute}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.products.attributes.AttributeType}</td>
 *   <td>{@link com.commercetools.api.models.product_type.AttributeType}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.products.commands.updateactions.AddAsset}</td>
 *   <td>{@link com.commercetools.api.models.product.ProductAddAssetAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.products.commands.updateactions.AddExternalImage}</td>
 *   <td>{@link com.commercetools.api.models.product.ProductAddExternalImageAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.products.commands.updateactions.AddPrice}</td>
 *   <td>{@link com.commercetools.api.models.product.ProductAddPriceAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.products.commands.updateactions.AddToCategory}</td>
 *   <td>{@link com.commercetools.api.models.product.ProductAddToCategoryAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.products.commands.updateactions.AddVariant}</td>
 *   <td>{@link com.commercetools.api.models.product.ProductAddVariantAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.products.commands.updateactions.ChangeAssetName}</td>
 *   <td>{@link com.commercetools.api.models.product.ProductChangeAssetNameAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.products.commands.updateactions.ChangeAssetOrder}</td>
 *   <td>{@link com.commercetools.api.models.product.ProductChangeAssetOrderAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.products.commands.updateactions.ChangeMasterVariant}</td>
 *   <td>{@link com.commercetools.api.models.product.ProductChangeMasterVariantAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.products.commands.updateactions.ChangeName}</td>
 *   <td>{@link com.commercetools.api.models.product.ProductChangeNameAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.products.commands.updateactions.ChangePrice}</td>
 *   <td>{@link com.commercetools.api.models.product.ProductChangePriceAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.products.commands.updateactions.ChangeSlug}</td>
 *   <td>{@link com.commercetools.api.models.product.ProductChangeSlugAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.products.commands.updateactions.LegacySetSku}</td>
 *   <td>{@link com.commercetools.api.models.product.ProductLegacySetSkuAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.products.commands.updateactions.MoveImageToPosition}</td>
 *   <td>{@link com.commercetools.api.models.product.ProductMoveImageToPositionAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.products.commands.updateactions.Publish}</td>
 *   <td>{@link com.commercetools.api.models.product.ProductPublishAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.products.commands.updateactions.RemoveAsset}</td>
 *   <td>{@link com.commercetools.api.models.product.ProductRemoveAssetAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.products.commands.updateactions.RemoveFromCategory}</td>
 *   <td>{@link com.commercetools.api.models.product.ProductRemoveFromCategoryAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.products.commands.updateactions.RemoveImage}</td>
 *   <td>{@link com.commercetools.api.models.product.ProductRemoveImageAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.products.commands.updateactions.RemovePrice}</td>
 *   <td>{@link com.commercetools.api.models.product.ProductRemovePriceAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.products.commands.updateactions.RemoveVariant}</td>
 *   <td>{@link com.commercetools.api.models.product.ProductRemoveVariantAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.products.commands.updateactions.RevertStagedChanges}</td>
 *   <td>{@link com.commercetools.api.models.product.ProductRevertStagedChangesAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.products.commands.updateactions.RevertStagedVariantChanges}</td>
 *   <td>{@link com.commercetools.api.models.product.ProductRevertStagedVariantChangesAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.products.commands.updateactions.SetAssetCustomField}</td>
 *   <td>{@link com.commercetools.api.models.product.ProductSetAssetCustomFieldAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.products.commands.updateactions.SetAssetCustomType}</td>
 *   <td>{@link com.commercetools.api.models.product.ProductSetAssetCustomTypeAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.products.commands.updateactions.SetAssetDescription}</td>
 *   <td>{@link com.commercetools.api.models.product.ProductSetAssetDescriptionAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.products.commands.updateactions.SetAssetKey}</td>
 *   <td>{@link com.commercetools.api.models.product.ProductSetAssetKeyAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.products.commands.updateactions.SetAssetSources}</td>
 *   <td>{@link com.commercetools.api.models.product.ProductSetAssetSourcesAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.products.commands.updateactions.SetAssetTags}</td>
 *   <td>{@link com.commercetools.api.models.product.ProductSetAssetTagsAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.products.commands.updateactions.SetAttribute}</td>
 *   <td>{@link com.commercetools.api.models.product.ProductSetAttributeAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.products.commands.updateactions.SetAttributeInAllVariants}</td>
 *   <td>{@link com.commercetools.api.models.product.ProductSetAttributeInAllVariantsAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.products.commands.updateactions.SetCategoryOrderHint}</td>
 *   <td>{@link com.commercetools.api.models.product.ProductSetCategoryOrderHintAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.products.commands.updateactions.SetDescription}</td>
 *   <td>{@link com.commercetools.api.models.product.ProductSetDescriptionAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.products.commands.updateactions.SetDiscountedPrice}</td>
 *   <td>{@link com.commercetools.api.models.product.ProductSetDiscountedPriceAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.products.commands.updateactions.SetImageLabel}</td>
 *   <td>{@link com.commercetools.api.models.product.ProductSetImageLabelAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.products.commands.updateactions.SetKey}</td>
 *   <td>{@link com.commercetools.api.models.product.ProductSetKeyAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.products.commands.updateactions.SetMetaDescription}</td>
 *   <td>{@link com.commercetools.api.models.product.ProductSetMetaDescriptionAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.products.commands.updateactions.SetMetaKeywords}</td>
 *   <td>{@link com.commercetools.api.models.product.ProductSetMetaKeywordsAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.products.commands.updateactions.SetMetaTitle}</td>
 *   <td>{@link com.commercetools.api.models.product.ProductSetMetaTitleAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.products.commands.updateactions.SetPrices}</td>
 *   <td>{@link com.commercetools.api.models.product.ProductSetPricesAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.products.commands.updateactions.SetProductPriceCustomField}</td>
 *   <td>{@link com.commercetools.api.models.product.ProductSetProductPriceCustomFieldAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.products.commands.updateactions.SetProductPriceCustomType}</td>
 *   <td>{@link com.commercetools.api.models.product.ProductSetProductPriceCustomTypeAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.products.commands.updateactions.SetProductVariantKey}</td>
 *   <td>{@link com.commercetools.api.models.product.ProductSetProductVariantKeyAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.products.commands.updateactions.SetSearchKeywords}</td>
 *   <td>{@link com.commercetools.api.models.product.ProductSetSearchKeywordsAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.products.commands.updateactions.SetSku}</td>
 *   <td>{@link com.commercetools.api.models.product.ProductSetSkuAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.products.commands.updateactions.SetTaxCategory}</td>
 *   <td>{@link com.commercetools.api.models.product.ProductSetTaxCategoryAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.products.commands.updateactions.TransitionState}</td>
 *   <td>{@link com.commercetools.api.models.product.ProductTransitionStateAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.products.commands.updateactions.Unpublish}</td>
 *   <td>{@link com.commercetools.api.models.product.ProductUnpublishAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.productselections.AssignedProductReference}</td>
 *   <td>{@link com.commercetools.api.models.product_selection.AssignedProductReference}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.productselections.AssignedProductSelection}</td>
 *   <td>{@link com.commercetools.api.models.product_selection.AssignedProductSelection}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.productselections.ProductSelection}</td>
 *   <td>{@link com.commercetools.api.models.product_selection.ProductSelection}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.productselections.ProductSelectionAssignment}</td>
 *   <td>{@link com.commercetools.api.models.product_selection.ProductSelectionAssignment}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.productselections.ProductSelectionDraft}</td>
 *   <td>{@link com.commercetools.api.models.product_selection.ProductSelectionDraft}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.productselections.commands.updateactions.AddProduct}</td>
 *   <td>{@link com.commercetools.api.models.product_selection.ProductSelectionAddProductAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.productselections.commands.updateactions.ChangeName}</td>
 *   <td>{@link com.commercetools.api.models.product_selection.ProductSelectionChangeNameAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.productselections.commands.updateactions.RemoveProduct}</td>
 *   <td>{@link com.commercetools.api.models.product_selection.ProductSelectionRemoveProductAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.productselections.commands.updateactions.SetKey}</td>
 *   <td>{@link com.commercetools.api.models.product_selection.ProductSelectionSetKeyAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.producttypes.ProductType}</td>
 *   <td>{@link com.commercetools.api.models.product_type.ProductType}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.producttypes.ProductTypeDraft}</td>
 *   <td>{@link com.commercetools.api.models.product_type.ProductTypeDraft}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.producttypes.commands.updateactions.AddAttributeDefinition}</td>
 *   <td>{@link com.commercetools.api.models.product_type.ProductTypeAddAttributeDefinitionAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.producttypes.commands.updateactions.AddEnumValue}</td>
 *   <td>{@link com.commercetools.api.models.product_type.ProductTypeAddPlainEnumValueAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.producttypes.commands.updateactions.AddLocalizedEnumValue}</td>
 *   <td>{@link com.commercetools.api.models.product_type.ProductTypeAddLocalizedEnumValueAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.producttypes.commands.updateactions.ChangeAttributeConstraint}</td>
 *   <td>{@link com.commercetools.api.models.product_type.ProductTypeChangeAttributeConstraintAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.producttypes.commands.updateactions.ChangeAttributeDefinitionLabel}</td>
 *   <td>{@link com.commercetools.api.models.product_type.ProductTypeChangeLabelAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.producttypes.commands.updateactions.ChangeAttributeName}</td>
 *   <td>{@link com.commercetools.api.models.product_type.ProductTypeChangeAttributeNameAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.producttypes.commands.updateactions.ChangeAttributeOrder}</td>
 *   <td>removed</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.producttypes.commands.updateactions.ChangeAttributeOrderByName}</td>
 *   <td>{@link com.commercetools.api.models.product_type.ProductTypeChangeAttributeOrderByNameAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.producttypes.commands.updateactions.ChangeDescription}</td>
 *   <td>{@link com.commercetools.api.models.product_type.ProductTypeChangeDescriptionAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.producttypes.commands.updateactions.ChangeEnumKey}</td>
 *   <td>{@link com.commercetools.api.models.product_type.ProductTypeChangeEnumKeyAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.producttypes.commands.updateactions.ChangeEnumValueOrder}</td>
 *   <td>{@link com.commercetools.api.models.product_type.ProductTypeChangePlainEnumValueOrderAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.producttypes.commands.updateactions.ChangeInputHint}</td>
 *   <td>{@link com.commercetools.api.models.product_type.ProductTypeChangeInputHintAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.producttypes.commands.updateactions.ChangeIsSearchable}</td>
 *   <td>{@link com.commercetools.api.models.product_type.ProductTypeChangeIsSearchableAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.producttypes.commands.updateactions.ChangeLocalizedEnumValueLabel}</td>
 *   <td>{@link com.commercetools.api.models.product_type.ProductTypeChangeLocalizedEnumValueLabelAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.producttypes.commands.updateactions.ChangeLocalizedEnumValueOrder}</td>
 *   <td>{@link com.commercetools.api.models.product_type.ProductTypeChangeLocalizedEnumValueOrderAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.producttypes.commands.updateactions.ChangeName}</td>
 *   <td>{@link com.commercetools.api.models.product_type.ProductTypeChangeNameAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.producttypes.commands.updateactions.ChangePlainEnumValueLabel}</td>
 *   <td>{@link com.commercetools.api.models.product_type.ProductTypeChangePlainEnumValueLabelAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.producttypes.commands.updateactions.RemoveAttributeDefinition}</td>
 *   <td>{@link com.commercetools.api.models.product_type.ProductTypeRemoveAttributeDefinitionAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.producttypes.commands.updateactions.RemoveEnumValues}</td>
 *   <td>{@link com.commercetools.api.models.product_type.ProductTypeRemoveEnumValuesAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.producttypes.commands.updateactions.SetInputTip}</td>
 *   <td>{@link com.commercetools.api.models.product_type.ProductTypeSetInputTipAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.producttypes.commands.updateactions.SetKey}</td>
 *   <td>{@link com.commercetools.api.models.product_type.ProductTypeSetKeyAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.projects.CartClassification}</td>
 *   <td>{@link com.commercetools.api.models.project.CartClassificationType}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.projects.CartClassificationDraft}</td>
 *   <td>{@link com.commercetools.api.models.project.CartClassificationType}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.projects.CartScore}</td>
 *   <td>{@link com.commercetools.api.models.project.CartScoreType}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.projects.CartScoreDraft}</td>
 *   <td>{@link com.commercetools.api.models.project.CartScoreType}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.projects.CartValue}</td>
 *   <td>{@link com.commercetools.api.models.project.CartValueType}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.projects.CartValueDraft}</td>
 *   <td>{@link com.commercetools.api.models.project.CartValueType}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.projects.ExternalOAuth}</td>
 *   <td>{@link com.commercetools.api.models.project.ExternalOAuth}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.projects.MessagesConfiguration}</td>
 *   <td>{@link com.commercetools.api.models.message.MessagesConfiguration}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.projects.MessagesConfigurationDraft}</td>
 *   <td>{@link com.commercetools.api.models.message.MessagesConfigurationDraft}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.projects.Project}</td>
 *   <td>{@link com.commercetools.api.models.project.Project}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.projects.SearchIndexingConfiguration}</td>
 *   <td>{@link com.commercetools.api.models.project.SearchIndexingConfiguration}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.projects.SearchIndexingConfigurationValues}</td>
 *   <td>{@link com.commercetools.api.models.project.SearchIndexingConfigurationValues}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.projects.ShippingRateInputType}</td>
 *   <td>{@link com.commercetools.api.models.project.ShippingRateInputType}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.projects.ShippingRateInputTypeDraft}</td>
 *   <td>{@link com.commercetools.api.models.project.ShippingRateInputType}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.projects.commands.updateactions.ChangeCartsConfiguration}</td>
 *   <td>{@link com.commercetools.api.models.project.ProjectChangeCartsConfigurationAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.projects.commands.updateactions.ChangeCountries}</td>
 *   <td>{@link com.commercetools.api.models.project.ProjectChangeCountriesAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.projects.commands.updateactions.ChangeCountryTaxRateFallbackEnabled}</td>
 *   <td>{@link com.commercetools.api.models.project.ProjectChangeCountryTaxRateFallbackEnabledAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.projects.commands.updateactions.ChangeCurrencies}</td>
 *   <td>{@link com.commercetools.api.models.project.ProjectChangeCurrenciesAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.projects.commands.updateactions.ChangeLanguages}</td>
 *   <td>{@link com.commercetools.api.models.project.ProjectChangeLanguagesAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.projects.commands.updateactions.ChangeMessages}</td>
 *   <td>removed</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.projects.commands.updateactions.ChangeMessagesConfiguration}</td>
 *   <td>{@link com.commercetools.api.models.project.ProjectChangeMessagesConfigurationAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.projects.commands.updateactions.ChangeMessagesEnabled}</td>
 *   <td>removed</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.projects.commands.updateactions.ChangeName}</td>
 *   <td>{@link com.commercetools.api.models.project.ProjectChangeNameAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.projects.commands.updateactions.ChangeProductSearchIndexingEnabled}</td>
 *   <td>{@link com.commercetools.api.models.project.ProjectChangeProductSearchIndexingEnabledAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.projects.commands.updateactions.ChangeShoppingListsConfiguration}</td>
 *   <td>{@link com.commercetools.api.models.project.ProjectChangeShoppingListsConfigurationAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.projects.commands.updateactions.SetExternalOAuth}</td>
 *   <td>{@link com.commercetools.api.models.project.ProjectSetExternalOAuthAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.projects.commands.updateactions.SetShippingRateInputType}</td>
 *   <td>{@link com.commercetools.api.models.project.ProjectSetShippingRateInputTypeAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.reviews.Review}</td>
 *   <td>{@link com.commercetools.api.models.review.Review}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.reviews.ReviewDraft}</td>
 *   <td>{@link com.commercetools.api.models.review.ReviewDraft}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.reviews.ReviewRatingStatistics}</td>
 *   <td>{@link com.commercetools.api.models.review.ReviewRatingStatistics}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.reviews.commands.updateactions.SetAuthorName}</td>
 *   <td>{@link com.commercetools.api.models.review.ReviewSetAuthorNameAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.reviews.commands.updateactions.SetCustomField}</td>
 *   <td>{@link com.commercetools.api.models.review.ReviewSetCustomFieldAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.reviews.commands.updateactions.SetCustomType}</td>
 *   <td>{@link com.commercetools.api.models.review.ReviewSetCustomTypeAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.reviews.commands.updateactions.SetCustomer}</td>
 *   <td>{@link com.commercetools.api.models.review.ReviewSetCustomerAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.reviews.commands.updateactions.SetKey}</td>
 *   <td>{@link com.commercetools.api.models.review.ReviewSetKeyAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.reviews.commands.updateactions.SetLocale}</td>
 *   <td>{@link com.commercetools.api.models.review.ReviewSetLocaleAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.reviews.commands.updateactions.SetRating}</td>
 *   <td>{@link com.commercetools.api.models.review.ReviewSetRatingAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.reviews.commands.updateactions.SetTarget}</td>
 *   <td>{@link com.commercetools.api.models.review.ReviewSetTargetAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.reviews.commands.updateactions.SetText}</td>
 *   <td>{@link com.commercetools.api.models.review.ReviewSetTextAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.reviews.commands.updateactions.SetTitle}</td>
 *   <td>{@link com.commercetools.api.models.review.ReviewSetTitleAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.reviews.commands.updateactions.TransitionState}</td>
 *   <td>{@link com.commercetools.api.models.review.ReviewTransitionStateAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.shippingmethods.CartClassification}</td>
 *   <td>{@link com.commercetools.api.models.shipping_method.CartClassificationTier}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.shippingmethods.CartScore}</td>
 *   <td>{@link com.commercetools.api.models.shipping_method.CartScoreTier}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.shippingmethods.CartValue}</td>
 *   <td>{@link com.commercetools.api.models.shipping_method.CartValueTier}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.shippingmethods.PriceFunction}</td>
 *   <td>{@link com.commercetools.api.models.shipping_method.PriceFunction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.shippingmethods.ShippingMethod}</td>
 *   <td>{@link com.commercetools.api.models.shipping_method.ShippingMethod}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.shippingmethods.ShippingMethodDraft}</td>
 *   <td>{@link com.commercetools.api.models.shipping_method.ShippingMethodDraft}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.shippingmethods.ShippingRate}</td>
 *   <td>{@link com.commercetools.api.models.shipping_method.ShippingRate}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.shippingmethods.ShippingRatePriceTier}</td>
 *   <td>{@link com.commercetools.api.models.shipping_method.ShippingRatePriceTier}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.shippingmethods.ZoneRate}</td>
 *   <td>{@link com.commercetools.api.models.shipping_method.ZoneRate}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.shippingmethods.ZoneRateDraft}</td>
 *   <td>{@link com.commercetools.api.models.shipping_method.ZoneRateDraft}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.shippingmethods.commands.updateactions.AddShippingRate}</td>
 *   <td>{@link com.commercetools.api.models.shipping_method.ShippingMethodAddShippingRateAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.shippingmethods.commands.updateactions.AddZone}</td>
 *   <td>{@link com.commercetools.api.models.shipping_method.ShippingMethodAddZoneAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.shippingmethods.commands.updateactions.ChangeIsDefault}</td>
 *   <td>{@link com.commercetools.api.models.shipping_method.ShippingMethodChangeIsDefaultAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.shippingmethods.commands.updateactions.ChangeName}</td>
 *   <td>{@link com.commercetools.api.models.shipping_method.ShippingMethodChangeNameAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.shippingmethods.commands.updateactions.ChangeTaxCategory}</td>
 *   <td>{@link com.commercetools.api.models.shipping_method.ShippingMethodChangeTaxCategoryAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.shippingmethods.commands.updateactions.RemoveShippingRate}</td>
 *   <td>{@link com.commercetools.api.models.shipping_method.ShippingMethodRemoveShippingRateAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.shippingmethods.commands.updateactions.RemoveZone}</td>
 *   <td>{@link com.commercetools.api.models.shipping_method.ShippingMethodRemoveZoneAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.shippingmethods.commands.updateactions.SetCustomField}</td>
 *   <td>{@link com.commercetools.api.models.shipping_method.ShippingMethodSetCustomFieldAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.shippingmethods.commands.updateactions.SetCustomType}</td>
 *   <td>{@link com.commercetools.api.models.shipping_method.ShippingMethodSetCustomTypeAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.shippingmethods.commands.updateactions.SetDescription}</td>
 *   <td>{@link com.commercetools.api.models.shipping_method.ShippingMethodSetDescriptionAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.shippingmethods.commands.updateactions.SetKey}</td>
 *   <td>{@link com.commercetools.api.models.shipping_method.ShippingMethodSetKeyAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.shippingmethods.commands.updateactions.SetLocalizedDescription}</td>
 *   <td>{@link com.commercetools.api.models.shipping_method.ShippingMethodSetLocalizedDescriptionAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.shippingmethods.commands.updateactions.SetLocalizedName}</td>
 *   <td>{@link com.commercetools.api.models.shipping_method.ShippingMethodSetLocalizedNameAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.shippingmethods.commands.updateactions.SetPredicate}</td>
 *   <td>{@link com.commercetools.api.models.shipping_method.ShippingMethodSetPredicateAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.shoppinglists.LineItem}</td>
 *   <td>{@link com.commercetools.api.models.shopping_list.ShoppingListLineItem}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.shoppinglists.LineItemDraft}</td>
 *   <td>{@link com.commercetools.api.models.shopping_list.ShoppingListLineItemDraft}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.shoppinglists.ShoppingList}</td>
 *   <td>{@link com.commercetools.api.models.shopping_list.ShoppingList}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.shoppinglists.ShoppingListDraft}</td>
 *   <td>{@link com.commercetools.api.models.shopping_list.ShoppingListDraft}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.shoppinglists.TextLineItem}</td>
 *   <td>{@link com.commercetools.api.models.shopping_list.TextLineItem}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.shoppinglists.TextLineItemDraft}</td>
 *   <td>{@link com.commercetools.api.models.shopping_list.TextLineItemDraft}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.shoppinglists.commands.updateactions.AddLineItem}</td>
 *   <td>{@link com.commercetools.api.models.shopping_list.ShoppingListAddLineItemAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.shoppinglists.commands.updateactions.AddTextLineItem}</td>
 *   <td>{@link com.commercetools.api.models.shopping_list.ShoppingListAddTextLineItemAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.shoppinglists.commands.updateactions.ChangeLineItemQuantity}</td>
 *   <td>{@link com.commercetools.api.models.shopping_list.ShoppingListChangeLineItemQuantityAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.shoppinglists.commands.updateactions.ChangeLineItemsOrder}</td>
 *   <td>{@link com.commercetools.api.models.shopping_list.ShoppingListChangeLineItemsOrderAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.shoppinglists.commands.updateactions.ChangeName}</td>
 *   <td>{@link com.commercetools.api.models.shopping_list.ShoppingListChangeNameAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.shoppinglists.commands.updateactions.ChangeTextLineItemName}</td>
 *   <td>{@link com.commercetools.api.models.shopping_list.ShoppingListChangeTextLineItemNameAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.shoppinglists.commands.updateactions.ChangeTextLineItemQuantity}</td>
 *   <td>{@link com.commercetools.api.models.shopping_list.ShoppingListChangeTextLineItemQuantityAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.shoppinglists.commands.updateactions.ChangeTextLineItemsOrder}</td>
 *   <td>{@link com.commercetools.api.models.shopping_list.ShoppingListChangeTextLineItemsOrderAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.shoppinglists.commands.updateactions.RemoveLineItem}</td>
 *   <td>{@link com.commercetools.api.models.shopping_list.ShoppingListRemoveLineItemAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.shoppinglists.commands.updateactions.RemoveTextLineItem}</td>
 *   <td>{@link com.commercetools.api.models.shopping_list.ShoppingListRemoveTextLineItemAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.shoppinglists.commands.updateactions.SetAnonymousId}</td>
 *   <td>{@link com.commercetools.api.models.shopping_list.ShoppingListSetAnonymousIdAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.shoppinglists.commands.updateactions.SetCustomField}</td>
 *   <td>{@link com.commercetools.api.models.shopping_list.ShoppingListSetCustomFieldAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.shoppinglists.commands.updateactions.SetCustomType}</td>
 *   <td>{@link com.commercetools.api.models.shopping_list.ShoppingListSetCustomTypeAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.shoppinglists.commands.updateactions.SetCustomer}</td>
 *   <td>{@link com.commercetools.api.models.shopping_list.ShoppingListSetCustomerAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.shoppinglists.commands.updateactions.SetDeleteDaysAfterLastModification}</td>
 *   <td>{@link com.commercetools.api.models.shopping_list.ShoppingListSetDeleteDaysAfterLastModificationAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.shoppinglists.commands.updateactions.SetDescription}</td>
 *   <td>{@link com.commercetools.api.models.shopping_list.ShoppingListSetDescriptionAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.shoppinglists.commands.updateactions.SetKey}</td>
 *   <td>{@link com.commercetools.api.models.shopping_list.ShoppingListSetKeyAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.shoppinglists.commands.updateactions.SetLineItemCustomField}</td>
 *   <td>{@link com.commercetools.api.models.shopping_list.ShoppingListSetLineItemCustomFieldAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.shoppinglists.commands.updateactions.SetLineItemCustomType}</td>
 *   <td>{@link com.commercetools.api.models.shopping_list.ShoppingListSetLineItemCustomTypeAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.shoppinglists.commands.updateactions.SetSlug}</td>
 *   <td>{@link com.commercetools.api.models.shopping_list.ShoppingListSetSlugAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.shoppinglists.commands.updateactions.SetStore}</td>
 *   <td>{@link com.commercetools.api.models.shopping_list.ShoppingListSetStoreAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.shoppinglists.commands.updateactions.SetTextLineItemCustomField}</td>
 *   <td>{@link com.commercetools.api.models.shopping_list.ShoppingListSetTextLineItemCustomFieldAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.shoppinglists.commands.updateactions.SetTextLineItemCustomType}</td>
 *   <td>{@link com.commercetools.api.models.shopping_list.ShoppingListSetTextLineItemCustomTypeAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.shoppinglists.commands.updateactions.SetTextLineItemDescription}</td>
 *   <td>{@link com.commercetools.api.models.shopping_list.ShoppingListSetTextLineItemDescriptionAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.states.State}</td>
 *   <td>{@link com.commercetools.api.models.state.State}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.states.StateDraft}</td>
 *   <td>{@link com.commercetools.api.models.state.StateDraft}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.states.commands.updateactions.AddRoles}</td>
 *   <td>{@link com.commercetools.api.models.state.StateAddRolesAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.states.commands.updateactions.ChangeInitial}</td>
 *   <td>{@link com.commercetools.api.models.state.StateChangeInitialAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.states.commands.updateactions.ChangeKey}</td>
 *   <td>{@link com.commercetools.api.models.state.StateChangeKeyAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.states.commands.updateactions.ChangeType}</td>
 *   <td>{@link com.commercetools.api.models.state.StateChangeTypeAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.states.commands.updateactions.RemoveRoles}</td>
 *   <td>{@link com.commercetools.api.models.state.StateRemoveRolesAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.states.commands.updateactions.SetDescription}</td>
 *   <td>{@link com.commercetools.api.models.state.StateSetDescriptionAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.states.commands.updateactions.SetName}</td>
 *   <td>{@link com.commercetools.api.models.state.StateSetNameAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.states.commands.updateactions.SetRoles}</td>
 *   <td>{@link com.commercetools.api.models.state.StateSetRolesAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.states.commands.updateactions.SetTransitions}</td>
 *   <td>{@link com.commercetools.api.models.state.StateSetTransitionsAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.stores.ProductSelectionSetting}</td>
 *   <td>{@link com.commercetools.api.models.store.ProductSelectionSetting}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.stores.ProductSelectionSettingDraft}</td>
 *   <td>{@link com.commercetools.api.models.store.ProductSelectionSettingDraft}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.stores.Store}</td>
 *   <td>{@link com.commercetools.api.models.store.Store}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.stores.StoreDraft}</td>
 *   <td>{@link com.commercetools.api.models.store.StoreDraft}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.stores.commands.updateactions.AddDistributionChannel}</td>
 *   <td>{@link com.commercetools.api.models.store.StoreAddDistributionChannelAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.stores.commands.updateactions.AddProductSelection}</td>
 *   <td>{@link com.commercetools.api.models.store.StoreAddProductSelectionAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.stores.commands.updateactions.AddSupplyChannel}</td>
 *   <td>{@link com.commercetools.api.models.store.StoreAddSupplyChannelAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.stores.commands.updateactions.ChangeProductSelection}</td>
 *   <td>{@link com.commercetools.api.models.store.StoreChangeProductSelectionAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.stores.commands.updateactions.RemoveDistributionChannel}</td>
 *   <td>{@link com.commercetools.api.models.store.StoreRemoveDistributionChannelAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.stores.commands.updateactions.RemoveProductSelection}</td>
 *   <td>{@link com.commercetools.api.models.store.StoreRemoveProductSelectionAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.stores.commands.updateactions.RemoveSupplyChannel}</td>
 *   <td>{@link com.commercetools.api.models.store.StoreRemoveSupplyChannelAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.stores.commands.updateactions.SetCustomField}</td>
 *   <td>{@link com.commercetools.api.models.store.StoreSetCustomFieldAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.stores.commands.updateactions.SetCustomType}</td>
 *   <td>{@link com.commercetools.api.models.store.StoreSetCustomTypeAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.stores.commands.updateactions.SetDistributionChannels}</td>
 *   <td>{@link com.commercetools.api.models.store.StoreSetDistributionChannelsAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.stores.commands.updateactions.SetLanguages}</td>
 *   <td>{@link com.commercetools.api.models.store.StoreSetLanguagesAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.stores.commands.updateactions.SetName}</td>
 *   <td>{@link com.commercetools.api.models.store.StoreSetNameAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.stores.commands.updateactions.SetProductSelections}</td>
 *   <td>{@link com.commercetools.api.models.store.StoreSetProductSelectionsAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.stores.commands.updateactions.SetSupplyChannels}</td>
 *   <td>{@link com.commercetools.api.models.store.StoreSetSupplyChannelsAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.subscriptions.AzureServiceBusDestination}</td>
 *   <td>{@link com.commercetools.api.models.subscription.AzureServiceBusDestination}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.subscriptions.ChangeSubscription}</td>
 *   <td>{@link com.commercetools.api.models.subscription.ChangeSubscription}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.subscriptions.Destination}</td>
 *   <td>{@link com.commercetools.api.models.subscription.Destination}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.subscriptions.IronMqDestination}</td>
 *   <td>{@link com.commercetools.api.models.subscription.IronMqDestination}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.subscriptions.MessageSubscription}</td>
 *   <td>{@link com.commercetools.api.models.subscription.MessageSubscription}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.subscriptions.MessageSubscriptionPayload}</td>
 *   <td>{@link com.commercetools.api.models.subscription.MessageDeliveryPayload}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.subscriptions.Payload}</td>
 *   <td>{@link com.commercetools.api.models.subscription.DeliveryPayload}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.subscriptions.PayloadNotIncluded}</td>
 *   <td>{@link com.commercetools.api.models.subscription.PayloadNotIncluded}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.subscriptions.PubSubDestination}</td>
 *   <td>{@link com.commercetools.api.models.subscription.GoogleCloudPubSubDestination}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.subscriptions.ResourceCreatedPayload}</td>
 *   <td>{@link com.commercetools.api.models.subscription.ResourceCreatedDeliveryPayload}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.subscriptions.ResourceDeletedPayload}</td>
 *   <td>{@link com.commercetools.api.models.subscription.ResourceDeletedDeliveryPayload}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.subscriptions.ResourceUpdatedPayload}</td>
 *   <td>{@link com.commercetools.api.models.subscription.ResourceUpdatedDeliveryPayload}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.subscriptions.SnsDestination}</td>
 *   <td>{@link com.commercetools.api.models.subscription.SnsDestination}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.subscriptions.SqsDestination}</td>
 *   <td>{@link com.commercetools.api.models.subscription.SqsDestination}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.subscriptions.Subscription}</td>
 *   <td>{@link com.commercetools.api.models.subscription.Subscription}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.subscriptions.SubscriptionDraft}</td>
 *   <td>{@link com.commercetools.api.models.subscription.SubscriptionDraft}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.subscriptions.commands.updateactions.ChangeDestination}</td>
 *   <td>{@link com.commercetools.api.models.subscription.SubscriptionChangeDestinationAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.subscriptions.commands.updateactions.SetChanges}</td>
 *   <td>{@link com.commercetools.api.models.subscription.SubscriptionSetChangesAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.subscriptions.commands.updateactions.SetKey}</td>
 *   <td>{@link com.commercetools.api.models.subscription.SubscriptionSetKeyAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.subscriptions.commands.updateactions.SetMessages}</td>
 *   <td>{@link com.commercetools.api.models.subscription.SubscriptionSetMessagesAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.taxcategories.ExternalTaxRateDraft}</td>
 *   <td>{@link com.commercetools.api.models.cart.ExternalTaxRateDraft}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.taxcategories.SubRate}</td>
 *   <td>{@link com.commercetools.api.models.tax_category.SubRate}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.taxcategories.TaxCategory}</td>
 *   <td>{@link com.commercetools.api.models.tax_category.TaxCategory}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.taxcategories.TaxCategoryDraft}</td>
 *   <td>{@link com.commercetools.api.models.tax_category.TaxCategoryDraft}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.taxcategories.TaxRate}</td>
 *   <td>{@link com.commercetools.api.models.tax_category.TaxRate}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.taxcategories.TaxRateDraft}</td>
 *   <td>{@link com.commercetools.api.models.tax_category.TaxRateDraft}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.taxcategories.commands.updateactions.AddTaxRate}</td>
 *   <td>{@link com.commercetools.api.models.tax_category.TaxCategoryAddTaxRateAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.taxcategories.commands.updateactions.ChangeName}</td>
 *   <td>{@link com.commercetools.api.models.tax_category.TaxCategoryChangeNameAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.taxcategories.commands.updateactions.RemoveTaxRate}</td>
 *   <td>{@link com.commercetools.api.models.tax_category.TaxCategoryRemoveTaxRateAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.taxcategories.commands.updateactions.ReplaceTaxRate}</td>
 *   <td>{@link com.commercetools.api.models.tax_category.TaxCategoryReplaceTaxRateAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.taxcategories.commands.updateactions.SetDescription}</td>
 *   <td>{@link com.commercetools.api.models.tax_category.TaxCategorySetDescriptionAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.taxcategories.commands.updateactions.SetKey}</td>
 *   <td>{@link com.commercetools.api.models.tax_category.TaxCategorySetKeyAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.types.Custom}</td>
 *   <td>{@link com.commercetools.api.models.Customizable}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.types.CustomDraft}</td>
 *   <td>{@link com.commercetools.api.models.CustomizableDraft}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.types.CustomFields}</td>
 *   <td>{@link com.commercetools.api.models.type.CustomFields}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.types.CustomFieldsDraft}</td>
 *   <td>{@link com.commercetools.api.models.type.CustomFieldsDraft}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.types.FieldDefinition}</td>
 *   <td>{@link com.commercetools.api.models.type.FieldDefinition}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.types.FieldType}</td>
 *   <td>{@link com.commercetools.api.models.type.FieldType}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.types.Type}</td>
 *   <td>{@link com.commercetools.api.models.type.Type}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.types.TypeDraft}</td>
 *   <td>{@link com.commercetools.api.models.type.TypeDraft}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.types.commands.updateactions.AddEnumValue}</td>
 *   <td>{@link com.commercetools.api.models.type.TypeAddEnumValueAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.types.commands.updateactions.AddFieldDefinition}</td>
 *   <td>{@link com.commercetools.api.models.type.TypeAddFieldDefinitionAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.types.commands.updateactions.AddLocalizedEnumValue}</td>
 *   <td>{@link com.commercetools.api.models.type.TypeAddLocalizedEnumValueAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.types.commands.updateactions.ChangeEnumValueLabel}</td>
 *   <td>{@link com.commercetools.api.models.type.TypeChangeEnumValueLabelAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.types.commands.updateactions.ChangeEnumValueOrder}</td>
 *   <td>{@link com.commercetools.api.models.type.TypeChangeEnumValueOrderAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.types.commands.updateactions.ChangeFieldDefinitionLabel}</td>
 *   <td>{@link com.commercetools.api.models.type.TypeChangeLabelAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.types.commands.updateactions.ChangeFieldDefinitionOrder}</td>
 *   <td>{@link com.commercetools.api.models.type.TypeChangeFieldDefinitionOrderAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.types.commands.updateactions.ChangeInputHint}</td>
 *   <td>{@link com.commercetools.api.models.type.TypeChangeInputHintAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.types.commands.updateactions.ChangeKey}</td>
 *   <td>{@link com.commercetools.api.models.type.TypeChangeKeyAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.types.commands.updateactions.ChangeLocalizedEnumValueLabel}</td>
 *   <td>{@link com.commercetools.api.models.type.TypeChangeLocalizedEnumValueLabelAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.types.commands.updateactions.ChangeLocalizedEnumValueOrder}</td>
 *   <td>{@link com.commercetools.api.models.type.TypeChangeLocalizedEnumValueOrderAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.types.commands.updateactions.ChangeName}</td>
 *   <td>{@link com.commercetools.api.models.type.TypeChangeNameAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.types.commands.updateactions.RemoveFieldDefinition}</td>
 *   <td>{@link com.commercetools.api.models.type.TypeRemoveFieldDefinitionAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.types.commands.updateactions.SetDescription}</td>
 *   <td>{@link com.commercetools.api.models.type.TypeSetDescriptionAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.zones.Location}</td>
 *   <td>{@link com.commercetools.api.models.zone.Location}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.zones.Zone}</td>
 *   <td>{@link com.commercetools.api.models.zone.Zone}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.zones.ZoneDraft}</td>
 *   <td>{@link com.commercetools.api.models.zone.ZoneDraft}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.zones.commands.updateactions.AddLocation}</td>
 *   <td>{@link com.commercetools.api.models.zone.ZoneAddLocationAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.zones.commands.updateactions.ChangeName}</td>
 *   <td>{@link com.commercetools.api.models.zone.ZoneChangeNameAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.zones.commands.updateactions.RemoveLocation}</td>
 *   <td>{@link com.commercetools.api.models.zone.ZoneRemoveLocationAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.zones.commands.updateactions.SetDescription}</td>
 *   <td>{@link com.commercetools.api.models.zone.ZoneSetDescriptionAction}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.zones.commands.updateactions.SetKey}</td>
 *   <td>{@link com.commercetools.api.models.zone.ZoneSetKeyAction}</td>
 * </tr>
 * </table>
 *
 * <h2>Classes with no representation in the v2 SDK</h2>
 *
 * <table>
 * <tr>
 *   <td>{@link io.sphere.sdk.cartdiscounts.CartDiscountPredicate}</td>
 *   <td>n/a</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.cartdiscounts.CartPredicate}</td>
 *   <td>n/a</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.carts.LineItemLike}</td>
 *   <td>n/a</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.inventory.AvailabilityInfo}</td>
 *   <td>n/a</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.messages.GenericMessage}</td>
 *   <td>n/a</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.orders.messages.SimpleOrderMessage}</td>
 *   <td>n/a</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.productdiscounts.ProductDiscountPredicate}</td>
 *   <td>n/a</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.products.AttributeContainer}</td>
 *   <td>n/a</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.products.AttributeContainerDraft}</td>
 *   <td>n/a</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.products.ByIdVariantIdentifier}</td>
 *   <td>n/a</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.products.BySkuVariantIdentifier}</td>
 *   <td>n/a</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.products.PriceLike}</td>
 *   <td>n/a</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.products.ProductIdentifiable}</td>
 *   <td>n/a</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.products.ProductLike}</td>
 *   <td>n/a</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.products.VariantIdentifier}</td>
 *   <td>n/a</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.products.attributes.AttributeAccess}</td>
 *   <td>n/a</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.products.attributes.AttributeImportDraft}</td>
 *   <td>n/a</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.products.attributes.AttributeMapper}</td>
 *   <td>n/a</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.products.attributes.NamedAttributeAccess}</td>
 *   <td>n/a</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.products.attributes.ProductAttributeConverter}</td>
 *   <td>n/a</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.products.commands.updateactions.MetaAttributesUpdateActions}</td>
 *   <td>n/a</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.products.messages.SimpleProductMessage}</td>
 *   <td>n/a</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.producttypes.AttributeDefinitionContainer}</td>
 *   <td>n/a</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.producttypes.MetaProductType}</td>
 *   <td>n/a</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.producttypes.ProductTypeLocalRepository}</td>
 *   <td>n/a</td>
 * </tr>
 * </table>
 *
 * <h2>Package name changes</h2>
 *
 * Please be aware that shows to which package a class may have been moved based on the source package
 * <table>
 * <tr><th>v1</td><th>v2</th></tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.apiclient}</td>
 *   <td>{@link com.commercetools.api.models.api_client}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.cartdiscounts}</td>
 *   <td>{@link com.commercetools.api.models.cart_discount, com.commercetools.api.models.cart}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.cartdiscounts.commands.updateactions}</td>
 *   <td>{@link com.commercetools.api.models.cart_discount}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.carts}</td>
 *   <td>{@link com.commercetools.api.models.cart, com.commercetools.api.models.order, com.commercetools.api.models.project}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.carts.commands.updateactions}</td>
 *   <td>{@link com.commercetools.api.models.cart}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.categories}</td>
 *   <td>{@link com.commercetools.api.models.category}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.categories.commands.updateactions}</td>
 *   <td>{@link com.commercetools.api.models.category}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.channels}</td>
 *   <td>{@link com.commercetools.api.models.channel}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.channels.commands.updateactions}</td>
 *   <td>{@link com.commercetools.api.models.channel}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.customergroups}</td>
 *   <td>{@link com.commercetools.api.models.customer_group}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.customergroups.commands.updateactions}</td>
 *   <td>{@link com.commercetools.api.models.customer_group}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.customers}</td>
 *   <td>{@link com.commercetools.api.models.customer}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.customers.commands.updateactions}</td>
 *   <td>{@link com.commercetools.api.models.customer}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.customobjects}</td>
 *   <td>{@link com.commercetools.api.models.custom_object}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.discountcodes}</td>
 *   <td>{@link com.commercetools.api.models.discount_code, com.commercetools.api.models.cart}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.discountcodes.commands.updateactions}</td>
 *   <td>{@link com.commercetools.api.models.discount_code}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.extensions}</td>
 *   <td>{@link com.commercetools.api.models.extension}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.extensions.commands.updateactions}</td>
 *   <td>{@link com.commercetools.api.models.extension}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.inventory}</td>
 *   <td>{@link com.commercetools.api.models.inventory}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.inventory.commands.updateactions}</td>
 *   <td>{@link com.commercetools.api.models.inventory}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.messages}</td>
 *   <td>{@link com.commercetools.api.models.message}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.models}</td>
 *   <td>{@link com.commercetools.api.models.common, com.commercetools.api.models.message}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.orderedits}</td>
 *   <td>{@link com.commercetools.api.models.order_edit}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.orderedits.commands.updateactions}</td>
 *   <td>{@link com.commercetools.api.models.order_edit}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.orders}</td>
 *   <td>{@link com.commercetools.api.models.cart, com.commercetools.api.models.order}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.orders.commands.updateactions}</td>
 *   <td>{@link com.commercetools.api.models.order}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.orders.messages}</td>
 *   <td>{@link com.commercetools.api.models.message}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.payments}</td>
 *   <td>{@link com.commercetools.api.models.payment}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.payments.commands.updateactions}</td>
 *   <td>{@link com.commercetools.api.models.payment}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.productdiscounts}</td>
 *   <td>{@link com.commercetools.api.models.common, com.commercetools.api.models.product_discount}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.productdiscounts.commands.updateactions}</td>
 *   <td>{@link com.commercetools.api.models.product_discount}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.products}</td>
 *   <td>{@link com.commercetools.api.models.common, com.commercetools.api.models.product}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.products.attributes}</td>
 *   <td>{@link com.commercetools.api.models.product, com.commercetools.api.models.product_type}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.products.commands.updateactions}</td>
 *   <td>{@link com.commercetools.api.models.product}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.productselections}</td>
 *   <td>{@link com.commercetools.api.models.product_selection}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.productselections.commands.updateactions}</td>
 *   <td>{@link com.commercetools.api.models.product_selection}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.producttypes}</td>
 *   <td>{@link com.commercetools.api.models.product_type}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.producttypes.commands.updateactions}</td>
 *   <td>{@link com.commercetools.api.models.product_type}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.projects}</td>
 *   <td>{@link com.commercetools.api.models.project, com.commercetools.api.models.message}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.projects.commands.updateactions}</td>
 *   <td>{@link com.commercetools.api.models.project}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.reviews}</td>
 *   <td>{@link com.commercetools.api.models.review}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.reviews.commands.updateactions}</td>
 *   <td>{@link com.commercetools.api.models.review}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.shippingmethods}</td>
 *   <td>{@link com.commercetools.api.models.shipping_method}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.shippingmethods.commands.updateactions}</td>
 *   <td>{@link com.commercetools.api.models.shipping_method}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.shoppinglists}</td>
 *   <td>{@link com.commercetools.api.models.shopping_list}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.shoppinglists.commands.updateactions}</td>
 *   <td>{@link com.commercetools.api.models.shopping_list}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.states}</td>
 *   <td>{@link com.commercetools.api.models.state}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.states.commands.updateactions}</td>
 *   <td>{@link com.commercetools.api.models.state}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.stores}</td>
 *   <td>{@link com.commercetools.api.models.store}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.stores.commands.updateactions}</td>
 *   <td>{@link com.commercetools.api.models.store}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.subscriptions}</td>
 *   <td>{@link com.commercetools.api.models.subscription}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.subscriptions.commands.updateactions}</td>
 *   <td>{@link com.commercetools.api.models.subscription}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.taxcategories}</td>
 *   <td>{@link com.commercetools.api.models.cart, com.commercetools.api.models.tax_category}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.taxcategories.commands.updateactions}</td>
 *   <td>{@link com.commercetools.api.models.tax_category}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.types}</td>
 *   <td>{@link com.commercetools.api.models, com.commercetools.api.models.type}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.types.commands.updateactions}</td>
 *   <td>{@link com.commercetools.api.models.type}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.zones}</td>
 *   <td>{@link com.commercetools.api.models.zone}</td>
 * </tr>
 * <tr>
 *   <td>{@link io.sphere.sdk.zones.commands.updateactions}</td>
 *   <td>{@link com.commercetools.api.models.zone}</td>
 * </tr>
 * </table>
 */
public class MigrationModelClassMapping {
}
