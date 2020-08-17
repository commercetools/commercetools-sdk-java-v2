package com.commercetools.importer.models.productvariants;

import com.commercetools.importer.models.productvariants.Attribute;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class AttributesImpl implements Attributes {

    private Map<String, com.commercetools.importer.models.productvariants.Attribute> values;

    @JsonCreator
    AttributesImpl(@JsonProperty("values") final Map<String, com.commercetools.importer.models.productvariants.Attribute> values) {
        this.values = values;
    }
    public AttributesImpl() {
       
    }

    /**
    *  <p>The name of the attribute is given by the key and shouldn't be set on the attribute itself.
    *  And since this property will be represented as a map, we can set individual attributes to null
    *  to delete them (which follows JSON Merge Patch semantics).</p>
    */
    public Map<String,com.commercetools.importer.models.productvariants.Attribute> values() {
        return values;
    }

    public void setValue(String key, com.commercetools.importer.models.productvariants.Attribute value) {
        if (values == null) {
            values = new HashMap<>();
        }
        values.put(key, value);
    }

}
