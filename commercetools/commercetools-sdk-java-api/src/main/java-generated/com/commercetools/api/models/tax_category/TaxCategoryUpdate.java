
package com.commercetools.api.models.tax_category;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = TaxCategoryUpdateImpl.class)
public interface TaxCategoryUpdate extends
        com.commercetools.api.models.ResourceUpdate<TaxCategoryUpdate, TaxCategoryUpdateAction, TaxCategoryUpdateBuilder> {

    /**
    *  <p>Expected version of the TaxCategory on which the changes should be applied. If the expected version does not match the actual version, a <a href="/../api/errors#409-conflict">409 Conflict</a> will be returned.</p>
    */
    @NotNull
    @JsonProperty("version")
    public Long getVersion();

    /**
    *  <p>Update actions to be performed on the TaxCategory.</p>
    */
    @NotNull
    @Valid
    @JsonProperty("actions")
    public List<TaxCategoryUpdateAction> getActions();

    public void setVersion(final Long version);

    @JsonIgnore
    public void setActions(final TaxCategoryUpdateAction... actions);

    public void setActions(final List<TaxCategoryUpdateAction> actions);

    public static TaxCategoryUpdate of() {
        return new TaxCategoryUpdateImpl();
    }

    public static TaxCategoryUpdate of(final TaxCategoryUpdate template) {
        TaxCategoryUpdateImpl instance = new TaxCategoryUpdateImpl();
        instance.setVersion(template.getVersion());
        instance.setActions(template.getActions());
        return instance;
    }

    public static TaxCategoryUpdateBuilder builder() {
        return TaxCategoryUpdateBuilder.of();
    }

    public static TaxCategoryUpdateBuilder builder(final TaxCategoryUpdate template) {
        return TaxCategoryUpdateBuilder.of(template);
    }

    default <T> T withTaxCategoryUpdate(Function<TaxCategoryUpdate, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<TaxCategoryUpdate> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<TaxCategoryUpdate>() {
            @Override
            public String toString() {
                return "TypeReference<TaxCategoryUpdate>";
            }
        };
    }
}
