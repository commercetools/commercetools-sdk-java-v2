package com.commercetools.api.models.type;

import com.commercetools.api.models.type.FieldContainer;
import com.commercetools.api.models.type.TypeReference;
import com.commercetools.api.models.type.CustomFieldsImpl;

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
@JsonDeserialize(as = CustomFieldsImpl.class)
public interface CustomFields  {

    
    @NotNull
    @Valid
    @JsonProperty("type")
    public TypeReference getType();
    /**
    *  <p>A valid JSON object, based on FieldDefinition.</p>
    */
    @NotNull
    @Valid
    @JsonProperty("fields")
    public FieldContainer getFields();

    public void setType(final TypeReference type);
    
    public void setFields(final FieldContainer fields);

    public static CustomFieldsImpl of(){
        return new CustomFieldsImpl();
    }
    

    public static CustomFieldsImpl of(final CustomFields template) {
        CustomFieldsImpl instance = new CustomFieldsImpl();
        instance.setType(template.getType());
        instance.setFields(template.getFields());
        return instance;
    }

    default <T> T withCustomFields(Function<CustomFields, T> helper) {
        return helper.apply(this);
    }
}
