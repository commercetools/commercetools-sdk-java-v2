
package com.commercetools.api.models.error;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.product.Attribute;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = DuplicateAttributeValueErrorImpl.class)
public interface DuplicateAttributeValueError extends ErrorObject {

    String DUPLICATE_ATTRIBUTE_VALUE = "DuplicateAttributeValue";

    @NotNull
    @Valid
    @JsonProperty("attribute")
    public Attribute getAttribute();

    public void setAttribute(final Attribute attribute);

    public static DuplicateAttributeValueError of() {
        return new DuplicateAttributeValueErrorImpl();
    }

    public static DuplicateAttributeValueError of(final DuplicateAttributeValueError template) {
        DuplicateAttributeValueErrorImpl instance = new DuplicateAttributeValueErrorImpl();
        instance.setMessage(template.getMessage());
        instance.setAttribute(template.getAttribute());
        return instance;
    }

    public static DuplicateAttributeValueErrorBuilder builder() {
        return DuplicateAttributeValueErrorBuilder.of();
    }

    public static DuplicateAttributeValueErrorBuilder builder(final DuplicateAttributeValueError template) {
        return DuplicateAttributeValueErrorBuilder.of(template);
    }

    default <T> T withDuplicateAttributeValueError(Function<DuplicateAttributeValueError, T> helper) {
        return helper.apply(this);
    }
}
