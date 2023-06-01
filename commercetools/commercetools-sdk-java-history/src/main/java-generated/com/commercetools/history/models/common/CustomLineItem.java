package com.commercetools.history.models.common;

import com.commercetools.history.models.common.LocalizedString;
import com.commercetools.history.models.common.Money;
import com.commercetools.history.models.common.TaxedItemPrice;
import com.commercetools.history.models.common.CustomLineItemImpl;

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
 * CustomLineItem
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomLineItem customLineItem = CustomLineItem.builder()
 *             .id("{id}")
 *             .name(nameBuilder -> nameBuilder)
 *             .money(moneyBuilder -> moneyBuilder)
 *             .taxedPrice(taxedPriceBuilder -> taxedPriceBuilder)
 *             .totalPrice(totalPriceBuilder -> totalPriceBuilder)
 *             .slug("{slug}")
 *             .quantity(1)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
@JsonDeserialize(as = CustomLineItemImpl.class)
public interface CustomLineItem  {


    /**
     *  <p>The unique ID of this CustomLineItem.</p>
     * @return id
     */
    @NotNull
    @JsonProperty("id")
    public String getId();
    /**
     *
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
    public Money getMoney();
    /**
     *
     * @return taxedPrice
     */
    @NotNull
    @Valid
    @JsonProperty("taxedPrice")
    public TaxedItemPrice getTaxedPrice();
    /**
     *
     * @return totalPrice
     */
    @NotNull
    @Valid
    @JsonProperty("totalPrice")
    public Money getTotalPrice();
    /**
     *  <p>A unique String in the cart to identify this CustomLineItem.</p>
     * @return slug
     */
    @NotNull
    @JsonProperty("slug")
    public String getSlug();
    /**
     *  <p>The amount of a CustomLineItem in the cart. Must be a positive integer.</p>
     * @return quantity
     */
    @NotNull
    @JsonProperty("quantity")
    public Integer getQuantity();

    /**
     *  <p>The unique ID of this CustomLineItem.</p>
     * @param id value to be set
     */
    
    public void setId(final String id);
    
    
    /**
     * set name
     * @param name value to be set
     */
    
    public void setName(final LocalizedString name);
    
    
    /**
     * set money
     * @param money value to be set
     */
    
    public void setMoney(final Money money);
    
    
    /**
     * set taxedPrice
     * @param taxedPrice value to be set
     */
    
    public void setTaxedPrice(final TaxedItemPrice taxedPrice);
    
    
    /**
     * set totalPrice
     * @param totalPrice value to be set
     */
    
    public void setTotalPrice(final Money totalPrice);
    
    
    /**
     *  <p>A unique String in the cart to identify this CustomLineItem.</p>
     * @param slug value to be set
     */
    
    public void setSlug(final String slug);
    
    
    /**
     *  <p>The amount of a CustomLineItem in the cart. Must be a positive integer.</p>
     * @param quantity value to be set
     */
    
    public void setQuantity(final Integer quantity);
    

    /**
     * factory method
     * @return instance of CustomLineItem
     */
    public static CustomLineItem of(){
        return new CustomLineItemImpl();
    }
    

    /**
     * factory method to create a shallow copy CustomLineItem
     * @param template instance to be copied
     * @return copy instance
     */
    public static CustomLineItem of(final CustomLineItem template) {
        CustomLineItemImpl instance = new CustomLineItemImpl();
        instance.setId(template.getId());
        instance.setName(template.getName());
        instance.setMoney(template.getMoney());
        instance.setTaxedPrice(template.getTaxedPrice());
        instance.setTotalPrice(template.getTotalPrice());
        instance.setSlug(template.getSlug());
        instance.setQuantity(template.getQuantity());
        return instance;
    }

    /**
     * factory method to create a deep copy of CustomLineItem
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CustomLineItem deepCopy(@Nullable final CustomLineItem template) {
        if (template == null) {
            return null;
        }
        CustomLineItemImpl instance = new CustomLineItemImpl();
        instance.setId(template.getId());
        instance.setName(com.commercetools.history.models.common.LocalizedString.deepCopy(template.getName()));
        instance.setMoney(com.commercetools.history.models.common.Money.deepCopy(template.getMoney()));
        instance.setTaxedPrice(com.commercetools.history.models.common.TaxedItemPrice.deepCopy(template.getTaxedPrice()));
        instance.setTotalPrice(com.commercetools.history.models.common.Money.deepCopy(template.getTotalPrice()));
        instance.setSlug(template.getSlug());
        instance.setQuantity(template.getQuantity());
        return instance;
    }

    /**
     * builder factory method for CustomLineItem
     * @return builder
     */
    public static CustomLineItemBuilder builder() {
        return CustomLineItemBuilder.of();
    }
    
    /**
     * create builder for CustomLineItem instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CustomLineItemBuilder builder(final CustomLineItem template) {
        return CustomLineItemBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCustomLineItem(Function<CustomLineItem, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CustomLineItem> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CustomLineItem>() {
            @Override
            public String toString() {
                return "TypeReference<CustomLineItem>";
            }
        };
    }
}
