
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
@JsonDeserialize(as = SetAssetCustomFieldChangeImpl.class)
public interface SetAssetCustomFieldChange extends Change {

    String SET_ASSET_CUSTOM_FIELD_CHANGE = "SetAssetCustomFieldChange";

    /**
    *  <p>Update action for <code>setAssetCustomField</code></p>
    */
    @NotNull
    @JsonProperty("change")
    public String getChange();

    @NotNull
    @JsonProperty("type")
    public String getType();

    @NotNull
    @JsonProperty("name")
    public String getName();

    @NotNull
    @JsonProperty("customTypeId")
    public String getCustomTypeId();

    @NotNull
    @Valid
    @JsonProperty("asset")
    public AssetChangeValue getAsset();

    @NotNull
    @JsonProperty("nextValue")
    public Object getNextValue();

    @NotNull
    @JsonProperty("previousValue")
    public Object getPreviousValue();

    public void setChange(final String change);

    public void setName(final String name);

    public void setCustomTypeId(final String customTypeId);

    public void setAsset(final AssetChangeValue asset);

    public void setNextValue(final Object nextValue);

    public void setPreviousValue(final Object previousValue);

    public static SetAssetCustomFieldChange of() {
        return new SetAssetCustomFieldChangeImpl();
    }

    public static SetAssetCustomFieldChange of(final SetAssetCustomFieldChange template) {
        SetAssetCustomFieldChangeImpl instance = new SetAssetCustomFieldChangeImpl();
        instance.setChange(template.getChange());
        instance.setName(template.getName());
        instance.setCustomTypeId(template.getCustomTypeId());
        instance.setAsset(template.getAsset());
        instance.setNextValue(template.getNextValue());
        instance.setPreviousValue(template.getPreviousValue());
        return instance;
    }

    public static SetAssetCustomFieldChangeBuilder builder() {
        return SetAssetCustomFieldChangeBuilder.of();
    }

    public static SetAssetCustomFieldChangeBuilder builder(final SetAssetCustomFieldChange template) {
        return SetAssetCustomFieldChangeBuilder.of(template);
    }

    default <T> T withSetAssetCustomFieldChange(Function<SetAssetCustomFieldChange, T> helper) {
        return helper.apply(this);
    }
}
