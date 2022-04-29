
package com.commercetools.api.models.order;

import static com.commercetools.api.models.common.MoneyUtil.zeroAmount;

import java.time.ZonedDateTime;
import java.util.List;
import java.util.Optional;

import javax.money.MonetaryAmount;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.cart.*;
import com.commercetools.api.models.cart_discount.CartDiscountReference;
import com.commercetools.api.models.common.*;
import com.commercetools.api.models.customer_group.CustomerGroupReference;
import com.commercetools.api.models.store.StoreKeyReference;
import com.commercetools.api.models.type.CustomFields;

/**
 * Interface to collect the common stuff between carts and orders.
 * @param <T>
 */
public interface OrderLike<T extends OrderLike<T>> {
    @NotNull
    public String getId();

    @NotNull
    public Long getVersion();

    @NotNull
    public ZonedDateTime getCreatedAt();

    @NotNull
    public ZonedDateTime getLastModifiedAt();

    @Valid
    public LastModifiedBy getLastModifiedBy();

    @Valid
    public CreatedBy getCreatedBy();

    public String getCustomerId();

    public String getCustomerEmail();

    public String getAnonymousId();

    @Valid
    public StoreKeyReference getStore();

    @NotNull
    @Valid
    public List<LineItem> getLineItems();

    @NotNull
    @Valid
    public List<CustomLineItem> getCustomLineItems();

    @NotNull
    @Valid
    public TypedMoney getTotalPrice();

    @Valid
    public TaxedPrice getTaxedPrice();

    @Valid
    public Address getShippingAddress();

    @Valid
    public Address getBillingAddress();

    public InventoryMode getInventoryMode();

    @NotNull
    public TaxMode getTaxMode();

    @NotNull
    public RoundingMode getTaxRoundingMode();

    @NotNull
    public TaxCalculationMode getTaxCalculationMode();

    @Valid
    public CustomerGroupReference getCustomerGroup();

    public String getCountry();

    @Valid
    public ShippingInfo getShippingInfo();

    @Valid
    public List<DiscountCodeInfo> getDiscountCodes();

    @Valid
    public CustomFields getCustom();

    @Valid
    public PaymentInfo getPaymentInfo();

    public String getLocale();

    @NotNull
    @Valid
    public List<CartDiscountReference> getRefusedGifts();

    @NotNull
    public CartOrigin getOrigin();

    @Valid
    public ShippingRateInput getShippingRateInput();

    @Valid
    public List<Address> getItemShippingAddresses();

    default public MonetaryAmount calculateSubTotalPrice() {
        final MonetaryAmount lineItemTotal = this.getLineItems()
                .stream()
                .map(LineItem::getTotalPrice)
                .map(MonetaryAmountConvertable::toMonetaryAmount)
                .reduce(zeroAmount(Optional.ofNullable(this.getTotalPrice()).map(Money::getCurrencyCode).orElse(null)),
                    MonetaryAmount::add);
        final MonetaryAmount customLineItemTotal = this.getCustomLineItems()
                .stream()
                .map(CustomLineItem::getTotalPrice)
                .map(MonetaryAmountConvertable::toMonetaryAmount)
                .reduce(zeroAmount(Optional.ofNullable(this.getTotalPrice()).map(Money::getCurrencyCode).orElse(null)),
                    MonetaryAmount::add);
        return lineItemTotal.add(customLineItemTotal);
    }
}
