
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = SetSkuChangeImpl.class)
public interface SetSkuChange extends Change {

    String SET_SKU_CHANGE = "SetSkuChange";

    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
    *  <p>Update action for <code>setSku</code></p>
    */
    @NotNull
    @JsonProperty("change")
    public String getChange();

    @NotNull
    @JsonProperty("catalogData")
    public String getCatalogData();

    @NotNull
    @JsonProperty("previousValue")
    public String getPreviousValue();

    @NotNull
    @JsonProperty("nextValue")
    public String getNextValue();

    public void setChange(final String change);

    public void setCatalogData(final String catalogData);

    public void setPreviousValue(final String previousValue);

    public void setNextValue(final String nextValue);

    public static SetSkuChange of() {
        return new SetSkuChangeImpl();
    }

    public static SetSkuChange of(final SetSkuChange template) {
        SetSkuChangeImpl instance = new SetSkuChangeImpl();
        instance.setChange(template.getChange());
        instance.setCatalogData(template.getCatalogData());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    public static SetSkuChangeBuilder builder() {
        return SetSkuChangeBuilder.of();
    }

    public static SetSkuChangeBuilder builder(final SetSkuChange template) {
        return SetSkuChangeBuilder.of(template);
    }

    default <T> T withSetSkuChange(Function<SetSkuChange, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<SetSkuChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SetSkuChange>() {
            @Override
            public String toString() {
                return "TypeReference<SetSkuChange>";
            }
        };
    }
}
