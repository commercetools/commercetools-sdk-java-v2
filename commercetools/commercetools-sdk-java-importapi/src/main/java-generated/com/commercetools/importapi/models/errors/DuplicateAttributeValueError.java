package com.commercetools.importapi.models.errors;

import com.commercetools.importapi.models.errors.ErrorObject;
import com.commercetools.importapi.models.productvariants.Attribute;
import com.commercetools.importapi.models.errors.DuplicateAttributeValueErrorImpl;

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

/**
*  <p>The Unique AttributeConstraint was violated.</p>
*/
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = DuplicateAttributeValueErrorImpl.class)
public interface DuplicateAttributeValueError extends ErrorObject {

    /**
    *  <p>The conflicting attribute.</p>
    */
    @NotNull
    @Valid
    @JsonProperty("attribute")
    public Attribute getAttribute();

    public void setAttribute(final Attribute attribute);

    public static DuplicateAttributeValueErrorImpl of(){
        return new DuplicateAttributeValueErrorImpl();
    }
    

    public static DuplicateAttributeValueErrorImpl of(final DuplicateAttributeValueError template) {
        DuplicateAttributeValueErrorImpl instance = new DuplicateAttributeValueErrorImpl();
        instance.setMessage(template.getMessage());
        instance.setAttribute(template.getAttribute());
        return instance;
    }

    default <T extends Accessor<DuplicateAttributeValueError>> T withDuplicateAttributeValueError(Function<DuplicateAttributeValueError, T> helper) {
        return helper.apply(this);
    }
}
