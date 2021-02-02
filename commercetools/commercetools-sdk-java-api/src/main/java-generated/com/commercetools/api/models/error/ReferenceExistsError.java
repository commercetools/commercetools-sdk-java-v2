
package com.commercetools.api.models.error;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.commercetools.api.models.common.ReferenceTypeId;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ReferenceExistsErrorImpl.class)
public interface ReferenceExistsError extends ErrorObject {

    String REFERENCE_EXISTS = "ReferenceExists";

    @JsonProperty("referencedBy")
    public ReferenceTypeId getReferencedBy();

    public void setReferencedBy(final ReferenceTypeId referencedBy);

    public static ReferenceExistsError of() {
        return new ReferenceExistsErrorImpl();
    }

    public static ReferenceExistsError of(final ReferenceExistsError template) {
        ReferenceExistsErrorImpl instance = new ReferenceExistsErrorImpl();
        instance.setMessage(template.getMessage());
        instance.setReferencedBy(template.getReferencedBy());
        return instance;
    }

    public static ReferenceExistsErrorBuilder builder() {
        return ReferenceExistsErrorBuilder.of();
    }

    public static ReferenceExistsErrorBuilder builder(final ReferenceExistsError template) {
        return ReferenceExistsErrorBuilder.of(template);
    }

    default <T> T withReferenceExistsError(Function<ReferenceExistsError, T> helper) {
        return helper.apply(this);
    }
}
