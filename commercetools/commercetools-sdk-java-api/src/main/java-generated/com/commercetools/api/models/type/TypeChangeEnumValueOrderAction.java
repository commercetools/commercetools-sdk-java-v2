
package com.commercetools.api.models.type;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = TypeChangeEnumValueOrderActionImpl.class)
public interface TypeChangeEnumValueOrderAction extends TypeUpdateAction {

    String CHANGE_ENUM_VALUE_ORDER = "changeEnumValueOrder";

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

    public static TypeChangeEnumValueOrderAction of() {
        return new TypeChangeEnumValueOrderActionImpl();
    }

    public static TypeChangeEnumValueOrderAction of(final TypeChangeEnumValueOrderAction template) {
        TypeChangeEnumValueOrderActionImpl instance = new TypeChangeEnumValueOrderActionImpl();
        instance.setFieldName(template.getFieldName());
        instance.setKeys(template.getKeys());
        return instance;
    }

    public static TypeChangeEnumValueOrderActionBuilder builder() {
        return TypeChangeEnumValueOrderActionBuilder.of();
    }

    public static TypeChangeEnumValueOrderActionBuilder builder(final TypeChangeEnumValueOrderAction template) {
        return TypeChangeEnumValueOrderActionBuilder.of(template);
    }

    default <T> T withTypeChangeEnumValueOrderAction(Function<TypeChangeEnumValueOrderAction, T> helper) {
        return helper.apply(this);
    }
}
