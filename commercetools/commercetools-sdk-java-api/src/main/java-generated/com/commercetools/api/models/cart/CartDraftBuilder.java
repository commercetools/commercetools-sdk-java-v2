
package com.commercetools.api.models.cart;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CartDraftBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartDraft cartDraft = CartDraft.builder()
 *             .currency("{currency}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CartDraftBuilder implements Builder<CartDraft> {

    private String currency;

    @Nullable
    private String key;

    @Nullable
    private String customerId;

    @Nullable
    private String customerEmail;

    @Nullable
    private com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifier customerGroup;

    @Nullable
    private String anonymousId;

    @Nullable
    private com.commercetools.api.models.store.StoreResourceIdentifier store;

    @Nullable
    private String country;

    @Nullable
    private com.commercetools.api.models.cart.InventoryMode inventoryMode;

    @Nullable
    private com.commercetools.api.models.cart.TaxMode taxMode;

    @Nullable
    private com.commercetools.api.models.cart.RoundingMode taxRoundingMode;

    @Nullable
    private com.commercetools.api.models.cart.TaxCalculationMode taxCalculationMode;

    @Nullable
    private java.util.List<com.commercetools.api.models.cart.LineItemDraft> lineItems;

    @Nullable
    private java.util.List<com.commercetools.api.models.cart.CustomLineItemDraft> customLineItems;

    @Nullable
    private com.commercetools.api.models.common.BaseAddress shippingAddress;

    @Nullable
    private com.commercetools.api.models.common.BaseAddress billingAddress;

    @Nullable
    private com.commercetools.api.models.shipping_method.ShippingMethodResourceIdentifier shippingMethod;

    @Nullable
    private com.commercetools.api.models.cart.ExternalTaxRateDraft externalTaxRateForShippingMethod;

    @Nullable
    private com.commercetools.api.models.type.CustomFieldsDraft custom;

    @Nullable
    private String locale;

    @Nullable
    private Long deleteDaysAfterLastModification;

    @Nullable
    private com.commercetools.api.models.cart.CartOrigin origin;

    @Nullable
    private com.commercetools.api.models.cart.ShippingMode shippingMode;

    @Nullable
    private java.util.List<com.commercetools.api.models.cart.CustomShippingDraft> customShipping;

    @Nullable
    private java.util.List<com.commercetools.api.models.cart.ShippingDraft> shipping;

    @Nullable
    private com.commercetools.api.models.cart.ShippingRateInputDraft shippingRateInput;

    @Nullable
    private java.util.List<com.commercetools.api.models.common.BaseAddress> itemShippingAddresses;

    @Nullable
    private java.util.List<String> discountCodes;

    /**
     *  <p>A three-digit currency code as per ISO 4217.</p>
     */

    public CartDraftBuilder currency(final String currency) {
        this.currency = currency;
        return this;
    }

    /**
     *  <p>User-defined unique identifier for the Cart.</p>
     */

    public CartDraftBuilder key(@Nullable final String key) {
        this.key = key;
        return this;
    }

    /**
     *  <p>Id of an existing Customer.</p>
     */

    public CartDraftBuilder customerId(@Nullable final String customerId) {
        this.customerId = customerId;
        return this;
    }

    /**
     *
     */

    public CartDraftBuilder customerEmail(@Nullable final String customerEmail) {
        this.customerEmail = customerEmail;
        return this;
    }

    /**
     *  <p>Will be set automatically when the <code>customerId</code> is set and the customer is a member of a customer group. Can be set explicitly when no <code>customerId</code> is present.</p>
     */

    public CartDraftBuilder customerGroup(
            Function<com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifierBuilder, com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifierBuilder> builder) {
        this.customerGroup = builder
                .apply(com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifierBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Will be set automatically when the <code>customerId</code> is set and the customer is a member of a customer group. Can be set explicitly when no <code>customerId</code> is present.</p>
     */

    public CartDraftBuilder customerGroup(
            @Nullable final com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifier customerGroup) {
        this.customerGroup = customerGroup;
        return this;
    }

    /**
     *  <p>Assigns the new cart to an anonymous session (the customer has not signed up/in yet).</p>
     */

    public CartDraftBuilder anonymousId(@Nullable final String anonymousId) {
        this.anonymousId = anonymousId;
        return this;
    }

    /**
     *  <p>Assigns the new cart to the store. The store assignment can not be modified.</p>
     */

    public CartDraftBuilder store(
            Function<com.commercetools.api.models.store.StoreResourceIdentifierBuilder, com.commercetools.api.models.store.StoreResourceIdentifierBuilder> builder) {
        this.store = builder.apply(com.commercetools.api.models.store.StoreResourceIdentifierBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Assigns the new cart to the store. The store assignment can not be modified.</p>
     */

    public CartDraftBuilder store(@Nullable final com.commercetools.api.models.store.StoreResourceIdentifier store) {
        this.store = store;
        return this;
    }

    /**
     *  <p>A two-digit country code as per ISO 3166-1 alpha-2.</p>
     */

    public CartDraftBuilder country(@Nullable final String country) {
        this.country = country;
        return this;
    }

    /**
     *  <p>Default inventory mode is <code>None</code>.</p>
     */

    public CartDraftBuilder inventoryMode(
            @Nullable final com.commercetools.api.models.cart.InventoryMode inventoryMode) {
        this.inventoryMode = inventoryMode;
        return this;
    }

    /**
     *  <p>The default tax mode is <code>Platform</code>.</p>
     */

    public CartDraftBuilder taxMode(@Nullable final com.commercetools.api.models.cart.TaxMode taxMode) {
        this.taxMode = taxMode;
        return this;
    }

    /**
     *  <p>The default tax rounding mode is <code>HalfEven</code>.</p>
     */

    public CartDraftBuilder taxRoundingMode(
            @Nullable final com.commercetools.api.models.cart.RoundingMode taxRoundingMode) {
        this.taxRoundingMode = taxRoundingMode;
        return this;
    }

    /**
     *  <p>The default tax calculation mode is <code>LineItemLevel</code>.</p>
     */

    public CartDraftBuilder taxCalculationMode(
            @Nullable final com.commercetools.api.models.cart.TaxCalculationMode taxCalculationMode) {
        this.taxCalculationMode = taxCalculationMode;
        return this;
    }

    /**
     *
     */

    public CartDraftBuilder lineItems(@Nullable final com.commercetools.api.models.cart.LineItemDraft... lineItems) {
        this.lineItems = new ArrayList<>(Arrays.asList(lineItems));
        return this;
    }

    /**
     *
     */

    public CartDraftBuilder lineItems(
            @Nullable final java.util.List<com.commercetools.api.models.cart.LineItemDraft> lineItems) {
        this.lineItems = lineItems;
        return this;
    }

    /**
     *
     */

    public CartDraftBuilder plusLineItems(
            @Nullable final com.commercetools.api.models.cart.LineItemDraft... lineItems) {
        if (this.lineItems == null) {
            this.lineItems = new ArrayList<>();
        }
        this.lineItems.addAll(Arrays.asList(lineItems));
        return this;
    }

    /**
     *
     */

    public CartDraftBuilder plusLineItems(
            Function<com.commercetools.api.models.cart.LineItemDraftBuilder, com.commercetools.api.models.cart.LineItemDraftBuilder> builder) {
        if (this.lineItems == null) {
            this.lineItems = new ArrayList<>();
        }
        this.lineItems.add(builder.apply(com.commercetools.api.models.cart.LineItemDraftBuilder.of()).build());
        return this;
    }

    /**
     *
     */

    public CartDraftBuilder withLineItems(
            Function<com.commercetools.api.models.cart.LineItemDraftBuilder, com.commercetools.api.models.cart.LineItemDraftBuilder> builder) {
        this.lineItems = new ArrayList<>();
        this.lineItems.add(builder.apply(com.commercetools.api.models.cart.LineItemDraftBuilder.of()).build());
        return this;
    }

    /**
     *
     */

    public CartDraftBuilder customLineItems(
            @Nullable final com.commercetools.api.models.cart.CustomLineItemDraft... customLineItems) {
        this.customLineItems = new ArrayList<>(Arrays.asList(customLineItems));
        return this;
    }

    /**
     *
     */

    public CartDraftBuilder customLineItems(
            @Nullable final java.util.List<com.commercetools.api.models.cart.CustomLineItemDraft> customLineItems) {
        this.customLineItems = customLineItems;
        return this;
    }

    /**
     *
     */

    public CartDraftBuilder plusCustomLineItems(
            @Nullable final com.commercetools.api.models.cart.CustomLineItemDraft... customLineItems) {
        if (this.customLineItems == null) {
            this.customLineItems = new ArrayList<>();
        }
        this.customLineItems.addAll(Arrays.asList(customLineItems));
        return this;
    }

    /**
     *
     */

    public CartDraftBuilder plusCustomLineItems(
            Function<com.commercetools.api.models.cart.CustomLineItemDraftBuilder, com.commercetools.api.models.cart.CustomLineItemDraftBuilder> builder) {
        if (this.customLineItems == null) {
            this.customLineItems = new ArrayList<>();
        }
        this.customLineItems
                .add(builder.apply(com.commercetools.api.models.cart.CustomLineItemDraftBuilder.of()).build());
        return this;
    }

    /**
     *
     */

    public CartDraftBuilder withCustomLineItems(
            Function<com.commercetools.api.models.cart.CustomLineItemDraftBuilder, com.commercetools.api.models.cart.CustomLineItemDraftBuilder> builder) {
        this.customLineItems = new ArrayList<>();
        this.customLineItems
                .add(builder.apply(com.commercetools.api.models.cart.CustomLineItemDraftBuilder.of()).build());
        return this;
    }

    /**
     *  <p>The shipping address is used to determine the eligible shipping methods and rates as well as the tax rate of the line items.</p>
     */

    public CartDraftBuilder shippingAddress(
            Function<com.commercetools.api.models.common.BaseAddressBuilder, com.commercetools.api.models.common.BaseAddressBuilder> builder) {
        this.shippingAddress = builder.apply(com.commercetools.api.models.common.BaseAddressBuilder.of()).build();
        return this;
    }

    /**
     *  <p>The shipping address is used to determine the eligible shipping methods and rates as well as the tax rate of the line items.</p>
     */

    public CartDraftBuilder shippingAddress(
            @Nullable final com.commercetools.api.models.common.BaseAddress shippingAddress) {
        this.shippingAddress = shippingAddress;
        return this;
    }

    /**
     *
     */

    public CartDraftBuilder billingAddress(
            Function<com.commercetools.api.models.common.BaseAddressBuilder, com.commercetools.api.models.common.BaseAddressBuilder> builder) {
        this.billingAddress = builder.apply(com.commercetools.api.models.common.BaseAddressBuilder.of()).build();
        return this;
    }

    /**
     *
     */

    public CartDraftBuilder billingAddress(
            @Nullable final com.commercetools.api.models.common.BaseAddress billingAddress) {
        this.billingAddress = billingAddress;
        return this;
    }

    /**
     *
     */

    public CartDraftBuilder shippingMethod(
            Function<com.commercetools.api.models.shipping_method.ShippingMethodResourceIdentifierBuilder, com.commercetools.api.models.shipping_method.ShippingMethodResourceIdentifierBuilder> builder) {
        this.shippingMethod = builder
                .apply(com.commercetools.api.models.shipping_method.ShippingMethodResourceIdentifierBuilder.of())
                .build();
        return this;
    }

    /**
     *
     */

    public CartDraftBuilder shippingMethod(
            @Nullable final com.commercetools.api.models.shipping_method.ShippingMethodResourceIdentifier shippingMethod) {
        this.shippingMethod = shippingMethod;
        return this;
    }

    /**
     *  <p>An external tax rate can be set for the <code>shippingMethod</code> if the cart has the <code>External</code> TaxMode.</p>
     */

    public CartDraftBuilder externalTaxRateForShippingMethod(
            Function<com.commercetools.api.models.cart.ExternalTaxRateDraftBuilder, com.commercetools.api.models.cart.ExternalTaxRateDraftBuilder> builder) {
        this.externalTaxRateForShippingMethod = builder
                .apply(com.commercetools.api.models.cart.ExternalTaxRateDraftBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>An external tax rate can be set for the <code>shippingMethod</code> if the cart has the <code>External</code> TaxMode.</p>
     */

    public CartDraftBuilder externalTaxRateForShippingMethod(
            @Nullable final com.commercetools.api.models.cart.ExternalTaxRateDraft externalTaxRateForShippingMethod) {
        this.externalTaxRateForShippingMethod = externalTaxRateForShippingMethod;
        return this;
    }

    /**
     *  <p>The custom fields.</p>
     */

    public CartDraftBuilder custom(
            Function<com.commercetools.api.models.type.CustomFieldsDraftBuilder, com.commercetools.api.models.type.CustomFieldsDraftBuilder> builder) {
        this.custom = builder.apply(com.commercetools.api.models.type.CustomFieldsDraftBuilder.of()).build();
        return this;
    }

    /**
     *  <p>The custom fields.</p>
     */

    public CartDraftBuilder custom(@Nullable final com.commercetools.api.models.type.CustomFieldsDraft custom) {
        this.custom = custom;
        return this;
    }

    /**
     *  <p>Must be one of the languages supported for this project</p>
     */

    public CartDraftBuilder locale(@Nullable final String locale) {
        this.locale = locale;
        return this;
    }

    /**
     *  <p>The cart will be deleted automatically if it hasn't been modified for the specified amount of days and it is in the <code>Active</code> CartState. If a ChangeSubscription for carts exists, a <code>ResourceDeleted</code> notification will be sent.</p>
     */

    public CartDraftBuilder deleteDaysAfterLastModification(@Nullable final Long deleteDaysAfterLastModification) {
        this.deleteDaysAfterLastModification = deleteDaysAfterLastModification;
        return this;
    }

    /**
     *  <p>The default origin is <code>Customer</code>.</p>
     */

    public CartDraftBuilder origin(@Nullable final com.commercetools.api.models.cart.CartOrigin origin) {
        this.origin = origin;
        return this;
    }

    /**
     *  <ul>
     *   <li>If <code>Single</code>, only a single Shipping Method can be added to the Cart.</li>
     *   <li>If <code>Multiple</code>, multiple Shipping Methods can be added to the Cart.</li>
     *  </ul>
     */

    public CartDraftBuilder shippingMode(@Nullable final com.commercetools.api.models.cart.ShippingMode shippingMode) {
        this.shippingMode = shippingMode;
        return this;
    }

    /**
     *  <p>Custom Shipping Methods for a Cart with <code>Multiple</code> ShippingMode.</p>
     */

    public CartDraftBuilder customShipping(
            @Nullable final com.commercetools.api.models.cart.CustomShippingDraft... customShipping) {
        this.customShipping = new ArrayList<>(Arrays.asList(customShipping));
        return this;
    }

    /**
     *  <p>Custom Shipping Methods for a Cart with <code>Multiple</code> ShippingMode.</p>
     */

    public CartDraftBuilder customShipping(
            @Nullable final java.util.List<com.commercetools.api.models.cart.CustomShippingDraft> customShipping) {
        this.customShipping = customShipping;
        return this;
    }

    /**
     *  <p>Custom Shipping Methods for a Cart with <code>Multiple</code> ShippingMode.</p>
     */

    public CartDraftBuilder plusCustomShipping(
            @Nullable final com.commercetools.api.models.cart.CustomShippingDraft... customShipping) {
        if (this.customShipping == null) {
            this.customShipping = new ArrayList<>();
        }
        this.customShipping.addAll(Arrays.asList(customShipping));
        return this;
    }

    /**
     *  <p>Custom Shipping Methods for a Cart with <code>Multiple</code> ShippingMode.</p>
     */

    public CartDraftBuilder plusCustomShipping(
            Function<com.commercetools.api.models.cart.CustomShippingDraftBuilder, com.commercetools.api.models.cart.CustomShippingDraftBuilder> builder) {
        if (this.customShipping == null) {
            this.customShipping = new ArrayList<>();
        }
        this.customShipping
                .add(builder.apply(com.commercetools.api.models.cart.CustomShippingDraftBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Custom Shipping Methods for a Cart with <code>Multiple</code> ShippingMode.</p>
     */

    public CartDraftBuilder withCustomShipping(
            Function<com.commercetools.api.models.cart.CustomShippingDraftBuilder, com.commercetools.api.models.cart.CustomShippingDraftBuilder> builder) {
        this.customShipping = new ArrayList<>();
        this.customShipping
                .add(builder.apply(com.commercetools.api.models.cart.CustomShippingDraftBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Shipping Methods for a Cart with <code>Multiple</code> ShippingMode.</p>
     */

    public CartDraftBuilder shipping(@Nullable final com.commercetools.api.models.cart.ShippingDraft... shipping) {
        this.shipping = new ArrayList<>(Arrays.asList(shipping));
        return this;
    }

    /**
     *  <p>Shipping Methods for a Cart with <code>Multiple</code> ShippingMode.</p>
     */

    public CartDraftBuilder shipping(
            @Nullable final java.util.List<com.commercetools.api.models.cart.ShippingDraft> shipping) {
        this.shipping = shipping;
        return this;
    }

    /**
     *  <p>Shipping Methods for a Cart with <code>Multiple</code> ShippingMode.</p>
     */

    public CartDraftBuilder plusShipping(@Nullable final com.commercetools.api.models.cart.ShippingDraft... shipping) {
        if (this.shipping == null) {
            this.shipping = new ArrayList<>();
        }
        this.shipping.addAll(Arrays.asList(shipping));
        return this;
    }

    /**
     *  <p>Shipping Methods for a Cart with <code>Multiple</code> ShippingMode.</p>
     */

    public CartDraftBuilder plusShipping(
            Function<com.commercetools.api.models.cart.ShippingDraftBuilder, com.commercetools.api.models.cart.ShippingDraftBuilder> builder) {
        if (this.shipping == null) {
            this.shipping = new ArrayList<>();
        }
        this.shipping.add(builder.apply(com.commercetools.api.models.cart.ShippingDraftBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Shipping Methods for a Cart with <code>Multiple</code> ShippingMode.</p>
     */

    public CartDraftBuilder withShipping(
            Function<com.commercetools.api.models.cart.ShippingDraftBuilder, com.commercetools.api.models.cart.ShippingDraftBuilder> builder) {
        this.shipping = new ArrayList<>();
        this.shipping.add(builder.apply(com.commercetools.api.models.cart.ShippingDraftBuilder.of()).build());
        return this;
    }

    /**
     *  <p>The shippingRateInput is used as an input to select a ShippingRatePriceTier. Based on the definition of ShippingRateInputType. If CartClassification is defined, it must be ClassificationShippingRateInput. If CartScore is defined, it must be ScoreShippingRateInput. Otherwise it can not bet set.</p>
     */

    public CartDraftBuilder shippingRateInput(
            @Nullable final com.commercetools.api.models.cart.ShippingRateInputDraft shippingRateInput) {
        this.shippingRateInput = shippingRateInput;
        return this;
    }

    /**
     *  <p>The shippingRateInput is used as an input to select a ShippingRatePriceTier. Based on the definition of ShippingRateInputType. If CartClassification is defined, it must be ClassificationShippingRateInput. If CartScore is defined, it must be ScoreShippingRateInput. Otherwise it can not bet set.</p>
     */

    public CartDraftBuilder shippingRateInput(
            Function<com.commercetools.api.models.cart.ShippingRateInputDraftBuilder, Builder<? extends com.commercetools.api.models.cart.ShippingRateInputDraft>> builder) {
        this.shippingRateInput = builder.apply(com.commercetools.api.models.cart.ShippingRateInputDraftBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Contains addresses for carts with multiple shipping addresses. Each address must contain a key which is unique in this cart. Line items will use these keys to reference the addresses under their <code>shippingDetails</code>. The addresses captured here are not used to determine eligible shipping methods or the applicable tax rate. Only the cart's <code>shippingAddress</code> is used for this.</p>
     */

    public CartDraftBuilder itemShippingAddresses(
            @Nullable final com.commercetools.api.models.common.BaseAddress... itemShippingAddresses) {
        this.itemShippingAddresses = new ArrayList<>(Arrays.asList(itemShippingAddresses));
        return this;
    }

    /**
     *  <p>Contains addresses for carts with multiple shipping addresses. Each address must contain a key which is unique in this cart. Line items will use these keys to reference the addresses under their <code>shippingDetails</code>. The addresses captured here are not used to determine eligible shipping methods or the applicable tax rate. Only the cart's <code>shippingAddress</code> is used for this.</p>
     */

    public CartDraftBuilder itemShippingAddresses(
            @Nullable final java.util.List<com.commercetools.api.models.common.BaseAddress> itemShippingAddresses) {
        this.itemShippingAddresses = itemShippingAddresses;
        return this;
    }

    /**
     *  <p>Contains addresses for carts with multiple shipping addresses. Each address must contain a key which is unique in this cart. Line items will use these keys to reference the addresses under their <code>shippingDetails</code>. The addresses captured here are not used to determine eligible shipping methods or the applicable tax rate. Only the cart's <code>shippingAddress</code> is used for this.</p>
     */

    public CartDraftBuilder plusItemShippingAddresses(
            @Nullable final com.commercetools.api.models.common.BaseAddress... itemShippingAddresses) {
        if (this.itemShippingAddresses == null) {
            this.itemShippingAddresses = new ArrayList<>();
        }
        this.itemShippingAddresses.addAll(Arrays.asList(itemShippingAddresses));
        return this;
    }

    /**
     *  <p>Contains addresses for carts with multiple shipping addresses. Each address must contain a key which is unique in this cart. Line items will use these keys to reference the addresses under their <code>shippingDetails</code>. The addresses captured here are not used to determine eligible shipping methods or the applicable tax rate. Only the cart's <code>shippingAddress</code> is used for this.</p>
     */

    public CartDraftBuilder plusItemShippingAddresses(
            Function<com.commercetools.api.models.common.BaseAddressBuilder, com.commercetools.api.models.common.BaseAddressBuilder> builder) {
        if (this.itemShippingAddresses == null) {
            this.itemShippingAddresses = new ArrayList<>();
        }
        this.itemShippingAddresses
                .add(builder.apply(com.commercetools.api.models.common.BaseAddressBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Contains addresses for carts with multiple shipping addresses. Each address must contain a key which is unique in this cart. Line items will use these keys to reference the addresses under their <code>shippingDetails</code>. The addresses captured here are not used to determine eligible shipping methods or the applicable tax rate. Only the cart's <code>shippingAddress</code> is used for this.</p>
     */

    public CartDraftBuilder withItemShippingAddresses(
            Function<com.commercetools.api.models.common.BaseAddressBuilder, com.commercetools.api.models.common.BaseAddressBuilder> builder) {
        this.itemShippingAddresses = new ArrayList<>();
        this.itemShippingAddresses
                .add(builder.apply(com.commercetools.api.models.common.BaseAddressBuilder.of()).build());
        return this;
    }

    /**
     *  <p>The code of existing DiscountCodes.</p>
     */

    public CartDraftBuilder discountCodes(@Nullable final String... discountCodes) {
        this.discountCodes = new ArrayList<>(Arrays.asList(discountCodes));
        return this;
    }

    /**
     *  <p>The code of existing DiscountCodes.</p>
     */

    public CartDraftBuilder discountCodes(@Nullable final java.util.List<String> discountCodes) {
        this.discountCodes = discountCodes;
        return this;
    }

    /**
     *  <p>The code of existing DiscountCodes.</p>
     */

    public CartDraftBuilder plusDiscountCodes(@Nullable final String... discountCodes) {
        if (this.discountCodes == null) {
            this.discountCodes = new ArrayList<>();
        }
        this.discountCodes.addAll(Arrays.asList(discountCodes));
        return this;
    }

    public String getCurrency() {
        return this.currency;
    }

    @Nullable
    public String getKey() {
        return this.key;
    }

    @Nullable
    public String getCustomerId() {
        return this.customerId;
    }

    @Nullable
    public String getCustomerEmail() {
        return this.customerEmail;
    }

    @Nullable
    public com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifier getCustomerGroup() {
        return this.customerGroup;
    }

    @Nullable
    public String getAnonymousId() {
        return this.anonymousId;
    }

    @Nullable
    public com.commercetools.api.models.store.StoreResourceIdentifier getStore() {
        return this.store;
    }

    @Nullable
    public String getCountry() {
        return this.country;
    }

    @Nullable
    public com.commercetools.api.models.cart.InventoryMode getInventoryMode() {
        return this.inventoryMode;
    }

    @Nullable
    public com.commercetools.api.models.cart.TaxMode getTaxMode() {
        return this.taxMode;
    }

    @Nullable
    public com.commercetools.api.models.cart.RoundingMode getTaxRoundingMode() {
        return this.taxRoundingMode;
    }

    @Nullable
    public com.commercetools.api.models.cart.TaxCalculationMode getTaxCalculationMode() {
        return this.taxCalculationMode;
    }

    @Nullable
    public java.util.List<com.commercetools.api.models.cart.LineItemDraft> getLineItems() {
        return this.lineItems;
    }

    @Nullable
    public java.util.List<com.commercetools.api.models.cart.CustomLineItemDraft> getCustomLineItems() {
        return this.customLineItems;
    }

    @Nullable
    public com.commercetools.api.models.common.BaseAddress getShippingAddress() {
        return this.shippingAddress;
    }

    @Nullable
    public com.commercetools.api.models.common.BaseAddress getBillingAddress() {
        return this.billingAddress;
    }

    @Nullable
    public com.commercetools.api.models.shipping_method.ShippingMethodResourceIdentifier getShippingMethod() {
        return this.shippingMethod;
    }

    @Nullable
    public com.commercetools.api.models.cart.ExternalTaxRateDraft getExternalTaxRateForShippingMethod() {
        return this.externalTaxRateForShippingMethod;
    }

    @Nullable
    public com.commercetools.api.models.type.CustomFieldsDraft getCustom() {
        return this.custom;
    }

    @Nullable
    public String getLocale() {
        return this.locale;
    }

    @Nullable
    public Long getDeleteDaysAfterLastModification() {
        return this.deleteDaysAfterLastModification;
    }

    @Nullable
    public com.commercetools.api.models.cart.CartOrigin getOrigin() {
        return this.origin;
    }

    @Nullable
    public com.commercetools.api.models.cart.ShippingMode getShippingMode() {
        return this.shippingMode;
    }

    @Nullable
    public java.util.List<com.commercetools.api.models.cart.CustomShippingDraft> getCustomShipping() {
        return this.customShipping;
    }

    @Nullable
    public java.util.List<com.commercetools.api.models.cart.ShippingDraft> getShipping() {
        return this.shipping;
    }

    @Nullable
    public com.commercetools.api.models.cart.ShippingRateInputDraft getShippingRateInput() {
        return this.shippingRateInput;
    }

    @Nullable
    public java.util.List<com.commercetools.api.models.common.BaseAddress> getItemShippingAddresses() {
        return this.itemShippingAddresses;
    }

    @Nullable
    public java.util.List<String> getDiscountCodes() {
        return this.discountCodes;
    }

    public CartDraft build() {
        Objects.requireNonNull(currency, CartDraft.class + ": currency is missing");
        return new CartDraftImpl(currency, key, customerId, customerEmail, customerGroup, anonymousId, store, country,
            inventoryMode, taxMode, taxRoundingMode, taxCalculationMode, lineItems, customLineItems, shippingAddress,
            billingAddress, shippingMethod, externalTaxRateForShippingMethod, custom, locale,
            deleteDaysAfterLastModification, origin, shippingMode, customShipping, shipping, shippingRateInput,
            itemShippingAddresses, discountCodes);
    }

    /**
     * builds CartDraft without checking for non null required values
     */
    public CartDraft buildUnchecked() {
        return new CartDraftImpl(currency, key, customerId, customerEmail, customerGroup, anonymousId, store, country,
            inventoryMode, taxMode, taxRoundingMode, taxCalculationMode, lineItems, customLineItems, shippingAddress,
            billingAddress, shippingMethod, externalTaxRateForShippingMethod, custom, locale,
            deleteDaysAfterLastModification, origin, shippingMode, customShipping, shipping, shippingRateInput,
            itemShippingAddresses, discountCodes);
    }

    public static CartDraftBuilder of() {
        return new CartDraftBuilder();
    }

    public static CartDraftBuilder of(final CartDraft template) {
        CartDraftBuilder builder = new CartDraftBuilder();
        builder.currency = template.getCurrency();
        builder.key = template.getKey();
        builder.customerId = template.getCustomerId();
        builder.customerEmail = template.getCustomerEmail();
        builder.customerGroup = template.getCustomerGroup();
        builder.anonymousId = template.getAnonymousId();
        builder.store = template.getStore();
        builder.country = template.getCountry();
        builder.inventoryMode = template.getInventoryMode();
        builder.taxMode = template.getTaxMode();
        builder.taxRoundingMode = template.getTaxRoundingMode();
        builder.taxCalculationMode = template.getTaxCalculationMode();
        builder.lineItems = template.getLineItems();
        builder.customLineItems = template.getCustomLineItems();
        builder.shippingAddress = template.getShippingAddress();
        builder.billingAddress = template.getBillingAddress();
        builder.shippingMethod = template.getShippingMethod();
        builder.externalTaxRateForShippingMethod = template.getExternalTaxRateForShippingMethod();
        builder.custom = template.getCustom();
        builder.locale = template.getLocale();
        builder.deleteDaysAfterLastModification = template.getDeleteDaysAfterLastModification();
        builder.origin = template.getOrigin();
        builder.shippingMode = template.getShippingMode();
        builder.customShipping = template.getCustomShipping();
        builder.shipping = template.getShipping();
        builder.shippingRateInput = template.getShippingRateInput();
        builder.itemShippingAddresses = template.getItemShippingAddresses();
        builder.discountCodes = template.getDiscountCodes();
        return builder;
    }

}
