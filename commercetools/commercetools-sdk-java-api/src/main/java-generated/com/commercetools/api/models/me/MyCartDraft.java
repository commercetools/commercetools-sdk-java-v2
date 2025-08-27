
package com.commercetools.api.models.me;

import java.time.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;

import com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifier;
import com.commercetools.api.models.cart.InventoryMode;
import com.commercetools.api.models.cart.ShippingMode;
import com.commercetools.api.models.cart.TaxMode;
import com.commercetools.api.models.common.BaseAddress;
import com.commercetools.api.models.shipping_method.ShippingMethodResourceIdentifier;
import com.commercetools.api.models.store.StoreResourceIdentifier;
import com.commercetools.api.models.type.CustomFieldsDraft;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>The <code>customerId</code> is determined by a <span>password flow token</span> and automatically set on the resulting <a href="https://docs.commercetools.com/apis/ctp:api:type:Cart" rel="nofollow">Cart</a>. The <code>anonymousId</code> is determined by a <a href="https://docs.commercetools.com/apis/ctp:api:type:AnonymousSession" rel="nofollow">token for an anonymous session</a> and automatically set on the resulting <a href="https://docs.commercetools.com/apis/ctp:api:type:Cart" rel="nofollow">Cart</a>.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MyCartDraft myCartDraft = MyCartDraft.builder()
 *             .currency("{currency}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = MyCartDraftImpl.class)
public interface MyCartDraft extends com.commercetools.api.models.CustomizableDraft<MyCartDraft>,
        io.vrap.rmf.base.client.Draft<MyCartDraft> {

    /**
     *  <p>Currency the Cart uses.</p>
     * @return currency
     */
    @NotNull
    @JsonProperty("currency")
    public String getCurrency();

    /**
     *  <p>Email address of the Customer the Cart belongs to.</p>
     * @return customerEmail
     */

    @JsonProperty("customerEmail")
    public String getCustomerEmail();

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:ResourceIdentifier" rel="nofollow">ResourceIdentifier</a> to the Business Unit the Cart should belong to. The <a href="https://docs.commercetools.com/apis/ctp:api:type:Customer" rel="nofollow">Customer</a> must be an <a href="https://docs.commercetools.com/apis/ctp:api:type:Associate" rel="nofollow">Associate</a> of the Business Unit. Only available for <span>B2B</span>-enabled Projects.</p>
     * @return businessUnit
     */
    @Valid
    @JsonProperty("businessUnit")
    public BusinessUnitResourceIdentifier getBusinessUnit();

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:ResourceIdentifier" rel="nofollow">ResourceIdentifier</a> to the Store the Cart should belong to. Once set, it cannot be updated.</p>
     * @return store
     */
    @Valid
    @JsonProperty("store")
    public StoreResourceIdentifier getStore();

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:LineItems" rel="nofollow">Line Items</a> to add to the Cart.</p>
     * @return lineItems
     */
    @Valid
    @JsonProperty("lineItems")
    public List<MyLineItemDraft> getLineItems();

    /**
     *  <p>Determines how Tax Rates are set. The <code>Disabled</code> TaxMode <strong>cannot</strong> be set.</p>
     * @return taxMode
     */

    @JsonProperty("taxMode")
    public TaxMode getTaxMode();

    /**
     *  <p>Determines how stock quantities are tracked for Line Items in the Cart.</p>
     * @return inventoryMode
     */

    @JsonProperty("inventoryMode")
    public InventoryMode getInventoryMode();

    /**
     *  <p>Billing address associated with the Cart.</p>
     * @return billingAddress
     */
    @Valid
    @JsonProperty("billingAddress")
    public BaseAddress getBillingAddress();

    /**
     *  <p>Shipping address associated with the Cart. Determines eligible <a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingMethod" rel="nofollow">ShippingMethod</a> rates and Tax Rates of Line Items.</p>
     * @return shippingAddress
     */
    @Valid
    @JsonProperty("shippingAddress")
    public BaseAddress getShippingAddress();

    /**
     *  <p>Shipping Method for the Cart. If the referenced <a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingMethod" rel="nofollow">ShippingMethod</a> has a <code>predicate</code> that does not match the Cart, an <a href="https://docs.commercetools.com/apis/ctp:api:type:InvalidOperationError" rel="nofollow">InvalidOperation</a> error is returned when <a href="https://docs.commercetools.com/apis/ctp:api:endpoint:/{projectKey}/carts:POST" rel="nofollow">creating a Cart</a>.</p>
     * @return shippingMethod
     */
    @Valid
    @JsonProperty("shippingMethod")
    public ShippingMethodResourceIdentifier getShippingMethod();

    /**
     *  <p>Multiple shipping addresses of the Cart. Each address must contain a <code>key</code> that is unique in this Cart. The keys are used by <a href="https://docs.commercetools.com/apis/ctp:api:type:LineItem" rel="nofollow">LineItems</a> to reference these addresses under their <code>shippingDetails</code>.</p>
     *  <p>Eligible Shipping Methods or applicable Tax Rates are determined by the <a href="https://docs.commercetools.com/apis/ctp:api:type:Cart" rel="nofollow">Cart</a> <code>shippingAddress</code>, and not <code>itemShippingAddresses</code>.</p>
     * @return itemShippingAddresses
     */
    @Valid
    @JsonProperty("itemShippingAddresses")
    public List<BaseAddress> getItemShippingAddresses();

    /**
     *  <ul>
     *   <li>If set to <code>Single</code>, only a single Shipping Method can be added to the Cart.</li>
     *   <li>If set to <code>Multiple</code>, multiple Shipping Methods can be added to the Cart.</li>
     *  </ul>
     * @return shippingMode
     */

    @JsonProperty("shippingMode")
    public ShippingMode getShippingMode();

    /**
     *  <p><code>code</code> of the existing <a href="https://docs.commercetools.com/apis/ctp:api:type:DiscountCode" rel="nofollow">DiscountCodes</a> to add to the Cart.</p>
     * @return discountCodes
     */

    @JsonProperty("discountCodes")
    public List<String> getDiscountCodes();

    /**
     *  <p>Used for <span>Line Item price selection</span>. If used for <a href="https://docs.commercetools.com/apis/ctp:api:endpoint:/{projectKey}/in-store/me/carts:POST" rel="nofollow">Create Cart in Store</a>, the provided country must be one of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Store's</a> <code>countries</code>.</p>
     * @return country
     */

    @JsonProperty("country")
    public String getCountry();

    /**
     *  <p>Language of the Cart. Must be one of the languages supported by the <a href="https://docs.commercetools.com/apis/ctp:api:type:Project" rel="nofollow">Project</a>.</p>
     * @return locale
     */

    @JsonProperty("locale")
    public String getLocale();

    /**
     *  <p>Number of days after the last modification before a Cart is deleted. If not provided, the default value for this field configured in <a href="https://docs.commercetools.com/apis/ctp:api:type:CartsConfiguration" rel="nofollow">Project settings</a> is assigned.</p>
     *  <p>Create a <a href="https://docs.commercetools.com/apis/ctp:api:type:ChangeSubscription" rel="nofollow">ChangeSubscription</a> for Carts to receive a <a href="https://docs.commercetools.com/apis/ctp:api:type:ResourceDeletedDeliveryPayload" rel="nofollow">ResourceDeletedDeliveryPayload</a> upon deletion of the Cart.</p>
     * @return deleteDaysAfterLastModification
     */

    @JsonProperty("deleteDaysAfterLastModification")
    public Long getDeleteDaysAfterLastModification();

    /**
     *  <p>Custom Fields for the Cart.</p>
     * @return custom
     */
    @Valid
    @JsonProperty("custom")
    public CustomFieldsDraft getCustom();

    /**
     *  <p>Currency the Cart uses.</p>
     * @param currency value to be set
     */

    public void setCurrency(final String currency);

    /**
     *  <p>Email address of the Customer the Cart belongs to.</p>
     * @param customerEmail value to be set
     */

    public void setCustomerEmail(final String customerEmail);

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:ResourceIdentifier" rel="nofollow">ResourceIdentifier</a> to the Business Unit the Cart should belong to. The <a href="https://docs.commercetools.com/apis/ctp:api:type:Customer" rel="nofollow">Customer</a> must be an <a href="https://docs.commercetools.com/apis/ctp:api:type:Associate" rel="nofollow">Associate</a> of the Business Unit. Only available for <span>B2B</span>-enabled Projects.</p>
     * @param businessUnit value to be set
     */

    public void setBusinessUnit(final BusinessUnitResourceIdentifier businessUnit);

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:ResourceIdentifier" rel="nofollow">ResourceIdentifier</a> to the Store the Cart should belong to. Once set, it cannot be updated.</p>
     * @param store value to be set
     */

    public void setStore(final StoreResourceIdentifier store);

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:LineItems" rel="nofollow">Line Items</a> to add to the Cart.</p>
     * @param lineItems values to be set
     */

    @JsonIgnore
    public void setLineItems(final MyLineItemDraft... lineItems);

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:LineItems" rel="nofollow">Line Items</a> to add to the Cart.</p>
     * @param lineItems values to be set
     */

    public void setLineItems(final List<MyLineItemDraft> lineItems);

    /**
     *  <p>Determines how Tax Rates are set. The <code>Disabled</code> TaxMode <strong>cannot</strong> be set.</p>
     * @param taxMode value to be set
     */

    public void setTaxMode(final TaxMode taxMode);

    /**
     *  <p>Determines how stock quantities are tracked for Line Items in the Cart.</p>
     * @param inventoryMode value to be set
     */

    public void setInventoryMode(final InventoryMode inventoryMode);

    /**
     *  <p>Billing address associated with the Cart.</p>
     * @param billingAddress value to be set
     */

    public void setBillingAddress(final BaseAddress billingAddress);

    /**
     *  <p>Shipping address associated with the Cart. Determines eligible <a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingMethod" rel="nofollow">ShippingMethod</a> rates and Tax Rates of Line Items.</p>
     * @param shippingAddress value to be set
     */

    public void setShippingAddress(final BaseAddress shippingAddress);

    /**
     *  <p>Shipping Method for the Cart. If the referenced <a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingMethod" rel="nofollow">ShippingMethod</a> has a <code>predicate</code> that does not match the Cart, an <a href="https://docs.commercetools.com/apis/ctp:api:type:InvalidOperationError" rel="nofollow">InvalidOperation</a> error is returned when <a href="https://docs.commercetools.com/apis/ctp:api:endpoint:/{projectKey}/carts:POST" rel="nofollow">creating a Cart</a>.</p>
     * @param shippingMethod value to be set
     */

    public void setShippingMethod(final ShippingMethodResourceIdentifier shippingMethod);

    /**
     *  <p>Multiple shipping addresses of the Cart. Each address must contain a <code>key</code> that is unique in this Cart. The keys are used by <a href="https://docs.commercetools.com/apis/ctp:api:type:LineItem" rel="nofollow">LineItems</a> to reference these addresses under their <code>shippingDetails</code>.</p>
     *  <p>Eligible Shipping Methods or applicable Tax Rates are determined by the <a href="https://docs.commercetools.com/apis/ctp:api:type:Cart" rel="nofollow">Cart</a> <code>shippingAddress</code>, and not <code>itemShippingAddresses</code>.</p>
     * @param itemShippingAddresses values to be set
     */

    @JsonIgnore
    public void setItemShippingAddresses(final BaseAddress... itemShippingAddresses);

    /**
     *  <p>Multiple shipping addresses of the Cart. Each address must contain a <code>key</code> that is unique in this Cart. The keys are used by <a href="https://docs.commercetools.com/apis/ctp:api:type:LineItem" rel="nofollow">LineItems</a> to reference these addresses under their <code>shippingDetails</code>.</p>
     *  <p>Eligible Shipping Methods or applicable Tax Rates are determined by the <a href="https://docs.commercetools.com/apis/ctp:api:type:Cart" rel="nofollow">Cart</a> <code>shippingAddress</code>, and not <code>itemShippingAddresses</code>.</p>
     * @param itemShippingAddresses values to be set
     */

    public void setItemShippingAddresses(final List<BaseAddress> itemShippingAddresses);

    /**
     *  <ul>
     *   <li>If set to <code>Single</code>, only a single Shipping Method can be added to the Cart.</li>
     *   <li>If set to <code>Multiple</code>, multiple Shipping Methods can be added to the Cart.</li>
     *  </ul>
     * @param shippingMode value to be set
     */

    public void setShippingMode(final ShippingMode shippingMode);

    /**
     *  <p><code>code</code> of the existing <a href="https://docs.commercetools.com/apis/ctp:api:type:DiscountCode" rel="nofollow">DiscountCodes</a> to add to the Cart.</p>
     * @param discountCodes values to be set
     */

    @JsonIgnore
    public void setDiscountCodes(final String... discountCodes);

    /**
     *  <p><code>code</code> of the existing <a href="https://docs.commercetools.com/apis/ctp:api:type:DiscountCode" rel="nofollow">DiscountCodes</a> to add to the Cart.</p>
     * @param discountCodes values to be set
     */

    public void setDiscountCodes(final List<String> discountCodes);

    /**
     *  <p>Used for <span>Line Item price selection</span>. If used for <a href="https://docs.commercetools.com/apis/ctp:api:endpoint:/{projectKey}/in-store/me/carts:POST" rel="nofollow">Create Cart in Store</a>, the provided country must be one of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Store's</a> <code>countries</code>.</p>
     * @param country value to be set
     */

    public void setCountry(final String country);

    /**
     *  <p>Language of the Cart. Must be one of the languages supported by the <a href="https://docs.commercetools.com/apis/ctp:api:type:Project" rel="nofollow">Project</a>.</p>
     * @param locale value to be set
     */

    public void setLocale(final String locale);

    /**
     *  <p>Number of days after the last modification before a Cart is deleted. If not provided, the default value for this field configured in <a href="https://docs.commercetools.com/apis/ctp:api:type:CartsConfiguration" rel="nofollow">Project settings</a> is assigned.</p>
     *  <p>Create a <a href="https://docs.commercetools.com/apis/ctp:api:type:ChangeSubscription" rel="nofollow">ChangeSubscription</a> for Carts to receive a <a href="https://docs.commercetools.com/apis/ctp:api:type:ResourceDeletedDeliveryPayload" rel="nofollow">ResourceDeletedDeliveryPayload</a> upon deletion of the Cart.</p>
     * @param deleteDaysAfterLastModification value to be set
     */

    public void setDeleteDaysAfterLastModification(final Long deleteDaysAfterLastModification);

    /**
     *  <p>Custom Fields for the Cart.</p>
     * @param custom value to be set
     */

    public void setCustom(final CustomFieldsDraft custom);

    /**
     * factory method
     * @return instance of MyCartDraft
     */
    public static MyCartDraft of() {
        return new MyCartDraftImpl();
    }

    /**
     * factory method to create a shallow copy MyCartDraft
     * @param template instance to be copied
     * @return copy instance
     */
    public static MyCartDraft of(final MyCartDraft template) {
        MyCartDraftImpl instance = new MyCartDraftImpl();
        instance.setCurrency(template.getCurrency());
        instance.setCustomerEmail(template.getCustomerEmail());
        instance.setBusinessUnit(template.getBusinessUnit());
        instance.setStore(template.getStore());
        instance.setLineItems(template.getLineItems());
        instance.setTaxMode(template.getTaxMode());
        instance.setInventoryMode(template.getInventoryMode());
        instance.setBillingAddress(template.getBillingAddress());
        instance.setShippingAddress(template.getShippingAddress());
        instance.setShippingMethod(template.getShippingMethod());
        instance.setItemShippingAddresses(template.getItemShippingAddresses());
        instance.setShippingMode(template.getShippingMode());
        instance.setDiscountCodes(template.getDiscountCodes());
        instance.setCountry(template.getCountry());
        instance.setLocale(template.getLocale());
        instance.setDeleteDaysAfterLastModification(template.getDeleteDaysAfterLastModification());
        instance.setCustom(template.getCustom());
        return instance;
    }

    public MyCartDraft copyDeep();

    /**
     * factory method to create a deep copy of MyCartDraft
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static MyCartDraft deepCopy(@Nullable final MyCartDraft template) {
        if (template == null) {
            return null;
        }
        MyCartDraftImpl instance = new MyCartDraftImpl();
        instance.setCurrency(template.getCurrency());
        instance.setCustomerEmail(template.getCustomerEmail());
        instance.setBusinessUnit(com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifier
                .deepCopy(template.getBusinessUnit()));
        instance.setStore(com.commercetools.api.models.store.StoreResourceIdentifier.deepCopy(template.getStore()));
        instance.setLineItems(Optional.ofNullable(template.getLineItems())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.me.MyLineItemDraft::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        instance.setTaxMode(template.getTaxMode());
        instance.setInventoryMode(template.getInventoryMode());
        instance.setBillingAddress(
            com.commercetools.api.models.common.BaseAddress.deepCopy(template.getBillingAddress()));
        instance.setShippingAddress(
            com.commercetools.api.models.common.BaseAddress.deepCopy(template.getShippingAddress()));
        instance.setShippingMethod(com.commercetools.api.models.shipping_method.ShippingMethodResourceIdentifier
                .deepCopy(template.getShippingMethod()));
        instance.setItemShippingAddresses(Optional.ofNullable(template.getItemShippingAddresses())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.common.BaseAddress::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        instance.setShippingMode(template.getShippingMode());
        instance.setDiscountCodes(Optional.ofNullable(template.getDiscountCodes()).map(ArrayList::new).orElse(null));
        instance.setCountry(template.getCountry());
        instance.setLocale(template.getLocale());
        instance.setDeleteDaysAfterLastModification(template.getDeleteDaysAfterLastModification());
        instance.setCustom(com.commercetools.api.models.type.CustomFieldsDraft.deepCopy(template.getCustom()));
        return instance;
    }

    /**
     * builder factory method for MyCartDraft
     * @return builder
     */
    public static MyCartDraftBuilder builder() {
        return MyCartDraftBuilder.of();
    }

    /**
     * create builder for MyCartDraft instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static MyCartDraftBuilder builder(final MyCartDraft template) {
        return MyCartDraftBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withMyCartDraft(Function<MyCartDraft, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<MyCartDraft> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<MyCartDraft>() {
            @Override
            public String toString() {
                return "TypeReference<MyCartDraft>";
            }
        };
    }
}
