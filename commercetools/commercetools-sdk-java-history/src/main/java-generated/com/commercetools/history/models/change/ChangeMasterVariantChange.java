
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
@JsonDeserialize(as = ChangeMasterVariantChangeImpl.class)
public interface ChangeMasterVariantChange extends Change {

    String CHANGE_MASTER_VARIANT_CHANGE = "ChangeMasterVariantChange";

    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
    *  <p>Update action for <code>changeMasterVariant</code></p>
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

    public static ChangeMasterVariantChange of() {
        return new ChangeMasterVariantChangeImpl();
    }

    public static ChangeMasterVariantChange of(final ChangeMasterVariantChange template) {
        ChangeMasterVariantChangeImpl instance = new ChangeMasterVariantChangeImpl();
        instance.setChange(template.getChange());
        instance.setCatalogData(template.getCatalogData());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    public static ChangeMasterVariantChangeBuilder builder() {
        return ChangeMasterVariantChangeBuilder.of();
    }

    public static ChangeMasterVariantChangeBuilder builder(final ChangeMasterVariantChange template) {
        return ChangeMasterVariantChangeBuilder.of(template);
    }

    default <T> T withChangeMasterVariantChange(Function<ChangeMasterVariantChange, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ChangeMasterVariantChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ChangeMasterVariantChange>() {
            @Override
            public String toString() {
                return "TypeReference<ChangeMasterVariantChange>";
            }
        };
    }
}
