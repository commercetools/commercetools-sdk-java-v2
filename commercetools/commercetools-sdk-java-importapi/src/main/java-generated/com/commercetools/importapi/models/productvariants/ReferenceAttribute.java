
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
*  <p>This type represents an attribute which value is a key reference.</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ReferenceAttributeImpl.class)
public interface ReferenceAttribute extends Attribute {

    String REFERENCE = "reference";

    /**
    *  <p>References a resource by its key.</p>
    */
    @NotNull
    @Valid
    @JsonProperty("value")
    public KeyReference getValue();

    public void setValue(final KeyReference value);

    public static ReferenceAttribute of() {
        return new ReferenceAttributeImpl();
    }

    public static ReferenceAttribute of(final ReferenceAttribute template) {
        ReferenceAttributeImpl instance = new ReferenceAttributeImpl();
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

    public static ReferenceAttributeBuilder builder() {
        return ReferenceAttributeBuilder.of();
    }

    public static ReferenceAttributeBuilder builder(final ReferenceAttribute template) {
        return ReferenceAttributeBuilder.of(template);
    }

    default <T> T withReferenceAttribute(Function<ReferenceAttribute, T> helper) {
        return helper.apply(this);
    }
}
