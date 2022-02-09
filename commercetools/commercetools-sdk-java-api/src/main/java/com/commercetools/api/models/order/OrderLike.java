
package com.commercetools.api.models.order;

import java.time.ZonedDateTime;
import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.cart.*;
import com.commercetools.api.models.cart_discount.CartDiscountReference;
import com.commercetools.api.models.common.Address;
import com.commercetools.api.models.common.CreatedBy;
import com.commercetools.api.models.common.LastModifiedBy;
import com.commercetools.api.models.common.TypedMoney;
import com.commercetools.api.models.customer_group.CustomerGroupReference;
import com.commercetools.api.models.store.StoreKeyReference;
import com.commercetools.api.models.type.CustomFields;

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
}
