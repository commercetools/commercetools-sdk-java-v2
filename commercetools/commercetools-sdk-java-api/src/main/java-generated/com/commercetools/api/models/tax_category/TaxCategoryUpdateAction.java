
package com.commercetools.api.models.tax_category;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 * TaxCategoryUpdateAction
 *
 * <hr>
 * Example to create a subtype instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     TaxCategoryUpdateAction taxCategoryUpdateAction = TaxCategoryUpdateAction.addTaxRateBuilder()
 *             taxRate(taxRateBuilder -> taxRateBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "action", defaultImpl = TaxCategoryUpdateActionImpl.class, visible = true)
@JsonDeserialize(as = TaxCategoryUpdateActionImpl.class)
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface TaxCategoryUpdateAction
        extends com.commercetools.api.models.ResourceUpdateAction<TaxCategoryUpdateAction> {

    /**
     *
     * @return action
     */
    @NotNull
    @JsonProperty("action")
    public String getAction();

    public TaxCategoryUpdateAction copyDeep();

    /**
     * factory method to create a deep copy of TaxCategoryUpdateAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static TaxCategoryUpdateAction deepCopy(@Nullable final TaxCategoryUpdateAction template) {
        if (template == null) {
            return null;
        }

        if (!(template instanceof TaxCategoryUpdateActionImpl)) {
            return template.copyDeep();
        }
        TaxCategoryUpdateActionImpl instance = new TaxCategoryUpdateActionImpl();
        return instance;
    }

    /**
     * builder for addTaxRate subtype
     * @return builder
     */
    public static com.commercetools.api.models.tax_category.TaxCategoryAddTaxRateActionBuilder addTaxRateBuilder() {
        return com.commercetools.api.models.tax_category.TaxCategoryAddTaxRateActionBuilder.of();
    }

    /**
     * builder for changeName subtype
     * @return builder
     */
    public static com.commercetools.api.models.tax_category.TaxCategoryChangeNameActionBuilder changeNameBuilder() {
        return com.commercetools.api.models.tax_category.TaxCategoryChangeNameActionBuilder.of();
    }

    /**
     * builder for removeTaxRate subtype
     * @return builder
     */
    public static com.commercetools.api.models.tax_category.TaxCategoryRemoveTaxRateActionBuilder removeTaxRateBuilder() {
        return com.commercetools.api.models.tax_category.TaxCategoryRemoveTaxRateActionBuilder.of();
    }

    /**
     * builder for replaceTaxRate subtype
     * @return builder
     */
    public static com.commercetools.api.models.tax_category.TaxCategoryReplaceTaxRateActionBuilder replaceTaxRateBuilder() {
        return com.commercetools.api.models.tax_category.TaxCategoryReplaceTaxRateActionBuilder.of();
    }

    /**
     * builder for setDescription subtype
     * @return builder
     */
    public static com.commercetools.api.models.tax_category.TaxCategorySetDescriptionActionBuilder setDescriptionBuilder() {
        return com.commercetools.api.models.tax_category.TaxCategorySetDescriptionActionBuilder.of();
    }

    /**
     * builder for setKey subtype
     * @return builder
     */
    public static com.commercetools.api.models.tax_category.TaxCategorySetKeyActionBuilder setKeyBuilder() {
        return com.commercetools.api.models.tax_category.TaxCategorySetKeyActionBuilder.of();
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withTaxCategoryUpdateAction(Function<TaxCategoryUpdateAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<TaxCategoryUpdateAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<TaxCategoryUpdateAction>() {
            @Override
            public String toString() {
                return "TypeReference<TaxCategoryUpdateAction>";
            }
        };
    }
}
