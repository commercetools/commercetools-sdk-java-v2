package com.commercetools.api.models.error;

import com.commercetools.api.models.error.ErrorObject;
import com.commercetools.api.models.product.Attribute;
import com.commercetools.api.models.error.DuplicateAttributeValuesErrorImpl;

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
@JsonDeserialize(as = DuplicateAttributeValuesErrorImpl.class)
public interface DuplicateAttributeValuesError extends ErrorObject {

    
    @NotNull
    @Valid
    @JsonProperty("attributes")
    public List<Attribute> getAttributes();

    @JsonIgnore
    public void setAttributes(final Attribute ...attributes);
    public void setAttributes(final List<Attribute> attributes);

    public static DuplicateAttributeValuesErrorImpl of(){
        return new DuplicateAttributeValuesErrorImpl();
    }
    

    public static DuplicateAttributeValuesErrorImpl of(final DuplicateAttributeValuesError template) {
        DuplicateAttributeValuesErrorImpl instance = new DuplicateAttributeValuesErrorImpl();
        instance.setMessage(template.getMessage());
        instance.setAttributes(template.getAttributes());
        return instance;
    }

    default <T> T withDuplicateAttributeValuesError(Function<DuplicateAttributeValuesError, T> helper) {
        return helper.apply(this);
    }
}
