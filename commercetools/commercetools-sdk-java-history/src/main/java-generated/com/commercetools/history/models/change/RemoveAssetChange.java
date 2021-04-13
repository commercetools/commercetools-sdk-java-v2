
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.history.models.common.Asset;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = RemoveAssetChangeImpl.class)
public interface RemoveAssetChange extends Change {

    String REMOVE_ASSET_CHANGE = "RemoveAssetChange";

    /**
    *  <p>Update action for <code>removeAsset</code></p>
    */
    @NotNull
    @JsonProperty("change")
    public String getChange();

    @NotNull
    @JsonProperty("type")
    public String getType();

    @NotNull
    @Valid
    @JsonProperty("previousValue")
    public Asset getPreviousValue();

    public void setChange(final String change);

    public void setPreviousValue(final Asset previousValue);

    public static RemoveAssetChange of() {
        return new RemoveAssetChangeImpl();
    }

    public static RemoveAssetChange of(final RemoveAssetChange template) {
        RemoveAssetChangeImpl instance = new RemoveAssetChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        return instance;
    }

    public static RemoveAssetChangeBuilder builder() {
        return RemoveAssetChangeBuilder.of();
    }

    public static RemoveAssetChangeBuilder builder(final RemoveAssetChange template) {
        return RemoveAssetChangeBuilder.of(template);
    }

    default <T> T withRemoveAssetChange(Function<RemoveAssetChange, T> helper) {
        return helper.apply(this);
    }
}
