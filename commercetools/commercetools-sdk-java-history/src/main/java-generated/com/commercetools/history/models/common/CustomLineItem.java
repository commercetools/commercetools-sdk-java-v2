
package com.commercetools.history.models.common;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = CustomLineItemImpl.class)
public interface CustomLineItem {

    /**
    *  <p>The unique ID of this CustomLineItem.</p>
    */
    @NotNull
    @JsonProperty("id")
    public String getId();

    @NotNull
    @Valid
    @JsonProperty("name")
    public LocalizedString getName();

    @NotNull
    @Valid
    @JsonProperty("money")
    public Money getMoney();

    @NotNull
    @Valid
    @JsonProperty("taxedPrice")
    public TaxedItemPrice getTaxedPrice();

    @NotNull
    @Valid
    @JsonProperty("totalPrice")
    public Money getTotalPrice();

    /**
    *  <p>A unique String in the cart to identify this CustomLineItem.</p>
    */
    @NotNull
    @JsonProperty("slug")
    public String getSlug();

    /**
    *  <p>The amount of a CustomLineItem in the cart. Must be a positive integer.</p>
    */
    @NotNull
    @JsonProperty("quantity")
    public Integer getQuantity();

    public void setId(final String id);

    public void setName(final LocalizedString name);

    public void setMoney(final Money money);

    public void setTaxedPrice(final TaxedItemPrice taxedPrice);

    public void setTotalPrice(final Money totalPrice);

    public void setSlug(final String slug);

    public void setQuantity(final Integer quantity);

    public static CustomLineItem of() {
        return new CustomLineItemImpl();
    }

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

    public static CustomLineItemBuilder builder() {
        return CustomLineItemBuilder.of();
    }

    public static CustomLineItemBuilder builder(final CustomLineItem template) {
        return CustomLineItemBuilder.of(template);
    }

    default <T> T withCustomLineItem(Function<CustomLineItem, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<CustomLineItem> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CustomLineItem>() {
            @Override
            public String toString() {
                return "TypeReference<CustomLineItem>";
            }
        };
    }
}
