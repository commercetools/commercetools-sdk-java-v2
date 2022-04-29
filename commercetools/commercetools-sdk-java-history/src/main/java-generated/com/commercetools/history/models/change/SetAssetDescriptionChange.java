
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
@JsonDeserialize(as = SetAssetDescriptionChangeImpl.class)
public interface SetAssetDescriptionChange extends Change {

    String SET_ASSET_DESCRIPTION_CHANGE = "SetAssetDescriptionChange";

    /**
    *  <p>Update action for <code>setAssetDescription</code></p>
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

    public static SetAssetDescriptionChange of() {
        return new SetAssetDescriptionChangeImpl();
    }

    public static SetAssetDescriptionChange of(final SetAssetDescriptionChange template) {
        SetAssetDescriptionChangeImpl instance = new SetAssetDescriptionChangeImpl();
        instance.setChange(template.getChange());
        instance.setAsset(template.getAsset());
        instance.setNextValue(template.getNextValue());
        instance.setPreviousValue(template.getPreviousValue());
        return instance;
    }

    public static SetAssetDescriptionChangeBuilder builder() {
        return SetAssetDescriptionChangeBuilder.of();
    }

    public static SetAssetDescriptionChangeBuilder builder(final SetAssetDescriptionChange template) {
        return SetAssetDescriptionChangeBuilder.of(template);
    }

    default <T> T withSetAssetDescriptionChange(Function<SetAssetDescriptionChange, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<SetAssetDescriptionChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SetAssetDescriptionChange>() {
            @Override
            public String toString() {
                return "TypeReference<SetAssetDescriptionChange>";
            }
        };
    }
}
