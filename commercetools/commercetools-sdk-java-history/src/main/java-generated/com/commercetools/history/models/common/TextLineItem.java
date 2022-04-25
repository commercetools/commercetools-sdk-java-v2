
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
@JsonDeserialize(as = TextLineItemImpl.class)
public interface TextLineItem {

    @NotNull
    @JsonProperty("addedAt")
    public String getAddedAt();

    @NotNull
    @Valid
    @JsonProperty("custom")
    public CustomFields getCustom();

    @NotNull
    @Valid
    @JsonProperty("description")
    public LocalizedString getDescription();

    @NotNull
    @JsonProperty("id")
    public String getId();

    @NotNull
    @Valid
    @JsonProperty("name")
    public LocalizedString getName();

    @NotNull
    @JsonProperty("quantity")
    public Integer getQuantity();

    public void setAddedAt(final String addedAt);

    public void setCustom(final CustomFields custom);

    public void setDescription(final LocalizedString description);

    public void setId(final String id);

    public void setName(final LocalizedString name);

    public void setQuantity(final Integer quantity);

    public static TextLineItem of() {
        return new TextLineItemImpl();
    }

    public static TextLineItem of(final TextLineItem template) {
        TextLineItemImpl instance = new TextLineItemImpl();
        instance.setAddedAt(template.getAddedAt());
        instance.setCustom(template.getCustom());
        instance.setDescription(template.getDescription());
        instance.setId(template.getId());
        instance.setName(template.getName());
        instance.setQuantity(template.getQuantity());
        return instance;
    }

    public static TextLineItemBuilder builder() {
        return TextLineItemBuilder.of();
    }

    public static TextLineItemBuilder builder(final TextLineItem template) {
        return TextLineItemBuilder.of(template);
    }

    default <T> T withTextLineItem(Function<TextLineItem, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<TextLineItem> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<TextLineItem>() {
            @Override
            public String toString() {
                return "TypeReference<TextLineItem>";
            }
        };
    }
}
