
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
@JsonDeserialize(as = RemoveVariantChangeImpl.class)
public interface RemoveVariantChange extends Change {

    String REMOVE_VARIANT_CHANGE = "RemoveVariantChange";

    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
    *  <p>Update action for <code>removeVariant</code></p>
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

    public static RemoveVariantChange of() {
        return new RemoveVariantChangeImpl();
    }

    public static RemoveVariantChange of(final RemoveVariantChange template) {
        RemoveVariantChangeImpl instance = new RemoveVariantChangeImpl();
        instance.setChange(template.getChange());
        instance.setCatalogData(template.getCatalogData());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    public static RemoveVariantChangeBuilder builder() {
        return RemoveVariantChangeBuilder.of();
    }

    public static RemoveVariantChangeBuilder builder(final RemoveVariantChange template) {
        return RemoveVariantChangeBuilder.of(template);
    }

    default <T> T withRemoveVariantChange(Function<RemoveVariantChange, T> helper) {
        return helper.apply(this);
    }
}
