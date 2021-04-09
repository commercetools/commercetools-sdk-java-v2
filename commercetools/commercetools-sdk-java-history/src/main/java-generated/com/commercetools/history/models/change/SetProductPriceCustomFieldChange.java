
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
@JsonDeserialize(as = SetProductPriceCustomFieldChangeImpl.class)
public interface SetProductPriceCustomFieldChange extends Change {

    String SET_PRODUCT_PRICE_CUSTOM_FIELD_CHANGE = "SetProductPriceCustomFieldChange";

    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
    *  <p>Update action for <code>setProductPriceCustomField</code></p>
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

    public static SetProductPriceCustomFieldChange of() {
        return new SetProductPriceCustomFieldChangeImpl();
    }

    public static SetProductPriceCustomFieldChange of(final SetProductPriceCustomFieldChange template) {
        SetProductPriceCustomFieldChangeImpl instance = new SetProductPriceCustomFieldChangeImpl();
        instance.setChange(template.getChange());
        instance.setCatalogData(template.getCatalogData());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    public static SetProductPriceCustomFieldChangeBuilder builder() {
        return SetProductPriceCustomFieldChangeBuilder.of();
    }

    public static SetProductPriceCustomFieldChangeBuilder builder(final SetProductPriceCustomFieldChange template) {
        return SetProductPriceCustomFieldChangeBuilder.of(template);
    }

    default <T> T withSetProductPriceCustomFieldChange(Function<SetProductPriceCustomFieldChange, T> helper) {
        return helper.apply(this);
    }
}
