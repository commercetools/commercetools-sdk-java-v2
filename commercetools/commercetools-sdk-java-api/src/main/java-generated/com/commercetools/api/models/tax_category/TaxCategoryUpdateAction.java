
package com.commercetools.api.models.tax_category;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@JsonSubTypes({
        @JsonSubTypes.Type(value = com.commercetools.api.models.tax_category.TaxCategoryAddTaxRateActionImpl.class, name = TaxCategoryAddTaxRateAction.ADD_TAX_RATE),
        @JsonSubTypes.Type(value = com.commercetools.api.models.tax_category.TaxCategoryChangeNameActionImpl.class, name = TaxCategoryChangeNameAction.CHANGE_NAME),
        @JsonSubTypes.Type(value = com.commercetools.api.models.tax_category.TaxCategoryRemoveTaxRateActionImpl.class, name = TaxCategoryRemoveTaxRateAction.REMOVE_TAX_RATE),
        @JsonSubTypes.Type(value = com.commercetools.api.models.tax_category.TaxCategoryReplaceTaxRateActionImpl.class, name = TaxCategoryReplaceTaxRateAction.REPLACE_TAX_RATE),
        @JsonSubTypes.Type(value = com.commercetools.api.models.tax_category.TaxCategorySetDescriptionActionImpl.class, name = TaxCategorySetDescriptionAction.SET_DESCRIPTION),
        @JsonSubTypes.Type(value = com.commercetools.api.models.tax_category.TaxCategorySetKeyActionImpl.class, name = TaxCategorySetKeyAction.SET_KEY) })
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "action", defaultImpl = TaxCategoryUpdateActionImpl.class, visible = true)
@JsonDeserialize(as = TaxCategoryUpdateActionImpl.class)
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public interface TaxCategoryUpdateAction
        extends com.commercetools.api.models.ResourceUpdateAction<TaxCategoryUpdateAction> {

    @NotNull
    @JsonProperty("action")
    public String getAction();

    public static com.commercetools.api.models.tax_category.TaxCategoryAddTaxRateActionBuilder addTaxRateBuilder() {
        return com.commercetools.api.models.tax_category.TaxCategoryAddTaxRateActionBuilder.of();
    }

    public static com.commercetools.api.models.tax_category.TaxCategoryChangeNameActionBuilder changeNameBuilder() {
        return com.commercetools.api.models.tax_category.TaxCategoryChangeNameActionBuilder.of();
    }

    public static com.commercetools.api.models.tax_category.TaxCategoryRemoveTaxRateActionBuilder removeTaxRateBuilder() {
        return com.commercetools.api.models.tax_category.TaxCategoryRemoveTaxRateActionBuilder.of();
    }

    public static com.commercetools.api.models.tax_category.TaxCategoryReplaceTaxRateActionBuilder replaceTaxRateBuilder() {
        return com.commercetools.api.models.tax_category.TaxCategoryReplaceTaxRateActionBuilder.of();
    }

    public static com.commercetools.api.models.tax_category.TaxCategorySetDescriptionActionBuilder setDescriptionBuilder() {
        return com.commercetools.api.models.tax_category.TaxCategorySetDescriptionActionBuilder.of();
    }

    public static com.commercetools.api.models.tax_category.TaxCategorySetKeyActionBuilder setKeyBuilder() {
        return com.commercetools.api.models.tax_category.TaxCategorySetKeyActionBuilder.of();
    }

    default <T> T withTaxCategoryUpdateAction(Function<TaxCategoryUpdateAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<TaxCategoryUpdateAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<TaxCategoryUpdateAction>() {
            @Override
            public String toString() {
                return "TypeReference<TaxCategoryUpdateAction>";
            }
        };
    }
}
