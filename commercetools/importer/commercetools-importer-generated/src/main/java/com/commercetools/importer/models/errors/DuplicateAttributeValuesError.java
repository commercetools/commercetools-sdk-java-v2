package com.commercetools.importer.models.errors;

import com.commercetools.importer.models.errors.ErrorObject;
import com.commercetools.importer.models.productvariants.Attribute;
import com.commercetools.importer.models.errors.DuplicateAttributeValuesErrorImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import java.io.IOException;

/**
*  <p>The CombinationUnique AttributeConstraint was violated.</p>
*/
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

}
