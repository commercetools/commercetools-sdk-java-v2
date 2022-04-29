
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.history.models.common.Variant;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = AddVariantChangeImpl.class)
public interface AddVariantChange extends Change {

    String ADD_VARIANT_CHANGE = "AddVariantChange";

    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
    *  <p>Update action for <code>addVariant</code></p>
    */
    @NotNull
    @JsonProperty("change")
    public String getChange();

    @NotNull
    @JsonProperty("catalogData")
    public String getCatalogData();

    @NotNull
    @Valid
    @JsonProperty("previousValue")
    public Variant getPreviousValue();

    @NotNull
    @Valid
    @JsonProperty("nextValue")
    public Variant getNextValue();

    public void setChange(final String change);

    public void setCatalogData(final String catalogData);

    public void setPreviousValue(final Variant previousValue);

    public void setNextValue(final Variant nextValue);

    public static AddVariantChange of() {
        return new AddVariantChangeImpl();
    }

    public static AddVariantChange of(final AddVariantChange template) {
        AddVariantChangeImpl instance = new AddVariantChangeImpl();
        instance.setChange(template.getChange());
        instance.setCatalogData(template.getCatalogData());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    public static AddVariantChangeBuilder builder() {
        return AddVariantChangeBuilder.of();
    }

    public static AddVariantChangeBuilder builder(final AddVariantChange template) {
        return AddVariantChangeBuilder.of(template);
    }

    default <T> T withAddVariantChange(Function<AddVariantChange, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<AddVariantChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<AddVariantChange>() {
            @Override
            public String toString() {
                return "TypeReference<AddVariantChange>";
            }
        };
    }
}
