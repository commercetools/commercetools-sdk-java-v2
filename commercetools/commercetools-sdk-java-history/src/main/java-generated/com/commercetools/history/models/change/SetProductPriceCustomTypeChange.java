
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.history.models.common.CustomFields;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = SetProductPriceCustomTypeChangeImpl.class)
public interface SetProductPriceCustomTypeChange extends Change {

    String SET_PRODUCT_PRICE_CUSTOM_TYPE_CHANGE = "SetProductPriceCustomTypeChange";

    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
    *  <p>Update action for <code>setProductPriceCustomType</code></p>
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
    public CustomFields getPreviousValue();

    @NotNull
    @Valid
    @JsonProperty("nextValue")
    public CustomFields getNextValue();

    public void setChange(final String change);

    public void setCatalogData(final String catalogData);

    public void setPreviousValue(final CustomFields previousValue);

    public void setNextValue(final CustomFields nextValue);

    public static SetProductPriceCustomTypeChange of() {
        return new SetProductPriceCustomTypeChangeImpl();
    }

    public static SetProductPriceCustomTypeChange of(final SetProductPriceCustomTypeChange template) {
        SetProductPriceCustomTypeChangeImpl instance = new SetProductPriceCustomTypeChangeImpl();
        instance.setChange(template.getChange());
        instance.setCatalogData(template.getCatalogData());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    public static SetProductPriceCustomTypeChangeBuilder builder() {
        return SetProductPriceCustomTypeChangeBuilder.of();
    }

    public static SetProductPriceCustomTypeChangeBuilder builder(final SetProductPriceCustomTypeChange template) {
        return SetProductPriceCustomTypeChangeBuilder.of(template);
    }

    default <T> T withSetProductPriceCustomTypeChange(Function<SetProductPriceCustomTypeChange, T> helper) {
        return helper.apply(this);
    }
}
