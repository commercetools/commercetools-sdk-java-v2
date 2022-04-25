
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.history.models.change_value.AssetChangeValue;
import com.commercetools.history.models.common.CustomFields;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = SetAssetCustomTypeChangeImpl.class)
public interface SetAssetCustomTypeChange extends Change {

    String SET_ASSET_CUSTOM_TYPE_CHANGE = "SetAssetCustomTypeChange";

    /**
    *  <p>Update action for <code>setAssetCustomType</code></p>
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
    public CustomFields getNextValue();

    @NotNull
    @Valid
    @JsonProperty("previousValue")
    public CustomFields getPreviousValue();

    public void setChange(final String change);

    public void setAsset(final AssetChangeValue asset);

    public void setNextValue(final CustomFields nextValue);

    public void setPreviousValue(final CustomFields previousValue);

    public static SetAssetCustomTypeChange of() {
        return new SetAssetCustomTypeChangeImpl();
    }

    public static SetAssetCustomTypeChange of(final SetAssetCustomTypeChange template) {
        SetAssetCustomTypeChangeImpl instance = new SetAssetCustomTypeChangeImpl();
        instance.setChange(template.getChange());
        instance.setAsset(template.getAsset());
        instance.setNextValue(template.getNextValue());
        instance.setPreviousValue(template.getPreviousValue());
        return instance;
    }

    public static SetAssetCustomTypeChangeBuilder builder() {
        return SetAssetCustomTypeChangeBuilder.of();
    }

    public static SetAssetCustomTypeChangeBuilder builder(final SetAssetCustomTypeChange template) {
        return SetAssetCustomTypeChangeBuilder.of(template);
    }

    default <T> T withSetAssetCustomTypeChange(Function<SetAssetCustomTypeChange, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<SetAssetCustomTypeChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SetAssetCustomTypeChange>() {
            @Override
            public String toString() {
                return "TypeReference<SetAssetCustomTypeChange>";
            }
        };
    }
}
