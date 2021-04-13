
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
@JsonDeserialize(as = TextLineItemValueImpl.class)
public interface TextLineItemValue {

    @NotNull
    @JsonProperty("id")
    public String getId();

    @NotNull
    @Valid
    @JsonProperty("name")
    public LocalizedString getName();

    public void setId(final String id);

    public void setName(final LocalizedString name);

    public static TextLineItemValue of() {
        return new TextLineItemValueImpl();
    }

    public static TextLineItemValue of(final TextLineItemValue template) {
        TextLineItemValueImpl instance = new TextLineItemValueImpl();
        instance.setId(template.getId());
        instance.setName(template.getName());
        return instance;
    }

    public static TextLineItemValueBuilder builder() {
        return TextLineItemValueBuilder.of();
    }

    public static TextLineItemValueBuilder builder(final TextLineItemValue template) {
        return TextLineItemValueBuilder.of(template);
    }

    default <T> T withTextLineItemValue(Function<TextLineItemValue, T> helper) {
        return helper.apply(this);
    }
}
