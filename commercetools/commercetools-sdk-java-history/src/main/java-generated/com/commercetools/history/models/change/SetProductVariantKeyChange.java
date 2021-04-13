
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = SetProductVariantKeyChangeImpl.class)
public interface SetProductVariantKeyChange extends Change {

    String SET_PRODUCT_VARIANT_KEY_CHANGE = "SetProductVariantKeyChange";

    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
    *  <p>Update action for <code>setProductVariantKey</code></p>
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

    public static SetProductVariantKeyChange of() {
        return new SetProductVariantKeyChangeImpl();
    }

    public static SetProductVariantKeyChange of(final SetProductVariantKeyChange template) {
        SetProductVariantKeyChangeImpl instance = new SetProductVariantKeyChangeImpl();
        instance.setChange(template.getChange());
        instance.setCatalogData(template.getCatalogData());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    public static SetProductVariantKeyChangeBuilder builder() {
        return SetProductVariantKeyChangeBuilder.of();
    }

    public static SetProductVariantKeyChangeBuilder builder(final SetProductVariantKeyChange template) {
        return SetProductVariantKeyChangeBuilder.of(template);
    }

    default <T> T withSetProductVariantKeyChange(Function<SetProductVariantKeyChange, T> helper) {
        return helper.apply(this);
    }
}
