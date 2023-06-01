package com.commercetools.importapi.models.orders;

import com.commercetools.importapi.models.common.LocalizedString;
import com.commercetools.importapi.models.common.TaxCategoryKeyReference;
import com.commercetools.importapi.models.common.TypedMoney;
import com.commercetools.importapi.models.orders.CustomLineItemTaxedPrice;
import com.commercetools.importapi.models.orders.DiscountedLineItemPriceDraft;
import com.commercetools.importapi.models.orders.ExternalTaxRateDraft;
import com.commercetools.importapi.models.orders.ItemShippingDetailsDraft;
import com.commercetools.importapi.models.orders.ItemState;
import com.commercetools.importapi.models.prices.TaxRate;
import com.commercetools.importapi.models.orders.CustomLineItemDraftImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.annotation.Nullable;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.io.IOException;

/**
 * CustomLineItemDraft
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomLineItemDraft customLineItemDraft = CustomLineItemDraft.builder()
 *             .name(nameBuilder -> nameBuilder)
 *             .money(moneyBuilder -> moneyBuilder)
 *             .totalPrice(totalPriceBuilder -> totalPriceBuilder)
 *             .slug("{slug}")
 *             .quantity(0.3)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
@JsonDeserialize(as = CustomLineItemDraftImpl.class)
public interface CustomLineItemDraft extends io.vrap.rmf.base.client.Draft<CustomLineItemDraft> {


    /**
     *  <p>A localized string is a JSON object where the keys are of IETF language tag, and the values the corresponding strings used for that language.</p>
     *  <pre><code>{
     *    "de": "Hundefutter",
     *    "en": "dog food"
     *  }
     *  </code></pre>
     * @return name
     */
    @NotNull
    @Valid
    @JsonProperty("name")
    public LocalizedString getName();
    /**
     *
     * @return money
     */
    @NotNull
    @Valid
    @JsonProperty("money")
    public TypedMoney getMoney();
    /**
     *
     * @return taxedPrice
     */
    @Valid
    @JsonProperty("taxedPrice")
    public CustomLineItemTaxedPrice getTaxedPrice();
    /**
     *
     * @return totalPrice
     */
    @NotNull
    @Valid
    @JsonProperty("totalPrice")
    public TypedMoney getTotalPrice();
    /**
     *
     * @return slug
     */
    @NotNull
    @JsonProperty("slug")
    public String getSlug();
    /**
     *
     * @return quantity
     */
    @NotNull
    @JsonProperty("quantity")
    public Double getQuantity();
    /**
     *
     * @return state
     */
    @Valid
    @JsonProperty("state")
    public List<ItemState> getState();
    /**
     *  <p>References a tax category by key.</p>
     * @return taxCategory
     */
    @Valid
    @JsonProperty("taxCategory")
    public TaxCategoryKeyReference getTaxCategory();
    /**
     *
     * @return taxRate
     */
    @Valid
    @JsonProperty("taxRate")
    public TaxRate getTaxRate();
    /**
     *
     * @return externalTaxRate
     */
    @Valid
    @JsonProperty("externalTaxRate")
    public ExternalTaxRateDraft getExternalTaxRate();
    /**
     *
     * @return discountedPricePerQuantity
     */
    @Valid
    @JsonProperty("discountedPricePerQuantity")
    public List<DiscountedLineItemPriceDraft> getDiscountedPricePerQuantity();
    /**
     *
     * @return shippingDetails
     */
    @Valid
    @JsonProperty("shippingDetails")
    public ItemShippingDetailsDraft getShippingDetails();

    /**
     *  <p>A localized string is a JSON object where the keys are of IETF language tag, and the values the corresponding strings used for that language.</p>
     *  <pre><code>{
     *    "de": "Hundefutter",
     *    "en": "dog food"
     *  }
     *  </code></pre>
     * @param name value to be set
     */
    
    public void setName(final LocalizedString name);
    
    
    /**
     * set money
     * @param money value to be set
     */
    
    public void setMoney(final TypedMoney money);
    
    
    /**
     * set taxedPrice
     * @param taxedPrice value to be set
     */
    
    public void setTaxedPrice(final CustomLineItemTaxedPrice taxedPrice);
    
    
    /**
     * set totalPrice
     * @param totalPrice value to be set
     */
    
    public void setTotalPrice(final TypedMoney totalPrice);
    
    
    /**
     * set slug
     * @param slug value to be set
     */
    
    public void setSlug(final String slug);
    
    
    /**
     * set quantity
     * @param quantity value to be set
     */
    
    public void setQuantity(final Double quantity);
    
    
    /**
     * set state
     * @param state values to be set
     */
    
    @JsonIgnore
    public void setState(final ItemState ...state);
    /**
     * set state
     * @param state values to be set
     */
    
    public void setState(final List<ItemState> state);
    
    /**
     *  <p>References a tax category by key.</p>
     * @param taxCategory value to be set
     */
    
    public void setTaxCategory(final TaxCategoryKeyReference taxCategory);
    
    
    /**
     * set taxRate
     * @param taxRate value to be set
     */
    
    public void setTaxRate(final TaxRate taxRate);
    
    
    /**
     * set externalTaxRate
     * @param externalTaxRate value to be set
     */
    
    public void setExternalTaxRate(final ExternalTaxRateDraft externalTaxRate);
    
    
    /**
     * set discountedPricePerQuantity
     * @param discountedPricePerQuantity values to be set
     */
    
    @JsonIgnore
    public void setDiscountedPricePerQuantity(final DiscountedLineItemPriceDraft ...discountedPricePerQuantity);
    /**
     * set discountedPricePerQuantity
     * @param discountedPricePerQuantity values to be set
     */
    
    public void setDiscountedPricePerQuantity(final List<DiscountedLineItemPriceDraft> discountedPricePerQuantity);
    
    /**
     * set shippingDetails
     * @param shippingDetails value to be set
     */
    
    public void setShippingDetails(final ItemShippingDetailsDraft shippingDetails);
    

    /**
     * factory method
     * @return instance of CustomLineItemDraft
     */
    public static CustomLineItemDraft of(){
        return new CustomLineItemDraftImpl();
    }
    

    /**
     * factory method to create a shallow copy CustomLineItemDraft
     * @param template instance to be copied
     * @return copy instance
     */
    public static CustomLineItemDraft of(final CustomLineItemDraft template) {
        CustomLineItemDraftImpl instance = new CustomLineItemDraftImpl();
        instance.setName(template.getName());
        instance.setMoney(template.getMoney());
        instance.setTaxedPrice(template.getTaxedPrice());
        instance.setTotalPrice(template.getTotalPrice());
        instance.setSlug(template.getSlug());
        instance.setQuantity(template.getQuantity());
        instance.setState(template.getState());
        instance.setTaxCategory(template.getTaxCategory());
        instance.setTaxRate(template.getTaxRate());
        instance.setExternalTaxRate(template.getExternalTaxRate());
        instance.setDiscountedPricePerQuantity(template.getDiscountedPricePerQuantity());
        instance.setShippingDetails(template.getShippingDetails());
        return instance;
    }

    /**
     * factory method to create a deep copy of CustomLineItemDraft
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CustomLineItemDraft deepCopy(@Nullable final CustomLineItemDraft template) {
        if (template == null) {
            return null;
        }
        CustomLineItemDraftImpl instance = new CustomLineItemDraftImpl();
        instance.setName(com.commercetools.importapi.models.common.LocalizedString.deepCopy(template.getName()));
        instance.setMoney(com.commercetools.importapi.models.common.TypedMoney.deepCopy(template.getMoney()));
        instance.setTaxedPrice(com.commercetools.importapi.models.orders.CustomLineItemTaxedPrice.deepCopy(template.getTaxedPrice()));
        instance.setTotalPrice(com.commercetools.importapi.models.common.TypedMoney.deepCopy(template.getTotalPrice()));
        instance.setSlug(template.getSlug());
        instance.setQuantity(template.getQuantity());
        instance.setState(Optional.ofNullable(template.getState())
                .map(t -> t.stream().map(com.commercetools.importapi.models.orders.ItemState::deepCopy).collect(Collectors.toList()))
                .orElse(null));
        instance.setTaxCategory(com.commercetools.importapi.models.common.TaxCategoryKeyReference.deepCopy(template.getTaxCategory()));
        instance.setTaxRate(com.commercetools.importapi.models.prices.TaxRate.deepCopy(template.getTaxRate()));
        instance.setExternalTaxRate(com.commercetools.importapi.models.orders.ExternalTaxRateDraft.deepCopy(template.getExternalTaxRate()));
        instance.setDiscountedPricePerQuantity(Optional.ofNullable(template.getDiscountedPricePerQuantity())
                .map(t -> t.stream().map(com.commercetools.importapi.models.orders.DiscountedLineItemPriceDraft::deepCopy).collect(Collectors.toList()))
                .orElse(null));
        instance.setShippingDetails(com.commercetools.importapi.models.orders.ItemShippingDetailsDraft.deepCopy(template.getShippingDetails()));
        return instance;
    }

    /**
     * builder factory method for CustomLineItemDraft
     * @return builder
     */
    public static CustomLineItemDraftBuilder builder() {
        return CustomLineItemDraftBuilder.of();
    }
    
    /**
     * create builder for CustomLineItemDraft instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CustomLineItemDraftBuilder builder(final CustomLineItemDraft template) {
        return CustomLineItemDraftBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCustomLineItemDraft(Function<CustomLineItemDraft, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CustomLineItemDraft> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CustomLineItemDraft>() {
            @Override
            public String toString() {
                return "TypeReference<CustomLineItemDraft>";
            }
        };
    }
}
