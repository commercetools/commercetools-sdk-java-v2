
package com.commercetools.importapi.models.customfields;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.importapi.models.common.KeyReference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
*  <p>A field with a reference set value.</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ReferenceSetFieldImpl.class)
public interface ReferenceSetField extends CustomField {

    String REFERENCE_SET = "ReferenceSet";

    @NotNull
    @Valid
    @JsonProperty("value")
    public List<KeyReference> getValue();

    @JsonIgnore
    public void setValue(final KeyReference... value);

    public void setValue(final List<KeyReference> value);

    public static ReferenceSetField of() {
        return new ReferenceSetFieldImpl();
    }

    public static ReferenceSetField of(final ReferenceSetField template) {
        ReferenceSetFieldImpl instance = new ReferenceSetFieldImpl();
        instance.setValue(template.getValue());
        return instance;
    }

    public static ReferenceSetFieldBuilder builder() {
        return ReferenceSetFieldBuilder.of();
    }

    public static ReferenceSetFieldBuilder builder(final ReferenceSetField template) {
        return ReferenceSetFieldBuilder.of(template);
    }

    default <T> T withReferenceSetField(Function<ReferenceSetField, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ReferenceSetField> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ReferenceSetField>() {
            @Override
            public String toString() {
                return "TypeReference<ReferenceSetField>";
            }
        };
    }
}
