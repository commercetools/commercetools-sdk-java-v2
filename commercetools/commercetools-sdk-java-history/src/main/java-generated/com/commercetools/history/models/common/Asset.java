
package com.commercetools.history.models.common;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = AssetImpl.class)
public interface Asset {

    @NotNull
    @JsonProperty("id")
    public String getId();

    @NotNull
    @Valid
    @JsonProperty("name")
    public LocalizedString getName();

    @NotNull
    @Valid
    @JsonProperty("description")
    public LocalizedString getDescription();

    @NotNull
    @Valid
    @JsonProperty("custom")
    public CustomFields getCustom();

    @NotNull
    @JsonProperty("key")
    public String getKey();

    public void setId(final String id);

    public void setName(final LocalizedString name);

    public void setDescription(final LocalizedString description);

    public void setCustom(final CustomFields custom);

    public void setKey(final String key);

    public static Asset of() {
        return new AssetImpl();
    }

    public static Asset of(final Asset template) {
        AssetImpl instance = new AssetImpl();
        instance.setId(template.getId());
        instance.setName(template.getName());
        instance.setDescription(template.getDescription());
        instance.setCustom(template.getCustom());
        instance.setKey(template.getKey());
        return instance;
    }

    public static AssetBuilder builder() {
        return AssetBuilder.of();
    }

    public static AssetBuilder builder(final Asset template) {
        return AssetBuilder.of(template);
    }

    default <T> T withAsset(Function<Asset, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<Asset> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<Asset>() {
            @Override
            public String toString() {
                return "TypeReference<Asset>";
            }
        };
    }
}
