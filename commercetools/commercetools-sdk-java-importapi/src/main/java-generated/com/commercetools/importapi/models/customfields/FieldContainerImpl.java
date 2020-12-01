package com.commercetools.importapi.models.customfields;

import com.commercetools.importapi.models.customfields.CustomField;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
*  <p>Maps the custom field names to the actual values.</p>
*/
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class FieldContainerImpl implements FieldContainer {

    private Map<String, com.commercetools.importapi.models.customfields.CustomField> values;

    @JsonCreator
    FieldContainerImpl(@JsonProperty("values") final Map<String, com.commercetools.importapi.models.customfields.CustomField> values) {
        this.values = values;
    }
    public FieldContainerImpl() {
    }

    /**
    *  <p>Mapping from the custom field name to the actual value.</p>
    */
    public Map<String,com.commercetools.importapi.models.customfields.CustomField> values() {
        return values;
    }

    public void setValue(String key, com.commercetools.importapi.models.customfields.CustomField value) {
        if (values == null) {
            values = new HashMap<>();
        }
        values.put(key, value);
    }

}
