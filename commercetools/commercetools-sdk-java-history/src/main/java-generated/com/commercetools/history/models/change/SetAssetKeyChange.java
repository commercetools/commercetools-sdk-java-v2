
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.history.models.change_value.AssetChangeValue;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = SetAssetKeyChangeImpl.class)
public interface SetAssetKeyChange extends Change {

    String SET_ASSET_KEY_CHANGE = "SetAssetKeyChange";

    /**
    *  <p>Update action for <code>setAssetKey</code></p>
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
    @JsonProperty("nextValue")
    public String getNextValue();

    @NotNull
    @JsonProperty("previousValue")
    public String getPreviousValue();

    public void setChange(final String change);

    public void setAsset(final AssetChangeValue asset);

    public void setNextValue(final String nextValue);

    public void setPreviousValue(final String previousValue);

    public static SetAssetKeyChange of() {
        return new SetAssetKeyChangeImpl();
    }

    public static SetAssetKeyChange of(final SetAssetKeyChange template) {
        SetAssetKeyChangeImpl instance = new SetAssetKeyChangeImpl();
        instance.setChange(template.getChange());
        instance.setAsset(template.getAsset());
        instance.setNextValue(template.getNextValue());
        instance.setPreviousValue(template.getPreviousValue());
        return instance;
    }

    public static SetAssetKeyChangeBuilder builder() {
        return SetAssetKeyChangeBuilder.of();
    }

    public static SetAssetKeyChangeBuilder builder(final SetAssetKeyChange template) {
        return SetAssetKeyChangeBuilder.of(template);
    }

    default <T> T withSetAssetKeyChange(Function<SetAssetKeyChange, T> helper) {
        return helper.apply(this);
    }
}
