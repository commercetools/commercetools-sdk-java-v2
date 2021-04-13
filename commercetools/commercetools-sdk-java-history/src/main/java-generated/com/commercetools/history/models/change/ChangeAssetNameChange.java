
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.history.models.change_value.AssetChangeValue;
import com.commercetools.history.models.common.LocalizedString;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ChangeAssetNameChangeImpl.class)
public interface ChangeAssetNameChange extends Change {

    String CHANGE_ASSET_NAME_CHANGE = "ChangeAssetNameChange";

    /**
    *  <p>Update action for <code>changeAssetName</code></p>
    */
    @NotNull
    @JsonProperty("change")
    public String getChange();

    @NotNull
    @JsonProperty("type")
    public String getType();

    @NotNull
    @Valid
    @JsonProperty("asset")
    public AssetChangeValue getAsset();

    @NotNull
    @Valid
    @JsonProperty("nextValue")
    public LocalizedString getNextValue();

    @NotNull
    @Valid
    @JsonProperty("previousValue")
    public LocalizedString getPreviousValue();

    public void setChange(final String change);

    public void setAsset(final AssetChangeValue asset);

    public void setNextValue(final LocalizedString nextValue);

    public void setPreviousValue(final LocalizedString previousValue);

    public static ChangeAssetNameChange of() {
        return new ChangeAssetNameChangeImpl();
    }

    public static ChangeAssetNameChange of(final ChangeAssetNameChange template) {
        ChangeAssetNameChangeImpl instance = new ChangeAssetNameChangeImpl();
        instance.setChange(template.getChange());
        instance.setAsset(template.getAsset());
        instance.setNextValue(template.getNextValue());
        instance.setPreviousValue(template.getPreviousValue());
        return instance;
    }

    public static ChangeAssetNameChangeBuilder builder() {
        return ChangeAssetNameChangeBuilder.of();
    }

    public static ChangeAssetNameChangeBuilder builder(final ChangeAssetNameChange template) {
        return ChangeAssetNameChangeBuilder.of(template);
    }

    default <T> T withChangeAssetNameChange(Function<ChangeAssetNameChange, T> helper) {
        return helper.apply(this);
    }
}
