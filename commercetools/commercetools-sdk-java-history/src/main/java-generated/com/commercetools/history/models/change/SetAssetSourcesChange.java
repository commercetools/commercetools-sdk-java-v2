
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.history.models.change_value.AssetChangeValue;
import com.commercetools.history.models.common.AssetSource;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = SetAssetSourcesChangeImpl.class)
public interface SetAssetSourcesChange extends Change {

    String SET_ASSET_SOURCES_CHANGE = "SetAssetSourcesChange";

    /**
    *  <p>Update action for <code>setAssetSources</code></p>
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
    public List<AssetSource> getNextValue();

    @NotNull
    @Valid
    @JsonProperty("previousValue")
    public List<AssetSource> getPreviousValue();

    public void setChange(final String change);

    public void setAsset(final AssetChangeValue asset);

    @JsonIgnore
    public void setNextValue(final AssetSource... nextValue);

    public void setNextValue(final List<AssetSource> nextValue);

    @JsonIgnore
    public void setPreviousValue(final AssetSource... previousValue);

    public void setPreviousValue(final List<AssetSource> previousValue);

    public static SetAssetSourcesChange of() {
        return new SetAssetSourcesChangeImpl();
    }

    public static SetAssetSourcesChange of(final SetAssetSourcesChange template) {
        SetAssetSourcesChangeImpl instance = new SetAssetSourcesChangeImpl();
        instance.setChange(template.getChange());
        instance.setAsset(template.getAsset());
        instance.setNextValue(template.getNextValue());
        instance.setPreviousValue(template.getPreviousValue());
        return instance;
    }

    public static SetAssetSourcesChangeBuilder builder() {
        return SetAssetSourcesChangeBuilder.of();
    }

    public static SetAssetSourcesChangeBuilder builder(final SetAssetSourcesChange template) {
        return SetAssetSourcesChangeBuilder.of(template);
    }

    default <T> T withSetAssetSourcesChange(Function<SetAssetSourcesChange, T> helper) {
        return helper.apply(this);
    }
}
