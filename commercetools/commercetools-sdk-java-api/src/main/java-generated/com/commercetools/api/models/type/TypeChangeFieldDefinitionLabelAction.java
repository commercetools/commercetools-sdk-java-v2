package com.commercetools.api.models.type;

import com.commercetools.api.models.common.LocalizedString;
import com.commercetools.api.models.type.TypeUpdateAction;
import com.commercetools.api.models.type.TypeChangeFieldDefinitionLabelActionImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;
import java.util.function.Function;
import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = TypeChangeFieldDefinitionLabelActionImpl.class)
public interface TypeChangeFieldDefinitionLabelAction extends TypeUpdateAction {

    
    @NotNull
    @JsonProperty("fieldName")
    public String getFieldName();
    
    @NotNull
    @Valid
    @JsonProperty("label")
    public LocalizedString getLabel();

    public void setFieldName(final String fieldName);
    
    public void setLabel(final LocalizedString label);

    public static TypeChangeFieldDefinitionLabelActionImpl of(){
        return new TypeChangeFieldDefinitionLabelActionImpl();
    }
    

    public static TypeChangeFieldDefinitionLabelActionImpl of(final TypeChangeFieldDefinitionLabelAction template) {
        TypeChangeFieldDefinitionLabelActionImpl instance = new TypeChangeFieldDefinitionLabelActionImpl();
        instance.setFieldName(template.getFieldName());
        instance.setLabel(template.getLabel());
        return instance;
    }

    default <T extends Accessor<TypeChangeFieldDefinitionLabelAction>> T withTypeChangeFieldDefinitionLabelAction(Function<TypeChangeFieldDefinitionLabelAction, T> helper) {
        return helper.apply(this);
    }
}
