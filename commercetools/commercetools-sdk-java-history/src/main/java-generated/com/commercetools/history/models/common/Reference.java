
package com.commercetools.history.models.common;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ReferenceImpl.class)
public interface Reference {

    @NotNull
    @JsonProperty("id")
    public String getId();

    @NotNull
    @JsonProperty("typeId")
    public ReferenceTypeId getTypeId();

    public void setId(final String id);

    public void setTypeId(final ReferenceTypeId typeId);

    public static Reference of() {
        return new ReferenceImpl();
    }

    public static Reference of(final Reference template) {
        ReferenceImpl instance = new ReferenceImpl();
        instance.setId(template.getId());
        instance.setTypeId(template.getTypeId());
        return instance;
    }

    public static ReferenceBuilder builder() {
        return ReferenceBuilder.of();
    }

    public static ReferenceBuilder builder(final Reference template) {
        return ReferenceBuilder.of(template);
    }

    default <T> T withReference(Function<Reference, T> helper) {
        return helper.apply(this);
    }
}
