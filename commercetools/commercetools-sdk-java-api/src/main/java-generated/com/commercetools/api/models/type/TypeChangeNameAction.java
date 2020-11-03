package com.commercetools.api.models.type;

import com.commercetools.api.models.common.LocalizedString;
import com.commercetools.api.models.type.TypeUpdateAction;
import com.commercetools.api.models.type.TypeChangeNameActionImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.function.Function;
import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = TypeChangeNameActionImpl.class)
public interface TypeChangeNameAction extends TypeUpdateAction {

    
    @NotNull
    @Valid
    @JsonProperty("name")
    public LocalizedString getName();

    public void setName(final LocalizedString name);

    public static TypeChangeNameActionImpl of(){
        return new TypeChangeNameActionImpl();
    }
    

    public static TypeChangeNameActionImpl of(final TypeChangeNameAction template) {
        TypeChangeNameActionImpl instance = new TypeChangeNameActionImpl();
        instance.setName(template.getName());
        return instance;
    }

    default <T> T withTypeChangeNameAction(Function<TypeChangeNameAction, T> helper) {
        return helper.apply(this);
    }
}
