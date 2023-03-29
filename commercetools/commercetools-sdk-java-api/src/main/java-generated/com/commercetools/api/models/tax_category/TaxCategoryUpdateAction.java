
package com.commercetools.api.models.tax_category;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

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
@JsonSubTypes({
        @JsonSubTypes.Type(value = com.commercetools.api.models.tax_category.TaxCategoryAddTaxRateActionImpl.class, name = TaxCategoryAddTaxRateAction.ADD_TAX_RATE),
        @JsonSubTypes.Type(value = com.commercetools.api.models.tax_category.TaxCategoryChangeNameActionImpl.class, name = TaxCategoryChangeNameAction.CHANGE_NAME),
        @JsonSubTypes.Type(value = com.commercetools.api.models.tax_category.TaxCategoryRemoveTaxRateActionImpl.class, name = TaxCategoryRemoveTaxRateAction.REMOVE_TAX_RATE),
        @JsonSubTypes.Type(value = com.commercetools.api.models.tax_category.TaxCategoryReplaceTaxRateActionImpl.class, name = TaxCategoryReplaceTaxRateAction.REPLACE_TAX_RATE),
        @JsonSubTypes.Type(value = com.commercetools.api.models.tax_category.TaxCategorySetDescriptionActionImpl.class, name = TaxCategorySetDescriptionAction.SET_DESCRIPTION),
        @JsonSubTypes.Type(value = com.commercetools.api.models.tax_category.TaxCategorySetKeyActionImpl.class, name = TaxCategorySetKeyAction.SET_KEY) })
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
        if (template instanceof com.commercetools.api.models.tax_category.TaxCategoryAddTaxRateAction) {
            return com.commercetools.api.models.tax_category.TaxCategoryAddTaxRateAction
                    .deepCopy((com.commercetools.api.models.tax_category.TaxCategoryAddTaxRateAction) template);
        }
        if (template instanceof com.commercetools.api.models.tax_category.TaxCategoryChangeNameAction) {
            return com.commercetools.api.models.tax_category.TaxCategoryChangeNameAction
                    .deepCopy((com.commercetools.api.models.tax_category.TaxCategoryChangeNameAction) template);
        }
        if (template instanceof com.commercetools.api.models.tax_category.TaxCategoryRemoveTaxRateAction) {
            return com.commercetools.api.models.tax_category.TaxCategoryRemoveTaxRateAction
                    .deepCopy((com.commercetools.api.models.tax_category.TaxCategoryRemoveTaxRateAction) template);
        }
        if (template instanceof com.commercetools.api.models.tax_category.TaxCategoryReplaceTaxRateAction) {
            return com.commercetools.api.models.tax_category.TaxCategoryReplaceTaxRateAction
                    .deepCopy((com.commercetools.api.models.tax_category.TaxCategoryReplaceTaxRateAction) template);
        }
        if (template instanceof com.commercetools.api.models.tax_category.TaxCategorySetDescriptionAction) {
            return com.commercetools.api.models.tax_category.TaxCategorySetDescriptionAction
                    .deepCopy((com.commercetools.api.models.tax_category.TaxCategorySetDescriptionAction) template);
        }
        if (template instanceof com.commercetools.api.models.tax_category.TaxCategorySetKeyAction) {
            return com.commercetools.api.models.tax_category.TaxCategorySetKeyAction
                    .deepCopy((com.commercetools.api.models.tax_category.TaxCategorySetKeyAction) template);
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
