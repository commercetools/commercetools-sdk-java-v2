package com.commercetools.importapi.models.producttypes;

import com.commercetools.importapi.models.producttypes.AttributeBooleanType;
import com.commercetools.importapi.models.producttypes.AttributeDateTimeType;
import com.commercetools.importapi.models.producttypes.AttributeDateType;
import com.commercetools.importapi.models.producttypes.AttributeEnumType;
import com.commercetools.importapi.models.producttypes.AttributeLocalizableTextType;
import com.commercetools.importapi.models.producttypes.AttributeLocalizedEnumType;
import com.commercetools.importapi.models.producttypes.AttributeMoneyType;
import com.commercetools.importapi.models.producttypes.AttributeNestedType;
import com.commercetools.importapi.models.producttypes.AttributeNumberType;
import com.commercetools.importapi.models.producttypes.AttributeReferenceType;
import com.commercetools.importapi.models.producttypes.AttributeSetType;
import com.commercetools.importapi.models.producttypes.AttributeTextType;
import com.commercetools.importapi.models.producttypes.AttributeTimeType;
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
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class AttributeTypeImpl implements AttributeType {

    private String name;

    @JsonCreator
    AttributeTypeImpl(@JsonProperty("name") final String name) {
        this.name = name;
    }
    public AttributeTypeImpl() {
    }

    
    public String getName(){
        return this.name;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        AttributeTypeImpl that = (AttributeTypeImpl) o;
    
        return new EqualsBuilder()
                .append(name, that.name)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(name)
            .toHashCode();
    }

}
