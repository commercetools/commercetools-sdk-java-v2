
package com.commercetools.api.models.cart;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.common.LocalizedString;
import com.commercetools.api.models.common.Money;
import com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifier;
import com.commercetools.api.models.type.CustomFieldsDraft;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * CartAddCustomLineItemAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartAddCustomLineItemAction cartAddCustomLineItemAction = CartAddCustomLineItemAction.builder()
 *             .money(moneyBuilder -> moneyBuilder)
 *             .name(nameBuilder -> nameBuilder)
 *             .quantity(0.3)
 *             .slug("{slug}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CartAddCustomLineItemActionImpl.class)
public interface CartAddCustomLineItemAction
        extends CartUpdateAction, com.commercetools.api.models.CustomizableDraft<CartAddCustomLineItemAction> {

    String ADD_CUSTOM_LINE_ITEM = "addCustomLineItem";

    /**
     *  <p>Draft type that stores amounts in cent precision for the specified currency.</p>
     *  <p>For storing money values in fractions of the minor unit in a currency, use HighPrecisionMoneyDraft instead.</p>
     */
    @NotNull
    @Valid
    @JsonProperty("money")
    public Money getMoney();

    /**
     *  <p>JSON object where the keys are of type Locale, and the values are the strings used for the corresponding language.</p>
     */
    @NotNull
    @Valid
    @JsonProperty("name")
    public LocalizedString getName();

    /**
     *
     */
    @NotNull
    @JsonProperty("quantity")
    public Long getQuantity();

    /**
     *
     */
    @NotNull
    @JsonProperty("slug")
    public String getSlug();

    /**
     *  <p>ResourceIdentifier to a TaxCategory.</p>
     */
    @Valid
    @JsonProperty("taxCategory")
    public TaxCategoryResourceIdentifier getTaxCategory();

    /**
     *  <p>The representation used when creating or updating a customizable data type with Custom Fields.</p>
     */
    @Valid
    @JsonProperty("custom")
    public CustomFieldsDraft getCustom();

    /**
     *
     */
    @Valid
    @JsonProperty("externalTaxRate")
    public ExternalTaxRateDraft getExternalTaxRate();

    public void setMoney(final Money money);

    public void setName(final LocalizedString name);

    public void setQuantity(final Long quantity);

    public void setSlug(final String slug);

    public void setTaxCategory(final TaxCategoryResourceIdentifier taxCategory);

    public void setCustom(final CustomFieldsDraft custom);

    public void setExternalTaxRate(final ExternalTaxRateDraft externalTaxRate);

    public static CartAddCustomLineItemAction of() {
        return new CartAddCustomLineItemActionImpl();
    }

    public static CartAddCustomLineItemAction of(final CartAddCustomLineItemAction template) {
        CartAddCustomLineItemActionImpl instance = new CartAddCustomLineItemActionImpl();
        instance.setMoney(template.getMoney());
        instance.setName(template.getName());
        instance.setQuantity(template.getQuantity());
        instance.setSlug(template.getSlug());
        instance.setTaxCategory(template.getTaxCategory());
        instance.setCustom(template.getCustom());
        instance.setExternalTaxRate(template.getExternalTaxRate());
        return instance;
    }

    public static CartAddCustomLineItemActionBuilder builder() {
        return CartAddCustomLineItemActionBuilder.of();
    }

    public static CartAddCustomLineItemActionBuilder builder(final CartAddCustomLineItemAction template) {
        return CartAddCustomLineItemActionBuilder.of(template);
    }

    default <T> T withCartAddCustomLineItemAction(Function<CartAddCustomLineItemAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<CartAddCustomLineItemAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CartAddCustomLineItemAction>() {
            @Override
            public String toString() {
                return "TypeReference<CartAddCustomLineItemAction>";
            }
        };
    }
}
