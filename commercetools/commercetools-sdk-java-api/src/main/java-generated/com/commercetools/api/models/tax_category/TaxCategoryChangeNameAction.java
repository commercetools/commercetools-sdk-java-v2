
package com.commercetools.api.models.tax_category;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = TaxCategoryChangeNameActionImpl.class)
public interface TaxCategoryChangeNameAction extends TaxCategoryUpdateAction {

    String CHANGE_NAME = "changeName";

    /**
    *  <p>New value to set. Must not be empty.</p>
    */
    @NotNull
    @JsonProperty("name")
    public String getName();

    public void setName(final String name);

    public static TaxCategoryChangeNameAction of() {
        return new TaxCategoryChangeNameActionImpl();
    }

    public static TaxCategoryChangeNameAction of(final TaxCategoryChangeNameAction template) {
        TaxCategoryChangeNameActionImpl instance = new TaxCategoryChangeNameActionImpl();
        instance.setName(template.getName());
        return instance;
    }

    public static TaxCategoryChangeNameActionBuilder builder() {
        return TaxCategoryChangeNameActionBuilder.of();
    }

    public static TaxCategoryChangeNameActionBuilder builder(final TaxCategoryChangeNameAction template) {
        return TaxCategoryChangeNameActionBuilder.of(template);
    }

    default <T> T withTaxCategoryChangeNameAction(Function<TaxCategoryChangeNameAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<TaxCategoryChangeNameAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<TaxCategoryChangeNameAction>() {
            @Override
            public String toString() {
                return "TypeReference<TaxCategoryChangeNameAction>";
            }
        };
    }
}
