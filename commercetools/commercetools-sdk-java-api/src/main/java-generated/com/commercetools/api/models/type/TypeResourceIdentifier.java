
package com.commercetools.api.models.type;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.commercetools.api.models.common.ResourceIdentifier;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
*  <p><a href="/../api/types#resourceidentifier">ResourceIdentifier</a> of a <a href="ctp:api:type:Type">Type</a>.</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = TypeResourceIdentifierImpl.class)
public interface TypeResourceIdentifier extends ResourceIdentifier, com.commercetools.api.models.Identifiable<Type> {

    String TYPE = "type";

    /**
    *  <p>Unique ID of the referenced <a href="ctp:api:type:Type">Type</a>. Either <code>id</code> or <code>key</code> is required.</p>
    */

    @JsonProperty("id")
    public String getId();

    /**
    *  <p>Unique key of the referenced <a href="ctp:api:type:Type">Type</a>. Either <code>id</code> or <code>key</code> is required.</p>
    */

    @JsonProperty("key")
    public String getKey();

    public void setId(final String id);

    public void setKey(final String key);

    public static TypeResourceIdentifier of() {
        return new TypeResourceIdentifierImpl();
    }

    public static TypeResourceIdentifier of(final TypeResourceIdentifier template) {
        TypeResourceIdentifierImpl instance = new TypeResourceIdentifierImpl();
        instance.setId(template.getId());
        instance.setKey(template.getKey());
        return instance;
    }

    public static TypeResourceIdentifierBuilder builder() {
        return TypeResourceIdentifierBuilder.of();
    }

    public static TypeResourceIdentifierBuilder builder(final TypeResourceIdentifier template) {
        return TypeResourceIdentifierBuilder.of(template);
    }

    default <T> T withTypeResourceIdentifier(Function<TypeResourceIdentifier, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<TypeResourceIdentifier> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<TypeResourceIdentifier>() {
            @Override
            public String toString() {
                return "TypeReference<TypeResourceIdentifier>";
            }
        };
    }
}
