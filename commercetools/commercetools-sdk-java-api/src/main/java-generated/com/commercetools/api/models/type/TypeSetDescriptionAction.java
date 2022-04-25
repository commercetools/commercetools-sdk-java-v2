
package com.commercetools.api.models.type;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;

import com.commercetools.api.models.common.LocalizedString;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = TypeSetDescriptionActionImpl.class)
public interface TypeSetDescriptionAction extends TypeUpdateAction {

    String SET_DESCRIPTION = "setDescription";

    /**
    *  <p>Value to set. If empty, any existing value will be removed.</p>
    */
    @Valid
    @JsonProperty("description")
    public LocalizedString getDescription();

    public void setDescription(final LocalizedString description);

    public static TypeSetDescriptionAction of() {
        return new TypeSetDescriptionActionImpl();
    }

    public static TypeSetDescriptionAction of(final TypeSetDescriptionAction template) {
        TypeSetDescriptionActionImpl instance = new TypeSetDescriptionActionImpl();
        instance.setDescription(template.getDescription());
        return instance;
    }

    public static TypeSetDescriptionActionBuilder builder() {
        return TypeSetDescriptionActionBuilder.of();
    }

    public static TypeSetDescriptionActionBuilder builder(final TypeSetDescriptionAction template) {
        return TypeSetDescriptionActionBuilder.of(template);
    }

    default <T> T withTypeSetDescriptionAction(Function<TypeSetDescriptionAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<TypeSetDescriptionAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<TypeSetDescriptionAction>() {
            @Override
            public String toString() {
                return "TypeReference<TypeSetDescriptionAction>";
            }
        };
    }
}
