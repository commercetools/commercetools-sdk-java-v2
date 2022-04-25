
package com.commercetools.history.models.change_value;

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
@JsonDeserialize(as = AssetChangeValueImpl.class)
public interface AssetChangeValue {

    @NotNull
    @JsonProperty("id")
    public String getId();

    @NotNull
    @Valid
    @JsonProperty("name")
    public LocalizedString getName();

    public void setId(final String id);

    public void setName(final LocalizedString name);

    public static AssetChangeValue of() {
        return new AssetChangeValueImpl();
    }

    public static AssetChangeValue of(final AssetChangeValue template) {
        AssetChangeValueImpl instance = new AssetChangeValueImpl();
        instance.setId(template.getId());
        instance.setName(template.getName());
        return instance;
    }

    public static AssetChangeValueBuilder builder() {
        return AssetChangeValueBuilder.of();
    }

    public static AssetChangeValueBuilder builder(final AssetChangeValue template) {
        return AssetChangeValueBuilder.of(template);
    }

    default <T> T withAssetChangeValue(Function<AssetChangeValue, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<AssetChangeValue> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<AssetChangeValue>() {
            @Override
            public String toString() {
                return "TypeReference<AssetChangeValue>";
            }
        };
    }
}
