
package com.commercetools.api.models.tax_category;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = TaxCategorySetKeyActionImpl.class)
public interface TaxCategorySetKeyAction extends TaxCategoryUpdateAction {

    String SET_KEY = "setKey";

    /**
    *  <p>Value to set. If empty, any existing value will be removed.</p>
    */

    @JsonProperty("key")
    public String getKey();

    public void setKey(final String key);

    public static TaxCategorySetKeyAction of() {
        return new TaxCategorySetKeyActionImpl();
    }

    public static TaxCategorySetKeyAction of(final TaxCategorySetKeyAction template) {
        TaxCategorySetKeyActionImpl instance = new TaxCategorySetKeyActionImpl();
        instance.setKey(template.getKey());
        return instance;
    }

    public static TaxCategorySetKeyActionBuilder builder() {
        return TaxCategorySetKeyActionBuilder.of();
    }

    public static TaxCategorySetKeyActionBuilder builder(final TaxCategorySetKeyAction template) {
        return TaxCategorySetKeyActionBuilder.of(template);
    }

    default <T> T withTaxCategorySetKeyAction(Function<TaxCategorySetKeyAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<TaxCategorySetKeyAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<TaxCategorySetKeyAction>() {
            @Override
            public String toString() {
                return "TypeReference<TaxCategorySetKeyAction>";
            }
        };
    }
}
