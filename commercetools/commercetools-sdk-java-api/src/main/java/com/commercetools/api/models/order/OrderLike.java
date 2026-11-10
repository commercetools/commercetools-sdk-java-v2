
package com.commercetools.api.models.order;

import static com.commercetools.api.models.common.MoneyUtil.zeroAmount;

import java.time.ZonedDateTime;
import java.util.List;
import java.util.Optional;

import javax.money.MonetaryAmount;

import com.commercetools.api.models.cart.CartOrigin;
import com.commercetools.api.models.cart.CustomLineItem;
import com.commercetools.api.models.cart.DiscountCodeInfo;
import com.commercetools.api.models.cart.InventoryMode;
import com.commercetools.api.models.cart.LineItem;
import com.commercetools.api.models.cart.RoundingMode;
import com.commercetools.api.models.cart.ShippingInfo;
import com.commercetools.api.models.cart.ShippingRateInput;
import com.commercetools.api.models.cart.TaxCalculationMode;
import com.commercetools.api.models.cart.TaxMode;
import com.commercetools.api.models.cart.TaxedPrice;
import com.commercetools.api.models.cart_discount.CartDiscountReference;
import com.commercetools.api.models.common.Address;
import com.commercetools.api.models.common.CreatedBy;
import com.commercetools.api.models.common.LastModifiedBy;
import com.commercetools.api.models.common.MonetaryAmountConvertable;
import com.commercetools.api.models.common.Money;
import com.commercetools.api.models.common.TypedMoney;
import com.commercetools.api.models.customer_group.CustomerGroupReference;
import com.commercetools.api.models.store.StoreKeyReference;
import com.commercetools.api.models.type.CustomFields;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 * Interface to collect the common stuff between carts and orders.
 * @param <T> the type of this {@link OrderLike}, order or cart
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

    @Valid
    public CustomFields getShippingCustomFields();

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
