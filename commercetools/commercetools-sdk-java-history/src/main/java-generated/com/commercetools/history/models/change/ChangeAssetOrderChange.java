
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.history.models.common.LocalizedString;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ChangeAssetOrderChangeImpl.class)
public interface ChangeAssetOrderChange extends Change {

    String CHANGE_ASSET_ORDER_CHANGE = "ChangeAssetOrderChange";

    @NotNull
    @JsonProperty("type")
    public String getType();

    @NotNull
    @JsonProperty("change")
    public String getChange();

    @NotNull
    @Valid
    @JsonProperty("previousValue")
    public List<LocalizedString> getPreviousValue();

    @NotNull
    @Valid
    @JsonProperty("nextValue")
    public List<LocalizedString> getNextValue();

    public void setChange(final String change);

    @JsonIgnore
    public void setPreviousValue(final LocalizedString... previousValue);

    public void setPreviousValue(final List<LocalizedString> previousValue);

    @JsonIgnore
    public void setNextValue(final LocalizedString... nextValue);

    public void setNextValue(final List<LocalizedString> nextValue);

    public static ChangeAssetOrderChange of() {
        return new ChangeAssetOrderChangeImpl();
    }

    public static ChangeAssetOrderChange of(final ChangeAssetOrderChange template) {
        ChangeAssetOrderChangeImpl instance = new ChangeAssetOrderChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    public static ChangeAssetOrderChangeBuilder builder() {
        return ChangeAssetOrderChangeBuilder.of();
    }

    public static ChangeAssetOrderChangeBuilder builder(final ChangeAssetOrderChange template) {
        return ChangeAssetOrderChangeBuilder.of(template);
    }

    default <T> T withChangeAssetOrderChange(Function<ChangeAssetOrderChange, T> helper) {
        return helper.apply(this);
    }
}
