
package com.commercetools.importapi.models.productvariants;

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
*  <p>This type represents an attribute which value is a set of references.</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ReferenceSetAttributeImpl.class)
public interface ReferenceSetAttribute extends Attribute {

    String REFERENCE_SET = "reference-set";

    @NotNull
    @Valid
    @JsonProperty("value")
    public List<KeyReference> getValue();

    @JsonIgnore
    public void setValue(final KeyReference... value);

    public void setValue(final List<KeyReference> value);

    public static ReferenceSetAttribute of() {
        return new ReferenceSetAttributeImpl();
    }

    public static ReferenceSetAttribute of(final ReferenceSetAttribute template) {
        ReferenceSetAttributeImpl instance = new ReferenceSetAttributeImpl();
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

    public static ReferenceSetAttributeBuilder builder() {
        return ReferenceSetAttributeBuilder.of();
    }

    public static ReferenceSetAttributeBuilder builder(final ReferenceSetAttribute template) {
        return ReferenceSetAttributeBuilder.of(template);
    }

    default <T> T withReferenceSetAttribute(Function<ReferenceSetAttribute, T> helper) {
        return helper.apply(this);
    }
}
