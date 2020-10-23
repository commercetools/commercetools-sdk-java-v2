package com.commercetools.api.models.type;

import com.commercetools.api.models.type.TypeUpdateAction;
import com.commercetools.api.models.type.TypeChangeEnumValueOrderActionImpl;

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
@JsonDeserialize(as = TypeChangeEnumValueOrderActionImpl.class)
public interface TypeChangeEnumValueOrderAction extends TypeUpdateAction {

    
    @NotNull
    @JsonProperty("fieldName")
    public String getFieldName();
    
    @NotNull
    @JsonProperty("keys")
    public List<String> getKeys();

    public void setFieldName(final String fieldName);
    
    public void setKeys(final List<String> keys);

    public static TypeChangeEnumValueOrderActionImpl of(){
        return new TypeChangeEnumValueOrderActionImpl();
    }
    

    public static TypeChangeEnumValueOrderActionImpl of(final TypeChangeEnumValueOrderAction template) {
        TypeChangeEnumValueOrderActionImpl instance = new TypeChangeEnumValueOrderActionImpl();
        instance.setFieldName(template.getFieldName());
        instance.setKeys(template.getKeys());
        return instance;
    }

    default <T> T withTypeChangeEnumValueOrderAction(Function<TypeChangeEnumValueOrderAction, T> helper) {
        return helper.apply(this);
    }
}
