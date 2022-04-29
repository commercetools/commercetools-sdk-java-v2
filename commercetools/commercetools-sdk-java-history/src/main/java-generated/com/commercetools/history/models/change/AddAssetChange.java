
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
@JsonDeserialize(as = AddAssetChangeImpl.class)
public interface AddAssetChange extends Change {

    String ADD_ASSET_CHANGE = "AddAssetChange";

    /**
    *  <p>Update action for <code>addAsset</code></p>
    */
    @NotNull
    @JsonProperty("change")
    public String getChange();

    @NotNull
    @JsonProperty("type")
    public String getType();

    @NotNull
    @Valid
    @JsonProperty("nextValue")
    public Asset getNextValue();

    @NotNull
    @Valid
    @JsonProperty("previousValue")
    public Asset getPreviousValue();

    public void setChange(final String change);

    public void setNextValue(final Asset nextValue);

    public void setPreviousValue(final Asset previousValue);

    public static AddAssetChange of() {
        return new AddAssetChangeImpl();
    }

    public static AddAssetChange of(final AddAssetChange template) {
        AddAssetChangeImpl instance = new AddAssetChangeImpl();
        instance.setChange(template.getChange());
        instance.setNextValue(template.getNextValue());
        instance.setPreviousValue(template.getPreviousValue());
        return instance;
    }

    public static AddAssetChangeBuilder builder() {
        return AddAssetChangeBuilder.of();
    }

    public static AddAssetChangeBuilder builder(final AddAssetChange template) {
        return AddAssetChangeBuilder.of(template);
    }

    default <T> T withAddAssetChange(Function<AddAssetChange, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<AddAssetChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<AddAssetChange>() {
            @Override
            public String toString() {
                return "TypeReference<AddAssetChange>";
            }
        };
    }
}
