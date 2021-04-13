
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
@JsonDeserialize(as = SetAssetTagsChangeImpl.class)
public interface SetAssetTagsChange extends Change {

    String SET_ASSET_TAGS_CHANGE = "SetAssetTagsChange";

    /**
    *  <p>Update action for <code>setAssetTags</code></p>
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
    public List<String> getNextValue();

    @NotNull
    @JsonProperty("previousValue")
    public List<String> getPreviousValue();

    public void setChange(final String change);

    public void setAsset(final AssetChangeValue asset);

    @JsonIgnore
    public void setNextValue(final String... nextValue);

    public void setNextValue(final List<String> nextValue);

    @JsonIgnore
    public void setPreviousValue(final String... previousValue);

    public void setPreviousValue(final List<String> previousValue);

    public static SetAssetTagsChange of() {
        return new SetAssetTagsChangeImpl();
    }

    public static SetAssetTagsChange of(final SetAssetTagsChange template) {
        SetAssetTagsChangeImpl instance = new SetAssetTagsChangeImpl();
        instance.setChange(template.getChange());
        instance.setAsset(template.getAsset());
        instance.setNextValue(template.getNextValue());
        instance.setPreviousValue(template.getPreviousValue());
        return instance;
    }

    public static SetAssetTagsChangeBuilder builder() {
        return SetAssetTagsChangeBuilder.of();
    }

    public static SetAssetTagsChangeBuilder builder(final SetAssetTagsChange template) {
        return SetAssetTagsChangeBuilder.of(template);
    }

    default <T> T withSetAssetTagsChange(Function<SetAssetTagsChange, T> helper) {
        return helper.apply(this);
    }
}
