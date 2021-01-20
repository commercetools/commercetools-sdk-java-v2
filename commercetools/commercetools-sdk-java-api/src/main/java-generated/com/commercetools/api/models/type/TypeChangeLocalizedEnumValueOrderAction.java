
package com.commercetools.api.models.type;

import java.io.IOException;
import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.type.TypeChangeLocalizedEnumValueOrderActionImpl;
import com.commercetools.api.models.type.TypeUpdateAction;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.Accessor;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = TypeChangeLocalizedEnumValueOrderActionImpl.class)
public interface TypeChangeLocalizedEnumValueOrderAction extends TypeUpdateAction {

    @NotNull
    @JsonProperty("fieldName")
    public String getFieldName();

    @NotNull
    @JsonProperty("keys")
    public List<String> getKeys();

    public void setFieldName(final String fieldName);

    @JsonIgnore
    public void setKeys(final String... keys);

    public void setKeys(final List<String> keys);

    public static TypeChangeLocalizedEnumValueOrderAction of() {
        return new TypeChangeLocalizedEnumValueOrderActionImpl();
    }

    public static TypeChangeLocalizedEnumValueOrderAction of(final TypeChangeLocalizedEnumValueOrderAction template) {
        TypeChangeLocalizedEnumValueOrderActionImpl instance = new TypeChangeLocalizedEnumValueOrderActionImpl();
        instance.setFieldName(template.getFieldName());
        instance.setKeys(template.getKeys());
        return instance;
    }

    public static TypeChangeLocalizedEnumValueOrderActionBuilder builder() {
        return TypeChangeLocalizedEnumValueOrderActionBuilder.of();
    }

    public static TypeChangeLocalizedEnumValueOrderActionBuilder builder(
            final TypeChangeLocalizedEnumValueOrderAction template) {
        return TypeChangeLocalizedEnumValueOrderActionBuilder.of(template);
    }

    default <T> T withTypeChangeLocalizedEnumValueOrderAction(
            Function<TypeChangeLocalizedEnumValueOrderAction, T> helper) {
        return helper.apply(this);
    }
}
